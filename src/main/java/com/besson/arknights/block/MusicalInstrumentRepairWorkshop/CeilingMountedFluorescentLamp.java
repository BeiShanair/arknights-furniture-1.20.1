package com.besson.arknights.block.MusicalInstrumentRepairWorkshop;

import com.besson.arknights.block.FurnitureHorizontalFacingBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.ShapeContext;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;

public class CeilingMountedFluorescentLamp extends FurnitureHorizontalFacingBlock {
    public static final VoxelShape SHAPE_NS = Block.createCuboidShape(-3, 15, 3, 19, 16, 13);

    public static final VoxelShape SHAPE_WE = Block.createCuboidShape(3, 15, -3, 13, 16, 19);

    public CeilingMountedFluorescentLamp(Settings settings) {
        super(settings.luminance(s -> 15));
    }

    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return switch (state.get(FACING)){
            case EAST, WEST -> SHAPE_WE;
            default -> SHAPE_NS;
        };
    }
}
