package com.brand.blockus.datagen.providers;

import com.brand.blockus.datagen.family.BlockusFamilies;
import com.brand.blockus.registry.content.BlockusEntities;
import com.brand.blockus.registry.content.bundles.*;
import com.brand.blockus.registry.tag.BlockusItemTags;
import com.brand.blockus.utils.BlockChecker;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.data.family.BlockFamily;
import net.minecraft.data.recipe.*;
import net.minecraft.item.Item;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.Registries;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.resource.featuretoggle.FeatureFlags;
import net.minecraft.resource.featuretoggle.FeatureSet;

import java.util.concurrent.CompletableFuture;

import static com.brand.blockus.registry.content.BlockusBlocks.*;


public class BlockusRecipeProvider extends FabricRecipeProvider {
    public BlockusRecipeProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected RecipeGenerator getRecipeGenerator(RegistryWrapper.WrapperLookup registryLookup, RecipeExporter exporter) {
        return new RecipeGenerator(registryLookup, exporter) {
            @Override
            public void generate() {

                for (BSSWBundle BSSWBundle : BSSWBundle.values()) {

                }

                for (ConcreteBundle concreteType : ConcreteBundle.values()) {

                }

                for (TimberFrameBundle timberFrameBundle : TimberFrameBundle.values()) {
                    createTimberFramesRecipes(timberFrameBundle.base, timberFrameBundle.block, timberFrameBundle.diagonal, timberFrameBundle.cross);
                    createLatticeRecipes(timberFrameBundle.base, timberFrameBundle.lattice, timberFrameBundle.grate);
                }

                for (AsphaltBundle asphaltBundle : AsphaltBundle.values()) {

                }

                for (WoolBundle woolBundle : WoolBundle.values()) {
                    if (woolBundle.typeSuffix.equals(WoolBundle.PATTERNED)) {
                        offerPatternedWoolRecipe(woolBundle.block, woolBundle.basewool, woolBundle.carpet, woolBundle.basecarpet);
                    } else if (woolBundle.typeSuffix.equals(WoolBundle.GINGHAM)) {
                        offerGinghamWoolRecipe(woolBundle.block, woolBundle.basewool);
                    }
                    offerStairsRecipe(woolBundle.stairs, woolBundle.block);
                    offerSlabRecipe(RecipeCategory.BUILDING_BLOCKS, woolBundle.slab, woolBundle.block);
                    offerCarpetRecipe(woolBundle.carpet, woolBundle.block);

                }


                generateFamilies(FeatureSet.of(FeatureFlags.VANILLA));

                offerPillarRecipe(MUD_BRICK_PILLAR, Blocks.MUD_BRICKS);
                offerStonecuttingRecipe(CHISELED_MUD_BRICKS, Blocks.MUD_BRICKS);

                // Stone
                offerBsswCuttingRecipe(STONE_TILES, Blocks.STONE, Blocks.STONE_BRICKS);
                offerPolishedStoneRecipe(STONE_TILES.block, Blocks.STONE_BRICKS);
                offerStonecuttingRecipe(STONE_BRICK_PILLAR, Blocks.STONE, Blocks.STONE_BRICKS);
                offerStonecuttingRecipe(HERRINGBONE_STONE_BRICKS, Blocks.STONE, Blocks.STONE_BRICKS);
                offerSturdyRecipe(STURDY_STONE, Blocks.STONE, Blocks.COBBLESTONE);

                // Andesite
                offerBsswCuttingRecipe(ANDESITE_BRICKS, Blocks.ANDESITE, Blocks.POLISHED_ANDESITE);
                offerPolishedStoneRecipe(ANDESITE_BRICKS.block, Blocks.POLISHED_ANDESITE);
                offerCrackingRecipe(CRACKED_ANDESITE_BRICKS, ANDESITE_BRICKS.block);
                offerStonecuttingRecipe(CHISELED_ANDESITE_BRICKS, Blocks.ANDESITE, Blocks.POLISHED_ANDESITE, ANDESITE_BRICKS.block);
                offerStonecuttingRecipe(POLISHED_ANDESITE_PILLAR, Blocks.ANDESITE, Blocks.POLISHED_ANDESITE, ANDESITE_BRICKS.block);
                offerStonecuttingRecipe(HERRINGBONE_ANDESITE_BRICKS, Blocks.ANDESITE, Blocks.POLISHED_ANDESITE, ANDESITE_BRICKS.block);

                // Diorite
                offerBsswCuttingRecipe(DIORITE_BRICKS, Blocks.DIORITE, Blocks.POLISHED_DIORITE);
                offerPolishedStoneRecipe(DIORITE_BRICKS.block, Blocks.POLISHED_DIORITE);
                offerCrackingRecipe(CRACKED_DIORITE_BRICKS, DIORITE_BRICKS.block);
                offerStonecuttingRecipe(CHISELED_DIORITE_BRICKS, Blocks.DIORITE, Blocks.POLISHED_DIORITE, DIORITE_BRICKS.block);
                offerStonecuttingRecipe(POLISHED_DIORITE_PILLAR, Blocks.DIORITE, Blocks.POLISHED_DIORITE, DIORITE_BRICKS.block);
                offerStonecuttingRecipe(HERRINGBONE_DIORITE_BRICKS, Blocks.DIORITE, Blocks.POLISHED_DIORITE, DIORITE_BRICKS.block);

                // Granite
                offerBsswCuttingRecipe(GRANITE_BRICKS, Blocks.GRANITE, Blocks.POLISHED_GRANITE);
                offerPolishedStoneRecipe(GRANITE_BRICKS.block, Blocks.POLISHED_GRANITE);
                offerCrackingRecipe(CRACKED_GRANITE_BRICKS, GRANITE_BRICKS.block);
                offerStonecuttingRecipe(CHISELED_GRANITE_BRICKS, Blocks.GRANITE, Blocks.POLISHED_GRANITE, GRANITE_BRICKS.block);
                offerStonecuttingRecipe(POLISHED_GRANITE_PILLAR, Blocks.GRANITE, Blocks.POLISHED_GRANITE, GRANITE_BRICKS.block);
                offerStonecuttingRecipe(HERRINGBONE_GRANITE_BRICKS, Blocks.GRANITE, Blocks.POLISHED_GRANITE, GRANITE_BRICKS.block);

                // Dripstone
                offerBsswCuttingRecipe(POLISHED_DRIPSTONE, Blocks.DRIPSTONE_BLOCK);
                offerPolishedStoneRecipe(POLISHED_DRIPSTONE.block, Blocks.DRIPSTONE_BLOCK);
                offerBsswCuttingRecipe(DRIPSTONE_BRICKS, Blocks.DRIPSTONE_BLOCK, POLISHED_DRIPSTONE.block);
                offerPolishedStoneRecipe(DRIPSTONE_BRICKS.block, POLISHED_DRIPSTONE.block);
                offerMossyRecipe(MOSSY_DRIPSTONE_BRICKS.block, DRIPSTONE_BRICKS.block);
                offerBsswCuttingRecipe(MOSSY_DRIPSTONE_BRICKS);
                offerCrackingRecipe(CRACKED_DRIPSTONE_BRICKS, DRIPSTONE_BRICKS.block);
                offerStonecuttingRecipe(CHISELED_DRIPSTONE, Blocks.DRIPSTONE_BLOCK, POLISHED_DRIPSTONE.block, DRIPSTONE_BRICKS.block);
                offerStonecuttingRecipe(DRIPSTONE_PILLAR, Blocks.DRIPSTONE_BLOCK, POLISHED_DRIPSTONE.block, DRIPSTONE_BRICKS.block);

                // Tuff
                offerBsswCuttingRecipe(TUFF_TILES, Blocks.TUFF, Blocks.POLISHED_TUFF, Blocks.TUFF_BRICKS);
                offerPolishedStoneRecipe(TUFF_TILES.block, Blocks.TUFF_BRICKS);
                offerCrackingRecipe(CRACKED_TUFF_BRICKS, Blocks.TUFF_BRICKS);
                offerMossyRecipe(MOSSY_TUFF_BRICKS.block, Blocks.TUFF_BRICKS);
                offerBsswCuttingRecipe(MOSSY_TUFF_BRICKS);
                offerStonecuttingRecipe(CARVED_TUFF_BRICKS, Blocks.TUFF, Blocks.POLISHED_TUFF, Blocks.TUFF_BRICKS);
                offerStonecuttingRecipe(TUFF_PILLAR, Blocks.TUFF, Blocks.POLISHED_TUFF, Blocks.TUFF_BRICKS);
                offerStonecuttingRecipe(HERRINGBONE_TUFF_BRICKS, Blocks.TUFF, Blocks.POLISHED_TUFF, Blocks.TUFF_BRICKS);

                // Amethyst
                offerBsswCuttingRecipe(POLISHED_AMETHYST, Blocks.AMETHYST_BLOCK);
                offerPolishedStoneRecipe(POLISHED_AMETHYST.block, Blocks.AMETHYST_BLOCK);
                offerBsswCuttingRecipe(AMETHYST_BRICKS, Blocks.AMETHYST_BLOCK, POLISHED_AMETHYST.block);
                offerPolishedStoneRecipe(AMETHYST_BRICKS.block, POLISHED_AMETHYST.block);
                offerStonecuttingRecipe(CHISELED_AMETHYST, Blocks.AMETHYST_BLOCK, POLISHED_AMETHYST.block, AMETHYST_BRICKS.block);
                offerStonecuttingRecipe(AMETHYST_PILLAR, Blocks.AMETHYST_BLOCK, POLISHED_AMETHYST.block, AMETHYST_BRICKS.block);

                // Deepslate
                offerMossyRecipe(MOSSY_DEEPSLATE_BRICKS.block, Blocks.DEEPSLATE_BRICKS);
                offerBsswCuttingRecipe(MOSSY_DEEPSLATE_BRICKS);
                offerStonecuttingRecipe(DEEPSLATE_PILLAR, Blocks.COBBLED_DEEPSLATE, Blocks.POLISHED_DEEPSLATE, Blocks.DEEPSLATE_BRICKS);
                offerStonecuttingRecipe(HERRINGBONE_DEEPSLATE_BRICKS, Blocks.COBBLED_DEEPSLATE, Blocks.POLISHED_DEEPSLATE, Blocks.DEEPSLATE_BRICKS);
                offerSturdyRecipe(STURDY_DEEPSLATE, Blocks.DEEPSLATE, Blocks.COBBLED_DEEPSLATE);

                // Sculk
                offerBsswCuttingRecipe(POLISHED_SCULK, Blocks.SCULK);
                offerPolishedStoneRecipe(POLISHED_SCULK.block, Blocks.SCULK);
                offerBsswCuttingRecipe(SCULK_BRICKS, Blocks.SCULK, POLISHED_SCULK.block);
                offerStonecuttingRecipe(CHISELED_SCULK_BRICKS, Blocks.SCULK, POLISHED_SCULK.block, SCULK_BRICKS.block);
                offerStonecuttingRecipe(SCULK_PILLAR, Blocks.SCULK, POLISHED_SCULK.block, SCULK_BRICKS.block);
                offerPolishedStoneRecipe(SCULK_BRICKS.block, POLISHED_SCULK.block);

                // Blackstone
                offerBsswCuttingRecipe(POLISHED_BLACKSTONE_TILES, Blocks.BLACKSTONE, Blocks.POLISHED_BLACKSTONE, Blocks.POLISHED_BLACKSTONE_BRICKS);
                offerPolishedStoneRecipe(POLISHED_BLACKSTONE_TILES.block, Blocks.POLISHED_BLACKSTONE_BRICKS);
                offerStonecuttingRecipe(POLISHED_BLACKSTONE_PILLAR, Blocks.BLACKSTONE, Blocks.POLISHED_BLACKSTONE, Blocks.POLISHED_BLACKSTONE_BRICKS);
                offerStonecuttingRecipe(HERRINGBONE_POLISHED_BLACKSTONE_BRICKS, Blocks.BLACKSTONE, Blocks.POLISHED_BLACKSTONE, Blocks.POLISHED_BLACKSTONE_BRICKS);
                createShapeless(RecipeCategory.BUILDING_BLOCKS, CRIMSON_WARTY_BLACKSTONE_BRICKS.block).input(Blocks.POLISHED_BLACKSTONE_BRICKS).input(Blocks.CRIMSON_ROOTS).criterion("has_roots", conditionsFromItem(Blocks.CRIMSON_ROOTS)).offerTo(exporter);
                offerBsswCuttingRecipe(CRIMSON_WARTY_BLACKSTONE_BRICKS);
                createShapeless(RecipeCategory.BUILDING_BLOCKS, WARPED_WARTY_BLACKSTONE_BRICKS.block).input(Blocks.POLISHED_BLACKSTONE_BRICKS).input(BlockusItemTags.WARPED_NETHER_GRASS).criterion("has_roots", conditionsFromTag(BlockusItemTags.WARPED_NETHER_GRASS)).offerTo(exporter);
                offerBsswCuttingRecipe(WARPED_WARTY_BLACKSTONE_BRICKS);
                offerSturdyRecipe(STURDY_BLACKSTONE, Blocks.POLISHED_BLACKSTONE, Blocks.BLACKSTONE);
                offerDecoratedRecipe(GOLD_DECORATED_POLISHED_BLACKSTONE, Items.GOLD_INGOT, Blocks.POLISHED_BLACKSTONE);

                // Basalt
                offerBsswCuttingRecipe(ROUGH_BASALT);
                createShaped(RecipeCategory.BUILDING_BLOCKS, ROUGH_BASALT.block, 2).input('#', Blocks.BASALT).pattern("#").pattern("#").criterion("has_basalt", conditionsFromItem(Blocks.BASALT)).offerTo(exporter);
                offerBsswCuttingRecipe(POLISHED_BASALT_BRICKS, Blocks.BASALT, Blocks.POLISHED_BASALT);
                offerPolishedStoneRecipe(POLISHED_BASALT_BRICKS.block, Blocks.POLISHED_BASALT);
                offerCrackingRecipe(CRACKED_POLISHED_BASALT_BRICKS, POLISHED_BASALT_BRICKS.block);
                offerStonecuttingRecipe(CHISELED_POLISHED_BASALT, Blocks.BASALT, Blocks.POLISHED_BASALT, POLISHED_BASALT_BRICKS.block);
                offerStonecuttingRecipe(POLISHED_BASALT_PILLAR, Blocks.BASALT, Blocks.POLISHED_BASALT, POLISHED_BASALT_BRICKS.block);
                offerStonecuttingRecipe(HERRINGBONE_POLISHED_BASALT_BRICKS, Blocks.BASALT, Blocks.POLISHED_BASALT, POLISHED_BASALT_BRICKS.block);

                // Wart Blocks
                offerBsswCuttingRecipe(CRIMSON_WART_BRICKS, Blocks.NETHER_WART_BLOCK);
                offerPolishedStoneRecipe(CRIMSON_WART_BRICKS.block, Blocks.NETHER_WART_BLOCK);
                offerBsswCuttingRecipe(WARPED_WART_BRICKS, Blocks.WARPED_WART_BLOCK);
                offerPolishedStoneRecipe(WARPED_WART_BRICKS.block, Blocks.WARPED_WART_BLOCK);

                // Limestone
                offerBsswCuttingRecipe(LIMESTONE);
                createShaped(RecipeCategory.BUILDING_BLOCKS, LIMESTONE.block).input('#', Blocks.COBBLESTONE).input('X', Items.BONE_MEAL).pattern("#X").pattern("X#").criterion(hasItem(Blocks.COBBLESTONE), conditionsFromItem(Blocks.COBBLESTONE)).offerTo(exporter);
                offerBsswCuttingRecipe(POLISHED_LIMESTONE, LIMESTONE.block);
                offerPolishedStoneRecipe(POLISHED_LIMESTONE.block, LIMESTONE.block);
                offerBsswCuttingRecipe(LIMESTONE_BRICKS, LIMESTONE.block, POLISHED_LIMESTONE.block);
                offerPolishedStoneRecipe(LIMESTONE_BRICKS.block, POLISHED_LIMESTONE.block);
                offerBsswCuttingRecipe(SMALL_LIMESTONE_BRICKS, LIMESTONE.block, POLISHED_LIMESTONE.block, LIMESTONE_BRICKS.block);
                offerBsswCuttingRecipe(LIMESTONE_TILES, LIMESTONE.block, POLISHED_LIMESTONE.block, LIMESTONE_BRICKS.block);
                offerPolishedStoneRecipe(LIMESTONE_TILES.block, LIMESTONE_BRICKS.block);
                offerStonecuttingRecipe(CHISELED_LIMESTONE, LIMESTONE.block, POLISHED_LIMESTONE.block, LIMESTONE_BRICKS.block);
                offerStonecuttingRecipe(CHISELED_LIMESTONE_BRICKS, LIMESTONE.block, POLISHED_LIMESTONE.block, LIMESTONE_BRICKS.block);
                offerStonecuttingRecipe(CHISELED_LIMESTONE_PILLAR, LIMESTONE.block, POLISHED_LIMESTONE.block, LIMESTONE_BRICKS.block, LIMESTONE_PILLAR);
                offerStonecuttingRecipe(LIMESTONE_PILLAR, LIMESTONE.block, POLISHED_LIMESTONE.block, LIMESTONE_BRICKS.block);
                offerStonecuttingRecipe(LIMESTONE_SQUARES, LIMESTONE.block, POLISHED_LIMESTONE.block, LIMESTONE_BRICKS.block);
                offerStonecuttingRecipe(LIMESTONE_LINES, LIMESTONE.block, POLISHED_LIMESTONE.block, LIMESTONE_BRICKS.block);

                // Marble
                offerBsswCuttingRecipe(MARBLE);
                createShaped(RecipeCategory.BUILDING_BLOCKS, MARBLE.block).input('#', LIMESTONE.block).input('X', Items.BONE_MEAL).pattern("#X").pattern("X#").group("marble").criterion(hasItem(LIMESTONE.block), conditionsFromItem(LIMESTONE.block)).offerTo(exporter);
                createShapeless(RecipeCategory.BUILDING_BLOCKS, MARBLE.block).input(Blocks.CALCITE).input(LIMESTONE.block).group("marble").criterion(hasItem(Blocks.CALCITE), conditionsFromItem(Blocks.CALCITE)).offerTo(exporter, convertBetween(MARBLE.block, Blocks.CALCITE));
                offerBsswCuttingRecipe(POLISHED_MARBLE, MARBLE.block);
                offerPolishedStoneRecipe(POLISHED_MARBLE.block, MARBLE.block);
                offerBsswCuttingRecipe(MARBLE_BRICKS, MARBLE.block, POLISHED_MARBLE.block);
                offerPolishedStoneRecipe(MARBLE_BRICKS.block, POLISHED_MARBLE.block);
                offerBsswCuttingRecipe(SMALL_MARBLE_BRICKS, MARBLE.block, POLISHED_MARBLE.block, MARBLE_BRICKS.block);
                offerBsswCuttingRecipe(MARBLE_TILES, MARBLE.block, POLISHED_MARBLE.block, MARBLE_BRICKS.block);
                offerPolishedStoneRecipe(MARBLE_TILES.block, MARBLE_BRICKS.block);
                offerStonecuttingRecipe(CHISELED_MARBLE, MARBLE.block, POLISHED_MARBLE.block, MARBLE_BRICKS.block);
                offerStonecuttingRecipe(CHISELED_MARBLE_BRICKS, MARBLE.block, POLISHED_MARBLE.block, MARBLE_BRICKS.block);
                offerStonecuttingRecipe(CHISELED_MARBLE_PILLAR, MARBLE.block, POLISHED_MARBLE.block, MARBLE_BRICKS.block, MARBLE_PILLAR);
                offerStonecuttingRecipe(MARBLE_PILLAR, MARBLE.block, POLISHED_MARBLE.block, MARBLE_BRICKS.block);
                offerStonecuttingRecipe(MARBLE_SQUARES, MARBLE.block, POLISHED_MARBLE.block, MARBLE_BRICKS.block);
                offerStonecuttingRecipe(MARBLE_LINES, MARBLE.block, POLISHED_MARBLE.block, MARBLE_BRICKS.block);

                // Bluestone
                offerBsswCuttingRecipe(BLUESTONE);
                createShaped(RecipeCategory.BUILDING_BLOCKS, BLUESTONE.block, 4).input('S', Blocks.STONE).input('#', Items.BLUE_DYE).pattern(" S ").pattern("S#S").pattern(" S ").criterion(hasItem(Items.BLUE_DYE), conditionsFromItem(Items.BLUE_DYE)).criterion(hasItem(Blocks.STONE), conditionsFromItem(Blocks.STONE)).offerTo(exporter);
                offerBsswCuttingRecipe(POLISHED_BLUESTONE, BLUESTONE.block);
                offerPolishedStoneRecipe(POLISHED_BLUESTONE.block, BLUESTONE.block);
                offerBsswCuttingRecipe(BLUESTONE_BRICKS, BLUESTONE.block, POLISHED_BLUESTONE.block);
                offerPolishedStoneRecipe(BLUESTONE_BRICKS.block, POLISHED_BLUESTONE.block);
                offerBsswCuttingRecipe(SMALL_BLUESTONE_BRICKS, BLUESTONE.block, POLISHED_BLUESTONE.block, BLUESTONE_BRICKS.block);
                offerBsswCuttingRecipe(BLUESTONE_TILES, BLUESTONE.block, POLISHED_BLUESTONE.block, BLUESTONE_BRICKS.block);
                offerPolishedStoneRecipe(BLUESTONE_TILES.block, BLUESTONE_BRICKS.block);
                offerStonecuttingRecipe(CHISELED_BLUESTONE, BLUESTONE.block, POLISHED_BLUESTONE.block, BLUESTONE_BRICKS.block);
                offerStonecuttingRecipe(CHISELED_BLUESTONE_BRICKS, BLUESTONE.block, POLISHED_BLUESTONE.block, BLUESTONE_BRICKS.block);
                offerStonecuttingRecipe(CHISELED_BLUESTONE_PILLAR, BLUESTONE.block, POLISHED_BLUESTONE.block, BLUESTONE_BRICKS.block, BLUESTONE_PILLAR);
                offerStonecuttingRecipe(BLUESTONE_PILLAR, BLUESTONE.block, POLISHED_BLUESTONE.block, BLUESTONE_BRICKS.block);
                offerStonecuttingRecipe(BLUESTONE_SQUARES, BLUESTONE.block, POLISHED_BLUESTONE.block, BLUESTONE_BRICKS.block);
                offerStonecuttingRecipe(BLUESTONE_LINES, BLUESTONE.block, POLISHED_BLUESTONE.block, BLUESTONE_BRICKS.block);

                // Viridite
                offerBsswCuttingRecipe(VIRIDITE);
                createShaped(RecipeCategory.BUILDING_BLOCKS, VIRIDITE.block, 4).input('S', Blocks.DEEPSLATE).input('#', Blocks.SCULK).pattern(" S ").pattern("S#S").pattern(" S ").criterion(hasItem(Blocks.SCULK), conditionsFromItem(Blocks.SCULK)).criterion(hasItem(Blocks.DEEPSLATE), conditionsFromItem(Blocks.DEEPSLATE)).offerTo(exporter);
                createShaped(RecipeCategory.BUILDING_BLOCKS, VIRIDITE.block, 4).input('S', Blocks.DEEPSLATE).input('#', Items.GREEN_DYE).pattern(" S ").pattern("S#S").pattern(" S ").criterion(hasItem(Items.GREEN_DYE), conditionsFromItem(Items.GREEN_DYE)).criterion(hasItem(Blocks.DEEPSLATE), conditionsFromItem(Blocks.DEEPSLATE)).offerTo(exporter, convertBetween(VIRIDITE.block, Items.GREEN_DYE));
                offerBsswCuttingRecipe(POLISHED_VIRIDITE, VIRIDITE.block);
                offerPolishedStoneRecipe(POLISHED_VIRIDITE.block, VIRIDITE.block);
                offerBsswCuttingRecipe(VIRIDITE_BRICKS, VIRIDITE.block, POLISHED_VIRIDITE.block);
                offerPolishedStoneRecipe(VIRIDITE_BRICKS.block, POLISHED_VIRIDITE.block);
                offerBsswCuttingRecipe(SMALL_VIRIDITE_BRICKS, VIRIDITE.block, POLISHED_VIRIDITE.block, VIRIDITE_BRICKS.block);
                offerBsswCuttingRecipe(VIRIDITE_TILES, VIRIDITE.block, POLISHED_VIRIDITE.block, VIRIDITE_BRICKS.block);
                offerPolishedStoneRecipe(VIRIDITE_TILES.block, VIRIDITE_BRICKS.block);
                offerStonecuttingRecipe(CHISELED_VIRIDITE, VIRIDITE.block, POLISHED_VIRIDITE.block, VIRIDITE_BRICKS.block);
                offerStonecuttingRecipe(CHISELED_VIRIDITE_BRICKS, VIRIDITE.block, POLISHED_VIRIDITE.block, VIRIDITE_BRICKS.block);
                offerStonecuttingRecipe(CHISELED_VIRIDITE_PILLAR, VIRIDITE.block, POLISHED_VIRIDITE.block, VIRIDITE_BRICKS.block, VIRIDITE_PILLAR);
                offerStonecuttingRecipe(VIRIDITE_PILLAR, VIRIDITE.block, POLISHED_VIRIDITE.block, VIRIDITE_BRICKS.block);
                offerStonecuttingRecipe(VIRIDITE_SQUARES, VIRIDITE.block, POLISHED_VIRIDITE.block, VIRIDITE_BRICKS.block);
                offerStonecuttingRecipe(VIRIDITE_LINES, VIRIDITE.block, POLISHED_VIRIDITE.block, VIRIDITE_BRICKS.block);

                // Lava	Bricks
                offerBsswCuttingRecipe(LAVA_BRICKS);
                offerStonecuttingRecipe(CHISELED_LAVA_BRICKS, LAVA_BRICKS.block);
                createEnclosedRecipe(LAVA_BRICKS.block, Ingredient.ofItems(Blocks.STONE_BRICKS), Items.LAVA_BUCKET).criterion(hasItem(Items.LAVA_BUCKET), conditionsFromItem(Items.LAVA_BUCKET)).criterion(hasItem(Blocks.STONE_BRICKS), conditionsFromItem(Blocks.STONE_BRICKS)).offerTo(exporter);

                // Lava Blackstone Bricks
                offerBsswCuttingRecipe(LAVA_POLISHED_BLACKSTONE_BRICKS);
                offerStonecuttingRecipe(CHISELED_LAVA_POLISHED_BLACKSTONE, LAVA_POLISHED_BLACKSTONE_BRICKS.block);
                createEnclosedRecipe(LAVA_POLISHED_BLACKSTONE_BRICKS.block, Ingredient.ofItems(Blocks.POLISHED_BLACKSTONE_BRICKS), Items.LAVA_BUCKET).criterion(hasItem(Items.LAVA_BUCKET), conditionsFromItem(Items.LAVA_BUCKET)).criterion(hasItem(Blocks.POLISHED_BLACKSTONE_BRICKS), conditionsFromItem(Blocks.POLISHED_BLACKSTONE_BRICKS)).offerTo(exporter);

                // Water Bricks
                offerBsswCuttingRecipe(WATER_BRICKS);
                offerStonecuttingRecipe(CHISELED_WATER_BRICKS, WATER_BRICKS.block);
                createEnclosedRecipe(WATER_BRICKS.block, Ingredient.ofItems(Blocks.STONE_BRICKS), Items.WATER_BUCKET).criterion(hasItem(Items.WATER_BUCKET), conditionsFromItem(Items.WATER_BUCKET)).criterion(hasItem(Blocks.STONE_BRICKS), conditionsFromItem(Blocks.STONE_BRICKS)).offerTo(exporter);

                // Snow Bricks
                offerBsswCuttingRecipe(SNOW_BRICKS);
                offerStonecuttingRecipe(SNOW_PILLAR, SNOW_BRICKS.block);
                offerPolishedStoneRecipe(SNOW_BRICKS.block, Blocks.SNOW_BLOCK);

                // Ice Bricks
                offerStonecuttingRecipe(ICE_PILLAR, ICE_BRICKS);
                createShaped(RecipeCategory.BUILDING_BLOCKS, ICE_BRICKS, 4).input('#', BlockusItemTags.NATURAL_ICE).pattern("##").pattern("##").criterion("has_ice", conditionsFromTag(BlockusItemTags.NATURAL_ICE)).offerTo(exporter);

                // Magma Bricks
                offerBsswCuttingRecipe(MAGMA_BRICKS, Blocks.MAGMA_BLOCK);
                offerPolishedStoneRecipe(MAGMA_BRICKS.block, Blocks.MAGMA_BLOCK);
                offerBsswCuttingRecipe(SMALL_MAGMA_BRICKS, Blocks.MAGMA_BLOCK, MAGMA_BRICKS.block);
                offerStonecuttingRecipe(CHISELED_MAGMA_BRICKS, Blocks.MAGMA_BLOCK, MAGMA_BRICKS.block);

                // Nether Bricks
                offerBsswCuttingRecipe(POLISHED_NETHER_BRICKS, Blocks.NETHER_BRICKS);
                offerPolishedStoneRecipe(POLISHED_NETHER_BRICKS.block, Blocks.NETHER_BRICKS);
                offerStonecuttingRecipe(NETHER_BRICK_PILLAR, Blocks.NETHER_BRICKS);
                offerStonecuttingRecipe(HERRINGBONE_NETHER_BRICKS, Blocks.NETHER_BRICKS);

                offerBsswCuttingRecipe(POLISHED_RED_NETHER_BRICKS, Blocks.RED_NETHER_BRICKS);
                offerPolishedStoneRecipe(POLISHED_RED_NETHER_BRICKS.block, Blocks.RED_NETHER_BRICKS);
                offerStonecuttingRecipe(RED_NETHER_BRICK_PILLAR, Blocks.RED_NETHER_BRICKS);
                offerStonecuttingRecipe(HERRINGBONE_RED_NETHER_BRICKS, Blocks.RED_NETHER_BRICKS);

                offerBsswCuttingRecipe(NETHER_TILES);
                createShaped(RecipeCategory.BUILDING_BLOCKS, NETHER_TILES.block, 4).input('#', Blocks.NETHERRACK).input('X', Blocks.NETHER_BRICKS).pattern("#X").pattern("X#").criterion(hasItem(Blocks.NETHER_BRICKS), conditionsFromItem(Blocks.NETHER_BRICKS)).offerTo(exporter);

                // Obsidian
                offerBsswCuttingRecipe(OBSIDIAN_BRICKS, Blocks.OBSIDIAN);
                offerPolishedStoneRecipe(OBSIDIAN_BRICKS.block, Blocks.OBSIDIAN);
                offerCrackingRecipe(CRACKED_OBSIDIAN_BRICKS, OBSIDIAN_BRICKS.block);
                offerBsswCuttingRecipe(SMALL_OBSIDIAN_BRICKS, Blocks.OBSIDIAN, OBSIDIAN_BRICKS.block);
                offerStonecuttingRecipe(OBSIDIAN_PILLAR, Blocks.OBSIDIAN, OBSIDIAN_BRICKS.block);
                createShaped(RecipeCategory.BUILDING_BLOCKS, GLOWING_OBSIDIAN, 4).input('S', Blocks.OBSIDIAN).input('#', Blocks.SHROOMLIGHT).pattern(" S ").pattern("S#S").pattern(" S ").criterion(hasItem(Blocks.SHROOMLIGHT), conditionsFromItem(Blocks.SHROOMLIGHT)).offerTo(exporter);


                for (CopperBundle copperBundle : CopperBundle.values()) {
                    offerWaxingRecipes(copperBundle.block, copperBundle.blockWaxed);

                }

                // Prismarine
                offerStonecuttingRecipe(CHISELED_PRISMARINE, Blocks.PRISMARINE_BRICKS);
                offerStonecuttingRecipe(PRISMARINE_PILLAR, Blocks.PRISMARINE_BRICKS);
                offerStonecuttingRecipe(CHISELED_DARK_PRISMARINE, Blocks.DARK_PRISMARINE);
                offerStonecuttingRecipe(DARK_PRISMARINE_PILLAR, Blocks.DARK_PRISMARINE);
                offerBsswCuttingRecipe(PRISMARINE_TILES);
                createShaped(RecipeCategory.BUILDING_BLOCKS, PRISMARINE_TILES.block, 4).input('#', Blocks.DARK_PRISMARINE).input('X', Items.PRISMARINE_SHARD).pattern("#X").pattern("X#").criterion(hasItem(Blocks.DARK_PRISMARINE), conditionsFromItem(Blocks.DARK_PRISMARINE)).offerTo(exporter);

                // Bricks
                offerBsswCuttingRecipe(LARGE_BRICKS, Blocks.BRICKS);
                offerPolishedStoneRecipe(LARGE_BRICKS.block, Blocks.BRICKS);
                offerStonecuttingRecipe(HERRINGBONE_BRICKS, Blocks.BRICKS);

                // Soaked Bricks
                offerBsswCuttingRecipe(SOAKED_BRICKS);
                offerStonecuttingRecipe(HERRINGBONE_SOAKED_BRICKS, SOAKED_BRICKS.block);
                createEnclosedRecipe(SOAKED_BRICKS.block, Ingredient.ofItems(Blocks.BRICKS), Items.WATER_BUCKET).criterion(hasItem(Items.WATER_BUCKET), conditionsFromItem(Items.WATER_BUCKET)).criterion(hasItem(Blocks.BRICKS), conditionsFromItem(Blocks.BRICKS)).offerTo(exporter);

                // Sandy Bricks
                offerBsswCuttingRecipe(SANDY_BRICKS);
                offerStonecuttingRecipe(HERRINGBONE_SANDY_BRICKS, SANDY_BRICKS.block);
                createShaped(RecipeCategory.BUILDING_BLOCKS, SANDY_BRICKS.block, 2).input('S', Blocks.SAND).input('#', Blocks.BRICKS).pattern(" S ").pattern("S#S").pattern(" S ").criterion("has_sand", conditionsFromItem(Blocks.SAND)).criterion("has_bricks", conditionsFromItem(Blocks.BRICKS)).offerTo(exporter);

                // Resin Bricks
                offerBsswCuttingRecipe(LARGE_RESIN_BRICKS, Blocks.RESIN_BRICKS);
                offerPolishedStoneRecipe(LARGE_RESIN_BRICKS.block, Blocks.RESIN_BRICKS);
                offerStonecuttingRecipe(HERRINGBONE_RESIN_BRICKS, Blocks.RESIN_BRICKS);
                offerStonecuttingRecipe(RESIN_BRICK_PILLAR, Blocks.RESIN_BRICKS);

                // Sandstone
                offerBsswCuttingRecipe(ROUGH_SANDSTONE);
                createShaped(RecipeCategory.BUILDING_BLOCKS, ROUGH_SANDSTONE.block, 2).input('#', Blocks.SANDSTONE_SLAB).pattern("##").pattern("##").criterion("has_sandstone", conditionsFromItem(Blocks.SANDSTONE)).offerTo(exporter);
                offerBsswCuttingRecipe(SANDSTONE_BRICKS, Blocks.SANDSTONE);
                offerBsswCuttingRecipe(SMALL_SANDSTONE_BRICKS, Blocks.SANDSTONE, SANDSTONE_BRICKS.block);
                offerStonecuttingRecipe(SANDSTONE_PILLAR, Blocks.SANDSTONE, SANDSTONE_BRICKS.block);
                offerDecoratedRecipe(GOLD_DECORATED_SANDSTONE, Items.GOLD_INGOT, Blocks.CUT_SANDSTONE);
                offerDecoratedRecipe(LAPIS_DECORATED_SANDSTONE, Items.LAPIS_LAZULI, Blocks.CUT_SANDSTONE);

                // Red Sandstone
                offerBsswCuttingRecipe(ROUGH_RED_SANDSTONE);
                createShaped(RecipeCategory.BUILDING_BLOCKS, ROUGH_RED_SANDSTONE.block, 2).input('#', Blocks.RED_SANDSTONE_SLAB).pattern("##").pattern("##").criterion("has_red_sandstone", conditionsFromItem(Blocks.RED_SANDSTONE)).offerTo(exporter);
                offerBsswCuttingRecipe(RED_SANDSTONE_BRICKS, Blocks.RED_SANDSTONE);
                offerBsswCuttingRecipe(SMALL_RED_SANDSTONE_BRICKS, Blocks.RED_SANDSTONE, RED_SANDSTONE_BRICKS.block);
                offerStonecuttingRecipe(RED_SANDSTONE_PILLAR, Blocks.RED_SANDSTONE, RED_SANDSTONE_BRICKS.block);
                offerDecoratedRecipe(GOLD_DECORATED_RED_SANDSTONE, Items.GOLD_INGOT, Blocks.CUT_RED_SANDSTONE);
                offerDecoratedRecipe(LAPIS_DECORATED_RED_SANDSTONE, Items.LAPIS_LAZULI, Blocks.CUT_RED_SANDSTONE);

                // Soul Sandstone
                offerBsswCuttingRecipe(SOUL_SANDSTONE);
                createShaped(RecipeCategory.BUILDING_BLOCKS, SOUL_SANDSTONE.block).input('#', BlockusItemTags.SOUL_SOILS).pattern("##").pattern("##").criterion("has_soul_sand", conditionsFromTag(BlockusItemTags.SOUL_SOILS)).offerTo(exporter);
                offerBsswCuttingRecipe(SMOOTH_SOUL_SANDSTONE);
                CookingRecipeJsonBuilder.createSmelting(Ingredient.ofItems(SOUL_SANDSTONE.block), RecipeCategory.BUILDING_BLOCKS, SMOOTH_SOUL_SANDSTONE.block.asItem(), 0.1F, 200).criterion("has_soul_sandstone", conditionsFromItem(SOUL_SANDSTONE.block)).offerTo(exporter);
                offerPolishedStoneRecipe(CUT_SOUL_SANDSTONE, SOUL_SANDSTONE.block);
                offerStonecuttingRecipe(CUT_SOUL_SANDSTONE, SOUL_SANDSTONE.block);

                offerBsswCuttingRecipe(ROUGH_SOUL_SANDSTONE);
                offerBsswCuttingRecipe(SOUL_SANDSTONE_BRICKS, SOUL_SANDSTONE.block);
                offerBsswCuttingRecipe(SMALL_SOUL_SANDSTONE_BRICKS, SOUL_SANDSTONE.block, SOUL_SANDSTONE_BRICKS.block);
                offerStonecuttingRecipe(CHISELED_SOUL_SANDSTONE, SOUL_SANDSTONE.block);
                offerPolishedStoneRecipe(CHISELED_SOUL_SANDSTONE, CUT_SOUL_SANDSTONE);
                offerStonecuttingRecipe(SOUL_SANDSTONE_PILLAR, SOUL_SANDSTONE.block, SOUL_SANDSTONE_BRICKS.block);
                offerDecoratedRecipe(GOLD_DECORATED_SOUL_SANDSTONE, Items.GOLD_INGOT, CUT_SOUL_SANDSTONE);
                offerDecoratedRecipe(LAPIS_DECORATED_SOUL_SANDSTONE, Items.LAPIS_LAZULI, CUT_SOUL_SANDSTONE);

                // Honeycomb Bricks
                offerBsswCuttingRecipe(HONEYCOMB_BRICKS, Blocks.HONEYCOMB_BLOCK);
                offerPolishedStoneRecipe(HONEYCOMB_BRICKS.block, Blocks.HONEYCOMB_BLOCK);

                // Purpur Blocks
                offerBsswCuttingRecipe(POLISHED_PURPUR, Blocks.PURPUR_BLOCK);
                offerPolishedStoneRecipe(POLISHED_PURPUR.block, Blocks.PURPUR_BLOCK);
                offerBsswCuttingRecipe(PURPUR_BRICKS, Blocks.PURPUR_BLOCK, POLISHED_PURPUR.block);
                offerBsswCuttingRecipe(SMALL_PURPUR_BRICKS, Blocks.PURPUR_BLOCK, POLISHED_PURPUR.block, PURPUR_BRICKS.block);
                offerStonecuttingRecipe(CHISELED_PURPUR, Blocks.PURPUR_BLOCK, POLISHED_PURPUR.block, PURPUR_BRICKS.block);
                offerStonecuttingRecipe(Blocks.PURPUR_PILLAR, POLISHED_PURPUR.block, PURPUR_BRICKS.block);
                offerStonecuttingRecipe(PURPUR_SQUARES, Blocks.PURPUR_BLOCK, POLISHED_PURPUR.block, PURPUR_BRICKS.block);
                offerStonecuttingRecipe(PURPUR_LINES, Blocks.PURPUR_BLOCK, POLISHED_PURPUR.block, PURPUR_BRICKS.block);

                // Phantom Purpur Blocks
                offerBsswCuttingRecipe(PHANTOM_PURPUR_BLOCK);
                offerPhantomPurpurRecipe(PHANTOM_PURPUR_BLOCK.block, Blocks.PURPUR_BLOCK);
                offerPolishedStoneRecipe(POLISHED_PHANTOM_PURPUR.block, PHANTOM_PURPUR_BLOCK.block);
                offerBsswCuttingRecipe(POLISHED_PHANTOM_PURPUR, PHANTOM_PURPUR_BLOCK.block);
                offerPhantomPurpurRecipe(POLISHED_PHANTOM_PURPUR.block, POLISHED_PURPUR.block);
                offerBsswCuttingRecipe(PHANTOM_PURPUR_BRICKS, PHANTOM_PURPUR_BLOCK.block, POLISHED_PHANTOM_PURPUR.block);
                offerPhantomPurpurRecipe(PHANTOM_PURPUR_BRICKS.block, PURPUR_BRICKS.block);
                offerPolishedStoneRecipe(PHANTOM_PURPUR_BRICKS.block, POLISHED_PHANTOM_PURPUR.block);
                offerBsswCuttingRecipe(SMALL_PHANTOM_PURPUR_BRICKS, PHANTOM_PURPUR_BLOCK.block, POLISHED_PHANTOM_PURPUR.block, PHANTOM_PURPUR_BRICKS.block);
                offerPhantomPurpurRecipe(SMALL_PHANTOM_PURPUR_BRICKS.block, PHANTOM_PURPUR_BRICKS.block);
                offerStonecuttingRecipe(CHISELED_PHANTOM_PURPUR, PHANTOM_PURPUR_BLOCK.block, POLISHED_PHANTOM_PURPUR.block, PHANTOM_PURPUR_BRICKS.block);
                offerPhantomPurpurRecipe(CHISELED_PHANTOM_PURPUR, CHISELED_PURPUR);
                offerStonecuttingRecipe(PHANTOM_PURPUR_PILLAR, PHANTOM_PURPUR_BLOCK.block, POLISHED_PHANTOM_PURPUR.block, PHANTOM_PURPUR_BRICKS.block);
                offerPhantomPurpurRecipe(PHANTOM_PURPUR_PILLAR, Blocks.PURPUR_PILLAR);
                offerStonecuttingRecipe(PHANTOM_PURPUR_SQUARES, PHANTOM_PURPUR_BLOCK.block, POLISHED_PHANTOM_PURPUR.block, PHANTOM_PURPUR_BRICKS.block);
                offerPhantomPurpurRecipe(PHANTOM_PURPUR_SQUARES, PURPUR_SQUARES);
                offerStonecuttingRecipe(PHANTOM_PURPUR_LINES, PHANTOM_PURPUR_BLOCK.block, POLISHED_PHANTOM_PURPUR.block, PHANTOM_PURPUR_BRICKS.block);
                offerPhantomPurpurRecipe(PHANTOM_PURPUR_LINES, PURPUR_LINES);

                // End Stone
                offerBsswCuttingRecipe(POLISHED_END_STONE, Blocks.END_STONE);
                offerPolishedStoneRecipe(POLISHED_END_STONE.block, Blocks.END_STONE);
                offerStonecuttingRecipe(Blocks.END_STONE_BRICKS, POLISHED_END_STONE.block);
                offerStonecuttingRecipe(Blocks.END_STONE_BRICK_STAIRS, POLISHED_END_STONE.block);
                offerStonecuttingRecipe(Blocks.END_STONE_BRICK_SLAB, 2, POLISHED_END_STONE.block);
                offerStonecuttingRecipe(Blocks.END_STONE_BRICK_WALL, POLISHED_END_STONE.block);
                offerCrackingRecipe(CRACKED_END_STONE_BRICKS, Blocks.END_STONE_BRICKS);
                offerBsswCuttingRecipe(SMALL_END_STONE_BRICKS, Blocks.END_STONE, POLISHED_END_STONE.block, Blocks.END_STONE_BRICKS);
                offerStonecuttingRecipe(CHISELED_END_STONE_BRICKS, Blocks.END_STONE, POLISHED_END_STONE.block, Blocks.END_STONE_BRICKS);
                offerStonecuttingRecipe(END_STONE_PILLAR, Blocks.END_STONE, POLISHED_END_STONE.block, Blocks.END_STONE_BRICKS);
                offerStonecuttingRecipe(HERRINGBONE_END_STONE_BRICKS, Blocks.END_STONE, POLISHED_END_STONE.block, Blocks.END_STONE_BRICKS);
                offerDecoratedRecipe(PURPUR_DECORATED_END_STONE, Items.POPPED_CHORUS_FRUIT, Blocks.END_STONE_BRICKS);
                offerPhantomPurpurRecipe(PHANTOM_PURPUR_DECORATED_END_STONE, PURPUR_DECORATED_END_STONE);
                offerBsswCuttingRecipe(END_TILES);
                createShaped(RecipeCategory.BUILDING_BLOCKS, END_TILES.block, 4).input('#', Blocks.END_STONE).input('X', Blocks.PURPUR_BLOCK).pattern("#X").pattern("X#").criterion(hasItem(Blocks.PURPUR_BLOCK), conditionsFromItem(Blocks.PURPUR_BLOCK)).offerTo(exporter);

                // Wood
                offerBarkBlockRecipe(WHITE_OAK_WOOD, WHITE_OAK_LOG);
                this.createShapeless(RecipeCategory.BUILDING_BLOCKS, Items.PALE_OAK_PLANKS, 4)
                    .input(BlockusItemTags.WHITE_OAK_LOGS).group("planks")
                    .criterion("has_logs", this.conditionsFromTag(BlockusItemTags.WHITE_OAK_LOGS)).offerTo(this.exporter, "blockus:white_oak_planks");

                for (BSSWBundle block : BSSWBundle.values()) {
                    if (BlockChecker.isMossyPlanks(block.type, BlockChecker.WOODS)) {
                        offerMossyRecipe(block.block, block.base);
                    }
                }

                offerMosaicRecipe(RecipeCategory.DECORATIONS, OAK_MOSAIC.block, Blocks.OAK_SLAB);
                offerMosaicRecipe(RecipeCategory.DECORATIONS, BIRCH_MOSAIC.block, Blocks.BIRCH_SLAB);
                offerMosaicRecipe(RecipeCategory.DECORATIONS, SPRUCE_MOSAIC.block, Blocks.SPRUCE_SLAB);
                offerMosaicRecipe(RecipeCategory.DECORATIONS, JUNGLE_MOSAIC.block, Blocks.JUNGLE_SLAB);
                offerMosaicRecipe(RecipeCategory.DECORATIONS, ACACIA_MOSAIC.block, Blocks.ACACIA_SLAB);
                offerMosaicRecipe(RecipeCategory.DECORATIONS, DARK_OAK_MOSAIC.block, Blocks.DARK_OAK_SLAB);
                offerMosaicRecipe(RecipeCategory.DECORATIONS, MANGROVE_MOSAIC.block, Blocks.MANGROVE_SLAB);
                offerMosaicRecipe(RecipeCategory.DECORATIONS, CHERRY_MOSAIC.block, Blocks.CHERRY_SLAB);
                offerMosaicRecipe(RecipeCategory.DECORATIONS, CRIMSON_MOSAIC.block, Blocks.CRIMSON_SLAB);
                offerMosaicRecipe(RecipeCategory.DECORATIONS, WARPED_MOSAIC.block, Blocks.WARPED_SLAB);
                offerMosaicRecipe(RecipeCategory.DECORATIONS, PALE_OAK_MOSAIC.block, Blocks.PALE_OAK_SLAB);

                offerHerringBoneRecipe(HERRINGBONE_OAK_PLANKS, Blocks.OAK_PLANKS);
                offerHerringBoneRecipe(HERRINGBONE_BIRCH_PLANKS, Blocks.BIRCH_PLANKS);
                offerHerringBoneRecipe(HERRINGBONE_SPRUCE_PLANKS, Blocks.SPRUCE_PLANKS);
                offerHerringBoneRecipe(HERRINGBONE_JUNGLE_PLANKS, Blocks.JUNGLE_PLANKS);
                offerHerringBoneRecipe(HERRINGBONE_ACACIA_PLANKS, Blocks.ACACIA_PLANKS);
                offerHerringBoneRecipe(HERRINGBONE_DARK_OAK_PLANKS, Blocks.DARK_OAK_PLANKS);
                offerHerringBoneRecipe(HERRINGBONE_MANGROVE_PLANKS, Blocks.MANGROVE_PLANKS);
                offerHerringBoneRecipe(HERRINGBONE_CHERRY_PLANKS, Blocks.CHERRY_PLANKS);
                offerHerringBoneRecipe(HERRINGBONE_BAMBOO_PLANKS, Blocks.BAMBOO_PLANKS);
                offerHerringBoneRecipe(HERRINGBONE_CRIMSON_PLANKS, Blocks.CRIMSON_PLANKS);
                offerHerringBoneRecipe(HERRINGBONE_WARPED_PLANKS, Blocks.WARPED_PLANKS);
                offerHerringBoneRecipe(HERRINGBONE_PALE_OAK_PLANKS, Blocks.PALE_OAK_PLANKS);

                // Chocolate
                createShaped(RecipeCategory.BUILDING_BLOCKS, CHOCOLATE_BLOCK.block, 2).input('#', Items.COCOA_BEANS).pattern("##").pattern("##").criterion(hasItem(Items.COCOA_BEANS), conditionsFromItem(Items.COCOA_BEANS)).offerTo(exporter);
                offerBsswCuttingRecipe(CHOCOLATE_BLOCK);
                offerBsswCuttingRecipe(CHOCOLATE_BRICKS, CHOCOLATE_BLOCK.block);
                offerPolishedStoneRecipe(CHOCOLATE_BRICKS.block, CHOCOLATE_BLOCK.block);
                offerPolishedStoneRecipe(CHOCOLATE_SQUARES, CHOCOLATE_BRICKS.block);
                offerStonecuttingRecipe(CHOCOLATE_SQUARES, CHOCOLATE_BLOCK.block, CHOCOLATE_BRICKS.block);
                createShaped(RecipeCategory.DECORATIONS, CHOCOLATE_TABLET, 3).input('#', CHOCOLATE_SQUARES).pattern("##").criterion(hasItem(CHOCOLATE_SQUARES), conditionsFromItem(CHOCOLATE_SQUARES)).offerTo(exporter);
                offerStonecuttingRecipe(CHOCOLATE_TABLET, 2, CHOCOLATE_BLOCK.block, CHOCOLATE_BRICKS.block, CHOCOLATE_SQUARES);

                // Food Blocks
                offerReversibleCompactingRecipes(RecipeCategory.FOOD, Items.SWEET_BERRIES, RecipeCategory.BUILDING_BLOCKS, SWEET_BERRIES_CRATE);
                offerReversibleCompactingRecipes(RecipeCategory.FOOD, Items.GLOW_BERRIES, RecipeCategory.BUILDING_BLOCKS, GLOW_BERRIES_CRATE);
                offerReversibleCompactingRecipes(RecipeCategory.FOOD, Items.SALMON, RecipeCategory.BUILDING_BLOCKS, SALMON_CRATE);
                offerReversibleCompactingRecipes(RecipeCategory.FOOD, Items.PUFFERFISH, RecipeCategory.BUILDING_BLOCKS, PUFFERFISH_CRATE);
                offerReversibleCompactingRecipes(RecipeCategory.FOOD, Items.TROPICAL_FISH, RecipeCategory.BUILDING_BLOCKS, TROPICAL_FISH_CRATE);
                offerReversibleCompactingRecipes(RecipeCategory.FOOD, Items.COD, RecipeCategory.BUILDING_BLOCKS, COD_CRATE);
                offerReversibleCompactingRecipes(RecipeCategory.FOOD, Items.COOKIE, RecipeCategory.FOOD, COOKIE_BLOCK);
                offerReversibleCompactingRecipes(RecipeCategory.FOOD, Items.CHORUS_FRUIT, RecipeCategory.BUILDING_BLOCKS, CHORUS_BLOCK);
                offerReversibleCompactingRecipes(RecipeCategory.FOOD, Items.POTATO, RecipeCategory.BUILDING_BLOCKS, POTATO_CRATE);
                offerReversibleCompactingRecipes(RecipeCategory.FOOD, Items.APPLE, RecipeCategory.BUILDING_BLOCKS, APPLE_CRATE);
                offerReversibleCompactingRecipes(RecipeCategory.FOOD, Items.GOLDEN_APPLE, RecipeCategory.BUILDING_BLOCKS, GOLDEN_APPLE_CRATE);
                createEnclosedRecipe2(GOLDEN_APPLE_CRATE, Ingredient.ofItems(Blocks.GOLD_BLOCK), APPLE_CRATE).criterion(hasItem(Items.GOLDEN_APPLE), conditionsFromItem(Items.GOLDEN_APPLE)).offerTo(exporter, convertBetween(GOLDEN_APPLE_CRATE, APPLE_CRATE));
                offerReversibleCompactingRecipes(RecipeCategory.FOOD, Items.BEETROOT, RecipeCategory.BUILDING_BLOCKS, BEETROOT_CRATE);
                offerReversibleCompactingRecipes(RecipeCategory.FOOD, Items.CARROT, RecipeCategory.BUILDING_BLOCKS, CARROT_CRATE);
                offerReversibleCompactingRecipes(RecipeCategory.FOOD, Items.GOLDEN_CARROT, RecipeCategory.BUILDING_BLOCKS, GOLDEN_CARROT_CRATE);
                createEnclosedRecipe2(GOLDEN_CARROT_CRATE, Ingredient.ofItems(Items.GOLD_INGOT), CARROT_CRATE).criterion(hasItem(Items.GOLDEN_CARROT), conditionsFromItem(Items.GOLDEN_CARROT)).offerTo(exporter, convertBetween(GOLDEN_CARROT_CRATE, CARROT_CRATE));
                offerReversibleCompactingRecipes(RecipeCategory.FOOD, Items.BREAD, RecipeCategory.BUILDING_BLOCKS, BREAD_BOX);

                // Rainbow
                offerShapelessRecipe(RAINBOW_PETALS, RAINBOW_ROSE, "rainbow_petal", 2);
                offerShapelessRecipe(RAINBOW_PETALS, RAINBOW_BLOCK, "rainbow_petal", 4);
                createShaped(RecipeCategory.BUILDING_BLOCKS, RAINBOW_BLOCK).input('#', RAINBOW_PETALS).pattern("##").pattern("##").criterion(hasItem(RAINBOW_PETALS), conditionsFromItem(RAINBOW_PETALS)).offerTo(exporter);
                offerBsswCuttingRecipe(RAINBOW_BRICKS, RAINBOW_BLOCK);
                offerPolishedStoneRecipe(RAINBOW_BRICKS.block, RAINBOW_BLOCK);
                createShapeless(RecipeCategory.BUILDING_BLOCKS, RAINBOW_GLOWSTONE).input(RAINBOW_PETALS).input(Blocks.GLOWSTONE).group("rainbow_glowstone").criterion(hasItem(RAINBOW_PETALS), conditionsFromItem(RAINBOW_PETALS)).offerTo(exporter);
                createShaped(RecipeCategory.BUILDING_BLOCKS, RAINBOW_GLOWSTONE, 1).input('G', Items.GLOWSTONE_DUST).group("rainbow_glowstone").input('R', RAINBOW_PETALS).pattern(" G ").pattern("GRG").pattern(" G ").criterion(hasItem(RAINBOW_PETALS), conditionsFromItem(RAINBOW_PETALS)).offerTo(exporter, getRecipeName(RAINBOW_GLOWSTONE) + "_alt");

                // Colored Stone Bricks
                offerStainedStoneBricksRecipe(Items.WHITE_DYE, WHITE_STONE_BRICKS.block);
                offerStainedStoneBricksRecipe(Items.ORANGE_DYE, ORANGE_STONE_BRICKS.block);
                offerStainedStoneBricksRecipe(Items.MAGENTA_DYE, MAGENTA_STONE_BRICKS.block);
                offerStainedStoneBricksRecipe(Items.LIGHT_BLUE_DYE, LIGHT_BLUE_STONE_BRICKS.block);
                offerStainedStoneBricksRecipe(Items.YELLOW_DYE, YELLOW_STONE_BRICKS.block);
                offerStainedStoneBricksRecipe(Items.LIME_DYE, LIME_STONE_BRICKS.block);
                offerStainedStoneBricksRecipe(Items.PINK_DYE, PINK_STONE_BRICKS.block);
                offerStainedStoneBricksRecipe(Items.GRAY_DYE, GRAY_STONE_BRICKS.block);
                offerStainedStoneBricksRecipe(Items.CYAN_DYE, CYAN_STONE_BRICKS.block);
                offerStainedStoneBricksRecipe(Items.PURPLE_DYE, PURPLE_STONE_BRICKS.block);
                offerStainedStoneBricksRecipe(Items.BLUE_DYE, BLUE_STONE_BRICKS.block);
                offerStainedStoneBricksRecipe(Items.BROWN_DYE, BROWN_STONE_BRICKS.block);
                offerStainedStoneBricksRecipe(Items.GREEN_DYE, GREEN_STONE_BRICKS.block);
                offerStainedStoneBricksRecipe(Items.RED_DYE, RED_STONE_BRICKS.block);
                offerStainedStoneBricksRecipe(Items.BLACK_DYE, BLACK_STONE_BRICKS.block);

                // Concrete

                // Asphalt
                createShaped(RecipeCategory.BUILDING_BLOCKS, ASPHALT.block, 8).input('X', Blocks.GRAVEL).input('#', ItemTags.COALS).pattern("XXX").pattern("X#X").pattern("XXX").group("asphalt").criterion(hasItem(Blocks.GRAVEL), conditionsFromItem(Blocks.GRAVEL)).offerTo(exporter);
                createEnclosedRecipe(RAINBOW_ASPHALT, Ingredient.ofItems(ASPHALT.block), RAINBOW_PETALS).criterion(hasItem(ASPHALT.block), conditionsFromItem(ASPHALT.block)).offerTo(exporter);
                offerAsphaltRecipe(Items.WHITE_DYE, WHITE_ASPHALT.block);
                offerAsphaltRecipe(Items.ORANGE_DYE, ORANGE_ASPHALT.block);
                offerAsphaltRecipe(Items.MAGENTA_DYE, MAGENTA_ASPHALT.block);
                offerAsphaltRecipe(Items.LIGHT_BLUE_DYE, LIGHT_BLUE_ASPHALT.block);
                offerAsphaltRecipe(Items.YELLOW_DYE, YELLOW_ASPHALT.block);
                offerAsphaltRecipe(Items.LIME_DYE, LIME_ASPHALT.block);
                offerAsphaltRecipe(Items.PINK_DYE, PINK_ASPHALT.block);
                offerAsphaltRecipe(Items.LIGHT_GRAY_DYE, LIGHT_GRAY_ASPHALT.block);
                offerAsphaltRecipe(Items.GRAY_DYE, GRAY_ASPHALT.block);
                offerAsphaltRecipe(Items.CYAN_DYE, CYAN_ASPHALT.block);
                offerAsphaltRecipe(Items.PURPLE_DYE, PURPLE_ASPHALT.block);
                offerAsphaltRecipe(Items.BLUE_DYE, BLUE_ASPHALT.block);
                offerAsphaltRecipe(Items.BROWN_DYE, BROWN_ASPHALT.block);
                offerAsphaltRecipe(Items.GREEN_DYE, GREEN_ASPHALT.block);
                offerAsphaltRecipe(Items.RED_DYE, RED_ASPHALT.block);

                // Colored Tiles
                offerUnicolorColoredTilesRecipe(WHITE_COLORED_TILES, Blocks.WHITE_CONCRETE);
                offerUnicolorColoredTilesRecipe(ORANGE_COLORED_TILES, Blocks.ORANGE_CONCRETE);
                offerUnicolorColoredTilesRecipe(MAGENTA_COLORED_TILES, Blocks.MAGENTA_CONCRETE);
                offerUnicolorColoredTilesRecipe(LIGHT_BLUE_COLORED_TILES, Blocks.LIGHT_BLUE_CONCRETE);
                offerUnicolorColoredTilesRecipe(YELLOW_COLORED_TILES, Blocks.YELLOW_CONCRETE);
                offerUnicolorColoredTilesRecipe(LIME_COLORED_TILES, Blocks.LIME_CONCRETE);
                offerUnicolorColoredTilesRecipe(PINK_COLORED_TILES, Blocks.PINK_CONCRETE);
                offerUnicolorColoredTilesRecipe(LIGHT_GRAY_COLORED_TILES, Blocks.LIGHT_GRAY_CONCRETE);
                offerUnicolorColoredTilesRecipe(GRAY_COLORED_TILES, Blocks.GRAY_CONCRETE);
                offerUnicolorColoredTilesRecipe(CYAN_COLORED_TILES, Blocks.CYAN_CONCRETE);
                offerUnicolorColoredTilesRecipe(PURPLE_COLORED_TILES, Blocks.PURPLE_CONCRETE);
                offerUnicolorColoredTilesRecipe(BLUE_COLORED_TILES, Blocks.BLUE_CONCRETE);
                offerUnicolorColoredTilesRecipe(BROWN_COLORED_TILES, Blocks.BROWN_CONCRETE);
                offerUnicolorColoredTilesRecipe(GREEN_COLORED_TILES, Blocks.GREEN_CONCRETE);
                offerUnicolorColoredTilesRecipe(RED_COLORED_TILES, Blocks.RED_CONCRETE);
                offerUnicolorColoredTilesRecipe(BLACK_COLORED_TILES, Blocks.BLACK_CONCRETE);
                offerUnicolorColoredTilesRecipe(RAINBOW_COLORED_TILES, RAINBOW_BLOCK);

                // Thatch
                offerPolishedStoneRecipe(THATCH.block, Items.WHEAT);

                // Paper
                offerReversibleCompactingRecipes(RecipeCategory.MISC, Items.PAPER, RecipeCategory.BUILDING_BLOCKS, PAPER_BLOCK);
                CookingRecipeJsonBuilder.createSmelting(Ingredient.ofItems(PAPER_BLOCK), RecipeCategory.BUILDING_BLOCKS, BURNT_PAPER_BLOCK.asItem(), 0.1F, 200).criterion("has_paper_block", conditionsFromItem(PAPER_BLOCK)).offerTo(exporter);
                createShaped(RecipeCategory.BUILDING_BLOCKS, FRAMED_PAPER_BLOCK, 4).input('X', Items.PAPER).input('#', Items.STICK).pattern("###").pattern("XXX").pattern("###").criterion(hasItem(Items.PAPER), conditionsFromItem(Items.PAPER)).offerTo(exporter);
                createEnclosedRecipe2(PAPER_LAMP, Ingredient.ofItems(Items.PAPER), Items.TORCH).criterion(hasItem(Items.PAPER), conditionsFromItem(Items.PAPER)).offerTo(exporter);
                offerShapelessRecipe2(Items.GUNPOWDER, BURNT_PAPER_BLOCK, 2);

                // Plating
                offerBsswCuttingRecipe(IRON_PLATING);
                createShaped(RecipeCategory.BUILDING_BLOCKS, IRON_PLATING.block, 24).input('X', Items.IRON_INGOT).pattern("XXX").pattern("X X").pattern("XXX").criterion(hasItem(Items.IRON_INGOT), conditionsFromItem(Items.IRON_INGOT)).offerTo(exporter);
                offerBsswCuttingRecipe(GOLD_PLATING);
                createShaped(RecipeCategory.BUILDING_BLOCKS, GOLD_PLATING.block, 24).input('X', Items.GOLD_INGOT).pattern("XXX").pattern("X X").pattern("XXX").criterion(hasItem(Items.GOLD_INGOT), conditionsFromItem(Items.GOLD_INGOT)).offerTo(exporter);

                // Lantern Blocks

                offerLanternBlockRecipe(LANTERN_BLOCK, Blocks.LANTERN);
                offerLanternBlockRecipe(SOUL_LANTERN_BLOCK, Blocks.SOUL_LANTERN);
                createShaped(RecipeCategory.BUILDING_BLOCKS, SOUL_O_LANTERN).input('X', Blocks.CARVED_PUMPKIN).input('#', Blocks.SOUL_TORCH).pattern("X").pattern("#").criterion(hasItem(Blocks.CARVED_PUMPKIN), conditionsFromItem(Blocks.CARVED_PUMPKIN)).offerTo(exporter);


                // Other
                offerReversibleCompactingRecipes(RecipeCategory.MISC, Items.CHARCOAL, RecipeCategory.BUILDING_BLOCKS, CHARCOAL_BLOCK);
                offerReversibleCompactingRecipes(RecipeCategory.MISC, Items.SUGAR, RecipeCategory.BUILDING_BLOCKS, SUGAR_BLOCK);
                offerReversibleCompactingRecipes(RecipeCategory.MISC, Items.ENDER_PEARL, RecipeCategory.BUILDING_BLOCKS, ENDER_BLOCK);
                offerReversibleCompactingRecipes(RecipeCategory.MISC, Items.ROTTEN_FLESH, RecipeCategory.BUILDING_BLOCKS, ROTTEN_FLESH_BLOCK);
                offerReversibleCompactingRecipes(RecipeCategory.MISC, Items.PHANTOM_MEMBRANE, RecipeCategory.BUILDING_BLOCKS, MEMBRANE_BLOCK);
                offerReversibleCompactingRecipes(RecipeCategory.MISC, Items.NETHER_STAR, RecipeCategory.BUILDING_BLOCKS, NETHER_STAR_BLOCK);
                createEnclosedRecipe2(REDSTONE_SAND, Ingredient.ofItems(Items.REDSTONE), Items.SAND).criterion(hasItem(Items.REDSTONE), conditionsFromItem(Items.REDSTONE)).offerTo(exporter);
                createShapeless(RecipeCategory.BUILDING_BLOCKS, Items.REDSTONE, 8).input(REDSTONE_SAND).criterion(hasItem(REDSTONE_SAND), conditionsFromItem(REDSTONE_SAND)).offerTo(exporter, convertBetween(Items.REDSTONE, REDSTONE_SAND));
                createShaped(RecipeCategory.BUILDING_BLOCKS, LOVE_BLOCK).input('M', Items.MAGENTA_DYE).input('R', Items.RED_DYE).pattern("RMR").pattern("RRR").pattern("MRM").criterion(hasItem(Items.MAGENTA_DYE), conditionsFromItem(Items.MAGENTA_DYE)).criterion(hasItem(Items.RED_DYE), conditionsFromItem(Items.RED_DYE)).offerTo(exporter);
                createShapeless(RecipeCategory.BUILDING_BLOCKS, WEIGHT_STORAGE_CUBE).input(Blocks.STONE).input(Items.IRON_NUGGET).criterion(hasItem(Blocks.STONE), conditionsFromItem(Blocks.STONE)).offerTo(exporter);
                createShapeless(RecipeCategory.BUILDING_BLOCKS, COMPANION_CUBE).input(WEIGHT_STORAGE_CUBE).input(Items.POPPY).criterion(hasItem(WEIGHT_STORAGE_CUBE), conditionsFromItem(WEIGHT_STORAGE_CUBE)).offerTo(exporter);
                createShaped(RecipeCategory.BUILDING_BLOCKS, CAUTION_BLOCK, 6).input('A', Blocks.STONE).input('B', Items.BLACK_DYE).input('C', Items.YELLOW_DYE).pattern(" C ").pattern("BAB").pattern(" C ").criterion(hasItem(Items.BLACK_DYE), conditionsFromItem(Items.BLACK_DYE)).criterion(hasItem(Items.YELLOW_DYE), conditionsFromItem(Items.YELLOW_DYE)).offerTo(exporter);
                createShaped(RecipeCategory.BUILDING_BLOCKS, STARS_BLOCK, 3).input('#', Items.ENDER_PEARL).input('X', Items.CHORUS_FRUIT).pattern("X#X").pattern("###").pattern("X#X").criterion(hasItem(Items.CHORUS_FRUIT), conditionsFromItem(Items.CHORUS_FRUIT)).offerTo(exporter);
            }

            private void offerLanternBlockRecipe(Block output, Block lantern) {
                createShaped(RecipeCategory.BUILDING_BLOCKS, output).input('X', lantern).input('#', Items.IRON_NUGGET).pattern(" # ").pattern("#X#").pattern(" # ").criterion(hasItem(lantern), conditionsFromItem(lantern)).offerTo(exporter);
            }

            public void offerWaxingRecipes(Block unwaxed, Block waxed) {
                createShapeless(RecipeCategory.BUILDING_BLOCKS, waxed).input(unwaxed).input(Items.HONEYCOMB).group(getItemPath(waxed)).criterion(hasItem(unwaxed), conditionsFromItem(unwaxed)).offerTo(exporter, convertBetween(waxed, Items.HONEYCOMB));
            }

            public void offerCharredSmeltingRecipe(TagKey<Item> input, ItemConvertible output, String hasitem) {
                CookingRecipeJsonBuilder.createSmelting(ingredientFromTag(input), RecipeCategory.BUILDING_BLOCKS, output, 0.1F, 200).criterion("has_" + hasitem, conditionsFromTag(input)).offerTo(exporter, getRecipeName(output) + "_from_smelting");
            }

            public void offerMossyRecipe(ItemConvertible output, ItemConvertible input) {
                createShapeless(RecipeCategory.BUILDING_BLOCKS, output).input(input).input(Blocks.VINE).group(Registries.BLOCK.getId((Block) output).getPath()).criterion("has_vine", conditionsFromItem(Blocks.VINE)).offerTo(exporter, convertBetween(output, Blocks.VINE));
                createShapeless(RecipeCategory.BUILDING_BLOCKS, output).input(input).input(Blocks.MOSS_BLOCK).group(Registries.BLOCK.getId((Block) output).getPath()).criterion("has_moss_block", conditionsFromItem(Blocks.MOSS_BLOCK)).offerTo(exporter, convertBetween(output, Blocks.MOSS_BLOCK));
            }

            public void offerPolishedStoneRecipe(ItemConvertible output, ItemConvertible input) {
                createCondensingRecipe(RecipeCategory.BUILDING_BLOCKS, output, Ingredient.ofItems(input)).criterion(hasItem(input), conditionsFromItem(input)).offerTo(exporter);
            }

            public CraftingRecipeJsonBuilder createCondensingRecipe(RecipeCategory category, ItemConvertible output, int count, Ingredient input, String group) {
                return createShaped(category, output, count).input('S', input).group(group).pattern("SS").pattern("SS");
            }

            public void offerShapelessRecipe2(ItemConvertible output, ItemConvertible input, int outputCount) {
                createShapeless(RecipeCategory.BUILDING_BLOCKS, output, outputCount).input(input).criterion(hasItem(input), conditionsFromItem(input)).offerTo(exporter);
            }

            public void offerSturdyRecipe(ItemConvertible output, ItemConvertible input1, ItemConvertible input2) {
                createShaped(RecipeCategory.BUILDING_BLOCKS, output, 2).input('#', input1).input('X', input2).pattern("X#X").pattern("# #").pattern("X#X").criterion(hasItem(input1), conditionsFromItem(input1)).criterion(hasItem(input2), conditionsFromItem(input2)).offerTo(exporter);
                createShaped(RecipeCategory.BUILDING_BLOCKS, output, 2).input('#', input1).input('X', input2).pattern("#X#").pattern("X X").pattern("#X#").criterion(hasItem(input1), conditionsFromItem(input1)).criterion(hasItem(input2), conditionsFromItem(input2)).offerTo(exporter, getRecipeName(output) + "_alt");

            }

            public void offerDecoratedRecipe(ItemConvertible output, ItemConvertible decoration, ItemConvertible input) {
                createShaped(RecipeCategory.BUILDING_BLOCKS, output, 4).input('#', decoration).input('X', input).pattern("##").pattern("XX").criterion(hasItem(input), conditionsFromItem(input)).offerTo(exporter);
            }

            public void offerPhantomPurpurRecipe(ItemConvertible output, ItemConvertible input) {
                createShapeless(RecipeCategory.BUILDING_BLOCKS, output).input(input).input(BlockusItemTags.SOUL_SOILS).criterion("has_purpur", conditionsFromItem(input)).offerTo(exporter, convertBetween(output, Blocks.SOUL_SAND));

            }

            public void offerColoredTilesRecipe(ItemConvertible output, ItemConvertible color1, ItemConvertible color2) {
                createShapeless(RecipeCategory.BUILDING_BLOCKS, output, 2).input(color1).input(color2).group("colored_tiles").criterion(hasItem(color1), conditionsFromItem(color1)).criterion(hasItem(color2), conditionsFromItem(color2)).offerTo(exporter);

            }

            public void offerUnicolorColoredTilesRecipe(ItemConvertible output, ItemConvertible color) {
                createShapeless(RecipeCategory.BUILDING_BLOCKS, output, 2).input(color).input(color).group("colored_tiles").criterion(hasItem(color), conditionsFromItem(color)).offerTo(exporter);
                offerStonecuttingRecipe(output, color);

            }

            public void offerSmallLogsRecipe(ItemConvertible output, ItemConvertible input) {
                createShaped(RecipeCategory.BUILDING_BLOCKS, output, 4).input('#', input).pattern(" # ").pattern("###").group("small_logs").criterion(hasItem(input), conditionsFromItem(input)).offerTo(exporter);
            }

            public void offerWoodenPostRecipe(WoodenPostBundle post, ItemConvertible planks) {
                createShaped(RecipeCategory.BUILDING_BLOCKS, post.block, 6).input('#', post.base).pattern("#").pattern("#").pattern("#").group("wooden_posts").criterion("has_woods", conditionsFromItem(post.base)).offerTo(exporter);
                createShaped(RecipeCategory.BUILDING_BLOCKS, post.stripped, 6).input('#', post.baseStripped).pattern("#").pattern("#").pattern("#").group("wooden_posts").criterion("has_woods", conditionsFromItem(post.baseStripped)).offerTo(exporter);
                createShapeless(RecipeCategory.BUILDING_BLOCKS, planks, 2).input(post.block).group("planks").criterion("has_wooden_post", conditionsFromItem(post.block)).offerTo(exporter, convertBetween(planks, post.block));
                createShapeless(RecipeCategory.BUILDING_BLOCKS, planks, 2).input(post.stripped).group("planks").criterion("has_wooden_post", conditionsFromItem(post.stripped)).offerTo(exporter, convertBetween(planks, post.stripped));
            }

            public void offerSmallHedgesRecipe(ItemConvertible output, ItemConvertible input) {
                createShaped(RecipeCategory.BUILDING_BLOCKS, output, 6).input('#', input).pattern("###").pattern("###").group("small_hedge").criterion(hasItem(input), conditionsFromItem(input)).offerTo(exporter);
            }


            public void offerHerringBoneRecipe(ItemConvertible output, ItemConvertible input) {
                createShaped(RecipeCategory.BUILDING_BLOCKS, output, 5).input('#', input).pattern("#  ").pattern("###").pattern("  #").group("herringbone_planks").criterion(hasItem(input), conditionsFromItem(input)).offerTo(exporter);
            }

            public CraftingRecipeJsonBuilder createEnclosedRecipe(ItemConvertible output, Ingredient input, ItemConvertible center) {
                return createShaped(RecipeCategory.BUILDING_BLOCKS, output, 8).input('X', input).input('#', center).pattern("XXX").pattern("X#X").pattern("XXX");
            }

            public CraftingRecipeJsonBuilder createEnclosedRecipe2(ItemConvertible output, Ingredient input, ItemConvertible center) {
                return createShaped(RecipeCategory.BUILDING_BLOCKS, output).input('X', input).input('#', center).pattern("XXX").pattern("X#X").pattern("XXX");
            }

            public void offerStoneDoorTrapdoorRecipe(ItemConvertible door, ItemConvertible trapdoor, ItemConvertible input, ItemConvertible slab) {
                createDoorRecipe(door, Ingredient.ofItems(input)).criterion(hasItem(input), conditionsFromItem(input)).offerTo(exporter);
                createShaped(RecipeCategory.REDSTONE, trapdoor, 4).input('#', slab).pattern("###").pattern("###").criterion(hasItem(slab), conditionsFromItem(slab)).offerTo(exporter);
            }

            public void offerDoorTrapdoorRecipe(ItemConvertible door, ItemConvertible trapdoor, ItemConvertible input) {
                createDoorRecipe(door, Ingredient.ofItems(input)).criterion(hasItem(input), conditionsFromItem(input)).offerTo(exporter);
                createTrapdoorRecipe(trapdoor, Ingredient.ofItems(input)).criterion(hasItem(input), conditionsFromItem(input)).offerTo(exporter);
            }

            public void offerPressurePlateButtonRecipe(ItemConvertible pressureplate, ItemConvertible button, ItemConvertible input) {
                createPressurePlateRecipe(RecipeCategory.REDSTONE, pressureplate, Ingredient.ofItems(input)).criterion(hasItem(input), conditionsFromItem(input)).offerTo(exporter);
                createShapeless(RecipeCategory.REDSTONE, button).input(input).criterion(hasItem(input), conditionsFromItem(input)).offerTo(exporter);
            }

            public void offerStainedStoneBricksRecipe(ItemConvertible center, ItemConvertible output) {
                createEnclosedRecipe(output, Ingredient.ofItems(Blocks.STONE_BRICKS), center).group("stained_stone_bricks").criterion(hasItem(Blocks.STONE_BRICKS), conditionsFromItem(Blocks.STONE_BRICKS)).offerTo(exporter);
            }

            public void offerOreBricksRecipe(BSSWBundle ore_bricks, ItemConvertible ore_block, ItemConvertible ore) {
                offerStonecuttingRecipe(ore_bricks.block, ore_block);
                offerPolishedStoneRecipe(ore_bricks.block, ore_block);
                offerShapelessRecipe(ore, ore_bricks.block, ore.toString(), 9);
            }

            public void offerCopperBricksRecipe(CopperBundle block, ItemConvertible baseWaxed, ItemConvertible cutCopper, ItemConvertible cutCopperWaxed) {
                offerStonecuttingRecipe(block.block, cutCopper);
                offerStonecuttingRecipe(block.blockWaxed, cutCopperWaxed);
                offerStonecuttingRecipe(block.block, 4, block.base);
                offerStonecuttingRecipe(block.blockWaxed, 4, baseWaxed);
                offerPolishedStoneRecipe(block.block, cutCopper);
                offerPolishedStoneRecipe(block.blockWaxed, cutCopperWaxed);
            }

            public void createTimberFramesRecipes(ItemConvertible base, ItemConvertible block, ItemConvertible diagonal, ItemConvertible cross) {
                createShaped(RecipeCategory.BUILDING_BLOCKS, block, 2).input('#', Items.PAPER).input('X', base).pattern("#X").pattern("X#").group("timber_frame").criterion(hasItem(base), conditionsFromItem(base)).offerTo(exporter);
                createShaped(RecipeCategory.BUILDING_BLOCKS, diagonal, 4).input('#', block).pattern("##").pattern("##").group("diagonal_timber_frame").criterion(hasItem(block), conditionsFromItem(block)).offerTo(exporter);
                createShaped(RecipeCategory.BUILDING_BLOCKS, cross, 4).input('#', diagonal).pattern("##").pattern("##").group("cross_timber_frame").criterion(hasItem(diagonal), conditionsFromItem(diagonal)).offerTo(exporter);
            }

            public void createLatticeRecipes(ItemConvertible base, ItemConvertible lattice, ItemConvertible grate) {
                createShaped(RecipeCategory.BUILDING_BLOCKS, grate, 3).input('#', Items.STICK).input('X', base).pattern(" # ").pattern("#X#").pattern(" # ").group("wooden_grates").criterion(hasItem(base), conditionsFromItem(base)).offerTo(exporter);
                createShaped(RecipeCategory.BUILDING_BLOCKS, lattice, 16).input('#', grate).pattern("###").pattern("###").group("wooden_lattices").criterion(hasItem(lattice), conditionsFromItem(lattice)).offerTo(exporter);
            }

            public void offerAsphaltRecipe(ItemConvertible center, ItemConvertible output) {
                createEnclosedRecipe(output, Ingredient.ofItems(ASPHALT.block), center).group("asphalt").criterion(hasItem(ASPHALT.block), conditionsFromItem(ASPHALT.block)).offerTo(exporter);
            }

            public void offerPatternedWoolRecipe(ItemConvertible output, ItemConvertible wool, ItemConvertible output_carpet, ItemConvertible carpet) {
                offerPolishedStoneRecipe(output, wool);
                createCondensingRecipe(RecipeCategory.BUILDING_BLOCKS, output_carpet, Ingredient.ofItems(carpet)).group("patterned_carpet").criterion(hasItem(carpet), conditionsFromItem(carpet)).offerTo(exporter, convertBetween(output_carpet, carpet));
            }

            public void offerGinghamWoolRecipe(ItemConvertible output, ItemConvertible wool) {
                createShaped(RecipeCategory.BUILDING_BLOCKS, output, 4).input('#', wool).pattern(" # ").pattern("# #").pattern(" # ").group("gingham_wool").criterion(hasItem(wool), conditionsFromItem(wool)).offerTo(exporter);
            }

            public void offerStairsRecipe(ItemConvertible output, ItemConvertible input) {
                createStairsRecipe(output, Ingredient.ofItems(input)).criterion(hasItem(input), conditionsFromItem(input)).offerTo(exporter);
            }

            public void offerStainedRedstoneLampRecipe(ItemConvertible output, ItemConvertible dye, ItemConvertible output_lit) {
                createShaped(RecipeCategory.BUILDING_BLOCKS, output).input('S', dye).input('#', Blocks.REDSTONE_LAMP).pattern(" S ").pattern("S#S").pattern(" S ").group("redstone_lamps").criterion(hasItem(Blocks.REDSTONE_LAMP), conditionsFromItem(Blocks.REDSTONE_LAMP)).offerTo(exporter);
                createShapeless(RecipeCategory.BUILDING_BLOCKS, output_lit).input(output).input(Blocks.REDSTONE_TORCH).group("lit_redstone_lamps").criterion(hasItem(output), conditionsFromItem(output)).offerTo(exporter);
            }

            public void offerNeonRecipe(ItemConvertible output, ItemConvertible dye) {
                createShaped(RecipeCategory.BUILDING_BLOCKS, output, 8).input('D', dye).input('S', Items.GLOW_INK_SAC).input('A', Items.AMETHYST_SHARD).pattern(" A ").pattern("SDS").pattern(" A ").group("neon_blocks").criterion(hasItem(Items.GLOW_INK_SAC), conditionsFromItem(Items.GLOW_INK_SAC)).offerTo(exporter);
            }

            public void offerFuturneoRecipe(ItemConvertible output, ItemConvertible glass) {
                createShaped(RecipeCategory.BUILDING_BLOCKS, output, 6).input('A', Items.BLACK_DYE).input('B', glass).input('C', Blocks.TORCH).pattern("ABA").pattern("BCB").pattern("ABA").group("futurneo_blocks").criterion(hasItem(glass), conditionsFromItem(glass)).offerTo(exporter);

            }

            public void offerBoatsRecipe(ItemConvertible output1, ItemConvertible output2, ItemConvertible input) {
                createShaped(RecipeCategory.BUILDING_BLOCKS, output1).input('#', input).pattern("# #").pattern("###").group("boat").criterion("in_water", requireEnteringFluid(Blocks.WATER)).offerTo(exporter);
                createShapeless(RecipeCategory.BUILDING_BLOCKS, output2).input(Blocks.CHEST).input(output1).group("chest_boat").criterion("has_boat", conditionsFromTag(ItemTags.BOATS)).offerTo(exporter);

            }

            public void offerPillarRecipe(ItemConvertible output, ItemConvertible input) {
                createShaped(RecipeCategory.BUILDING_BLOCKS, output, 2).input('#', input).pattern("#").pattern("#").criterion(hasItem(input), conditionsFromItem(input)).offerTo(exporter);
                offerStonecuttingRecipe(output, 1, input);
            }

            public void offerBsswCuttingRecipe(BSSWBundle bsswBundle, ItemConvertible... ingredients) {
                // For block, stairs, slab and wall (if exists) in BsswBundle.
                if (ingredients != null) {
                    offerStonecuttingRecipe(bsswBundle.block, ingredients);
                }
            }

            public void offerStonecuttingRecipe(ItemConvertible output, ItemConvertible... ingredients) {
                offerStonecuttingRecipe(output, 1, ingredients);
            }

            public void offerStonecuttingRecipe(ItemConvertible output, int count, ItemConvertible... ingredients) {

                for (ItemConvertible itemConvertible : ingredients) {
                    StonecuttingRecipeJsonBuilder var10000 = StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(itemConvertible), RecipeCategory.BUILDING_BLOCKS, output, count).criterion(hasItem(itemConvertible), conditionsFromItem(itemConvertible));
                    String var10002 = convertBetween(output, itemConvertible);
                    var10000.offerTo(exporter, var10002 + "_stonecutting");
                }
            }

            public void generateFamilies(FeatureSet enabledFeatures) {
                BlockusFamilies.getFamilies().filter(BlockFamily::shouldGenerateRecipes).forEach((family) -> {
                    generateFamily(family, enabledFeatures);
                });
            }
        };
    }

    @Override
    public String getName() {
        return "Blockus Recipes";
    }
}
