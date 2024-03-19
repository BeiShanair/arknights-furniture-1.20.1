package com.besson.arknights.block.KnightsoftheRedPineLounge;

import com.besson.arknights.block.FurnitureHorizontalFacingBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.ShapeContext;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;

public class SundryDisplayCabinet extends FurnitureHorizontalFacingBlock {
    public static final VoxelShape SHAPE_NS = Block.createCuboidShape(-2, 0, 0, 18, 26, 16);

    public static final VoxelShape SHAPE_WE = Block.createCuboidShape(0, 0, -2, 16, 26, 18);

    public SundryDisplayCabinet(Settings settings) {
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
