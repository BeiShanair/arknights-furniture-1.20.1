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
    public static final ItemGroup ILLUSIONARY_BIOGRAPHY = Registry.register(Registries.ITEM_GROUP,
            new Identifier(ArknightsFurniture.MOD_ID,"illusionary_biography"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.illusionary_biography"))
                    .icon(() -> new ItemStack(ModBlocks.BASKET_SHAPED_LOW_COFFEE_TABLE)).entries((displayContext, entries) -> {
                        entries.add(ModBlocks.BASKET_SHAPED_LOW_COFFEE_TABLE);
                        entries.add(ModBlocks.BROAD_LEAVED_POTTED_PLANTS);
                        entries.add(ModBlocks.BROWN_LAZY_SOFA);
                        entries.add(ModBlocks.CONIFEROUS_POTTED_PLANT);
                        entries.add(ModBlocks.ECOLOGICAL_EXHIBITION_CABINET_BASE);
                        entries.add(ModBlocks.ECOLOGICAL_EXHIBITION_CABINET_MAIN);
                        entries.add(ModBlocks.EMBEDDED_SQUARE_CEILING_LIGHT);
                        entries.add(ModBlocks.EMBEDDED_WIDE_CEILING_LIGHT);
                        entries.add(ModBlocks.EXHIBITION_SPECIMEN_INFORMATION_BOARD);
                        entries.add(ModBlocks.METAL_BED);
                        entries.add(ModBlocks.SQUARE_BEDSIDE_CABINET);
                        entries.add(ModBlocks.THICK_LEAVED_POTTED_PLANT);
                    }).build());
    public static final ItemGroup LIFE_CYCLE_MODULE_12 = Registry.register(Registries.ITEM_GROUP,
            new Identifier(ArknightsFurniture.MOD_ID,"life_cycle_module_12"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.life_cycle_module_12"))
                    .icon(() -> new ItemStack(ModBlocks.LIFE_CYCLE_MODULE_CONTROL_CONSOLE)).entries((displayContext, entries) -> {
                        entries.add(ModBlocks.CABIN_CEILING_COMPONENTS);
                        entries.add(ModBlocks.CABIN_COMBINATION_DOUBLE_BED);
                        entries.add(ModBlocks.CABIN_FIRE_EXTINGUISHER_SET);
                        entries.add(ModBlocks.CABIN_NOTE_BOARD);
                        entries.add(ModBlocks.COMBINATION_ROLLER_BACKREST);
                        entries.add(ModBlocks.COMBINATION_WORKBENCH_LEFT);
                        entries.add(ModBlocks.COMBINATION_WORKBENCH_RIGHT);
                        entries.add(ModBlocks.CONTROL_DISPLAY);
                        entries.add(ModBlocks.EMBEDDED_DATA_CABINET1);
                        entries.add(ModBlocks.EMBEDDED_DATA_CABINET2);
                        entries.add(ModBlocks.EXPLOSION_PROOF_GARBAGE_BIN);
                        entries.add(ModBlocks.LIFE_CYCLE_MODULE_CONTROL_CONSOLE);
                    }).build());
    public static final ItemGroup COLUMBIA_CAFE = Registry.register(Registries.ITEM_GROUP,
            new Identifier(ArknightsFurniture.MOD_ID,"columbia_cafe"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.columbia_cafe"))
                    .icon(() -> new ItemStack(ModBlocks.BEVERAGE_DISPLAY_RACK_COFFEE1)).entries((displayContext, entries) -> {
                        entries.add(ModBlocks.BAR_COUNTER_CEILING);
                        entries.add(ModBlocks.BEVERAGE_DISPLAY_RACK_COFFEE1);
                        entries.add(ModBlocks.BEVERAGE_DISPLAY_RACK_COFFEE2);
                        entries.add(ModBlocks.BEVERAGE_DISPLAY_RACK_DC);
                        entries.add(ModBlocks.BEVERAGE_DISPLAY_RACK_DRINK);
                        entries.add(ModBlocks.BEVERAGE_DISPLAY_RACK_EMPTY);
                        entries.add(ModBlocks.BEVERAGE_PRICE_LIST);
                        entries.add(ModBlocks.BOLIVAR_COFFEE_BEANS);
                        entries.add(ModBlocks.BROWN_LEAP_GRID_BOOKCASE1);
                        entries.add(ModBlocks.BROWN_LEAP_GRID_BOOKCASE2);
                        entries.add(ModBlocks.BROWN_LEAP_GRID_BOOKCASE3);
                        entries.add(ModBlocks.COLUMBIA_STREET_VIEW);
                        entries.add(ModBlocks.CURVED_BOTTOM_HIGH_FOOT_COFFEE_CHAIR);
                        entries.add(ModBlocks.LONG_LEAVED_POTTED_PLANT);
                        entries.add(ModBlocks.ONE_LEGGED_COFFEE_TABLE);
                        entries.add(ModBlocks.PAIRED_COFFEE_CHAIRS);
                        entries.add(ModBlocks.RED_BRICK_CAFE_BAR_DEFAULT);
                        entries.add(ModBlocks.RED_BRICK_STORAGE_CABINET);
                        entries.add(ModBlocks.SOFT_CEILING_LIGHT);
                        entries.add(ModBlocks.SUSPENDED_CEILING_LIGHT);
                    }).build());
    public static final ItemGroup SECURITY_BUREAU_LOUNGE = Registry.register(Registries.ITEM_GROUP,
            new Identifier(ArknightsFurniture.MOD_ID,"security_bureau_lounge"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.security_bureau_lounge"))
                    .icon(() -> new ItemStack(ModBlocks.BLACK_RETRO_STOOL)).entries((displayContext, entries) -> {
                        entries.add(ModBlocks.BLACK_ONE_LEGGED_TABLE);
                        entries.add(ModBlocks.BLACK_RETRO_STOOL);
                        entries.add(ModBlocks.BLACK_SIMPLE_LOW_SOFA);
                        entries.add(ModBlocks.BLACK_VINTAGE_CHAIR);
                        entries.add(ModBlocks.BRIGHT_HANGING_LAMP);
                        entries.add(ModBlocks.DUPLEX_WOODEN_WALL_RAILING);
                        entries.add(ModBlocks.SANDALWOOD_BED);
                        entries.add(ModBlocks.SANDALWOOD_BEDSIDE_CABINET);
                        entries.add(ModBlocks.SANDALWOOD_LOW_FOOT_CONFERENCE_TABLE);
                        entries.add(ModBlocks.SANDALWOOD_MEETING_BOARD);
                    }).build());
    public static void registerItemGroup(){
        ArknightsFurniture.LOGGER.info("Registering Item Groups for" + ArknightsFurniture.MOD_ID);
    }
}
