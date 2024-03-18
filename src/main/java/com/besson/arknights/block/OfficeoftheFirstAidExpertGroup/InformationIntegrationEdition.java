package com.besson.arknights.block.OfficeoftheFirstAidExpertGroup;

import com.besson.arknights.block.FurnitureHorizontalFacingBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.ShapeContext;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;

public class InformationIntegrationEdition extends FurnitureHorizontalFacingBlock {
    public static final VoxelShape SHAPE_N = Block.createCuboidShape(-16, 4, 15, 32, 28, 16);

    public static final VoxelShape SHAPE_W = Block.createCuboidShape(15, 4, -16, 16, 28, 32);

    public static final VoxelShape SHAPE_S = Block.createCuboidShape(-16, 4, 0, 32, 28, 1);

    public static final VoxelShape SHAPE_E = Block.createCuboidShape(0, 4, -16, 1, 28, 32);

    public InformationIntegrationEdition(Settings settings) {
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
