package com.brand.blockus.datagen.providers;

import com.brand.blockus.Blockus;
import com.brand.blockus.blocks.base.PostBlock;
import com.brand.blockus.datagen.family.BlockusFamilies;
import com.brand.blockus.datagen.models.BlockusModels;
import com.brand.blockus.datagen.models.BlockusTextureKey;
import com.brand.blockus.registry.content.BlockusBlocks;
import com.brand.blockus.registry.content.BlockusEntities;
import com.brand.blockus.registry.content.bundles.*;
import net.fabricmc.fabric.api.client.datagen.v1.provider.FabricModelProvider;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.client.data.*;
import net.minecraft.client.render.model.json.WeightedVariant;
import net.minecraft.data.family.BlockFamily;
import net.minecraft.item.Item;
import net.minecraft.state.property.Properties;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.Direction;

import static net.minecraft.client.data.BlockStateModelGenerator.*;
import static net.minecraft.registry.Registries.BLOCK;

public class BlockusModelProvider extends FabricModelProvider {

    public BlockusModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator modelGenerator) {

        BlockusFamilies.getFamilies().filter(BlockFamily::shouldGenerateModels).forEach((family) -> {
            modelGenerator.registerCubeAllModelTexturePool(family.getBaseBlock()).family(family);
        });

        for (BSSWBundle BSSWBundle : BSSWBundle.values()) {
            // Rough Sandstones
            if (BSSWBundle.type.contains("rough") && BSSWBundle.type.contains("sandstone")) {
                this.registerBlockStairsSlabWithBottom(modelGenerator, BSSWBundle.block, BSSWBundle.base);
            }
            // Smooth Sandstones & Rough Basalt
            else if ((BSSWBundle.type.contains("smooth") && BSSWBundle.type.contains("sandstone")) ||
                BSSWBundle.block == BlockusBlocks.ROUGH_BASALT.block) {
                this.registerBlockStairsSlabWithTop(modelGenerator, BSSWBundle.block, BSSWBundle.base);
            }
            // Soul Sandstone
            else if (BSSWBundle.block == BlockusBlocks.SOUL_SANDSTONE.block) {
                this.registerBlockStairsSlabwithTopBottom(modelGenerator, BSSWBundle.block);
            }
            // Autre
            else {
                this.registerBlockStairsAndSlab(modelGenerator, BSSWBundle.block);
            }


        }

        for (ConcreteBundle concreteType : ConcreteBundle.values()) {
            this.registerBlockStairsSlabAndWall(modelGenerator, concreteType.block);
        }

        for (TimberFrameBundle timberFrameBundle : TimberFrameBundle.values()) {
            modelGenerator.registerSimpleCubeAll(timberFrameBundle.block);
            modelGenerator.registerSimpleCubeAll(timberFrameBundle.cross);
            this.registerDiagonalTimberFrame(modelGenerator, timberFrameBundle.diagonal);
            modelGenerator.registerGlassAndPane(timberFrameBundle.grate, timberFrameBundle.lattice);
        }

        for (AsphaltBundle asphaltBundle : AsphaltBundle.values()) {
            this.registerBlockStairsAndSlab(modelGenerator, asphaltBundle.block);
        }

        for (WoolBundle woolBundle : WoolBundle.values()) {
            this.registerBlockStairsAndSlab(modelGenerator, woolBundle.block);
            this.registerCarpet(modelGenerator, woolBundle.block, woolBundle.carpet);
        }

        for (PottedLargeBundle pottedLargeBundle : PottedLargeBundle.values()) {
            modelGenerator.registerSimpleState(pottedLargeBundle.block);
        }

        // Stone
        this.registerPillar(modelGenerator, BlockusBlocks.STONE_BRICK_PILLAR);
        modelGenerator.registerSimpleCubeAll(BlockusBlocks.HERRINGBONE_STONE_BRICKS);
        this.registerSturdyStone(modelGenerator);
        this.registerSmoothStoneStairs(modelGenerator);

        // Andesite
        modelGenerator.registerSimpleCubeAll(BlockusBlocks.CHISELED_ANDESITE_BRICKS);
        modelGenerator.registerSimpleCubeAll(BlockusBlocks.CRACKED_ANDESITE_BRICKS);
        this.registerPillar(modelGenerator, BlockusBlocks.POLISHED_ANDESITE_PILLAR);
        modelGenerator.registerSimpleCubeAll(BlockusBlocks.HERRINGBONE_ANDESITE_BRICKS);

        // Diorite
        modelGenerator.registerSimpleCubeAll(BlockusBlocks.CHISELED_DIORITE_BRICKS);
        modelGenerator.registerSimpleCubeAll(BlockusBlocks.CRACKED_DIORITE_BRICKS);
        this.registerPillar(modelGenerator, BlockusBlocks.POLISHED_DIORITE_PILLAR);
        modelGenerator.registerSimpleCubeAll(BlockusBlocks.HERRINGBONE_DIORITE_BRICKS);

        // Granite
        modelGenerator.registerSimpleCubeAll(BlockusBlocks.CHISELED_GRANITE_BRICKS);
        modelGenerator.registerSimpleCubeAll(BlockusBlocks.CRACKED_GRANITE_BRICKS);
        this.registerPillar(modelGenerator, BlockusBlocks.POLISHED_GRANITE_PILLAR);
        modelGenerator.registerSimpleCubeAll(BlockusBlocks.HERRINGBONE_GRANITE_BRICKS);

        // Mud
        modelGenerator.registerSimpleCubeAll(BlockusBlocks.CHISELED_MUD_BRICKS);
        this.registerPillar(modelGenerator, BlockusBlocks.MUD_BRICK_PILLAR);

        // Dripstone
        modelGenerator.registerSimpleCubeAll(BlockusBlocks.CHISELED_DRIPSTONE);
        modelGenerator.registerSimpleCubeAll(BlockusBlocks.CRACKED_DRIPSTONE_BRICKS);
        this.registerPillar(modelGenerator, BlockusBlocks.DRIPSTONE_PILLAR);

        // Tuff
        modelGenerator.registerSimpleCubeAll(BlockusBlocks.CARVED_TUFF_BRICKS);
        modelGenerator.registerSimpleCubeAll(BlockusBlocks.CRACKED_TUFF_BRICKS);
        this.registerPillar(modelGenerator, BlockusBlocks.TUFF_PILLAR);
        modelGenerator.registerSimpleCubeAll(BlockusBlocks.HERRINGBONE_TUFF_BRICKS);

        // Deepslate
        this.registerPillar(modelGenerator, BlockusBlocks.DEEPSLATE_PILLAR);
        modelGenerator.registerSimpleCubeAll(BlockusBlocks.STURDY_DEEPSLATE);
        modelGenerator.registerSimpleCubeAll(BlockusBlocks.HERRINGBONE_DEEPSLATE_BRICKS);

        // Sculk
        modelGenerator.registerSimpleCubeAll(BlockusBlocks.CHISELED_SCULK_BRICKS);
        this.registerPillar(modelGenerator, BlockusBlocks.SCULK_PILLAR);

        // Amethyst
        modelGenerator.registerSimpleCubeAll(BlockusBlocks.CHISELED_AMETHYST);
        this.registerPillar(modelGenerator, BlockusBlocks.AMETHYST_PILLAR);

        // Blackstone
        this.registerCubeColumnNoSuffix(modelGenerator, BlockusBlocks.GOLD_DECORATED_POLISHED_BLACKSTONE, Blocks.POLISHED_BLACKSTONE);
        this.registerPillar(modelGenerator, BlockusBlocks.POLISHED_BLACKSTONE_PILLAR);
        modelGenerator.registerSimpleCubeAll(BlockusBlocks.STURDY_BLACKSTONE);
        modelGenerator.registerSimpleCubeAll(BlockusBlocks.HERRINGBONE_POLISHED_BLACKSTONE_BRICKS);

        // Basalt
        modelGenerator.registerSimpleCubeAll(BlockusBlocks.CHISELED_POLISHED_BASALT);
        modelGenerator.registerSimpleCubeAll(BlockusBlocks.CRACKED_POLISHED_BASALT_BRICKS);
        this.registerPillar(modelGenerator, BlockusBlocks.POLISHED_BASALT_PILLAR);
        modelGenerator.registerSimpleCubeAll(BlockusBlocks.HERRINGBONE_POLISHED_BASALT_BRICKS);

        // Limestone
        modelGenerator.registerSimpleCubeAll(BlockusBlocks.CHISELED_LIMESTONE);
        this.registerAxisRotatedCubeColumn(modelGenerator, BlockusBlocks.CHISELED_LIMESTONE_BRICKS, BlockusBlocks.POLISHED_LIMESTONE.block);
        this.registerPillar(modelGenerator, BlockusBlocks.LIMESTONE_PILLAR);
        this.registerPillar(modelGenerator, BlockusBlocks.CHISELED_LIMESTONE_PILLAR);
        modelGenerator.registerSimpleCubeAll(BlockusBlocks.LIMESTONE_SQUARES);
        this.registerLines(modelGenerator, BlockusBlocks.LIMESTONE_LINES);

        // Marble
        modelGenerator.registerSimpleCubeAll(BlockusBlocks.CHISELED_MARBLE);
        this.registerAxisRotatedCubeColumn(modelGenerator, BlockusBlocks.CHISELED_MARBLE_BRICKS, BlockusBlocks.POLISHED_MARBLE.block);
        this.registerPillar(modelGenerator, BlockusBlocks.MARBLE_PILLAR);
        this.registerPillar(modelGenerator, BlockusBlocks.CHISELED_MARBLE_PILLAR);
        modelGenerator.registerSimpleCubeAll(BlockusBlocks.MARBLE_SQUARES);
        this.registerLines(modelGenerator, BlockusBlocks.MARBLE_LINES);

        // Bluestone
        this.registerLines(modelGenerator, BlockusBlocks.BLUESTONE_LINES);
        this.registerPillar(modelGenerator, BlockusBlocks.BLUESTONE_PILLAR);
        this.registerPillar(modelGenerator, BlockusBlocks.CHISELED_BLUESTONE_PILLAR);
        modelGenerator.registerSimpleCubeAll(BlockusBlocks.BLUESTONE_SQUARES);
        modelGenerator.registerSimpleCubeAll(BlockusBlocks.CHISELED_BLUESTONE);
        this.registerAxisRotatedCubeColumn(modelGenerator, BlockusBlocks.CHISELED_BLUESTONE_BRICKS, BlockusBlocks.POLISHED_BLUESTONE.block);


        // Viridite
        modelGenerator.registerSimpleCubeAll(BlockusBlocks.CHISELED_VIRIDITE);
        this.registerAxisRotatedCubeColumn(modelGenerator, BlockusBlocks.CHISELED_VIRIDITE_BRICKS, BlockusBlocks.POLISHED_VIRIDITE.block);
        this.registerPillar(modelGenerator, BlockusBlocks.VIRIDITE_PILLAR);
        this.registerPillar(modelGenerator, BlockusBlocks.CHISELED_VIRIDITE_PILLAR);
        modelGenerator.registerSimpleCubeAll(BlockusBlocks.VIRIDITE_SQUARES);
        this.registerLines(modelGenerator, BlockusBlocks.VIRIDITE_LINES);

        // Lava & Water Bricks
        modelGenerator.registerSimpleCubeAll(BlockusBlocks.CHISELED_LAVA_BRICKS);
        modelGenerator.registerSimpleCubeAll(BlockusBlocks.CHISELED_LAVA_POLISHED_BLACKSTONE);
        modelGenerator.registerSimpleCubeAll(BlockusBlocks.CHISELED_WATER_BRICKS);

        // Snow & Ice Bricks
        this.registerPillar(modelGenerator, BlockusBlocks.SNOW_PILLAR);
        modelGenerator.registerSimpleCubeAll(BlockusBlocks.ICE_BRICKS);
        this.registerPillar(modelGenerator, BlockusBlocks.ICE_PILLAR);

        // Obsidian
        modelGenerator.registerSimpleCubeAll(BlockusBlocks.CRACKED_OBSIDIAN_BRICKS);
        modelGenerator.registerSimpleCubeAll(BlockusBlocks.GLOWING_OBSIDIAN);
        this.registerPillar(modelGenerator, BlockusBlocks.OBSIDIAN_PILLAR);

        // Magma Bricks
        modelGenerator.registerSimpleCubeAll(BlockusBlocks.CHISELED_MAGMA_BRICKS);

        // Nether Bricks
        this.registerPillar(modelGenerator, BlockusBlocks.NETHER_BRICK_PILLAR);
        modelGenerator.registerSimpleCubeAll(BlockusBlocks.HERRINGBONE_NETHER_BRICKS);

        this.registerPillar(modelGenerator, BlockusBlocks.RED_NETHER_BRICK_PILLAR);
        modelGenerator.registerSimpleCubeAll(BlockusBlocks.HERRINGBONE_RED_NETHER_BRICKS);

        // Prismarine
        modelGenerator.registerSimpleCubeAll(BlockusBlocks.CHISELED_DARK_PRISMARINE);
        modelGenerator.registerSimpleCubeAll(BlockusBlocks.CHISELED_PRISMARINE);
        this.registerPillar(modelGenerator, BlockusBlocks.DARK_PRISMARINE_PILLAR);
        this.registerPillar(modelGenerator, BlockusBlocks.PRISMARINE_PILLAR);

        // Bricks
        modelGenerator.registerSimpleCubeAll(BlockusBlocks.HERRINGBONE_BRICKS);
        modelGenerator.registerSimpleCubeAll(BlockusBlocks.HERRINGBONE_SOAKED_BRICKS);
        modelGenerator.registerSimpleCubeAll(BlockusBlocks.HERRINGBONE_SANDY_BRICKS);

        // Resin Bricks
        modelGenerator.registerSimpleCubeAll(BlockusBlocks.HERRINGBONE_RESIN_BRICKS);
        this.registerPillar(modelGenerator, BlockusBlocks.RESIN_BRICK_PILLAR);

        // Sandstone
        this.registerPillar(modelGenerator, BlockusBlocks.SANDSTONE_PILLAR);
        this.registerCubeColumn(modelGenerator, BlockusBlocks.GOLD_DECORATED_SANDSTONE, Blocks.SANDSTONE);
        this.registerCubeColumn(modelGenerator, BlockusBlocks.LAPIS_DECORATED_SANDSTONE, Blocks.SANDSTONE);

        this.registerPillar(modelGenerator, BlockusBlocks.RED_SANDSTONE_PILLAR);
        this.registerCubeColumn(modelGenerator, BlockusBlocks.GOLD_DECORATED_RED_SANDSTONE, Blocks.RED_SANDSTONE);
        this.registerCubeColumn(modelGenerator, BlockusBlocks.LAPIS_DECORATED_RED_SANDSTONE, Blocks.RED_SANDSTONE);

        // Soul Sandstone
        this.registerCubeColumn(modelGenerator, BlockusBlocks.CHISELED_SOUL_SANDSTONE, BlockusBlocks.SOUL_SANDSTONE.block);
        this.registerCubeColumn(modelGenerator, BlockusBlocks.CUT_SOUL_SANDSTONE, BlockusBlocks.SOUL_SANDSTONE.block);
        this.registerPillar(modelGenerator, BlockusBlocks.SOUL_SANDSTONE_PILLAR);
        this.registerCubeColumn(modelGenerator, BlockusBlocks.GOLD_DECORATED_SOUL_SANDSTONE, BlockusBlocks.SOUL_SANDSTONE.block);
        this.registerCubeColumn(modelGenerator, BlockusBlocks.LAPIS_DECORATED_SOUL_SANDSTONE, BlockusBlocks.SOUL_SANDSTONE.block);

        // Rainbow
        modelGenerator.registerItemModel(BlockusBlocks.RAINBOW_PETALS);
        this.registerUpDefaultFacingBlock(modelGenerator, BlockusBlocks.RAINBOW_BLOCK);
        this.registerTopBottomFacingBottom(modelGenerator, BlockusBlocks.RAINBOW_ASPHALT);
        registerFlowerPotPlantAndItem(modelGenerator, BlockusBlocks.RAINBOW_ROSE, BlockusBlocks.POTTED_RAINBOW_ROSE, CrossType.NOT_TINTED);

        // Purpur Blocks
        modelGenerator.registerSimpleCubeAll(BlockusBlocks.CHISELED_PURPUR);
        modelGenerator.registerSingleton(BlockusBlocks.PURPUR_DECORATED_END_STONE, TexturedModel.END_FOR_TOP_CUBE_COLUMN);
        this.registerLines(modelGenerator, BlockusBlocks.PURPUR_LINES);
        modelGenerator.registerSimpleCubeAll(BlockusBlocks.PURPUR_SQUARES);

        // Phantom Purpur Blocks
        modelGenerator.registerSimpleCubeAll(BlockusBlocks.CHISELED_PHANTOM_PURPUR);
        this.registerCubeColumn(modelGenerator, BlockusBlocks.PHANTOM_PURPUR_DECORATED_END_STONE, BlockusBlocks.PURPUR_DECORATED_END_STONE);
        this.registerLines(modelGenerator, BlockusBlocks.PHANTOM_PURPUR_LINES);
        this.registerPillar(modelGenerator, BlockusBlocks.PHANTOM_PURPUR_PILLAR);
        modelGenerator.registerSimpleCubeAll(BlockusBlocks.PHANTOM_PURPUR_SQUARES);

        // End Stone
        modelGenerator.registerSimpleCubeAll(BlockusBlocks.CHISELED_END_STONE_BRICKS);
        modelGenerator.registerSimpleCubeAll(BlockusBlocks.CRACKED_END_STONE_BRICKS);
        this.registerPillar(modelGenerator, BlockusBlocks.END_STONE_PILLAR);
        modelGenerator.registerSimpleCubeAll(BlockusBlocks.HERRINGBONE_END_STONE_BRICKS);

        // White Oak Wood
        modelGenerator.createLogTexturePool(BlockusBlocks.WHITE_OAK_LOG).log(BlockusBlocks.WHITE_OAK_LOG).wood(BlockusBlocks.WHITE_OAK_WOOD);
        modelGenerator.registerSingleton(BlockusBlocks.WHITE_OAK_LEAVES, TexturedModel.LEAVES);
        modelGenerator.createLogTexturePool(BlockusBlocks.STRIPPED_WHITE_OAK_LOG).log(BlockusBlocks.STRIPPED_WHITE_OAK_LOG).wood(BlockusBlocks.STRIPPED_WHITE_OAK_WOOD);
        registerFlowerPotPlantAndItem(modelGenerator, BlockusBlocks.WHITE_OAK_SAPLING, BlockusBlocks.POTTED_WHITE_OAK_SAPLING, CrossType.NOT_TINTED);

        // Herringbone Planks
        modelGenerator.registerSimpleCubeAll(BlockusBlocks.HERRINGBONE_OAK_PLANKS);
        modelGenerator.registerSimpleCubeAll(BlockusBlocks.HERRINGBONE_BIRCH_PLANKS);
        modelGenerator.registerSimpleCubeAll(BlockusBlocks.HERRINGBONE_SPRUCE_PLANKS);
        modelGenerator.registerSimpleCubeAll(BlockusBlocks.HERRINGBONE_JUNGLE_PLANKS);
        modelGenerator.registerSimpleCubeAll(BlockusBlocks.HERRINGBONE_ACACIA_PLANKS);
        modelGenerator.registerSimpleCubeAll(BlockusBlocks.HERRINGBONE_DARK_OAK_PLANKS);
        modelGenerator.registerSimpleCubeAll(BlockusBlocks.HERRINGBONE_MANGROVE_PLANKS);
        modelGenerator.registerSimpleCubeAll(BlockusBlocks.HERRINGBONE_CHERRY_PLANKS);
        modelGenerator.registerSimpleCubeAll(BlockusBlocks.HERRINGBONE_BAMBOO_PLANKS);
        modelGenerator.registerSimpleCubeAll(BlockusBlocks.HERRINGBONE_CRIMSON_PLANKS);
        modelGenerator.registerSimpleCubeAll(BlockusBlocks.HERRINGBONE_WARPED_PLANKS);
        modelGenerator.registerSimpleCubeAll(BlockusBlocks.HERRINGBONE_PALE_OAK_PLANKS);

        // Posts
        for (WoodenPostBundle woodenPost : WoodenPostBundle.values()) {
            this.registerPost(modelGenerator, woodenPost.block, woodenPost.base);
            this.registerPost(modelGenerator, woodenPost.stripped, woodenPost.baseStripped);
        }

        // Food Blocks
        this.registerFishCrate(modelGenerator, BlockusBlocks.COD_CRATE);
        this.registerFishCrate(modelGenerator, BlockusBlocks.PUFFERFISH_CRATE);
        this.registerFishCrate(modelGenerator, BlockusBlocks.SALMON_CRATE);
        this.registerFishCrate(modelGenerator, BlockusBlocks.TROPICAL_FISH_CRATE);
        this.registerCrate(modelGenerator, BlockusBlocks.SWEET_BERRIES_CRATE);
        this.registerCrate(modelGenerator, BlockusBlocks.GLOW_BERRIES_CRATE);
        this.registerCrate(modelGenerator, BlockusBlocks.POTATO_CRATE);
        this.registerCrate(modelGenerator, BlockusBlocks.APPLE_CRATE);
        this.registerCrate(modelGenerator, BlockusBlocks.GOLDEN_APPLE_CRATE);
        this.registerCrate(modelGenerator, BlockusBlocks.BEETROOT_CRATE);
        this.registerCrate(modelGenerator, BlockusBlocks.CARROT_CRATE);
        this.registerCrate(modelGenerator, BlockusBlocks.GOLDEN_CARROT_CRATE);
        this.registerBreadBox(modelGenerator, BlockusBlocks.BREAD_BOX);
        this.registerAxisRotatedCubeColumn(modelGenerator, BlockusBlocks.CHORUS_BLOCK);
        this.registerCookieBlock(modelGenerator);
        this.registerDirectionalCarpet(modelGenerator, BlockusBlocks.CHOCOLATE_SQUARES, BlockusBlocks.CHOCOLATE_TABLET);
        modelGenerator.registerSimpleCubeAll(BlockusBlocks.CHOCOLATE_SQUARES);

        // Paper
        modelGenerator.registerSimpleCubeAll(BlockusBlocks.BURNT_PAPER_BLOCK);
        modelGenerator.registerSimpleCubeAll(BlockusBlocks.FRAMED_PAPER_BLOCK);
        modelGenerator.registerSimpleCubeAll(BlockusBlocks.PAPER_BLOCK);
        modelGenerator.registerSimpleState(BlockusBlocks.PAPER_LAMP);

        // Lantern Blocks
        this.registerCubeColumn(modelGenerator, BlockusBlocks.LANTERN_BLOCK, BlockusBlocks.LANTERN_BLOCK);
        this.registerCubeColumn(modelGenerator, BlockusBlocks.SOUL_LANTERN_BLOCK, BlockusBlocks.LANTERN_BLOCK);
        this.registerPumpkins(modelGenerator, BlockusBlocks.SOUL_O_LANTERN);

        // Colored Tiles
        modelGenerator.registerSimpleCubeAll(BlockusBlocks.RAINBOW_COLORED_TILES);
        registerColoredTilesSimple(modelGenerator, BlockusBlocks.BLACK_COLORED_TILES);
        registerColoredTilesSimple(modelGenerator, BlockusBlocks.BLUE_COLORED_TILES);
        registerColoredTilesSimple(modelGenerator, BlockusBlocks.BROWN_COLORED_TILES);
        registerColoredTilesSimple(modelGenerator, BlockusBlocks.CYAN_COLORED_TILES);
        registerColoredTilesSimple(modelGenerator, BlockusBlocks.GRAY_COLORED_TILES);
        registerColoredTilesSimple(modelGenerator, BlockusBlocks.GREEN_COLORED_TILES);
        registerColoredTilesSimple(modelGenerator, BlockusBlocks.LIGHT_BLUE_COLORED_TILES);
        registerColoredTilesSimple(modelGenerator, BlockusBlocks.LIGHT_GRAY_COLORED_TILES);
        registerColoredTilesSimple(modelGenerator, BlockusBlocks.LIME_COLORED_TILES);
        registerColoredTilesSimple(modelGenerator, BlockusBlocks.MAGENTA_COLORED_TILES);
        registerColoredTilesSimple(modelGenerator, BlockusBlocks.ORANGE_COLORED_TILES);
        registerColoredTilesSimple(modelGenerator, BlockusBlocks.PINK_COLORED_TILES);
        registerColoredTilesSimple(modelGenerator, BlockusBlocks.PURPLE_COLORED_TILES);
        registerColoredTilesSimple(modelGenerator, BlockusBlocks.RED_COLORED_TILES);
        registerColoredTilesSimple(modelGenerator, BlockusBlocks.WHITE_COLORED_TILES);
        registerColoredTilesSimple(modelGenerator, BlockusBlocks.YELLOW_COLORED_TILES);

        // Other
        modelGenerator.registerSimpleCubeAll(BlockusBlocks.NETHER_STAR_BLOCK);
        modelGenerator.registerSimpleCubeAll(BlockusBlocks.RAINBOW_GLOWSTONE);
        modelGenerator.registerSimpleCubeAll(BlockusBlocks.CAUTION_BLOCK);
        modelGenerator.registerSimpleCubeAll(BlockusBlocks.CHARCOAL_BLOCK);
        modelGenerator.registerSimpleCubeAll(BlockusBlocks.COMPANION_CUBE);
        modelGenerator.registerSimpleCubeAll(BlockusBlocks.ENDER_BLOCK);
        modelGenerator.registerSimpleCubeAll(BlockusBlocks.LOVE_BLOCK);
        modelGenerator.registerSimpleCubeAll(BlockusBlocks.MEMBRANE_BLOCK);
        modelGenerator.registerSimpleCubeAll(BlockusBlocks.REDSTONE_SAND);
        modelGenerator.registerSimpleCubeAll(BlockusBlocks.ROTTEN_FLESH_BLOCK);
        modelGenerator.registerSimpleCubeAll(BlockusBlocks.STARS_BLOCK);
        modelGenerator.registerSimpleCubeAll(BlockusBlocks.SUGAR_BLOCK);
        modelGenerator.registerSimpleCubeAll(BlockusBlocks.WEIGHT_STORAGE_CUBE);
        modelGenerator.registerParentedItemModel(BlockusBlocks.PATH, ModelIds.getBlockSubModelId(BlockusBlocks.PATH, "4"));
    }

    @Override
    public void generateItemModels(ItemModelGenerator modelGenerator) {

    }

    public final void registerInventoryItemModel(BlockStateModelGenerator modelGenerator, Block block) {
        modelGenerator.registerParentedItemModel(block, ModelIds.getBlockSubModelId(block, "_inventory"));
    }

    public final void registerPillar(BlockStateModelGenerator modelGenerator, Block block) {
        modelGenerator.registerAxisRotated(block, TexturedModel.END_FOR_TOP_CUBE_COLUMN, TexturedModel.END_FOR_TOP_CUBE_COLUMN_HORIZONTAL);
    }

    public final void registerLines(BlockStateModelGenerator modelGenerator, Block block) {
        modelGenerator.registerAxisRotated(block, TexturedModel.CUBE_ALL);
    }

    public final void registerBlockStairsSlabAndWall(BlockStateModelGenerator modelGenerator, Block block) {
        modelGenerator.registerCubeAllModelTexturePool(block);
    }

    public final void registerBlockStairsAndSlab(BlockStateModelGenerator modelGenerator, Block block) {
        modelGenerator.registerCubeAllModelTexturePool(block);
    }

    public final void registerButtonAndPressurePlate(BlockStateModelGenerator modelGenerator, Block pressurePlateBlock, Block buttonBlock, Block textureID) {
        this.registerButton(modelGenerator, buttonBlock, TextureMap.getId(textureID));
        this.registerPressurePlate(modelGenerator, pressurePlateBlock, TextureMap.getId(textureID));
    }

    public final void registerButtonAndPressurePlate(BlockStateModelGenerator modelGenerator, Block pressurePlateBlock, Block buttonBlock, Identifier textureSource) {
        this.registerButton(modelGenerator, buttonBlock, textureSource);
        this.registerPressurePlate(modelGenerator, pressurePlateBlock, textureSource);
    }

    public final void registerPost(BlockStateModelGenerator modelGenerator, Block block, Block textureSource) {
        TextureMap textureMap = TextureMap.sideAndEndForTop(textureSource);
        Identifier identifier = BlockusModels.TEMPLATE_POST.upload(block, textureMap, modelGenerator.modelCollector);
        WeightedVariant modelVariant = createWeightedVariant(BlockusModels.TEMPLATE_POST_CONNECT.upload(block, textureMap, modelGenerator.modelCollector));
        WeightedVariant modelVariant2 = createWeightedVariant(BlockusModels.TEMPLATE_POST_CONNECT_TOP.upload(block, textureMap, modelGenerator.modelCollector));
        modelGenerator.blockStateCollector.accept(createPostBlockState(block, createWeightedVariant(identifier), modelVariant, modelVariant2, createWeightedVariant(Blockus.id("block/chain_connect")), createWeightedVariant(Blockus.id("block/chain_connect_top"))));
        modelGenerator.registerParentedItemModel(block, identifier);
    }

    public static BlockModelDefinitionCreator createPostBlockState(Block postBlock, WeightedVariant postModelId, WeightedVariant sideModelId, WeightedVariant topModelId, WeightedVariant chainModelId, WeightedVariant topChainModelId) {
        return MultipartBlockModelDefinitionCreator.create(postBlock)
            .with(createMultipartConditionBuilder().put(Properties.AXIS, Direction.Axis.X), postModelId.apply(ROTATE_X_90).apply(ROTATE_Y_90))
            .with(createMultipartConditionBuilder().put(Properties.AXIS, Direction.Axis.Y), postModelId)
            .with(createMultipartConditionBuilder().put(Properties.AXIS, Direction.Axis.Z), postModelId.apply(ROTATE_X_90))
            .with(createMultipartConditionBuilder().put(PostBlock.NORTH, PostBlock.ConnectionType.POST), topModelId.apply(ROTATE_X_90))
            .with(createMultipartConditionBuilder().put(PostBlock.SOUTH, PostBlock.ConnectionType.POST), sideModelId.apply(ROTATE_X_90))
            .with(createMultipartConditionBuilder().put(PostBlock.EAST, PostBlock.ConnectionType.POST), topModelId.apply(ROTATE_X_90).apply(ROTATE_Y_90))
            .with(createMultipartConditionBuilder().put(PostBlock.WEST, PostBlock.ConnectionType.POST), sideModelId.apply(ROTATE_X_90).apply(ROTATE_Y_90))
            .with(createMultipartConditionBuilder().put(PostBlock.UP, PostBlock.ConnectionType.POST), topModelId)
            .with(createMultipartConditionBuilder().put(PostBlock.DOWN, PostBlock.ConnectionType.POST), sideModelId)
            .with(createMultipartConditionBuilder().put(PostBlock.NORTH, PostBlock.ConnectionType.CHAIN), topChainModelId.apply(ROTATE_X_90))
            .with(createMultipartConditionBuilder().put(PostBlock.SOUTH, PostBlock.ConnectionType.CHAIN), chainModelId.apply(ROTATE_X_90))
            .with(createMultipartConditionBuilder().put(PostBlock.EAST, PostBlock.ConnectionType.CHAIN), topChainModelId.apply(ROTATE_X_90).apply(ROTATE_Y_90))
            .with(createMultipartConditionBuilder().put(PostBlock.WEST, PostBlock.ConnectionType.CHAIN), chainModelId.apply(ROTATE_X_90).apply(ROTATE_Y_90))
            .with(createMultipartConditionBuilder().put(PostBlock.UP, PostBlock.ConnectionType.CHAIN), topChainModelId)
            .with(createMultipartConditionBuilder().put(PostBlock.DOWN, PostBlock.ConnectionType.CHAIN), chainModelId);
    }

    public final void registerCookieBlock(BlockStateModelGenerator modelGenerator) {
        Block block = BlockusBlocks.COOKIE_BLOCK;
        WeightedVariant modelVariant = createWeightedVariant(TexturedModel.CUBE_ALL.upload(block, modelGenerator.modelCollector));
        modelGenerator.blockStateCollector.accept(VariantsBlockModelDefinitionCreator.of(block).with(BlockStateVariantMap.models(com.brand.blockus.utils.Properties.BITES_9)
            .register(0, createWeightedVariant(ModelIds.getBlockModelId(block)))
            .register(1, createWeightedVariant(ModelIds.getBlockSubModelId(block, "_slice1")))
            .register(2, createWeightedVariant(ModelIds.getBlockSubModelId(block, "_slice2")))
            .register(3, createWeightedVariant(ModelIds.getBlockSubModelId(block, "_slice3")))
            .register(4, createWeightedVariant(ModelIds.getBlockSubModelId(block, "_slice4")))
            .register(5, createWeightedVariant(ModelIds.getBlockSubModelId(block, "_slice5")))
            .register(6, createWeightedVariant(ModelIds.getBlockSubModelId(block, "_slice6")))
            .register(7, createWeightedVariant(ModelIds.getBlockSubModelId(block, "_slice7")))
            .register(8, createWeightedVariant(ModelIds.getBlockSubModelId(block, "_slice8")))));
    }

    public final void registerSmallHedge(BlockStateModelGenerator modelGenerator, Block hedgeBlock, Block textureSource) {
        registerSmallHedge(modelGenerator, hedgeBlock, textureSource, false, 0);
    }

    public final void registerSmallHedge(BlockStateModelGenerator modelGenerator, Block hedgeBlock, Block textureSource, int tintColor) {
        registerSmallHedge(modelGenerator, hedgeBlock, textureSource, true, tintColor);
    }

    private void registerSmallHedge(BlockStateModelGenerator modelGenerator, Block hedgeBlock, Block textureSource, boolean isTinted, int tintColor) {
        TextureMap textureMap = TextureMap.of(BlockusTextureKey.HEDGE, TextureMap.getId(textureSource));
        WeightedVariant modelVariant = createWeightedVariant(BlockusModels.TEMPLATE_SMALL_HEDGE_END.upload(hedgeBlock, textureMap, modelGenerator.modelCollector));
        WeightedVariant modelVariant2 = createWeightedVariant(BlockusModels.TEMPLATE_SMALL_HEDGE_SIDE.upload(hedgeBlock, textureMap, modelGenerator.modelCollector));
        WeightedVariant modelVariant3 = createWeightedVariant(BlockusModels.TEMPLATE_SMALL_HEDGE_SIDE_TALL.upload(hedgeBlock, textureMap, modelGenerator.modelCollector));
        modelGenerator.blockStateCollector.accept(createWallBlockState(hedgeBlock, modelVariant, modelVariant2, modelVariant3));
        Identifier identifier = BlockusModels.TEMPLATE_SMALL_HEDGE_INVENTORY.upload(hedgeBlock, textureMap, modelGenerator.modelCollector);
        if (isTinted) {
            modelGenerator.registerTintedItemModel(hedgeBlock, identifier, ItemModels.constantTintSource(tintColor));
        } else {
            modelGenerator.registerParentedItemModel(hedgeBlock, identifier);
        }
    }

    public final void registerCarpet(BlockStateModelGenerator modelGenerator, Block wool, Block carpet) {
        WeightedVariant modelVariant = createWeightedVariant(TexturedModel.CARPET.get(wool).upload(carpet, modelGenerator.modelCollector));
        modelGenerator.blockStateCollector.accept(createSingletonBlockState(carpet, modelVariant));
    }

    public final void registerDirectionalCarpet(BlockStateModelGenerator modelGenerator, Block block, Block carpet) {
        TexturedModel.CARPET.get(block).upload(carpet, modelGenerator.modelCollector);
        modelGenerator.blockStateCollector.accept(VariantsBlockModelDefinitionCreator.of(carpet, createWeightedVariant(ModelIds.getBlockModelId(carpet))).coordinate(createUpDefaultRotationStates()));
    }

    public final void registerBlockStairsSlabWithBottom(BlockStateModelGenerator modelGenerator, Block block, Block base) {
        Identifier textureID = TextureMap.getSubId(base, "_bottom");
        TextureMap blockTextureMap = TextureMap.of(TextureKey.ALL, textureID);
        TextureMap textureMap = sideTopBottom(textureID);
        this.createBlock(modelGenerator, block, blockTextureMap);
    }

    public final void registerBlockStairsSlabWithTop(BlockStateModelGenerator modelGenerator, Block block, Block base) {
        Identifier textureID = TextureMap.getSubId(base, "_top");
        TextureMap blockTextureMap = TextureMap.of(TextureKey.ALL, textureID);
        TextureMap textureMap = sideTopBottom(textureID);
        this.createBlock(modelGenerator, block, blockTextureMap);
    }

    public final void registerBlockStairsSlabwithTopBottom(BlockStateModelGenerator modelGenerator, Block block) {
        TextureMap textureMap = sideTopBottom(TextureMap.getId(block), TextureMap.getSubId(block, "_top"), TextureMap.getSubId(block, "_bottom"));
        this.createBlock(modelGenerator, block, Models.CUBE_BOTTOM_TOP, textureMap);
    }

    public final void registerStairs(BlockStateModelGenerator modelGenerator, Block block, Block textureSource) {
        TextureMap textureMap = sideTopBottom(TextureMap.getId(textureSource));
        this.createStairs(modelGenerator, block, textureMap);
    }

    public final void registerSlab(BlockStateModelGenerator modelGenerator, Block block, Block textureSource) {
        TextureMap textureMap = sideTopBottom(TextureMap.getId(textureSource));
        this.createSlab(modelGenerator, block, textureMap, TextureMap.getId(textureSource));
    }

    public final void registerStairsAndSlab(BlockStateModelGenerator modelGenerator, Block stairs, Block slab, Block block) {
        this.registerStairs(modelGenerator, stairs, block);
        this.registerSlab(modelGenerator, slab, block);
    }

    public final void registerSlabwithTop(BlockStateModelGenerator modelGenerator, Block block, Block textureSource, Block end) {
        TextureMap textureMap = sideTopBottom(TextureMap.getId(textureSource), TextureMap.getSubId(end, "_top"));
        this.createSlab(modelGenerator, block, textureMap, TextureMap.getId(textureSource));
    }

    public final void registerWall(BlockStateModelGenerator modelGenerator, Block block, Block textureSource) {
        TextureMap textureMap = TextureMap.of(TextureKey.WALL, TextureMap.getId(textureSource));
        this.createWall(modelGenerator, block, textureMap);
    }

    public final void registerButton(BlockStateModelGenerator modelGenerator, Block buttonBlock, Identifier textureSource) {
        TextureMap textureMap = TextureMap.texture(textureSource);
        WeightedVariant modelVariant = createWeightedVariant(Models.BUTTON.upload(buttonBlock, textureMap, modelGenerator.modelCollector));
        WeightedVariant modelVariant2 = createWeightedVariant(Models.BUTTON_PRESSED.upload(buttonBlock, textureMap, modelGenerator.modelCollector));
        Identifier identifier = Models.BUTTON_INVENTORY.upload(buttonBlock, textureMap, modelGenerator.modelCollector);
        modelGenerator.blockStateCollector.accept(createButtonBlockState(buttonBlock, modelVariant, modelVariant2));
        modelGenerator.registerParentedItemModel(buttonBlock, identifier);
    }

    public final void registerPressurePlate(BlockStateModelGenerator modelGenerator, Block pressurePlateBlock, Identifier textureSource) {
        TextureMap textureMap = TextureMap.texture(textureSource);
        WeightedVariant modelVariant = createWeightedVariant(Models.PRESSURE_PLATE_UP.upload(pressurePlateBlock, textureMap, modelGenerator.modelCollector));
        WeightedVariant modelVariant2 = createWeightedVariant(Models.PRESSURE_PLATE_DOWN.upload(pressurePlateBlock, textureMap, modelGenerator.modelCollector));
        modelGenerator.blockStateCollector.accept(createPressurePlateBlockState(pressurePlateBlock, modelVariant, modelVariant2));
    }

    public final void registerRedstoneLamp(BlockStateModelGenerator modelGenerator, Block block, Block lit) {
        registerLitRedstoneLamp(modelGenerator, block, lit);
        WeightedVariant modelVariant = createWeightedVariant(TexturedModel.CUBE_ALL.upload(block, modelGenerator.modelCollector));
        WeightedVariant modelVariant2 = createWeightedVariant(modelGenerator.createSubModel(block, "_on", Models.CUBE_ALL, TextureMap::all));
        modelGenerator.blockStateCollector.accept(VariantsBlockModelDefinitionCreator.of(block).with(createBooleanModelMap(Properties.LIT, modelVariant2, modelVariant)));

    }

    public final void registerLitRedstoneLamp(BlockStateModelGenerator modelGenerator, Block block, Block lit) {
        TextureMap textureMap = TextureMap.of(TextureKey.ALL, TextureMap.getSubId(block, "_on"));
        this.createBlock(modelGenerator, lit, textureMap);
    }

    public void createAxisRotatedCubeColumn(BlockStateModelGenerator modelGenerator, Block block, TextureMap textureMap) {
        WeightedVariant modelVariant = createWeightedVariant(Models.CUBE_COLUMN.upload(block, textureMap, modelGenerator.modelCollector));
        WeightedVariant modelVariant2 = createWeightedVariant(Models.CUBE_COLUMN_HORIZONTAL.upload(block, textureMap, modelGenerator.modelCollector));
        modelGenerator.blockStateCollector.accept(createAxisRotatedBlockState(block, modelVariant, modelVariant2));
    }

    public final void registerAxisRotatedCubeColumn(BlockStateModelGenerator modelGenerator, Block block) {
        TextureMap textureMap = TextureMap.sideAndEndForTop(block);
        this.createAxisRotatedCubeColumn(modelGenerator, block, textureMap);
    }

    public final void registerAxisRotatedCubeColumn(BlockStateModelGenerator modelGenerator, Block block, Block end) {
        TextureMap textureMap = TextureMap.sideEnd(TextureMap.getId(block), TextureMap.getId(end));
        this.createAxisRotatedCubeColumn(modelGenerator, block, textureMap);
    }

    public final void registerCubeColumn(BlockStateModelGenerator modelGenerator, Block block, Block end) {
        TextureMap textureMap = TextureMap.sideEnd(TextureMap.getId(block), TextureMap.getSubId(end, "_top"));
        this.createBlock(modelGenerator, block, Models.CUBE_COLUMN, textureMap);
    }

    public final void registerCubeColumnNoSuffix(BlockStateModelGenerator modelGenerator, Block block, Block end) {
        TextureMap textureMap = TextureMap.sideEnd(TextureMap.getId(block), TextureMap.getId(end));
        this.createBlock(modelGenerator, block, Models.CUBE_COLUMN, textureMap);
    }

    public final void registerCubeBottomTop(BlockStateModelGenerator modelGenerator, Block block) {
        TextureMap textureMap = sideTopBottom(TextureMap.getId(block), TextureMap.getSubId(block, "_top"), TextureMap.getSubId(block, "_bottom"));
        this.createBlock(modelGenerator, block, Models.CUBE_BOTTOM_TOP, textureMap);
    }

    public final void registerCubeBottomTop(BlockStateModelGenerator modelGenerator, Block block, Block bottom) {
        TextureMap textureMap = sideTopBottom(TextureMap.getId(block), TextureMap.getSubId(block, "_top"), TextureMap.getId(bottom));
        this.createBlock(modelGenerator, block, Models.CUBE_BOTTOM_TOP, textureMap);
    }

    public final void registerUpDefaultFacingBlock(BlockStateModelGenerator modelGenerator, Block block) {
        WeightedVariant modelVariant = createWeightedVariant(TexturedModel.CUBE_ALL.upload(block, modelGenerator.modelCollector));
        modelGenerator.blockStateCollector.accept(VariantsBlockModelDefinitionCreator.of(block, modelVariant).coordinate(createUpDefaultRotationStates()));
    }

    public final void registerTopBottomFacingBottom(BlockStateModelGenerator modelGenerator, Block block) {
        TextureMap textureMap = sideTopBottom(TextureMap.getId(block), TextureMap.getSubId(block, "_top"), TextureMap.getSubId(block, "_bottom"));
        WeightedVariant modelVariant = createWeightedVariant(Models.CUBE_BOTTOM_TOP.upload(block, textureMap, modelGenerator.modelCollector));
        modelGenerator.blockStateCollector.accept(VariantsBlockModelDefinitionCreator.of(block, modelVariant).coordinate(createUpDefaultRotationStates()));
    }

    public final void registerPumpkins(BlockStateModelGenerator modelGenerator, Block block) {
        TextureMap textureMap = TextureMap.sideEnd(Blocks.PUMPKIN);
        modelGenerator.registerNorthDefaultHorizontalRotatable(block, textureMap);
    }

    public final void registerSturdyStone(BlockStateModelGenerator modelGenerator) {
        Identifier identifier = TextureMap.getSubId(Blocks.FURNACE, "_top");
        this.createBlock(modelGenerator, BlockusBlocks.STURDY_STONE, TextureMap.of(TextureKey.ALL, identifier));
    }

    public final void registerSmoothStoneStairs(BlockStateModelGenerator modelGenerator) {
        TextureMap textureMap = sideTopBottom(TextureMap.getSubId(Blocks.SMOOTH_STONE_SLAB, "_side"), TextureMap.getId(Blocks.SMOOTH_STONE));
    }

    public final void registerNeonBlock(BlockStateModelGenerator modelGenerator, Block block) {
        TextureMap textureMap = TextureMap.of(TextureKey.ALL, TextureMap.getId(block));
        this.createBlock(modelGenerator, block, BlockusModels.NEON_BLOCK_TEMPLATE, textureMap);
    }

    public final void registerFishCrate(BlockStateModelGenerator modelGenerator, Block block) {
        TextureMap textureMap = sideTopBottom(getBlockId("fish_crate_side"), TextureMap.getId(block), getBlockId("fish_crate_bottom"));
        this.createBlock(modelGenerator, block, Models.CUBE_BOTTOM_TOP, textureMap);
    }

    public final void registerCrate(BlockStateModelGenerator modelGenerator, Block block) {
        TextureMap textureMap = sideTop(TextureMap.getSubId(block, "_side"), TextureMap.getId(block));
        this.createBlock(modelGenerator, block, BlockusModels.CRATE_TEMPLATE, textureMap);
    }

    public final void registerBreadBox(BlockStateModelGenerator modelGenerator, Block block) {
        TextureMap textureMap = frontTopSideBottom(block);
        WeightedVariant modelVariant = createWeightedVariant(Models.ORIENTABLE_WITH_BOTTOM.upload(block, textureMap, modelGenerator.modelCollector));
        modelGenerator.blockStateCollector.accept(VariantsBlockModelDefinitionCreator.of(block, modelVariant).coordinate(BlockStateVariantMap.operations(Properties.HORIZONTAL_FACING).register(Direction.EAST, ROTATE_Y_90).register(Direction.SOUTH, ROTATE_Y_180).register(Direction.WEST, ROTATE_Y_270).register(Direction.NORTH, NO_OP)));
    }

    public void registerLegacyStonecutter(BlockStateModelGenerator modelGenerator, Block block) {
        TextureMap textureMap = (new TextureMap()).put(TextureKey.PARTICLE, TextureMap.getSubId(block, "_front")).put(TextureKey.DOWN, TextureMap.getSubId(block, "_bottom")).put(TextureKey.UP, TextureMap.getSubId(block, "_top")).put(TextureKey.NORTH, TextureMap.getSubId(block, "_front")).put(TextureKey.SOUTH, TextureMap.getSubId(block, "_front")).put(TextureKey.EAST, TextureMap.getSubId(block, "_side")).put(TextureKey.WEST, TextureMap.getSubId(block, "_side"));
        this.createBlock(modelGenerator, block, Models.CUBE, textureMap);
    }

    private void registerDiagonalTimberFrame(BlockStateModelGenerator modelGenerator, Block block) {
        WeightedVariant modelVariant = createWeightedVariant(ModelIds.getBlockModelId(block));
        Identifier identifier = TextureMap.getSubId(block, "_right");
        Identifier identifier2 = TextureMap.getSubId(block, "_left");
        TextureMap textureMap = (new TextureMap()).put(TextureKey.PARTICLE, identifier).put(TextureKey.NORTH, identifier).put(TextureKey.SOUTH, identifier).put(TextureKey.EAST, identifier).put(TextureKey.WEST, identifier2).put(TextureKey.DOWN, identifier2).put(TextureKey.UP, identifier2);
        Models.CUBE.upload(block, textureMap, modelGenerator.modelCollector);
        modelGenerator.blockStateCollector.accept(VariantsBlockModelDefinitionCreator.of(block).with(BlockStateVariantMap.models(Properties.HORIZONTAL_FACING)
            .register(Direction.NORTH, modelVariant)
            .register(Direction.SOUTH, modelVariant.apply(ROTATE_Y_180))
            .register(Direction.WEST, modelVariant.apply(ROTATE_Y_270))
            .register(Direction.EAST, modelVariant.apply(ROTATE_Y_90))));
    }

    public static void registerColoredTiles(BlockStateModelGenerator modelGenerator, Block block, Block tile1, Block tile2) {
        TextureMap textures = tilesTextures(tile1, tile2);
        BlockusModels.CUBE_TILES.upload(block, textures, modelGenerator.modelCollector);
        BlockusModels.CUBE_TILES_2.upload(block, textures, modelGenerator.modelCollector);
        modelGenerator.blockStateCollector.accept(VariantsBlockModelDefinitionCreator.of(block).with(BlockStateVariantMap.models(Properties.HORIZONTAL_AXIS)
            .register(Direction.Axis.X, createWeightedVariant(ModelIds.getBlockModelId(block)))
            .register(Direction.Axis.Z, createWeightedVariant(ModelIds.getBlockSubModelId(block, "_2")))));
    }

    public final void registerColoredTilesSimple(BlockStateModelGenerator modelGenerator, Block block) {
        Identifier identifier = getModifiedBlockId(block, "_colored", "");
        this.createBlock(modelGenerator, block, TextureMap.of(TextureKey.ALL, identifier));
    }

    public final void createBlock(BlockStateModelGenerator modelGenerator, Block block, Model model, TextureMap textureMap) {
        modelGenerator.blockStateCollector.accept(createSingletonBlockState(block, createWeightedVariant(model.upload(block, textureMap, modelGenerator.modelCollector))));
    }

    public final void createBlock(BlockStateModelGenerator modelGenerator, Block block, TextureMap textureMap) {
        modelGenerator.blockStateCollector.accept(createSingletonBlockState(block, createWeightedVariant(Models.CUBE_ALL.upload(block, textureMap, modelGenerator.modelCollector))));
    }

    public final void createStairs(BlockStateModelGenerator modelGenerator, Block block, TextureMap textureMap) {
        WeightedVariant modelVariant = createWeightedVariant(Models.INNER_STAIRS.upload(block, textureMap, modelGenerator.modelCollector));
        Identifier identifier = Models.STAIRS.upload(block, textureMap, modelGenerator.modelCollector);
        WeightedVariant modelVariant2 = createWeightedVariant(Models.OUTER_STAIRS.upload(block, textureMap, modelGenerator.modelCollector));
        modelGenerator.blockStateCollector.accept(createStairsBlockState(block, modelVariant, createWeightedVariant(identifier), modelVariant2));
        modelGenerator.registerParentedItemModel(block, identifier);
    }

    public final void createSlab(BlockStateModelGenerator modelGenerator, Block block, TextureMap textureMap, Identifier doubleSlab) {
        Identifier identifier = Models.SLAB.upload(block, textureMap, modelGenerator.modelCollector);
        WeightedVariant modelVariant = createWeightedVariant(Models.SLAB_TOP.upload(block, textureMap, modelGenerator.modelCollector));
        modelGenerator.blockStateCollector.accept(createSlabBlockState(block, createWeightedVariant(identifier), modelVariant, createWeightedVariant(doubleSlab)));
        modelGenerator.registerParentedItemModel(block, identifier);
    }

    public final void createWall(BlockStateModelGenerator modelGenerator, Block block, TextureMap textureMap) {
        WeightedVariant modelVariant = createWeightedVariant(Models.TEMPLATE_WALL_POST.upload(block, textureMap, modelGenerator.modelCollector));
        WeightedVariant modelVariant2 = createWeightedVariant(Models.TEMPLATE_WALL_SIDE.upload(block, textureMap, modelGenerator.modelCollector));
        WeightedVariant modelVariant3 = createWeightedVariant(Models.TEMPLATE_WALL_SIDE_TALL.upload(block, textureMap, modelGenerator.modelCollector));
        modelGenerator.blockStateCollector.accept(createWallBlockState(block, modelVariant, modelVariant2, modelVariant3));
        Identifier identifier = Models.WALL_INVENTORY.upload(block, textureMap, modelGenerator.modelCollector);
        modelGenerator.registerParentedItemModel(block, identifier);
    }

    public static BlockStateVariantMap createUpDefaultRotationStates() {
        return BlockStateVariantMap.operations(Properties.FACING)
            .register(Direction.DOWN, ROTATE_X_180)
            .register(Direction.UP, NO_OP)
            .register(Direction.NORTH, ROTATE_X_270.then(ROTATE_Y_180))
            .register(Direction.SOUTH, ROTATE_X_270)
            .register(Direction.WEST, ROTATE_X_270.then(ROTATE_Y_90))
            .register(Direction.EAST, ROTATE_X_270.then(ROTATE_Y_270));
    }

    public static Identifier getTilesId(Block block) {
        return getModifiedBlockId(block, "_concrete", "_tiles");
    }

    public static Identifier getBlockId(String id) {
        return Blockus.id("block/" + id);
    }

    public static Identifier getBlockId(Block block) {
        return Blockus.id("block/" + BLOCK.getId(block).getPath());
    }

    public static Identifier getModifiedBlockId(Block block, String target, String replacement) {
        return Blockus.id("block/" + BLOCK.getId(block).getPath().replace(target, replacement));
    }

// TextureMaps

    private static TextureMap tilesTextures(Block tile1, Block tile2) {
        return (new TextureMap()).put(BlockusTextureKey.TILE_1, getTilesId(tile1)).put(BlockusTextureKey.TILE_2, getTilesId(tile2));
    }

    public static TextureMap sideTop(Identifier block, Identifier top) {
        return (new TextureMap()).put(TextureKey.SIDE, block).put(TextureKey.TOP, top);
    }

    public static TextureMap sideTopBottom(Identifier block, Identifier top, Identifier bottom) {
        return (new TextureMap()).put(TextureKey.SIDE, block).put(TextureKey.TOP, top).put(TextureKey.BOTTOM, bottom);
    }

    public static TextureMap sideTopBottom(Identifier block, Identifier end) {
        return (new TextureMap()).put(TextureKey.SIDE, block).put(TextureKey.TOP, end).put(TextureKey.BOTTOM, end);
    }

    public static TextureMap sideTopBottom(Identifier block) {
        return (new TextureMap()).put(TextureKey.SIDE, block).put(TextureKey.TOP, block).put(TextureKey.BOTTOM, block);
    }

    public static TextureMap frontTopSideBottom(Block block) {
        return (new TextureMap()).put(TextureKey.FRONT, TextureMap.getId(block)).put(TextureKey.TOP, TextureMap.getSubId(block, "_top")).put(TextureKey.SIDE, TextureMap.getSubId(block, "_side")).put(TextureKey.BOTTOM, TextureMap.getSubId(block, "_side"));
    }

    // Tint
    public final void registerTintableCrossBlockState(BlockStateModelGenerator modelGenerator, Block block, CrossType tintType) {
        TextureMap textureMap = tintType.getTextureMap(block);
        this.registerTintableCrossBlockState(modelGenerator, block, textureMap);
    }

    public final void registerTintableCrossBlockState(BlockStateModelGenerator modelGenerator, Block block, TextureMap crossTexture) {
        WeightedVariant modelVariant = createWeightedVariant(Models.CROSS.upload(block, crossTexture, modelGenerator.modelCollector));
        modelGenerator.blockStateCollector.accept(createSingletonBlockState(block, modelVariant));
    }

    public final void registerFlowerPotPlantAndItem(BlockStateModelGenerator modelGenerator, Block block, Block flowerPotBlock, CrossType crossType) {
        modelGenerator.registerItemModel(block.asItem(), crossType.registerItemModel(modelGenerator, block));
        this.registerFlowerPotPlant(modelGenerator, block, flowerPotBlock, crossType);
    }

    public final void registerFlowerPotPlant(BlockStateModelGenerator modelGenerator, Block plantBlock, Block flowerPotBlock, CrossType tintType) {
        this.registerTintableCrossBlockState(modelGenerator, plantBlock, tintType);
        TextureMap textureMap = tintType.getFlowerPotTextureMap(plantBlock);
        WeightedVariant modelVariant = createWeightedVariant(tintType.getFlowerPotCrossModel().upload(flowerPotBlock, textureMap, modelGenerator.modelCollector));
        modelGenerator.blockStateCollector.accept(createSingletonBlockState(flowerPotBlock, modelVariant));
    }
}
