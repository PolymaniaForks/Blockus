package com.brand.blockus.datagen.providers;

import com.brand.blockus.blocks.base.CookieBlock;
import com.brand.blockus.blocks.base.LargeFlowerPotBlock;
import com.brand.blockus.registry.content.bundles.*;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.block.Block;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.loot.LootPool;
import net.minecraft.loot.LootTable;
import net.minecraft.loot.condition.BlockStatePropertyLootCondition;
import net.minecraft.loot.condition.TableBonusLootCondition;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.function.ApplyBonusLootFunction;
import net.minecraft.loot.function.LimitCountLootFunction;
import net.minecraft.loot.function.LootFunction;
import net.minecraft.loot.function.SetCountLootFunction;
import net.minecraft.loot.operator.BoundedIntUnaryOperator;
import net.minecraft.loot.provider.number.ConstantLootNumberProvider;
import net.minecraft.loot.provider.number.UniformLootNumberProvider;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;
import java.util.function.Function;

import static com.brand.blockus.registry.content.BlockusBlocks.*;

public class BlockusBlockLootTableProvider extends FabricBlockLootTableProvider {
    public final RegistryWrapper.WrapperLookup registryLookup;

    public BlockusBlockLootTableProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(output, registryLookup);
        this.registryLookup = registryLookup.join();
    }

    @Override
    public void generate() {
        RegistryWrapper.Impl<Enchantment> impl = this.registryLookup.getOrThrow(RegistryKeys.ENCHANTMENT);

        for (BSSWBundle bsswType : BSSWBundle.values()) {
            this.addBlockStairsandSlabDrops(bsswType.block);
        }

        for (CopperBundle copper : CopperBundle.values()) {
            this.addBlockStairsandSlabDrops(copper.block);
            this.addBlockStairsandSlabDrops(copper.blockWaxed);
        }

        for (ConcreteBundle concrete : ConcreteBundle.values()) {
            this.addBlockStairsandSlabDrops(concrete.block);
        }

        for (WoodBundle woodBundle : WoodBundle.values()) {
            this.addWoodSetDrop(woodBundle.planks,
                woodBundle.stairs,
                woodBundle.slab,
                woodBundle.fence,
                woodBundle.fence_gate,
                woodBundle.door,
                woodBundle.trapdoor,
                woodBundle.pressure_plate,
                woodBundle.button,
                woodBundle.standing_sign,
                woodBundle.ceiling_hanging_sign);
        }

        for (TimberFrameBundle timberFrameBundle : TimberFrameBundle.values()) {
            for (Block block : timberFrameBundle.all) {
                this.addDrops(block);
            }
        }

        for (AsphaltBundle asphaltBundle : AsphaltBundle.values()) {
            this.addBlockStairsandSlabDrops(asphaltBundle.block);
        }

        for (PottedLargeBundle pottedLargeBundle : PottedLargeBundle.values()) {
            this.addPottedLargePlantDrop(pottedLargeBundle.block);
        }

        for (WoodenPostBundle woodenPost : WoodenPostBundle.values()) {
            this.addDrop(woodenPost.block);
            this.addDrop(woodenPost.stripped);
        }

        this.addDrops(CHISELED_MUD_BRICKS,
            MUD_BRICK_PILLAR,

            // Viridite
            CHISELED_VIRIDITE,
            CHISELED_VIRIDITE_PILLAR,
            CHISELED_VIRIDITE_BRICKS,
            VIRIDITE_PILLAR,
            VIRIDITE_SQUARES,
            VIRIDITE_LINES,

            // Amethyst
            CHISELED_AMETHYST,
            AMETHYST_PILLAR,

            // Sculk
            CHISELED_SCULK_BRICKS,
            SCULK_PILLAR,

            // Herringbone Planks
            HERRINGBONE_OAK_PLANKS,
            HERRINGBONE_BIRCH_PLANKS,
            HERRINGBONE_SPRUCE_PLANKS,
            HERRINGBONE_JUNGLE_PLANKS,
            HERRINGBONE_ACACIA_PLANKS,
            HERRINGBONE_DARK_OAK_PLANKS,
            HERRINGBONE_MANGROVE_PLANKS,
            HERRINGBONE_CHERRY_PLANKS,
            HERRINGBONE_BAMBOO_PLANKS,
            HERRINGBONE_CRIMSON_PLANKS,
            HERRINGBONE_WARPED_PLANKS,
            HERRINGBONE_PALE_OAK_PLANKS,


            APPLE_CRATE,
            BEETROOT_CRATE,
            BLACK_COLORED_TILES,
            BLUE_COLORED_TILES,
            BLUESTONE_LINES,
            BLUESTONE_PILLAR,
            BLUESTONE_SQUARES,
            BREAD_BOX,
            BROWN_COLORED_TILES,
            CARROT_CRATE,
            CAUTION_BLOCK,
            CARVED_TUFF_BRICKS,
            CHARCOAL_BLOCK,
            CHISELED_ANDESITE_BRICKS,
            CHISELED_BLUESTONE,
            CHISELED_DARK_PRISMARINE,
            CHISELED_DIORITE_BRICKS,
            CHISELED_DRIPSTONE,
            CHISELED_END_STONE_BRICKS,
            CHISELED_GRANITE_BRICKS,
            CHISELED_LAVA_BRICKS,
            CHISELED_LAVA_POLISHED_BLACKSTONE,
            CHISELED_LIMESTONE,
            CHISELED_MAGMA_BRICKS,
            CHISELED_MARBLE,
            CHISELED_MARBLE_PILLAR,
            CHISELED_MARBLE_BRICKS,
            CHISELED_LIMESTONE_PILLAR,
            CHISELED_LIMESTONE_BRICKS,
            CHISELED_BLUESTONE_PILLAR,
            CHISELED_BLUESTONE_BRICKS,
            CHISELED_PHANTOM_PURPUR,
            CHISELED_POLISHED_BASALT,
            CHISELED_PRISMARINE,
            CHISELED_PURPUR,
            CHISELED_SOUL_SANDSTONE,
            CHISELED_WATER_BRICKS,
            CHORUS_BLOCK,
            COD_CRATE,
            COMPANION_CUBE,
            CRACKED_ANDESITE_BRICKS,
            CRACKED_DIORITE_BRICKS,
            CRACKED_DRIPSTONE_BRICKS,
            CRACKED_END_STONE_BRICKS,
            CRACKED_GRANITE_BRICKS,
            CRACKED_OBSIDIAN_BRICKS,
            CRACKED_POLISHED_BASALT_BRICKS,
            CRACKED_TUFF_BRICKS,
            CUT_SOUL_SANDSTONE,
            CYAN_COLORED_TILES,
            DARK_PRISMARINE_PILLAR,
            DEEPSLATE_PILLAR,
            DRIPSTONE_PILLAR,
            END_STONE_PILLAR,
            ENDER_BLOCK,
            FRAMED_PAPER_BLOCK,
            GLOW_BERRIES_CRATE,
            GLOWING_OBSIDIAN,
            GOLD_DECORATED_POLISHED_BLACKSTONE,
            GOLD_DECORATED_RED_SANDSTONE,
            GOLD_DECORATED_SANDSTONE,
            GOLD_DECORATED_SOUL_SANDSTONE,
            GOLDEN_APPLE_CRATE,
            GOLDEN_CARROT_CRATE,
            GRAY_COLORED_TILES,
            GREEN_COLORED_TILES,
            LANTERN_BLOCK,
            LAPIS_DECORATED_RED_SANDSTONE,
            LAPIS_DECORATED_SANDSTONE,
            LAPIS_DECORATED_SOUL_SANDSTONE,
            LIGHT_BLUE_COLORED_TILES,
            LIGHT_GRAY_COLORED_TILES,
            LIME_COLORED_TILES,
            LIMESTONE_PILLAR,
            LIMESTONE_SQUARES,
            LIMESTONE_LINES,
            LOVE_BLOCK,
            MAGENTA_COLORED_TILES,
            MARBLE_PILLAR,
            MARBLE_SQUARES,
            MARBLE_LINES,
            MEMBRANE_BLOCK,
            NETHER_BRICK_PILLAR,
            OBSIDIAN_PILLAR,
            ORANGE_COLORED_TILES,
            PAPER_BLOCK,
            PAPER_LAMP,
            PATH,
            PHANTOM_PURPUR_DECORATED_END_STONE,
            PHANTOM_PURPUR_LINES,
            PHANTOM_PURPUR_PILLAR,
            PHANTOM_PURPUR_SQUARES,
            PINK_COLORED_TILES,
            POLISHED_ANDESITE_PILLAR,
            POLISHED_BASALT_PILLAR,
            POLISHED_BLACKSTONE_PILLAR,
            POLISHED_DIORITE_PILLAR,
            POLISHED_GRANITE_PILLAR,
            POTATO_CRATE,
            PRISMARINE_PILLAR,
            PUFFERFISH_CRATE,
            PURPLE_COLORED_TILES,
            PURPUR_DECORATED_END_STONE,
            PURPUR_LINES,
            PURPUR_SQUARES,
            RAINBOW_ASPHALT,
            RAINBOW_BLOCK,
            RAINBOW_COLORED_TILES,
            RED_COLORED_TILES,
            RED_NETHER_BRICK_PILLAR,
            RED_SANDSTONE_PILLAR,
            REDSTONE_SAND,
            RESIN_BRICK_PILLAR,
            ROTTEN_FLESH_BLOCK,
            SALMON_CRATE,
            SANDSTONE_PILLAR,
            SNOW_PILLAR,
            SOUL_LANTERN_BLOCK,
            SOUL_O_LANTERN,
            SOUL_SANDSTONE_PILLAR,
            STARS_BLOCK,
            STONE_BRICK_PILLAR,
            STRIPPED_WHITE_OAK_LOG,
            STRIPPED_WHITE_OAK_WOOD,
            STURDY_BLACKSTONE,
            STURDY_DEEPSLATE,
            STURDY_STONE,
            SUGAR_BLOCK,
            SWEET_BERRIES_CRATE,
            TROPICAL_FISH_CRATE,
            TUFF_PILLAR,
            WEIGHT_STORAGE_CUBE,
            WHITE_COLORED_TILES,
            WHITE_OAK_LOG,
            WHITE_OAK_SAPLING,
            WHITE_OAK_WOOD,
            YELLOW_COLORED_TILES,
            HERRINGBONE_ANDESITE_BRICKS,
            HERRINGBONE_BRICKS,
            HERRINGBONE_RESIN_BRICKS,
            HERRINGBONE_DEEPSLATE_BRICKS,
            HERRINGBONE_DIORITE_BRICKS,
            HERRINGBONE_END_STONE_BRICKS,
            HERRINGBONE_GRANITE_BRICKS,
            HERRINGBONE_NETHER_BRICKS,
            HERRINGBONE_POLISHED_BASALT_BRICKS,
            HERRINGBONE_POLISHED_BLACKSTONE_BRICKS,
            HERRINGBONE_RED_NETHER_BRICKS,
            HERRINGBONE_SANDY_BRICKS,
            HERRINGBONE_SOAKED_BRICKS,
            HERRINGBONE_STONE_BRICKS,
            HERRINGBONE_TUFF_BRICKS,
            RAINBOW_ROSE,
            CHOCOLATE_TABLET,
            CHOCOLATE_SQUARES);


        this.addDropsWithSilkTouch(
            ICE_BRICKS,
            ICE_PILLAR
            );

        this.addPottedPlantDropsBatch(POTTED_WHITE_OAK_SAPLING, POTTED_RAINBOW_ROSE);


        this.addDrop(WHITE_OAK_LEAVES, (block) -> this.oakLeavesDrops(block, WHITE_OAK_SAPLING, SAPLING_DROP_CHANCE));
        this.addDrop(BURNT_PAPER_BLOCK, (block) -> this.drops(block, Items.GUNPOWDER, ConstantLootNumberProvider.create(2.0F)));
        this.addDrop(NETHER_STAR_BLOCK, (block) -> dropsWithSilkTouch(block, this.applyExplosionDecay(block, ItemEntry.builder(Items.NETHER_STAR).apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(8.0F, 9.0F))).apply(ApplyBonusLootFunction.uniformBonusCount(impl.getOrThrow(Enchantments.FORTUNE), 2)).apply(LimitCountLootFunction.builder(BoundedIntUnaryOperator.create(8, 9))))));
        this.addDrop(RAINBOW_GLOWSTONE, this::glowstoneDrops);

        this.addDrop(COOKIE_BLOCK, (block) -> LootTable.builder().pool(LootPool.builder().rolls(ConstantLootNumberProvider.create(1.0F)).with(this.applyExplosionDecay(block,
            ItemEntry.builder(Items.COOKIE).apply(setCookieCount(block, 9.0F, 0))
                .apply(setCookieCount(block, 8.0F, 1))
                .apply(setCookieCount(block, 7.0F, 2))
                .apply(setCookieCount(block, 6.0F, 3))
                .apply(setCookieCount(block, 5.0F, 4))
                .apply(setCookieCount(block, 4.0F, 5))
                .apply(setCookieCount(block, 3.0F, 6))
                .apply(setCookieCount(block, 2.0F, 7))
                .apply(setCookieCount(block, 1.0F, 8))))));
    }


    public void addDrops(Block... blocks) {
        for (Block block : blocks) this.addDrop(block);
    }

    public void addDrops(Function<Block, LootTable.Builder> lootTableFunction, Block... blocks) {
        for (Block block : blocks) this.addDrop(block, lootTableFunction.apply(block));
    }

    public void addDropsWithSilkTouch(Block... blocks) {
        for (Block block : blocks) this.addDropWithSilkTouch(block);
    }

    public void addPottedPlantDropsBatch(Block... blocks) {
        for (Block block : blocks) this.addPottedPlantDrops(block);
    }

    public void addBlockStairsandSlabDrops(Block block) {
        this.addDrops(block);
    }

    public void addWoodSetDrop(Block planks, Block stairs, Block slab, Block fence, Block fence_gate, Block door, Block trapdoor, Block pressure_plate, Block button, Block standing_sign, Block ceiling_hanging_sign) {
        this.addBlockStairsandSlabDrops(planks);
        this.addDrops(fence, fence_gate, trapdoor, pressure_plate, button, standing_sign, ceiling_hanging_sign);
        this.addDrop(door, this::doorDrops);
    }

    public LootFunction.Builder setCookieCount(Block block, float count, int bites) {
        return SetCountLootFunction.builder(ConstantLootNumberProvider.create(count)).conditionally(BlockStatePropertyLootCondition.builder(block).properties(net.minecraft.predicate.StatePredicate.Builder.create().exactMatch(CookieBlock.BITES, bites)));
    }

    public LootTable.Builder glowstoneDrops(Block block) {
        RegistryWrapper.Impl<Enchantment> impl = this.registryLookup.getOrThrow(RegistryKeys.ENCHANTMENT);
        return dropsWithSilkTouch(block, this.applyExplosionDecay(block, ItemEntry.builder(Items.GLOWSTONE_DUST).apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(2.0F, 4.0F))).apply(ApplyBonusLootFunction.uniformBonusCount(impl.getOrThrow(Enchantments.FORTUNE))).apply(LimitCountLootFunction.builder(BoundedIntUnaryOperator.create(1, 4)))));
    }

    public LootTable.Builder stickDrops(Block block) {
        return dropsWithSilkTouchOrShears(block, addSurvivesExplosionCondition(block, ItemEntry.builder(Items.STICK)));
    }



    public void addPottedLargePlantDrop(Block block) {
    }
}
