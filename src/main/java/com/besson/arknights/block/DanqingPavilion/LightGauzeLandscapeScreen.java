package com.besson.arknights.block.DanqingPavilion;

import com.besson.arknights.block.FurnitureHorizontalFacingBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.ShapeContext;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;

public class LightGauzeLandscapeScreen extends FurnitureHorizontalFacingBlock {
    public static final VoxelShape SHAPE_N = Block.createCuboidShape(-8, 0, 5, 27, 32, 18);

    public static final VoxelShape SHAPE_W = Block.createCuboidShape(5, 0, -11, 18, 32, 24);

    public static final VoxelShape SHAPE_S = Block.createCuboidShape(-11, 0, -2, 24, 32, 11);

    public static final VoxelShape SHAPE_E = Block.createCuboidShape(-2, 0, -8, 11, 32, 27);

    public LightGauzeLandscapeScreen(Settings settings) {
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
