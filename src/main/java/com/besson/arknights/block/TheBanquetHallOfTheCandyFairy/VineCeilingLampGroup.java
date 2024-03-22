package com.besson.arknights.block.TheBanquetHallOfTheCandyFairy;

import com.besson.arknights.block.FurnitureHorizontalFacingBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.ShapeContext;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;

public class VineCeilingLampGroup extends FurnitureHorizontalFacingBlock {
    public static final VoxelShape SHAPE_N = Block.createCuboidShape(-11, 9, 3, 27, 16, 7);

    public static final VoxelShape SHAPE_W = Block.createCuboidShape(3, 9, -11, 7, 16, 27);

    public static final VoxelShape SHAPE_S = Block.createCuboidShape(-11, 9, 9, 27, 16, 13);

    public static final VoxelShape SHAPE_E = Block.createCuboidShape(9, 9, -11, 13, 16, 27);

    public VineCeilingLampGroup(Settings settings) {
        super(settings.luminance(state -> 15));
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
