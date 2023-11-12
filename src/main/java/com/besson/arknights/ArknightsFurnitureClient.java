package com.besson.arknights;

import com.besson.arknights.block.ModBlocks;
import com.besson.arknights.block.render.SeatRenderer;
import com.besson.arknights.entity.ModEntities;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.minecraft.client.render.RenderLayer;

public class ArknightsFurnitureClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.STREET_GRAFFITI, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.CONIFEROUS_POTTED_PLANT, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.ECOLOGICAL_EXHIBITION_CABINET_MAIN, RenderLayer.getCutout());
        EntityRendererRegistry.register(ModEntities.SEAT, SeatRenderer::new);
    }
}
