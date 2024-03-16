package com.besson.arknights.block.LetaniaNight;

import com.besson.arknights.block.FurnitureHorizontalFacingBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.ShapeContext;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;


public class BlackLacquerWhiteHeadCello extends FurnitureHorizontalFacingBlock {
    public static final VoxelShape SHAPE_N = Block.createCuboidShape(2, 0, 6, 14, 24, 11);

    public static final VoxelShape SHAPE_W = Block.createCuboidShape(6, 0, 2, 11, 24, 14);

    public static final VoxelShape SHAPE_S = Block.createCuboidShape(2, 0, 5, 14, 24, 10);

    public static final VoxelShape SHAPE_E = Block.createCuboidShape(5, 0, 2, 10, 24, 14);
    public BlackLacquerWhiteHeadCello(Settings settings) {
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
