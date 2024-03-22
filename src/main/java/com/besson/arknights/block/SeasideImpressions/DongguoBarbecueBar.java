package com.besson.arknights.block.SeasideImpressions;

import com.besson.arknights.block.FurnitureHorizontalFacingBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.ShapeContext;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;

public class DongguoBarbecueBar extends FurnitureHorizontalFacingBlock {
    public static final VoxelShape SHAPE_N = Block.createCuboidShape(1, 0, 0, 15, 27, 32);

    public static final VoxelShape SHAPE_W = Block.createCuboidShape(0, 0, 1, 32, 27, 15);

    public static final VoxelShape SHAPE_S = Block.createCuboidShape(1, 0, -16, 15, 27, 16);

    public static final VoxelShape SHAPE_E = Block.createCuboidShape(-16, 0, 1, 16, 27, 15);

    public DongguoBarbecueBar(Settings settings) {
        super(settings);
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
