package com.besson.arknights.block.HealthyFastFoodRestaurant;

import com.besson.arknights.block.FurnitureHorizontalFacingBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.ShapeContext;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;

public class SelfServiceVendingMachine extends FurnitureHorizontalFacingBlock {
    public SelfServiceVendingMachine(Settings settings) {
        super(settings);
    }

    private static final VoxelShape SHAPE_NS = Block.createCuboidShape(-5, 0, 2, 21, 32, 14);
    private static final VoxelShape SHAPE_WE = Block.createCuboidShape(2, 0, -5, 14, 32, 21);

    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return switch (state.get(FACING)) {
            case WEST,EAST -> SHAPE_WE;
            default -> SHAPE_NS;
        };
    }
}
