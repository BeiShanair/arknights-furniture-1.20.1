package com.besson.arknights.item;

import com.besson.arknights.ArknightsFurniture;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item RHODES_ISLAND_LOGO = registerItem("rhodes_island_logo",new Item(new Item.Settings()));
    public static final Item COIN_FURN = registerItem("coin_furn",new Item(new Item.Settings()));
    public static final Item CARDBOARD = registerItem("cardboard",new Item(new Item.Settings()));
    private static Item registerItem(String name,Item item){
        return Registry.register(Registries.ITEM,new Identifier(ArknightsFurniture.MOD_ID,name),item);
    }
    public static void registerModItems(){
        ArknightsFurniture.LOGGER.info("Registering Mod Items");
    }
}
