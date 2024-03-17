package com.besson.arknights.block.SpecialEquipmentExhibitionRoom;

import com.besson.arknights.block.FurnitureHorizontalFacingBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.ShapeContext;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;

public class EmergencyLighting extends FurnitureHorizontalFacingBlock {
    public static final VoxelShape SHAPE_N = Block.createCuboidShape(4, 3, 15, 12, 10, 16);

    public static final VoxelShape SHAPE_W = Block.createCuboidShape(15, 3, 4, 16, 10, 12);

    public static final VoxelShape SHAPE_S = Block.createCuboidShape(4, 3, 0, 12, 10, 1);

    public static final VoxelShape SHAPE_E = Block.createCuboidShape(0, 3, 4, 1, 10, 12);

    public EmergencyLighting(Settings settings) {
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
