package net.xanthian.variantfletchingtables.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;

import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

import net.xanthian.variantfletchingtables.block.FletchingTables;

import java.util.concurrent.CompletableFuture;

import static net.xanthian.variantfletchingtables.Initialise.MOD_ID;

public class ItemTagGenerator extends FabricTagProvider.ItemTagProvider {
    public ItemTagGenerator(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

        private static final TagKey<Item> FLETCHINGTABLES = TagKey.of(Registries.ITEM.getKey(), new Identifier(MOD_ID,"fletchingtables"));
        private static final TagKey<Item> NON_FLAMMABLE_WOOD = TagKey.of(Registries.ITEM.getKey(), new Identifier("minecraft:non_flammable_wood"));
        private static final TagKey<Item> JOB_SITE = TagKey.of(Registries.ITEM.getKey(), new Identifier("c:villager_job_sites"));

        @Override
        protected void configure (RegistryWrapper.WrapperLookup arg){

            getOrCreateTagBuilder(FLETCHINGTABLES)
                    .add(Item.fromBlock(FletchingTables.ACACIA_FLETCHING_TABLE))
                    .add(Item.fromBlock(FletchingTables.BAMBOO_FLETCHING_TABLE))
                    .add(Item.fromBlock(FletchingTables.CHERRY_FLETCHING_TABLE))
                    .add(Item.fromBlock(FletchingTables.CRIMSON_FLETCHING_TABLE))
                    .add(Item.fromBlock(FletchingTables.DARK_OAK_FLETCHING_TABLE))
                    .add(Item.fromBlock(FletchingTables.JUNGLE_FLETCHING_TABLE))
                    .add(Item.fromBlock(FletchingTables.MANGROVE_FLETCHING_TABLE))
                    .add(Item.fromBlock(FletchingTables.OAK_FLETCHING_TABLE))
                    .add(Item.fromBlock(FletchingTables.SPRUCE_FLETCHING_TABLE))
                    .add(Item.fromBlock(FletchingTables.WARPED_FLETCHING_TABLE));

            getOrCreateTagBuilder(NON_FLAMMABLE_WOOD)
                    .add(Item.fromBlock(FletchingTables.CRIMSON_FLETCHING_TABLE))
                    .add(Item.fromBlock(FletchingTables.WARPED_FLETCHING_TABLE));

            getOrCreateTagBuilder(JOB_SITE)
                    .addTag(FLETCHINGTABLES);
        }
    }