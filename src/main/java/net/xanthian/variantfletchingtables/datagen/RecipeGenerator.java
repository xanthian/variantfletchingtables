package net.xanthian.variantfletchingtables.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.fabricmc.fabric.api.resource.conditions.v1.DefaultResourceConditions;
import net.minecraft.advancement.criterion.InventoryChangedCriterion;
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

        // Ad Astra (disabled)
        //offerFletchingTableRecipe(withConditions(exporter, DefaultResourceConditions.allModsLoaded("ad_astra")), AdAstra.AA_AERONOS_FLETCHING_TABLE, Registries.ITEM.get(new Identifier("ad_astra:aeronos_planks")));
        //offerFletchingTableRecipe(withConditions(exporter, DefaultResourceConditions.allModsLoaded("ad_astra")), AdAstra.AA_GLACIAN_FLETCHING_TABLE, Registries.ITEM.get(new Identifier("ad_astra:glacian_planks")));
        //offerFletchingTableRecipe(withConditions(exporter, DefaultResourceConditions.allModsLoaded("ad_astra")), AdAstra.AA_STROPHAR_FLETCHING_TABLE, Registries.ITEM.get(new Identifier("ad_astra:strophar_planks")));

        // Beach Party (Lets Do)
        offerFletchingTableRecipe(withConditions(exporter, DefaultResourceConditions.allModsLoaded("beachparty")), BeachParty.LDBP_PALM_FLETCHING_TABLE, Registries.ITEM.get(new Identifier("beachparty:palm_planks")));

        // Better Archeology
        offerFletchingTableRecipe(withConditions(exporter, DefaultResourceConditions.allModsLoaded("betterarcheology")), BetterArcheology.BA_ROTTEN_FLETCHING_TABLE, Registries.ITEM.get(new Identifier("betterarcheology:rotten_planks")));

        // Bewitchment
        offerFletchingTableRecipe(withConditions(exporter, DefaultResourceConditions.allModsLoaded("bewitchment")), Bewitchment.BW_CYPRESS_FLETCHING_TABLE, Registries.ITEM.get(new Identifier("bewitchment:cypress_planks")));
        offerFletchingTableRecipe(withConditions(exporter, DefaultResourceConditions.allModsLoaded("bewitchment")), Bewitchment.BW_DRAGONS_BLOOD_FLETCHING_TABLE, Registries.ITEM.get(new Identifier("bewitchment:dragons_blood_planks")));
        offerFletchingTableRecipe(withConditions(exporter, DefaultResourceConditions.allModsLoaded("bewitchment")), Bewitchment.BW_ELDER_FLETCHING_TABLE, Registries.ITEM.get(new Identifier("bewitchment:elder_planks")));
        offerFletchingTableRecipe(withConditions(exporter, DefaultResourceConditions.allModsLoaded("bewitchment")), Bewitchment.BW_JUNIPER_FLETCHING_TABLE, Registries.ITEM.get(new Identifier("bewitchment:juniper_planks")));

        // Biome Makeover (disabled)
        //offerFletchingTableRecipe(withConditions(exporter, DefaultResourceConditions.allModsLoaded("biomemakeover")), BiomeMakeover.BM_ANCIENT_OAK_FLETCHING_TABLE, Registries.ITEM.get(new Identifier("biomemakeover:ancient_oak_planks")));
        //offerFletchingTableRecipe(withConditions(exporter, DefaultResourceConditions.allModsLoaded("biomemakeover")), BiomeMakeover.BM_BLIGHTED_BALSA_FLETCHING_TABLE, Registries.ITEM.get(new Identifier("biomemakeover:blighted_balsa_planks")));
        //offerFletchingTableRecipe(withConditions(exporter, DefaultResourceConditions.allModsLoaded("biomemakeover")), BiomeMakeover.BM_SWAMP_CYPRESS_FLETCHING_TABLE, Registries.ITEM.get(new Identifier("biomemakeover:swamp_cypress_planks")));
        //offerFletchingTableRecipe(withConditions(exporter, DefaultResourceConditions.allModsLoaded("biomemakeover")), BiomeMakeover.BM_WILLOW_FLETCHING_TABLE, Registries.ITEM.get(new Identifier("biomemakeover:willow_planks")));

        // Blockus
        offerFletchingTableRecipe(withConditions(exporter, DefaultResourceConditions.allModsLoaded("blockus")), Blockus.BLS_CHARRED_FLETCHING_TABLE, Registries.ITEM.get(new Identifier("blockus:charred_planks")));
        offerFletchingTableRecipe(withConditions(exporter, DefaultResourceConditions.allModsLoaded("blockus")), Blockus.BLS_RAW_BAMBOO_FLETCHING_TABLE, Registries.ITEM.get(new Identifier("blockus:raw_bamboo_planks")));
        offerFletchingTableRecipe(withConditions(exporter, DefaultResourceConditions.allModsLoaded("blockus")), Blockus.BLS_WHITE_OAK_FLETCHING_TABLE, Registries.ITEM.get(new Identifier("blockus:white_oak_planks")));

        // Deeper & Darker (disabled)
        //offerFletchingTableRecipe(withConditions(exporter,DefaultResourceConditions.allModsLoaded("deeperdarker")),DeeperAndDarker.DAD_ECHO_FLETCHING_TABLE, Registries.ITEM.get(new Identifier("deeperanddarker:echo_planks")));

        // Eldritch End
        offerFletchingTableRecipe(withConditions(exporter, DefaultResourceConditions.allModsLoaded("eldritch_end")), EldritchEnd.EE_PRIMORDIAL_FLETCHING_TABLE, Registries.ITEM.get(new Identifier("eldritch_end:primordial_planks")));

        // Minecells
        offerFletchingTableRecipe(withConditions(exporter, DefaultResourceConditions.allModsLoaded("minecells")), MineCells.MC_PUTRID_FLETCHING_TABLE, Registries.ITEM.get(new Identifier("minecells:putrid_planks")));

        // Natures Spirit (disabled)
        //offerFletchingTableRecipe(withConditions(exporter,DefaultResourceConditions.allModsLoaded("natures_spirit")), NaturesSpirit.NS_ASPEN_FLETCHING_TABLE, Registries.ITEM.get(new Identifier("natures_spirit:aspen_planks")));
        //offerFletchingTableRecipe(withConditions(exporter,DefaultResourceConditions.allModsLoaded("natures_spirit")), NaturesSpirit.NS_CYPRESS_FLETCHING_TABLE, Registries.ITEM.get(new Identifier("natures_spirit:cypress_planks")));
        //offerFletchingTableRecipe(withConditions(exporter,DefaultResourceConditions.allModsLoaded("natures_spirit")), NaturesSpirit.NS_FIR_FLETCHING_TABLE, Registries.ITEM.get(new Identifier("natures_spirit:fir_planks")));
        //offerFletchingTableRecipe(withConditions(exporter,DefaultResourceConditions.allModsLoaded("natures_spirit")), NaturesSpirit.NS_JOSHUA_FLETCHING_TABLE, Registries.ITEM.get(new Identifier("natures_spirit:joshua_planks")));
        //offerFletchingTableRecipe(withConditions(exporter,DefaultResourceConditions.allModsLoaded("natures_spirit")), NaturesSpirit.NS_MAPLE_FLETCHING_TABLE, Registries.ITEM.get(new Identifier("natures_spirit:maple_planks")));
        //offerFletchingTableRecipe(withConditions(exporter,DefaultResourceConditions.allModsLoaded("natures_spirit")), NaturesSpirit.NS_OLIVE_FLETCHING_TABLE, Registries.ITEM.get(new Identifier("natures_spirit:olive_planks")));
        //offerFletchingTableRecipe(withConditions(exporter,DefaultResourceConditions.allModsLoaded("natures_spirit")), NaturesSpirit.NS_REDWOOD_FLETCHING_TABLE, Registries.ITEM.get(new Identifier("natures_spirit:redwood_planks")));
        //offerFletchingTableRecipe(withConditions(exporter,DefaultResourceConditions.allModsLoaded("natures_spirit")), NaturesSpirit.NS_SUGI_FLETCHING_TABLE, Registries.ITEM.get(new Identifier("natures_spirit:sugi_planks")));
        //offerFletchingTableRecipe(withConditions(exporter,DefaultResourceConditions.allModsLoaded("natures_spirit")), NaturesSpirit.NS_WILLOW_FLETCHING_TABLE, Registries.ITEM.get(new Identifier("natures_spirit:willow_planks")));
        //offerFletchingTableRecipe(withConditions(exporter,DefaultResourceConditions.allModsLoaded("natures_spirit")), NaturesSpirit.NS_WISTERIA_FLETCHING_TABLE, Registries.ITEM.get(new Identifier("natures_spirit:wisteria_planks")));

        // Promenade
        offerFletchingTableRecipe(withConditions(exporter, DefaultResourceConditions.allModsLoaded("promenade")), Promenade.PROM_DARK_AMARANTH_FLETCHING_TABLE, Registries.ITEM.get(new Identifier("promenade:dark_amaranth_planks")));
        offerFletchingTableRecipe(withConditions(exporter, DefaultResourceConditions.allModsLoaded("promenade")), Promenade.PROM_MAPLE_FLETCHING_TABLE, Registries.ITEM.get(new Identifier("promenade:maple_planks")));
        offerFletchingTableRecipe(withConditions(exporter, DefaultResourceConditions.allModsLoaded("promenade")), Promenade.PROM_PALM_FLETCHING_TABLE, Registries.ITEM.get(new Identifier("promenade:palm_planks")));
        offerFletchingTableRecipe(withConditions(exporter, DefaultResourceConditions.allModsLoaded("promenade")), Promenade.PROM_SAKURA_FLETCHING_TABLE, Registries.ITEM.get(new Identifier("promenade:sakura_planks")));

        // Regions Unexplored
        offerFletchingTableRecipe(withConditions(exporter, DefaultResourceConditions.allModsLoaded("regions_unexplored")), RegionsUnexplored.RU_ALPHA_OAK_FLETCHING_TABLE, Registries.ITEM.get(new Identifier("regions_unexplored:alpha_planks")));
        offerFletchingTableRecipe(withConditions(exporter, DefaultResourceConditions.allModsLoaded("regions_unexplored")), RegionsUnexplored.RU_BAOBAB_FLETCHING_TABLE, Registries.ITEM.get(new Identifier("regions_unexplored:baobab_planks")));
        offerFletchingTableRecipe(withConditions(exporter, DefaultResourceConditions.allModsLoaded("regions_unexplored")), RegionsUnexplored.RU_BLACK_PAINTED_FLETCHING_TABLE, Registries.ITEM.get(new Identifier("regions_unexplored:black_painted_planks")));
        offerFletchingTableRecipe(withConditions(exporter, DefaultResourceConditions.allModsLoaded("regions_unexplored")), RegionsUnexplored.RU_BLACKWOOD_FLETCHING_TABLE, Registries.ITEM.get(new Identifier("regions_unexplored:blackwood_planks")));
        offerFletchingTableRecipe(withConditions(exporter, DefaultResourceConditions.allModsLoaded("regions_unexplored")), RegionsUnexplored.RU_BLUE_PAINTED_FLETCHING_TABLE, Registries.ITEM.get(new Identifier("regions_unexplored:blue_painted_planks")));
        offerFletchingTableRecipe(withConditions(exporter, DefaultResourceConditions.allModsLoaded("regions_unexplored")), RegionsUnexplored.RU_BROWN_PAINTED_FLETCHING_TABLE, Registries.ITEM.get(new Identifier("regions_unexplored:brown_painted_planks")));
        offerFletchingTableRecipe(withConditions(exporter, DefaultResourceConditions.allModsLoaded("regions_unexplored")), RegionsUnexplored.RU_CYAN_PAINTED_FLETCHING_TABLE, Registries.ITEM.get(new Identifier("regions_unexplored:cyan_painted_planks")));
        offerFletchingTableRecipe(withConditions(exporter, DefaultResourceConditions.allModsLoaded("regions_unexplored")), RegionsUnexplored.RU_CYPRESS_FLETCHING_TABLE, Registries.ITEM.get(new Identifier("regions_unexplored:cypress_planks")));
        offerFletchingTableRecipe(withConditions(exporter, DefaultResourceConditions.allModsLoaded("regions_unexplored")), RegionsUnexplored.RU_DEAD_FLETCHING_TABLE, Registries.ITEM.get(new Identifier("regions_unexplored:dead_planks")));
        offerFletchingTableRecipe(withConditions(exporter, DefaultResourceConditions.allModsLoaded("regions_unexplored")), RegionsUnexplored.RU_EUCALYPTUS_FLETCHING_TABLE, Registries.ITEM.get(new Identifier("regions_unexplored:eucalyptus_planks")));
        offerFletchingTableRecipe(withConditions(exporter, DefaultResourceConditions.allModsLoaded("regions_unexplored")), RegionsUnexplored.RU_GREEN_PAINTED_FLETCHING_TABLE, Registries.ITEM.get(new Identifier("regions_unexplored:green_painted_planks")));
        offerFletchingTableRecipe(withConditions(exporter, DefaultResourceConditions.allModsLoaded("regions_unexplored")), RegionsUnexplored.RU_GRAY_PAINTED_FLETCHING_TABLE, Registries.ITEM.get(new Identifier("regions_unexplored:gray_painted_planks")));
        offerFletchingTableRecipe(withConditions(exporter, DefaultResourceConditions.allModsLoaded("regions_unexplored")), RegionsUnexplored.RU_JOSHUA_FLETCHING_TABLE, Registries.ITEM.get(new Identifier("regions_unexplored:joshua_planks")));
        offerFletchingTableRecipe(withConditions(exporter, DefaultResourceConditions.allModsLoaded("regions_unexplored")), RegionsUnexplored.RU_LARCH_FLETCHING_TABLE, Registries.ITEM.get(new Identifier("regions_unexplored:larch_planks")));
        offerFletchingTableRecipe(withConditions(exporter, DefaultResourceConditions.allModsLoaded("regions_unexplored")), RegionsUnexplored.RU_LIGHT_BLUE_PAINTED_FLETCHING_TABLE, Registries.ITEM.get(new Identifier("regions_unexplored:light_blue_painted_planks")));
        offerFletchingTableRecipe(withConditions(exporter, DefaultResourceConditions.allModsLoaded("regions_unexplored")), RegionsUnexplored.RU_LIGHT_GRAY_PAINTED_FLETCHING_TABLE, Registries.ITEM.get(new Identifier("regions_unexplored:light_gray_painted_planks")));
        offerFletchingTableRecipe(withConditions(exporter, DefaultResourceConditions.allModsLoaded("regions_unexplored")), RegionsUnexplored.RU_LIME_PAINTED_FLETCHING_TABLE, Registries.ITEM.get(new Identifier("regions_unexplored:lime_painted_planks")));
        offerFletchingTableRecipe(withConditions(exporter, DefaultResourceConditions.allModsLoaded("regions_unexplored")), RegionsUnexplored.RU_MAGENTA_PAINTED_FLETCHING_TABLE, Registries.ITEM.get(new Identifier("regions_unexplored:magenta_painted_planks")));
        offerFletchingTableRecipe(withConditions(exporter, DefaultResourceConditions.allModsLoaded("regions_unexplored")), RegionsUnexplored.RU_MAPLE_FLETCHING_TABLE, Registries.ITEM.get(new Identifier("regions_unexplored:maple_planks")));
        offerFletchingTableRecipe(withConditions(exporter, DefaultResourceConditions.allModsLoaded("regions_unexplored")), RegionsUnexplored.RU_MAUVE_FLETCHING_TABLE, Registries.ITEM.get(new Identifier("regions_unexplored:mauve_planks")));
        offerFletchingTableRecipe(withConditions(exporter, DefaultResourceConditions.allModsLoaded("regions_unexplored")), RegionsUnexplored.RU_ORANGE_PAINTED_FLETCHING_TABLE, Registries.ITEM.get(new Identifier("regions_unexplored:orange_painted_planks")));
        offerFletchingTableRecipe(withConditions(exporter, DefaultResourceConditions.allModsLoaded("regions_unexplored")), RegionsUnexplored.RU_PALM_FLETCHING_TABLE, Registries.ITEM.get(new Identifier("regions_unexplored:palm_planks")));
        offerFletchingTableRecipe(withConditions(exporter, DefaultResourceConditions.allModsLoaded("regions_unexplored")), RegionsUnexplored.RU_PINE_FLETCHING_TABLE, Registries.ITEM.get(new Identifier("regions_unexplored:pine_planks")));
        offerFletchingTableRecipe(withConditions(exporter, DefaultResourceConditions.allModsLoaded("regions_unexplored")), RegionsUnexplored.RU_PINK_PAINTED_FLETCHING_TABLE, Registries.ITEM.get(new Identifier("regions_unexplored:pink_painted_planks")));
        offerFletchingTableRecipe(withConditions(exporter, DefaultResourceConditions.allModsLoaded("regions_unexplored")), RegionsUnexplored.RU_PURPLE_PAINTED_FLETCHING_TABLE, Registries.ITEM.get(new Identifier("regions_unexplored:purple_painted_planks")));
        offerFletchingTableRecipe(withConditions(exporter, DefaultResourceConditions.allModsLoaded("regions_unexplored")), RegionsUnexplored.RU_RED_PAINTED_FLETCHING_TABLE, Registries.ITEM.get(new Identifier("regions_unexplored:red_painted_planks")));
        offerFletchingTableRecipe(withConditions(exporter, DefaultResourceConditions.allModsLoaded("regions_unexplored")), RegionsUnexplored.RU_REDWOOD_FLETCHING_TABLE, Registries.ITEM.get(new Identifier("regions_unexplored:redwood_planks")));
        offerFletchingTableRecipe(withConditions(exporter, DefaultResourceConditions.allModsLoaded("regions_unexplored")), RegionsUnexplored.RU_WHITE_PAINTED_FLETCHING_TABLE, Registries.ITEM.get(new Identifier("regions_unexplored:white_painted_planks")));
        offerFletchingTableRecipe(withConditions(exporter, DefaultResourceConditions.allModsLoaded("regions_unexplored")), RegionsUnexplored.RU_WILLOW_FLETCHING_TABLE, Registries.ITEM.get(new Identifier("regions_unexplored:willow_planks")));
        offerFletchingTableRecipe(withConditions(exporter, DefaultResourceConditions.allModsLoaded("regions_unexplored")), RegionsUnexplored.RU_YELLOW_PAINTED_FLETCHING_TABLE, Registries.ITEM.get(new Identifier("regions_unexplored:yellow_painted_planks")));
        //0.4.1 (disabled)
        //offerFletchingTableRecipe(withConditions(exporter,DefaultResourceConditions.and(DefaultResourceConditions.allModsLoaded("regions_unexplored"),DefaultResourceConditions.registryContains(RegistryKey.of(RegistryKeys.BLOCK, new Identifier("regions_unexplored:cherry_planks"))))), RegionsUnexplored.RU_CHERRY_FLETCHING_TABLE, Registries.ITEM.get(new Identifier("regions_unexplored:cherry_planks")));
        //offerFletchingTableRecipe(withConditions(exporter,DefaultResourceConditions.and(DefaultResourceConditions.allModsLoaded("regions_unexplored"),DefaultResourceConditions.registryContains(RegistryKey.of(RegistryKeys.BLOCK, new Identifier("regions_unexplored:sculkwood_planks"))))), RegionsUnexplored.RU_SCULKWOOD_FLETCHING_TABLE, Registries.ITEM.get(new Identifier("regions_unexplored:sculkwood_planks")));
        //0.5.0
        offerFletchingTableRecipe(withConditions(exporter, DefaultResourceConditions.and(DefaultResourceConditions.allModsLoaded("regions_unexplored"), DefaultResourceConditions.registryContains(RegistryKey.of(RegistryKeys.BLOCK, new Identifier("regions_unexplored:brimwood_planks"))))), RegionsUnexplored.RU_BRIMWOOD_FLETCHING_TABLE, Registries.ITEM.get(new Identifier("regions_unexplored:brimwood_planks")));
        offerFletchingTableRecipe(withConditions(exporter, DefaultResourceConditions.and(DefaultResourceConditions.allModsLoaded("regions_unexplored"), DefaultResourceConditions.registryContains(RegistryKey.of(RegistryKeys.BLOCK, new Identifier("regions_unexplored:cobalt_planks"))))), RegionsUnexplored.RU_COBALT_FLETCHING_TABLE, Registries.ITEM.get(new Identifier("regions_unexplored:cobalt_planks")));
        offerFletchingTableRecipe(withConditions(exporter, DefaultResourceConditions.and(DefaultResourceConditions.allModsLoaded("regions_unexplored"), DefaultResourceConditions.registryContains(RegistryKey.of(RegistryKeys.BLOCK, new Identifier("regions_unexplored:kapok_planks"))))), RegionsUnexplored.RU_KAPOK_FLETCHING_TABLE, Registries.ITEM.get(new Identifier("regions_unexplored:kapok_planks")));
        offerFletchingTableRecipe(withConditions(exporter, DefaultResourceConditions.and(DefaultResourceConditions.allModsLoaded("regions_unexplored"), DefaultResourceConditions.registryContains(RegistryKey.of(RegistryKeys.BLOCK, new Identifier("regions_unexplored:magnolia_planks"))))), RegionsUnexplored.RU_MAGNOLIA_FLETCHING_TABLE, Registries.ITEM.get(new Identifier("regions_unexplored:magnolia_planks")));
        offerFletchingTableRecipe(withConditions(exporter, DefaultResourceConditions.and(DefaultResourceConditions.allModsLoaded("regions_unexplored"), DefaultResourceConditions.registryContains(RegistryKey.of(RegistryKeys.BLOCK, new Identifier("regions_unexplored:socotra_planks"))))), RegionsUnexplored.RU_SOCOTRA_FLETCHING_TABLE, Registries.ITEM.get(new Identifier("regions_unexplored:socotra_planks")));
        offerFletchingTableRecipe(withConditions(exporter, DefaultResourceConditions.and(DefaultResourceConditions.allModsLoaded("regions_unexplored"), DefaultResourceConditions.registryContains(RegistryKey.of(RegistryKeys.BLOCK, new Identifier("regions_unexplored:yellow_bioshroom_planks"))))), RegionsUnexplored.RU_YELLOW_BIOSHROOM_FLETCHING_TABLE, Registries.ITEM.get(new Identifier("regions_unexplored:yellow_bioshroom_planks")));

        // SnifferPlus (disabled)
        //offerFletchingTableRecipe(withConditions(exporter, DefaultResourceConditions.allModsLoaded("snifferplus")), SnifferPlus.SP_STONE_PINE_FLETCHING_TABLE, Registries.ITEM.get(new Identifier("snifferplus:stone_pine_planks")));

        // Tech Reborn
        offerFletchingTableRecipe(withConditions(exporter, DefaultResourceConditions.allModsLoaded("techreborn")), TechReborn.TR_RUBBER_FLETCHING_TABLE, Registries.ITEM.get(new Identifier("techreborn:rubber_planks")));

        // Vinery (Lets Do)
        offerFletchingTableRecipe(withConditions(exporter, DefaultResourceConditions.allModsLoaded("vinery")), Vinery.LDV_CHERRY_FLETCHING_TABLE, Registries.ITEM.get(new Identifier("vinery:cherry_planks")));


        // Uncrafting Recipe
        ShapelessRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, Items.FLETCHING_TABLE, 1)
                .input(ModItemTags.FLETCHING_TABLES)
                .criterion("has_fletching_table", InventoryChangedCriterion.Conditions.items(Items.FLETCHING_TABLE))
                .offerTo(exporter, new Identifier("variantfletchingtables", "fletching_table"));
    }
}
