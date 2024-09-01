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

public class Desolation {

    public static Map<Identifier, Block> DS_FLETCHING_TABLES = Maps.newHashMap();

    public static Block DS_CHARRED_FLETCHING_TABLE;

    public static void registerFletchingTables() {
        DS_CHARRED_FLETCHING_TABLE = registerFletchingTable("ds_charred_fletching_table");
    }

    public static Block register(String name, Block block) {
        Identifier identifier = Identifier.of(Initialise.MOD_ID, name);
        Registry.register(Registries.BLOCK, identifier, block);
        DS_FLETCHING_TABLES.put(identifier, block);
        Registry.register(Registries.ITEM, identifier, new BlockItem(block, new Item.Settings()));
        return block;
    }

    public static Block registerFletchingTable(String name) {
        return register(name, new FletchingTableBlock(FabricBlockSettings.copy(Blocks.FLETCHING_TABLE)));
    }
}