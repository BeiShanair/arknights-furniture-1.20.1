package com.besson.arknights.block.ColumbiaCafe;

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

public class BolivarCoffeeBeans extends FurnitureHorizontalFacingBlock {
    public BolivarCoffeeBeans(Settings settings) {
        super(settings);
    }

    private static final VoxelShape SHAPE_N = Stream.of(
            Block.createCuboidShape(15, 0, 14, 16, 24, 16),
            Block.createCuboidShape(0, 0, 14, 1, 24, 16),
            Block.createCuboidShape(1, 0, 14, 15, 1, 16),
            Block.createCuboidShape(1, 23, 14, 15, 24, 16),
            Block.createCuboidShape(1, 1, 15, 15, 23, 16),
            Block.createCuboidShape(5, 1, 14, 15, 20, 15),
            Block.createCuboidShape(1, 1, 14, 5, 17, 15),
            Block.createCuboidShape(3, 9, 13.9, 13, 15, 13.9)
    ).reduce((v1, v2) -> VoxelShapes.combineAndSimplify(v1, v2, BooleanBiFunction.OR)).get();
    private static final VoxelShape SHAPE_W = Stream.of(
            Block.createCuboidShape(14, 0, 0, 16, 24, 1),
            Block.createCuboidShape(14, 0, 15, 16, 24, 16),
            Block.createCuboidShape(14, 0, 1, 16, 1, 15),
            Block.createCuboidShape(14, 23, 1, 16, 24, 15),
            Block.createCuboidShape(15, 1, 1, 16, 23, 15),
            Block.createCuboidShape(14, 1, 1, 15, 20, 11),
            Block.createCuboidShape(14, 1, 11, 15, 17, 15),
            Block.createCuboidShape(13.9, 9, 3, 13.9, 15, 13)
    ).reduce((v1, v2) -> VoxelShapes.combineAndSimplify(v1, v2, BooleanBiFunction.OR)).get();
    private static final VoxelShape SHAPE_S = Stream.of(
            Block.createCuboidShape(0, 0, 0, 1, 24, 2),
            Block.createCuboidShape(15, 0, 0, 16, 24, 2),
            Block.createCuboidShape(1, 0, 0, 15, 1, 2),
            Block.createCuboidShape(1, 23, 0, 15, 24, 2),
            Block.createCuboidShape(1, 1, 0, 15, 23, 1),
            Block.createCuboidShape(1, 1, 1, 11, 20, 2),
            Block.createCuboidShape(11, 1, 1, 15, 17, 2),
            Block.createCuboidShape(3, 9, 2, 13, 15, 2)
    ).reduce((v1, v2) -> VoxelShapes.combineAndSimplify(v1, v2, BooleanBiFunction.OR)).get();
    private static final VoxelShape SHAPE_E = Stream.of(
            Block.createCuboidShape(0, 0, 15, 2, 24, 16),
            Block.createCuboidShape(0, 0, 0, 2, 24, 1),
            Block.createCuboidShape(0, 0, 1, 2, 1, 15),
            Block.createCuboidShape(0, 23, 1, 2, 24, 15),
            Block.createCuboidShape(0, 1, 1, 1, 23, 15),
            Block.createCuboidShape(1, 1, 5, 2, 20, 15),
            Block.createCuboidShape(1, 1, 1, 2, 17, 5),
            Block.createCuboidShape(2, 9, 3, 2, 15, 13)
    ).reduce((v1, v2) -> VoxelShapes.combineAndSimplify(v1, v2, BooleanBiFunction.OR)).get();

    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return switch (state.get(FACING)){
            case WEST -> SHAPE_W;
            case SOUTH -> SHAPE_S;
            case EAST -> SHAPE_E;
            default -> SHAPE_N;
        };
    }
}
