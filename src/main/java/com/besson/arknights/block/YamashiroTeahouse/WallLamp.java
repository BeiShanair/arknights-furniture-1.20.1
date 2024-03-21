package com.besson.arknights.block.YamashiroTeahouse;

import com.besson.arknights.block.FurnitureHorizontalFacingBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.ShapeContext;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;

public class WallLamp extends FurnitureHorizontalFacingBlock {
    public static final VoxelShape SHAPE_N = Block.createCuboidShape(-16, 4, 14, 32, 12, 16);

    public static final VoxelShape SHAPE_W = Block.createCuboidShape(14, 4, -16, 16, 12, 32);

    public static final VoxelShape SHAPE_S = Block.createCuboidShape(-16, 4, 0, 32, 12, 2);

    public static final VoxelShape SHAPE_E = Block.createCuboidShape(0, 4, -16, 2, 12, 32);

    public WallLamp(Settings settings) {
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
