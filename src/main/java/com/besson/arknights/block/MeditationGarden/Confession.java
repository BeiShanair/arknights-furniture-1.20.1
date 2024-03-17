package com.besson.arknights.block.MeditationGarden;

import com.besson.arknights.block.FurnitureHorizontalFacingBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.ShapeContext;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;

public class Confession extends FurnitureHorizontalFacingBlock {
    public static final VoxelShape SHAPE_N = Block.createCuboidShape(3, 1, 8, 13, 10, 16);

    public static final VoxelShape SHAPE_W = Block.createCuboidShape(8, 1, 3, 16, 10, 13);

    public static final VoxelShape SHAPE_S = Block.createCuboidShape(3, 1, 0, 13, 10, 8);

    public static final VoxelShape SHAPE_E = Block.createCuboidShape(0, 1, 3, 8, 10, 13);

    public Confession(Settings settings) {
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
