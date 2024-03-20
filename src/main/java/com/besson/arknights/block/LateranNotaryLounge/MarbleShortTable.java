package com.besson.arknights.block.LateranNotaryLounge;

import com.besson.arknights.block.FurnitureHorizontalFacingBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.ShapeContext;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;

public class MarbleShortTable extends FurnitureHorizontalFacingBlock {
    public static final VoxelShape SHAPE_N = Block.createCuboidShape(0, 0, 1, 16, 8, 31);

    public static final VoxelShape SHAPE_W = Block.createCuboidShape(1, 0, 0, 31, 8, 16);

    public static final VoxelShape SHAPE_S = Block.createCuboidShape(0, 0, -15, 16, 8, 15);

    public static final VoxelShape SHAPE_E = Block.createCuboidShape(-15, 0, 0, 15, 8, 16);

    public MarbleShortTable(Settings settings) {
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
