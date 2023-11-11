package com.besson.arknights.item;

import com.besson.arknights.ArknightsFurniture;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.impl.itemgroup.FabricItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item RHODES_ISLAND_LOGO = registerItem("rhodes_island_logo",new Item(new FabricItemSettings()));
    private static void addItemsToIngredientTabItemGroup(FabricItemGroupEntries entries){

    }
    private static Item registerItem(String name,Item item){
        return Registry.register(Registries.ITEM,new Identifier(ArknightsFurniture.MOD_ID,name),item);
    }
    public static void registerModItems(){
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToIngredientTabItemGroup);
        ArknightsFurniture.LOGGER.info("Registering Mod Items for"+ ArknightsFurniture.MOD_ID);
    }
}
