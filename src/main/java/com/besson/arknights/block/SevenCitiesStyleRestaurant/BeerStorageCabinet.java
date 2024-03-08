package com.besson.arknights.block.SevenCitiesStyleRestaurant;

import com.besson.arknights.block.FurnitureHorizontalFacingBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.ShapeContext;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;

public class BeerStorageCabinet extends FurnitureHorizontalFacingBlock {
    public BeerStorageCabinet(Settings settings) {
        super(settings);
    }

    private static final VoxelShape SHAPE_N = Block.createCuboidShape(0, 0, 4, 16, 24, 13);
    private static final VoxelShape SHAPE_W = Block.createCuboidShape(4, 0, 0, 13, 24, 16);
    private static final VoxelShape SHAPE_S = Block.createCuboidShape(0, 0, 3, 16, 24, 12);
    private static final VoxelShape SHAPE_E = Block.createCuboidShape(3, 0, 0, 12, 24, 16);

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
