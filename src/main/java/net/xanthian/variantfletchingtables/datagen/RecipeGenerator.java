package net.xanthian.variantfletchingtables.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;

import net.minecraft.block.Blocks;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.util.Identifier;

import net.xanthian.variantfletchingtables.block.FletchingTables;

import java.util.function.Consumer;

public class RecipeGenerator extends FabricRecipeProvider {
    public RecipeGenerator(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generate(Consumer<RecipeJsonProvider> exporter) {

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, FletchingTables.ACACIA_FLETCHING_TABLE)
                .input('@', Items.FLINT)
                .input('#', Blocks.ACACIA_PLANKS)
                .pattern("@@")
                .pattern("##")
                .pattern("##")
                .criterion(FabricRecipeProvider.hasItem(Items.FLINT), FabricRecipeProvider.conditionsFromItem(Items.FLINT))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(FletchingTables.ACACIA_FLETCHING_TABLE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, FletchingTables.BAMBOO_FLETCHING_TABLE)
                .input('@', Items.FLINT)
                .input('#', Blocks.BAMBOO_PLANKS)
                .pattern("@@")
                .pattern("##")
                .pattern("##")
                .criterion(FabricRecipeProvider.hasItem(Items.FLINT), FabricRecipeProvider.conditionsFromItem(Items.FLINT))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(FletchingTables.BAMBOO_FLETCHING_TABLE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, FletchingTables.CHERRY_FLETCHING_TABLE)
                .input('@', Items.FLINT)
                .input('#', Blocks.CHERRY_PLANKS)
                .pattern("@@")
                .pattern("##")
                .pattern("##")
                .criterion(FabricRecipeProvider.hasItem(Items.FLINT), FabricRecipeProvider.conditionsFromItem(Items.FLINT))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(FletchingTables.CHERRY_FLETCHING_TABLE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, FletchingTables.CRIMSON_FLETCHING_TABLE)
                .input('@', Items.FLINT)
                .input('#', Blocks.CRIMSON_PLANKS)
                .pattern("@@")
                .pattern("##")
                .pattern("##")
                .criterion(FabricRecipeProvider.hasItem(Items.FLINT), FabricRecipeProvider.conditionsFromItem(Items.FLINT))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(FletchingTables.CRIMSON_FLETCHING_TABLE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, FletchingTables.DARK_OAK_FLETCHING_TABLE)
                .input('@', Items.FLINT)
                .input('#', Blocks.DARK_OAK_PLANKS)
                .pattern("@@")
                .pattern("##")
                .pattern("##")
                .criterion(FabricRecipeProvider.hasItem(Items.FLINT), FabricRecipeProvider.conditionsFromItem(Items.FLINT))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(FletchingTables.DARK_OAK_FLETCHING_TABLE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, FletchingTables.JUNGLE_FLETCHING_TABLE)
                .input('@', Items.FLINT)
                .input('#', Blocks.JUNGLE_PLANKS)
                .pattern("@@")
                .pattern("##")
                .pattern("##")
                .criterion(FabricRecipeProvider.hasItem(Items.FLINT), FabricRecipeProvider.conditionsFromItem(Items.FLINT))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(FletchingTables.JUNGLE_FLETCHING_TABLE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, FletchingTables.MANGROVE_FLETCHING_TABLE)
                .input('@', Items.FLINT)
                .input('#', Blocks.MANGROVE_PLANKS)
                .pattern("@@")
                .pattern("##")
                .pattern("##")
                .criterion(FabricRecipeProvider.hasItem(Items.FLINT), FabricRecipeProvider.conditionsFromItem(Items.FLINT))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(FletchingTables.MANGROVE_FLETCHING_TABLE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, FletchingTables.OAK_FLETCHING_TABLE)
                .input('@', Items.FLINT)
                .input('#', Blocks.OAK_PLANKS)
                .pattern("@@")
                .pattern("##")
                .pattern("##")
                .criterion(FabricRecipeProvider.hasItem(Items.FLINT), FabricRecipeProvider.conditionsFromItem(Items.FLINT))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(FletchingTables.OAK_FLETCHING_TABLE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, FletchingTables.SPRUCE_FLETCHING_TABLE)
                .input('@', Items.FLINT)
                .input('#', Blocks.SPRUCE_PLANKS)
                .pattern("@@")
                .pattern("##")
                .pattern("##")
                .criterion(FabricRecipeProvider.hasItem(Items.FLINT), FabricRecipeProvider.conditionsFromItem(Items.FLINT))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(FletchingTables.SPRUCE_FLETCHING_TABLE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, FletchingTables.WARPED_FLETCHING_TABLE)
                .input('@', Items.FLINT)
                .input('#', Blocks.WARPED_PLANKS)
                .pattern("@@")
                .pattern("##")
                .pattern("##")
                .criterion(FabricRecipeProvider.hasItem(Items.FLINT), FabricRecipeProvider.conditionsFromItem(Items.FLINT))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(FletchingTables.WARPED_FLETCHING_TABLE)));

        // Uncrafting Recipe
    }
}
