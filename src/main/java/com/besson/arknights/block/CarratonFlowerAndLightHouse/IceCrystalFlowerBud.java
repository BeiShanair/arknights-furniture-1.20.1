package com.besson.arknights.block.CarratonFlowerAndLightHouse;

import com.besson.arknights.block.FurnitureHorizontalFacingBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.ShapeContext;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;

public class IceCrystalFlowerBud extends FurnitureHorizontalFacingBlock {
    public static final VoxelShape SHAPE_N = Block.createCuboidShape(4.5, 2, 6.5, 13.5, 16, 9.5);

    public static final VoxelShape SHAPE_W = Block.createCuboidShape(6.5, 2, 2.5, 9.5, 16, 11.5);

    public static final VoxelShape SHAPE_S = Block.createCuboidShape(2.5, 2, 6.5, 11.5, 16, 9.5);

    public static final VoxelShape SHAPE_E = Block.createCuboidShape(6.5, 2, 4.5, 9.5, 16, 13.5);

    public IceCrystalFlowerBud(Settings settings) {
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
