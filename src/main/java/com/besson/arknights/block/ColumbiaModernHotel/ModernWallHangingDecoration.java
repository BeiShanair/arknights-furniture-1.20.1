package com.besson.arknights.block.ColumbiaModernHotel;

import com.besson.arknights.block.FurnitureHorizontalFacingBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.ShapeContext;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;

public class ModernWallHangingDecoration extends FurnitureHorizontalFacingBlock {
    public ModernWallHangingDecoration(Settings settings) {
        super(settings);
    }

    private static final VoxelShape SHAPE_N = Block.createCuboidShape(2, 2, 15, 14, 16, 16);
    private static final VoxelShape SHAPE_W = Block.createCuboidShape(15, 2, 2, 16, 16, 14);
    private static final VoxelShape SHAPE_S = Block.createCuboidShape(2, 2, 0, 14, 16, 1);
    private static final VoxelShape SHAPE_E = Block.createCuboidShape(0, 2, 2, 1, 16, 14);

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
