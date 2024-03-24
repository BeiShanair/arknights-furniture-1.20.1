package com.besson.arknights.block.ChillyRhythmExperienceHall;

import com.besson.arknights.block.FurnitureHorizontalFacingBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.ShapeContext;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;

public class Reproduce extends FurnitureHorizontalFacingBlock {
    public static final VoxelShape SHAPE_N = Block.createCuboidShape(-6, 0, 0, 21, 29, 21);

    public static final VoxelShape SHAPE_W = Block.createCuboidShape(0, 0, -5, 21, 29, 22);

    public static final VoxelShape SHAPE_S = Block.createCuboidShape(-5, 0, -5, 22, 29, 16);

    public static final VoxelShape SHAPE_E = Block.createCuboidShape(-5, 0, -6, 16, 29, 21);

    public Reproduce(Settings settings) {
        super(settings);
    }

    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return switch (state.get(FACING)){
            case EAST -> SHAPE_E;
            case SOUTH -> SHAPE_S;
            case WEST -> SHAPE_W;
            default -> SHAPE_N;
        };
    }
}
