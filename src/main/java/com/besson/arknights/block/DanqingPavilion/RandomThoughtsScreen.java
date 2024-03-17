package com.besson.arknights.block.DanqingPavilion;

import com.besson.arknights.block.FurnitureHorizontalFacingBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.ShapeContext;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;

public class RandomThoughtsScreen extends FurnitureHorizontalFacingBlock {
    public static final VoxelShape SHAPE_N = Block.createCuboidShape(-16, 11, 14, 32, 16, 16);

    public static final VoxelShape SHAPE_W = Block.createCuboidShape(14, 11, -16, 16, 16, 32);

    public static final VoxelShape SHAPE_S = Block.createCuboidShape(-16, 11, 0, 32, 16, 2);

    public static final VoxelShape SHAPE_E = Block.createCuboidShape(0, 11, -16, 2, 16, 32);

    public RandomThoughtsScreen(Settings settings) {
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
