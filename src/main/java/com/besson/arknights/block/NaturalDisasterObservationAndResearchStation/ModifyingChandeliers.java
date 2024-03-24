package com.besson.arknights.block.NaturalDisasterObservationAndResearchStation;

import com.besson.arknights.block.FurnitureHorizontalFacingBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.ShapeContext;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;

public class ModifyingChandeliers extends FurnitureHorizontalFacingBlock {
    public static final VoxelShape SHAPE_N = Block.createCuboidShape(4, 2, 0, 12, 16, 32);

    public static final VoxelShape SHAPE_W = Block.createCuboidShape(0, 2, 4, 32, 16, 12);

    public static final VoxelShape SHAPE_S = Block.createCuboidShape(4, 2, -16, 12, 16, 16);

    public static final VoxelShape SHAPE_E = Block.createCuboidShape(-16, 2, 4, 16, 16, 12);

    public ModifyingChandeliers(Settings settings) {
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
