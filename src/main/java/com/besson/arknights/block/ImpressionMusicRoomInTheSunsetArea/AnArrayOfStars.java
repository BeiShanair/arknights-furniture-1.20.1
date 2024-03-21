package com.besson.arknights.block.ImpressionMusicRoomInTheSunsetArea;

import com.besson.arknights.block.FurnitureHorizontalFacingBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.ShapeContext;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;

public class AnArrayOfStars extends FurnitureHorizontalFacingBlock {

    public static final VoxelShape SHAPE_NS = Block.createCuboidShape(-8, 6, 6.5, 24, 16, 9.5);

    public static final VoxelShape SHAPE_WE = Block.createCuboidShape(6.5, 6, -8, 9.5, 16, 24);
    public AnArrayOfStars(Settings settings) {
        super(settings);
    }

    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return switch (state.get(FACING)){
            case EAST, WEST -> SHAPE_WE;
            default -> SHAPE_NS;
        };
    }
}
