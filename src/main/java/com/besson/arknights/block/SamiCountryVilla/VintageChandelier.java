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

public class VintageChandelier extends FurnitureHorizontalFacingBlock {
    public VintageChandelier(Settings settings) {
        super(settings.luminance(state -> 15));
    }

    private static final VoxelShape SHAPE = Stream.of(
            Block.createCuboidShape(6, 1, 6, 10, 4, 10),
            Block.createCuboidShape(7, 4, 7, 9, 8, 9),
            Block.createCuboidShape(7.5, 8, 7.5, 8.5, 16, 8.5),
            Block.createCuboidShape(7, 0, 7, 9, 1, 9)
    ).reduce((v1, v2) -> VoxelShapes.combineAndSimplify(v1, v2, BooleanBiFunction.OR)).get();

    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return SHAPE;
    }
}
