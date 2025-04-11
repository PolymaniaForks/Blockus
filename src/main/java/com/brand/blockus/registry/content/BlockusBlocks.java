package com.brand.blockus.registry.content;

import com.brand.blockus.blocks.base.*;
import com.brand.blockus.blocks.base.amethyst.AmethystLampBlock;
import com.brand.blockus.blocks.base.amethyst.AmethystPillarBlock;
import com.brand.blockus.blocks.base.asphalt.RainbowAsphalt;
import com.brand.blockus.blocks.base.redstone.FallingRedstoneBlock;
import com.brand.blockus.blocks.base.redstone.RedstoneLantern;
import com.brand.blockus.blocks.base.redstone.RedstonePumpkinBlock;
import com.brand.blockus.blocks.generator.BlockusSaplingGenerator;
import com.brand.blockus.registry.content.bundles.*;
import com.brand.blockus.registry.content.bundles.CopperBundle.OxidationType;
import com.brand.blockus.utils.BlockFactory;
import net.minecraft.block.*;
import net.minecraft.block.enums.NoteBlockInstrument;
import net.minecraft.block.piston.PistonBehavior;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.particle.EntityEffectParticleEffect;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.item.Item;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.ColorCode;
import net.minecraft.util.DyeColor;

public class BlockusBlocks extends BlockFactory {

    // Stone
    public static final BSSWBundle STONE_TILES = new BSSWBundle("stone_tiles", Blocks.STONE_BRICKS);
    public static final Block STONE_BRICK_PILLAR = registerPillar(Blocks.STONE_BRICKS);
    public static final Block HERRINGBONE_STONE_BRICKS = register("herringbone_stone_bricks", createCopy(Blocks.STONE_BRICKS));
    public static final Block STURDY_STONE = register("sturdy_stone", createCopy(Blocks.COBBLESTONE, PistonBehavior.BLOCK));

    // Andesite
    public static final BSSWBundle ANDESITE_BRICKS = new BSSWBundle("andesite_bricks", Blocks.POLISHED_ANDESITE);
    public static final Block CRACKED_ANDESITE_BRICKS = register("cracked_andesite_bricks", createCopy(BlockusBlocks.ANDESITE_BRICKS.block));
    public static final Block CHISELED_ANDESITE_BRICKS = register("chiseled_andesite_bricks", createCopy(BlockusBlocks.ANDESITE_BRICKS.block));
    public static final Block POLISHED_ANDESITE_PILLAR = registerPillar(Blocks.POLISHED_ANDESITE);
    public static final Block HERRINGBONE_ANDESITE_BRICKS = register("herringbone_andesite_bricks", createCopy(BlockusBlocks.ANDESITE_BRICKS.block));

    // Diorite
    public static final BSSWBundle DIORITE_BRICKS = new BSSWBundle("diorite_bricks", Blocks.POLISHED_DIORITE);
    public static final Block CRACKED_DIORITE_BRICKS = register("cracked_diorite_bricks", createCopy(BlockusBlocks.DIORITE_BRICKS.block));
    public static final Block CHISELED_DIORITE_BRICKS = register("chiseled_diorite_bricks", createCopy(BlockusBlocks.DIORITE_BRICKS.block));
    public static final Block POLISHED_DIORITE_PILLAR = registerPillar(Blocks.POLISHED_DIORITE);
    public static final Block HERRINGBONE_DIORITE_BRICKS = register("herringbone_diorite_bricks", createCopy(BlockusBlocks.DIORITE_BRICKS.block));

    // Granite
    public static final BSSWBundle GRANITE_BRICKS = new BSSWBundle("granite_bricks", Blocks.POLISHED_GRANITE);
    public static final Block CRACKED_GRANITE_BRICKS = register("cracked_granite_bricks", createCopy(BlockusBlocks.GRANITE_BRICKS.block));
    public static final Block CHISELED_GRANITE_BRICKS = register("chiseled_granite_bricks", createCopy(BlockusBlocks.GRANITE_BRICKS.block));
    public static final Block POLISHED_GRANITE_PILLAR = registerPillar(Blocks.POLISHED_GRANITE);
    public static final Block HERRINGBONE_GRANITE_BRICKS = register("herringbone_granite_bricks", createCopy(BlockusBlocks.GRANITE_BRICKS.block));

    // Mud
    public static final Block CHISELED_MUD_BRICKS = register("chiseled_mud_bricks", createCopy(Blocks.MUD_BRICKS));
    public static final Block MUD_BRICK_PILLAR = registerPillar(Blocks.MUD_BRICKS);

    // Dripstone
    public static final BSSWBundle POLISHED_DRIPSTONE = new BSSWBundle("polished_dripstone", Blocks.DRIPSTONE_BLOCK, false);
    public static final BSSWBundle DRIPSTONE_BRICKS = new BSSWBundle("dripstone_bricks", BlockusBlocks.POLISHED_DRIPSTONE.block);
    public static final BSSWBundle MOSSY_DRIPSTONE_BRICKS = new BSSWBundle("mossy_dripstone_bricks", BlockusBlocks.DRIPSTONE_BRICKS.block);
    public static final Block CRACKED_DRIPSTONE_BRICKS = register("cracked_dripstone_bricks", createCopy(BlockusBlocks.DRIPSTONE_BRICKS.block));
    public static final Block CHISELED_DRIPSTONE = register("chiseled_dripstone", createCopy(BlockusBlocks.DRIPSTONE_BRICKS.block));
    public static final Block DRIPSTONE_PILLAR = registerPillar("dripstone", BlockusBlocks.DRIPSTONE_BRICKS.block);

    // Tuff
    public static final BSSWBundle MOSSY_TUFF_BRICKS = new BSSWBundle("mossy_tuff_bricks", Blocks.TUFF_BRICKS);
    public static final BSSWBundle TUFF_TILES = new BSSWBundle("tuff_tiles", Blocks.TUFF_BRICKS);
    public static final Block CRACKED_TUFF_BRICKS = register("cracked_tuff_bricks", createCopy(Blocks.TUFF_BRICKS));
    public static final Block CARVED_TUFF_BRICKS = register("carved_tuff_bricks", createCopy(Blocks.TUFF_BRICKS));
    public static final Block HERRINGBONE_TUFF_BRICKS = register("herringbone_tuff_bricks", createCopy(Blocks.TUFF_BRICKS));
    public static final Block TUFF_PILLAR = registerPillar("tuff", Blocks.POLISHED_TUFF);

    // Deepslate
    public static final BSSWBundle MOSSY_DEEPSLATE_BRICKS = new BSSWBundle("mossy_deepslate_bricks", Blocks.DEEPSLATE_BRICKS);
    public static final Block DEEPSLATE_PILLAR = registerPillar("deepslate", Blocks.POLISHED_DEEPSLATE);
    public static final Block HERRINGBONE_DEEPSLATE_BRICKS = register("herringbone_deepslate_bricks", createCopy(Blocks.DEEPSLATE_BRICKS));
    public static final Block STURDY_DEEPSLATE = register("sturdy_deepslate", createCopy(Blocks.COBBLED_DEEPSLATE).pistonBehavior(PistonBehavior.BLOCK));

    // Sculk
    public static final BSSWBundle POLISHED_SCULK = new BSSWBundle("polished_sculk", Blocks.POLISHED_DEEPSLATE, MapColor.CYAN, false);
    public static final BSSWBundle SCULK_BRICKS = new BSSWBundle("sculk_bricks", BlockusBlocks.POLISHED_SCULK.block);
    public static final Block CHISELED_SCULK_BRICKS = register("chiseled_sculk_bricks", createCopy(BlockusBlocks.SCULK_BRICKS.block));
    public static final Block SCULK_PILLAR = registerPillar("sculk", BlockusBlocks.SCULK_BRICKS.block);

    // Amethyst
    public static final BSSWBundle POLISHED_AMETHYST = new BSSWBundle("polished_amethyst", Blocks.AMETHYST_BLOCK, false);
    public static final BSSWBundle AMETHYST_BRICKS = new BSSWBundle("amethyst_bricks", POLISHED_AMETHYST.block);
    public static final Block CHISELED_AMETHYST = register("chiseled_amethyst", AmethystBlock::new, createCopy(AMETHYST_BRICKS.block));
    public static final Block AMETHYST_PILLAR = register("amethyst_pillar", AmethystPillarBlock::new, createCopy(AMETHYST_BRICKS.block));

    // Blackstone
    public static final BSSWBundle POLISHED_BLACKSTONE_TILES = new BSSWBundle("polished_blackstone_tiles", Blocks.POLISHED_BLACKSTONE_BRICKS);
    public static final BSSWBundle CRIMSON_WARTY_BLACKSTONE_BRICKS = new BSSWBundle("crimson_warty_blackstone_bricks", Blocks.POLISHED_BLACKSTONE);
    public static final BSSWBundle WARPED_WARTY_BLACKSTONE_BRICKS = new BSSWBundle("warped_warty_blackstone_bricks", Blocks.POLISHED_BLACKSTONE);
    public static final Block POLISHED_BLACKSTONE_PILLAR = registerPillar(Blocks.POLISHED_BLACKSTONE);
    public static final Block HERRINGBONE_POLISHED_BLACKSTONE_BRICKS = register("herringbone_polished_blackstone_bricks", createCopy(Blocks.POLISHED_BLACKSTONE));
    public static final Block GOLD_DECORATED_POLISHED_BLACKSTONE = register("gold_decorated_polished_blackstone", createCopy(Blocks.POLISHED_BLACKSTONE));
    public static final Block STURDY_BLACKSTONE = register("sturdy_blackstone", createCopy(Blocks.BLACKSTONE, PistonBehavior.BLOCK));

    // Basalt
    public static final BSSWBundle ROUGH_BASALT = new BSSWBundle("rough_basalt", Blocks.BASALT, false);
    public static final BSSWBundle POLISHED_BASALT_BRICKS = new BSSWBundle("polished_basalt_bricks", Blocks.POLISHED_BASALT);
    public static final Block CRACKED_POLISHED_BASALT_BRICKS = register("cracked_polished_basalt_bricks", createCopy(BlockusBlocks.POLISHED_BASALT_BRICKS.block));
    public static final Block CHISELED_POLISHED_BASALT = register("chiseled_polished_basalt", createCopy(BlockusBlocks.POLISHED_BASALT_BRICKS.block));
    public static final Block POLISHED_BASALT_PILLAR = registerPillar("polished_basalt", BlockusBlocks.POLISHED_BASALT_BRICKS.block);
    public static final Block HERRINGBONE_POLISHED_BASALT_BRICKS = register("herringbone_polished_basalt_bricks", createCopy(BlockusBlocks.POLISHED_BASALT_BRICKS.block));

    // Wart Blocks
    public static final BSSWBundle CRIMSON_WART_BRICKS = new BSSWBundle("crimson_wart_bricks", Blocks.NETHER_WART_BLOCK, BlockSoundGroup.NETHER_BRICKS);
    public static final BSSWBundle WARPED_WART_BRICKS = new BSSWBundle("warped_wart_bricks", Blocks.WARPED_WART_BLOCK, BlockSoundGroup.NETHER_BRICKS);

    // Limestone
    public static final BSSWBundle LIMESTONE = new BSSWBundle("limestone", Blocks.STONE, MapColor.OAK_TAN);
    public static final BSSWBundle POLISHED_LIMESTONE = new BSSWBundle("polished_limestone", BlockusBlocks.LIMESTONE.block, false);
    public static final BSSWBundle LIMESTONE_BRICKS = new BSSWBundle("limestone_bricks", LIMESTONE.block);
    public static final BSSWBundle SMALL_LIMESTONE_BRICKS = new BSSWBundle("small_limestone_bricks", LIMESTONE_BRICKS.block);
    public static final BSSWBundle LIMESTONE_TILES = new BSSWBundle("limestone_tiles", LIMESTONE_BRICKS.block);
    public static final Block CHISELED_LIMESTONE = register("chiseled_limestone", createCopy(BlockusBlocks.LIMESTONE_BRICKS.block));
    public static final Block CHISELED_LIMESTONE_BRICKS = registerPillar2("chiseled_limestone_bricks", BlockusBlocks.LIMESTONE_BRICKS.block);
    public static final Block CHISELED_LIMESTONE_PILLAR = registerPillar(BlockusBlocks.CHISELED_LIMESTONE);
    public static final Block LIMESTONE_SQUARES = register("limestone_squares", createCopy(BlockusBlocks.LIMESTONE_BRICKS.block));
    public static final Block LIMESTONE_LINES = registerPillar2("limestone_lines", BlockusBlocks.LIMESTONE_BRICKS.block);
    public static final Block LIMESTONE_PILLAR = registerPillar(BlockusBlocks.LIMESTONE.block);

    // Marble
    public static final BSSWBundle MARBLE = new BSSWBundle("marble", Blocks.STONE, MapColor.OFF_WHITE);
    public static final BSSWBundle POLISHED_MARBLE = new BSSWBundle("polished_marble", BlockusBlocks.MARBLE.block, false);
    public static final BSSWBundle MARBLE_BRICKS = new BSSWBundle("marble_bricks", MARBLE.block);
    public static final BSSWBundle SMALL_MARBLE_BRICKS = new BSSWBundle("small_marble_bricks", MARBLE_BRICKS.block);
    public static final BSSWBundle MARBLE_TILES = new BSSWBundle("marble_tiles", MARBLE_BRICKS.block);
    public static final Block CHISELED_MARBLE = register("chiseled_marble", createCopy(BlockusBlocks.MARBLE_BRICKS.block));
    public static final Block CHISELED_MARBLE_BRICKS = registerPillar2("chiseled_marble_bricks", BlockusBlocks.MARBLE_BRICKS.block);
    public static final Block CHISELED_MARBLE_PILLAR = registerPillar(BlockusBlocks.CHISELED_MARBLE);
    public static final Block MARBLE_SQUARES = register("marble_squares", createCopy(BlockusBlocks.MARBLE_BRICKS.block));
    public static final Block MARBLE_LINES = registerPillar2("marble_lines", BlockusBlocks.MARBLE_BRICKS.block);
    public static final Block MARBLE_PILLAR = registerPillar(BlockusBlocks.MARBLE.block);

    // Bluestone
    public static final BSSWBundle BLUESTONE = new BSSWBundle("bluestone", Blocks.STONE, MapColor.CYAN);
    public static final BSSWBundle POLISHED_BLUESTONE = new BSSWBundle("polished_bluestone", BlockusBlocks.BLUESTONE.block, false);
    public static final BSSWBundle BLUESTONE_BRICKS = new BSSWBundle("bluestone_bricks", BLUESTONE.block);
    public static final BSSWBundle SMALL_BLUESTONE_BRICKS = new BSSWBundle("small_bluestone_bricks", BLUESTONE_BRICKS.block);
    public static final BSSWBundle BLUESTONE_TILES = new BSSWBundle("bluestone_tiles", BLUESTONE_BRICKS.block);
    public static final Block CHISELED_BLUESTONE = register("chiseled_bluestone", createCopy(BlockusBlocks.BLUESTONE_BRICKS.block));
    public static final Block CHISELED_BLUESTONE_BRICKS = registerPillar2("chiseled_bluestone_bricks", BlockusBlocks.BLUESTONE_BRICKS.block);
    public static final Block CHISELED_BLUESTONE_PILLAR = registerPillar(BlockusBlocks.CHISELED_BLUESTONE);
    public static final Block BLUESTONE_SQUARES = register("bluestone_squares", createCopy(BlockusBlocks.BLUESTONE_BRICKS.block));
    public static final Block BLUESTONE_LINES = registerPillar2("bluestone_lines", BlockusBlocks.BLUESTONE_BRICKS.block);
    public static final Block BLUESTONE_PILLAR = registerPillar(BlockusBlocks.BLUESTONE.block);

    // Viridite
    public static final BSSWBundle VIRIDITE = new BSSWBundle("viridite", Blocks.DEEPSLATE, MapColor.DARK_GREEN);
    public static final BSSWBundle POLISHED_VIRIDITE = new BSSWBundle("polished_viridite", BlockusBlocks.VIRIDITE.block, false);
    public static final BSSWBundle VIRIDITE_BRICKS = new BSSWBundle("viridite_bricks", VIRIDITE.block);
    public static final BSSWBundle SMALL_VIRIDITE_BRICKS = new BSSWBundle("small_viridite_bricks", VIRIDITE_BRICKS.block);
    public static final BSSWBundle VIRIDITE_TILES = new BSSWBundle("viridite_tiles", VIRIDITE_BRICKS.block);
    public static final Block CHISELED_VIRIDITE = register("chiseled_viridite", createCopy(BlockusBlocks.VIRIDITE_BRICKS.block));
    public static final Block CHISELED_VIRIDITE_BRICKS = registerPillar2("chiseled_viridite_bricks", BlockusBlocks.VIRIDITE_BRICKS.block);
    public static final Block CHISELED_VIRIDITE_PILLAR = registerPillar(BlockusBlocks.CHISELED_VIRIDITE);
    public static final Block VIRIDITE_SQUARES = register("viridite_squares", createCopy(BlockusBlocks.VIRIDITE_BRICKS.block));
    public static final Block VIRIDITE_LINES = registerPillar2("viridite_lines", BlockusBlocks.VIRIDITE_BRICKS.block);
    public static final Block VIRIDITE_PILLAR = registerPillar(BlockusBlocks.VIRIDITE.block);

    // Lava	Bricks
    public static final BSSWBundle LAVA_BRICKS = new BSSWBundle("lava_bricks", Blocks.STONE_BRICKS, 15);
    public static final Block CHISELED_LAVA_BRICKS = register("chiseled_lava_bricks", createCopy(BlockusBlocks.LAVA_BRICKS.block));

    // Lava Blackstone Bricks
    public static final BSSWBundle LAVA_POLISHED_BLACKSTONE_BRICKS = new BSSWBundle("lava_polished_blackstone_bricks", Blocks.POLISHED_BLACKSTONE_BRICKS, 15);
    public static final Block CHISELED_LAVA_POLISHED_BLACKSTONE = register("chiseled_lava_polished_blackstone", createCopy(BlockusBlocks.LAVA_POLISHED_BLACKSTONE_BRICKS.block));

    // Water Bricks
    public static final BSSWBundle WATER_BRICKS = new BSSWBundle("water_bricks", Blocks.STONE_BRICKS);
    public static final Block CHISELED_WATER_BRICKS = register("chiseled_water_bricks", createCopy(BlockusBlocks.WATER_BRICKS.block));

    // Snow Bricks
    public static final BSSWBundle SNOW_BRICKS = new BSSWBundle("snow_bricks", Blocks.STONE_BRICKS, 1.0f, 3.0f, MapColor.WHITE);
    public static final Block SNOW_PILLAR = registerPillar("snow", SNOW_BRICKS.block);

    // Ice Bricks
    public static final Block ICE_BRICKS = register("ice_bricks", create().mapColor(MapColor.PALE_PURPLE).slipperiness(0.98F).strength(0.5F).sounds(BlockSoundGroup.GLASS));
    public static final Block ICE_PILLAR = registerPillar("ice", ICE_BRICKS);

    // Obsidian
    public static final BSSWBundle OBSIDIAN_BRICKS = new BSSWBundle("obsidian_bricks", Blocks.OBSIDIAN, PistonBehavior.BLOCK);
    public static final BSSWBundle SMALL_OBSIDIAN_BRICKS = new BSSWBundle("small_obsidian_bricks", OBSIDIAN_BRICKS.block);
    public static final Block CRACKED_OBSIDIAN_BRICKS = register("cracked_obsidian_bricks", createCopy(BlockusBlocks.OBSIDIAN_BRICKS.block));
    public static final Block OBSIDIAN_PILLAR = registerPillar("obsidian", BlockusBlocks.OBSIDIAN_BRICKS.block);
    public static final Block GLOWING_OBSIDIAN = register("glowing_obsidian", createCopy(Blocks.OBSIDIAN, PistonBehavior.BLOCK).luminance((state) -> 15));


    // Magma Bricks
    public static final BSSWBundle MAGMA_BRICKS = new BSSWBundle("magma_bricks", Blocks.MAGMA_BLOCK, 15);
    public static final BSSWBundle SMALL_MAGMA_BRICKS = new BSSWBundle("small_magma_bricks", Blocks.MAGMA_BLOCK, 15);
    public static final Block CHISELED_MAGMA_BRICKS = register("chiseled_magma_bricks", createCopy(BlockusBlocks.MAGMA_BRICKS.block));

    // Nether Bricks
    public static final BSSWBundle POLISHED_NETHER_BRICKS = new BSSWBundle("polished_nether_bricks", Blocks.NETHER_BRICKS, false);
    public static final BSSWBundle POLISHED_RED_NETHER_BRICKS = new BSSWBundle("polished_red_nether_bricks", Blocks.RED_NETHER_BRICKS, false);
    public static final Block HERRINGBONE_NETHER_BRICKS = register("herringbone_nether_bricks", createCopy(Blocks.NETHER_BRICKS));
    public static final Block HERRINGBONE_RED_NETHER_BRICKS = register("herringbone_red_nether_bricks", createCopy(Blocks.RED_NETHER_BRICKS));
    public static final Block NETHER_BRICK_PILLAR = registerPillar(Blocks.NETHER_BRICKS);
    public static final Block RED_NETHER_BRICK_PILLAR = registerPillar(Blocks.RED_NETHER_BRICKS);
    public static final BSSWBundle NETHER_TILES = new BSSWBundle("nether_tiles", Blocks.NETHER_BRICKS);

    // Prismarine
    public static final Block CHISELED_PRISMARINE = register("chiseled_prismarine", createCopy(Blocks.PRISMARINE_BRICKS));
    public static final Block PRISMARINE_PILLAR = registerPillar("prismarine", Blocks.PRISMARINE_BRICKS);
    public static final Block CHISELED_DARK_PRISMARINE = register("chiseled_dark_prismarine", OrientableBlockBase::new, createCopy(Blocks.DARK_PRISMARINE));
    public static final Block DARK_PRISMARINE_PILLAR = registerPillar("dark_prismarine", Blocks.DARK_PRISMARINE);
    public static final BSSWBundle PRISMARINE_TILES = new BSSWBundle("prismarine_tiles", Blocks.DARK_PRISMARINE);

    // Bricks
    public static final BSSWBundle LARGE_BRICKS = new BSSWBundle("large_bricks", Blocks.BRICKS);
    public static final Block HERRINGBONE_BRICKS = register("herringbone_bricks", createCopy(Blocks.BRICKS));

    // Soaked Bricks
    public static final BSSWBundle SOAKED_BRICKS = new BSSWBundle("soaked_bricks", Blocks.BRICKS);
    public static final Block HERRINGBONE_SOAKED_BRICKS = register("herringbone_soaked_bricks", createCopy(BlockusBlocks.SOAKED_BRICKS.block));

    // Sandy Bricks
    public static final BSSWBundle SANDY_BRICKS = new BSSWBundle("sandy_bricks", Blocks.BRICKS);
    public static final Block HERRINGBONE_SANDY_BRICKS = register("herringbone_sandy_bricks", createCopy(BlockusBlocks.SANDY_BRICKS.block));

    // Resin Bricks
    public static final BSSWBundle LARGE_RESIN_BRICKS = new BSSWBundle("large_resin_bricks", Blocks.RESIN_BRICKS);
    public static final Block HERRINGBONE_RESIN_BRICKS = register("herringbone_resin_bricks", createCopy(Blocks.RESIN_BRICKS));
    public static final Block RESIN_BRICK_PILLAR = registerPillar(Blocks.RESIN_BRICKS);

    // Sandstone
    public static final BSSWBundle ROUGH_SANDSTONE = new BSSWBundle("rough_sandstone", Blocks.SANDSTONE, false);
    public static final BSSWBundle SANDSTONE_BRICKS = new BSSWBundle("sandstone_bricks", Blocks.SANDSTONE);
    public static final BSSWBundle SMALL_SANDSTONE_BRICKS = new BSSWBundle("small_sandstone_bricks", Blocks.SANDSTONE);
    public static final Block SANDSTONE_PILLAR = registerPillar("sandstone", Blocks.SANDSTONE);
    public static final Block GOLD_DECORATED_SANDSTONE = register("gold_decorated_sandstone", createCopy(Blocks.SANDSTONE));
    public static final Block LAPIS_DECORATED_SANDSTONE = register("lapis_decorated_sandstone", createCopy(Blocks.SANDSTONE));

    // Red Sandstone
    public static final BSSWBundle ROUGH_RED_SANDSTONE = new BSSWBundle("rough_red_sandstone", Blocks.RED_SANDSTONE, false);
    public static final BSSWBundle RED_SANDSTONE_BRICKS = new BSSWBundle("red_sandstone_bricks", Blocks.RED_SANDSTONE);
    public static final BSSWBundle SMALL_RED_SANDSTONE_BRICKS = new BSSWBundle("small_red_sandstone_bricks", Blocks.RED_SANDSTONE);
    public static final Block RED_SANDSTONE_PILLAR = registerPillar("red_sandstone", Blocks.RED_SANDSTONE);
    public static final Block GOLD_DECORATED_RED_SANDSTONE = register("gold_decorated_red_sandstone", createCopy(Blocks.RED_SANDSTONE));
    public static final Block LAPIS_DECORATED_RED_SANDSTONE = register("lapis_decorated_red_sandstone", createCopy(Blocks.RED_SANDSTONE));

    // Soul Sandstone
    public static final BSSWBundle SOUL_SANDSTONE = new BSSWBundle("soul_sandstone", Blocks.SANDSTONE, MapColor.BROWN);
    public static final BSSWBundle ROUGH_SOUL_SANDSTONE = new BSSWBundle("rough_soul_sandstone", BlockusBlocks.SOUL_SANDSTONE.block, false);
    public static final BSSWBundle SOUL_SANDSTONE_BRICKS = new BSSWBundle("soul_sandstone_bricks", SOUL_SANDSTONE.block);
    public static final BSSWBundle SMALL_SOUL_SANDSTONE_BRICKS = new BSSWBundle("small_soul_sandstone_bricks", SOUL_SANDSTONE.block);
    public static final BSSWBundle SMOOTH_SOUL_SANDSTONE = new BSSWBundle("smooth_soul_sandstone", BlockusBlocks.SOUL_SANDSTONE.block, false);
    public static final Block CUT_SOUL_SANDSTONE = register("cut_soul_sandstone", createCopy(BlockusBlocks.SOUL_SANDSTONE.block));
    public static final Block CHISELED_SOUL_SANDSTONE = register("chiseled_soul_sandstone", createCopy(BlockusBlocks.SOUL_SANDSTONE.block));
    public static final Block SOUL_SANDSTONE_PILLAR = registerPillar("soul_sandstone", BlockusBlocks.SOUL_SANDSTONE.block);
    public static final Block GOLD_DECORATED_SOUL_SANDSTONE = register("gold_decorated_soul_sandstone", createCopy(BlockusBlocks.SOUL_SANDSTONE.block));
    public static final Block LAPIS_DECORATED_SOUL_SANDSTONE = register("lapis_decorated_soul_sandstone", createCopy(BlockusBlocks.SOUL_SANDSTONE.block));

    // Rainbow
    public static final Block RAINBOW_ROSE = register("rainbow_rose", (settings) -> new FertilizableFlowerBlock(StatusEffects.GLOWING, 8, settings), create().mapColor(MapColor.DARK_GREEN).noCollision().breakInstantly().pistonBehavior(PistonBehavior.DESTROY).sounds(BlockSoundGroup.GRASS).offset(AbstractBlock.OffsetType.XZ));
    public static final Item RAINBOW_PETALS = BlockusItems.register("rainbow_petal");

    public static final Block POTTED_RAINBOW_ROSE = pottedPlant("potted_rainbow_rose", RAINBOW_ROSE);
    public static final Block RAINBOW_BLOCK = register("rainbow_block", FullFacingBlock::new, create().mapColor(MapColor.LIGHT_BLUE).strength(5.0f, 6.0f).requiresTool());
    public static final BSSWBundle RAINBOW_BRICKS = new BSSWBundle("rainbow_bricks", Blocks.BRICKS);
    public static final Block RAINBOW_GLOWSTONE = register("rainbow_glowstone", createCopy(Blocks.GLOWSTONE));

    // Honeycomb Bricks
    public static final BSSWBundle HONEYCOMB_BRICKS = new BSSWBundle("honeycomb_bricks", Blocks.BRICKS);

    // Purpur Blocks
    public static final BSSWBundle PURPUR_BRICKS = new BSSWBundle("purpur_bricks", Blocks.PURPUR_BLOCK);
    public static final BSSWBundle SMALL_PURPUR_BRICKS = new BSSWBundle("small_purpur_bricks", Blocks.PURPUR_BLOCK);
    public static final BSSWBundle POLISHED_PURPUR = new BSSWBundle("polished_purpur", Blocks.PURPUR_BLOCK, false);
    public static final Block CHISELED_PURPUR = register("chiseled_purpur", createCopy(BlockusBlocks.PURPUR_BRICKS.block));
    public static final Block PURPUR_SQUARES = register("purpur_squares", createCopy(BlockusBlocks.PURPUR_BRICKS.block));
    public static final Block PURPUR_LINES = registerPillar2("purpur_lines", BlockusBlocks.PURPUR_BRICKS.block);

    // Phantom Purpur Blocks
    public static final BSSWBundle PHANTOM_PURPUR_BRICKS = new BSSWBundle("phantom_purpur_bricks", Blocks.PURPUR_BLOCK);
    public static final BSSWBundle SMALL_PHANTOM_PURPUR_BRICKS = new BSSWBundle("small_phantom_purpur_bricks", Blocks.PURPUR_BLOCK);
    public static final BSSWBundle PHANTOM_PURPUR_BLOCK = new BSSWBundle("phantom_purpur_block", Blocks.PURPUR_BLOCK, false);
    public static final BSSWBundle POLISHED_PHANTOM_PURPUR = new BSSWBundle("polished_phantom_purpur", Blocks.PURPUR_BLOCK, false);
    public static final Block PHANTOM_PURPUR_PILLAR = registerPillar("phantom_purpur", Blocks.PURPUR_PILLAR);
    public static final Block CHISELED_PHANTOM_PURPUR = register("chiseled_phantom_purpur", createCopy(BlockusBlocks.PHANTOM_PURPUR_BRICKS.block));
    public static final Block PHANTOM_PURPUR_SQUARES = register("phantom_purpur_squares", createCopy(BlockusBlocks.PHANTOM_PURPUR_BRICKS.block));
    public static final Block PHANTOM_PURPUR_LINES = registerPillar2("phantom_purpur_lines", BlockusBlocks.PHANTOM_PURPUR_BRICKS.block);

    // End Stone
    public static final BSSWBundle POLISHED_END_STONE = new BSSWBundle("polished_end_stone", Blocks.END_STONE, false);
    public static final BSSWBundle SMALL_END_STONE_BRICKS = new BSSWBundle("small_end_stone_bricks", Blocks.END_STONE);
    public static final Block CHISELED_END_STONE_BRICKS = register("chiseled_end_stone_bricks", createCopy(Blocks.END_STONE_BRICKS));
    public static final Block HERRINGBONE_END_STONE_BRICKS = register("herringbone_end_stone_bricks", createCopy(Blocks.END_STONE_BRICKS));
    public static final Block CRACKED_END_STONE_BRICKS = register("cracked_end_stone_bricks", createCopy(Blocks.END_STONE_BRICKS));
    public static final Block END_STONE_PILLAR = registerPillar("end_stone", Blocks.END_STONE_BRICKS);
    public static final Block PURPUR_DECORATED_END_STONE = register("purpur_decorated_end_stone", createCopy(Blocks.END_STONE_BRICKS));
    public static final Block PHANTOM_PURPUR_DECORATED_END_STONE = register("phantom_purpur_decorated_end_stone", createCopy(Blocks.END_STONE_BRICKS));
    public static final BSSWBundle END_TILES = new BSSWBundle("end_tiles", Blocks.END_STONE_BRICKS);

    // White Oak Wood
    public static final Block WHITE_OAK_SAPLING = register("white_oak_sapling", (settings) -> new SaplingBlock(BlockusSaplingGenerator.WHITE_OAK, settings), createCopy(Blocks.OAK_SAPLING).pistonBehavior(PistonBehavior.DESTROY));
    public static final Block POTTED_WHITE_OAK_SAPLING = pottedPlant("potted_white_oak_sapling", WHITE_OAK_SAPLING);
    public static final Block WHITE_OAK_LOG = register("white_oak_log", PillarBlock::new, createCopy(Blocks.OAK_LOG).mapColor(MapColor.TERRACOTTA_LIGHT_GRAY));
    public static final Block STRIPPED_WHITE_OAK_LOG = registerPillar2("stripped_white_oak_log", WHITE_OAK_LOG);
    public static final Block WHITE_OAK_WOOD = registerPillar2("white_oak_wood", WHITE_OAK_LOG);
    public static final Block STRIPPED_WHITE_OAK_WOOD = registerPillar2("stripped_white_oak_wood", WHITE_OAK_LOG);
    public static final Block WHITE_OAK_LEAVES = register("white_oak_leaves", (settings) -> new UntintedParticleLeavesBlock(0.01F, EntityEffectParticleEffect.create(ParticleTypes.TINTED_LEAVES, 14061641), settings), createCopy(Blocks.OAK_LEAVES).mapColor(MapColor.ORANGE).pistonBehavior(PistonBehavior.DESTROY).allowsSpawning(BlockusBlocks::canSpawnOnLeaves).suffocates(BlockusBlocks::never).blockVision(BlockusBlocks::never));
    // Mosaics
    public static final BSSWBundle OAK_MOSAIC = new BSSWBundle("oak_mosaic", Blocks.OAK_PLANKS, false);
    public static final BSSWBundle SPRUCE_MOSAIC = new BSSWBundle("spruce_mosaic", Blocks.SPRUCE_PLANKS, false);
    public static final BSSWBundle BIRCH_MOSAIC = new BSSWBundle("birch_mosaic", Blocks.BIRCH_PLANKS, false);
    public static final BSSWBundle JUNGLE_MOSAIC = new BSSWBundle("jungle_mosaic", Blocks.JUNGLE_PLANKS, false);
    public static final BSSWBundle ACACIA_MOSAIC = new BSSWBundle("acacia_mosaic", Blocks.ACACIA_PLANKS, false);
    public static final BSSWBundle DARK_OAK_MOSAIC = new BSSWBundle("dark_oak_mosaic", Blocks.DARK_OAK_PLANKS, false);
    public static final BSSWBundle MANGROVE_MOSAIC = new BSSWBundle("mangrove_mosaic", Blocks.MANGROVE_PLANKS, false);
    public static final BSSWBundle CHERRY_MOSAIC = new BSSWBundle("cherry_mosaic", Blocks.CHERRY_PLANKS, false);
    public static final BSSWBundle PALE_OAK_MOSAIC = new BSSWBundle("pale_oak_mosaic", Blocks.PALE_OAK_PLANKS, false);
    public static final BSSWBundle CRIMSON_MOSAIC = new BSSWBundle("crimson_mosaic", Blocks.CRIMSON_PLANKS, false);
    public static final BSSWBundle WARPED_MOSAIC = new BSSWBundle("warped_mosaic", Blocks.WARPED_PLANKS, false);


    // Mossy Planks
    public static final BSSWBundle MOSSY_OAK_PLANKS = new BSSWBundle("mossy_oak_planks", Blocks.OAK_PLANKS, false);
    public static final BSSWBundle MOSSY_SPRUCE_PLANKS = new BSSWBundle("mossy_spruce_planks", Blocks.SPRUCE_PLANKS, false);
    public static final BSSWBundle MOSSY_BIRCH_PLANKS = new BSSWBundle("mossy_birch_planks", Blocks.BIRCH_PLANKS, false);
    public static final BSSWBundle MOSSY_JUNGLE_PLANKS = new BSSWBundle("mossy_jungle_planks", Blocks.JUNGLE_PLANKS, false);
    public static final BSSWBundle MOSSY_ACACIA_PLANKS = new BSSWBundle("mossy_acacia_planks", Blocks.ACACIA_PLANKS, false);
    public static final BSSWBundle MOSSY_DARK_OAK_PLANKS = new BSSWBundle("mossy_dark_oak_planks", Blocks.DARK_OAK_PLANKS, false);
    public static final BSSWBundle MOSSY_MANGROVE_PLANKS = new BSSWBundle("mossy_mangrove_planks", Blocks.MANGROVE_PLANKS, false);
    public static final BSSWBundle MOSSY_CHERRY_PLANKS = new BSSWBundle("mossy_cherry_planks", Blocks.CHERRY_PLANKS, false);
    public static final BSSWBundle MOSSY_PALE_OAK_PLANKS = new BSSWBundle("mossy_pale_oak_planks", Blocks.PALE_OAK_PLANKS, false);
    public static final BSSWBundle MOSSY_BAMBOO_PLANKS = new BSSWBundle("mossy_bamboo_planks", Blocks.BAMBOO_PLANKS, false);
    public static final BSSWBundle MOSSY_CRIMSON_PLANKS = new BSSWBundle("mossy_crimson_planks", Blocks.CRIMSON_PLANKS, false);
    public static final BSSWBundle MOSSY_WARPED_PLANKS = new BSSWBundle("mossy_warped_planks", Blocks.WARPED_PLANKS, false);

    // Herringbone Planks
    public static final Block HERRINGBONE_OAK_PLANKS = register("herringbone_oak_planks", createCopy(Blocks.OAK_PLANKS));
    public static final Block HERRINGBONE_SPRUCE_PLANKS = register("herringbone_spruce_planks", createCopy(Blocks.SPRUCE_PLANKS));
    public static final Block HERRINGBONE_BIRCH_PLANKS = register("herringbone_birch_planks", createCopy(Blocks.BIRCH_PLANKS));
    public static final Block HERRINGBONE_JUNGLE_PLANKS = register("herringbone_jungle_planks", createCopy(Blocks.JUNGLE_PLANKS));
    public static final Block HERRINGBONE_ACACIA_PLANKS = register("herringbone_acacia_planks", createCopy(Blocks.ACACIA_PLANKS));
    public static final Block HERRINGBONE_DARK_OAK_PLANKS = register("herringbone_dark_oak_planks", createCopy(Blocks.DARK_OAK_PLANKS));
    public static final Block HERRINGBONE_MANGROVE_PLANKS = register("herringbone_mangrove_planks", createCopy(Blocks.MANGROVE_PLANKS));
    public static final Block HERRINGBONE_CHERRY_PLANKS = register("herringbone_cherry_planks", createCopy(Blocks.CHERRY_PLANKS));
    public static final Block HERRINGBONE_PALE_OAK_PLANKS = register("herringbone_pale_oak_planks", createCopy(Blocks.PALE_OAK_PLANKS));
    public static final Block HERRINGBONE_BAMBOO_PLANKS = register("herringbone_bamboo_planks", createCopy(Blocks.BAMBOO_PLANKS));
    public static final Block HERRINGBONE_CRIMSON_PLANKS = register("herringbone_crimson_planks", createCopy(Blocks.CRIMSON_PLANKS));
    public static final Block HERRINGBONE_WARPED_PLANKS = register("herringbone_warped_planks", createCopy(Blocks.WARPED_PLANKS));

    // Chocolate
    public static final BSSWBundle CHOCOLATE_BLOCK = new BSSWBundle("chocolate_block", 1.0F, 1.0F, MapColor.BROWN, false);
    public static final BSSWBundle CHOCOLATE_BRICKS = new BSSWBundle("chocolate_bricks", BlockusBlocks.CHOCOLATE_BLOCK.block);
    public static final Block CHOCOLATE_SQUARES = register("chocolate_squares", createCopy(BlockusBlocks.CHOCOLATE_BRICKS.block));
    public static final Block CHOCOLATE_TABLET = register("chocolate_tablet", ChocolateTabletBlock::new, createCopy(BlockusBlocks.CHOCOLATE_BLOCK.block).strength(0.2F, 1.0F));

    // Food Blocks
    public static final Block SWEET_BERRIES_CRATE = crate("sweet_berries_crate");
    public static final Block GLOW_BERRIES_CRATE = crate("glow_berries_crate", 14);
    public static final Block SALMON_CRATE = crate("salmon_crate");
    public static final Block PUFFERFISH_CRATE = crate("pufferfish_crate");
    public static final Block TROPICAL_FISH_CRATE = crate("tropical_fish_crate");
    public static final Block COD_CRATE = crate("cod_crate");
    public static final Block COOKIE_BLOCK = register("cookie_block", CookieBlock::new, create().mapColor(MapColor.ORANGE).strength(0.5F).sounds(BlockSoundGroup.GRASS));
    public static final Block CHORUS_BLOCK = register("chorus_block", PillarBlock::new, create().mapColor(MapColor.PURPLE).strength(0.5f).sounds(BlockSoundGroup.GRASS));
    public static final Block POTATO_CRATE = crate("potato_crate");
    public static final Block APPLE_CRATE = crate("apple_crate");
    public static final Block GOLDEN_APPLE_CRATE = crate("golden_apple_crate");
    public static final Block BEETROOT_CRATE = crate("beetroot_crate");
    public static final Block CARROT_CRATE = crate("carrot_crate");
    public static final Block GOLDEN_CARROT_CRATE = crate("golden_carrot_crate");
    public static final Block BREAD_BOX = register("bread_box", OrientableBlockBase::new, createCopy(Blocks.OAK_PLANKS).strength(2.5f));

    // Stained Stone Bricks
    public static final BSSWBundle WHITE_STONE_BRICKS = new BSSWBundle("white_stone_bricks", Blocks.STONE_BRICKS, MapColor.WHITE);
    public static final BSSWBundle GRAY_STONE_BRICKS = new BSSWBundle("gray_stone_bricks", Blocks.STONE_BRICKS, MapColor.GRAY);
    public static final BSSWBundle BLACK_STONE_BRICKS = new BSSWBundle("black_stone_bricks", Blocks.STONE_BRICKS, MapColor.BLACK);
    public static final BSSWBundle BROWN_STONE_BRICKS = new BSSWBundle("brown_stone_bricks", Blocks.STONE_BRICKS, MapColor.BROWN);
    public static final BSSWBundle RED_STONE_BRICKS = new BSSWBundle("red_stone_bricks", Blocks.STONE_BRICKS, MapColor.RED);
    public static final BSSWBundle ORANGE_STONE_BRICKS = new BSSWBundle("orange_stone_bricks", Blocks.STONE_BRICKS, MapColor.ORANGE);
    public static final BSSWBundle YELLOW_STONE_BRICKS = new BSSWBundle("yellow_stone_bricks", Blocks.STONE_BRICKS, MapColor.YELLOW);
    public static final BSSWBundle LIME_STONE_BRICKS = new BSSWBundle("lime_stone_bricks", Blocks.STONE_BRICKS, MapColor.LIME);
    public static final BSSWBundle GREEN_STONE_BRICKS = new BSSWBundle("green_stone_bricks", Blocks.STONE_BRICKS, MapColor.GREEN);
    public static final BSSWBundle CYAN_STONE_BRICKS = new BSSWBundle("cyan_stone_bricks", Blocks.STONE_BRICKS, MapColor.CYAN);
    public static final BSSWBundle LIGHT_BLUE_STONE_BRICKS = new BSSWBundle("light_blue_stone_bricks", Blocks.STONE_BRICKS, MapColor.LIGHT_BLUE);
    public static final BSSWBundle BLUE_STONE_BRICKS = new BSSWBundle("blue_stone_bricks", Blocks.STONE_BRICKS, MapColor.BLUE);
    public static final BSSWBundle PURPLE_STONE_BRICKS = new BSSWBundle("purple_stone_bricks", Blocks.STONE_BRICKS, MapColor.PURPLE);
    public static final BSSWBundle MAGENTA_STONE_BRICKS = new BSSWBundle("magenta_stone_bricks", Blocks.STONE_BRICKS, MapColor.MAGENTA);
    public static final BSSWBundle PINK_STONE_BRICKS = new BSSWBundle("pink_stone_bricks", Blocks.STONE_BRICKS, MapColor.PINK);

    // Asphalt
    public static final AsphaltBundle ASPHALT = new AsphaltBundle(DyeColor.BLACK);
    public static final AsphaltBundle WHITE_ASPHALT = new AsphaltBundle(DyeColor.WHITE);
    public static final AsphaltBundle LIGHT_GRAY_ASPHALT = new AsphaltBundle(DyeColor.LIGHT_GRAY);
    public static final AsphaltBundle GRAY_ASPHALT = new AsphaltBundle(DyeColor.GRAY);
    public static final AsphaltBundle BROWN_ASPHALT = new AsphaltBundle(DyeColor.BROWN);
    public static final AsphaltBundle RED_ASPHALT = new AsphaltBundle(DyeColor.RED);
    public static final AsphaltBundle ORANGE_ASPHALT = new AsphaltBundle(DyeColor.ORANGE);
    public static final AsphaltBundle YELLOW_ASPHALT = new AsphaltBundle(DyeColor.YELLOW);
    public static final AsphaltBundle LIME_ASPHALT = new AsphaltBundle(DyeColor.LIME);
    public static final AsphaltBundle GREEN_ASPHALT = new AsphaltBundle(DyeColor.GREEN);
    public static final AsphaltBundle CYAN_ASPHALT = new AsphaltBundle(DyeColor.CYAN);
    public static final AsphaltBundle LIGHT_BLUE_ASPHALT = new AsphaltBundle(DyeColor.LIGHT_BLUE);
    public static final AsphaltBundle BLUE_ASPHALT = new AsphaltBundle(DyeColor.BLUE);
    public static final AsphaltBundle PURPLE_ASPHALT = new AsphaltBundle(DyeColor.PURPLE);
    public static final AsphaltBundle MAGENTA_ASPHALT = new AsphaltBundle(DyeColor.MAGENTA);
    public static final AsphaltBundle PINK_ASPHALT = new AsphaltBundle(DyeColor.PINK);
    public static final Block RAINBOW_ASPHALT = AsphaltBundle.register("rainbow_asphalt", RainbowAsphalt::new, create().mapColor(DyeColor.BLUE).instrument(NoteBlockInstrument.BASEDRUM).strength(1.5f, 6.0f).requiresTool());

    // Thatch
    public static final BSSWBundle THATCH = new BSSWBundle("thatch", Blocks.HAY_BLOCK, false);

    // Paper
    public static final Block PAPER_BLOCK = register("paper_block", create().mapColor(MapColor.OFF_WHITE).strength(0.1f, 0.8f).sounds(BlockSoundGroup.GRASS));
    public static final Block BURNT_PAPER_BLOCK = register("burnt_paper_block", create().mapColor(MapColor.STONE_GRAY).strength(0.1f, 0.8f).sounds(BlockSoundGroup.GRASS));
    public static final Block FRAMED_PAPER_BLOCK = register("framed_paper_block", create().mapColor(MapColor.OFF_WHITE).instrument(NoteBlockInstrument.BASS).strength(0.1f, 0.8f).sounds(BlockSoundGroup.WOOD).burnable());
    public static final Block PAPER_LAMP = register("paper_lamp", PaperLampBlock::new, create().mapColor(MapColor.OFF_WHITE).strength(0.1f, 0.8f).sounds(BlockSoundGroup.GRASS).luminance((state) -> 15).instrument(NoteBlockInstrument.BASS));

    // Plating
    public static final BSSWBundle IRON_PLATING = new BSSWBundle("iron_plating", Blocks.IRON_BLOCK, MapColor.STONE_GRAY, false);
    public static final BSSWBundle GOLD_PLATING = new BSSWBundle("gold_plating", Blocks.GOLD_BLOCK, false);

    // Lantern Blocks
    public static final Block LANTERN_BLOCK = register("lantern_block", createCopy(Blocks.LANTERN, PistonBehavior.NORMAL));
    public static final Block SOUL_LANTERN_BLOCK = register("soul_lantern_block", createCopy(Blocks.SOUL_LANTERN, PistonBehavior.NORMAL));
    public static final Block SOUL_O_LANTERN = register("soul_o_lantern", CarvedPumpkinBlock::new, createCopy(Blocks.JACK_O_LANTERN).luminance((state) -> 10));

    // Other
    public static final Block PATH = register("path", DirtPathBlock::new, createCopy(Blocks.DIRT_PATH));
    public static final Block CHARCOAL_BLOCK = register("charcoal_block", createCopy(Blocks.COAL_BLOCK));
    public static final Block SUGAR_BLOCK = register("sugar_block", SimpleFallingBlock::new, create().mapColor(MapColor.OFF_WHITE).strength(0.5F).sounds(BlockSoundGroup.SAND));
    public static final Block ENDER_BLOCK = register("ender_block", create().mapColor(MapColor.TERRACOTTA_GREEN).strength(5.0f, 6.0f));
    public static final Block ROTTEN_FLESH_BLOCK = register("rotten_flesh_block", create().mapColor(MapColor.TERRACOTTA_RED).strength(0.5f).sounds(BlockSoundGroup.SLIME));
    public static final Block MEMBRANE_BLOCK = register("membrane_block", create().mapColor(MapColor.TERRACOTTA_WHITE).strength(0.5f).sounds(BlockSoundGroup.SLIME));
    public static final Block NETHER_STAR_BLOCK = registerNetherStarBlock("nether_stars_block", NetherStarBlock::new, create().mapColor(MapColor.OFF_WHITE).strength(5.0f, 6.0f).requiresTool());
    public static final Block REDSTONE_SAND = register("redstone_sand", FallingRedstoneBlock::new, createCopy(Blocks.SAND).mapColor(MapColor.BRIGHT_RED));
    public static final Block LOVE_BLOCK = register("love_block", LoveBlock::new, create().mapColor(MapColor.PINK).strength(2, 6.0f).requiresTool());
    public static final Block WEIGHT_STORAGE_CUBE = register("weight_storage_cube", WeightStorageCubeBlock::new, create().mapColor(MapColor.IRON_GRAY).strength(0.1f, 6.0f));
    public static final Block COMPANION_CUBE = register("companion_cube", SimpleFallingBlock::new, create().mapColor(MapColor.IRON_GRAY).strength(0.1F, 6.0F).sounds(BlockSoundGroup.STONE));
    public static final Block CAUTION_BLOCK = register("caution_block", create().mapColor(MapColor.ORANGE).strength(1.5f, 1200.0f).requiresTool());
    public static final Block STARS_BLOCK = register("stars_block", create().mapColor(MapColor.BLACK).strength(5.0f, 6.0f));


    // Colored Tiles
    /**
     * <p>Bicolor variants in {@link }.
     */
    public static final Block WHITE_COLORED_TILES = register("white_colored_tiles", createCopy(Blocks.WHITE_CONCRETE));
    public static final Block ORANGE_COLORED_TILES = register("orange_colored_tiles", createCopy(Blocks.ORANGE_CONCRETE));
    public static final Block MAGENTA_COLORED_TILES = register("magenta_colored_tiles", createCopy(Blocks.MAGENTA_CONCRETE));
    public static final Block LIGHT_BLUE_COLORED_TILES = register("light_blue_colored_tiles", createCopy(Blocks.LIGHT_BLUE_CONCRETE));
    public static final Block YELLOW_COLORED_TILES = register("yellow_colored_tiles", createCopy(Blocks.YELLOW_CONCRETE));
    public static final Block LIME_COLORED_TILES = register("lime_colored_tiles", createCopy(Blocks.LIME_CONCRETE));
    public static final Block PINK_COLORED_TILES = register("pink_colored_tiles", createCopy(Blocks.PINK_CONCRETE));
    public static final Block GRAY_COLORED_TILES = register("gray_colored_tiles", createCopy(Blocks.GRAY_CONCRETE));
    public static final Block LIGHT_GRAY_COLORED_TILES = register("light_gray_colored_tiles", createCopy(Blocks.LIGHT_GRAY_CONCRETE));
    public static final Block CYAN_COLORED_TILES = register("cyan_colored_tiles", createCopy(Blocks.CYAN_CONCRETE));
    public static final Block PURPLE_COLORED_TILES = register("purple_colored_tiles", createCopy(Blocks.PURPLE_CONCRETE));
    public static final Block BLUE_COLORED_TILES = register("blue_colored_tiles", createCopy(Blocks.BLUE_CONCRETE));
    public static final Block BROWN_COLORED_TILES = register("brown_colored_tiles", createCopy(Blocks.BROWN_CONCRETE));
    public static final Block GREEN_COLORED_TILES = register("green_colored_tiles", createCopy(Blocks.GREEN_CONCRETE));
    public static final Block RED_COLORED_TILES = register("red_colored_tiles", createCopy(Blocks.RED_CONCRETE));
    public static final Block BLACK_COLORED_TILES = register("black_colored_tiles", createCopy(Blocks.BLACK_CONCRETE));
    public static final Block RAINBOW_COLORED_TILES = register("rainbow_colored_tiles", HorizontalAxisBlock::new, createCopy(Blocks.LIGHT_BLUE_CONCRETE));

}
