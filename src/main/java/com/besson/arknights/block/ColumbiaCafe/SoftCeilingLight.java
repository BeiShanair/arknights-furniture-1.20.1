package com.besson.arknights.block.ColumbiaCafe;

import com.besson.arknights.block.FurnitureHorizontalFacingBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.ShapeContext;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;

public class SoftCeilingLight extends FurnitureHorizontalFacingBlock {
    public SoftCeilingLight(Settings settings) {
        super(settings.luminance(state -> 15));
    }

    private static final VoxelShape SHAPE = Block.createCuboidShape(0, 14, 0, 16, 16, 16);

    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return SHAPE;
    }
}
