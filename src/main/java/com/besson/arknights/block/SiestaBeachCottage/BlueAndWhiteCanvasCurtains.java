package com.besson.arknights.block.SiestaBeachCottage;

import com.besson.arknights.block.FurnitureHorizontalFacingBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.ShapeContext;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;

public class BlueAndWhiteCanvasCurtains extends FurnitureHorizontalFacingBlock {
    public BlueAndWhiteCanvasCurtains(Settings settings) {
        super(settings);
    }

    private static final VoxelShape SHAPE_NS = Block.createCuboidShape(0, 0, 6, 16, 32, 10);
    private static final VoxelShape SHAPE_WE = Block.createCuboidShape(6, 0, 0, 10, 32, 16);

    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return switch (state.get(FACING)){
            case WEST,EAST -> SHAPE_WE;
            default -> SHAPE_NS;
        };
    }
}
