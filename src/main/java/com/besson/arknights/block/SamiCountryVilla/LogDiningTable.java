package com.besson.arknights.block.SamiCountryVilla;

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

public class LogDiningTable extends FurnitureHorizontalFacingBlock {
    public LogDiningTable(Settings settings) {
        super(settings);
    }

    private static final VoxelShape SHAPE_N = Stream.of(
            Block.createCuboidShape(13, 0, 1, 15, 8, 3),
            Block.createCuboidShape(13, 0, 13, 15, 8, 15),
            Block.createCuboidShape(-15, 0, 1, -13, 8, 3),
            Block.createCuboidShape(-15, 0, 13, -13, 8, 15),
            Block.createCuboidShape(-16, 14, 0, 16, 16, 16),
            Block.createCuboidShape(-15, 8, 1, 15, 14, 15)
    ).reduce((v1, v2) -> VoxelShapes.combineAndSimplify(v1, v2, BooleanBiFunction.OR)).get();
    private static final VoxelShape SHAPE_W = Stream.of(
            Block.createCuboidShape(1, 0, 1, 3, 8, 3),
            Block.createCuboidShape(13, 0, 1, 15, 8, 3),
            Block.createCuboidShape(1, 0, 29, 3, 8, 31),
            Block.createCuboidShape(13, 0, 29, 15, 8, 31),
            Block.createCuboidShape(0, 14, 0, 16, 16, 32),
            Block.createCuboidShape(1, 8, 1, 15, 14, 31)
    ).reduce((v1, v2) -> VoxelShapes.combineAndSimplify(v1, v2, BooleanBiFunction.OR)).get();
    private static final VoxelShape SHAPE_S = Stream.of(
            Block.createCuboidShape(1, 0, 13, 3, 8, 15),
            Block.createCuboidShape(1, 0, 1, 3, 8, 3),
            Block.createCuboidShape(29, 0, 13, 31, 8, 15),
            Block.createCuboidShape(29, 0, 1, 31, 8, 3),
            Block.createCuboidShape(0, 14, 0, 32, 16, 16),
            Block.createCuboidShape(1, 8, 1, 31, 14, 15)
    ).reduce((v1, v2) -> VoxelShapes.combineAndSimplify(v1, v2, BooleanBiFunction.OR)).get();
    private static final VoxelShape SHAPE_E = Stream.of(
            Block.createCuboidShape(13, 0, 13, 15, 8, 15),
            Block.createCuboidShape(1, 0, 13, 3, 8, 15),
            Block.createCuboidShape(13, 0, -15, 15, 8, -13),
            Block.createCuboidShape(1, 0, -15, 3, 8, -13),
            Block.createCuboidShape(0, 14, -16, 16, 16, 16),
            Block.createCuboidShape(1, 8, -15, 15, 14, 15)
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
