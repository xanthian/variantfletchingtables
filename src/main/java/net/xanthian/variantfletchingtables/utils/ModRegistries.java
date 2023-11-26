package net.xanthian.variantfletchingtables.utils;

import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.block.Block;
import net.xanthian.variantfletchingtables.block.Vanilla;
import net.xanthian.variantfletchingtables.block.compatability.*;

import static net.xanthian.variantfletchingtables.Initialise.isModVersion;

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

        if (FabricLoader.getInstance().isModLoaded("ad_astra")) {
            for (Block block : AdAstra.AA_FLETCHING_TABLES.values()) {
                registry.add(block, 300);
            }
        }
        if (FabricLoader.getInstance().isModLoaded("beachparty")) {
            registry.add(BeachParty.LDBP_PALM_FLETCHING_TABLE, 300);
        }
        if (FabricLoader.getInstance().isModLoaded("betterarcheology")) {
            registry.add(BetterArcheology.BA_ROTTEN_FLETCHING_TABLE, 300);
        }
        if (FabricLoader.getInstance().isModLoaded("bewitchment")) {
            for (Block block : Bewitchment.BW_FLETCHING_TABLES.values()) {
                registry.add(block, 300);
            }
        }
        if (FabricLoader.getInstance().isModLoaded("biomemakeover")) {
            for (Block block : BiomeMakeover.BM_FLETCHING_TABLES.values()) {
                registry.add(block, 300);
            }
        }
        if (FabricLoader.getInstance().isModLoaded("blockus")) {
            registry.add(Blockus.BLS_RAW_BAMBOO_FLETCHING_TABLE, 300);
            registry.add(Blockus.BLS_WHITE_OAK_FLETCHING_TABLE, 300);
        }
        if (FabricLoader.getInstance().isModLoaded("deeperdarker")) {
            registry.add(DeeperAndDarker.DAD_ECHO_FLETCHING_TABLE, 300);
        }
        if (FabricLoader.getInstance().isModLoaded("eldritch_end")) {
            registry.add(EldritchEnd.EE_PRIMORDIAL_FLETCHING_TABLE, 300);
        }
        if (FabricLoader.getInstance().isModLoaded("minecells")) {
            registry.add(MineCells.MC_PUTRID_FLETCHING_TABLE, 300);
        }
        if (FabricLoader.getInstance().isModLoaded("natures_spirit")) {
            for (Block block : NaturesSpirit.NS_FLETCHING_TABLES.values()) {
                registry.add(block, 300);
            }
        }
        if (FabricLoader.getInstance().isModLoaded("promenade")) {
            registry.add(Promenade.PROM_MAPLE_FLETCHING_TABLE, 300);
            registry.add(Promenade.PROM_PALM_FLETCHING_TABLE, 300);
            registry.add(Promenade.PROM_SAKURA_FLETCHING_TABLE, 300);
        }
        if (FabricLoader.getInstance().isModLoaded("regions_unexplored")) {
            registry.add(RegionsUnexplored.RU_ALPHA_OAK_FLETCHING_TABLE, 300);
            registry.add(RegionsUnexplored.RU_BAOBAB_FLETCHING_TABLE, 300);
            registry.add(RegionsUnexplored.RU_BLACK_PAINTED_FLETCHING_TABLE, 300);
            registry.add(RegionsUnexplored.RU_BLACKWOOD_FLETCHING_TABLE, 300);
            registry.add(RegionsUnexplored.RU_BLUE_PAINTED_FLETCHING_TABLE, 300);
            registry.add(RegionsUnexplored.RU_BROWN_PAINTED_FLETCHING_TABLE, 300);
            registry.add(RegionsUnexplored.RU_CYAN_PAINTED_FLETCHING_TABLE, 300);
            registry.add(RegionsUnexplored.RU_CYPRESS_FLETCHING_TABLE, 300);
            registry.add(RegionsUnexplored.RU_EUCALYPTUS_FLETCHING_TABLE, 300);
            registry.add(RegionsUnexplored.RU_GRAY_PAINTED_FLETCHING_TABLE, 300);
            registry.add(RegionsUnexplored.RU_GREEN_PAINTED_FLETCHING_TABLE, 300);
            registry.add(RegionsUnexplored.RU_JOSHUA_FLETCHING_TABLE, 300);
            registry.add(RegionsUnexplored.RU_LARCH_FLETCHING_TABLE, 300);
            registry.add(RegionsUnexplored.RU_LIGHT_BLUE_PAINTED_FLETCHING_TABLE, 300);
            registry.add(RegionsUnexplored.RU_LIGHT_GRAY_PAINTED_FLETCHING_TABLE, 300);
            registry.add(RegionsUnexplored.RU_LIME_PAINTED_FLETCHING_TABLE, 300);
            registry.add(RegionsUnexplored.RU_MAGENTA_PAINTED_FLETCHING_TABLE, 300);
            registry.add(RegionsUnexplored.RU_MAPLE_FLETCHING_TABLE, 300);
            registry.add(RegionsUnexplored.RU_MAUVE_FLETCHING_TABLE, 300);
            registry.add(RegionsUnexplored.RU_ORANGE_PAINTED_FLETCHING_TABLE, 300);
            registry.add(RegionsUnexplored.RU_PALM_FLETCHING_TABLE, 300);
            registry.add(RegionsUnexplored.RU_PINE_FLETCHING_TABLE, 300);
            registry.add(RegionsUnexplored.RU_PINK_PAINTED_FLETCHING_TABLE, 300);
            registry.add(RegionsUnexplored.RU_PURPLE_PAINTED_FLETCHING_TABLE, 300);
            registry.add(RegionsUnexplored.RU_REDWOOD_FLETCHING_TABLE, 300);
            registry.add(RegionsUnexplored.RU_RED_PAINTED_FLETCHING_TABLE, 300);
            registry.add(RegionsUnexplored.RU_WHITE_PAINTED_FLETCHING_TABLE, 300);
            registry.add(RegionsUnexplored.RU_WILLOW_FLETCHING_TABLE, 300);
            registry.add(RegionsUnexplored.RU_YELLOW_PAINTED_FLETCHING_TABLE, 300);
            if (isModVersion("regions_unexplored", "0.4")) {
                registry.add(RegionsUnexplored.RU_CHERRY_FLETCHING_TABLE, 300);
                registry.add(RegionsUnexplored.RU_SCULKWOOD_FLETCHING_TABLE, 300);
            } else {
                registry.add(RegionsUnexplored.RU_KAPOK_FLETCHING_TABLE, 300);
                registry.add(RegionsUnexplored.RU_MAGNOLIA_FLETCHING_TABLE, 300);
                registry.add(RegionsUnexplored.RU_SOCOTRA_FLETCHING_TABLE, 300);
            }
        }
        if (FabricLoader.getInstance().isModLoaded("snifferplus")) {
            registry.add(SnifferPlus.SP_STONE_PINE_FLETCHING_TABLE, 300);
        }
        if (FabricLoader.getInstance().isModLoaded("techreborn")) {
            registry.add(TechReborn.TR_RUBBER_FLETCHING_TABLE, 300);
        }
        if (FabricLoader.getInstance().isModLoaded("vinery")) {
            registry.add(Vinery.LDV_CHERRY_FLETCHING_TABLE, 300);
        }
    }
}
