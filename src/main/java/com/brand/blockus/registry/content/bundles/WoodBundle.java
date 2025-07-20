package com.brand.blockus.registry.content.bundles;

import com.brand.blockus.Blockus;
import com.brand.blockus.registry.content.BlockusItems;
import com.brand.blockus.utils.BlockFactory;
import net.minecraft.block.*;
import net.minecraft.block.enums.NoteBlockInstrument;
import net.minecraft.item.HangingSignItem;
import net.minecraft.item.Item;
import net.minecraft.item.SignItem;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

import java.util.ArrayList;

public class WoodBundle {

    public static final ArrayList<WoodBundle> LIST = new ArrayList<>();

    public final Block planks = null;
    public final Block stairs = null;
    public final Block slab = null;
    public final Block fence = null;
    public final Block fence_gate = null;
    public final Block door = null;
    public final Block trapdoor = null;
    public final Block base = null;
    public final Block pressure_plate = null;
    public final Block button = null;
    public final Block standing_sign = null;
    public final Block wall_sign = null;
    public final Item sign = null;
    public final Block ceiling_hanging_sign = null;
    public final Block wall_hanging_sign = null;
    public final Item hanging_sign = null;
    public boolean burnable;

    public WoodBundle(String type, Block base, MapColor color, BlockSoundGroup sound, WoodType woodtype, BlockSetType blockSetType, boolean burnable) {



    }

    public WoodBundle(String type, Block base, MapColor color, BlockSoundGroup sound, net.minecraft.block.WoodType woodtype, BlockSetType blockSetType) {
        this(type, base, color, sound, woodtype, blockSetType, true);
    }

    public WoodBundle(String type, Block base, MapColor color, BlockSoundGroup sound) {
        this(type, base, color, sound, net.minecraft.block.WoodType.OAK, BlockSetType.OAK, true);
    }

    public WoodBundle(String type, Block base, MapColor color, BlockSoundGroup sound, boolean burnable) {
        this(type, base, color, sound, net.minecraft.block.WoodType.OAK, BlockSetType.OAK, burnable);
    }

    public static AbstractBlock.Settings copyLootTable(Block block, MapColor color, boolean burnable) {
        AbstractBlock.Settings settings = AbstractBlock.Settings.create().lootTable(block.getLootTableKey()).overrideTranslationKey(block.getTranslationKey()).mapColor(color).solid().instrument(NoteBlockInstrument.BASS).noCollision().strength(1.0F);
        if (burnable) {
            settings = settings.burnable();
        }
        return settings;
    }

    public static ArrayList<WoodBundle> values() {
        return LIST;
    }

    public boolean isBurnable() {
        return this.burnable;
    }
}
