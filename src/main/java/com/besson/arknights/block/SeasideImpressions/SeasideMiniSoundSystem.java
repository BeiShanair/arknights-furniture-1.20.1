package com.besson.arknights.block.SeasideImpressions;

import com.besson.arknights.block.FurnitureHorizontalFacingBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.ShapeContext;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;

public class SeasideMiniSoundSystem extends FurnitureHorizontalFacingBlock {
    public static final VoxelShape SHAPE = Block.createCuboidShape(2, 0, 2, 14, 14, 14);

    public SeasideMiniSoundSystem(Settings settings) {
        super(settings);
    }

    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return SHAPE;
    }
}
