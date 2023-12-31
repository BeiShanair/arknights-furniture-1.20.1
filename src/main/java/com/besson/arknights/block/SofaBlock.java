package com.besson.arknights.block;

import com.besson.arknights.entity.SeatEntity;
import net.minecraft.block.BlockState;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class SofaBlock extends ConnectableBlock {
    //此类为沙发类方块提供继承，此类继承ConnectableBlock
    protected SofaBlock(Settings settings) {
        super(settings);
    }
    @Override
    public ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit) {
        if (!world.isClient){
            return SeatEntity.create(world,pos,0.25,player,state.get(FACING));
        }
        return ActionResult.SUCCESS;
    }
}
