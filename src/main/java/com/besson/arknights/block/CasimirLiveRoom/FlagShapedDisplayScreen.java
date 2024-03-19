package com.besson.arknights.block.CasimirLiveRoom;

import com.besson.arknights.block.FurnitureHorizontalFacingBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.ShapeContext;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;

public class FlagShapedDisplayScreen extends FurnitureHorizontalFacingBlock {
    public static final VoxelShape SHAPE_N = Block.createCuboidShape(-12, 0, 14, 28, 32, 16);

    public static final VoxelShape SHAPE_W = Block.createCuboidShape(14, 0, -12, 16, 32, 28);

    public static final VoxelShape SHAPE_S = Block.createCuboidShape(-12, 0, 0, 28, 32, 2);

    public static final VoxelShape SHAPE_E = Block.createCuboidShape(0, 0, -12, 2, 32, 28);

    public FlagShapedDisplayScreen(Settings settings) {
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
