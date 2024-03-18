package com.besson.arknights.block.OfficeoftheFirstAidExpertGroup;

import com.besson.arknights.block.FurnitureHorizontalFacingBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.ShapeContext;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;

public class ScrollScreen extends FurnitureHorizontalFacingBlock {
    public static final VoxelShape SHAPE_N = Block.createCuboidShape(-16, 3, 14, 32, 29, 16);

    public static final VoxelShape SHAPE_W = Block.createCuboidShape(14, 3, -16, 16, 29, 32);

    public static final VoxelShape SHAPE_S = Block.createCuboidShape(-16, 3, 0, 32, 29, 2);

    public static final VoxelShape SHAPE_E = Block.createCuboidShape(0, 3, -16, 2, 29, 32);

    public ScrollScreen(Settings settings) {
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
