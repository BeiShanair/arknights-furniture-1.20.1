package com.besson.arknights.block.CourtOfJusticeOfSyracuse;

import com.besson.arknights.block.FurnitureHorizontalFacingBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.ShapeContext;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;

public class CourtWallLamp extends FurnitureHorizontalFacingBlock {
    public static final VoxelShape SHAPE_N = Block.createCuboidShape(5, 5, 13, 11, 13, 16);

    public static final VoxelShape SHAPE_W = Block.createCuboidShape(13, 5, 5, 16, 13, 11);

    public static final VoxelShape SHAPE_S = Block.createCuboidShape(5, 5, 0, 11, 13, 3);

    public static final VoxelShape SHAPE_E = Block.createCuboidShape(0, 5, 5, 3, 13, 11);

    public CourtWallLamp(Settings settings) {
        super(settings.luminance(state -> 15));
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
