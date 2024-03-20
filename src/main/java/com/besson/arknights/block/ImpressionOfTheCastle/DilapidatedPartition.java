package com.besson.arknights.block.ImpressionOfTheCastle;

import com.besson.arknights.block.FurnitureHorizontalFacingBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.ShapeContext;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;

public class DilapidatedPartition extends FurnitureHorizontalFacingBlock {
    public static final VoxelShape SHAPE_N = Block.createCuboidShape(-6, 0, 7, 23, 32, 9);

    public static final VoxelShape SHAPE_W = Block.createCuboidShape(7, 0, -7, 9, 32, 22);

    public static final VoxelShape SHAPE_S = Block.createCuboidShape(-7, 0, 7, 22, 32, 9);

    public static final VoxelShape SHAPE_E = Block.createCuboidShape(7, 0, -6, 9, 32, 23);

    public DilapidatedPartition(Settings settings) {
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
