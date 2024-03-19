package com.besson.arknights.block.KnightsoftheRedPineLounge;

import com.besson.arknights.block.FurnitureHorizontalFacingBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.ShapeContext;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;

public class CandlestickWallLamp extends FurnitureHorizontalFacingBlock {
    public static final VoxelShape SHAPE_N = Block.createCuboidShape(3, 1, 13, 13, 16, 16);

    public static final VoxelShape SHAPE_W = Block.createCuboidShape(13, 1, 3, 16, 16, 13);

    public static final VoxelShape SHAPE_S = Block.createCuboidShape(3, 1, 0, 13, 16, 3);

    public static final VoxelShape SHAPE_E = Block.createCuboidShape(0, 1, 3, 3, 16, 13);

    public CandlestickWallLamp(Settings settings) {
        super(settings.luminance(s -> 15));
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
