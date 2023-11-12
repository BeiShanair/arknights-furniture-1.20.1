package com.besson.arknights.block.IllusionaryBiography;

import com.besson.arknights.block.FurnitureHorizontalFacingBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.ShapeContext;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;

public class EmbeddedWideCeilingLight extends FurnitureHorizontalFacingBlock {
    public EmbeddedWideCeilingLight(Settings settings) {
        super(settings.luminance(state -> 15));
    }

    private static final VoxelShape SHAPE_NS = Block.createCuboidShape(-8, 15, 0, 24, 16, 16);
    private static final VoxelShape SHAPE_WE = Block.createCuboidShape(0, 15, -8, 16, 16, 24);
    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return switch (state.get(FACING)) {
            case EAST, WEST -> SHAPE_WE;
            default -> SHAPE_NS;
        };
    }
}
