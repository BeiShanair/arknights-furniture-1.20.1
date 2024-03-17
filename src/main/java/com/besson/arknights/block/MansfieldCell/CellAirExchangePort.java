package com.besson.arknights.block.MansfieldCell;

import com.besson.arknights.block.FurnitureHorizontalFacingBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.ShapeContext;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;

public class CellAirExchangePort extends FurnitureHorizontalFacingBlock {
    public static final VoxelShape SHAPE_N = Block.createCuboidShape(0, 5, 14, 16, 11, 16);

    public static final VoxelShape SHAPE_W = Block.createCuboidShape(14, 5, 0, 16, 11, 16);

    public static final VoxelShape SHAPE_S = Block.createCuboidShape(0, 5, 0, 16, 11, 2);

    public static final VoxelShape SHAPE_E = Block.createCuboidShape(0, 5, 0, 2, 11, 16);

    public CellAirExchangePort(Settings settings) {
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
