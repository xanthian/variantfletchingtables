package net.xanthian.variantfletchingtables.block.compatability;

import com.google.common.collect.Maps;
import net.minecraft.block.AbstractBlock;
import net.minecraft.item.Item;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.FletchingTableBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.xanthian.variantfletchingtables.Initialise;

import java.util.Map;

public class Cinderscapes {
    public static Map<Identifier, Block> CS_FLETCHING_TABLES = Maps.newHashMap();

    public static Block CS_SCORCHED_FLETCHING_TABLE;
    public static Block CS_UMBRAL_FLETCHING_TABLE;

    public static void registerFletchingTables() {
        CS_SCORCHED_FLETCHING_TABLE = registerFletchingTable("cs_scorched_fletching_table");
        CS_UMBRAL_FLETCHING_TABLE = registerFletchingTable("cs_umbral_fletching_table");
    }

    public static Block register(String name, Block block) {
        Identifier identifier = Identifier.of(Initialise.MOD_ID, name);
        Registry.register(Registries.BLOCK, identifier, block);
        CS_FLETCHING_TABLES.put(identifier, block);
        Registry.register(Registries.ITEM, identifier, new BlockItem(block, new Item.Settings()));
        return block;
    }

    public static Block registerFletchingTable(String name) {
        return register(name, new FletchingTableBlock(AbstractBlock.Settings.copy(Blocks.FLETCHING_TABLE)));
    }
}