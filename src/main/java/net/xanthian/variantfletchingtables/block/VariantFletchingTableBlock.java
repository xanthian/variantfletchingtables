package net.xanthian.variantfletchingtables.block;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Blocks;
import net.minecraft.block.FletchingTableBlock;

public class VariantFletchingTableBlock extends FletchingTableBlock {

    public VariantFletchingTableBlock() {
        super(FabricBlockSettings.copy(Blocks.FLETCHING_TABLE));
    }
}