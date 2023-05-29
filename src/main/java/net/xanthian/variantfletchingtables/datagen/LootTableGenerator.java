package net.xanthian.variantfletchingtables.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;

import net.xanthian.variantfletchingtables.block.FletchingTables;


public class LootTableGenerator extends FabricBlockLootTableProvider {
    public LootTableGenerator(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generate() {
        addDrop(FletchingTables.ACACIA_FLETCHING_TABLE);
        addDrop(FletchingTables.BAMBOO_FLETCHING_TABLE);
        addDrop(FletchingTables.CHERRY_FLETCHING_TABLE);
        addDrop(FletchingTables.CRIMSON_FLETCHING_TABLE);
        addDrop(FletchingTables.DARK_OAK_FLETCHING_TABLE);
        addDrop(FletchingTables.JUNGLE_FLETCHING_TABLE);
        addDrop(FletchingTables.MANGROVE_FLETCHING_TABLE);
        addDrop(FletchingTables.OAK_FLETCHING_TABLE);
        addDrop(FletchingTables.SPRUCE_FLETCHING_TABLE);
        addDrop(FletchingTables.WARPED_FLETCHING_TABLE);
    }
}