package com.besson.arknights.block.MeditationGarden;

import com.besson.arknights.block.FurnitureHorizontalFacingBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.ShapeContext;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;

public class Clean extends FurnitureHorizontalFacingBlock {
    public static final VoxelShape SHAPE_N = Block.createCuboidShape(-8, 14, 15, 24, 15, 16);

    public static final VoxelShape SHAPE_W = Block.createCuboidShape(15, 14, -8, 16, 15, 24);

    public static final VoxelShape SHAPE_S = Block.createCuboidShape(-8, 14, 0, 24, 15, 1);

    public static final VoxelShape SHAPE_E = Block.createCuboidShape(0, 14, -8, 1, 15, 24);

    public Clean(Settings settings) {
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
