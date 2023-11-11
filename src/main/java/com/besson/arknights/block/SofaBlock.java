package com.besson.arknights.block;

import com.besson.arknights.entity.SeatEntity;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.HorizontalFacingBlock;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.DirectionProperty;
import net.minecraft.state.property.EnumProperty;
import net.minecraft.state.property.Properties;
import net.minecraft.util.*;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.world.World;
import net.minecraft.world.WorldAccess;
import org.jetbrains.annotations.Nullable;

public class SofaBlock extends HorizontalFacingBlock {
    public static final DirectionProperty FACING = Properties.HORIZONTAL_FACING;
    public static final EnumProperty<Type> TYPE = EnumProperty.of("type", Type.class);
    protected SofaBlock(Settings settings) {
        super(settings);
        this.setDefaultState(this.getStateManager().getDefaultState().with(FACING,Direction.NORTH).with(TYPE,Type.SINGLE));
    }

    @Override
    public ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit) {
        if (!world.isClient){
            return SeatEntity.create(world,pos,0.25,player,state.get(FACING));
        }
        return ActionResult.SUCCESS;
    }
    @Override
    public BlockState getStateForNeighborUpdate(BlockState state, Direction direction, BlockState neighborState, WorldAccess world, BlockPos pos, BlockPos neighborPos) {
        return this.getSofaState(state,world,pos,state.get(FACING));
    }

    private BlockState getSofaState(BlockState state, WorldAccess worldAccess, BlockPos blockPos, Direction direction){
        boolean left = this.isSofa(worldAccess,blockPos,direction.rotateYCounterclockwise(),direction) || this.isSofa(worldAccess,blockPos,direction.rotateYCounterclockwise(),direction.rotateYCounterclockwise());
        boolean right = this.isSofa(worldAccess,blockPos,direction.rotateYClockwise(),direction) || this.isSofa(worldAccess,blockPos,direction.rotateYClockwise(),direction.rotateYClockwise());
        if (left && right){
            return state.with(TYPE, Type.MIDDLE);
        } else if (right) {
            return state.with(TYPE, Type.RIGHT);
        } else if (left) {
            return state.with(TYPE, Type.LEFT);
        }
        return state.with(TYPE, Type.SINGLE);
    }
    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        super.appendProperties(builder);
        builder.add(TYPE).add(FACING);
    }
    @Override
    public BlockState rotate(BlockState state, BlockRotation rotation) {
        return state.with(FACING,rotation.rotate(state.get(FACING)));
    }

    @Override
    public BlockState mirror(BlockState state, BlockMirror mirror) {
        return state.rotate(mirror.getRotation(state.get(FACING)));
    }
    private boolean isSofa(WorldAccess worldAccess, BlockPos blockPos, Direction direction1,Direction direction2){
        BlockState state = worldAccess.getBlockState(blockPos.offset(direction1));
        if (state.getBlock() == this){
            Direction sofaDirection = state.get(FACING);
            return sofaDirection.equals(direction2);
        }
        return false;
    }

    @Nullable
    @Override
    public BlockState getPlacementState(ItemPlacementContext ctx) {
        return this.getDefaultState().with(FACING,ctx.getHorizontalPlayerFacing().getOpposite());
    }
    public enum Type implements StringIdentifiable
    {
        SINGLE("single"),
        LEFT("left"),
        RIGHT("right"),
        MIDDLE("middle");

        private final String id;

        Type(String id)
        {
            this.id = id;
        }

        @Override
        public String asString()
        {
            return id;
        }


    }
}
