package com.besson.arknights.block.CherragStyleHotel;

import com.besson.arknights.block.FurnitureHorizontalFacingBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.ShapeContext;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;

public class ExoticRoundStool extends FurnitureHorizontalFacingBlock {
    public static final VoxelShape SHAPE = Block.createCuboidShape(3, 0, 3, 13, 12, 13);

    public ExoticRoundStool(Settings settings) {
        super(settings);
    }

    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return SHAPE;
    }
}
