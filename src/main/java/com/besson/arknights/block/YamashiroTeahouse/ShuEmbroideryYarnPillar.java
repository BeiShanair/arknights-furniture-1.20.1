package com.besson.arknights.block.YamashiroTeahouse;

import com.besson.arknights.block.FurnitureHorizontalFacingBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.ShapeContext;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;

public class ShuEmbroideryYarnPillar extends FurnitureHorizontalFacingBlock {
    public static final VoxelShape SHAPE_NS = Block.createCuboidShape(2, 0, 7, 14, 32, 9);

    public static final VoxelShape SHAPE_WE = Block.createCuboidShape(7, 0, 2, 9, 32, 14);

    public ShuEmbroideryYarnPillar(Settings settings) {
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
