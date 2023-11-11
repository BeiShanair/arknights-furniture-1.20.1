package com.besson.arknights.block.FreightWarehouse;

import com.besson.arknights.block.FurnitureHorizontalFacingBlock;
import com.besson.arknights.entity.SeatEntity;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.ShapeContext;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.function.BooleanBiFunction;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;

import java.util.stream.Stream;

public class CartonStool extends FurnitureHorizontalFacingBlock {
    public CartonStool(Settings settings) {
        super(settings);
    }

    private static final VoxelShape SHAPE_NS = Stream.of(
            Block.createCuboidShape(-4, 3, 15, 20, 15, 16),
            Block.createCuboidShape(-4, 3, 0, 20, 15, 1),
            Block.createCuboidShape(-3, 0, 1, -1, 3, 3),
            Block.createCuboidShape(-3, 0, 13, -1, 3, 15),
            Block.createCuboidShape(17, 0, 1, 19, 3, 3),
            Block.createCuboidShape(17, 0, 13, 19, 3, 15),
            Block.createCuboidShape(-3, 3, 1, 19, 14, 15)
    ).reduce((v1, v2) -> VoxelShapes.combineAndSimplify(v1, v2, BooleanBiFunction.OR)).get();

    private static final VoxelShape SHAPE_WE = Stream.of(
            Block.createCuboidShape(0, 3, -4, 1, 15, 20),
            Block.createCuboidShape(15, 3, -4, 16, 15, 20),
            Block.createCuboidShape(13, 0, -3, 15, 3, -1),
            Block.createCuboidShape(1, 0, -3, 3, 3, -1),
            Block.createCuboidShape(13, 0, 17, 15, 3, 19),
            Block.createCuboidShape(1, 0, 17, 3, 3, 19),
            Block.createCuboidShape(1, 3, -3, 15, 14, 19)
    ).reduce((v1, v2) -> VoxelShapes.combineAndSimplify(v1, v2, BooleanBiFunction.OR)).get();

    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return switch (state.get(FACING)) {
            case EAST, WEST -> SHAPE_WE;
            default -> SHAPE_NS;
        };
    }

    @Override
    public ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit) {
        if (!world.isClient){
            return SeatEntity.create(world,pos,0.65,player,state.get(FACING));
        }
        return ActionResult.SUCCESS;
    }
}
