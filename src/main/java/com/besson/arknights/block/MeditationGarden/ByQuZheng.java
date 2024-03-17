package com.besson.arknights.block.MeditationGarden;

import com.besson.arknights.block.FurnitureHorizontalFacingBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.ShapeContext;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;

public class ByQuZheng extends FurnitureHorizontalFacingBlock {
    public static final VoxelShape SHAPE_N = Block.createCuboidShape(-3, 0, 0, 26, 14, 16);

    public static final VoxelShape SHAPE_W = Block.createCuboidShape(0, 0, -10, 16, 14, 19);

    public static final VoxelShape SHAPE_S = Block.createCuboidShape(-10, 0, 0, 19, 14, 16);

    public static final VoxelShape SHAPE_E = Block.createCuboidShape(0, 0, -3, 16, 14, 26);

    public ByQuZheng(Settings settings) {
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
