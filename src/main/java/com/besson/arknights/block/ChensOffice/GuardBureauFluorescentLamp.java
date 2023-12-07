package com.besson.arknights.block.ChensOffice;

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

public class GuardBureauFluorescentLamp extends FurnitureHorizontalFacingBlock {
    public GuardBureauFluorescentLamp(Settings settings) {
        super(settings.luminance(state -> 15));
    }

    private static final VoxelShape SHAPE_N = Stream.of(
            Block.createCuboidShape(0, 9.5, 5, 32, 10, 11),
            Block.createCuboidShape(2, 10, 7, 4, 16, 9),
            Block.createCuboidShape(1, 8.5, 6, 31, 9.5, 10),
            Block.createCuboidShape(28, 10, 7, 30, 16, 9)
    ).reduce((v1, v2) -> VoxelShapes.combineAndSimplify(v1, v2, BooleanBiFunction.OR)).get();
    private static final VoxelShape SHAPE_W = Stream.of(
            Block.createCuboidShape(5, 9.5, -16, 11, 10, 16),
            Block.createCuboidShape(7, 10, 12, 9, 16, 14),
            Block.createCuboidShape(6, 8.5, -15, 10, 9.5, 15),
            Block.createCuboidShape(7, 10, -14, 9, 16, -12)
    ).reduce((v1, v2) -> VoxelShapes.combineAndSimplify(v1, v2, BooleanBiFunction.OR)).get();
    private static final VoxelShape SHAPE_S = Stream.of(
            Block.createCuboidShape(-16, 9.5, 5, 16, 10, 11),
            Block.createCuboidShape(12, 10, 7, 14, 16, 9),
            Block.createCuboidShape(-15, 8.5, 6, 15, 9.5, 10),
            Block.createCuboidShape(-14, 10, 7, -12, 16, 9)
    ).reduce((v1, v2) -> VoxelShapes.combineAndSimplify(v1, v2, BooleanBiFunction.OR)).get();
    private static final VoxelShape SHAPE_E = Stream.of(
            Block.createCuboidShape(5, 9.5, 0, 11, 10, 32),
            Block.createCuboidShape(7, 10, 2, 9, 16, 4),
            Block.createCuboidShape(6, 8.5, 1, 10, 9.5, 31),
            Block.createCuboidShape(7, 10, 28, 9, 16, 30)
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
