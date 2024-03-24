package com.besson.arknights.block.WhereTheMercenariesAreStaying;

import com.besson.arknights.block.FurnitureHorizontalFacingBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.ShapeContext;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;

public class BasementWallLights extends FurnitureHorizontalFacingBlock {
    public static final VoxelShape SHAPE_N = Block.createCuboidShape(3, 0, 13, 13, 17, 16);

    public static final VoxelShape SHAPE_W = Block.createCuboidShape(13, 0, 3, 16, 17, 13);

    public static final VoxelShape SHAPE_S = Block.createCuboidShape(3, 0, 0, 13, 17, 3);

    public static final VoxelShape SHAPE_E = Block.createCuboidShape(0, 0, 3, 3, 17, 13);

    public BasementWallLights(Settings settings) {
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
