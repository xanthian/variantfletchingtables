package net.xanthian.variantfletchingtables.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;
import net.xanthian.variantfletchingtables.block.Vanilla;
import net.xanthian.variantfletchingtables.block.compatability.*;
import net.xanthian.variantfletchingtables.utils.ModItemTags;

import java.util.Map;
import java.util.concurrent.CompletableFuture;

public class ItemTagGenerator extends FabricTagProvider.ItemTagProvider {

    private static final TagKey<Item> C_JOB_SITE = TagKey.of(Registries.ITEM.getKey(), new Identifier("c:villager_job_sites"));

    public ItemTagGenerator(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup arg) {

        registerTags(Vanilla.VANILLA_FLETCHING_TABLES);

        registerTags(AdAstra.AA_FLETCHING_TABLES);
        registerTags(BeachParty.LDBP_FLETCHING_TABLES);
        registerTags(BetterArcheology.BA_FLETCHING_TABLES);
        registerTags(Bewitchment.BW_FLETCHING_TABLES);
        registerTags(BiomeMakeover.BM_FLETCHING_TABLES);
        registerTags(Blockus.BLS_FLETCHING_TABLES);
        registerTags(Botania.BOT_FLETCHING_TABLES);
        registerTags(Cinderscapes.CS_FLETCHING_TABLES);
        registerTags(DeeperAndDarker.DAD_FLETCHING_TABLES);
        registerTags(Desolation.DS_FLETCHING_TABLES);
        registerTags(EldritchEnd.EE_FLETCHING_TABLES);
        registerTags(MineCells.MC_FLETCHING_TABLES);
        registerTags(NaturesSpirit.NS_FLETCHING_TABLES);
        registerTags(Promenade.PROM_FLETCHING_TABLES);
        registerTags(RegionsUnexplored.RU_FLETCHING_TABLES);
        registerTags(SnifferPlus.SP_FLETCHING_TABLES);
        registerTags(TechReborn.TR_FLETCHING_TABLES);
        registerTags(Vinery.LDV_FLETCHING_TABLES);

        getOrCreateTagBuilder(ItemTags.NON_FLAMMABLE_WOOD)
                .add(Vanilla.CRIMSON_FLETCHING_TABLE.asItem())
                .add(Vanilla.WARPED_FLETCHING_TABLE.asItem())
                .addOptional(new Identifier("variantfletchingtables:bls_herringbone_charred_fletching_table"))
                .addOptional(new Identifier("variantfletchingtables:bls_herringbone_crimson_fletching_table"))
                .addOptional(new Identifier("variantfletchingtables:bls_herringbone_warped_fletching_table"))
                .addOptional(new Identifier("variantfletchingtables:prom_dark_amaranth_fletching_table"))
                .addOptional(new Identifier("variantfletchingtables:ru_brimwood_fletching_table"))
                .addOptional(new Identifier("variantfletchingtables:ru_cobalt_fletching_table"))
                .addOptional(new Identifier("variantfletchingtables:ru_dead_fletching_table"))
                .addOptional(new Identifier("variantfletchingtables:ru_yellow_bioshroom_fletching_table"));

        getOrCreateTagBuilder(C_JOB_SITE)
                .addTag(ModItemTags.FLETCHING_TABLES);
    }

    private void registerTags(Map<Identifier, Block> blockMap) {
        for (Block block : blockMap.values()) {
            Identifier lootTableId = block.getLootTableId();
            String newPath = lootTableId.getPath().replaceFirst("blocks/", "");
            Identifier modifiedId = new Identifier(lootTableId.getNamespace(), newPath);
            getOrCreateTagBuilder(ModItemTags.FLETCHING_TABLES)
                    .addOptional(modifiedId);
        }
    }
}