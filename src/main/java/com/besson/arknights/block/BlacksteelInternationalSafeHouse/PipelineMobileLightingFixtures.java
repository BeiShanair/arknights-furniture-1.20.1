package com.besson.arknights.block.BlacksteelInternationalSafeHouse;

import com.besson.arknights.block.FurnitureHorizontalFacingBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.ShapeContext;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;

public class PipelineMobileLightingFixtures extends FurnitureHorizontalFacingBlock {
    public static final VoxelShape SHAPE_N = Block.createCuboidShape(0.5, 0, 14, 15.5, 32, 16);

    public static final VoxelShape SHAPE_W = Block.createCuboidShape(14, 0, 0.5, 16, 32, 15.5);

    public static final VoxelShape SHAPE_S = Block.createCuboidShape(0.5, 0, 0, 15.5, 32, 2);

    public static final VoxelShape SHAPE_E = Block.createCuboidShape(0, 0, 0.5, 2, 32, 15.5);

    public PipelineMobileLightingFixtures(Settings settings) {
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
