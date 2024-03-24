package com.besson.arknights.block.GlasgowGangBoxingGym;

import com.besson.arknights.block.SofaBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.ShapeContext;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;

public class HangingOldSofa extends SofaBlock {
    public static final VoxelShape SHAPE_NS = Block.createCuboidShape(0, -13, 2, 16, 16, 14);

    public static final VoxelShape SHAPE_WE = Block.createCuboidShape(2, -13, 0, 14, 16, 16);

    public HangingOldSofa(Settings settings) {
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
