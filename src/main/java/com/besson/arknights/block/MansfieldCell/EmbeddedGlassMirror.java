package com.besson.arknights.block.MansfieldCell;

import com.besson.arknights.block.FurnitureHorizontalFacingBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.ShapeContext;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;

public class EmbeddedGlassMirror extends FurnitureHorizontalFacingBlock {
    public static final VoxelShape SHAPE_N = Block.createCuboidShape(3, 2, 14, 13, 14, 16);

    public static final VoxelShape SHAPE_W = Block.createCuboidShape(14, 2, 3, 16, 14, 13);

    public static final VoxelShape SHAPE_S = Block.createCuboidShape(3, 2, 0, 13, 14, 2);

    public static final VoxelShape SHAPE_E = Block.createCuboidShape(0, 2, 3, 2, 14, 13);

    public EmbeddedGlassMirror(Settings settings) {
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
