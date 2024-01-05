package net.xanthian.variantfletchingtables.utils;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.xanthian.variantfletchingtables.Initialise;
import net.xanthian.variantfletchingtables.block.Vanilla;
import net.xanthian.variantfletchingtables.block.compatability.*;

public class ModCreativeTab {

    public static final ItemGroup ITEM_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(Initialise.MOD_ID, "variantfletchingtables"),
            FabricItemGroup.builder()
                    .displayName(Text.literal("Variant Fletching Tables"))
                    .icon(() -> new ItemStack(Vanilla.MANGROVE_FLETCHING_TABLE))
                    .entries((displayContext, entries) -> {
                        entries.add(Vanilla.ACACIA_FLETCHING_TABLE);
                        entries.add(Vanilla.BAMBOO_FLETCHING_TABLE);
                        entries.add(Blocks.FLETCHING_TABLE); // Birch
                        entries.add(Vanilla.CHERRY_FLETCHING_TABLE);
                        entries.add(Vanilla.CRIMSON_FLETCHING_TABLE);
                        entries.add(Vanilla.DARK_OAK_FLETCHING_TABLE);
                        entries.add(Vanilla.JUNGLE_FLETCHING_TABLE);
                        entries.add(Vanilla.MANGROVE_FLETCHING_TABLE);
                        entries.add(Vanilla.OAK_FLETCHING_TABLE);
                        entries.add(Vanilla.SPRUCE_FLETCHING_TABLE);
                        entries.add(Vanilla.WARPED_FLETCHING_TABLE);

                        if (FabricLoader.getInstance().isModLoaded("ad_astra")) {
                            for (Block block : AdAstra.AA_FLETCHING_TABLES.values()) {
                                entries.add(block);
                            }
                        }
                        if (FabricLoader.getInstance().isModLoaded("beachparty")) {
                            entries.add(BeachParty.LDBP_PALM_FLETCHING_TABLE);
                        }
                        if (FabricLoader.getInstance().isModLoaded("betterarcheology")) {
                            entries.add(BetterArcheology.BA_ROTTEN_FLETCHING_TABLE);
                        }
                        if (FabricLoader.getInstance().isModLoaded("bewitchment")) {
                            for (Block block : Bewitchment.BW_FLETCHING_TABLES.values()) {
                                entries.add(block);
                            }
                        }
                        if (FabricLoader.getInstance().isModLoaded("biomemakeover")) {
                            for (Block block : BiomeMakeover.BM_FLETCHING_TABLES.values()) {
                                entries.add(block);
                            }
                        }
                        if (FabricLoader.getInstance().isModLoaded("blockus")) {
                            for (Block block : Blockus.BLS_FLETCHING_TABLES.values()) {
                                entries.add(block);
                            }
                        }
                        if (FabricLoader.getInstance().isModLoaded("botania")) {
                            for (Block block : Botania.BOT_FLETCHING_TABLES.values()) {
                                entries.add(block);
                            }
                        }
                        if (FabricLoader.getInstance().isModLoaded("cinderscapes")) {
                            for (Block block : Cinderscapes.CS_FLETCHING_TABLES.values()) {
                                entries.add(block);
                            }
                        }
                        if (FabricLoader.getInstance().isModLoaded("deeperdarker")) {
                            entries.add(DeeperAndDarker.DAD_ECHO_FLETCHING_TABLE);
                        }
                        if (FabricLoader.getInstance().isModLoaded("desolation")) {
                            entries.add(Desolation.DS_CHARRED_FLETCHING_TABLE);
                        }
                        if (FabricLoader.getInstance().isModLoaded("eldritch_end")) {
                            entries.add(EldritchEnd.EE_PRIMORDIAL_FLETCHING_TABLE);
                        }
                        if (FabricLoader.getInstance().isModLoaded("minecells")) {
                            entries.add(MineCells.MC_PUTRID_FLETCHING_TABLE);
                        }
                        if (FabricLoader.getInstance().isModLoaded("natures_spirit")) {
                            for (Block block : NaturesSpirit.NS_FLETCHING_TABLES.values()) {
                                entries.add(block);
                            }
                        }
                        if (FabricLoader.getInstance().isModLoaded("promenade")) {
                            for (Block block : Promenade.PROM_FLETCHING_TABLES.values()) {
                                entries.add(block);
                            }
                        }
                        if (FabricLoader.getInstance().isModLoaded("regions_unexplored")) {
                            for (Block block : RegionsUnexplored.RU_FLETCHING_TABLES.values()) {
                                entries.add(block);
                            }
                        }
                        if (FabricLoader.getInstance().isModLoaded("snifferplus")) {
                            entries.add(SnifferPlus.SP_STONE_PINE_FLETCHING_TABLE);
                        }
                        if (FabricLoader.getInstance().isModLoaded("techreborn")) {
                            entries.add(TechReborn.TR_RUBBER_FLETCHING_TABLE);
                        }
                        if (FabricLoader.getInstance().isModLoaded("vinery")) {
                            entries.add(Vinery.LDV_CHERRY_FLETCHING_TABLE);
                        }

                    })
                    .texture("variantfletchingtables.png").noRenderedName().build());

    public static void registerItemGroup() {
    }
}