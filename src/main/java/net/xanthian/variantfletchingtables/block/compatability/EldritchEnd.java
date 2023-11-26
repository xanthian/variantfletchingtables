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

public class EldritchEnd {

    public static Map<Identifier, Block> EE_FLETCHING_TABLES = Maps.newHashMap();

    public static Block EE_PRIMORDIAL_FLETCHING_TABLE;

    public static void registerFletchingTables() {
        EE_PRIMORDIAL_FLETCHING_TABLE = registerFletchingTable("ee_primordial_fletching_table");
    }

    private static Block register(String name, Block block) {
        Identifier identifier = new Identifier(Initialise.MOD_ID, name);
        Registry.register(Registries.BLOCK, identifier, block);
        EE_FLETCHING_TABLES.put(identifier, block);
        Registry.register(Registries.ITEM, identifier, new BlockItem(block, new FabricItemSettings()));
        return block;
    }

    private static Block registerFletchingTable(String name) {
        return register(name, new VariantFletchingTableBlock());
    }
}