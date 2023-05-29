package net.xanthian.variantfletchingtables.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;

import net.minecraft.block.Block;
import net.minecraft.registry.Registries;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

import net.xanthian.variantfletchingtables.block.FletchingTables;

import java.util.concurrent.CompletableFuture;

import static net.xanthian.variantfletchingtables.Initialise.MOD_ID;

public class BlockTagGenerator extends FabricTagProvider.BlockTagProvider {
    public BlockTagGenerator(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    private static final TagKey<Block> FLETCHINGTABLES = TagKey.of(Registries.BLOCK.getKey(), new Identifier(MOD_ID,"fletchingtables"));
    private static final TagKey<Block> MINEABLE_AXE = TagKey.of(Registries.BLOCK.getKey(), new Identifier("minecraft:mineable/axe"));
    private static final TagKey<Block> JOB_SITE = TagKey.of(Registries.BLOCK.getKey(), new Identifier("c:villager_job_sites"));

    @Override
    protected void configure (RegistryWrapper.WrapperLookup arg){

        getOrCreateTagBuilder(FLETCHINGTABLES)
                .add(FletchingTables.ACACIA_FLETCHING_TABLE)
                .add(FletchingTables.BAMBOO_FLETCHING_TABLE)
                .add(FletchingTables.CHERRY_FLETCHING_TABLE)
                .add(FletchingTables.CRIMSON_FLETCHING_TABLE)
                .add(FletchingTables.DARK_OAK_FLETCHING_TABLE)
                .add(FletchingTables.JUNGLE_FLETCHING_TABLE)
                .add(FletchingTables.MANGROVE_FLETCHING_TABLE)
                .add(FletchingTables.OAK_FLETCHING_TABLE)
                .add(FletchingTables.SPRUCE_FLETCHING_TABLE)
                .add(FletchingTables.WARPED_FLETCHING_TABLE);

        getOrCreateTagBuilder(MINEABLE_AXE)
                .addTag(FLETCHINGTABLES);

        getOrCreateTagBuilder(JOB_SITE)
                .addTag(FLETCHINGTABLES);

    }
}
