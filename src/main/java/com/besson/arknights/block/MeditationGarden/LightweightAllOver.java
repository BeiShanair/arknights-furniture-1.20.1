package com.besson.arknights.block.MeditationGarden;

import com.besson.arknights.block.FurnitureHorizontalFacingBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.ShapeContext;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;

public class LightweightAllOver extends FurnitureHorizontalFacingBlock {
    public static final VoxelShape SHAPE_N = Block.createCuboidShape(6, 0, 12, 10, 23, 16);

    public static final VoxelShape SHAPE_W = Block.createCuboidShape(12, 0, 6, 16, 23, 10);

    public static final VoxelShape SHAPE_S = Block.createCuboidShape(6, 0, 0, 10, 23, 4);

    public static final VoxelShape SHAPE_E = Block.createCuboidShape(0, 0, 6, 4, 23, 10);
    public LightweightAllOver(Settings settings) {
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
