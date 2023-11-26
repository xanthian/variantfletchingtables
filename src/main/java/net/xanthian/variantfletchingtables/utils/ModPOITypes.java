package net.xanthian.variantfletchingtables.utils;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.registry.Registries;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.world.poi.PointOfInterestType;
import net.minecraft.world.poi.PointOfInterestTypes;
import net.xanthian.variantfletchingtables.block.VariantFletchingTableBlock;
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
        List<BlockState> fletcherBlockStates = new ArrayList<>(fletcherPoiType.blockStates);

        for (Block block : Registries.BLOCK) { // Iterate through all blocks
            if (block instanceof VariantFletchingTableBlock fletchingTableBlock) { // Check if the block is an instance of VariantBarrelBlock
                ImmutableList<BlockState> blockStates = fletchingTableBlock.getStateManager().getStates();

                for (BlockState blockState : blockStates) {
                    poiStatesToType.putIfAbsent(blockState, fletcherEntry);
                }

                fletcherBlockStates.addAll(blockStates);
            }
        }
        fletcherPoiType.blockStates = ImmutableSet.copyOf(fletcherBlockStates);
    }
}