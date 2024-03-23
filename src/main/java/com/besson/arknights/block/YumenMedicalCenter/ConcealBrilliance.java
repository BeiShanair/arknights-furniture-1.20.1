package com.besson.arknights.block.YumenMedicalCenter;

import com.besson.arknights.block.FurnitureHorizontalFacingBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.ShapeContext;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;

public class ConcealBrilliance extends FurnitureHorizontalFacingBlock {
    public static final VoxelShape SHAPE_N = Block.createCuboidShape(-9, 0, 7, 25, 19, 25);

    public static final VoxelShape SHAPE_W = Block.createCuboidShape(7, 0, -9, 25, 19, 25);

    public static final VoxelShape SHAPE_S = Block.createCuboidShape(-9, 0, -9, 25, 19, 9);

    public static final VoxelShape SHAPE_E = Block.createCuboidShape(-9, 0, -9, 9, 19, 25);

    public ConcealBrilliance(Settings settings) {
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
