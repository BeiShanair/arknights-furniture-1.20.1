package com.besson.arknights.block.FreightWarehouse;

import com.besson.arknights.block.FurnitureHorizontalFacingBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.ShapeContext;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;

public class QuickPostitNotes extends FurnitureHorizontalFacingBlock {
    public QuickPostitNotes(Settings settings) {
        super(settings);
    }

    private static final VoxelShape SHAPE_N = Block.createCuboidShape(-6, 0, 15, 22, 26, 16);
    private static final VoxelShape SHAPE_S = Block.createCuboidShape(-6, 0, 0, 22, 26, 1);
    private static final VoxelShape SHAPE_W = Block.createCuboidShape(15, 0, -6, 16, 26, 22);
    private static final VoxelShape SHAPE_E = Block.createCuboidShape(0, 0, -6, 1, 26, 22);

    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return switch (state.get(FACING)) {
            case SOUTH -> SHAPE_S;
            case WEST -> SHAPE_W;
            case EAST -> SHAPE_E;
            default -> SHAPE_N;
        };
    }
}
