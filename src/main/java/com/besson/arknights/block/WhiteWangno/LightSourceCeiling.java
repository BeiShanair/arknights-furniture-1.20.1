package com.besson.arknights.block.WhiteWangno;

import com.besson.arknights.block.FurnitureHorizontalFacingBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.ShapeContext;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;

public class LightSourceCeiling extends FurnitureHorizontalFacingBlock {
    public static final VoxelShape SHAPE_N = Block.createCuboidShape(-9, 13, 0, 23, 16, 16);

    public static final VoxelShape SHAPE_W = Block.createCuboidShape(0, 13, -7, 16, 16, 25);

    public static final VoxelShape SHAPE_S = Block.createCuboidShape(-7, 13, 0, 25, 16, 16);

    public static final VoxelShape SHAPE_E = Block.createCuboidShape(0, 13, -9, 16, 16, 23);

    public LightSourceCeiling(Settings settings) {
        super(settings.luminance(s -> 15));
    }

    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return switch (state.get(FACING)){
            case EAST -> SHAPE_E;
            case SOUTH -> SHAPE_S;
            case WEST -> SHAPE_W;
            default -> SHAPE_N;
        };
    }
}
