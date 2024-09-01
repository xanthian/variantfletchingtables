package net.xanthian.variantfletchingtables.utils;

import net.minecraft.block.Block;
import net.minecraft.data.client.TextureKey;
import net.minecraft.data.client.TextureMap;
import net.minecraft.util.Identifier;

public class ModTextureMap extends TextureMap {

    public static TextureMap fletchingTable(Block neswBlock, String plank) {
        return (new ModTextureMap())
                .put(TextureKey.PARTICLE, getSubId(neswBlock,"_front"))
                .put(TextureKey.DOWN, Identifier.of(plank))
                .put(TextureKey.UP, getSubId(neswBlock,"_top"))
                .put(TextureKey.NORTH, getSubId(neswBlock,"_front"))
                .put(TextureKey.SOUTH, getSubId(neswBlock,"_front"))
                .put(TextureKey.EAST, getSubId(neswBlock,"_side"))
                .put(TextureKey.WEST, getSubId(neswBlock, "_side"));
    }
}