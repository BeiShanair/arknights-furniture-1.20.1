package com.besson.arknights.block.SpecialEquipmentExhibitionRoom;

import com.besson.arknights.block.FurnitureHorizontalFacingBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.ShapeContext;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;

public class MissileInterceptionSystem extends FurnitureHorizontalFacingBlock {
    public static final VoxelShape SHAPE_N = Block.createCuboidShape(0, 2, 13, 16, 14, 16);

    public static final VoxelShape SHAPE_W = Block.createCuboidShape(13, 2, 0, 16, 14, 16);

    public static final VoxelShape SHAPE_S = Block.createCuboidShape(0, 2, 0, 16, 14, 3);

    public static final VoxelShape SHAPE_E = Block.createCuboidShape(0, 2, 0, 3, 14, 16);

    public MissileInterceptionSystem(Settings settings) {
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
