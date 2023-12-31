package com.besson.arknights.block;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.EnumProperty;
import net.minecraft.util.StringIdentifiable;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.world.WorldAccess;

public class ConnectableBlock extends FurnitureHorizontalFacingBlock{
    //此类为具有多状态的可连接方块提供继承方法
    public static final EnumProperty<Type> TYPE = EnumProperty.of("type", Type.class);
    protected ConnectableBlock(Settings settings) {
        super(settings);
        this.setDefaultState(this.getStateManager().getDefaultState().with(TYPE, Type.SINGLE));
    }
    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        super.appendProperties(builder);
        builder.add(TYPE);
    }
    @Override
    public BlockState getStateForNeighborUpdate(BlockState state, Direction direction, BlockState neighborState, WorldAccess world, BlockPos pos, BlockPos neighborPos) {
        return this.getRelatedBlockState(state,world,pos,state.get(FACING));
    }

    private BlockState getRelatedBlockState(BlockState state, WorldAccess worldAccess, BlockPos blockPos, Direction direction){
        boolean left = this.isRelatedBlock(worldAccess,blockPos,direction.rotateYCounterclockwise(),direction) || this.isRelatedBlock(worldAccess,blockPos,direction.rotateYCounterclockwise(),direction.rotateYCounterclockwise());
        boolean right = this.isRelatedBlock(worldAccess,blockPos,direction.rotateYClockwise(),direction) || this.isRelatedBlock(worldAccess,blockPos,direction.rotateYClockwise(),direction.rotateYClockwise());
        if (left && right){
            return state.with(TYPE, Type.MIDDLE);
        } else if (right) {
            return state.with(TYPE, Type.RIGHT);
        } else if (left) {
            return state.with(TYPE, Type.LEFT);
        }
        return state.with(TYPE, Type.SINGLE);
    }
    private boolean isRelatedBlock(WorldAccess worldAccess, BlockPos blockPos, Direction direction1,Direction direction2){
        BlockState state = worldAccess.getBlockState(blockPos.offset(direction1));
        if (state.getBlock() == this){
            Direction blockDirection = state.get(FACING);
            return blockDirection.equals(direction2);
        }
        return false;
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
