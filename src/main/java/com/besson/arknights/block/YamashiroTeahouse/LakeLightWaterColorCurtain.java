package com.besson.arknights.block.YamashiroTeahouse;

import com.besson.arknights.block.FurnitureHorizontalFacingBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.ShapeContext;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;

public class LakeLightWaterColorCurtain extends FurnitureHorizontalFacingBlock {
    public static final VoxelShape SHAPE_N = Block.createCuboidShape(-4, 0, 13, 20, 32, 16);

    public static final VoxelShape SHAPE_W = Block.createCuboidShape(13, 0, -4, 16, 32, 20);

    public static final VoxelShape SHAPE_S = Block.createCuboidShape(-4, 0, 0, 20, 32, 3);

    public static final VoxelShape SHAPE_E = Block.createCuboidShape(0, 0, -4, 3, 32, 20);

    public LakeLightWaterColorCurtain(Settings settings) {
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
