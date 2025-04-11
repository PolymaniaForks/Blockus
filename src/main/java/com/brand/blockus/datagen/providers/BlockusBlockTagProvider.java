package com.brand.blockus.datagen.providers;

import com.brand.blockus.Blockus;
import com.brand.blockus.registry.content.BlockusBlocks;
import com.brand.blockus.registry.content.bundles.*;
import com.brand.blockus.registry.tag.BlockusBlockTags;
import com.brand.blockus.utils.BlockChecker;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.fabricmc.fabric.api.tag.convention.v2.ConventionalBlockTags;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;

import static com.brand.blockus.registry.content.BlockusBlocks.*;

public class BlockusBlockTagProvider extends FabricTagProvider.BlockTagProvider {

    public BlockusBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    public FabricTagBuilder getOrCreateTagBuilder(Identifier id) {
        TagKey<Block> tag = TagKey.of(RegistryKeys.BLOCK, id);
        return this.getOrCreateTagBuilder(tag);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup registries) {
        this.getOrCreateTagBuilder(BlockusBlockTags.AMETHYST_BLOCKS)
            .add(bsswBundle(POLISHED_AMETHYST))
            .add(bsswBundle(AMETHYST_BRICKS))
            .add(CHISELED_AMETHYST)
            .add(AMETHYST_PILLAR)
            ;

        this.getOrCreateTagBuilder(BlockusBlockTags.ANDESITE_BLOCKS)
            .add(bsswBundle(ANDESITE_BRICKS))
            .add(HERRINGBONE_ANDESITE_BRICKS)
            .add(CHISELED_ANDESITE_BRICKS)
            .add(CRACKED_ANDESITE_BRICKS)
            .add(POLISHED_ANDESITE_PILLAR)
            .add(ANDESITE_CIRCULAR_PAVING);

        this.getOrCreateTagBuilder(BlockTags.VIBRATION_RESONATORS)
            .addOptionalTag(BlockusBlockTags.AMETHYST_BLOCKS);

        for (AsphaltBundle asphaltType : AsphaltBundle.values()) {
            this.getOrCreateTagBuilder(BlockusBlockTags.ASPHALT)
                .add(asphaltType.block)
                ;
        }

        this.getOrCreateTagBuilder(BlockusBlockTags.ASPHALT)
            .add(RAINBOW_ASPHALT);

        this.getOrCreateTagBuilder(BlockusBlockTags.BASALT_BLOCKS)
            .add(bsswBundle(ROUGH_BASALT))
            .add(bsswBundle(POLISHED_BASALT_BRICKS))
            .add(CHISELED_POLISHED_BASALT)
            .add(CRACKED_POLISHED_BASALT_BRICKS)
            .add(POLISHED_BASALT_PILLAR)
            .add(HERRINGBONE_POLISHED_BASALT_BRICKS)
            ;

        this.getOrCreateTagBuilder(BlockusBlockTags.BLACKSTONE_BLOCKS)
            .add(bsswBundle(POLISHED_BLACKSTONE_TILES))
            .add(POLISHED_BLACKSTONE_PILLAR)
            .add(HERRINGBONE_POLISHED_BLACKSTONE_BRICKS)
            .add(bsswBundle(CRIMSON_WARTY_BLACKSTONE_BRICKS))
            .add(bsswBundle(WARPED_WARTY_BLACKSTONE_BRICKS))
            .add(GOLD_DECORATED_POLISHED_BLACKSTONE)
            .add(STURDY_BLACKSTONE);

        this.getOrCreateTagBuilder(BlockusBlockTags.BLUESTONE)
            .add(bsswBundle(BLUESTONE))
            .add(BLUESTONE_PILLAR)
            .add(bsswBundle(BLUESTONE_BRICKS))
            .add(bsswBundle(BLUESTONE_TILES))
            .add(bsswBundle(POLISHED_BLUESTONE))
            .add(BLUESTONE_SQUARES)
            .add(bsswBundle(SMALL_BLUESTONE_BRICKS))
            .add(CHISELED_BLUESTONE)
            .add(CHISELED_BLUESTONE_PILLAR)
            .add(CHISELED_BLUESTONE_BRICKS)
            .add(BLUESTONE_LINES);

        this.getOrCreateTagBuilder(BlockusBlockTags.BRICKS_BLOCKS)
            .add(bsswBundle(LARGE_BRICKS))
            .add(HERRINGBONE_BRICKS)
            .add(bsswBundle(SOAKED_BRICKS))
            .add(HERRINGBONE_SOAKED_BRICKS)
            .add(bsswBundle(SANDY_BRICKS))
            .add(HERRINGBONE_SANDY_BRICKS)
            ;

        this.getOrCreateTagBuilder(BlockusBlockTags.CHOCOLATE_BLOCKS)
            .add(bsswBundle(CHOCOLATE_BLOCK))
            .add(bsswBundle(CHOCOLATE_BRICKS))
            .add(CHOCOLATE_SQUARES)
            .add(CHOCOLATE_TABLET);

        this.getOrCreateTagBuilder(BlockusBlockTags.COLORED_TILES)
            .add(WHITE_COLORED_TILES)
            .add(ORANGE_COLORED_TILES)
            .add(MAGENTA_COLORED_TILES)
            .add(LIGHT_BLUE_COLORED_TILES)
            .add(YELLOW_COLORED_TILES)
            .add(LIME_COLORED_TILES)
            .add(PINK_COLORED_TILES)
            .add(GRAY_COLORED_TILES)
            .add(LIGHT_GRAY_COLORED_TILES)
            .add(CYAN_COLORED_TILES)
            .add(PURPLE_COLORED_TILES)
            .add(BLUE_COLORED_TILES)
            .add(BROWN_COLORED_TILES)
            .add(GREEN_COLORED_TILES)
            .add(RED_COLORED_TILES)
            .add(BLACK_COLORED_TILES)
            .add(RAINBOW_COLORED_TILES);



        for (ConcreteBundle concreteType : ConcreteBundle.values()) {
            this.getOrCreateTagBuilder(BlockusBlockTags.CONCRETE_BLOCKS)
                .add(concreteType.block)
                ;
        }

        this.getOrCreateTagBuilder(BlockTags.CRYSTAL_SOUND_BLOCKS)
            .addOptionalTag(BlockusBlockTags.AMETHYST_BLOCKS);

        this.getOrCreateTagBuilder(BlockusBlockTags.DEEPSLATE_BLOCKS)
            .add(bsswBundle(MOSSY_DEEPSLATE_BRICKS))
            .add(HERRINGBONE_DEEPSLATE_BRICKS)
            .add(DEEPSLATE_PILLAR)
            .add(STURDY_DEEPSLATE);

        this.getOrCreateTagBuilder(BlockusBlockTags.DIORITE_BLOCKS)
            .add(bsswBundle(DIORITE_BRICKS))
            .add(HERRINGBONE_DIORITE_BRICKS)
            .add(CHISELED_DIORITE_BRICKS)
            .add(CRACKED_DIORITE_BRICKS)
            .add(POLISHED_DIORITE_PILLAR)
            ;

        this.getOrCreateTagBuilder(BlockusBlockTags.DRIPSTONE_BLOCKS)
            .add(bsswBundle(POLISHED_DRIPSTONE))
            .add(bsswBundle(DRIPSTONE_BRICKS))
            .add(bsswBundle(MOSSY_DRIPSTONE_BRICKS))
            .add(CRACKED_DRIPSTONE_BRICKS)
            .add(CHISELED_DRIPSTONE)
            .add(DRIPSTONE_PILLAR);

        this.getOrCreateTagBuilder(BlockusBlockTags.END_STONE_BLOCKS)
            .add(CHISELED_END_STONE_BRICKS)
            .add(HERRINGBONE_END_STONE_BRICKS)
            .add(bsswBundle(POLISHED_END_STONE))
            .add(CRACKED_END_STONE_BRICKS)
            .add(END_STONE_PILLAR)
            .add(bsswBundle(SMALL_END_STONE_BRICKS))
            .add(PURPUR_DECORATED_END_STONE)
            .add(PHANTOM_PURPUR_DECORATED_END_STONE);

        this.getOrCreateTagBuilder(BlockusBlockTags.FOOD_CRATES)
            .add(SWEET_BERRIES_CRATE)
            .add(SALMON_CRATE)
            .add(PUFFERFISH_CRATE)
            .add(TROPICAL_FISH_CRATE)
            .add(COD_CRATE)
            .add(POTATO_CRATE)
            .add(APPLE_CRATE)
            .add(BEETROOT_CRATE)
            .add(CARROT_CRATE)
            .add(BREAD_BOX)
            .add(GOLDEN_APPLE_CRATE)
            .add(GOLDEN_CARROT_CRATE)
            .add(GLOW_BERRIES_CRATE)
            .addOptional(Blockus.id("blueberries_crate"));

        this.getOrCreateTagBuilder(BlockusBlockTags.FRAMED_PAPER_BLOCKS)
            .add(FRAMED_PAPER_BLOCK)
            ;


        this.getOrCreateTagBuilder(BlockusBlockTags.GRANITE_BLOCKS)
            .add(bsswBundle(GRANITE_BRICKS))
            .add(HERRINGBONE_GRANITE_BRICKS)
            .add(CHISELED_GRANITE_BRICKS)
            .add(CRACKED_GRANITE_BRICKS)
            .add(POLISHED_GRANITE_PILLAR)
            ;

        this.getOrCreateTagBuilder(BlockusBlockTags.HONEYCOMB_BLOCKS)
            .add(bsswBundle(HONEYCOMB_BRICKS));

        this.getOrCreateTagBuilder(BlockusBlockTags.ICE_BRICKS)
            .add(ICE_BRICKS)
            .add(ICE_PILLAR);


        this.getOrCreateTagBuilder(BlockusBlockTags.LAVA_BRICKS)
            .add(bsswBundle(LAVA_BRICKS))
            .add(CHISELED_LAVA_BRICKS);

        this.getOrCreateTagBuilder(BlockusBlockTags.LAVA_POLISHED_BLACKSTONE_BRICKS)
            .add(bsswBundle(LAVA_POLISHED_BLACKSTONE_BRICKS))
            .add(CHISELED_LAVA_POLISHED_BLACKSTONE);

        this.getOrCreateTagBuilder(BlockusBlockTags.LIMESTONE)
            .add(bsswBundle(LIMESTONE))
            .add(bsswBundle(POLISHED_LIMESTONE))
            .add(bsswBundle(LIMESTONE_BRICKS))
            .add(bsswBundle(LIMESTONE_TILES))
            .add(LIMESTONE_PILLAR)
            .add(LIMESTONE_SQUARES)
            .add(bsswBundle(SMALL_LIMESTONE_BRICKS))
            .add(CHISELED_LIMESTONE)
            .add(CHISELED_LIMESTONE_PILLAR)
            .add(CHISELED_LIMESTONE_BRICKS)
            .add(LIMESTONE_LINES)
            ;

        this.getOrCreateTagBuilder(BlockusBlockTags.VIRIDITE)
            .add(bsswBundle(VIRIDITE))
            .add(bsswBundle(POLISHED_VIRIDITE))
            .add(bsswBundle(VIRIDITE_BRICKS))
            .add(bsswBundle(VIRIDITE_TILES))
            .add(VIRIDITE_PILLAR)
            .add(VIRIDITE_SQUARES)
            .add(bsswBundle(SMALL_VIRIDITE_BRICKS))
            .add(CHISELED_VIRIDITE)
            .add(CHISELED_VIRIDITE_PILLAR)
            .add(CHISELED_VIRIDITE_BRICKS)
            .add(VIRIDITE_LINES);

        this.getOrCreateTagBuilder(BlockusBlockTags.MAGMA_BRICKS)
            .add(bsswBundle(MAGMA_BRICKS))
            .add(bsswBundle(SMALL_MAGMA_BRICKS))
            .add(CHISELED_MAGMA_BRICKS);

        this.getOrCreateTagBuilder(BlockusBlockTags.MARBLE)
            .add(bsswBundle(MARBLE))
            .add(bsswBundle(POLISHED_MARBLE))
            .add(bsswBundle(MARBLE_BRICKS))
            .add(bsswBundle(MARBLE_TILES))
            .add(MARBLE_PILLAR)
            .add(MARBLE_SQUARES)
            .add(bsswBundle(SMALL_MARBLE_BRICKS))
            .add(CHISELED_MARBLE_PILLAR)
            .add(CHISELED_MARBLE_BRICKS)
            .add(CHISELED_MARBLE)
            .add(MARBLE_LINES)
            ;

        this.getOrCreateTagBuilder(BlockusBlockTags.NETHER_BRICKS)
            .add(bsswBundle(POLISHED_NETHER_BRICKS))
            .add(bsswBundle(POLISHED_RED_NETHER_BRICKS))
            .add(HERRINGBONE_NETHER_BRICKS)
            .add(HERRINGBONE_RED_NETHER_BRICKS)
            .add(NETHER_BRICK_PILLAR)
            .add(RED_NETHER_BRICK_PILLAR)
            ;

        this.getOrCreateTagBuilder(BlockusBlockTags.OBSIDIAN)
            .add(bsswBundle(OBSIDIAN_BRICKS))
            .add(CRACKED_OBSIDIAN_BRICKS)
            .add(bsswBundle(SMALL_OBSIDIAN_BRICKS))
            .add(OBSIDIAN_PILLAR)
            .add(GLOWING_OBSIDIAN)
            ;

        this.getOrCreateTagBuilder(BlockusBlockTags.ALL_PATTERNED_WOOLS)
            .addOptionalTag(BlockusBlockTags.PATTERNED_WOOL);

        for (WoolBundle woolBundle : WoolBundle.values()) {
            this.getOrCreateTagBuilder(BlockusBlockTags.PATTERNED_WOOL)
                .add(woolBundle.block);
            this.getOrCreateTagBuilder(BlockusBlockTags.PATTERNED_CARPETS)
                .add(woolBundle.carpet);
            this.getOrCreateTagBuilder(BlockusBlockTags.ALL_PATTERNED_WOOLS)
                .add(woolBundle.stairs)
                .add(woolBundle.slab);
        }

        this.getOrCreateTagBuilder(BlockusBlockTags.PHANTOM_PURPUR_BLOCKS)
            .add(bsswBundle(PHANTOM_PURPUR_BLOCK))
            .add(PHANTOM_PURPUR_PILLAR)
            .add(bsswBundle(PHANTOM_PURPUR_BRICKS))
            .add(bsswBundle(POLISHED_PHANTOM_PURPUR))
            .add(PHANTOM_PURPUR_SQUARES)
            .add(bsswBundle(SMALL_PHANTOM_PURPUR_BRICKS))
            .add(CHISELED_PHANTOM_PURPUR)
            .add(PHANTOM_PURPUR_LINES);

        this.getOrCreateTagBuilder(BlockusBlockTags.PLATINGS)
            .add(bsswBundle(IRON_PLATING))
            .add(bsswBundle(GOLD_PLATING));

        this.getOrCreateTagBuilder(BlockusBlockTags.PRISMARINE_BLOCKS)
            .add(CHISELED_DARK_PRISMARINE)
            .add(DARK_PRISMARINE_PILLAR)
            .add(CHISELED_PRISMARINE)
            .add(PRISMARINE_PILLAR)
            .add(bsswBundle(PRISMARINE_TILES));

        this.getOrCreateTagBuilder(BlockusBlockTags.PURPUR_BLOCKS)
            .add(bsswBundle(PURPUR_BRICKS))
            .add(bsswBundle(POLISHED_PURPUR))
            .add(PURPUR_SQUARES)
            .add(bsswBundle(SMALL_PURPUR_BRICKS))
            .add(CHISELED_PURPUR)
            .add(PURPUR_LINES)
            .addOptionalTag(BlockusBlockTags.PHANTOM_PURPUR_BLOCKS);

        this.getOrCreateTagBuilder(BlockusBlockTags.RAINBOW_BLOCKS)
            .add(RAINBOW_BLOCK)
            .add(bsswBundle(RAINBOW_BRICKS));

        this.getOrCreateTagBuilder(BlockusBlockTags.RED_SANDSTONE)
            .add(bsswBundle(ROUGH_RED_SANDSTONE))
            .add(bsswBundle(RED_SANDSTONE_BRICKS))
            .add(bsswBundle(SMALL_RED_SANDSTONE_BRICKS))
            .add(GOLD_DECORATED_RED_SANDSTONE)
            .add(LAPIS_DECORATED_RED_SANDSTONE)
            .add(RED_SANDSTONE_PILLAR);

        this.getOrCreateTagBuilder(BlockusBlockTags.RESIN_BLOCKS)
            .add(bsswBundle(LARGE_RESIN_BRICKS))
            .add(HERRINGBONE_RESIN_BRICKS)
            .add(RESIN_BRICK_PILLAR);

        this.getOrCreateTagBuilder(BlockusBlockTags.SANDSTONE)
            .add(bsswBundle(ROUGH_SANDSTONE))
            .add(bsswBundle(SANDSTONE_BRICKS))
            .add(bsswBundle(SMALL_SANDSTONE_BRICKS))
            .add(GOLD_DECORATED_SANDSTONE)
            .add(LAPIS_DECORATED_SANDSTONE)
            .add(SANDSTONE_PILLAR);

        this.getOrCreateTagBuilder(BlockusBlockTags.SCULK_BLOCKS)
            .add(bsswBundle(POLISHED_SCULK))
            .add(bsswBundle(SCULK_BRICKS))
            .add(CHISELED_SCULK_BRICKS)
            .add(SCULK_PILLAR);

        for (WoodenPostBundle woodenPost : WoodenPostBundle.values()) {
            this.getOrCreateTagBuilder(BlockusBlockTags.WOODEN_POSTS)
                .add(woodenPost.block)
                .add(woodenPost.stripped);
        }

        this.getOrCreateTagBuilder(BlockusBlockTags.SNOW_BRICKS)
            .add(bsswBundle(SNOW_BRICKS))
            .add(SNOW_PILLAR);

        this.getOrCreateTagBuilder(BlockusBlockTags.SOUL_SANDSTONE)
            .add(bsswBundle(SOUL_SANDSTONE))
            .add(bsswBundle(ROUGH_SOUL_SANDSTONE))
            .add(bsswBundle(SMOOTH_SOUL_SANDSTONE))
            .add(bsswBundle(SOUL_SANDSTONE_BRICKS))
            .add(bsswBundle(SMALL_SOUL_SANDSTONE_BRICKS))
            .add(CUT_SOUL_SANDSTONE)
            .add(CHISELED_SOUL_SANDSTONE)
            .add(GOLD_DECORATED_SOUL_SANDSTONE)
            .add(LAPIS_DECORATED_SOUL_SANDSTONE)
            .add(SOUL_SANDSTONE_PILLAR);

        this.getOrCreateTagBuilder(BlockusBlockTags.SOUL_SOILS)
            .add(Blocks.SOUL_SAND)
            .add(Blocks.SOUL_SOIL);

        this.getOrCreateTagBuilder(BlockusBlockTags.STAINED_STONE_BRICKS)
            .add(bsswBundle(WHITE_STONE_BRICKS))
            .add(bsswBundle(ORANGE_STONE_BRICKS))
            .add(bsswBundle(MAGENTA_STONE_BRICKS))
            .add(bsswBundle(LIGHT_BLUE_STONE_BRICKS))
            .add(bsswBundle(YELLOW_STONE_BRICKS))
            .add(bsswBundle(LIME_STONE_BRICKS))
            .add(bsswBundle(PINK_STONE_BRICKS))
            .add(bsswBundle(GRAY_STONE_BRICKS))
            .add(bsswBundle(CYAN_STONE_BRICKS))
            .add(bsswBundle(PURPLE_STONE_BRICKS))
            .add(bsswBundle(BLUE_STONE_BRICKS))
            .add(bsswBundle(BROWN_STONE_BRICKS))
            .add(bsswBundle(GREEN_STONE_BRICKS))
            .add(bsswBundle(RED_STONE_BRICKS))
            .add(bsswBundle(BLACK_STONE_BRICKS));

        this.getOrCreateTagBuilder(BlockusBlockTags.STONE_BLOCKS)
            .add(bsswBundle(STONE_TILES))
            .add(STONE_BRICK_PILLAR)
            .add(HERRINGBONE_STONE_BRICKS)
            .add(STURDY_STONE);


        this.getOrCreateTagBuilder(BlockusBlockTags.THATCH)
            .add(bsswBundle(THATCH));


        for (TimberFrameBundle timberFrameBundle : TimberFrameBundle.values()) {
            this.getOrCreateTagBuilder(BlockusBlockTags.TIMBER_FRAMES)
                .add(timberFrameBundle.block)
                .add(timberFrameBundle.diagonal)
                .add(timberFrameBundle.cross);

            this.getOrCreateTagBuilder(BlockusBlockTags.WOODEN_LATTICES)
                .add(timberFrameBundle.lattice);

            this.getOrCreateTagBuilder(BlockusBlockTags.WOODEN_GRATES)
                .add(timberFrameBundle.grate);
        }

        this.getOrCreateTagBuilder(BlockusBlockTags.TUFF_BLOCKS)
            .add(bsswBundle(MOSSY_TUFF_BRICKS))
            .add(bsswBundle(TUFF_TILES))
            .add(CRACKED_TUFF_BRICKS)
            .add(CARVED_TUFF_BRICKS)
            .add(HERRINGBONE_TUFF_BRICKS)
            .add(TUFF_PILLAR)
            ;

        this.getOrCreateTagBuilder(BlockusBlockTags.WARPED_NETHER_GRASS)
            .add(Blocks.NETHER_SPROUTS)
            .add(Blocks.WARPED_ROOTS);

        this.getOrCreateTagBuilder(BlockusBlockTags.WATER_BRICKS)
            .add(bsswBundle(WATER_BRICKS))
            .add(CHISELED_WATER_BRICKS);

        this.getOrCreateTagBuilder(BlockusBlockTags.WHITE_OAK_LOGS)
            .add(WHITE_OAK_LOG)
            .add(WHITE_OAK_WOOD)
            .add(STRIPPED_WHITE_OAK_LOG)
            .add(STRIPPED_WHITE_OAK_WOOD)
            ;

        for (BSSWBundle block : BSSWBundle.values()) {
            if (BlockChecker.isWoodenMosaic(block.type, BlockChecker.WOODS)) {
                this.getOrCreateTagBuilder(BlockusBlockTags.ALL_WOODEN_MOSAICS)
                    .add(block.block)
                    ;
            }
            if (BlockChecker.isMossyPlanks(block.type, BlockChecker.WOODS)) {
                this.getOrCreateTagBuilder(BlockusBlockTags.ALL_MOSSY_PLANKS)
                    .add(block.block)
                    ;
            }
        }

        this.getOrCreateTagBuilder(BlockusBlockTags.ALL_WOODEN_MOSAICS)
            .add(Blocks.BAMBOO_MOSAIC)
            .add(Blocks.BAMBOO_MOSAIC_STAIRS)
            .add(Blocks.BAMBOO_MOSAIC_SLAB);

        for (BSSWBundle block : BSSWBundle.values()) {
            if (BlockChecker.isWoodenMosaic(block.type, BlockChecker.FLAMMABLE_WOODS) || BlockChecker.isMossyPlanks(block.type, BlockChecker.FLAMMABLE_WOODS)) {
                this.getOrCreateTagBuilder(Identifier.of("c", "planks_that_burn"))
                    .add(block.block);
            }
        }

        for (CopperBundle copperBundle : CopperBundle.values()) {
            for (Block block : copperBundle.all()) {
                if (block.toString().contains("tuff")) {
                    this.getOrCreateTagBuilder(BlockusBlockTags.TUFF_BLOCKS)
                        .add(block);
                } else {
                    this.getOrCreateTagBuilder(BlockusBlockTags.COPPER_BLOCKS)
                        .add(block);
                }
            }
        }

        this.getOrCreateTagBuilder(Identifier.of("c", "planks_that_burn"))
            .add(Blocks.OAK_PLANKS)
            .add(Blocks.SPRUCE_PLANKS)
            .add(Blocks.BIRCH_PLANKS)
            .add(Blocks.JUNGLE_PLANKS)
            .add(Blocks.ACACIA_PLANKS)
            .add(Blocks.DARK_OAK_PLANKS)
            .add(Blocks.MANGROVE_PLANKS)
            .add(Blocks.CHERRY_PLANKS)
            .add(Blocks.PALE_OAK_PLANKS)
            .add(Blocks.BAMBOO_PLANKS)


            .add(HERRINGBONE_OAK_PLANKS)
            .add(HERRINGBONE_BIRCH_PLANKS)
            .add(HERRINGBONE_SPRUCE_PLANKS)
            .add(HERRINGBONE_JUNGLE_PLANKS)
            .add(HERRINGBONE_ACACIA_PLANKS)
            .add(HERRINGBONE_DARK_OAK_PLANKS)
            .add(HERRINGBONE_MANGROVE_PLANKS)
            .add(HERRINGBONE_CHERRY_PLANKS)
            .add(HERRINGBONE_BAMBOO_PLANKS)
            .add(HERRINGBONE_PALE_OAK_PLANKS);

        // Vanilla Block Tags
        this.getOrCreateTagBuilder(BlockTags.AXE_MINEABLE)
            .add(SOUL_O_LANTERN)
            .addOptionalTag(BlockusBlockTags.FRAMED_PAPER_BLOCKS)
            .addOptionalTag(BlockusBlockTags.TIMBER_FRAMES)
            .addOptionalTag(BlockusBlockTags.WOODEN_LATTICES)
            .addOptionalTag(BlockusBlockTags.WOODEN_GRATES)
            .addOptionalTag(BlockusBlockTags.FOOD_CRATES)
            .addOptionalTag(BlockusBlockTags.ALL_WOODEN_MOSAICS)
            .addOptionalTag(BlockusBlockTags.ALL_MOSSY_PLANKS)
            .addOptionalTag(BlockusBlockTags.WOODEN_POSTS);

        this.getOrCreateTagBuilder(BlockTags.HOE_MINEABLE)
            .add(ROTTEN_FLESH_BLOCK)
            .add(CHORUS_BLOCK)
            .add(WHITE_OAK_LEAVES)
            .addOptionalTag(BlockusBlockTags.THATCH)
            .addOptionalTag(BlockusBlockTags.SMALL_HEDGES);

        this.getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
            .add(CHARCOAL_BLOCK)
            .add(ENDER_BLOCK)
            .add(NETHER_STAR_BLOCK)
            .add(LOVE_BLOCK)
            .add(WEIGHT_STORAGE_CUBE)
            .add(COMPANION_CUBE)
            .add(CAUTION_BLOCK)
            .add(STARS_BLOCK)
            .add(LANTERN_BLOCK)
            .add(SOUL_LANTERN_BLOCK)
            .add(bsswBundle(CRIMSON_WART_BRICKS))
            .add(bsswBundle(WARPED_WART_BRICKS))
            .add(bsswBundle(NETHER_TILES))
            .add(bsswBundle(END_TILES))
            .add(CHISELED_MUD_BRICKS)
            .add(MUD_BRICK_PILLAR)
            .addOptionalTag(BlockusBlockTags.AMETHYST_BLOCKS)
            .addOptionalTag(BlockusBlockTags.OBSIDIAN)
            .addOptionalTag(BlockusBlockTags.STAINED_STONE_BRICKS)
            .addOptionalTag(BlockusBlockTags.MARBLE)
            .addOptionalTag(BlockusBlockTags.LIMESTONE)
            .addOptionalTag(BlockusBlockTags.BLUESTONE)
            .addOptionalTag(BlockusBlockTags.VIRIDITE)
            .addOptionalTag(BlockusBlockTags.PURPUR_BLOCKS)
            .addOptionalTag(BlockusBlockTags.QUARTZ_BLOCKS)
            .addOptionalTag(BlockusBlockTags.SANDSTONE)
            .addOptionalTag(BlockusBlockTags.RED_SANDSTONE)
            .addOptionalTag(BlockusBlockTags.SOUL_SANDSTONE)
            .addOptionalTag(BlockusBlockTags.STONE_BLOCKS)
            .addOptionalTag(BlockusBlockTags.ANDESITE_BLOCKS)
            .addOptionalTag(BlockusBlockTags.DIORITE_BLOCKS)
            .addOptionalTag(BlockusBlockTags.GRANITE_BLOCKS)
            .addOptionalTag(BlockusBlockTags.BLACKSTONE_BLOCKS)
            .addOptionalTag(BlockusBlockTags.BASALT_BLOCKS)
            .addOptionalTag(BlockusBlockTags.LAVA_BRICKS)
            .addOptionalTag(BlockusBlockTags.LAVA_POLISHED_BLACKSTONE_BRICKS)
            .addOptionalTag(BlockusBlockTags.WATER_BRICKS)
            .addOptionalTag(BlockusBlockTags.SNOW_BRICKS)
            .addOptionalTag(BlockusBlockTags.ICE_BRICKS)
            .addOptionalTag(BlockusBlockTags.MAGMA_BRICKS)
            .addOptionalTag(BlockusBlockTags.BLAZE_BRICKS)
            .addOptionalTag(BlockusBlockTags.NETHERRACK_BLOCKS)
            .addOptionalTag(BlockusBlockTags.NETHER_BRICKS)
            .addOptionalTag(BlockusBlockTags.PRISMARINE_BLOCKS)
            .addOptionalTag(BlockusBlockTags.BRICKS_BLOCKS)
            .addOptionalTag(BlockusBlockTags.HONEYCOMB_BLOCKS)
            .addOptionalTag(BlockusBlockTags.END_STONE_BLOCKS)
            .addOptionalTag(BlockusBlockTags.RAINBOW_BLOCKS)
            .addOptionalTag(BlockusBlockTags.CONCRETE_BLOCKS)
            .addOptionalTag(BlockusBlockTags.DEEPSLATE_BLOCKS)
            .addOptionalTag(BlockusBlockTags.SCULK_BLOCKS)
            .addOptionalTag(BlockusBlockTags.TUFF_BLOCKS)
            .addOptionalTag(BlockusBlockTags.DRIPSTONE_BLOCKS)
            .addOptionalTag(BlockusBlockTags.CHOCOLATE_BLOCKS)
            .addOptionalTag(BlockusBlockTags.ASPHALT)
            .addOptionalTag(BlockusBlockTags.SHINGLES)
            .addOptionalTag(BlockusBlockTags.COLORED_TILES)
            .addOptionalTag(BlockusBlockTags.GLAZED_TERRACOTTA_PILLARS)
            .addOptionalTag(BlockusBlockTags.PLATINGS)
            .addOptionalTag(BlockusBlockTags.LARGE_FLOWER_POTS)
            .addOptionalTag(BlockusBlockTags.COPPER_BLOCKS)
            .addOptionalTag(BlockusBlockTags.RESIN_BLOCKS)
            .addOptionalTag(BlockTags.STONE_PRESSURE_PLATES)
            ;

        this.getOrCreateTagBuilder(BlockTags.SHOVEL_MINEABLE)
            .add(PATH)
            .add(SUGAR_BLOCK)
            .add(REDSTONE_SAND)
            .add(SUGAR_BLOCK);


        this.getOrCreateTagBuilder(BlockTags.BASE_STONE_OVERWORLD)
            .add(LIMESTONE.block)
            .add(MARBLE.block)
            .add(BLUESTONE.block)
            .add(VIRIDITE.block);

        this.getOrCreateTagBuilder(BlockTags.BEACON_BASE_BLOCKS)
            .add(NETHER_STAR_BLOCK)
            ;

        this.getOrCreateTagBuilder(BlockTags.DEEPSLATE_ORE_REPLACEABLES)
            .add(BLUESTONE.block)
            .add(VIRIDITE.block);

        this.getOrCreateTagBuilder(BlockTags.DRAGON_IMMUNE)
            .addOptionalTag(BlockusBlockTags.OBSIDIAN)
            .add(NETHER_STAR_BLOCK);


        this.getOrCreateTagBuilder(BlockTags.FLOWER_POTS)
            .add(POTTED_WHITE_OAK_SAPLING)
            .add(POTTED_RAINBOW_ROSE)
            ;

        this.getOrCreateTagBuilder(BlockTags.GUARDED_BY_PIGLINS)
            .add(GOLD_DECORATED_SANDSTONE)
            .add(GOLD_DECORATED_RED_SANDSTONE)
            .add(GOLD_DECORATED_SOUL_SANDSTONE)
            .add(GOLD_DECORATED_POLISHED_BLACKSTONE)
            .add(bsswBundle(GOLD_PLATING))
            .add(GOLDEN_APPLE_CRATE)
            .add(GOLDEN_CARROT_CRATE);

        this.getOrCreateTagBuilder(BlockTags.ICE)
            .addOptionalTag(BlockusBlockTags.ICE_BRICKS)
            ;

        this.getOrCreateTagBuilder(BlockTags.IMPERMEABLE)
            .addOptionalTag(BlockusBlockTags.BEVELED_GLASS)
            .addOptionalTag(BlockusBlockTags.NEON);

        this.getOrCreateTagBuilder(BlockTags.INFINIBURN_OVERWORLD)
            .addOptionalTag(BlockusBlockTags.NETHERRACK_BLOCKS)
            .addOptionalTag(BlockusBlockTags.MAGMA_BRICKS)
            .add(CHARCOAL_BLOCK);

        this.getOrCreateTagBuilder(BlockTags.JUNGLE_LOGS)
            ;

        this.getOrCreateTagBuilder(BlockTags.LEAVES)
            .add(WHITE_OAK_LEAVES)
            ;

        this.getOrCreateTagBuilder(BlockTags.LOGS_THAT_BURN)
            .addOptionalTag(BlockusBlockTags.WHITE_OAK_LOGS)
            ;

        this.getOrCreateTagBuilder(BlockTags.MANGROVE_LOGS)
            ;

        this.getOrCreateTagBuilder(BlockTags.NEEDS_DIAMOND_TOOL)
            .addOptionalTag(BlockusBlockTags.OBSIDIAN)
            ;

        this.getOrCreateTagBuilder(BlockTags.NEEDS_IRON_TOOL)
            .add(NETHER_STAR_BLOCK);

        this.getOrCreateTagBuilder(BlockTags.NEEDS_STONE_TOOL)
            .add(ENDER_BLOCK)
            ;


        this.getOrCreateTagBuilder(BlockTags.OVERWORLD_NATURAL_LOGS)
            .add(WHITE_OAK_LOG);

        this.getOrCreateTagBuilder(BlockTags.PIGLIN_REPELLENTS)
            .add(SOUL_LANTERN_BLOCK)
            .add(SOUL_O_LANTERN);

        this.getOrCreateTagBuilder(BlockTags.PLANKS)
            .add(HERRINGBONE_OAK_PLANKS)
            .add(HERRINGBONE_BIRCH_PLANKS)
            .add(HERRINGBONE_SPRUCE_PLANKS)
            .add(HERRINGBONE_JUNGLE_PLANKS)
            .add(HERRINGBONE_ACACIA_PLANKS)
            .add(HERRINGBONE_DARK_OAK_PLANKS)
            .add(HERRINGBONE_MANGROVE_PLANKS)
            .add(HERRINGBONE_CHERRY_PLANKS)
            .add(HERRINGBONE_BAMBOO_PLANKS)
            .add(HERRINGBONE_CRIMSON_PLANKS)
            .add(HERRINGBONE_WARPED_PLANKS)
            .add(HERRINGBONE_PALE_OAK_PLANKS);

        this.getOrCreateTagBuilder(BlockTags.SAPLINGS)
            .add(WHITE_OAK_SAPLING);

        this.getOrCreateTagBuilder(BlockTags.SMALL_FLOWERS)
            .add(RAINBOW_ROSE)
            ;

        this.getOrCreateTagBuilder(BlockTags.BEE_ATTRACTIVE)
            .add(RAINBOW_ROSE)
            ;


        this.getOrCreateTagBuilder(BlockTags.SOUL_FIRE_BASE_BLOCKS)
            .addOptionalTag(BlockusBlockTags.SOUL_SANDSTONE)
            .addOptionalTag(BlockusBlockTags.PHANTOM_PURPUR_BLOCKS);

        this.getOrCreateTagBuilder(BlockTags.SOUL_SPEED_BLOCKS)
            .addOptionalTag(BlockusBlockTags.SOUL_SANDSTONE)
            ;

        this.getOrCreateTagBuilder(BlockTags.STONE_ORE_REPLACEABLES)
            .add(LIMESTONE.block)
            .add(MARBLE.block);

        this.getOrCreateTagBuilder(BlockTags.WOOL)
            .addOptionalTag(BlockusBlockTags.ALL_PATTERNED_WOOLS);

        this.getOrCreateTagBuilder(BlockTags.WOOL_CARPETS)
            .addOptionalTag(BlockusBlockTags.PATTERNED_CARPETS);

//        this.getOrCreateTagBuilder(new Identifier("promenade", "cherry_oak_logs"))
//            .addOptional(Blockus.id("cherry_oak_small_logs"));
//
//        this.getOrCreateTagBuilder(new Identifier("promenade", "dark_amaranth_stems"))
//            .addOptional(Blockus.id("dark_amaranth_small_stems"));
//
//        this.getOrCreateTagBuilder(new Identifier("promenade", "leaf_piles"))
//            .addOptional(Blockus.id("white_oak_leaf_pile"));
//
//        this.getOrCreateTagBuilder(new Identifier("promenade", "palm_logs"))
//            .addOptional(Blockus.id("palm_small_logs"));
//
//        this.getOrCreateTagBuilder(new Identifier("promenade", "maple_logs"))
//            .addOptional(Blockus.id("maple_small_logs"));

        // Conventional Block Tags
        this.getOrCreateTagBuilder(ConventionalBlockTags.GLASS_BLOCKS)
            .addOptionalTag(BlockusBlockTags.BEVELED_GLASS);

        this.getOrCreateTagBuilder(ConventionalBlockTags.SMALL_FLOWERS)
            .add(RAINBOW_ROSE);
    }

    public static Block[] bsswBundle(BSSWBundle block) {
        // Block, stairs & slab & wall (if exist) variants of a block
        List<Block> list = new ArrayList<>();
        list.add(block.block);

        return list.toArray(new Block[0]);
    }

    public static Block[] bssBundle(BSSWBundle block) {
        // Block, stairs & slab variants of a block
        return new Block[]{block.block};
    }
}
