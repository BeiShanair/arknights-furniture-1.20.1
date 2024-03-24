package com.besson.arknights.block.RideTheWildernessTruck;

import com.besson.arknights.block.FurnitureHorizontalFacingBlock;
import com.besson.arknights.block.SofaBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.ShapeContext;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;

public class AVeryPopularBenchDefault extends SofaBlock {
    public static final VoxelShape SHAPE_NS = Block.createCuboidShape(0, 0, 2, 16, 10, 14);

    public static final VoxelShape SHAPE_WE = Block.createCuboidShape(2, 0, 0, 14, 10, 16);

    public AVeryPopularBenchDefault(Settings settings) {
        super(settings);
    }

    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return switch (state.get(FACING)){
            case EAST, WEST -> SHAPE_WE;
            default -> SHAPE_NS;
        };
    }
}
