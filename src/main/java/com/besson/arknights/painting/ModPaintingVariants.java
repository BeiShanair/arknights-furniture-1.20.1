package com.besson.arknights.painting;

import com.besson.arknights.ArknightsFurniture;
import net.minecraft.entity.decoration.painting.PaintingVariant;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModPaintingVariants {
    public static final PaintingVariant UBS = registerPaintingVariant("unconfirmed_biological_skeleton",
            new PaintingVariant(16,32));
    public static final PaintingVariant UBSC1 = registerPaintingVariant("unknown_biological_specimen_collection1",
            new PaintingVariant(32,16));
    public static final PaintingVariant UBSC2 = registerPaintingVariant("unknown_biological_specimen_collection2",
            new PaintingVariant(16,16));
    private static PaintingVariant registerPaintingVariant(String name, PaintingVariant paintingVariant){
        return Registry.register(Registries.PAINTING_VARIANT,new Identifier(ArknightsFurniture.MOD_ID,name),paintingVariant);
    }
    public static void registerModPaintings() {
    }
}
