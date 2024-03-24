package com.besson.arknights.block.WhereTheMercenariesAreStaying;

import com.besson.arknights.block.FurnitureHorizontalFacingBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.ShapeContext;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;

public class WorkAreaWallStoragePanel extends FurnitureHorizontalFacingBlock {
    public static final VoxelShape SHAPE_N = Block.createCuboidShape(-1, 0, 15, 17, 22, 16);

    public static final VoxelShape SHAPE_W = Block.createCuboidShape(15, 0, -1, 16, 22, 17);

    public static final VoxelShape SHAPE_S = Block.createCuboidShape(-1, 0, 0, 17, 22, 1);

    public static final VoxelShape SHAPE_E = Block.createCuboidShape(0, 0, -1, 1, 22, 17);
    public WorkAreaWallStoragePanel(Settings settings) {
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
