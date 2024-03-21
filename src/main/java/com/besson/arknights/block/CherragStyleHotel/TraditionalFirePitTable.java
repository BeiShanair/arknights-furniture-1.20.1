package com.besson.arknights.block.CherragStyleHotel;

import com.besson.arknights.block.FurnitureHorizontalFacingBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.ShapeContext;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;

public class TraditionalFirePitTable extends FurnitureHorizontalFacingBlock {
    public static final VoxelShape SHAPE = Block.createCuboidShape(-9, 0, -9, 25, 13, 25);

    public TraditionalFirePitTable(Settings settings) {
        super(settings);
    }

    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return SHAPE;
    }
}
