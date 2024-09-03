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

public class RegionsUnexplored {

    public static Map<Identifier, Block> RU_FLETCHING_TABLES = Maps.newHashMap();

    public static Block RU_ALPHA_OAK_FLETCHING_TABLE;
    public static Block RU_BAOBAB_FLETCHING_TABLE;
    public static Block RU_BLACK_PAINTED_FLETCHING_TABLE;
    public static Block RU_BLACKWOOD_FLETCHING_TABLE;
    public static Block RU_BLUE_PAINTED_FLETCHING_TABLE;
    public static Block RU_BROWN_PAINTED_FLETCHING_TABLE;
    public static Block RU_CYAN_PAINTED_FLETCHING_TABLE;
    public static Block RU_CYPRESS_FLETCHING_TABLE;
    public static Block RU_DEAD_FLETCHING_TABLE;
    public static Block RU_EUCALYPTUS_FLETCHING_TABLE;
    public static Block RU_GRAY_PAINTED_FLETCHING_TABLE;
    public static Block RU_GREEN_PAINTED_FLETCHING_TABLE;
    public static Block RU_JOSHUA_FLETCHING_TABLE;
    public static Block RU_LARCH_FLETCHING_TABLE;
    public static Block RU_LIGHT_BLUE_PAINTED_FLETCHING_TABLE;
    public static Block RU_LIGHT_GRAY_PAINTED_FLETCHING_TABLE;
    public static Block RU_LIME_PAINTED_FLETCHING_TABLE;
    public static Block RU_MAGENTA_PAINTED_FLETCHING_TABLE;
    public static Block RU_MAPLE_FLETCHING_TABLE;
    public static Block RU_MAUVE_FLETCHING_TABLE;
    public static Block RU_ORANGE_PAINTED_FLETCHING_TABLE;
    public static Block RU_PALM_FLETCHING_TABLE;
    public static Block RU_PINE_FLETCHING_TABLE;
    public static Block RU_PINK_PAINTED_FLETCHING_TABLE;
    public static Block RU_PURPLE_PAINTED_FLETCHING_TABLE;
    public static Block RU_REDWOOD_FLETCHING_TABLE;
    public static Block RU_RED_PAINTED_FLETCHING_TABLE;
    public static Block RU_WHITE_PAINTED_FLETCHING_TABLE;
    public static Block RU_WILLOW_FLETCHING_TABLE;
    public static Block RU_YELLOW_PAINTED_FLETCHING_TABLE;

    public static Block RU_BLUE_BIOSHROOM_FLETCHING_TABLE;
    public static Block RU_BRIMWOOD_FLETCHING_TABLE;
    public static Block RU_COBALT_FLETCHING_TABLE;
    public static Block RU_GREEN_BIOSHROOM_FLETCHING_TABLE;
    public static Block RU_KAPOK_FLETCHING_TABLE;
    public static Block RU_MAGNOLIA_FLETCHING_TABLE;
    public static Block RU_PINK_BIOSHROOM_FLETCHING_TABLE;
    public static Block RU_SOCOTRA_FLETCHING_TABLE;
    public static Block RU_YELLOW_BIOSHROOM_FLETCHING_TABLE;

    public static void registerFletchingTables() {
        RU_ALPHA_OAK_FLETCHING_TABLE = registerFletchingTable("ru_alpha_oak_fletching_table");
        RU_BAOBAB_FLETCHING_TABLE = registerFletchingTable("ru_baobab_fletching_table");
        RU_BLACK_PAINTED_FLETCHING_TABLE = registerFletchingTable("ru_black_painted_fletching_table");
        RU_BLACKWOOD_FLETCHING_TABLE = registerFletchingTable("ru_blackwood_fletching_table");
        RU_BLUE_PAINTED_FLETCHING_TABLE = registerFletchingTable("ru_blue_painted_fletching_table");
        RU_BROWN_PAINTED_FLETCHING_TABLE = registerFletchingTable("ru_brown_painted_fletching_table");
        RU_CYAN_PAINTED_FLETCHING_TABLE = registerFletchingTable("ru_cyan_painted_fletching_table");
        RU_CYPRESS_FLETCHING_TABLE = registerFletchingTable("ru_cypress_fletching_table");
        RU_DEAD_FLETCHING_TABLE = registerFletchingTable("ru_dead_fletching_table");
        RU_EUCALYPTUS_FLETCHING_TABLE = registerFletchingTable("ru_eucalyptus_fletching_table");
        RU_GREEN_PAINTED_FLETCHING_TABLE = registerFletchingTable("ru_green_painted_fletching_table");
        RU_GRAY_PAINTED_FLETCHING_TABLE = registerFletchingTable("ru_gray_painted_fletching_table");
        RU_JOSHUA_FLETCHING_TABLE = registerFletchingTable("ru_joshua_fletching_table");
        RU_LARCH_FLETCHING_TABLE = registerFletchingTable("ru_larch_fletching_table");
        RU_LIGHT_BLUE_PAINTED_FLETCHING_TABLE = registerFletchingTable("ru_light_blue_painted_fletching_table");
        RU_LIGHT_GRAY_PAINTED_FLETCHING_TABLE = registerFletchingTable("ru_light_gray_painted_fletching_table");
        RU_LIME_PAINTED_FLETCHING_TABLE = registerFletchingTable("ru_lime_painted_fletching_table");
        RU_MAGENTA_PAINTED_FLETCHING_TABLE = registerFletchingTable("ru_magenta_painted_fletching_table");
        RU_MAPLE_FLETCHING_TABLE = registerFletchingTable("ru_maple_fletching_table");
        RU_MAUVE_FLETCHING_TABLE = registerFletchingTable("ru_mauve_fletching_table");
        RU_ORANGE_PAINTED_FLETCHING_TABLE = registerFletchingTable("ru_orange_painted_fletching_table");
        RU_PALM_FLETCHING_TABLE = registerFletchingTable("ru_palm_fletching_table");
        RU_PINE_FLETCHING_TABLE = registerFletchingTable("ru_pine_fletching_table");
        RU_PINK_PAINTED_FLETCHING_TABLE = registerFletchingTable("ru_pink_painted_fletching_table");
        RU_PURPLE_PAINTED_FLETCHING_TABLE = registerFletchingTable("ru_purple_painted_fletching_table");
        RU_RED_PAINTED_FLETCHING_TABLE = registerFletchingTable("ru_red_painted_fletching_table");
        RU_REDWOOD_FLETCHING_TABLE = registerFletchingTable("ru_redwood_fletching_table");
        RU_WHITE_PAINTED_FLETCHING_TABLE = registerFletchingTable("ru_white_painted_fletching_table");
        RU_WILLOW_FLETCHING_TABLE = registerFletchingTable("ru_willow_fletching_table");
        RU_YELLOW_PAINTED_FLETCHING_TABLE = registerFletchingTable("ru_yellow_painted_fletching_table");

        RU_BLUE_BIOSHROOM_FLETCHING_TABLE = registerFletchingTable("ru_blue_bioshroom_fletching_table");
        RU_BRIMWOOD_FLETCHING_TABLE = registerFletchingTable("ru_brimwood_fletching_table");
        RU_COBALT_FLETCHING_TABLE = registerFletchingTable("ru_cobalt_fletching_table");
        RU_GREEN_BIOSHROOM_FLETCHING_TABLE = registerFletchingTable("ru_green_bioshroom_fletching_table");
        RU_KAPOK_FLETCHING_TABLE = registerFletchingTable("ru_kapok_fletching_table");
        RU_MAGNOLIA_FLETCHING_TABLE = registerFletchingTable("ru_magnolia_fletching_table");
        RU_PINK_BIOSHROOM_FLETCHING_TABLE = registerFletchingTable("ru_pink_bioshroom_fletching_table");
        RU_SOCOTRA_FLETCHING_TABLE = registerFletchingTable("ru_socotra_fletching_table");
        RU_YELLOW_BIOSHROOM_FLETCHING_TABLE = registerFletchingTable("ru_yellow_bioshroom_fletching_table");
    }

    public static Block register(String name, Block block) {
        Identifier identifier = Identifier.of(Initialise.MOD_ID, name);
        Registry.register(Registries.BLOCK, identifier, block);
        RU_FLETCHING_TABLES.put(identifier, block);
        Registry.register(Registries.ITEM, identifier, new BlockItem(block, new Item.Settings()));
        return block;
    }

    public static Block registerFletchingTable(String name) {
        return register(name, new FletchingTableBlock(AbstractBlock.Settings.copy(Blocks.FLETCHING_TABLE)));
    }
}