package com.besson.arknights.block.WhiteWangno;

import com.besson.arknights.block.FurnitureHorizontalFacingBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.ShapeContext;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;

public class CircularDecorativeLightSource extends FurnitureHorizontalFacingBlock {
    public static final VoxelShape SHAPE_N = Block.createCuboidShape(3, 2, 15, 13, 16, 16);

    public static final VoxelShape SHAPE_W = Block.createCuboidShape(15, 2, 3, 16, 16, 13);

    public static final VoxelShape SHAPE_S = Block.createCuboidShape(3, 2, 0, 13, 16, 1);

    public static final VoxelShape SHAPE_E = Block.createCuboidShape(0, 2, 3, 1, 16, 13);

    public CircularDecorativeLightSource(Settings settings) {
        super(settings.luminance(s -> 15));
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
