package com.besson.arknights.block.TswinekCountryCamp;

import com.besson.arknights.block.FurnitureHorizontalFacingBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.ShapeContext;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;

public class WildernessMossAndStone extends FurnitureHorizontalFacingBlock {
    public static final VoxelShape SHAPE_N = Block.createCuboidShape(-3, 0, 2.5, 15, 20, 13.5);

    public static final VoxelShape SHAPE_W = Block.createCuboidShape(2.5, 0, 1, 13.5, 20, 19);

    public static final VoxelShape SHAPE_S = Block.createCuboidShape(1, 0, 2.5, 19, 20, 13.5);

    public static final VoxelShape SHAPE_E = Block.createCuboidShape(2.5, 0, -3, 13.5, 20, 15);

    public WildernessMossAndStone(Settings settings) {
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
