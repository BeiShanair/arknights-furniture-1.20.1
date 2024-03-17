package com.besson.arknights.block.MansfieldCell;

import com.besson.arknights.block.FurnitureHorizontalFacingBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.ShapeContext;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;

public class SafetyInspectionEquipment extends FurnitureHorizontalFacingBlock {
    public static final VoxelShape SHAPE_N = Block.createCuboidShape(-7, 0, -2, 32, 29, 18);

    public static final VoxelShape SHAPE_W = Block.createCuboidShape(-2, 0, -16, 18, 29, 23);

    public static final VoxelShape SHAPE_S = Block.createCuboidShape(-16, 0, -2, 23, 29, 18);

    public static final VoxelShape SHAPE_E = Block.createCuboidShape(-2, 0, -7, 18, 29, 32);

    public SafetyInspectionEquipment(Settings settings) {
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
