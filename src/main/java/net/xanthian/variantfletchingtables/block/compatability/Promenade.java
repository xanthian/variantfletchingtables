package net.xanthian.variantfletchingtables.block.compatability;

import com.google.common.collect.Maps;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Blocks;
import net.minecraft.block.FletchingTableBlock;
import net.minecraft.item.Item;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.xanthian.variantfletchingtables.Initialise;

import java.util.Map;

public class Promenade {

    public static Map<Identifier, Block> PROM_FLETCHING_TABLES = Maps.newHashMap();

    public static Block PROM_DARK_AMARANTH_FLETCHING_TABLE;
    public static Block PROM_MAPLE_FLETCHING_TABLE;
    public static Block PROM_PALM_FLETCHING_TABLE;
    public static Block PROM_SAKURA_FLETCHING_TABLE;

    public static void registerFletchingTables() {
        PROM_DARK_AMARANTH_FLETCHING_TABLE = registerFletchingTable("prom_dark_amaranth_fletching_table");
        PROM_MAPLE_FLETCHING_TABLE = registerFletchingTable("prom_maple_fletching_table");
        PROM_PALM_FLETCHING_TABLE = registerFletchingTable("prom_palm_fletching_table");
        PROM_SAKURA_FLETCHING_TABLE = registerFletchingTable("prom_sakura_fletching_table");
    }

    public static Block register(String name, Block block) {
        Identifier identifier = Identifier.of(Initialise.MOD_ID, name);
        Registry.register(Registries.BLOCK, identifier, block);
        PROM_FLETCHING_TABLES.put(identifier, block);
        Registry.register(Registries.ITEM, identifier, new BlockItem(block, new Item.Settings()));
        return block;
    }

    public static Block registerFletchingTable(String name) {
        return register(name, new FletchingTableBlock(AbstractBlock.Settings.copy(Blocks.FLETCHING_TABLE)));
    }
}