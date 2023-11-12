package com.besson.arknights.block.IllusionaryBiography;

import com.besson.arknights.block.FurnitureHorizontalFacingBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.ShapeContext;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;

public class EmbeddedSquareCeilingLight extends FurnitureHorizontalFacingBlock {
    public EmbeddedSquareCeilingLight(Settings settings) {
        super(settings.luminance(state -> 15));
    }

    private static final VoxelShape SHAPE = Block.createCuboidShape(-8, 15, -8, 24, 16, 24);

    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return SHAPE;
    }
}
