package com.besson.arknights.block.RhodeIslandModernMusicRehearsalRoom;

import com.besson.arknights.block.FurnitureHorizontalFacingBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.ShapeContext;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;

public class SpotlightCeiling extends FurnitureHorizontalFacingBlock {
    public SpotlightCeiling(Settings settings) {
        super(settings.luminance(state -> 15));
    }

    private static final VoxelShape SHAPE_N = Block.createCuboidShape(-16, 12, 0, 16, 16, 16);
    private static final VoxelShape SHAPE_W = Block.createCuboidShape(0, 12, 0, 16, 16, 32);
    private static final VoxelShape SHAPE_S = Block.createCuboidShape(0, 12, 0, 32, 16, 16);
    private static final VoxelShape SHAPE_E = Block.createCuboidShape(0, 12, -16, 16, 16, 16);

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
