package com.besson.arknights.block.YamashiroTeahouse;

import com.besson.arknights.block.FurnitureHorizontalFacingBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.ShapeContext;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;

public class YellowPearWoodChessTable extends FurnitureHorizontalFacingBlock {
    public static final VoxelShape SHAPE_NS = Block.createCuboidShape(-6, 0, 0, 22, 16, 16);

    public static final VoxelShape SHAPE_WE = Block.createCuboidShape(0, 0, -6, 16, 16, 22);

    public YellowPearWoodChessTable(Settings settings) {
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
