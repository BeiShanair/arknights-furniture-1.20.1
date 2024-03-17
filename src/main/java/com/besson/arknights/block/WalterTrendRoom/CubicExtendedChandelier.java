package com.besson.arknights.block.WalterTrendRoom;

import com.besson.arknights.block.FurnitureHorizontalFacingBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.ShapeContext;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;

public class CubicExtendedChandelier extends FurnitureHorizontalFacingBlock {
    public static final VoxelShape SHAPE_N = Block.createCuboidShape(-5, 3, 8, 20, 28, 16);

    public static final VoxelShape SHAPE_W = Block.createCuboidShape(8, 3, -4, 16, 28, 21);

    public static final VoxelShape SHAPE_S = Block.createCuboidShape(-4, 3, 0, 21, 28, 8);

    public static final VoxelShape SHAPE_E = Block.createCuboidShape(0, 3, -5, 8, 28, 20);

    public CubicExtendedChandelier(Settings settings) {
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
