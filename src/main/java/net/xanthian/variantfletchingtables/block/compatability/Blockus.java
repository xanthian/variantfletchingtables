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

public class Blockus {

    public static Map<Identifier, Block> BLS_FLETCHING_TABLES = Maps.newHashMap();

    public static Block BLS_CHARRED_FLETCHING_TABLE;
    public static Block BLS_RAW_BAMBOO_FLETCHING_TABLE;
    public static Block BLS_WHITE_OAK_FLETCHING_TABLE;

    public static void registerFletchingTables() {

        BLS_CHARRED_FLETCHING_TABLE = registerFletchingTable("bls_charred_fletching_table");
        BLS_RAW_BAMBOO_FLETCHING_TABLE = registerFletchingTable("bls_raw_bamboo_fletching_table");
        BLS_WHITE_OAK_FLETCHING_TABLE = registerFletchingTable("bls_white_oak_fletching_table");

    }

    private static Block register(String name, Block block) {
        Identifier identifier = Identifier.of(Initialise.MOD_ID, name);
        Registry.register(Registries.BLOCK, identifier, block);
        BLS_FLETCHING_TABLES.put(identifier, block);
        Registry.register(Registries.ITEM, identifier, new BlockItem(block, new Item.Settings()));
        return block;
    }

    private static Block registerFletchingTable(String name) {
        return register(name, new VariantFletchingTableBlock());
    }
}