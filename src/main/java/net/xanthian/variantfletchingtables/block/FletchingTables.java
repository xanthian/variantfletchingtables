package net.xanthian.variantfletchingtables.block;

import com.google.common.collect.Maps;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.xanthian.variantfletchingtables.Initialise;

import java.util.Map;

public class FletchingTables {

    public static Map<Identifier, Block> MOD_FLETCHING_TABLES = Maps.newHashMap();

    // Vanilla
    public static final VariantFletchingTableBlock ACACIA_FLETCHING_TABLE = new VariantFletchingTableBlock();
    public static final VariantFletchingTableBlock BAMBOO_FLETCHING_TABLE = new VariantFletchingTableBlock();
    public static final VariantFletchingTableBlock CHERRY_FLETCHING_TABLE = new VariantFletchingTableBlock();
    public static final VariantFletchingTableBlock DARK_OAK_FLETCHING_TABLE = new VariantFletchingTableBlock();
    public static final VariantFletchingTableBlock JUNGLE_FLETCHING_TABLE = new VariantFletchingTableBlock();
    public static final VariantFletchingTableBlock MANGROVE_FLETCHING_TABLE = new VariantFletchingTableBlock();
    public static final VariantFletchingTableBlock OAK_FLETCHING_TABLE = new VariantFletchingTableBlock();
    public static final VariantFletchingTableBlock SPRUCE_FLETCHING_TABLE = new VariantFletchingTableBlock();
    public static final VariantFletchingTableBlock WARPED_FLETCHING_TABLE = new VariantFletchingTableBlock();
    public static final VariantFletchingTableBlock CRIMSON_FLETCHING_TABLE = new VariantFletchingTableBlock();

    public static void registerVanillaTables() {
        registerFletchingTableBlock("acacia_fletching_table", ACACIA_FLETCHING_TABLE,true);
        registerFletchingTableBlock("bamboo_fletching_table", BAMBOO_FLETCHING_TABLE,true);
        registerFletchingTableBlock("cherry_fletching_table", CHERRY_FLETCHING_TABLE,true);
        registerFletchingTableBlock("dark_oak_fletching_table", DARK_OAK_FLETCHING_TABLE,true);
        registerFletchingTableBlock("jungle_fletching_table", JUNGLE_FLETCHING_TABLE,true);
        registerFletchingTableBlock("mangrove_fletching_table", MANGROVE_FLETCHING_TABLE,true);
        registerFletchingTableBlock("oak_fletching_table", OAK_FLETCHING_TABLE,true);
        registerFletchingTableBlock("spruce_fletching_table", SPRUCE_FLETCHING_TABLE,true);
        registerFletchingTableBlock("crimson_fletching_table", CRIMSON_FLETCHING_TABLE, false);
        registerFletchingTableBlock("warped_fletching_table", WARPED_FLETCHING_TABLE, false);
    }


    private static void registerFletchingTableBlock(String Id, Block block, boolean canBurn) {
        Identifier identifier = new Identifier(Initialise.MOD_ID, Id.toLowerCase());
        Registry.register(Registries.BLOCK, identifier, block);
        Registry.register(Registries.ITEM, identifier, new BlockItem(block, new FabricItemSettings()));
        if (canBurn) FuelRegistry.INSTANCE.add(block, 300);
        MOD_FLETCHING_TABLES.put(identifier, block);
    }
}