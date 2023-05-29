package net.xanthian.variantfletchingtables;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;

import net.minecraft.block.Blocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

import net.xanthian.variantfletchingtables.block.FletchingTables;
import net.xanthian.variantfletchingtables.utils.ModPOITypes;
import net.xanthian.variantfletchingtables.utils.ModRegistries;

public class Initialise implements ModInitializer {

    public static final String MOD_ID = "variantfletchingtables";

    public static final RegistryKey<ItemGroup> ITEM_GROUP = RegistryKey.of(RegistryKeys.ITEM_GROUP, new Identifier(MOD_ID, "variantfletchingtables"));

    @Override
    public void onInitialize() {
        // Custom Item Group
        Registry.register(Registries.ITEM_GROUP, ITEM_GROUP, FabricItemGroup.builder()
                .displayName(Text.translatable("variantfletchingtables.group.variantfletchingtables"))
                .icon(() -> new ItemStack(FletchingTables.MANGROVE_FLETCHING_TABLE))
                .entries((context, entries) -> {
                    entries.add(FletchingTables.ACACIA_FLETCHING_TABLE);
                    entries.add(FletchingTables.BAMBOO_FLETCHING_TABLE);
                    entries.add(Blocks.FLETCHING_TABLE); // Birch
                    entries.add(FletchingTables.CHERRY_FLETCHING_TABLE);
                    entries.add(FletchingTables.CRIMSON_FLETCHING_TABLE);
                    entries.add(FletchingTables.DARK_OAK_FLETCHING_TABLE);
                    entries.add(FletchingTables.JUNGLE_FLETCHING_TABLE);
                    entries.add(FletchingTables.MANGROVE_FLETCHING_TABLE);
                    entries.add(FletchingTables.OAK_FLETCHING_TABLE);
                    entries.add(FletchingTables.SPRUCE_FLETCHING_TABLE);
                    entries.add(FletchingTables.WARPED_FLETCHING_TABLE);
                })
                .build());

        // Fletching Table Registration
        FletchingTables.registerVanillaTables();

        // Fuel & Flammable Block registration
        ModRegistries.registerFuelandFlammable();

        // Fletcher POI Registration
        ModPOITypes.init();
    }
}