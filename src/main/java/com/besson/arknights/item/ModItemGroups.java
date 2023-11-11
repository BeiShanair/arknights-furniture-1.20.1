package com.besson.arknights.item;

import com.besson.arknights.ArknightsFurniture;
import com.besson.arknights.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup LOGO_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(ArknightsFurniture.MOD_ID,"logo"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.logo"))
                    .icon(() -> new ItemStack(ModItems.RHODES_ISLAND_LOGO)).entries((displayContext, entries) ->{
                        entries.add(ModItems.RHODES_ISLAND_LOGO);
    }).build());
    public static final ItemGroup FREIGHT_WAREHOUSE = Registry.register(Registries.ITEM_GROUP,
            new Identifier(ArknightsFurniture.MOD_ID,"freight_warehouse"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.freight_warehouse"))
                    .icon(() -> new ItemStack(ModBlocks.CARDBOARD_BOX)).entries((displayContext, entries) ->{
                        entries.add(ModBlocks.CARDBOARD_BOX);
                        entries.add(ModBlocks.CARGO_PAD);
                        entries.add(ModBlocks.CARTON_STOOL);
                        entries.add(ModBlocks.FREIGHT_CARTS);
                        entries.add(ModBlocks.LARGE_SHELVES1);
                        entries.add(ModBlocks.LARGE_SHELVES2);
                        entries.add(ModBlocks.LARGE_SHELVES3);
                        entries.add(ModBlocks.LARGE_SHELVES4);
                        entries.add(ModBlocks.MANY_CARDBOARD_BOXES);
                        entries.add(ModBlocks.PORTABLE_CALCULATOR);
                        entries.add(ModBlocks.PRACTICAL_AIR_CUSHION);
                        entries.add(ModBlocks.QUICK_POSTIT_NOTES);
                        entries.add(ModBlocks.SHIFT_ATTENDANCE_BOARD);
                        entries.add(ModBlocks.STREET_GRAFFITI);
                    }).build());
    public static final ItemGroup EDGE_SOLID_ORANGE_SIMPLE_HOME = Registry.register(Registries.ITEM_GROUP,
            new Identifier(ArknightsFurniture.MOD_ID,"edge_solid_simple_home"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.edge_solid_orange_simple_home"))
                    .icon(() -> new ItemStack(ModBlocks.BLACK_MINIMALIST_CLOCK)).entries((displayContext, entries) -> {
                        entries.add(ModBlocks.BLACK_MINIMALIST_CLOCK);
                        entries.add(ModBlocks.BLACK_MINIMALIST_DESK_LEFT);
                        entries.add(ModBlocks.BLACK_MINIMALIST_DESK_RIGHT);
                        entries.add(ModBlocks.BLACK_ROLLER_BACKREST);
                        entries.add(ModBlocks.BLACK_TABLE_CABINET);
                        entries.add(ModBlocks.CLEAR_BLACK_TV);
                        entries.add(ModBlocks.MINI_BULLETIN_BOARD);
                        entries.add(ModBlocks.PORCELAIN_BED);
                        entries.add(ModBlocks.PORCELAIN_BEDSIDE_TABLE);
                        entries.add(ModBlocks.PORCELAIN_WALL_LAMP);
                        entries.add(ModBlocks.SOLID_CHECKERBOARD_BOOKCASE1);
                        entries.add(ModBlocks.SOLID_CHECKERBOARD_BOOKCASE2);
                        entries.add(ModBlocks.SOLID_CHECKERBOARD_BOOKCASE3);
                        entries.add(ModBlocks.SOLID_COLOR_SOFA_DEFAULT);
                        entries.add(ModBlocks.SOLID_RIGHT_ANGLE_COFFEE_TABLE);
                        entries.add(ModBlocks.CLEAR_ORANGE_TV);
                        entries.add(ModBlocks.MINI_BULLETIN_BOARD2);
                        entries.add(ModBlocks.ORANGE_BED);
                        entries.add(ModBlocks.ORANGE_BEDSIDE_TABLE);
                        entries.add(ModBlocks.ORANGE_CHECKERBOARD_BOOKCASE_1);
                        entries.add(ModBlocks.ORANGE_CHECKERBOARD_BOOKCASE_2);
                        entries.add(ModBlocks.ORANGE_CHECKERBOARD_BOOKCASE_3);
                        entries.add(ModBlocks.ORANGE_COLOR_SOFA_DEFAULT);
                        entries.add(ModBlocks.ORANGE_MINIMALIST_CLOCK);
                        entries.add(ModBlocks.ORANGE_MINIMALIST_DESK_LEFT);
                        entries.add(ModBlocks.ORANGE_MINIMALIST_DESK_RIGHT);
                        entries.add(ModBlocks.ORANGE_RIGHT_ANGLE_COFFEE_TABLE);
                        entries.add(ModBlocks.ORANGE_ROLLER_BACKREST);
                        entries.add(ModBlocks.ORANGE_WALL_LAMP);
                        entries.add(ModBlocks.ORANGE_TABLE_CABINET);
                    }).build());
    public static void registerItemGroup(){
        ArknightsFurniture.LOGGER.info("Registering Item Groups for" + ArknightsFurniture.MOD_ID);
    }
}
