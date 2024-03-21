package com.besson.arknights.block.MusicalInstrumentRepairWorkshop;

import com.besson.arknights.block.FurnitureHorizontalFacingBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.ShapeContext;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;

public class DecorativeCeiling extends FurnitureHorizontalFacingBlock {
    public static final VoxelShape SHAPE_NS = Block.createCuboidShape(-8, 14, 0, 24, 16, 16);

    public static final VoxelShape SHAPE_WE = Block.createCuboidShape(0, 14, -8, 16, 16, 24);

    public DecorativeCeiling(Settings settings) {
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
