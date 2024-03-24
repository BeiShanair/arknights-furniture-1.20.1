package com.besson.arknights.block.ChillyRhythmExperienceHall;

import com.besson.arknights.block.FurnitureHorizontalFacingBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.ShapeContext;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;

public class SkiEquipmentStorageRack extends FurnitureHorizontalFacingBlock {
    public static final VoxelShape SHAPE_N = Block.createCuboidShape(0, 0, 2, 22, 28, 14);

    public static final VoxelShape SHAPE_W = Block.createCuboidShape(2, 0, -6, 14, 28, 16);

    public static final VoxelShape SHAPE_S = Block.createCuboidShape(-6, 0, 2, 16, 28, 14);

    public static final VoxelShape SHAPE_E = Block.createCuboidShape(2, 0, 0, 14, 28, 22);

    public SkiEquipmentStorageRack(Settings settings) {
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
