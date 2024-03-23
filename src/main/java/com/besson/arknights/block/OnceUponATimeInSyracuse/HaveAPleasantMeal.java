package com.besson.arknights.block.OnceUponATimeInSyracuse;

import com.besson.arknights.block.FurnitureHorizontalFacingBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.ShapeContext;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;

public class HaveAPleasantMeal extends FurnitureHorizontalFacingBlock {
    public static final VoxelShape SHAPE_N = Block.createCuboidShape(0, 0, 2, 21, 16, 14);

    public static final VoxelShape SHAPE_W = Block.createCuboidShape(2, 0, -5, 14, 16, 16);

    public static final VoxelShape SHAPE_S = Block.createCuboidShape(-5, 0, 2, 16, 16, 14);

    public static final VoxelShape SHAPE_E = Block.createCuboidShape(2, 0, 0, 14, 16, 21);

    public HaveAPleasantMeal(Settings settings) {
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
