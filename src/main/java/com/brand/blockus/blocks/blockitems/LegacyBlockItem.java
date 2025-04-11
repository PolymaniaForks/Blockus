package com.brand.blockus.blocks.blockitems;

import com.brand.blockus.Blockus;
import net.minecraft.block.Block;
import net.minecraft.component.type.TooltipDisplayComponent;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.tooltip.TooltipType;
import net.minecraft.screen.ScreenTexts;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.util.Util;

import java.util.function.Consumer;

public class LegacyBlockItem extends BlockItem {
    private final String version;

    public LegacyBlockItem(Block block, Settings settings, String version) {
        super(block, settings);
        this.version = version;
    }

    @Override
    public void appendTooltip(ItemStack stack, TooltipContext context, TooltipDisplayComponent displayComponent, Consumer<Text> textConsumer, TooltipType type) {
        textConsumer.accept(Text.translatable(Util.createTranslationKey("blockitem", Blockus.id("legacy"))).formatted(Formatting.LIGHT_PURPLE));
        textConsumer.accept(ScreenTexts.EMPTY);
        textConsumer.accept(Text.literal(version).formatted(Formatting.ITALIC).formatted(Formatting.GRAY));

    }
}
