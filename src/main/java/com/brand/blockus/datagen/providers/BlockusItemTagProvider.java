package com.brand.blockus.datagen.providers;

import com.brand.blockus.registry.content.BlockusEntities;
import com.brand.blockus.registry.content.bundles.BSSWBundle;
import com.brand.blockus.registry.tag.BlockusBlockTags;
import com.brand.blockus.registry.tag.BlockusItemTags;
import com.brand.blockus.utils.BlockChecker;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.fabricmc.fabric.api.tag.convention.v2.ConventionalBlockTags;
import net.fabricmc.fabric.api.tag.convention.v2.ConventionalItemTags;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.registry.tag.ItemTags;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

import java.util.concurrent.CompletableFuture;

import static com.brand.blockus.registry.content.BlockusBlocks.*;

public class BlockusItemTagProvider extends FabricTagProvider.ItemTagProvider {
    public BlockusItemTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture, BlockTagProvider blockTagProvider) {
        super(output, registriesFuture, blockTagProvider);
    }

    private void copy(Identifier id) {
        TagKey<Block> blockTag = TagKey.of(RegistryKeys.BLOCK, id);
        TagKey<Item> itemTag = TagKey.of(RegistryKeys.ITEM, id);

        this.copy(blockTag, itemTag);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup registries) {

        this.copy(BlockusBlockTags.BARRIERS, BlockusItemTags.BARRIERS);

        this.copy(BlockTags.STONE_BUTTONS, ItemTags.STONE_BUTTONS);


        this.copy(BlockusBlockTags.PATTERNED_WOOL, BlockusItemTags.PATTERNED_WOOL);
        this.copy(BlockusBlockTags.PATTERNED_CARPETS, BlockusItemTags.PATTERNED_CARPETS);
        this.copy(BlockusBlockTags.ALL_PATTERNED_WOOLS, BlockusItemTags.ALL_PATTERNED_WOOLS);

        this.copy(BlockusBlockTags.SMALL_HEDGES, BlockusItemTags.SMALL_HEDGES);

        this.copy(BlockusBlockTags.SOUL_SOILS, BlockusItemTags.SOUL_SOILS);

        this.getOrCreateTagBuilder(BlockusItemTags.STAINED_STONE_BRICKS)
            .add(WHITE_STONE_BRICKS.block.asItem())
            .add(ORANGE_STONE_BRICKS.block.asItem())
            .add(MAGENTA_STONE_BRICKS.block.asItem())
            .add(LIGHT_BLUE_STONE_BRICKS.block.asItem())
            .add(YELLOW_STONE_BRICKS.block.asItem())
            .add(LIME_STONE_BRICKS.block.asItem())
            .add(PINK_STONE_BRICKS.block.asItem())
            .add(GRAY_STONE_BRICKS.block.asItem())
            .add(GRAY_STONE_BRICKS.block.asItem())
            .add(Items.STONE_BRICKS)
            .add(CYAN_STONE_BRICKS.block.asItem())
            .add(PURPLE_STONE_BRICKS.block.asItem())
            .add(BLUE_STONE_BRICKS.block.asItem())
            .add(BROWN_STONE_BRICKS.block.asItem())
            .add(GREEN_STONE_BRICKS.block.asItem())
            .add(RED_STONE_BRICKS.block.asItem())
            .add(BLACK_STONE_BRICKS.block.asItem());

        this.copy(BlockusBlockTags.WARPED_NETHER_GRASS, BlockusItemTags.WARPED_NETHER_GRASS);

        this.copy(BlockusBlockTags.WHITE_OAK_LOGS, BlockusItemTags.WHITE_OAK_LOGS);

        this.getOrCreateTagBuilder(BlockusItemTags.PLANKS_THAT_BURN)
            .add(Items.OAK_PLANKS)
            .add(Items.SPRUCE_PLANKS)
            .add(Items.BIRCH_PLANKS)
            .add(Items.JUNGLE_PLANKS)
            .add(Items.ACACIA_PLANKS)
            .add(Items.DARK_OAK_PLANKS)
            .add(Items.MANGROVE_PLANKS)
            .add(Items.CHERRY_PLANKS)
            .add(Items.PALE_OAK_PLANKS)
            .add(Items.BAMBOO_PLANKS)
            ;

        this.getOrCreateTagBuilder(BlockusItemTags.HERRINGBONE_PLANKS_THAT_BURN)
            .add(HERRINGBONE_OAK_PLANKS.asItem())
            .add(HERRINGBONE_BIRCH_PLANKS.asItem())
            .add(HERRINGBONE_SPRUCE_PLANKS.asItem())
            .add(HERRINGBONE_JUNGLE_PLANKS.asItem())
            .add(HERRINGBONE_ACACIA_PLANKS.asItem())
            .add(HERRINGBONE_DARK_OAK_PLANKS.asItem())
            .add(HERRINGBONE_MANGROVE_PLANKS.asItem())
            .add(HERRINGBONE_CHERRY_PLANKS.asItem())
            .add(HERRINGBONE_BAMBOO_PLANKS.asItem())
            .add(HERRINGBONE_PALE_OAK_PLANKS.asItem());


        for (BSSWBundle block : BSSWBundle.values()) {
            if (BlockChecker.isWoodenMosaic(block.type, BlockChecker.FLAMMABLE_WOODS)) {
                this.getOrCreateTagBuilder(BlockusItemTags.WOODEN_MOSAIC_THAT_BURN)
                    .add(block.block.asItem());
            }
        }
        this.getOrCreateTagBuilder(BlockusItemTags.WOODEN_MOSAIC_THAT_BURN)
            .add(Blocks.BAMBOO_MOSAIC.asItem());

        this.copy(Identifier.of("c", "planks_that_burn"));

        this.copy(BlockTags.ACACIA_LOGS, ItemTags.ACACIA_LOGS);

        this.copy(BlockTags.BIRCH_LOGS, ItemTags.BIRCH_LOGS);

        this.copy(BlockTags.CHERRY_LOGS, ItemTags.CHERRY_LOGS);

        this.copy(BlockTags.CRIMSON_STEMS, ItemTags.CRIMSON_STEMS);

        this.copy(BlockTags.DARK_OAK_LOGS, ItemTags.DARK_OAK_LOGS);

        this.copy(BlockTags.FENCE_GATES, ItemTags.FENCE_GATES);

        this.copy(BlockTags.BEE_ATTRACTIVE, ItemTags.BEE_FOOD);

        this.getOrCreateTagBuilder(BlockusItemTags.NATURAL_ICE)
            .add(Items.ICE)
            .add(Items.PACKED_ICE)
            .add(Items.BLUE_ICE);

        this.copy(BlockTags.JUNGLE_LOGS, ItemTags.JUNGLE_LOGS);

        this.copy(BlockTags.LEAVES, ItemTags.LEAVES);

        this.copy(BlockTags.LOGS_THAT_BURN, ItemTags.LOGS_THAT_BURN);

        this.copy(BlockTags.MANGROVE_LOGS, ItemTags.MANGROVE_LOGS);

        for (BSSWBundle block : BSSWBundle.values()) {
            if (BlockChecker.isWoodenMosaic(block.type, BlockChecker.NON_FLAMMABLE_WOODS) || BlockChecker.isMossyPlanks(block.type, BlockChecker.NON_FLAMMABLE_WOODS)) {
                this.getOrCreateTagBuilder(ItemTags.NON_FLAMMABLE_WOOD)
                    .add(block.block.asItem())
                    ;
            }
        }

        this.getOrCreateTagBuilder(ItemTags.NON_FLAMMABLE_WOOD)
            .add(HERRINGBONE_CRIMSON_PLANKS.asItem())
            .add(HERRINGBONE_WARPED_PLANKS.asItem())
        ;
        this.copy(BlockTags.OAK_LOGS, ItemTags.OAK_LOGS);

        this.getOrCreateTagBuilder(ItemTags.PIGLIN_LOVED)
            .add(GOLD_DECORATED_SANDSTONE.asItem())
            .add(GOLD_DECORATED_RED_SANDSTONE.asItem())
            .add(GOLD_DECORATED_SOUL_SANDSTONE.asItem())
            .add(GOLD_DECORATED_POLISHED_BLACKSTONE.asItem())
            .add(GOLD_PLATING.block.asItem())
            .add(GOLDEN_APPLE_CRATE.asItem())
            .add(GOLDEN_CARROT_CRATE.asItem());

        this.copy(BlockTags.PIGLIN_REPELLENTS, ItemTags.PIGLIN_REPELLENTS);

        this.copy(BlockTags.PLANKS, ItemTags.PLANKS);

        this.copy(BlockTags.SAPLINGS, ItemTags.SAPLINGS);

        this.copy(BlockTags.SMALL_FLOWERS, ItemTags.SMALL_FLOWERS);

        this.copy(BlockTags.SPRUCE_LOGS, ItemTags.SPRUCE_LOGS);


        this.copy(BlockTags.STAIRS, ItemTags.STAIRS);

        this.copy(BlockTags.SLABS, ItemTags.SLABS);

        this.copy(BlockTags.WALLS, ItemTags.WALLS);

        this.copy(BlockTags.WARPED_STEMS, ItemTags.WARPED_STEMS);

        this.copy(BlockTags.WOODEN_BUTTONS, ItemTags.WOODEN_BUTTONS);


        this.copy(BlockTags.WOODEN_FENCES, ItemTags.WOODEN_FENCES);

        this.copy(BlockTags.WOODEN_PRESSURE_PLATES, ItemTags.WOODEN_PRESSURE_PLATES);

        this.copy(BlockTags.WOODEN_SLABS, ItemTags.WOODEN_SLABS);

        this.copy(BlockTags.WOODEN_STAIRS, ItemTags.WOODEN_STAIRS);

        this.getOrCreateTagBuilder(ItemTags.WOOL)
            .addOptionalTag(BlockusItemTags.PATTERNED_WOOL);

        this.copy(BlockTags.WOOL_CARPETS, ItemTags.WOOL_CARPETS);
        this.copy(BlockTags.DIRT, ItemTags.DIRT);


//        this.copy(new Identifier("promenade", "cherry_oak_logs"));
//
//        this.copy(new Identifier("promenade", "dark_amaranth_stems"));
//
//        this.copy(new Identifier("promenade", "palm_logs"));

        // Conventional Item Tags
        this.copy(ConventionalBlockTags.SMALL_FLOWERS, ConventionalItemTags.SMALL_FLOWERS);

    }
}
