package net.xanthian.variantfletchingtables.utils;

import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;
import net.xanthian.variantfletchingtables.Initialise;

public class ModItemTags {

    public static final TagKey<Item> FLETCHING_TABLES = register();

    private ModItemTags() {
    }

    private static TagKey<Item> register() {
        return TagKey.of(RegistryKeys.ITEM, Identifier.of(Initialise.MOD_ID, "fletching_tables"));
    }
}