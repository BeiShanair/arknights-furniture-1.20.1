package com.besson.arknights.block.StormCommandoWarRoom;

import com.besson.arknights.block.FurnitureHorizontalFacingBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.ShapeContext;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;

public class SoftLightNightLight extends FurnitureHorizontalFacingBlock {
    public static final VoxelShape SHAPE_N = Block.createCuboidShape(5, 5, 4, 15, 16, 15);

    public static final VoxelShape SHAPE_W = Block.createCuboidShape(4, 5, 1, 15, 16, 11);

    public static final VoxelShape SHAPE_S = Block.createCuboidShape(1, 5, 1, 11, 16, 12);

    public static final VoxelShape SHAPE_E = Block.createCuboidShape(1, 5, 5, 12, 16, 15);

    public SoftLightNightLight(Settings settings) {
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
