package com.besson.arknights.block.LenasRestingPlace;

import com.besson.arknights.block.FurnitureHorizontalFacingBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.ShapeContext;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;

public class PetNest extends FurnitureHorizontalFacingBlock {
    public static final VoxelShape SHAPE_N = Block.createCuboidShape(1, 0, 3, 15, 11, 15);

    public static final VoxelShape SHAPE_W = Block.createCuboidShape(3, 0, 1, 15, 11, 15);

    public static final VoxelShape SHAPE_S = Block.createCuboidShape(1, 0, 1, 15, 11, 13);

    public static final VoxelShape SHAPE_E = Block.createCuboidShape(1, 0, 1, 13, 11, 15);

    public PetNest(Settings settings) {
        super(settings);
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
