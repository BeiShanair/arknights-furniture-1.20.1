package com.besson.arknights.block.CourtOfJusticeOfSyracuse;

import com.besson.arknights.block.FurnitureHorizontalFacingBlock;
import com.besson.arknights.entity.SeatEntity;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.ShapeContext;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;

public class SpeakerSeat extends FurnitureHorizontalFacingBlock {
    public static final VoxelShape SHAPE_N = Block.createCuboidShape(-4, 0, 0, 20, 16, 20);

    public static final VoxelShape SHAPE_W = Block.createCuboidShape(0, 0, -4, 20, 16, 20);

    public static final VoxelShape SHAPE_S = Block.createCuboidShape(-4, 0, -4, 20, 16, 16);

    public static final VoxelShape SHAPE_E = Block.createCuboidShape(0, 0, 0, 24, 16, 20);

    public SpeakerSeat(Settings settings) {
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
    @Override
    public ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit) {
        if (!world.isClient){
            return SeatEntity.create(world,pos,0.4,player,state.get(FACING));
        }
        return ActionResult.SUCCESS;
    }
}
