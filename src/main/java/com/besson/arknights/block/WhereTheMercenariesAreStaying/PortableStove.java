package com.besson.arknights.block.WhereTheMercenariesAreStaying;

import com.besson.arknights.block.FurnitureHorizontalFacingBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.ShapeContext;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;

public class PortableStove extends FurnitureHorizontalFacingBlock {
    public static final VoxelShape SHAPE_NS = Block.createCuboidShape(-1, 0, 1, 17, 21, 15);

    public static final VoxelShape SHAPE_WE = Block.createCuboidShape(1, 0, -1, 15, 21, 17);

    public PortableStove(Settings settings) {
        super(settings);
    }

    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return switch (state.get(FACING)){
            case WEST, EAST -> SHAPE_WE;
            default -> SHAPE_NS;
        };
    }
}
