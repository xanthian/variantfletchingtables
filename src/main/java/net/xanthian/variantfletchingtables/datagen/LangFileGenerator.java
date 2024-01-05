package net.xanthian.variantfletchingtables.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.registry.Registries;
import net.minecraft.util.Identifier;
import net.xanthian.variantfletchingtables.block.Vanilla;
import net.xanthian.variantfletchingtables.block.compatability.*;

import java.util.Map;

public class LangFileGenerator extends FabricLanguageProvider {
    public LangFileGenerator(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    public static String generateBlockDisplayName(Block block) {
        Identifier name = Registries.BLOCK.getId(block);
        String blockName = name.getPath();
        int underscoreIndex = blockName.indexOf('_');
        if (underscoreIndex != -1 && underscoreIndex < blockName.length() - 1) {
            blockName = blockName.substring(underscoreIndex + 1);
        }
        String[] parts = blockName.split("_");
        StringBuilder displayName = new StringBuilder();
        for (String part : parts) {
            displayName.append(Character.toUpperCase(part.charAt(0))).append(part.substring(1)).append(" ");
        }
        return displayName.toString().trim();
    }

    private static void registerTranslations(TranslationBuilder translationBuilder, Map<Identifier, Block> blockMap) {
        for (Block block : blockMap.values()) {
            translationBuilder.add(block, generateBlockDisplayName(block));
        }
    }

    @Override
    public void generateTranslations(TranslationBuilder translationBuilder) {

        translationBuilder.add(Vanilla.ACACIA_FLETCHING_TABLE, "Acacia Fletching_Table");
        translationBuilder.add(Vanilla.BAMBOO_FLETCHING_TABLE, "Bamboo Fletching_Table");
        translationBuilder.add(Blocks.FLETCHING_TABLE, "Birch Fletching_Table");
        translationBuilder.add(Vanilla.CHERRY_FLETCHING_TABLE, "Cherry Fletching_Table");
        translationBuilder.add(Vanilla.CRIMSON_FLETCHING_TABLE, "Crimson Fletching_Table");
        translationBuilder.add(Vanilla.DARK_OAK_FLETCHING_TABLE, "Dark Oak Fletching_Table");
        translationBuilder.add(Vanilla.JUNGLE_FLETCHING_TABLE, "Jungle Fletching_Table");
        translationBuilder.add(Vanilla.MANGROVE_FLETCHING_TABLE, "Mangrove Fletching_Table");
        translationBuilder.add(Vanilla.OAK_FLETCHING_TABLE, "Oak Fletching_Table");
        translationBuilder.add(Vanilla.SPRUCE_FLETCHING_TABLE, "Spruce Fletching_Table");
        translationBuilder.add(Vanilla.WARPED_FLETCHING_TABLE, "Warped Fletching_Table");

        registerTranslations(translationBuilder, AdAstra.AA_FLETCHING_TABLES);
        registerTranslations(translationBuilder, BeachParty.LDBP_FLETCHING_TABLES);
        registerTranslations(translationBuilder, BetterArcheology.BA_FLETCHING_TABLES);
        registerTranslations(translationBuilder, Bewitchment.BW_FLETCHING_TABLES);
        registerTranslations(translationBuilder, BiomeMakeover.BM_FLETCHING_TABLES);
        registerTranslations(translationBuilder, Blockus.BLS_FLETCHING_TABLES);
        registerTranslations(translationBuilder, Botania.BOT_FLETCHING_TABLES);
        registerTranslations(translationBuilder, Cinderscapes.CS_FLETCHING_TABLES);
        registerTranslations(translationBuilder, DeeperAndDarker.DAD_FLETCHING_TABLES);
        registerTranslations(translationBuilder, Desolation.DS_FLETCHING_TABLES);
        registerTranslations(translationBuilder, EldritchEnd.EE_FLETCHING_TABLES);
        registerTranslations(translationBuilder, MineCells.MC_FLETCHING_TABLES);
        registerTranslations(translationBuilder, NaturesSpirit.NS_FLETCHING_TABLES);
        registerTranslations(translationBuilder, Promenade.PROM_FLETCHING_TABLES);
        registerTranslations(translationBuilder, RegionsUnexplored.RU_FLETCHING_TABLES);
        registerTranslations(translationBuilder, SnifferPlus.SP_FLETCHING_TABLES);
        registerTranslations(translationBuilder, TechReborn.TR_FLETCHING_TABLES);
        registerTranslations(translationBuilder, Vinery.LDV_FLETCHING_TABLES);
    }
}