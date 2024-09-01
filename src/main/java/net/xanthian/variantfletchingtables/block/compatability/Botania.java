package net.xanthian.variantfletchingtables.block.compatability;

import com.google.common.collect.Maps;
import net.minecraft.item.Item;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.FletchingTableBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.xanthian.variantfletchingtables.Initialise;

import java.util.Map;

public class Botania {

    public static Map<Identifier, Block> BOT_FLETCHING_TABLES = Maps.newHashMap();

    public static Block BOT_DREAMWOOD_FLETCHING_TABLE;
    public static Block BOT_LIVINGWOOD_FLETCHING_TABLE;
    public static Block BOT_SHIMMERWOOD_FLETCHING_TABLE;

    public static void registerFletchingTables() {
        BOT_DREAMWOOD_FLETCHING_TABLE = registerFletchingTable("bot_dreamwood_fletching_table");
        BOT_LIVINGWOOD_FLETCHING_TABLE = registerFletchingTable("bot_livingwood_fletching_table");
        BOT_SHIMMERWOOD_FLETCHING_TABLE = registerFletchingTable("bot_shimmerwood_fletching_table");
    }

    public static Block register(String name, Block block) {
        Identifier identifier = Identifier.of(Initialise.MOD_ID, name);
        Registry.register(Registries.BLOCK, identifier, block);
        BOT_FLETCHING_TABLES.put(identifier, block);
        Registry.register(Registries.ITEM, identifier, new BlockItem(block, new Item.Settings()));
        return block;
    }

    public static Block registerFletchingTable(String name) {
        return register(name, new FletchingTableBlock(FabricBlockSettings.copy(Blocks.FLETCHING_TABLE)));
    }
}