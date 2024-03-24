package com.besson.arknights.block.GlasgowGangBoxingGym;

import com.besson.arknights.block.FurnitureHorizontalFacingBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.ShapeContext;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;

public class FistHallScoreboard extends FurnitureHorizontalFacingBlock {
    public static final VoxelShape SHAPE_N = Block.createCuboidShape(-2, -4, 14, 18, 16, 16);

    public static final VoxelShape SHAPE_W = Block.createCuboidShape(14, -4, -2, 16, 16, 18);

    public static final VoxelShape SHAPE_S = Block.createCuboidShape(-2, -4, 0, 18, 16, 2);

    public static final VoxelShape SHAPE_E = Block.createCuboidShape(0, -4, -2, 2, 16, 18);
    public FistHallScoreboard(Settings settings) {
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
