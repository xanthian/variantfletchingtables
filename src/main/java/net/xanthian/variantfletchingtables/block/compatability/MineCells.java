package net.xanthian.variantfletchingtables.block.compatability;

import com.google.common.collect.Maps;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.xanthian.variantfletchingtables.Initialise;

import java.util.Map;

public class MineCells {

    public static Map<Identifier, Block> MC_FLETCHING_TABLES = Maps.newHashMap();

    public static Block MC_PUTRID_FLETCHING_TABLE;

    public static void registerFletchingTables() {
        MC_PUTRID_FLETCHING_TABLE = registerFletchingTable("mc_putrid_fletching_table");
    }

    private static Block register(String name, Block block) {
        Identifier identifier = new Identifier(Initialise.MOD_ID, name);
        Registry.register(Registries.BLOCK, identifier, block);
        MC_FLETCHING_TABLES.put(identifier, block);
        Registry.register(Registries.ITEM, identifier, new BlockItem(block, new FabricItemSettings()));
        return block;
    }

    private static Block registerFletchingTable(String name) {
        return register(name, new Block(FabricBlockSettings.copy(Blocks.FLETCHING_TABLE)));
    }
}