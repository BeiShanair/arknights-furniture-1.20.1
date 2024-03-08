package com.besson.arknights.block.SevenCitiesStyleRestaurant;

import com.besson.arknights.block.FurnitureHorizontalFacingBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.ShapeContext;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;

public class SevenCityStyleWarmLightChandelier extends FurnitureHorizontalFacingBlock {
    public SevenCityStyleWarmLightChandelier(Settings settings) {
        super(settings.luminance(state -> 15));
    }

    private static final VoxelShape SHAPE_NS = Block.createCuboidShape(-0.5, 2, 5, 16.5, 16, 11);
    private static final VoxelShape SHAPE_WE = Block.createCuboidShape(5, 2, -0.5, 11, 16, 16.5);

    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return switch (state.get(FACING)){
            case WEST,EAST -> SHAPE_WE;
            default -> SHAPE_NS;
        };
    }
}
