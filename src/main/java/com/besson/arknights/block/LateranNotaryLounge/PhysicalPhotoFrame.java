package com.besson.arknights.block.LateranNotaryLounge;

import com.besson.arknights.block.FurnitureHorizontalFacingBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.ShapeContext;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;

public class PhysicalPhotoFrame extends FurnitureHorizontalFacingBlock {
    public static final VoxelShape SHAPE_N = Block.createCuboidShape(4, 3, 15, 12, 13, 16);

    public static final VoxelShape SHAPE_W = Block.createCuboidShape(15, 3, 4, 16, 13, 12);

    public static final VoxelShape SHAPE_S = Block.createCuboidShape(4, 3, 0, 12, 13, 1);

    public static final VoxelShape SHAPE_E = Block.createCuboidShape(0, 3, 4, 1, 13, 12);

    public PhysicalPhotoFrame(Settings settings) {
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
