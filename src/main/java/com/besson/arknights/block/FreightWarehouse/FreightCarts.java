package com.besson.arknights.block.FreightWarehouse;

import com.besson.arknights.block.FurnitureHorizontalFacingBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.ShapeContext;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;

public class FreightCarts extends FurnitureHorizontalFacingBlock {
    public FreightCarts(Settings settings) {
        super(settings);
    }

    private static final VoxelShape SHAPE_NS = Block.createCuboidShape(-13, 0, -4, 29, 27, 20);

    private static final VoxelShape SHAPE_WE = Block.createCuboidShape(-4, 0, -13, 20, 27, 29);

    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return switch (state.get(FACING)) {
            case EAST, WEST -> SHAPE_WE;
            default -> SHAPE_NS;
        };
    }
}
