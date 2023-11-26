package net.xanthian.variantfletchingtables.block.compatability;

import com.google.common.collect.Maps;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.xanthian.variantfletchingtables.Initialise;
import net.xanthian.variantfletchingtables.block.VariantFletchingTableBlock;

import java.util.Map;

public class Bewitchment {

    public static Map<Identifier, Block> BW_FLETCHING_TABLES = Maps.newHashMap();

    public static Block BW_CYPRESS_FLETCHING_TABLE;
    public static Block BW_DRAGONS_BLOOD_FLETCHING_TABLE;
    public static Block BW_ELDER_FLETCHING_TABLE;
    public static Block BW_JUNIPER_FLETCHING_TABLE;

    public static void registerFletchingTables() {
        BW_CYPRESS_FLETCHING_TABLE = registerFletchingTable("bw_cypress_fletching_table");
        BW_DRAGONS_BLOOD_FLETCHING_TABLE = registerFletchingTable("bw_dragons_blood_fletching_table");
        BW_ELDER_FLETCHING_TABLE = registerFletchingTable("bw_elder_fletching_table");
        BW_JUNIPER_FLETCHING_TABLE = registerFletchingTable("bw_juniper_fletching_table");
    }

    public static Block register(String name, Block block) {
        Identifier identifier = new Identifier(Initialise.MOD_ID, name);
        Registry.register(Registries.BLOCK, identifier, block);
        BW_FLETCHING_TABLES.put(identifier, block);
        Registry.register(Registries.ITEM, identifier, new BlockItem(block, new FabricItemSettings()));
        return block;
    }

    public static Block registerFletchingTable(String name) {
        return register(name, new VariantFletchingTableBlock());
    }
}