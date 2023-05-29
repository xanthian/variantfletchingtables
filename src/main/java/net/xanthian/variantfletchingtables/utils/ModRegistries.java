package net.xanthian.variantfletchingtables.utils;

import net.fabricmc.fabric.api.registry.FlammableBlockRegistry;
import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.minecraft.block.FireBlock;
import net.minecraft.block.entity.AbstractFurnaceBlockEntity;
import net.xanthian.variantfletchingtables.block.FletchingTables;

public class ModRegistries {

    public static void registerFuelandFlammable() {
        //registerFlammableBlocks(); //not flammable
        registerFuel();
    }

    private static void registerFlammableBlocks() {
        FlammableBlockRegistry registry = FlammableBlockRegistry.getDefaultInstance();

/**
 Copy from {@link FireBlock#registerDefaultFlammables()}
 **/

        registry.add(FletchingTables.ACACIA_FLETCHING_TABLE, 30, 20);
        registry.add(FletchingTables.BAMBOO_FLETCHING_TABLE, 30, 20);
        registry.add(FletchingTables.CHERRY_FLETCHING_TABLE, 30, 20);
        registry.add(FletchingTables.DARK_OAK_FLETCHING_TABLE, 30, 20);
        registry.add(FletchingTables.JUNGLE_FLETCHING_TABLE, 30, 20);
        registry.add(FletchingTables.MANGROVE_FLETCHING_TABLE, 30, 20);
        registry.add(FletchingTables.OAK_FLETCHING_TABLE, 30, 20);
        registry.add(FletchingTables.SPRUCE_FLETCHING_TABLE, 30, 20);
    }

    private static void registerFuel() {
        FuelRegistry registry = FuelRegistry.INSTANCE;

/**
 Copy from {@link AbstractFurnaceBlockEntity#createFuelTimeMap()}
 **/

        registry.add(FletchingTables.ACACIA_FLETCHING_TABLE, 300);
        registry.add(FletchingTables.BAMBOO_FLETCHING_TABLE, 300);
        registry.add(FletchingTables.CHERRY_FLETCHING_TABLE, 300);
        registry.add(FletchingTables.DARK_OAK_FLETCHING_TABLE, 300);
        registry.add(FletchingTables.JUNGLE_FLETCHING_TABLE, 300);
        registry.add(FletchingTables.MANGROVE_FLETCHING_TABLE, 300);
        registry.add(FletchingTables.OAK_FLETCHING_TABLE, 300);
        registry.add(FletchingTables.SPRUCE_FLETCHING_TABLE, 300);
    }
}
