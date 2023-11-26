package net.xanthian.variantfletchingtables.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.block.Block;
import net.minecraft.registry.Registries;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;
import net.xanthian.variantfletchingtables.block.Vanilla;
import net.xanthian.variantfletchingtables.block.compatability.*;

import java.util.Map;
import java.util.concurrent.CompletableFuture;

import static net.xanthian.variantfletchingtables.Initialise.MOD_ID;

public class BlockTagGenerator extends FabricTagProvider.BlockTagProvider {

    private static final TagKey<Block> FLETCHING_TABLES = TagKey.of(Registries.BLOCK.getKey(), new Identifier(MOD_ID, "fletching_tables"));

    private static final TagKey<Block> C_JOB_SITE = TagKey.of(Registries.BLOCK.getKey(), new Identifier("c:villager_job_sites"));

    public BlockTagGenerator(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
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
        registerTags(DeeperAndDarker.DAD_FLETCHING_TABLES);
        registerTags(EldritchEnd.EE_FLETCHING_TABLES);
        registerTags(MineCells.MC_FLETCHING_TABLES);
        registerTags(NaturesSpirit.NS_FLETCHING_TABLES);
        registerTags(Promenade.PROM_FLETCHING_TABLES);
        registerTags(RegionsUnexplored.RU_FLETCHING_TABLES);
        registerTags(SnifferPlus.SP_FLETCHING_TABLES);
        registerTags(TechReborn.TR_FLETCHING_TABLES);
        registerTags(Vinery.LDV_FLETCHING_TABLES);

        getOrCreateTagBuilder(BlockTags.AXE_MINEABLE)
                .addTag(FLETCHING_TABLES);

        getOrCreateTagBuilder(C_JOB_SITE)
                .addTag(FLETCHING_TABLES);

    }

    private void registerTags(Map<Identifier, Block> blockMap) {
        for (Block block : blockMap.values()) {
            Identifier lootTableId = block.getLootTableId();
            String newPath = lootTableId.getPath().replaceFirst("blocks/", "");
            Identifier modifiedId = new Identifier(lootTableId.getNamespace(), newPath);
            getOrCreateTagBuilder(FLETCHING_TABLES)
                    .addOptional(modifiedId);
        }
    }
}
