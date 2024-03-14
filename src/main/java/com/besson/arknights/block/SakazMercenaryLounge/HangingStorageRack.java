package com.besson.arknights.block.SakazMercenaryLounge;

import com.besson.arknights.block.FurnitureHorizontalFacingBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.ShapeContext;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;

public class HangingStorageRack extends FurnitureHorizontalFacingBlock {
    public HangingStorageRack(Settings settings) {
        super(settings);
    }

    private static final VoxelShape SHAPE_N = Block.createCuboidShape(-8, 0, 4, 24, 7, 16);
    private static final VoxelShape SHAPE_W = Block.createCuboidShape(4, 0, -8, 16, 7, 24);
    private static final VoxelShape SHAPE_S = Block.createCuboidShape(-8, 0, 0, 24, 7, 12);
    private static final VoxelShape SHAPE_E = Block.createCuboidShape(0, 0, -8, 12, 7, 24);

    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return switch (state.get(FACING)){
            case WEST -> SHAPE_W;
            case SOUTH -> SHAPE_S;
            case EAST -> SHAPE_E;
            default -> SHAPE_N;
        };
    }
}
