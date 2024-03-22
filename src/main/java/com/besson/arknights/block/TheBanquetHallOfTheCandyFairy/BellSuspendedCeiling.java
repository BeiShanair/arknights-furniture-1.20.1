package com.besson.arknights.block.TheBanquetHallOfTheCandyFairy;

import com.besson.arknights.block.FurnitureHorizontalFacingBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.ShapeContext;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;

public class BellSuspendedCeiling extends FurnitureHorizontalFacingBlock {
    public static final VoxelShape SHAPE_N = Block.createCuboidShape(5, 3, 2.5, 11, 16, 16.5);

    public static final VoxelShape SHAPE_W = Block.createCuboidShape(2.5, 3, 5, 16.5, 16, 11);

    public static final VoxelShape SHAPE_S = Block.createCuboidShape(5, 3, -0.5, 11, 16, 13.5);

    public static final VoxelShape SHAPE_E = Block.createCuboidShape(-0.5, 3, 5, 13.5, 16, 11);

    public BellSuspendedCeiling(Settings settings) {
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
