package net.xanthian.variantfletchingtables.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.fabricmc.fabric.api.resource.conditions.v1.ResourceConditions;
import net.minecraft.block.Block;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.util.Identifier;
import net.xanthian.variantfletchingtables.block.Vanilla;
import net.xanthian.variantfletchingtables.block.compatability.*;

import java.util.Map;
import java.util.concurrent.CompletableFuture;


public class LootTableGenerator extends FabricBlockLootTableProvider {
    public LootTableGenerator(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, registryLookup);
    }

    @Override
    public void generate() {
        for (Block block : Vanilla.VANILLA_FLETCHING_TABLES.values()) {
            addDrop(block);
        }
        registerLootTables(AdAstra.AA_FLETCHING_TABLES, "ad_astra");
        registerLootTables(BeachParty.LDBP_FLETCHING_TABLES, "beachparty");
        registerLootTables(BetterArcheology.BA_FLETCHING_TABLES, "betterarcheology");
        registerLootTables(Bewitchment.BW_FLETCHING_TABLES, "bewitchment");
        registerLootTables(BiomeMakeover.BM_FLETCHING_TABLES, "biomemakeover");
        registerLootTables(Blockus.BLS_FLETCHING_TABLES, "blockus");
        registerLootTables(Botania.BOT_FLETCHING_TABLES, "botania");
        registerLootTables(Cinderscapes.CS_FLETCHING_TABLES, "cinderscape");
        registerLootTables(DeeperAndDarker.DAD_FLETCHING_TABLES, "deeperdarker");
        registerLootTables(Desolation.DS_FLETCHING_TABLES, "desolation");
        registerLootTables(EldritchEnd.EE_FLETCHING_TABLES, "eldritch_end");
        registerLootTables(MineCells.MC_FLETCHING_TABLES, "minecells");
        registerLootTables(NaturesSpirit.NS_FLETCHING_TABLES, "natures_spirit");
        registerLootTables(Promenade.PROM_FLETCHING_TABLES, "promenade");
        registerLootTables(RegionsUnexplored.RU_FLETCHING_TABLES, "regions_unexplored");
        registerLootTables(SnifferPlus.SP_FLETCHING_TABLES, "snifferplus");
        registerLootTables(TechReborn.TR_FLETCHING_TABLES, "techreborn");
        registerLootTables(Vinery.LDV_FLETCHING_TABLES, "vinery");

    }

    private void registerLootTables(Map<Identifier, Block> blockMap, String modId) {
        for (Block block : blockMap.values()) {
            withConditions(ResourceConditions.allModsLoaded(modId)).addDrop(block);
        }
    }
}