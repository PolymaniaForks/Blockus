package com.brand.blockus.blocks.base;

import com.brand.blockus.Blockus;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.tooltip.TooltipType;
import net.minecraft.registry.Registries;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.util.Identifier;
import net.minecraft.util.Util;

import java.util.List;

public class ColoredTilesBlock extends HorizontalAxisBlock {

    public final Block tile1;
    public final Block tile2;
    public String translationKey;

    public ColoredTilesBlock(Block tile1, Block tile2, Settings settings) {
        super(settings.overrideTranslationKey(Util.createTranslationKey("block", Blockus.id("colored_tiles"))));
        this.tile1 = tile1;
        this.tile2 = tile2;
    }

    public static String getColor(Block block) {
        return Registries.BLOCK.getId(block).getPath().replace("_concrete", "");
    }

    @Override
    public void appendTooltip(ItemStack stack, Item.TooltipContext context, List<Text> tooltip, TooltipType options) {
        super.appendTooltip(stack, context, tooltip, options);
        tooltip.add(Text.translatable(Util.createTranslationKey("color", Identifier.tryParse(getColor(tile1)))).formatted(Formatting.GRAY).append(" & ").append(Text.translatable(Util.createTranslationKey("color", Identifier.tryParse(getColor(tile2)))).formatted(Formatting.GRAY)));
    }
}

