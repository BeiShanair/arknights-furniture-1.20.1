package com.besson.arknights.block.NaturalDisasterObservationAndResearchStation;

import com.besson.arknights.block.FurnitureHorizontalFacingBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.ShapeContext;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;

public class SteamTable extends FurnitureHorizontalFacingBlock {
    public static final VoxelShape SHAPE_NS = Block.createCuboidShape(1, 0, 4, 15, 12, 12);

    public static final VoxelShape SHAPE_WE = Block.createCuboidShape(4, 0, 1, 12, 12, 15);

    public SteamTable(Settings settings) {
        super(settings);
    }

    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return switch (state.get(FACING)) {
            case WEST, EAST -> SHAPE_WE;
            default -> SHAPE_NS;
        };
    }
}
