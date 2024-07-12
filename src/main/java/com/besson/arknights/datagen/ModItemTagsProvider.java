package com.besson.arknights.datagen;

import com.besson.arknights.block.ModBlocks;
import com.besson.arknights.tag.ModBlockTags;
import com.besson.arknights.tag.ModItemTags;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModItemTagsProvider extends FabricTagProvider.ItemTagProvider {
    public ModItemTagsProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(output, completableFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup arg) {
        getOrCreateTagBuilder(ModItemTags.COIN_FURN5)
                .add(ModBlocks.CARDBOARD_BOX.asItem())
                .add(ModBlocks.CARGO_PAD.asItem())
                .add(ModBlocks.CARTON_STOOL.asItem())
                .add(ModBlocks.FREIGHT_CARTS.asItem())
                .add(ModBlocks.LARGE_SHELVES1.asItem())
                .add(ModBlocks.LARGE_SHELVES2.asItem())
                .add(ModBlocks.LARGE_SHELVES3.asItem())
                .add(ModBlocks.LARGE_SHELVES4.asItem())
                .add(ModBlocks.MANY_CARDBOARD_BOXES.asItem())
                .add(ModBlocks.PORTABLE_CALCULATOR.asItem())
                .add(ModBlocks.PRACTICAL_AIR_CUSHION.asItem())
                .add(ModBlocks.QUICK_POSTIT_NOTES.asItem())
                .add(ModBlocks.SHIFT_ATTENDANCE_BOARD.asItem())
                .add(ModBlocks.STREET_GRAFFITI.asItem());
    }
}
