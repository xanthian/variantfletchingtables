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
            Identifier.of(Initialise.MOD_ID, "variantfletchingtables"),
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

                        if (FabricLoader.getInstance().isModLoaded("blockus")) {
                            for (Block block : Blockus.BLS_FLETCHING_TABLES.values()) {
                                entries.add(block);
                            }
                        }
                        if (FabricLoader.getInstance().isModLoaded("cinderscapes")) {
                            for (Block block : Cinderscapes.CS_FLETCHING_TABLES.values()) {
                                entries.add(block);
                            }
                        }
                        if (FabricLoader.getInstance().isModLoaded("deeperdarker")) {
                            for (Block block : DeeperAndDarker.DAD_FLETCHING_TABLES.values()) {
                                entries.add(block);
                            }
                        }
                        if (FabricLoader.getInstance().isModLoaded("desolation")) {
                            for (Block block : Desolation.DS_FLETCHING_TABLES.values()) {
                                entries.add(block);
                            }
                        }
                        if (FabricLoader.getInstance().isModLoaded("natures_spirit")) {
                            for (Block block : NaturesSpirit.NS_FLETCHING_TABLES.values()) {
                                entries.add(block);
                            }
                        }
                        if (FabricLoader.getInstance().isModLoaded("techreborn")) {
                            for (Block block : TechReborn.TR_FLETCHING_TABLES.values()) {
                                entries.add(block);
                            }
                        }
                    })
                    .texture(Identifier.ofVanilla( "textures/gui/container/creative_inventory/tab_variantfletchingtables.png")).noRenderedName().build());

    public static void registerItemGroup() {
    }
}