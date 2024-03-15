package com.besson.arknights.block.UrsasStudentLounge;

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


public class LowFloorLamp extends FurnitureHorizontalFacingBlock {
    public static final VoxelShape SHAPE = Stream.of(
            Block.createCuboidShape(6, 0, 6, 10, 1, 10),
            Block.createCuboidShape(7.5, 1, 7.5, 8.5, 23, 8.5),
            Block.createCuboidShape(3.5, 18, 3.5, 12.5, 24, 12.5)
    ).reduce((v1, v2) -> VoxelShapes.combineAndSimplify(v1, v2, BooleanBiFunction.OR)).get();
    public LowFloorLamp(Settings settings) {
        super(settings.luminance(state -> 15));
    }

    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return SHAPE;
    }
}
