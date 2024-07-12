package com.besson.arknights.datagen;

import com.besson.arknights.block.ModBlocks;
import com.besson.arknights.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;

public class ModEnLangProvider extends FabricLanguageProvider {
    public ModEnLangProvider(FabricDataOutput dataOutput) {
        super(dataOutput, "en_us");
    }

    @Override
    public void generateTranslations(TranslationBuilder translationBuilder) {
        translationBuilder.add(ModItems.COIN_FURN, "Coin Furn");
        translationBuilder.add(ModItems.CARDBOARD, "Cardboard");

        translationBuilder.add(ModItems.RHODES_ISLAND_LOGO, "Rhodes Island Logo");

        translationBuilder.add(ModBlocks.CARDBOARD_BOX, "Cardboard Box");
        translationBuilder.add(ModBlocks.CARGO_PAD, "Cargo Pad");
        translationBuilder.add(ModBlocks.CARTON_STOOL, "Carton Stool");
        translationBuilder.add(ModBlocks.FREIGHT_CARTS, "Freight Carts");
        translationBuilder.add(ModBlocks.LARGE_SHELVES1, "Large Shelves 1");
        translationBuilder.add(ModBlocks.LARGE_SHELVES2, "Large Shelves 2");
        translationBuilder.add(ModBlocks.LARGE_SHELVES3, "Large Shelves 3");
        translationBuilder.add(ModBlocks.LARGE_SHELVES4, "Large Shelves 4");
        translationBuilder.add(ModBlocks.MANY_CARDBOARD_BOXES, "Many Cardboard Boxes");
        translationBuilder.add(ModBlocks.PORTABLE_CALCULATOR, "Portable Calculator");
        translationBuilder.add(ModBlocks.PRACTICAL_AIR_CUSHION, "Practical Air Cushion");
        translationBuilder.add(ModBlocks.QUICK_POSTIT_NOTES, "Quick Post-it Notes");
        translationBuilder.add(ModBlocks.SHIFT_ATTENDANCE_BOARD, "Shift Attendance Board");
        translationBuilder.add(ModBlocks.STREET_GRAFFITI, "Street Graffiti");

        translationBuilder.add("itemGroup.logo", "Logo");
        translationBuilder.add("itemGroup.material", "Material");
    }
}
