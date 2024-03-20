package com.besson.arknights.block.LateranNotaryLounge;

import com.besson.arknights.block.FurnitureHorizontalFacingBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.ShapeContext;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;

public class DiamondSuspendedLamp extends FurnitureHorizontalFacingBlock {
    public static final VoxelShape SHAPE_N = Block.createCuboidShape(4.5, 2.5, 14, 11.5, 15.5, 16);

    public static final VoxelShape SHAPE_W = Block.createCuboidShape(14, 2.5, 4.5, 16, 15.5, 11.5);

    public static final VoxelShape SHAPE_S = Block.createCuboidShape(4.5, 2.5, 0, 11.5, 15.5, 2);

    public static final VoxelShape SHAPE_E = Block.createCuboidShape(0, 2.5, 4.5, 2, 15.5, 11.5);

    public DiamondSuspendedLamp(Settings settings) {
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
