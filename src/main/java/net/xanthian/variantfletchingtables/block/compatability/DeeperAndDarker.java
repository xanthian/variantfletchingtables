package net.xanthian.variantfletchingtables.block.compatability;

import com.google.common.collect.Maps;
import net.minecraft.item.Item;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.xanthian.variantfletchingtables.Initialise;
import net.xanthian.variantfletchingtables.block.VariantFletchingTableBlock;

import java.util.Map;


public class DeeperAndDarker {

    public static Map<Identifier, Block> DAD_FLETCHING_TABLES = Maps.newHashMap();

    public static Block DAD_ECHO_FLETCHING_TABLE;
    public static Block DAD_BLOOM_FLETCHING_TABLE;

    public static void registerFletchingTables() {
        DAD_ECHO_FLETCHING_TABLE = registerFletchingTable("dad_echo_fletching_table");
        DAD_BLOOM_FLETCHING_TABLE = registerFletchingTable("dad_bloom_fletching_table");
    }

    public static Block register(String name, Block block) {
        Identifier identifier = Identifier.of(Initialise.MOD_ID, name);
        Registry.register(Registries.BLOCK, identifier, block);
        DAD_FLETCHING_TABLES.put(identifier, block);
        Registry.register(Registries.ITEM, identifier, new BlockItem(block, new Item.Settings()));
        return block;
    }

    public static Block registerFletchingTable(String name) {
        return register(name, new VariantFletchingTableBlock());
    }
}