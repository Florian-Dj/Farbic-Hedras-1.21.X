package net.hedras.block;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.hedras.HedrasMod;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

public class ModBlocks {

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(HedrasMod.MOD_ID, name), block);
    }

    private static void registerBlockItem(String name, Block block) {
        Registry.register(Registries.ITEM, Identifier.of(HedrasMod.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));
    }

    public static final Block WHITE_WOOL_STAIRS = registerBlock("white_wool_stairs",
            new StairsBlock(Blocks.WHITE_WOOL.getDefaultState(),
                    AbstractBlock.Settings.create().strength(2f).sounds(BlockSoundGroup.WOOL)));
    public static final Block WHITE_WOOL_SLAB = registerBlock("white_wool_slab",
            new SlabBlock(AbstractBlock.Settings.create().strength(2f).sounds(BlockSoundGroup.WOOL)));

    /*
    public static final Block WHITE_WOOL_BUTTON = registerBlock("white_wool_button",
            new ButtonBlock(BlockSetType.WARPED,2, AbstractBlock.Settings.create().strength(2f).noCollision()));
    public static final Block WHITE_WOOL_PRESSURE_PLATE = registerBlock("white_wool_pressure_plate",
            new PressurePlateBlock(BlockSetType.BAMBOO, AbstractBlock.Settings.create().strength(2f)));
    */

    public static final Block WHITE_WOOL_FENCE = registerBlock("white_wool_fence",
            new FenceBlock(AbstractBlock.Settings.create().strength(2f).sounds(BlockSoundGroup.WOOL)));
    public static final Block WHITE_WOOL_FENCE_GATE = registerBlock("white_wool_fence_gate",
            new FenceGateBlock(WoodType.SPRUCE, AbstractBlock.Settings.create().strength(2f)));
    public static final Block WHITE_WOOL_WALL = registerBlock("white_wool_wall",
            new WallBlock(AbstractBlock.Settings.create().strength(2f).sounds(BlockSoundGroup.WOOL)));

    public static void registerModBlocks() {
        HedrasMod.LOGGER.info("Registering Mod Blocks for" + HedrasMod.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COLORED_BLOCKS).register(entries -> {
            entries.add(ModBlocks.WHITE_WOOL_STAIRS);
            entries.add(ModBlocks.WHITE_WOOL_SLAB);
            entries.add(ModBlocks.WHITE_WOOL_FENCE);
            entries.add(ModBlocks.WHITE_WOOL_FENCE_GATE);
            entries.add(ModBlocks.WHITE_WOOL_WALL);
        });
    }
}
