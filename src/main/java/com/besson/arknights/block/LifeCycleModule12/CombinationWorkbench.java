package com.besson.arknights.block.LifeCycleModule12;

import com.besson.arknights.block.FurnitureHorizontalFacingBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.ShapeContext;
import net.minecraft.util.function.BooleanBiFunction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;

import java.util.stream.Stream;

public class CombinationWorkbench extends FurnitureHorizontalFacingBlock {
    public CombinationWorkbench(Settings settings) {
        super(settings);
    }

    private static final VoxelShape SHAPE_NS = Stream.of(
            Block.createCuboidShape(28, 0, -8, 30, 16, 24),
            Block.createCuboidShape(-14, 0, -8, -12, 16, 24),
            Block.createCuboidShape(-16, 16, -8, 32, 18, 24),
            Block.createCuboidShape(-12, 1, -8, 28, 4, 24),
            Block.createCuboidShape(-12, 5, -8, 28, 16, 24)
    ).reduce((v1, v2) -> VoxelShapes.combineAndSimplify(v1, v2, BooleanBiFunction.OR)).get();
    private static final VoxelShape SHAPE_WE = Stream.of(
            Block.createCuboidShape(-8, 0, -14, 24, 16, -12),
            Block.createCuboidShape(-8, 0, 28, 24, 16, 30),
            Block.createCuboidShape(-8, 16, -16, 24, 18, 32),
            Block.createCuboidShape(-8, 1, -12, 24, 4, 28),
            Block.createCuboidShape(-8, 5, -12, 24, 16, 28)
    ).reduce((v1, v2) -> VoxelShapes.combineAndSimplify(v1, v2, BooleanBiFunction.OR)).get();

    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return switch (state.get(FACING)) {
            case WEST,EAST -> SHAPE_WE;
            default -> SHAPE_NS;
        };
    }
}
