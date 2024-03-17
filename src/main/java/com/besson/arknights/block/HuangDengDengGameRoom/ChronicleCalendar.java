package com.besson.arknights.block.HuangDengDengGameRoom;

import com.besson.arknights.block.FurnitureHorizontalFacingBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.ShapeContext;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;

public class ChronicleCalendar extends FurnitureHorizontalFacingBlock {
    public static final VoxelShape SHAPE_N = Block.createCuboidShape(2, 4, 15, 14, 13, 16);

    public static final VoxelShape SHAPE_W = Block.createCuboidShape(15, 4, 2, 16, 13, 14);

    public static final VoxelShape SHAPE_S = Block.createCuboidShape(2, 4, 0, 14, 13, 1);

    public static final VoxelShape SHAPE_E = Block.createCuboidShape(0, 4, 2, 1, 13, 14);

    public ChronicleCalendar(Settings settings) {
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
