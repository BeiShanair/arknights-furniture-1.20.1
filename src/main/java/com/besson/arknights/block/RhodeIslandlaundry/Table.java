package com.besson.arknights.block.RhodeIslandlaundry;

import com.besson.arknights.block.FurnitureHorizontalFacingBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.ShapeContext;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;

public class Table extends FurnitureHorizontalFacingBlock {
    public static final VoxelShape SHAPE_NS = Block.createCuboidShape(-4, 0, 0, 20, 16, 16);

    public static final VoxelShape SHAPE_WE = Block.createCuboidShape(0, 0, -4, 16, 16, 20);

    public Table(Settings settings) {
        super(settings);
    }

    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return switch (state.get(FACING)){
            case WEST, EAST -> SHAPE_WE;
            default -> SHAPE_NS;
        };
    }
}
