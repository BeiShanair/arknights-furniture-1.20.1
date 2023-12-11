package com.besson.arknights.block.SiestaBeachCottage;

import com.besson.arknights.block.FurnitureHorizontalFacingBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.ShapeContext;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;

public class LazyTeaTable extends FurnitureHorizontalFacingBlock {
    public LazyTeaTable(Settings settings) {
        super(settings);
    }

    private static final VoxelShape SHAPE_N = Block.createCuboidShape(2, 0, 0, 14, 15, 32);
    private static final VoxelShape SHAPE_W = Block.createCuboidShape(0, 0, 2, 32, 15, 14);
    private static final VoxelShape SHAPE_S = Block.createCuboidShape(2, 0, -16, 14, 15, 16);
    private static final VoxelShape SHAPE_E = Block.createCuboidShape(-16, 0, 2, 16, 15, 14);

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
