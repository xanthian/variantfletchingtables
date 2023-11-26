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

public class AdAstra {

    public static Map<Identifier, Block> AA_FLETCHING_TABLES = Maps.newHashMap();

    public static Block AA_AERONOS_FLETCHING_TABLE;
    public static Block AA_GLACIAN_FLETCHING_TABLE;
    public static Block AA_STROPHAR_FLETCHING_TABLE;

    public static void registerFletchingTables() {
        AA_AERONOS_FLETCHING_TABLE = registerFletchingTable("aa_aeronos_fletching_table");
        AA_GLACIAN_FLETCHING_TABLE = registerFletchingTable("aa_glacian_fletching_table");
        AA_STROPHAR_FLETCHING_TABLE = registerFletchingTable("aa_strophar_fletching_table");
    }

    public static Block register(String name, Block block) {
        Identifier identifier = new Identifier(Initialise.MOD_ID, name);
        Registry.register(Registries.BLOCK, identifier, block);
        AA_FLETCHING_TABLES.put(identifier, block);
        Registry.register(Registries.ITEM, identifier, new BlockItem(block, new FabricItemSettings()));
        return block;
    }

    public static Block registerFletchingTable(String name) {
        return register(name, new VariantFletchingTableBlock());
    }
}