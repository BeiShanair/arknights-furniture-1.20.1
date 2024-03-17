package com.besson.arknights.block.DanqingPavilion;

import com.besson.arknights.block.FurnitureHorizontalFacingBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.ShapeContext;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;

public class TransparentHangingCurtainWide extends FurnitureHorizontalFacingBlock {
    public static final VoxelShape SHAPE_N = Block.createCuboidShape(1, 0, 15, 15, 32, 16);

    public static final VoxelShape SHAPE_W = Block.createCuboidShape(15, 0, 1, 16, 32, 15);

    public static final VoxelShape SHAPE_S = Block.createCuboidShape(1, 0, 0, 15, 32, 1);

    public static final VoxelShape SHAPE_E = Block.createCuboidShape(0, 0, 1, 1, 32, 15);

    public TransparentHangingCurtainWide(Settings settings) {
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
