package net.xanthian.variantfletchingtables.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.fabricmc.fabric.api.resource.conditions.v1.DefaultResourceConditions;
import net.minecraft.block.Block;
import net.minecraft.util.Identifier;
import net.xanthian.variantfletchingtables.block.Vanilla;
import net.xanthian.variantfletchingtables.block.compatability.*;

import java.util.Map;


public class LootTableGenerator extends FabricBlockLootTableProvider {
    public LootTableGenerator(FabricDataOutput dataOutput) {
        super(dataOutput);
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
        registerLootTables(DeeperAndDarker.DAD_FLETCHING_TABLES, "deeperdarker");
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
            withConditions(DefaultResourceConditions.allModsLoaded(modId)).addDrop(block);
        }
    }
}