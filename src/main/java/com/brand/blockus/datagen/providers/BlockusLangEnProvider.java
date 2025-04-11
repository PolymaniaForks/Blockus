package com.brand.blockus.datagen.providers;

import com.brand.blockus.itemgroups.BlockusItemGroups;
import com.brand.blockus.registry.content.BlockusBlocks;
import com.brand.blockus.registry.content.BlockusEntities;
import com.brand.blockus.registry.content.bundles.*;
import com.brand.blockus.registry.effect.BlockusEffects;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class BlockusLangEnProvider extends FabricLanguageProvider {
    public BlockusLangEnProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(output, registryLookup);
    }

    @Override
    public void generateTranslations(RegistryWrapper.WrapperLookup registryLookup, TranslationBuilder translationBuilder) {

        translationBuilder.add(BlockusEffects.ASPHALT_SPRINT.value(), "Asphalt Sprint");
        translationBuilder.add(BlockusItemGroups.BLOCKUS_BUILDING_BLOCKS, "Building Blocks");
        translationBuilder.add(BlockusItemGroups.BLOCKUS_COLORED_BLOCKS, "Colored Blocks");
        translationBuilder.add(BlockusItemGroups.BLOCKUS_NATURAL, "Natural");
        translationBuilder.add(BlockusItemGroups.BLOCKUS_FUNCTIONAL_BLOCKS, "Functional Blocks");
        translationBuilder.add("blockitem.blockus.when_stepped_on", "When stepped on:");
        translationBuilder.add("blockitem.blockus.legacy", "Legacy");

        // Sandstone
        addBssw(translationBuilder, BlockusBlocks.ROUGH_SANDSTONE, "Rough Sandstone");
        addBssw(translationBuilder, BlockusBlocks.SANDSTONE_BRICKS, "Sandstone Bricks");
        addBssw(translationBuilder, BlockusBlocks.SMALL_SANDSTONE_BRICKS, "Small Sandstone Bricks");
        translationBuilder.add(BlockusBlocks.SANDSTONE_PILLAR, "Sandstone Pillar");
        addBssw(translationBuilder, BlockusBlocks.ROUGH_RED_SANDSTONE, "Rough Red Sandstone");
        addBssw(translationBuilder, BlockusBlocks.RED_SANDSTONE_BRICKS, "Red Sandstone Bricks");
        addBssw(translationBuilder, BlockusBlocks.SMALL_RED_SANDSTONE_BRICKS, "Small Red Sandstone Bricks");
        translationBuilder.add(BlockusBlocks.RED_SANDSTONE_PILLAR, "Red Sandstone Pillar");
        addBssw(translationBuilder, BlockusBlocks.SOUL_SANDSTONE, "Soul Sandstone");
        addBssw(translationBuilder, BlockusBlocks.SMOOTH_SOUL_SANDSTONE, "Smooth Soul Sandstone");
        addBssw(translationBuilder, BlockusBlocks.ROUGH_SOUL_SANDSTONE, "Rough Soul Sandstone");
        addBssw(translationBuilder, BlockusBlocks.SOUL_SANDSTONE_BRICKS, "Soul Sandstone Bricks");
        addBssw(translationBuilder, BlockusBlocks.SMALL_SOUL_SANDSTONE_BRICKS, "Small Soul Sandstone Bricks");
        translationBuilder.add(BlockusBlocks.CUT_SOUL_SANDSTONE, "Cut Soul Sandstone");
        translationBuilder.add(BlockusBlocks.CHISELED_SOUL_SANDSTONE, "Chiseled Soul Sandstone");
        translationBuilder.add(BlockusBlocks.SOUL_SANDSTONE_PILLAR, "Soul Sandstone Pillar");
        translationBuilder.add(BlockusBlocks.LAPIS_DECORATED_SANDSTONE, "Lapis-Decorated Sandstone");
        translationBuilder.add(BlockusBlocks.LAPIS_DECORATED_RED_SANDSTONE, "Lapis-Decorated Red Sandstone");
        translationBuilder.add(BlockusBlocks.LAPIS_DECORATED_SOUL_SANDSTONE, "Lapis-Decorated Soul Sandstone");
        translationBuilder.add(BlockusBlocks.GOLD_DECORATED_SANDSTONE, "Gold-Decorated Sandstone");
        translationBuilder.add(BlockusBlocks.GOLD_DECORATED_RED_SANDSTONE, "Gold-Decorated Red Sandstone");
        translationBuilder.add(BlockusBlocks.GOLD_DECORATED_SOUL_SANDSTONE, "Gold-Decorated Soul Sandstone");

        // Paper Blocks
        translationBuilder.add(BlockusBlocks.PAPER_BLOCK, "Paper Block");
        translationBuilder.add(BlockusBlocks.BURNT_PAPER_BLOCK, "Burnt Paper Block");
        translationBuilder.add(BlockusBlocks.FRAMED_PAPER_BLOCK, "Framed Paper Block");
        translationBuilder.add(BlockusBlocks.PAPER_LAMP, "Paper Lamp");

        // Stained Stone Bricks
        addBssw(translationBuilder, BlockusBlocks.WHITE_STONE_BRICKS, "White Stone Bricks");
        addBssw(translationBuilder, BlockusBlocks.ORANGE_STONE_BRICKS, "Orange Stone Bricks");
        addBssw(translationBuilder, BlockusBlocks.MAGENTA_STONE_BRICKS, "Magenta Stone Bricks");
        addBssw(translationBuilder, BlockusBlocks.LIGHT_BLUE_STONE_BRICKS, "Light Blue Stone Bricks");
        addBssw(translationBuilder, BlockusBlocks.YELLOW_STONE_BRICKS, "Yellow Stone Bricks");
        addBssw(translationBuilder, BlockusBlocks.LIME_STONE_BRICKS, "Lime Stone Bricks");
        addBssw(translationBuilder, BlockusBlocks.PINK_STONE_BRICKS, "Pink Stone Bricks");
        addBssw(translationBuilder, BlockusBlocks.GRAY_STONE_BRICKS, "Gray Stone Bricks");
        addBssw(translationBuilder, BlockusBlocks.CYAN_STONE_BRICKS, "Cyan Stone Bricks");
        addBssw(translationBuilder, BlockusBlocks.PURPLE_STONE_BRICKS, "Purple Stone Bricks");
        addBssw(translationBuilder, BlockusBlocks.BLUE_STONE_BRICKS, "Blue Stone Bricks");
        addBssw(translationBuilder, BlockusBlocks.BROWN_STONE_BRICKS, "Brown Stone Bricks");
        addBssw(translationBuilder, BlockusBlocks.GREEN_STONE_BRICKS, "Green Stone Bricks");
        addBssw(translationBuilder, BlockusBlocks.RED_STONE_BRICKS, "Red Stone Bricks");
        addBssw(translationBuilder, BlockusBlocks.BLACK_STONE_BRICKS, "Black Stone Bricks");



        // Basalt
        addBssw(translationBuilder, BlockusBlocks.ROUGH_BASALT, "Rough Basalt");
        addBssw(translationBuilder, BlockusBlocks.POLISHED_BASALT_BRICKS, "Polished Basalt Bricks");
        translationBuilder.add(BlockusBlocks.CRACKED_POLISHED_BASALT_BRICKS, "Cracked Polished Basalt Bricks");
        translationBuilder.add(BlockusBlocks.POLISHED_BASALT_PILLAR, "Polished Basalt Pillar");
        translationBuilder.add(BlockusBlocks.HERRINGBONE_POLISHED_BASALT_BRICKS, "Herringbone Polished Basalt Bricks");
        translationBuilder.add(BlockusBlocks.CHISELED_POLISHED_BASALT, "Chiseled Polished Basalt");

        // Prismarine
        translationBuilder.add(BlockusBlocks.DARK_PRISMARINE_PILLAR, "Dark Prismarine Pillar");
        translationBuilder.add(BlockusBlocks.CHISELED_DARK_PRISMARINE, "Chiseled Dark Prismarine");
        translationBuilder.add(BlockusBlocks.PRISMARINE_PILLAR, "Prismarine Pillar");
        translationBuilder.add(BlockusBlocks.CHISELED_PRISMARINE, "Chiseled Prismarine");
        addBssw(translationBuilder, BlockusBlocks.PRISMARINE_TILES, "Prismarine Tiles");

        // Blackstone
        addBssw(translationBuilder, BlockusBlocks.POLISHED_BLACKSTONE_TILES, "Polished Blackstone Tiles");
        addBssw(translationBuilder, BlockusBlocks.CRIMSON_WARTY_BLACKSTONE_BRICKS, "Crimson Warty Blackstone Bricks");
        addBssw(translationBuilder, BlockusBlocks.WARPED_WARTY_BLACKSTONE_BRICKS, "Warped Warty Blackstone Bricks");
        addBssw(translationBuilder, BlockusBlocks.LAVA_POLISHED_BLACKSTONE_BRICKS, "Lava Polished Blackstone Bricks");
        translationBuilder.add(BlockusBlocks.HERRINGBONE_POLISHED_BLACKSTONE_BRICKS, "Herringbone Polished Blackstone Bricks");
        translationBuilder.add(BlockusBlocks.POLISHED_BLACKSTONE_PILLAR, "Polished Blackstone Pillar");
        translationBuilder.add(BlockusBlocks.CHISELED_LAVA_POLISHED_BLACKSTONE, "Chiseled Lava Polished Blackstone");
        translationBuilder.add(BlockusBlocks.STURDY_BLACKSTONE, "Sturdy Blackstone");
        translationBuilder.add(BlockusBlocks.GOLD_DECORATED_POLISHED_BLACKSTONE, "Gold-Decorated Polished Blackstone");

        // Colored Tiles
        translationBuilder.add("block.blockus.colored_tiles", "Colored Tiles");
        translationBuilder.add(BlockusBlocks.WHITE_COLORED_TILES, "White Colored Tiles");
        translationBuilder.add(BlockusBlocks.ORANGE_COLORED_TILES, "Orange Colored Tiles");
        translationBuilder.add(BlockusBlocks.MAGENTA_COLORED_TILES, "Magenta Colored Tiles");
        translationBuilder.add(BlockusBlocks.LIGHT_BLUE_COLORED_TILES, "Light Blue Colored Tiles");
        translationBuilder.add(BlockusBlocks.YELLOW_COLORED_TILES, "Yellow Colored Tiles");
        translationBuilder.add(BlockusBlocks.LIME_COLORED_TILES, "Lime Colored Tiles");
        translationBuilder.add(BlockusBlocks.PINK_COLORED_TILES, "Pink Colored Tiles");
        translationBuilder.add(BlockusBlocks.GRAY_COLORED_TILES, "Gray Colored Tiles");
        translationBuilder.add(BlockusBlocks.LIGHT_GRAY_COLORED_TILES, "Light Gray Colored Tiles");
        translationBuilder.add(BlockusBlocks.CYAN_COLORED_TILES, "Cyan Colored Tiles");
        translationBuilder.add(BlockusBlocks.PURPLE_COLORED_TILES, "Purple Colored Tiles");
        translationBuilder.add(BlockusBlocks.BLUE_COLORED_TILES, "Blue Colored Tiles");
        translationBuilder.add(BlockusBlocks.BROWN_COLORED_TILES, "Brown Colored Tiles");
        translationBuilder.add(BlockusBlocks.GREEN_COLORED_TILES, "Green Colored Tiles");
        translationBuilder.add(BlockusBlocks.RED_COLORED_TILES, "Red Colored Tiles");
        translationBuilder.add(BlockusBlocks.BLACK_COLORED_TILES, "Black Colored Tiles");
        translationBuilder.add(BlockusBlocks.RAINBOW_COLORED_TILES, "Rainbow Colored Tiles");

        // Woods
        translationBuilder.add(BlockusBlocks.WHITE_OAK_SAPLING, "White Oak Sapling");
        translationBuilder.add(BlockusBlocks.POTTED_WHITE_OAK_SAPLING, "Potted White Oak Sapling");
        translationBuilder.add(BlockusBlocks.WHITE_OAK_LOG, "White Oak Log");
        translationBuilder.add(BlockusBlocks.STRIPPED_WHITE_OAK_LOG, "Stripped White Oak Log");
        translationBuilder.add(BlockusBlocks.WHITE_OAK_WOOD, "White Oak Wood");
        translationBuilder.add(BlockusBlocks.STRIPPED_WHITE_OAK_WOOD, "Stripped White Oak Wood");
        translationBuilder.add(BlockusBlocks.WHITE_OAK_LEAVES, "White Oak Leaves");

        // Mosaics
        addBssw(translationBuilder, BlockusBlocks.OAK_MOSAIC, "Oak Mosaic");
        addBssw(translationBuilder, BlockusBlocks.SPRUCE_MOSAIC, "Spruce Mosaic");
        addBssw(translationBuilder, BlockusBlocks.BIRCH_MOSAIC, "Birch Mosaic");
        addBssw(translationBuilder, BlockusBlocks.JUNGLE_MOSAIC, "Jungle Mosaic");
        addBssw(translationBuilder, BlockusBlocks.ACACIA_MOSAIC, "Acacia Mosaic");
        addBssw(translationBuilder, BlockusBlocks.DARK_OAK_MOSAIC, "Dark Oak Mosaic");
        addBssw(translationBuilder, BlockusBlocks.CHERRY_MOSAIC, "Cherry Mosaic");
        addBssw(translationBuilder, BlockusBlocks.MANGROVE_MOSAIC, "Mangrove Mosaic");
        addBssw(translationBuilder, BlockusBlocks.WARPED_MOSAIC, "Warped Mosaic");
        addBssw(translationBuilder, BlockusBlocks.CRIMSON_MOSAIC, "Crimson Mosaic");
        addBssw(translationBuilder, BlockusBlocks.PALE_OAK_MOSAIC, "Pale Oak Mosaic");


        // Mossy Planks
        addBssw(translationBuilder, BlockusBlocks.MOSSY_OAK_PLANKS, "Mossy Oak Planks");
        addBssw(translationBuilder, BlockusBlocks.MOSSY_SPRUCE_PLANKS, "Mossy Spruce Planks");
        addBssw(translationBuilder, BlockusBlocks.MOSSY_BIRCH_PLANKS, "Mossy Birch Planks");
        addBssw(translationBuilder, BlockusBlocks.MOSSY_JUNGLE_PLANKS, "Mossy Jungle Planks");
        addBssw(translationBuilder, BlockusBlocks.MOSSY_ACACIA_PLANKS, "Mossy Acacia Planks");
        addBssw(translationBuilder, BlockusBlocks.MOSSY_DARK_OAK_PLANKS, "Mossy Dark Oak Planks");
        addBssw(translationBuilder, BlockusBlocks.MOSSY_MANGROVE_PLANKS, "Mossy Mangrove Planks");
        addBssw(translationBuilder, BlockusBlocks.MOSSY_CHERRY_PLANKS, "Mossy Cherry Planks");
        addBssw(translationBuilder, BlockusBlocks.MOSSY_BAMBOO_PLANKS, "Mossy Bamboo Planks");
        addBssw(translationBuilder, BlockusBlocks.MOSSY_CRIMSON_PLANKS, "Mossy Crimson Planks");
        addBssw(translationBuilder, BlockusBlocks.MOSSY_WARPED_PLANKS, "Mossy Warped Planks");
        addBssw(translationBuilder, BlockusBlocks.MOSSY_PALE_OAK_PLANKS, "Mossy Pale Oak Planks");

        // Herringbone Planks
        translationBuilder.add(BlockusBlocks.HERRINGBONE_OAK_PLANKS, "Herringbone Oak Planks");
        translationBuilder.add(BlockusBlocks.HERRINGBONE_SPRUCE_PLANKS, "Herringbone Spruce Planks");
        translationBuilder.add(BlockusBlocks.HERRINGBONE_BIRCH_PLANKS, "Herringbone Birch Planks");
        translationBuilder.add(BlockusBlocks.HERRINGBONE_JUNGLE_PLANKS, "Herringbone Jungle Planks");
        translationBuilder.add(BlockusBlocks.HERRINGBONE_ACACIA_PLANKS, "Herringbone Acacia Planks");
        translationBuilder.add(BlockusBlocks.HERRINGBONE_DARK_OAK_PLANKS, "Herringbone Dark Oak Planks");
        translationBuilder.add(BlockusBlocks.HERRINGBONE_MANGROVE_PLANKS, "Herringbone Mangrove Planks");
        translationBuilder.add(BlockusBlocks.HERRINGBONE_CHERRY_PLANKS, "Herringbone Cherry Planks");
        translationBuilder.add(BlockusBlocks.HERRINGBONE_BAMBOO_PLANKS, "Herringbone Bamboo Planks");
        translationBuilder.add(BlockusBlocks.HERRINGBONE_CRIMSON_PLANKS, "Herringbone Crimson Planks");
        translationBuilder.add(BlockusBlocks.HERRINGBONE_WARPED_PLANKS, "Herringbone Warped Planks");
        translationBuilder.add(BlockusBlocks.HERRINGBONE_PALE_OAK_PLANKS, "Herringbone Pale Oak Planks");

        // Stone
        addBssw(translationBuilder, BlockusBlocks.STONE_TILES, "Stone Tiles");
        translationBuilder.add(BlockusBlocks.STONE_BRICK_PILLAR, "Stone Brick Pillar");
        translationBuilder.add(BlockusBlocks.HERRINGBONE_STONE_BRICKS, "Herringbone Stone Bricks");
        translationBuilder.add(BlockusBlocks.STURDY_STONE, "Sturdy Stone");

        // Purpur
        addBssw(translationBuilder, BlockusBlocks.PURPUR_BRICKS, "Purpur Bricks");
        addBssw(translationBuilder, BlockusBlocks.POLISHED_PURPUR, "Polished Purpur");
        translationBuilder.add(BlockusBlocks.PURPUR_LINES, "Purpur Lines");
        translationBuilder.add(BlockusBlocks.PURPUR_SQUARES, "Purpur Squares");
        addBssw(translationBuilder, BlockusBlocks.SMALL_PURPUR_BRICKS, "Small Purpur Bricks");
        translationBuilder.add(BlockusBlocks.CHISELED_PURPUR, "Chiseled Purpur");

        addBssw(translationBuilder, BlockusBlocks.PHANTOM_PURPUR_BLOCK, "Phantom Purpur Block");
        addBssw(translationBuilder, BlockusBlocks.PHANTOM_PURPUR_BRICKS, "Phantom Purpur Bricks");
        addBssw(translationBuilder, BlockusBlocks.POLISHED_PHANTOM_PURPUR, "Polished Phantom Purpur");
        translationBuilder.add(BlockusBlocks.PHANTOM_PURPUR_PILLAR, "Phantom Purpur Pillar");
        translationBuilder.add(BlockusBlocks.PHANTOM_PURPUR_LINES, "Phantom Purpur Lines");
        translationBuilder.add(BlockusBlocks.PHANTOM_PURPUR_SQUARES, "Phantom Purpur Squares");
        addBssw(translationBuilder, BlockusBlocks.SMALL_PHANTOM_PURPUR_BRICKS, "Small Phantom Purpur Bricks");
        translationBuilder.add(BlockusBlocks.CHISELED_PHANTOM_PURPUR, "Chiseled Phantom Purpur");
        translationBuilder.add(BlockusBlocks.PURPUR_DECORATED_END_STONE, "Purpur-Decorated End Stone");
        translationBuilder.add(BlockusBlocks.PHANTOM_PURPUR_DECORATED_END_STONE, "Phantom Purpur-Decorated End Stone");
        addBssw(translationBuilder, BlockusBlocks.END_TILES, "End Tiles");

        // Nether Brick
        addBssw(translationBuilder, BlockusBlocks.NETHER_TILES, "Nether Tiles");
        translationBuilder.add(BlockusBlocks.NETHER_BRICK_PILLAR, "Nether Brick Pillar");
        translationBuilder.add(BlockusBlocks.RED_NETHER_BRICK_PILLAR, "Red Nether Brick Pillar");
        addBssw(translationBuilder, BlockusBlocks.POLISHED_NETHER_BRICKS, "Polished Nether Bricks");
        addBssw(translationBuilder, BlockusBlocks.POLISHED_RED_NETHER_BRICKS, "Polished Red Nether Bricks");
        translationBuilder.add(BlockusBlocks.HERRINGBONE_NETHER_BRICKS, "Herringbone Nether Bricks");
        translationBuilder.add(BlockusBlocks.HERRINGBONE_RED_NETHER_BRICKS, "Herringbone Red Nether Bricks");


        // Andesite, Diorite & Granite
        addBssw(translationBuilder, BlockusBlocks.ANDESITE_BRICKS, "Andesite Bricks");
        addBssw(translationBuilder, BlockusBlocks.DIORITE_BRICKS, "Diorite Bricks");
        addBssw(translationBuilder, BlockusBlocks.GRANITE_BRICKS, "Granite Bricks");
        translationBuilder.add(BlockusBlocks.CRACKED_ANDESITE_BRICKS, "Cracked Andesite Bricks");
        translationBuilder.add(BlockusBlocks.CRACKED_DIORITE_BRICKS, "Cracked Diorite Bricks");
        translationBuilder.add(BlockusBlocks.CRACKED_GRANITE_BRICKS, "Cracked Granite Bricks");
        translationBuilder.add(BlockusBlocks.CHISELED_ANDESITE_BRICKS, "Chiseled Andesite Bricks");
        translationBuilder.add(BlockusBlocks.CHISELED_DIORITE_BRICKS, "Chiseled Diorite Bricks");
        translationBuilder.add(BlockusBlocks.CHISELED_GRANITE_BRICKS, "Chiseled Granite Bricks");
        translationBuilder.add(BlockusBlocks.POLISHED_ANDESITE_PILLAR, "Polished Andesite Pillar");
        translationBuilder.add(BlockusBlocks.POLISHED_DIORITE_PILLAR, "Polished Diorite Pillar");
        translationBuilder.add(BlockusBlocks.POLISHED_GRANITE_PILLAR, "Polished Granite Pillar");
        translationBuilder.add(BlockusBlocks.HERRINGBONE_ANDESITE_BRICKS, "Herringbone Andesite Bricks");
        translationBuilder.add(BlockusBlocks.HERRINGBONE_DIORITE_BRICKS, "Herringbone Diorite Bricks");
        translationBuilder.add(BlockusBlocks.HERRINGBONE_GRANITE_BRICKS, "Herringbone Granite Bricks");

        // Caution & Road Barriers
        translationBuilder.add(BlockusBlocks.CAUTION_BLOCK, "Caution Block");

        // Bricks
        addBssw(translationBuilder, BlockusBlocks.LAVA_BRICKS, "Lava Bricks");
        addBssw(translationBuilder, BlockusBlocks.WATER_BRICKS, "Water Bricks");
        translationBuilder.add(BlockusBlocks.CHISELED_LAVA_BRICKS, "Chiseled Lava Bricks");
        translationBuilder.add(BlockusBlocks.CHISELED_WATER_BRICKS, "Chiseled Water Bricks");
        addBssw(translationBuilder, BlockusBlocks.SOAKED_BRICKS, "Soaked Bricks");
        translationBuilder.add(BlockusBlocks.HERRINGBONE_SOAKED_BRICKS, "Herringbone Soaked Bricks");
        addBssw(translationBuilder, BlockusBlocks.SANDY_BRICKS, "Sandy Bricks");
        translationBuilder.add(BlockusBlocks.HERRINGBONE_SANDY_BRICKS, "Herringbone Sandy Bricks");
        addBssw(translationBuilder, BlockusBlocks.LARGE_BRICKS, "Large Bricks");
        translationBuilder.add(BlockusBlocks.HERRINGBONE_BRICKS, "Herringbone Bricks");
        addBssw(translationBuilder, BlockusBlocks.HONEYCOMB_BRICKS, "Honeycomb Bricks");

        // Resin Bricks
        addBssw(translationBuilder, BlockusBlocks.LARGE_RESIN_BRICKS, "Large Resin Bricks");
        translationBuilder.add(BlockusBlocks.HERRINGBONE_RESIN_BRICKS, "Herringbone Resin Bricks");
        translationBuilder.add(BlockusBlocks.RESIN_BRICK_PILLAR, "Resin Brick Pillar");

        // Magma
        addBssw(translationBuilder, BlockusBlocks.MAGMA_BRICKS, "Magma Bricks");
        addBssw(translationBuilder, BlockusBlocks.SMALL_MAGMA_BRICKS, "Small Magma Bricks");
        translationBuilder.add(BlockusBlocks.CHISELED_MAGMA_BRICKS, "Chiseled Magma Bricks");

        // End Stone
        addBssw(translationBuilder, BlockusBlocks.POLISHED_END_STONE, "Polished End Stone");
        addBssw(translationBuilder, BlockusBlocks.SMALL_END_STONE_BRICKS, "Small End Stone Bricks");
        translationBuilder.add(BlockusBlocks.CHISELED_END_STONE_BRICKS, "Chiseled End Stone Bricks");
        translationBuilder.add(BlockusBlocks.HERRINGBONE_END_STONE_BRICKS, "Herringbone End Stone Bricks");
        translationBuilder.add(BlockusBlocks.CRACKED_END_STONE_BRICKS, "Cracked End Stone Bricks");
        translationBuilder.add(BlockusBlocks.END_STONE_PILLAR, "End Stone Pillar");

        // Asphalt
        addAsphalt(translationBuilder, BlockusBlocks.ASPHALT, "Asphalt");
        addAsphalt(translationBuilder, BlockusBlocks.WHITE_ASPHALT, "White Asphalt");
        addAsphalt(translationBuilder, BlockusBlocks.ORANGE_ASPHALT, "Orange Asphalt");
        addAsphalt(translationBuilder, BlockusBlocks.MAGENTA_ASPHALT, "Magenta Asphalt");
        addAsphalt(translationBuilder, BlockusBlocks.LIGHT_BLUE_ASPHALT, "Light Blue Asphalt");
        addAsphalt(translationBuilder, BlockusBlocks.YELLOW_ASPHALT, "Yellow Asphalt");
        addAsphalt(translationBuilder, BlockusBlocks.LIME_ASPHALT, "Lime Asphalt");
        addAsphalt(translationBuilder, BlockusBlocks.PINK_ASPHALT, "Pink Asphalt");
        addAsphalt(translationBuilder, BlockusBlocks.LIGHT_GRAY_ASPHALT, "Light Gray Asphalt");
        addAsphalt(translationBuilder, BlockusBlocks.GRAY_ASPHALT, "Gray Asphalt");
        addAsphalt(translationBuilder, BlockusBlocks.CYAN_ASPHALT, "Cyan Asphalt");
        addAsphalt(translationBuilder, BlockusBlocks.PURPLE_ASPHALT, "Purple Asphalt");
        addAsphalt(translationBuilder, BlockusBlocks.BLUE_ASPHALT, "Blue Asphalt");
        addAsphalt(translationBuilder, BlockusBlocks.BROWN_ASPHALT, "Brown Asphalt");
        addAsphalt(translationBuilder, BlockusBlocks.GREEN_ASPHALT, "Green Asphalt");
        addAsphalt(translationBuilder, BlockusBlocks.RED_ASPHALT, "Red Asphalt");
        translationBuilder.add(BlockusBlocks.RAINBOW_ASPHALT, "Rainbow Asphalt");

        // Obsidian
        addBssw(translationBuilder, BlockusBlocks.OBSIDIAN_BRICKS, "Obsidian Bricks");
        addBssw(translationBuilder, BlockusBlocks.SMALL_OBSIDIAN_BRICKS, "Small Obsidian Bricks");
        translationBuilder.add(BlockusBlocks.CRACKED_OBSIDIAN_BRICKS, "Cracked Obsidian Bricks");
        translationBuilder.add(BlockusBlocks.OBSIDIAN_PILLAR, "Obsidian Pillar");
        translationBuilder.add(BlockusBlocks.GLOWING_OBSIDIAN, "Glowing Obsidian");

        // Limestone
        addBssw(translationBuilder, BlockusBlocks.LIMESTONE, "Limestone");
        addBssw(translationBuilder, BlockusBlocks.POLISHED_LIMESTONE, "Polished Limestone");
        addBssw(translationBuilder, BlockusBlocks.LIMESTONE_BRICKS, "Limestone Bricks");
        addBssw(translationBuilder, BlockusBlocks.LIMESTONE_TILES, "Limestone Tiles");
        addBssw(translationBuilder, BlockusBlocks.SMALL_LIMESTONE_BRICKS, "Small Limestone Bricks");
        translationBuilder.add(BlockusBlocks.LIMESTONE_PILLAR, "Limestone Pillar");
        translationBuilder.add(BlockusBlocks.CHISELED_LIMESTONE, "Chiseled Limestone");
        translationBuilder.add(BlockusBlocks.CHISELED_LIMESTONE_PILLAR, "Chiseled Limestone Pillar");
        translationBuilder.add(BlockusBlocks.CHISELED_LIMESTONE_BRICKS, "Chiseled Limestone Bricks");
        translationBuilder.add(BlockusBlocks.LIMESTONE_SQUARES, "Limestone Squares");
        translationBuilder.add(BlockusBlocks.LIMESTONE_LINES, "Limestone Lines");

        // Marble
        addBssw(translationBuilder, BlockusBlocks.MARBLE, "Marble");
        addBssw(translationBuilder, BlockusBlocks.POLISHED_MARBLE, "Polished Marble");
        addBssw(translationBuilder, BlockusBlocks.MARBLE_BRICKS, "Marble Bricks");
        addBssw(translationBuilder, BlockusBlocks.MARBLE_TILES, "Marble Tiles");
        addBssw(translationBuilder, BlockusBlocks.SMALL_MARBLE_BRICKS, "Small Marble Bricks");
        translationBuilder.add(BlockusBlocks.MARBLE_PILLAR, "Marble Pillar");
        translationBuilder.add(BlockusBlocks.CHISELED_MARBLE, "Chiseled Marble");
        translationBuilder.add(BlockusBlocks.CHISELED_MARBLE_PILLAR, "Chiseled Marble Pillar");
        translationBuilder.add(BlockusBlocks.CHISELED_MARBLE_BRICKS, "Chiseled Marble Bricks");
        translationBuilder.add(BlockusBlocks.MARBLE_SQUARES, "Marble Squares");
        translationBuilder.add(BlockusBlocks.MARBLE_LINES, "Marble Lines");

        // Bluestone
        addBssw(translationBuilder, BlockusBlocks.BLUESTONE, "Bluestone");
        addBssw(translationBuilder, BlockusBlocks.POLISHED_BLUESTONE, "Polished Bluestone");
        addBssw(translationBuilder, BlockusBlocks.BLUESTONE_BRICKS, "Bluestone Bricks");
        addBssw(translationBuilder, BlockusBlocks.BLUESTONE_TILES, "Bluestone Tiles");
        addBssw(translationBuilder, BlockusBlocks.SMALL_BLUESTONE_BRICKS, "Small Bluestone Bricks");
        translationBuilder.add(BlockusBlocks.BLUESTONE_PILLAR, "Bluestone Pillar");
        translationBuilder.add(BlockusBlocks.CHISELED_BLUESTONE, "Chiseled Bluestone");
        translationBuilder.add(BlockusBlocks.CHISELED_BLUESTONE_PILLAR, "Chiseled Bluestone Pillar");
        translationBuilder.add(BlockusBlocks.CHISELED_BLUESTONE_BRICKS, "Chiseled Bluestone Bricks");
        translationBuilder.add(BlockusBlocks.BLUESTONE_SQUARES, "Bluestone Squares");
        translationBuilder.add(BlockusBlocks.BLUESTONE_LINES, "Bluestone Lines");

        // Viridite
        addBssw(translationBuilder, BlockusBlocks.VIRIDITE, "Viridite");
        addBssw(translationBuilder, BlockusBlocks.POLISHED_VIRIDITE, "Polished Viridite");
        addBssw(translationBuilder, BlockusBlocks.VIRIDITE_BRICKS, "Viridite Bricks");
        addBssw(translationBuilder, BlockusBlocks.VIRIDITE_TILES, "Viridite Tiles");
        addBssw(translationBuilder, BlockusBlocks.SMALL_VIRIDITE_BRICKS, "Small Viridite Bricks");
        translationBuilder.add(BlockusBlocks.VIRIDITE_PILLAR, "Viridite Pillar");
        translationBuilder.add(BlockusBlocks.CHISELED_VIRIDITE, "Chiseled Viridite");
        translationBuilder.add(BlockusBlocks.CHISELED_VIRIDITE_PILLAR, "Chiseled Viridite Pillar");
        translationBuilder.add(BlockusBlocks.CHISELED_VIRIDITE_BRICKS, "Chiseled Viridite Bricks");
        translationBuilder.add(BlockusBlocks.VIRIDITE_SQUARES, "Viridite Squares");
        translationBuilder.add(BlockusBlocks.VIRIDITE_LINES, "Viridite Lines");

        // Rainbow
        translationBuilder.add(BlockusBlocks.RAINBOW_ROSE, "Rainbow Rose");
        translationBuilder.add(BlockusBlocks.POTTED_RAINBOW_ROSE, "Potted Rainbow Rose");
        addBssw(translationBuilder, BlockusBlocks.RAINBOW_BRICKS, "Rainbow Bricks");
        translationBuilder.add(BlockusBlocks.RAINBOW_PETALS, "Rainbow Petals");
        translationBuilder.add(BlockusBlocks.RAINBOW_BLOCK, "Rainbow Block");
        translationBuilder.add(BlockusBlocks.RAINBOW_GLOWSTONE, "Rainbow Glowstone");

        // Food Crates
        translationBuilder.add(BlockusBlocks.COD_CRATE, "Cod Crate");
        translationBuilder.add(BlockusBlocks.SALMON_CRATE, "Salmon Crate");
        translationBuilder.add(BlockusBlocks.PUFFERFISH_CRATE, "Pufferfish Crate");
        translationBuilder.add(BlockusBlocks.TROPICAL_FISH_CRATE, "Tropical Fish Crate");
        translationBuilder.add(BlockusBlocks.APPLE_CRATE, "Apple Crate");
        translationBuilder.add(BlockusBlocks.GOLDEN_APPLE_CRATE, "Golden Apple Crate");
        translationBuilder.add(BlockusBlocks.POTATO_CRATE, "Potato Crate");
        translationBuilder.add(BlockusBlocks.CARROT_CRATE, "Carrot Crate");
        translationBuilder.add(BlockusBlocks.GOLDEN_CARROT_CRATE, "Golden Carrot Crate");
        translationBuilder.add(BlockusBlocks.BEETROOT_CRATE, "Beetroot Crate");
        translationBuilder.add(BlockusBlocks.SWEET_BERRIES_CRATE, "Sweet Berries Crate");
        translationBuilder.add(BlockusBlocks.GLOW_BERRIES_CRATE, "Glow Berries Crate");
        translationBuilder.add(BlockusBlocks.BREAD_BOX, "Bread Box");

        // Thatch
        addBssw(translationBuilder, BlockusBlocks.THATCH, "Thatch");

        // PLatings
        addBssw(translationBuilder, BlockusBlocks.IRON_PLATING, "Iron Plating");
        addBssw(translationBuilder, BlockusBlocks.GOLD_PLATING, "Gold Plating");

        // Lanterns
        translationBuilder.add(BlockusBlocks.LANTERN_BLOCK, "Lantern Block");
        translationBuilder.add(BlockusBlocks.SOUL_LANTERN_BLOCK, "Soul Lantern Block");
        translationBuilder.add(BlockusBlocks.SOUL_O_LANTERN, "Soul o'Lantern");

        // Snow & Ice
        addBssw(translationBuilder, BlockusBlocks.SNOW_BRICKS, "Snow Bricks");
        translationBuilder.add(BlockusBlocks.SNOW_PILLAR, "Snow Pillar");
        translationBuilder.add(BlockusBlocks.ICE_BRICKS, "Ice Bricks");
        translationBuilder.add(BlockusBlocks.ICE_PILLAR, "Ice Pillar");


        // Wart Blocks
        translationBuilder.add(Blocks.NETHER_WART_BLOCK, "Crimson Wart Block");
        addBssw(translationBuilder, BlockusBlocks.CRIMSON_WART_BRICKS, "Crimson Wart Bricks");
        addBssw(translationBuilder, BlockusBlocks.WARPED_WART_BRICKS, "Warped Wart Bricks");

        // Amethyst
        addBssw(translationBuilder, BlockusBlocks.POLISHED_AMETHYST, "Polished Amethyst");
        addBssw(translationBuilder, BlockusBlocks.AMETHYST_BRICKS, "Amethyst Bricks");
        translationBuilder.add(BlockusBlocks.CHISELED_AMETHYST, "Chiseled Amethyst");
        translationBuilder.add(BlockusBlocks.AMETHYST_PILLAR, "Amethyst Pillar");

        // Dripstone
        addBssw(translationBuilder, BlockusBlocks.POLISHED_DRIPSTONE, "Polished Dripstone");
        addBssw(translationBuilder, BlockusBlocks.DRIPSTONE_BRICKS, "Dripstone Bricks");
        addBssw(translationBuilder, BlockusBlocks.MOSSY_DRIPSTONE_BRICKS, "Mossy Dripstone Bricks");
        translationBuilder.add(BlockusBlocks.CRACKED_DRIPSTONE_BRICKS, "Cracked Dripstone Bricks");
        translationBuilder.add(BlockusBlocks.CHISELED_DRIPSTONE, "Chiseled Dripstone");
        translationBuilder.add(BlockusBlocks.DRIPSTONE_PILLAR, "Dripstone Pillar");

        // Tuff
        addBssw(translationBuilder, BlockusBlocks.TUFF_TILES, "Tuff Tiles");
        translationBuilder.add(BlockusBlocks.CRACKED_TUFF_BRICKS, "Cracked Tuff Bricks");
        translationBuilder.add(BlockusBlocks.CARVED_TUFF_BRICKS, "Carved Tuff Bricks");
        translationBuilder.add(BlockusBlocks.TUFF_PILLAR, "Tuff Pillar");
        translationBuilder.add(BlockusBlocks.HERRINGBONE_TUFF_BRICKS, "Herringbone Tuff Bricks");
        addBssw(translationBuilder, BlockusBlocks.MOSSY_TUFF_BRICKS, "Mossy Tuff Bricks");

        // Deepslate
        translationBuilder.add(BlockusBlocks.DEEPSLATE_PILLAR, "Deepslate Pillar");
        translationBuilder.add(BlockusBlocks.HERRINGBONE_DEEPSLATE_BRICKS, "Herringbone Deepslate Bricks");
        translationBuilder.add(BlockusBlocks.STURDY_DEEPSLATE, "Sturdy Deepslate");
        addBssw(translationBuilder, BlockusBlocks.MOSSY_DEEPSLATE_BRICKS, "Mossy Deepslate Bricks");

        // Sculk
        addBssw(translationBuilder, BlockusBlocks.POLISHED_SCULK, "Polished Sculk");
        addBssw(translationBuilder, BlockusBlocks.SCULK_BRICKS, "Sculk Bricks");
        translationBuilder.add(BlockusBlocks.CHISELED_SCULK_BRICKS, "Chiseled Sculk Bricks");
        translationBuilder.add(BlockusBlocks.SCULK_PILLAR, "Sculk Pillar");

        // Mud
        translationBuilder.add(BlockusBlocks.MUD_BRICK_PILLAR, "Mud Brick Pillar");
        translationBuilder.add(BlockusBlocks.CHISELED_MUD_BRICKS, "Chiseled Mud Bricks");

        // Chocolate
        addBssw(translationBuilder, BlockusBlocks.CHOCOLATE_BLOCK, "Chocolate Block");
        addBssw(translationBuilder, BlockusBlocks.CHOCOLATE_BRICKS, "Chocolate Bricks");
        translationBuilder.add(BlockusBlocks.CHOCOLATE_SQUARES, "Chocolate Squares");
        translationBuilder.add(BlockusBlocks.CHOCOLATE_TABLET, "Chocolate Tablet");

        // Other
        translationBuilder.add(BlockusBlocks.PATH, "Path");
        translationBuilder.add(BlockusBlocks.STARS_BLOCK, "Stars Block");
        translationBuilder.add(BlockusBlocks.ENDER_BLOCK, "Ender Block");
        translationBuilder.add(BlockusBlocks.CHARCOAL_BLOCK, "Block of Charcoal");
        translationBuilder.add(BlockusBlocks.ROTTEN_FLESH_BLOCK, "Block of Rotten Flesh");
        translationBuilder.add(BlockusBlocks.SUGAR_BLOCK, "Sugar Block");
        translationBuilder.add(BlockusBlocks.LOVE_BLOCK, "Love Block §4<3");
        translationBuilder.add(BlockusBlocks.MEMBRANE_BLOCK, "Membrane Block");
        translationBuilder.add(BlockusBlocks.REDSTONE_SAND, "Redstone Sand");
        translationBuilder.add(BlockusBlocks.NETHER_STAR_BLOCK, "Block of Nether Star");
        translationBuilder.add(BlockusBlocks.CHORUS_BLOCK, "Chorus Block");
        translationBuilder.add(BlockusBlocks.COOKIE_BLOCK, "Block of Cookie");
        translationBuilder.add(BlockusBlocks.WEIGHT_STORAGE_CUBE, "Weight Storage Cube");
        translationBuilder.add(BlockusBlocks.COMPANION_CUBE, "Companion Cube");
    }

    public static String editedString(String string) {
        return string.replace("Bricks", "Brick").replace("Tiles", "Tile").replace(" Block", "").replace(" Planks", "");
    }

    // Stairs & slab
    public static void addStairsSlab(TranslationBuilder translationBuilder, String string, Block stairs, Block slab) {
        translationBuilder.add(stairs, editedString(string) + " Stairs");
        translationBuilder.add(slab, editedString(string) + " Slab");
    }

    // Block, stairs & slab
    public static void addBlockStairsSlab(TranslationBuilder translationBuilder, String string, Block block) {
        translationBuilder.add(block, string);
    }

    // Block, stairs & slab & wall
    public static void addBlockStairsSlabWall(TranslationBuilder translationBuilder, String string, Block block) {
        addBlockStairsSlab(translationBuilder, string, block);
    }

    // Block, stairs & slab & wall (if exist)
    public static void addBssw(TranslationBuilder translationBuilder, BSSWBundle bundle, String string) {
        addBlockStairsSlab(translationBuilder, string, bundle.block);
    }

    public static void addWoodenBss(TranslationBuilder translationBuilder, BSSWBundle bundle, String string) {
        // Stairs & Slab with "Wooden" specified - Used for Mossy Charred Planks
        translationBuilder.add(bundle.block, string);
    }

    // Wood
    public static void addWoodBundle(TranslationBuilder translationBuilder, WoodBundle bundle, String string) {
        String charredException = editedString(string).replace("Charred", "Charred Wooden");
        translationBuilder.add(bundle.planks, string);
        translationBuilder.add(bundle.stairs, charredException + " Stairs");
        translationBuilder.add(bundle.slab, charredException + " Slab");
        translationBuilder.add(bundle.fence, editedString(string) + " Fence");
        translationBuilder.add(bundle.fence_gate, editedString(string) + " Fence Gate");
        translationBuilder.add(bundle.door, charredException + " Door");
        translationBuilder.add(bundle.trapdoor, charredException + " Trapdoor");
        translationBuilder.add(bundle.pressure_plate, charredException + " Pressure Plate");
        translationBuilder.add(bundle.button, charredException + " Button");
        translationBuilder.add(bundle.sign, editedString(string) + " Sign");
        translationBuilder.add(bundle.sign.getTranslationKey().replace("sign", "wall_sign"), editedString(string) + " Wall Sign");
        translationBuilder.add(bundle.hanging_sign, editedString(string) + " Hanging Sign");
        translationBuilder.add(bundle.hanging_sign.getTranslationKey().replace("hanging_sign", "wall_hanging_sign"), editedString(string) + " Wall Hanging Sign");
    }

    // Wooden Posts
    public static void addWoodenPost(TranslationBuilder translationBuilder, WoodenPostBundle bundle, String string) {
        translationBuilder.add(bundle.block, string);
        translationBuilder.add(bundle.stripped, "Stripped " + string);
    }

    // Timber Frames, Lattice & Grate
    public static void addTimberFrame(TranslationBuilder translationBuilder, TimberFrameBundle bundle, String wood) {
        translationBuilder.add(bundle.block, wood + " Timber Frame");
        translationBuilder.add(bundle.diagonal, wood + " Diagonal Timber Frame");
        translationBuilder.add(bundle.cross, wood + " Cross Timber Frame");
        translationBuilder.add(bundle.lattice, wood + " Lattice");
        translationBuilder.add(bundle.grate, wood + " Grate");
    }

    // Concrete
    public static void addConcrete(TranslationBuilder translationBuilder, ConcreteBundle bundle, String string) {
        String removeBricks = string.replace(" Bricks", "");
        addBlockStairsSlabWall(translationBuilder, string, bundle.block);
    }

    // Patterned Wools
    public static void addWoolBundle(TranslationBuilder translationBuilder, WoolBundle bundle, String string) {
        addBlockStairsSlab(translationBuilder, string, bundle.block);
        translationBuilder.add(bundle.carpet, string.replace("Wool", "Carpet"));
    }

    // Asphalt
    public static void addAsphalt(TranslationBuilder translationBuilder, AsphaltBundle bundle, String string) {
        addBlockStairsSlab(translationBuilder, string, bundle.block);
    }

    // Copper
    public static void addCopper(TranslationBuilder translationBuilder, CopperBundle bundle, String string) {
        String waxedString = "Waxed " + string;
        addBlockStairsSlabWall(translationBuilder, string, bundle.block);
        addBlockStairsSlabWall(translationBuilder, waxedString, bundle.blockWaxed);
    }
}
