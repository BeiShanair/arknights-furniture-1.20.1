package com.besson.arknights.block.AirtightChemicalSafetyCabin;

import com.besson.arknights.block.FurnitureHorizontalFacingBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.ShapeContext;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;

public class SafetyCabinCeilingLight extends FurnitureHorizontalFacingBlock {
    public SafetyCabinCeilingLight(Settings settings) {
        super(settings.luminance(state -> 15));
    }

    private static final VoxelShape SHAPE = Block.createCuboidShape(4, 14, 4, 12, 16, 12);

    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return SHAPE;
    }
}
