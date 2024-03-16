package com.besson.arknights.block.RhodeIslandOfficeofPersonnel;

import com.besson.arknights.block.FurnitureHorizontalFacingBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.ShapeContext;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;


public class PersonnelOfficeLightSource extends FurnitureHorizontalFacingBlock {
    public static final VoxelShape SHAPE_NS = Block.createCuboidShape(0, 12, 7, 16, 16, 9);

    public static final VoxelShape SHAPE_WE = Block.createCuboidShape(7, 12, 0, 9, 16, 16);
    public PersonnelOfficeLightSource(Settings settings) {
        super(settings.luminance(state -> 15));
    }

    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return switch (state.get(FACING)){
            case EAST, WEST -> SHAPE_WE;
            default -> SHAPE_NS;
        };
    }
}
