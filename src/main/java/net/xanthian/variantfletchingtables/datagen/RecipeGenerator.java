package net.xanthian.variantfletchingtables.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.fabricmc.fabric.api.resource.conditions.v1.DefaultResourceConditions;
import net.minecraft.advancement.criterion.InventoryChangedCriterion;
import net.minecraft.block.Block;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.Registries;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import net.xanthian.variantfletchingtables.block.Vanilla;
import net.xanthian.variantfletchingtables.block.compatability.*;
import net.xanthian.variantfletchingtables.utils.ModItemTags;

import java.util.Map;
import java.util.function.Consumer;

public class RecipeGenerator extends FabricRecipeProvider {
    public RecipeGenerator(FabricDataOutput output) {
        super(output);
    }

    public static void offerFletchingTableRecipe(Consumer<RecipeJsonProvider> exporter, ItemConvertible table, ItemConvertible planks) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, table)
                .input('@', Items.FLINT)
                .input('#', planks)
                .pattern("@@")
                .pattern("##")
                .pattern("##")
                .criterion(FabricRecipeProvider.hasItem(Items.FLINT), FabricRecipeProvider.conditionsFromItem(Items.FLINT))
                .offerTo(exporter);
    }

    @Override
    public void generate(Consumer<RecipeJsonProvider> exporter) {

        offerFletchingTableRecipe(exporter, Vanilla.ACACIA_FLETCHING_TABLE, Items.ACACIA_PLANKS);
        offerFletchingTableRecipe(exporter, Vanilla.BAMBOO_FLETCHING_TABLE, Items.BAMBOO_PLANKS);
        offerFletchingTableRecipe(exporter, Vanilla.CHERRY_FLETCHING_TABLE, Items.CHERRY_PLANKS);
        offerFletchingTableRecipe(exporter, Vanilla.DARK_OAK_FLETCHING_TABLE, Items.DARK_OAK_PLANKS);
        offerFletchingTableRecipe(exporter, Vanilla.JUNGLE_FLETCHING_TABLE, Items.JUNGLE_PLANKS);
        offerFletchingTableRecipe(exporter, Vanilla.MANGROVE_FLETCHING_TABLE, Items.MANGROVE_PLANKS);
        offerFletchingTableRecipe(exporter, Vanilla.OAK_FLETCHING_TABLE, Items.OAK_PLANKS);
        offerFletchingTableRecipe(exporter, Vanilla.SPRUCE_FLETCHING_TABLE, Items.SPRUCE_PLANKS);
        offerFletchingTableRecipe(exporter, Vanilla.CRIMSON_FLETCHING_TABLE, Items.CRIMSON_PLANKS);
        offerFletchingTableRecipe(exporter, Vanilla.WARPED_FLETCHING_TABLE, Items.WARPED_PLANKS);

        registerFletchingTableRecipe(exporter, AdAstra.AA_FLETCHING_TABLES, "ad_astra");
        registerFletchingTableRecipe(exporter, BeachParty.LDBP_FLETCHING_TABLES, "beachparty");
        registerFletchingTableRecipe(exporter, BetterArcheology.BA_FLETCHING_TABLES, "betterarcheology");
        registerFletchingTableRecipe(exporter, Bewitchment.BW_FLETCHING_TABLES, "bewitchment");
        registerFletchingTableRecipe(exporter, BiomeMakeover.BM_FLETCHING_TABLES, "biomemakeover");
        //registerFletchingTableRecipe(exporter, Botania.BOT_FLETCHING_TABLES, "botania");
        registerFletchingTableRecipe(exporter, Cinderscapes.CS_FLETCHING_TABLES, "cinderscapes");
        registerFletchingTableRecipe(exporter, DeeperAndDarker.DAD_FLETCHING_TABLES, "deeperdarker");
        registerFletchingTableRecipe(exporter, Desolation.DS_FLETCHING_TABLES, "desolation");
        registerFletchingTableRecipe(exporter, EldritchEnd.EE_FLETCHING_TABLES, "eldritch_end");
        registerFletchingTableRecipe(exporter, MineCells.MC_FLETCHING_TABLES, "minecells");
        registerFletchingTableRecipe(exporter, NaturesSpirit.NS_FLETCHING_TABLES, "natures_spirit");
        registerFletchingTableRecipe(exporter, Promenade.PROM_FLETCHING_TABLES, "promenade");
        registerFletchingTableRecipe(exporter, RegionsUnexplored.RU_FLETCHING_TABLES, "regions_unexplored");
        //registerFletchingTableRecipe(exporter, SnifferPlus.SP_FLETCHING_TABLES, "snifferplus");
        registerFletchingTableRecipe(exporter, TechReborn.TR_FLETCHING_TABLES, "techreborn");
        registerFletchingTableRecipe(exporter, Vinery.LDV_FLETCHING_TABLES, "vinery");

        // Uncrafting Recipe
        ShapelessRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, Items.FLETCHING_TABLE, 1)
                .input(ModItemTags.FLETCHING_TABLES)
                .criterion("has_fletching_table", InventoryChangedCriterion.Conditions.items(Items.FLETCHING_TABLE))
                .offerTo(exporter, new Identifier("variantfletchingtables", "fletching_table"));
    }

    public void registerFletchingTableRecipe(Consumer<RecipeJsonProvider> exporter, Map<Identifier, Block> fletching_table, String modId) {
        registerFletchingTableRecipe(exporter, fletching_table, modId, "_planks");
    }

    public void registerFletchingTableRecipe(Consumer<RecipeJsonProvider> exporter, Map<Identifier, Block> bookshelves, String modId, String plankSuffix) {
        for (Map.Entry<Identifier, Block> entry : bookshelves.entrySet()) {
            Identifier bookshelfId = entry.getKey();
            Block bookshelf = entry.getValue();
            String path = bookshelfId.getPath();
            String name = path.replace("variantfletchingtables:", "").replace("_fletching_table", "").replaceFirst("^[^_]+_", "");
            String plankPath = modId + ":" + name + plankSuffix;
            offerFletchingTableRecipe(withConditions(exporter, DefaultResourceConditions.and(DefaultResourceConditions.allModsLoaded(modId),
                            DefaultResourceConditions.registryContains(RegistryKey.of(RegistryKeys.BLOCK, new Identifier(plankPath))))),
                    bookshelf, Registries.ITEM.get(new Identifier(plankPath)));
        }
    }
}
