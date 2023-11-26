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

public class NaturesSpirit {

    public static Map<Identifier, Block> NS_FLETCHING_TABLES = Maps.newHashMap();

    public static Block NS_ASPEN_FLETCHING_TABLE;
    public static Block NS_CYPRESS_FLETCHING_TABLE;
    public static Block NS_FIR_FLETCHING_TABLE;
    public static Block NS_JOSHUA_FLETCHING_TABLE;
    public static Block NS_MAPLE_FLETCHING_TABLE;
    public static Block NS_OLIVE_FLETCHING_TABLE;
    public static Block NS_REDWOOD_FLETCHING_TABLE;
    public static Block NS_SUGI_FLETCHING_TABLE;
    public static Block NS_WILLOW_FLETCHING_TABLE;
    public static Block NS_WISTERIA_FLETCHING_TABLE;

    public static void registerFletchingTables() {
        NS_ASPEN_FLETCHING_TABLE = registerFletchingTable("ns_aspen_fletching_table");
        NS_CYPRESS_FLETCHING_TABLE = registerFletchingTable("ns_cypress_fletching_table");
        NS_FIR_FLETCHING_TABLE = registerFletchingTable("ns_fir_fletching_table");
        NS_JOSHUA_FLETCHING_TABLE = registerFletchingTable("ns_joshua_fletching_table");
        NS_MAPLE_FLETCHING_TABLE = registerFletchingTable("ns_maple_fletching_table");
        NS_OLIVE_FLETCHING_TABLE = registerFletchingTable("ns_olive_fletching_table");
        NS_REDWOOD_FLETCHING_TABLE = registerFletchingTable("ns_redwood_fletching_table");
        NS_SUGI_FLETCHING_TABLE = registerFletchingTable("ns_sugi_fletching_table");
        NS_WILLOW_FLETCHING_TABLE = registerFletchingTable("ns_willow_fletching_table");
        NS_WISTERIA_FLETCHING_TABLE = registerFletchingTable("ns_wisteria_fletching_table");
    }

    private static Block register(String name, Block block) {
        Identifier identifier = new Identifier(Initialise.MOD_ID, name);
        Registry.register(Registries.BLOCK, identifier, block);
        NS_FLETCHING_TABLES.put(identifier, block);
        Registry.register(Registries.ITEM, identifier, new BlockItem(block, new FabricItemSettings()));
        return block;
    }

    private static Block registerFletchingTable(String name) {
        return register(name, new VariantFletchingTableBlock());
    }
}