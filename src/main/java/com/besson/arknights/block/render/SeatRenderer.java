package com.besson.arknights.block.render;

import com.besson.arknights.entity.SeatEntity;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.EntityRenderer;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class SeatRenderer extends EntityRenderer<SeatEntity> {
    public SeatRenderer(EntityRendererFactory.Context ctx) {
        super(ctx);
    }

    @Override
    public Identifier getTexture(SeatEntity entity) {
        return null;
    }

    @Override
    protected void renderLabelIfPresent(SeatEntity entity, Text text, MatrixStack matrices, VertexConsumerProvider vertexConsumers, int light) {}
}
