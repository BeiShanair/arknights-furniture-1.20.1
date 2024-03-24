package com.besson.arknights.block.ChillyRhythmExperienceHall;

import com.besson.arknights.block.FurnitureHorizontalFacingBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.ShapeContext;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;

public class DefinitionOfCold extends FurnitureHorizontalFacingBlock {
    public static final VoxelShape SHAPE_N = Block.createCuboidShape(2, 2, 14.9, 13, 14, 15.9);

    public static final VoxelShape SHAPE_W = Block.createCuboidShape(14.9, 2, 3, 15.9, 14, 14);

    public static final VoxelShape SHAPE_S = Block.createCuboidShape(3, 2, 0.1, 14, 14, 1.1);

    public static final VoxelShape SHAPE_E = Block.createCuboidShape(0.1, 2, 3, 1.1, 14, 14);

    public DefinitionOfCold(Settings settings) {
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
