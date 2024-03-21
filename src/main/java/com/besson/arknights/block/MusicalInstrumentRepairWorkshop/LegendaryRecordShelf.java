package com.besson.arknights.block.MusicalInstrumentRepairWorkshop;

import com.besson.arknights.block.FurnitureHorizontalFacingBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.ShapeContext;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;

public class LegendaryRecordShelf extends FurnitureHorizontalFacingBlock {
    public static final VoxelShape SHAPE_N = Block.createCuboidShape(-10, 3, 13, 26, 16, 16);

    public static final VoxelShape SHAPE_W = Block.createCuboidShape(13, 3, -10, 16, 16, 26);

    public static final VoxelShape SHAPE_S = Block.createCuboidShape(-10, 3, 0, 26, 16, 3);

    public static final VoxelShape SHAPE_E = Block.createCuboidShape(0, 3, -10, 3, 16, 26);

    public LegendaryRecordShelf(Settings settings) {
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
