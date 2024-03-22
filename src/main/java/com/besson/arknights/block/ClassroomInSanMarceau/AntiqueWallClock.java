package com.besson.arknights.block.ClassroomInSanMarceau;

import com.besson.arknights.block.FurnitureHorizontalFacingBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.ShapeContext;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;

public class AntiqueWallClock extends FurnitureHorizontalFacingBlock {
    public static final VoxelShape SHAPE_N = Block.createCuboidShape(2, 2, 14, 14, 19, 16);

    public static final VoxelShape SHAPE_W = Block.createCuboidShape(14, 2, 2, 16, 19, 14);

    public static final VoxelShape SHAPE_S = Block.createCuboidShape(2, 2, 0, 14, 19, 2);

    public static final VoxelShape SHAPE_E = Block.createCuboidShape(0, 2, 2, 2, 19, 14);

    public AntiqueWallClock(Settings settings) {
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
