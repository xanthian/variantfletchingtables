package net.xanthian.variantfletchingtables.utils;

import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.block.Block;
import net.xanthian.variantfletchingtables.block.Vanilla;
import net.xanthian.variantfletchingtables.block.compatability.*;

public class ModRegistries {

    public static void registerFuelandFlammable() {

        registerFuel();
    }

    private static void registerFuel() {
        FuelRegistry registry = FuelRegistry.INSTANCE;

        registry.add(Vanilla.ACACIA_FLETCHING_TABLE, 300);
        registry.add(Vanilla.BAMBOO_FLETCHING_TABLE, 300);
        registry.add(Vanilla.CHERRY_FLETCHING_TABLE, 300);
        registry.add(Vanilla.DARK_OAK_FLETCHING_TABLE, 300);
        registry.add(Vanilla.JUNGLE_FLETCHING_TABLE, 300);
        registry.add(Vanilla.MANGROVE_FLETCHING_TABLE, 300);
        registry.add(Vanilla.OAK_FLETCHING_TABLE, 300);
        registry.add(Vanilla.SPRUCE_FLETCHING_TABLE, 300);

        if (FabricLoader.getInstance().isModLoaded("blockus")) {
            registry.add(Blockus.BLS_RAW_BAMBOO_FLETCHING_TABLE, 300);
            registry.add(Blockus.BLS_WHITE_OAK_FLETCHING_TABLE, 300);
        }
        if (FabricLoader.getInstance().isModLoaded("cinderscapes")) {
            for (Block block : Cinderscapes.CS_FLETCHING_TABLES.values()) {
                registry.add(block, 300);
            }
        }
        if (FabricLoader.getInstance().isModLoaded("deeperdarker")) {
            for (Block block : DeeperAndDarker.DAD_FLETCHING_TABLES.values()) {
                registry.add(block, 300);
            }
        }
        if (FabricLoader.getInstance().isModLoaded("desolation")) {
            for (Block block : Desolation.DS_FLETCHING_TABLES.values()) {
                registry.add(block, 300);
            }
        }
        if (FabricLoader.getInstance().isModLoaded("natures_spirit")) {
            for (Block block : NaturesSpirit.NS_FLETCHING_TABLES.values()) {
                registry.add(block, 300);
            }
        }
        if (FabricLoader.getInstance().isModLoaded("techreborn")) {
            for (Block block : TechReborn.TR_FLETCHING_TABLES.values()) {
                registry.add(block, 300);
            }
        }
    }
}
