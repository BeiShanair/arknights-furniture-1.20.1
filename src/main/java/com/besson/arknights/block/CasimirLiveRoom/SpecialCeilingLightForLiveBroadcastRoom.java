package com.besson.arknights.block.CasimirLiveRoom;

import com.besson.arknights.block.FurnitureHorizontalFacingBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.ShapeContext;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;

public class SpecialCeilingLightForLiveBroadcastRoom extends FurnitureHorizontalFacingBlock {
    public static final VoxelShape SHAPE_NS = Block.createCuboidShape(-16, 15, 1, 32, 16, 15);

    public static final VoxelShape SHAPE_WE = Block.createCuboidShape(1, 15, -16, 15, 16, 32);

    public SpecialCeilingLightForLiveBroadcastRoom(Settings settings) {
        super(settings.luminance(s -> 15));
    }

    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return switch (state.get(FACING)){
            case EAST, WEST -> SHAPE_WE;
            default -> SHAPE_NS;
        };
    }
}
