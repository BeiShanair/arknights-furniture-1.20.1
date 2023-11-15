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

public class CabinCombinationDoubleBed extends FurnitureHorizontalFacingBlock {
    public CabinCombinationDoubleBed(Settings settings) {
        super(settings);
    }

    private static final VoxelShape SHAPE_N = Stream.of(
            Block.createCuboidShape(0, 0, 0, 16, 16, 1),
            Block.createCuboidShape(0, 0, 31, 16, 16, 32),
            Block.createCuboidShape(0, 1, 1, 16, 7, 31),
            Block.createCuboidShape(1, 7, 1, 15, 8, 31),
            Block.createCuboidShape(3, 8, 25, 13, 9, 30),
            Block.createCuboidShape(0, 7, 17, 1, 12, 27),
            Block.createCuboidShape(0, 12, 16, 2, 13, 28)
    ).reduce((v1, v2) -> VoxelShapes.combineAndSimplify(v1, v2, BooleanBiFunction.OR)).get();
    private static final VoxelShape SHAPE_S = Stream.of(
            Block.createCuboidShape(0, 0, 15, 16, 16, 16),
            Block.createCuboidShape(0, 0, -16, 16, 16, -15),
            Block.createCuboidShape(0, 1, -15, 16, 7, 15),
            Block.createCuboidShape(1, 7, -15, 15, 8, 15),
            Block.createCuboidShape(3, 8, -14, 13, 9, -9),
            Block.createCuboidShape(15, 7, -11, 16, 12, -1),
            Block.createCuboidShape(14, 12, -12, 16, 13, 0)
    ).reduce((v1, v2) -> VoxelShapes.combineAndSimplify(v1, v2, BooleanBiFunction.OR)).get();
    private static final VoxelShape SHAPE_W = Stream.of(
            Block.createCuboidShape(0, 0, 0, 1, 16, 16),
            Block.createCuboidShape(31, 0, 0, 32, 16, 16),
            Block.createCuboidShape(1, 1, 0, 31, 7, 16),
            Block.createCuboidShape(1, 7, 1, 31, 8, 15),
            Block.createCuboidShape(25, 8, 3, 30, 9, 13),
            Block.createCuboidShape(17, 7, 15, 27, 12, 16),
            Block.createCuboidShape(16, 12, 14, 28, 13, 16)
    ).reduce((v1, v2) -> VoxelShapes.combineAndSimplify(v1, v2, BooleanBiFunction.OR)).get();
    private static final VoxelShape SHAPE_E = Stream.of(
            Block.createCuboidShape(15, 0, 0, 16, 16, 16),
            Block.createCuboidShape(-16, 0, 0, -15, 16, 16),
            Block.createCuboidShape(-15, 1, 0, 15, 7, 16),
            Block.createCuboidShape(-15, 7, 1, 15, 8, 15),
            Block.createCuboidShape(-14, 8, 3, -9, 9, 13),
            Block.createCuboidShape(-11, 7, 0, -1, 12, 1),
            Block.createCuboidShape(-12, 12, 0, 0, 13, 2)
    ).reduce((v1, v2) -> VoxelShapes.combineAndSimplify(v1, v2, BooleanBiFunction.OR)).get();

    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return switch (state.get(FACING)) {
            case SOUTH -> SHAPE_S;
            case WEST -> SHAPE_W;
            case EAST -> SHAPE_E;
            default -> SHAPE_N;
        };
    }
}
