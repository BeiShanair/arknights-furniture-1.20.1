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
    public static final ItemGroup SECURITY_BUREAU_LOUNGE_SIMULATED_GANTRY_STYLE_LOUNGE = Registry.register(Registries.ITEM_GROUP,
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
                        entries.add(ModBlocks.DUPLEX_COPPER_WALL_RAILING);
                        entries.add(ModBlocks.GRAY_SIMPLE_LOW_SOFA);
                        entries.add(ModBlocks.TEAK_BED);
                        entries.add(ModBlocks.TEAK_BEDSIDE_CABINET);
                        entries.add(ModBlocks.TEAK_LOW_FOOT_CONFERENCE_TABLE);
                        entries.add(ModBlocks.WHITE_ONE_LEGGED_TABLE);
                    }).build());
    public static final ItemGroup SAMI_COUNTRY_VILLA = Registry.register(Registries.ITEM_GROUP,
            new Identifier(ArknightsFurniture.MOD_ID,"sami_country_villa"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.sami_country_villa"))
                    .icon(() -> new ItemStack(ModBlocks.THE_BODY_OF_A_LIVING_CREATURE)).entries((displayContext, entries) -> {
                        entries.add(ModBlocks.CUSHION_ROCKING_CHAIR);
                        entries.add(ModBlocks.HAND_WOVEN_FIREWOOD_BASKET);
                        entries.add(ModBlocks.LOG_BACKCHAIR);
                        entries.add(ModBlocks.LOG_BEAM);
                        entries.add(ModBlocks.LOG_DINING_TABLE);
                        entries.add(ModBlocks.LOG_STORAGE_CABINET_DOWN);
                        entries.add(ModBlocks.LOG_STORAGE_CABINET_UP1);
                        entries.add(ModBlocks.LOG_STORAGE_CABINET_UP2);
                        entries.add(ModBlocks.RETRO_CEILING_FAN);
                        entries.add(ModBlocks.SPRUCE_VIOLIN);
                        entries.add(ModBlocks.THE_BODY_OF_A_LIVING_CREATURE);
                        entries.add(ModBlocks.WOODEN_SOFA_ELEVATED_BED_DOWN);
                        entries.add(ModBlocks.WOODEN_SOFA_ELEVATED_BED_UP);
                        entries.add(ModBlocks.VINTAGE_CHANDELIER);
                    }).build());
    public static final ItemGroup QUICK_CHAIN_PIZZA_SHOPS = Registry.register(Registries.ITEM_GROUP,
            new Identifier(ArknightsFurniture.MOD_ID,"quick_chain_pizza_shops"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.quick_chain_pizza_shops"))
                    .icon(() -> new ItemStack(ModBlocks.FLOOR_STANDING_POSTER_STAND)).entries((displayContext, entries) -> {
                        entries.add(ModBlocks.ACTIVITY_TABLE);
                        entries.add(ModBlocks.BACKREST_SINGLE_CHAIR);
                        entries.add(ModBlocks.BLACK_CASH_REGISTER);
                        entries.add(ModBlocks.BOWL);
                        entries.add(ModBlocks.DINING_CABINETS);
                        entries.add(ModBlocks.DINING_PLATE);
                        entries.add(ModBlocks.DINING_TRAY_RACK);
                        entries.add(ModBlocks.EXIT_INDICATOR_LIGHT);
                        entries.add(ModBlocks.FLOOR_STANDING_POSTER_STAND);
                        entries.add(ModBlocks.HIGH_STOOL);
                        entries.add(ModBlocks.PIZZA_BOX);
                        entries.add(ModBlocks.PIZZA_POSTER);
                        entries.add(ModBlocks.PIZZA_PRICE_LIST1);
                        entries.add(ModBlocks.PIZZA_PRICE_LIST2);
                        entries.add(ModBlocks.SOFT_LIGHT_CHANDELIERS);
                    }).build());
    public static final ItemGroup COLUMBIA_MODERN_HOTEL = Registry.register(Registries.ITEM_GROUP,
            new Identifier(ArknightsFurniture.MOD_ID,"columbia_modern_hotel"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.columbia_modern_hotel"))
                    .icon(() -> new ItemStack(ModBlocks.WILLIAM_PIANO_COMBINATION)).entries((displayContext, entries) -> {
                        entries.add(ModBlocks.BEVERAGE_TABLE_HIGH_STOOL);
                        entries.add(ModBlocks.BILLBOARD_JUKEBOX);
                        entries.add(ModBlocks.BLACK_GOLD_FREEZER);
                        entries.add(ModBlocks.HOTEL_UNIVERSAL_BAR_COUNTER);
                        entries.add(ModBlocks.MODERN_HOTEL_CEILING);
                        entries.add(ModBlocks.MODERN_HOTEL_FLOOR_LAMP);
                        entries.add(ModBlocks.MODERN_HOTEL_PENDANT_LIGHT);
                        entries.add(ModBlocks.MODERN_HOTEL_SOFA_DEFAULT);
                        entries.add(ModBlocks.MODERN_HOTEL_TEA_TABLE);
                        entries.add(ModBlocks.MODERN_HOTEL_WALL_LAMP);
                        entries.add(ModBlocks.MODERN_WALL_HANGING_DECORATION);
                        entries.add(ModBlocks.TOWER_SHAPED_BAR_COUNTER_SUSPENDED_CEILING);
                        entries.add(ModBlocks.TOWER_SHAPED_BAR_COUNTER_SUSPENDED_CEILING2);
                        entries.add(ModBlocks.WILLIAM_PIANO_COMBINATION);
                    }).build());

    public static final ItemGroup AIRTIGHT_CHEMICAL_SAFETY_CABIN = Registry.register(Registries.ITEM_GROUP,
            new Identifier(ArknightsFurniture.MOD_ID,"airtight_chemical_safety_cabin"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.airtight_chemical_safety_cabin"))
                    .icon(() -> new ItemStack(ModBlocks.SAFETY_CABIN_DISINFECTION_ROOM)).entries((displayContext, entries) -> {
                        entries.add(ModBlocks.CABIN_PIPELINE_VALVES);
                        entries.add(ModBlocks.EMERGENCY_PUSH_BED);
                        entries.add(ModBlocks.MULTIFUNCTIONAL_DISINFECTOR);
                        entries.add(ModBlocks.MULTIFUNCTIONAL_ENGINEERING_SHOVEL);
                        entries.add(ModBlocks.SAFETY_CABIN_AIRWAY);
                        entries.add(ModBlocks.SAFETY_CABIN_CEILING_LIGHT);
                        entries.add(ModBlocks.SAFETY_CABIN_CONTROL_AIRWAY);
                        entries.add(ModBlocks.SAFETY_CABIN_DISINFECTION_ROOM);
                        entries.add(ModBlocks.SAFETY_CABIN_DISINFECTION_LIGHT);
                        entries.add(ModBlocks.SAFETY_CABIN_ENGINEERING_VEHICLE);
                        entries.add(ModBlocks.SAFETY_CABIN_FLUORESCENT_LAMP);
                        entries.add(ModBlocks.SAFETY_COMPARTMENT_MATERIAL_BOX);
                        entries.add(ModBlocks.SUPPLY_RESOURCE_TANK);
                    }).build());
    public static final ItemGroup CHENS_OFFICE = Registry.register(Registries.ITEM_GROUP,
            new Identifier(ArknightsFurniture.MOD_ID,"chens_office"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.chens_office"))
                    .icon(() -> new ItemStack(ModBlocks.CHENS_HONORARY_CERTIFICATE)).entries((displayContext, entries) -> {
                        entries.add(ModBlocks.CACTUS_POTTED_PLANT);
                        entries.add(ModBlocks.CHENS_OFFICE_CHAIR);
                        entries.add(ModBlocks.CHENS_DESK_DEFAULT);
                        entries.add(ModBlocks.CHENS_HONORARY_CERTIFICATE);
                        entries.add(ModBlocks.CHENS_WEAPON_RACK);
                        entries.add(ModBlocks.FILE1);
                        entries.add(ModBlocks.FILE2);
                        entries.add(ModBlocks.FLUORESCENT_LAMPS_FOR_THE_GUARD_BUREAU);
                        entries.add(ModBlocks.GENERAL_BOOKCASE_OF_THE_GUARD_BUREAU);
                        entries.add(ModBlocks.GENERAL_GARBAGE_BIN_OF_THE_GUARD_BUREAU);
                        entries.add(ModBlocks.GUARD_BUREAU_FLUORESCENT_LAMP);
                        entries.add(ModBlocks.GUARD_BUREAU_HEALTH_ABDOMEN_PLATE);
                        entries.add(ModBlocks.OFFICE_CLUE_BOARD);
                        entries.add(ModBlocks.SPECIAL_UPRIGHT_STAKES_MADE_BY_THE_GUARD_BUREAU);
                        entries.add(ModBlocks.SPOTLIGHT_FOR_THE_GUARD_BUREAU);
                    }).build());
    public static final ItemGroup SIESTA_BEACH_COTTAGE = Registry.register(Registries.ITEM_GROUP,
            new Identifier(ArknightsFurniture.MOD_ID,"siesta_beach_cottage"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.siesta_beach_cottage"))
                    .icon(() -> new ItemStack(ModBlocks.LAZY_TEA_TABLE)).entries((displayContext, entries) -> {
                        entries.add(ModBlocks.A_SURFERS_BOARD_RACK);
                        entries.add(ModBlocks.BEACH_COTTAGE_FLOOR_LAMP);
                        entries.add(ModBlocks.BLUE_AND_WHITE_CANVAS_CURTAINS_LEFT);
                        entries.add(ModBlocks.BLUE_AND_WHITE_CANVAS_CURTAINS_RIGHT);
                        entries.add(ModBlocks.LAZY_DOUBLE_LOUNGE_CHAIR_DEFAULT);
                        entries.add(ModBlocks.LAZY_LOUNGE_CHAIR);
                        entries.add(ModBlocks.LAZY_HIGH_LEGGED_COFFEE_TABLE);
                        entries.add(ModBlocks.LAZY_TEA_TABLE);
                        entries.add(ModBlocks.RHODE_ISLAND_SUMMER_CALENDAR);
                        entries.add(ModBlocks.SIESTA_CITY_EMBLEM_SOUVENIR);
                        entries.add(ModBlocks.SUMMER_BOAT_CABINET_UP);
                        entries.add(ModBlocks.SUMMER_BOAT_CABINET_DOWN);
                        entries.add(ModBlocks.WOODEN_TOP_BEAM);
                    }).build());
    //public static final ItemGroup  = Registry.register(Registries.ITEM_GROUP,
    //        new Identifier(ArknightsFurniture.MOD_ID,""),
    //        FabricItemGroup.builder().displayName(Text.translatable("itemgroup."))
    //                .icon(() -> new ItemStack(ModBlocks.)).entries((displayContext, entries) -> {
    //                    entries.add(ModBlocks.);
    //                }).build());
    public static void registerItemGroup(){
        ArknightsFurniture.LOGGER.info("Registering Item Groups for" + ArknightsFurniture.MOD_ID);
    }
}
