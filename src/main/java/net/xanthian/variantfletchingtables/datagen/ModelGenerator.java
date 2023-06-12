package net.xanthian.variantfletchingtables.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;

import net.minecraft.block.Blocks;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.TextureMap;

import net.xanthian.variantfletchingtables.block.FletchingTables;

public class ModelGenerator extends FabricModelProvider {
    public ModelGenerator(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerCubeWithCustomTextures(FletchingTables.ACACIA_FLETCHING_TABLE, Blocks.ACACIA_PLANKS, TextureMap::frontTopSide);
        blockStateModelGenerator.registerCubeWithCustomTextures(FletchingTables.BAMBOO_FLETCHING_TABLE, Blocks.BAMBOO_PLANKS, TextureMap::frontTopSide);
        blockStateModelGenerator.registerCubeWithCustomTextures(FletchingTables.CHERRY_FLETCHING_TABLE, Blocks.CHERRY_PLANKS, TextureMap::frontTopSide);
        blockStateModelGenerator.registerCubeWithCustomTextures(FletchingTables.CRIMSON_FLETCHING_TABLE, Blocks.CRIMSON_PLANKS, TextureMap::frontTopSide);
        blockStateModelGenerator.registerCubeWithCustomTextures(FletchingTables.DARK_OAK_FLETCHING_TABLE, Blocks.DARK_OAK_PLANKS, TextureMap::frontTopSide);
        blockStateModelGenerator.registerCubeWithCustomTextures(FletchingTables.JUNGLE_FLETCHING_TABLE, Blocks.JUNGLE_PLANKS, TextureMap::frontTopSide);
        blockStateModelGenerator.registerCubeWithCustomTextures(FletchingTables.MANGROVE_FLETCHING_TABLE, Blocks.MANGROVE_PLANKS, TextureMap::frontTopSide);
        blockStateModelGenerator.registerCubeWithCustomTextures(FletchingTables.OAK_FLETCHING_TABLE, Blocks.OAK_PLANKS, TextureMap::frontTopSide);
        blockStateModelGenerator.registerCubeWithCustomTextures(FletchingTables.SPRUCE_FLETCHING_TABLE, Blocks.SPRUCE_PLANKS, TextureMap::frontTopSide);
        blockStateModelGenerator.registerCubeWithCustomTextures(FletchingTables.WARPED_FLETCHING_TABLE, Blocks.WARPED_PLANKS, TextureMap::frontTopSide);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
    }
}