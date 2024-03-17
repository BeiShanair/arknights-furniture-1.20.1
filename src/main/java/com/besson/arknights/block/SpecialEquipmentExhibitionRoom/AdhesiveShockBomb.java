package com.besson.arknights.block.SpecialEquipmentExhibitionRoom;

import com.besson.arknights.block.FurnitureHorizontalFacingBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.ShapeContext;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;

public class AdhesiveShockBomb extends FurnitureHorizontalFacingBlock {
    public static final VoxelShape SHAPE_N = Block.createCuboidShape(5, 5, 6, 11, 11, 16);

    public static final VoxelShape SHAPE_W = Block.createCuboidShape(6, 5, 5, 16, 11, 11);

    public static final VoxelShape SHAPE_S = Block.createCuboidShape(5, 5, 0, 11, 11, 10);

    public static final VoxelShape SHAPE_E = Block.createCuboidShape(0, 5, 5, 10, 11, 11);

    public AdhesiveShockBomb(Settings settings) {
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
