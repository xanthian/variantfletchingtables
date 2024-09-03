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

public class BiomeMakeover {

    public static Map<Identifier, Block> BM_FLETCHING_TABLES = Maps.newHashMap();

    public static Block BM_ANCIENT_OAK_FLETCHING_TABLE;
    public static Block BM_BLIGHTED_BALSA_FLETCHING_TABLE;
    public static Block BM_SWAMP_CYPRESS_FLETCHING_TABLE;
    public static Block BM_WILLOW_FLETCHING_TABLE;

    public static void registerFletchingTables() {
        BM_ANCIENT_OAK_FLETCHING_TABLE = registerFletchingTable("bm_ancient_oak_fletching_table");
        BM_BLIGHTED_BALSA_FLETCHING_TABLE = registerFletchingTable("bm_blighted_balsa_fletching_table");
        BM_SWAMP_CYPRESS_FLETCHING_TABLE = registerFletchingTable("bm_swamp_cypress_fletching_table");
        BM_WILLOW_FLETCHING_TABLE = registerFletchingTable("bm_willow_fletching_table");
    }

    public static Block register(String name, Block block) {
        Identifier identifier = Identifier.of(Initialise.MOD_ID, name);
        Registry.register(Registries.BLOCK, identifier, block);
        BM_FLETCHING_TABLES.put(identifier, block);
        Registry.register(Registries.ITEM, identifier, new BlockItem(block, new Item.Settings()));
        return block;
    }

    public static Block registerFletchingTable(String name) {
        return register(name, new FletchingTableBlock(AbstractBlock.Settings.copy(Blocks.FLETCHING_TABLE)));
    }
}