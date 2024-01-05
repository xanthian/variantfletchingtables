package net.xanthian.variantfletchingtables.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;
import net.minecraft.data.client.TextureMap;
import net.minecraft.util.Identifier;
import net.xanthian.variantfletchingtables.block.Vanilla;
import net.xanthian.variantfletchingtables.block.compatability.*;
import net.xanthian.variantfletchingtables.utils.ModTextureMap;

import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Function;

public class ModelGenerator extends FabricModelProvider {
    public ModelGenerator(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerCubeWithCustomTextures(Vanilla.ACACIA_FLETCHING_TABLE, Blocks.ACACIA_PLANKS, TextureMap::frontTopSide);
        blockStateModelGenerator.registerCubeWithCustomTextures(Vanilla.BAMBOO_FLETCHING_TABLE, Blocks.BAMBOO_PLANKS, TextureMap::frontTopSide);
        blockStateModelGenerator.registerCubeWithCustomTextures(Vanilla.CHERRY_FLETCHING_TABLE, Blocks.CHERRY_PLANKS, TextureMap::frontTopSide);
        blockStateModelGenerator.registerCubeWithCustomTextures(Vanilla.CRIMSON_FLETCHING_TABLE, Blocks.CRIMSON_PLANKS, TextureMap::frontTopSide);
        blockStateModelGenerator.registerCubeWithCustomTextures(Vanilla.DARK_OAK_FLETCHING_TABLE, Blocks.DARK_OAK_PLANKS, TextureMap::frontTopSide);
        blockStateModelGenerator.registerCubeWithCustomTextures(Vanilla.JUNGLE_FLETCHING_TABLE, Blocks.JUNGLE_PLANKS, TextureMap::frontTopSide);
        blockStateModelGenerator.registerCubeWithCustomTextures(Vanilla.MANGROVE_FLETCHING_TABLE, Blocks.MANGROVE_PLANKS, TextureMap::frontTopSide);
        blockStateModelGenerator.registerCubeWithCustomTextures(Vanilla.OAK_FLETCHING_TABLE, Blocks.OAK_PLANKS, TextureMap::frontTopSide);
        blockStateModelGenerator.registerCubeWithCustomTextures(Vanilla.SPRUCE_FLETCHING_TABLE, Blocks.SPRUCE_PLANKS, TextureMap::frontTopSide);
        blockStateModelGenerator.registerCubeWithCustomTextures(Vanilla.WARPED_FLETCHING_TABLE, Blocks.WARPED_PLANKS, TextureMap::frontTopSide);

        registerModel(blockStateModelGenerator, AdAstra.AA_FLETCHING_TABLES, "ad_astra", plankName -> plankName + "_planks");
        registerModel(blockStateModelGenerator, BeachParty.LDBP_FLETCHING_TABLES, "beachparty", plankName -> plankName + "_planks0");
        registerModel(blockStateModelGenerator, BetterArcheology.BA_FLETCHING_TABLES, "betterarcheology", plankName -> plankName + "_planks");
        registerModel(blockStateModelGenerator, Bewitchment.BW_FLETCHING_TABLES, "bewitchment", plankName -> plankName + "_planks");
        registerModel(blockStateModelGenerator, BiomeMakeover.BM_FLETCHING_TABLES, "biomemakeover", plankName -> plankName + "_planks");
        registerModel(blockStateModelGenerator, Blockus.BLS_FLETCHING_TABLES, "blockus", plankName -> plankName + "_planks");
        registerModel(blockStateModelGenerator, Botania.BOT_FLETCHING_TABLES, "botania", plankName -> plankName + "_planks");
        registerModel(blockStateModelGenerator, Cinderscapes.CS_FLETCHING_TABLES, "cinderscapes", plankName -> plankName + "_planks");
        registerModel(blockStateModelGenerator, DeeperAndDarker.DAD_FLETCHING_TABLES, "deeperdarker", plankName -> plankName + "_planks");
        registerModel(blockStateModelGenerator, Desolation.DS_FLETCHING_TABLES, "desolation", plankName -> plankName + "_planks");
        registerModel(blockStateModelGenerator, EldritchEnd.EE_FLETCHING_TABLES, "eldritch_end", plankName -> plankName + "_planks");
        registerModel(blockStateModelGenerator, MineCells.MC_FLETCHING_TABLES, "minecells", plankName -> plankName + "_planks");
        registerModel(blockStateModelGenerator, NaturesSpirit.NS_FLETCHING_TABLES, "natures_spirit", plankName -> plankName + "_planks");
        registerModel(blockStateModelGenerator, Promenade.PROM_FLETCHING_TABLES, "promenade", plankName -> plankName + "/planks");
        registerModel(blockStateModelGenerator, RegionsUnexplored.RU_FLETCHING_TABLES, "regions_unexplored", plankName -> plankName + "_planks");
        registerModel(blockStateModelGenerator, SnifferPlus.SP_FLETCHING_TABLES, "snifferplus", plankName -> plankName + "_planks");
        registerModel(blockStateModelGenerator, TechReborn.TR_FLETCHING_TABLES, "techreborn", plankName -> plankName + "_planks");
        registerModel(blockStateModelGenerator, Vinery.LDV_FLETCHING_TABLES, "vinery", plankName -> plankName + "_planks");
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
    }

    // Used for those mods that cant follow a standard _planks naming convention or those that don't load via gradle.
    public static void registerNonStandardCube(BlockStateModelGenerator blockStateModelGenerator, Block block, String string, BiFunction<Block, String, TextureMap> texturesFactory) {
        TextureMap textureMap = texturesFactory.apply(block, string);
        blockStateModelGenerator.blockStateCollector.accept(BlockStateModelGenerator.createSingletonBlockState(block, Models.CUBE.upload(block, textureMap, blockStateModelGenerator.modelCollector)));
    }

    // Allows to loop through the blocks in each class and extract the block name without using registry
    public static void registerModel(BlockStateModelGenerator blockStateModelGenerator, Map<Identifier, Block> blockMap, String modId, Function<String, String> modelPathGenerator) {
        for (Block block : blockMap.values()) {
            String blockName = block.getTranslationKey();
            int firstUnderscoreIndex = blockName.indexOf('_');
            if (firstUnderscoreIndex != -1) {
                String plankName = blockName.substring(firstUnderscoreIndex + 1, blockName.lastIndexOf("_fletching_table"));
                String modelPath = modId + ":block/" + modelPathGenerator.apply(plankName);
                registerNonStandardCube(blockStateModelGenerator, block, modelPath, ModTextureMap::fletchingTable);
            } else {
                System.out.println("Invalid block name format: " + blockName);
            }
        }
    }
}