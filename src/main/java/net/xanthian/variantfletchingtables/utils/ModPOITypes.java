package net.xanthian.variantfletchingtables.utils;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.registry.Registries;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.world.poi.PointOfInterestType;
import net.minecraft.world.poi.PointOfInterestTypes;
import net.xanthian.variantfletchingtables.block.FletchingTables;
import net.xanthian.variantfletchingtables.mixin.PointOfInterestTypesAccessor;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ModPOITypes {
    public static void init() {

        Map<BlockState, RegistryEntry<PointOfInterestType>> poiStatesToType = PointOfInterestTypesAccessor
                .getPointOfInterestStatesToType();

        RegistryEntry<PointOfInterestType> fletcherEntry = Registries.POINT_OF_INTEREST_TYPE
                .getEntry(PointOfInterestTypes.FLETCHER).get();

        PointOfInterestType fletcherPoiType = Registries.POINT_OF_INTEREST_TYPE.get(PointOfInterestTypes.FLETCHER);

        // NOTE: PointOfInterestType.blockStates is accessible by access widener
        List<BlockState> fletcherBlockStates = new ArrayList<BlockState>(fletcherPoiType.blockStates);

        for (Block block : FletchingTables.MOD_FLETCHING_TABLES.values()) {
            ImmutableList<BlockState> blockStates = block.getStateManager().getStates();

            for (BlockState blockState : blockStates) {
                poiStatesToType.putIfAbsent(blockState, fletcherEntry);
            }

            fletcherBlockStates.addAll(blockStates);
        }

        // NOTE: PointOfInterestType.blockStates is mutable by access widener
        fletcherPoiType.blockStates = ImmutableSet.copyOf(fletcherBlockStates);
    }
}