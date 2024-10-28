package net.hedras.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.hedras.block.ModBlocks;
import net.minecraft.block.Blocks;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        BlockStateModelGenerator.BlockTexturePool pinkGarnetPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.WHITE_WOOL);
        pinkGarnetPool.stairs(ModBlocks.WHITE_WOOL_STAIRS);
        pinkGarnetPool.slab(ModBlocks.WHITE_WOOL_SLAB);
        pinkGarnetPool.fence(ModBlocks.WHITE_WOOL_FENCE);
        pinkGarnetPool.fenceGate(ModBlocks.WHITE_WOOL_FENCE_GATE);
        pinkGarnetPool.wall(ModBlocks.WHITE_WOOL_WALL);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        // itemModelGenerator.register(ModItems.MY_ITEM);
    }
}
