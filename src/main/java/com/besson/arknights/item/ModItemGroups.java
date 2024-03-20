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
                        entries.add(ModBlocks.SUMMER_COLLECTION_CABINET);
                    }).build());
    public static final ItemGroup RHODE_ISLAND_MODERN_MUSIC_REHEARSAL_ROOM = Registry.register(Registries.ITEM_GROUP,
            new Identifier(ArknightsFurniture.MOD_ID,"rhode_island_modern_music_rehearsal_room"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.rhode_island_modern_music_rehearsal_room"))
                    .icon(() -> new ItemStack(ModBlocks.YARMA_KHAN_SHELF_DRUM)).entries((displayContext, entries) -> {
                        entries.add(ModBlocks.AMBER);
                        entries.add(ModBlocks.BLAZE);
                        entries.add(ModBlocks.DARK_CLOUDS);
                        entries.add(ModBlocks.DRIFTWOOD);
                        entries.add(ModBlocks.FROSTING);
                        entries.add(ModBlocks.GRAPHITE_STEEL);
                        entries.add(ModBlocks.REHEARSAL_ROOM_BENCH);
                        entries.add(ModBlocks.REHEARSAL_ROOM_ACCESSORY_HANGING_BOARD);
                        entries.add(ModBlocks.REHEARSAL_ROOM_SPOTLIGHT);
                        entries.add(ModBlocks.REHEARSAL_ROOM_ROUND_BENCH);
                        entries.add(ModBlocks.REHEARSAL_ROOM_RECEPTION_DESK);
                        entries.add(ModBlocks.REHEARSAL_ROOM_STRAP_HANGING_BOARD);
                        entries.add(ModBlocks.SHALLOW_SEA);
                        entries.add(ModBlocks.SPOTLIGHT_CEILING);
                        entries.add(ModBlocks.STAGE);
                        entries.add(ModBlocks.TOUR_EQUIPMENT_COMBINATION);
                        entries.add(ModBlocks.SUSPENDED_SCROLLING_DISPLAY_SCREEN);
                        entries.add(ModBlocks.WHEAT_FRAGRANCE);
                        entries.add(ModBlocks.WHITE_BIRCH);
                        entries.add(ModBlocks.YARMA_KHAN_SHELF_DRUM);
                    }).build());

    public static final ItemGroup LANCELLAR_BALLROOM = Registry.register(Registries.ITEM_GROUP,
            new Identifier(ArknightsFurniture.MOD_ID,"lancellar_ballroom"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.lancellar_ballroom"))
                    .icon(() -> new ItemStack(ModBlocks.BANQUET_HALL_MAIN_SEAT)).entries((displayContext, entries) -> {
                        entries.add(ModBlocks.AI_STYLE_COLUMN_DOWN);
                        entries.add(ModBlocks.AI_STYLE_COLUMN_MIDDLE);
                        entries.add(ModBlocks.AI_STYLE_COLUMN_UP);
                        entries.add(ModBlocks.BANQUET_HALL_MAIN_SEAT);
                        entries.add(ModBlocks.BANQUET_HALL_SECOND_SEAT);
                        entries.add(ModBlocks.BANQUET_TABLE_DEFAULT);
                        entries.add(ModBlocks.BUST_OF_LANCHENG_GUARD);
                        entries.add(ModBlocks.CANDLE_DISPLAY_STOVE);
                        entries.add(ModBlocks.CEILING_MOUNTED_CANDLE_CHANDELIER);
                        entries.add(ModBlocks.DOUBLE_CEILING_CANDLE_CHANDELIER);
                        entries.add(ModBlocks.LANCELLAR_BRAZIER);
                        entries.add(ModBlocks.LANCELLAR_MIRROR);
                        entries.add(ModBlocks.LANCELLAR_LOW_STOOL);
                        entries.add(ModBlocks.LOCKED_CABINET);
                    }).build());
    public static final ItemGroup SOUL_SECRET_SOCIETY = Registry.register(Registries.ITEM_GROUP,
            new Identifier(ArknightsFurniture.MOD_ID,"soul_secret_society"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.soul_secret_society"))
                    .icon(() -> new ItemStack(ModBlocks.MORE_YIGUA)).entries((displayContext, entries) -> {
                        entries.add(ModBlocks.ABNORMAL_BEDDING_BED);
                        entries.add(ModBlocks.ABNORMAL_BEDDING_LIGHT);
                        entries.add(ModBlocks.ABNORMAL_BEDDING_TREE);
                        entries.add(ModBlocks.AUXILIARY_INSTRUMENT_PENDANT_LAMP);
                        entries.add(ModBlocks.CASTING_HONEY_CRUCIBLE);
                        entries.add(ModBlocks.ELEGANT_WOODEN_CHAIRS);
                        entries.add(ModBlocks.FRAGMENTED_SEQUENCE_DESK);
                        entries.add(ModBlocks.LOCK_THE_NIGHT_STONE_WINDOW);
                        entries.add(ModBlocks.MORE_YIGUA);
                        entries.add(ModBlocks.SEVERAL_YIGUA);
                        entries.add(ModBlocks.SHAYI_BOOK_GROUP);
                    }).build());
    public static final ItemGroup PENGUIN_LOGISTICS_SAFE_HOUSE = Registry.register(Registries.ITEM_GROUP,
            new Identifier(ArknightsFurniture.MOD_ID,"penguin_logistics_safe_house"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.penguin_logistics_safe_house"))
                    .icon(() -> new ItemStack(ModBlocks.SAFETY_PARTITION_DOOR)).entries((displayContext, entries) -> {
                        entries.add(ModBlocks.ADJUSTABLE_ROUND_STOOL);
                        entries.add(ModBlocks.FLUORESCENT_LAMP_CEILING);
                        entries.add(ModBlocks.GOODS_TO_BE_CARRIED);
                        entries.add(ModBlocks.HIGH_POWER_FLOOR_LAMP);
                        entries.add(ModBlocks.MULTIFUNCTIONAL_WORKBENCH);
                        entries.add(ModBlocks.MULTIFUNCTIONAL_WORKBENCH_BOARD);
                        entries.add(ModBlocks.MULTIFUNCTIONAL_WORKBENCH_COMPUTER);
                        entries.add(ModBlocks.OLD_FASHIONED_RECORD_PLAYER);
                        entries.add(ModBlocks.PENGUIN_CLUE_COLLECTION_BOARD);
                        entries.add(ModBlocks.RED_GLOVE_COMPARTMENT1);
                        entries.add(ModBlocks.RED_GLOVE_COMPARTMENT2);
                        entries.add(ModBlocks.RED_GLOVE_COMPARTMENT3);
                        entries.add(ModBlocks.SAFETY_PARTITION_DOOR);
                        entries.add(ModBlocks.SOFT_SOFA_DEFAULT);
                        entries.add(ModBlocks.TREASURED_BEVERAGE_BUCKET);
                    }).build());
    public static final ItemGroup RHODE_ISLAND_WORKSHOP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(ArknightsFurniture.MOD_ID,"rhode_island_workshop"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.rhode_island_workshop"))
                    .icon(() -> new ItemStack(ModBlocks.MECHANICAL_ARM)).entries((displayContext, entries) -> {
                        entries.add(ModBlocks.CLEANER);
                        entries.add(ModBlocks.DOUBLE_BEAM_CRANE);
                        entries.add(ModBlocks.FLOODLIGHT_SUSPENDED_CEILING);
                        entries.add(ModBlocks.INDUSTRIAL_CUTTING_TABLE);
                        entries.add(ModBlocks.MATERIAL_BOX);
                        entries.add(ModBlocks.MECHANICAL_ARM);
                        entries.add(ModBlocks.STAGING);
                        entries.add(ModBlocks.WEAPON_STORAGE_CABINET);
                        entries.add(ModBlocks.WHITE_ROUND_STOOL);
                        entries.add(ModBlocks.WORKSHOP_BLACKBOARD);
                    }).build());
    public static final ItemGroup LONG_MEN_RESTAURANT = Registry.register(Registries.ITEM_GROUP,
            new Identifier(ArknightsFurniture.MOD_ID,"long_men_restaurant"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.long_men_restaurant"))
                    .icon(() -> new ItemStack(ModBlocks.INSCRIPTION_CEILING_LONG)).entries((displayContext, entries) -> {
                        entries.add(ModBlocks.BAMBOO_SCREEN);
                        entries.add(ModBlocks.CEILING_LAMP);
                        entries.add(ModBlocks.CORNER_WOODEN_DEFAULT);
                        entries.add(ModBlocks.ELECTRIC_FRYING_TABLE);
                        entries.add(ModBlocks.FOCUS_LAMP);
                        entries.add(ModBlocks.FOOD_WORKSHOP_DINING_TABLE);
                        entries.add(ModBlocks.FOOD_WORKSHOP_ROUND_STOOL);
                        entries.add(ModBlocks.HALF_MASKED_SCREEN);
                        entries.add(ModBlocks.HEXAGONAL_PALACE_LAMP);
                        entries.add(ModBlocks.INSCRIPTION_CEILING_LONG);
                        entries.add(ModBlocks.INSCRIPTION_CEILING_MENG);
                        entries.add(ModBlocks.INSCRIPTION_CEILING_JIAO);
                        entries.add(ModBlocks.INSCRIPTION_CEILING_ZI);
                        entries.add(ModBlocks.INSCRIPTION_CEILING_FANG);
                        entries.add(ModBlocks.INSCRIPTION_CEILING_DEFAULT);
                        entries.add(ModBlocks.INSCRIPTION_CEILING_MENU1);
                        entries.add(ModBlocks.INSCRIPTION_CEILING_MENU2);
                        entries.add(ModBlocks.ORNAMENTAL_PLANT);
                        entries.add(ModBlocks.ORNAMENTAL_POTTED_PLANTS);
                        entries.add(ModBlocks.SQUARE_BENCH);
                        entries.add(ModBlocks.STEWED_POT_PLATFORM);
                        entries.add(ModBlocks.STEWED_POT_PLATFORM_POT);
                    }).build());
    public static final ItemGroup HEALTHY_FAST_FOOD_RESTAURANT = Registry.register(Registries.ITEM_GROUP,
            new Identifier(ArknightsFurniture.MOD_ID,"healthy_fast_food_restaurant"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.healthy_fast_food_restaurant"))
                    .icon(() -> new ItemStack(ModBlocks.ICED_JUICE_MAKER)).entries((displayContext, entries) -> {
                        entries.add(ModBlocks.COLD_FRESH_FOOD_CABINET_DEFAULT);
                        entries.add(ModBlocks.DAILY_RECOMMENDATIONS);
                        entries.add(ModBlocks.GREEN_DOUBLE_SOFA_DEFAULT);
                        entries.add(ModBlocks.HEALTH_DECORATION_SIGN);
                        entries.add(ModBlocks.HEALTH_DINING_TABLE);
                        entries.add(ModBlocks.HEALTH_PRICE_LIST);
                        entries.add(ModBlocks.HEALTH_SERVICE_DESK);
                        entries.add(ModBlocks.HEALTH_SERVICE_DESK_CASHIER);
                        entries.add(ModBlocks.HEALTH_SPOTLIGHT);
                        entries.add(ModBlocks.ICED_JUICE_MAKER);
                        entries.add(ModBlocks.RELAXED_GARDEN_CEILING);
                        entries.add(ModBlocks.SELF_SERVICE_ORDERING_MACHINE);
                        entries.add(ModBlocks.SELF_SERVICE_VENDING_MACHINE);
                    }).build());
    public static final ItemGroup SEVEN_CITIES_STYLE_RESTAURANT = Registry.register(Registries.ITEM_GROUP,
            new Identifier(ArknightsFurniture.MOD_ID,"seven_cities_style_restaurant"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.seven_cities_style_restaurant"))
                    .icon(() -> new ItemStack(ModBlocks.FOOD_INSULATION_CABINET)).entries((displayContext, entries) -> {
                        entries.add(ModBlocks.BEER_STORAGE_CABINET);
                        entries.add(ModBlocks.CLEAN_SERVICE_DESK_DEFAULT);
                        entries.add(ModBlocks.DOUBLE_ROW_SOFA_SEAT_DEFAULT);
                        entries.add(ModBlocks.DOUBLE_ROW_SOFA_SEAT_DESK);
                        entries.add(ModBlocks.FOOD_INSULATION_CABINET);
                        entries.add(ModBlocks.HIGH_FOOT_PRICE_LIST);
                        entries.add(ModBlocks.LARGE_PROMOTIONAL_BOARD);
                        entries.add(ModBlocks.RESTAURANT_PROMOTIONAL_BOARD);
                        entries.add(ModBlocks.SEVEN_CITY_STYLE_WARM_LIGHT_CHANDELIER);
                    }).build());
    public static final ItemGroup SAKAZ_MERCENARY_LOUNGE = Registry.register(Registries.ITEM_GROUP,
            new Identifier(ArknightsFurniture.MOD_ID,"sakaz_mercenary_lounge"),
            FabricItemGroup.builder().displayName(Text.translatable("itemGroup.sakaz_mercenary_lounge"))
                    .icon(() -> new ItemStack(ModBlocks.HIGH_FOOT_DINING_TABLE)).entries((displayContext, entries) -> {
                        entries.add(ModBlocks.BULLETPROOF_GLASS_PARTITION);
                        entries.add(ModBlocks.DETONATOR_MAKING_TOOL);
                        entries.add(ModBlocks.HANGING_DART_PLATE);
                        entries.add(ModBlocks.HANGING_STORAGE_RACK);
                        entries.add(ModBlocks.HIGH_FOOT_DINING_TABLE);
                        entries.add(ModBlocks.HIGH_YIELD_EXPLOSIVE_RAW_MATERIALS);
                        entries.add(ModBlocks.LOUNGE_LIGHT_SOURCE_CEILING);
                        entries.add(ModBlocks.LOUNGE_LIGHT_TUBE);
                        entries.add(ModBlocks.LOUNGE_NOTICE_BOARD);
                        entries.add(ModBlocks.LOUNGE_PENDANT_LIGHT);
                        entries.add(ModBlocks.LOUNGE_SMALL_WALL_LAMP);
                        entries.add(ModBlocks.RED_FRAMED_FLOOR_MIRROR);
                        entries.add(ModBlocks.SAKAZ_BILLIARDS_TABLE);
                        entries.add(ModBlocks.SAKAZ_PENDULUM);
                        entries.add(ModBlocks.SPOILS_DISPLAY_RACK);
                    }).build());

    public static final ItemGroup URSA_STUDENT_LOUNGE = Registry.register(Registries.ITEM_GROUP,
            new Identifier(ArknightsFurniture.MOD_ID,"ursa_student_lounge"),
            FabricItemGroup.builder().displayName(Text.translatable("itemGroup.uras_student_lounge"))
                    .icon(() -> new ItemStack(ModBlocks.WOODEN_LONG_TABLE)).entries((displayContext, entries) -> {
                        entries.add(ModBlocks.CIRCULAR_SUSPENDED_CEILING);
                        entries.add(ModBlocks.CLUB_BULLETIN_BOARD);
                        entries.add(ModBlocks.FLOOR_MOUNTED_BOOKSHELF);
                        entries.add(ModBlocks.HANGING_LAMP);
                        entries.add(ModBlocks.LOW_FLOOR_LAMP);
                        entries.add(ModBlocks.LOW_STORAGE_CABINET);
                        entries.add(ModBlocks.PORTABLE_PICNIC_STOVE);
                        entries.add(ModBlocks.SIMPLE_TOILET_CHAIR);
                        entries.add(ModBlocks.WOODEN_LONG_TABLE);
                    }).build());

    public static final ItemGroup LETANIA_NIGHT = Registry.register(Registries.ITEM_GROUP,
            new Identifier(ArknightsFurniture.MOD_ID,"letania_night"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.letania_night"))
                    .icon(() -> new ItemStack(ModBlocks.ANTIQUE_RECORD_PLAYER)).entries((displayContext, entries) -> {
                        entries.add(ModBlocks.ACCOMPANIMENT_CHAIR);
                        entries.add(ModBlocks.ANTIQUE_RECORD_PLAYER);
                        entries.add(ModBlocks.BALL_OF_BALANCE);
                        entries.add(ModBlocks.BLACK_LACQUER_WHITE_HEAD_CELLO);
                        entries.add(ModBlocks.FOUR_CANDLE_CHANDELIER);
                        entries.add(ModBlocks.FOUR_COLUMN_BED);
                        entries.add(ModBlocks.INTEGRATED_DESK);
                        entries.add(ModBlocks.INTEGRATED_DESK_BOTTOM);
                        entries.add(ModBlocks.INTEGRATED_DESK_UPPER);
                        entries.add(ModBlocks.LETANIA_BEVERAGE);
                        entries.add(ModBlocks.MISCELLANEOUS_BOOK_PILE);
                        entries.add(ModBlocks.SIX_CANDLE_CHANDELIER);
                        entries.add(ModBlocks.WHITE_EXTENDED_DEFAULT);
                    }).build());

    public static final ItemGroup RHODES_ISLAND_OFFICE_OF_PERSONNEL = Registry.register(Registries.ITEM_GROUP,
            new Identifier(ArknightsFurniture.MOD_ID,"rhodes_island_office_of_personnel"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.rhodes_island_office_of_personnel"))
                    .icon(() -> new ItemStack(ModBlocks.SHARP_ORNAMENTAL_PLANTS)).entries((displayContext, entries) -> {
                        entries.add(ModBlocks.FLOOR_SIGNS);
                        entries.add(ModBlocks.MOVABLE_STORAGE_CABINET);
                        entries.add(ModBlocks.OVERLOAD_PRINTER);
                        entries.add(ModBlocks.PERSONNEL_OFFICE_LIGHT_SOURCE);
                        entries.add(ModBlocks.SHARP_ORNAMENTAL_PLANTS);
                        entries.add(ModBlocks.STANDARD_OFFICE_CHAIR);
                        entries.add(ModBlocks.STANDARD_OFFICE_DESK);
                        entries.add(ModBlocks.STANDARD_OFFICE_DESK_COMPUTER);
                        entries.add(ModBlocks.STATION_INDICATOR_BOARD);
                        entries.add(ModBlocks.STATION_LIGHT_SOURCE);
                        entries.add(ModBlocks.TRANSPARENT_SCREEN_FOR_PARTITION);
                        entries.add(ModBlocks.WAITING_SOFA_STOOL);
                        entries.add(ModBlocks.WATER_DISPENSER);
                    }).build());

    public static final ItemGroup TRIBAL_LODGE = Registry.register(Registries.ITEM_GROUP,
            new Identifier(ArknightsFurniture.MOD_ID,"tribal_lodge"),
            FabricItemGroup.builder().displayName(Text.translatable("itemGroup.tribal_lodge"))
                    .icon(() -> new ItemStack(ModBlocks.TOTEM_POT)).entries((displayContext, entries) ->{
                        entries.add(ModBlocks.POTTED_TROPICAL_PLANTS);
                        entries.add(ModBlocks.TOTEM_POT);
                        entries.add(ModBlocks.TOTEM_SOUND);
                        entries.add(ModBlocks.TRIBAL_DEBRIS_STONE_PIER);
                        entries.add(ModBlocks.TRIBAL_DECORATIVE_CHANDELIER);
                        entries.add(ModBlocks.TRIBAL_ELEVATED_BED);
                        entries.add(ModBlocks.TRIBAL_STYLE_SOFA_DEFAULT);
                    }).build());

    public static final ItemGroup FLAME_HALL = Registry.register(Registries.ITEM_GROUP,
            new Identifier(ArknightsFurniture.MOD_ID,"flame_hall"),
            FabricItemGroup.builder().displayName(Text.translatable("itemGroup.flame_hall"))
                    .icon(() -> new ItemStack(ModBlocks.CARVED_WOODEN_SCREEN)).entries((displayContext, entries) -> {
                        entries.add(ModBlocks.BASKET_LAMP);
                        entries.add(ModBlocks.CARVED_WOODEN_SCREEN);
                        entries.add(ModBlocks.EXTENDED_FOOTSTOOL);
                        entries.add(ModBlocks.HIGH_FOOTED_CANDLE_LAMP);
                        entries.add(ModBlocks.NEW_STYLE_IMPERIAL_CONCUBINE_BED_DEFAULT);
                        entries.add(ModBlocks.PAGODA_LAMP);
                        entries.add(ModBlocks.SHORT_LEGGED_LONG_TABLE);
                        entries.add(ModBlocks.SOURCE_STONE_WATER_BOILER);
                        entries.add(ModBlocks.SQUARE_TOP_BOX_CABINET);
                        entries.add(ModBlocks.SQUARE_TOP_BOX_CABINET2);
                        entries.add(ModBlocks.WOODEN_CARVED_ROUND_STOOL);
                    }).build());

    public static final ItemGroup IMITATION_OF_THE_LIVING_ROOM_OF_THE_LIGHT_HOUSE = Registry.register(Registries.ITEM_GROUP,
            new Identifier(ArknightsFurniture.MOD_ID,"imitation_of_the_living_room_of_the_light_house"),
            FabricItemGroup.builder().displayName(Text.translatable("itemGroup.imitation_of_the_living_room_of_the_light_house"))
                    .icon(() -> new ItemStack(ModBlocks.JADE_PENDANT_LAMP)).entries((displayContext, entries) -> {
                        entries.add(ModBlocks.CLASSICAL_DISPLAY_CABINET);
                        entries.add(ModBlocks.CLEAN_HAND_BASIN);
                        entries.add(ModBlocks.EXTENDED_SOFA_DEFAULT);
                        entries.add(ModBlocks.JADE_PENDANT_LAMP);
                        entries.add(ModBlocks.JADE_PENDANT_LAMP_SMALL);
                        entries.add(ModBlocks.MARBLE_HIGH_PLATFORM_DEFAULT);
                        entries.add(ModBlocks.MINIMALIST_COFFEE_TABLE);
                        entries.add(ModBlocks.PALE_BRANCHES_AND_TRUNKS);
                        entries.add(ModBlocks.SOFA_STOOL);
                        entries.add(ModBlocks.SOFA_STOOL_SQUARE);
                        entries.add(ModBlocks.SWORD_ARMOR_COLLECTION_CABINET);
                        entries.add(ModBlocks.TRAINING_CALENDAR);
                        entries.add(ModBlocks.WATERING_KETTLE);
                    }).build());

    public static final ItemGroup YELLOW_DENG_DENG_GAME_ROOM = Registry.register(Registries.ITEM_GROUP,
            new Identifier(ArknightsFurniture.MOD_ID,"yellow_deng_deng_game_room"),
            FabricItemGroup.builder().displayName(Text.translatable("itemGroup.yellow_deng_deng_game_room"))
                    .icon(() -> new ItemStack(ModBlocks.BAMBOO_BASKET_SOURCE_STONE_LAMP)).entries((displayContext, entries) -> {
                        entries.add(ModBlocks.A_SHOWCASE_FILLED_WITH_WATER);
                        entries.add(ModBlocks.BAMBOO_BASKET_SOURCE_STONE_LAMP);
                        entries.add(ModBlocks.BRASS_SQUARE_CEILING_LIGHT);
                        entries.add(ModBlocks.CHRONICLE_CALENDAR);
                        entries.add(ModBlocks.ROLLER_REFRIGERATOR);
                        entries.add(ModBlocks.SHAKE_AND_SHAKE_THE_SOFA);
                        entries.add(ModBlocks.TOY_CABINET);
                        entries.add(ModBlocks.WATERCOLOR_PAINTING_SET);
                        entries.add(ModBlocks.WOOD_FENCE);
                        entries.add(ModBlocks.WOOD_GRID_CEILING_FENCE);
                        entries.add(ModBlocks.YELLOW_SMALL_ROUND_STOOL);
                    }).build());

    public static final ItemGroup WHITE_WANGNO = Registry.register(Registries.ITEM_GROUP,
            new Identifier(ArknightsFurniture.MOD_ID,"white_wangno"),
            FabricItemGroup.builder().displayName(Text.translatable("itemGroup.white_wangno"))
                    .icon(() -> new ItemStack(ModBlocks.PLAIN_BED)).entries((displayContext, entries) -> {
                        entries.add(ModBlocks.AIR_PURIFIER);
                        entries.add(ModBlocks.AREA_SEPARATION_DECORATION);
                        entries.add(ModBlocks.BRACKET_LIGHT_SOURCE);
                        entries.add(ModBlocks.CIRCULAR_DECORATIVE_LIGHT_SOURCE);
                        entries.add(ModBlocks.EMBEDDED_KITCHEN_UNIT);
                        entries.add(ModBlocks.LIGHT_SOURCE_CEILING);
                        entries.add(ModBlocks.MINIMALIST_HIGH_CHAIR);
                        entries.add(ModBlocks.MULTIFUNCTIONAL_COOKING_TABLE);
                        entries.add(ModBlocks.NO_PICTURE_FRAME);
                        entries.add(ModBlocks.PLAIN_BED);
                        entries.add(ModBlocks.RECESSED_LIGHT_SOURCE);
                        entries.add(ModBlocks.SUSPENDED_LIGHT_SOURCE_GROUP);
                        entries.add(ModBlocks.VERTICAL_KITCHEN_SET);
                        entries.add(ModBlocks.VERTICAL_KITCHEN_SET_UPPER);
                    }).build());

    public static final ItemGroup MANSFIELD_CELL = Registry.register(Registries.ITEM_GROUP,
            new Identifier(ArknightsFurniture.MOD_ID,"mansfield_cell"),
            FabricItemGroup.builder().displayName(Text.translatable("itemGroup.mansfield_cell"))
                    .icon(() -> new ItemStack(ModBlocks.SAFETY_INSPECTION_EQUIPMENT)).entries((displayContext, entries) -> {
                        entries.add(ModBlocks.BAFFLE);
                        entries.add(ModBlocks.CELL_AIR_EXCHANGE_PORT);
                        entries.add(ModBlocks.CELL_CEILING_LIGHT);
                        entries.add(ModBlocks.DOUBLE_LAYER_IRON_BED);
                        entries.add(ModBlocks.EMBEDDED_GLASS_MIRROR);
                        entries.add(ModBlocks.EXPOSED_WATER_PIPES);
                        entries.add(ModBlocks.HALF_OPEN_LONG_PLATE_PARTITION_STOOL);
                        entries.add(ModBlocks.HANDCUFFED_PRISONERS_CHAIR);
                        entries.add(ModBlocks.IRON_FAN_SUSPENDED_CEILING);
                        entries.add(ModBlocks.LARGE_CAPACITY_HOT_WATER_KETTLE);
                        entries.add(ModBlocks.PERSONAL_WASHING_TABLE);
                        entries.add(ModBlocks.SAFETY_INSPECTION_EQUIPMENT);
                        entries.add(ModBlocks.SINGLE_PERSON_TOILET);
                        entries.add(ModBlocks.WARNING_EQUIPMENT);
                        entries.add(ModBlocks.WATER_CONTAINER);
                    }).build());

    public static final ItemGroup MEDITATION_GARDEN = Registry.register(Registries.ITEM_GROUP,
            new Identifier(ArknightsFurniture.MOD_ID,"meditation_garden"),
            FabricItemGroup.builder().displayName(Text.translatable("itemGroup.meditation_garden"))
                    .icon(() -> new ItemStack(ModBlocks.LIKE_ME)).entries((displayContext, entries) -> {
                        entries.add(ModBlocks.ACCOMPANIED_BY_FROST_AND_COLD);
                        entries.add(ModBlocks.BY_QU_ZHENG);
                        entries.add(ModBlocks.CLEAN);
                        entries.add(ModBlocks.CONFESSION);
                        entries.add(ModBlocks.FROST);
                        entries.add(ModBlocks.GENTLE);
                        entries.add(ModBlocks.HANGING_RULER);
                        entries.add(ModBlocks.LIGHTWEIGHT_ALL_OVER);
                        entries.add(ModBlocks.LIKE_ME);
                        entries.add(ModBlocks.TIMING);
                        entries.add(ModBlocks.TURBID);
                        entries.add(ModBlocks.WRONG_BRANCH);
                    }).build());

    public static final ItemGroup DANQING_PAVILION = Registry.register(Registries.ITEM_GROUP,
            new Identifier(ArknightsFurniture.MOD_ID,"danqing_pavilion"),
            FabricItemGroup.builder().displayName(Text.translatable("itemGroup.danqing_pavilion"))
                    .icon(() -> new ItemStack(ModBlocks.FLOOR_STANDING_LIGHT)).entries((displayContext, entries) -> {
                        entries.add(ModBlocks.A_CASE_BASED_ON_WILL);
                        entries.add(ModBlocks.A_VERSATILE_CYLINDER);
                        entries.add(ModBlocks.FLOOR_STANDING_LIGHT);
                        entries.add(ModBlocks.HIGH_HANGING_LIGHT);
                        entries.add(ModBlocks.LANDING_CLOUD_SILK);
                        entries.add(ModBlocks.LIGHT_GAUZE_LANDSCAPE_SCREEN);
                        entries.add(ModBlocks.LITTER_CONTAINER);
                        entries.add(ModBlocks.PUYU_KNOT);
                        entries.add(ModBlocks.RANDOM_THOUGHTS_SCREEN);
                        entries.add(ModBlocks.STILL_WATER_LOTUS_BOX);
                        entries.add(ModBlocks.SUSHAN_MOUNTAIN_AND_WATER);
                        entries.add(ModBlocks.TRANSPARENT_HANGING_CURTAIN_WIDE);
                        entries.add(ModBlocks.UNIVERSAL_LIGHTING);
                        entries.add(ModBlocks.WHITE_JADE_YELLOW_BEAM_COUCH);
                        entries.add(ModBlocks.XIANGTAI);
                    }).build());

    public static final ItemGroup WALTER_TREND_ROOM = Registry.register(Registries.ITEM_GROUP,
            new Identifier(ArknightsFurniture.MOD_ID,"walter_trend_room"),
            FabricItemGroup.builder().displayName(Text.translatable("itemGroup.walter_trend_room"))
                    .icon(() -> new ItemStack(ModBlocks.CONFINEMENT_FLOOR_LAMP)).entries((displayContext, entries) -> {
                        entries.add(ModBlocks.CONFINEMENT_FLOOR_LAMP);
                        entries.add(ModBlocks.CUBIC_EXTENDED_CHANDELIER);
                        entries.add(ModBlocks.DISPLAY_LAMP_TREE);
                        entries.add(ModBlocks.MINIMALIST_COMBINATION_SOFA_DEFAULT);
                        entries.add(ModBlocks.MODERN_STYLE_PHOTO_FRAME);
                        entries.add(ModBlocks.MOON_SHADOW_DECORATION);
                        entries.add(ModBlocks.PAIRED_STATIC_CHANDELIERS);
                        entries.add(ModBlocks.RECTANGULAR_SPLICING_COFFEE_TABLE);
                        entries.add(ModBlocks.RED_PAINT_STORAGE_CABINET);
                        entries.add(ModBlocks.WOODEN_LOW_CABINET);
                    }).build());

    public static final ItemGroup SPECIAL_EQUIPMENT_EXHIBITION_ROOM = Registry.register(Registries.ITEM_GROUP,
            new Identifier(ArknightsFurniture.MOD_ID,"special_equipment_exhibition_room"),
            FabricItemGroup.builder().displayName(Text.translatable("itemGroup.special_equipment_exhibition_room"))
                    .icon(() -> new ItemStack(ModBlocks.ADHESIVE_SHOCK_BOMB)).entries((displayContext, entries) -> {
                        entries.add(ModBlocks.ADHESIVE_SHOCK_BOMB);
                        entries.add(ModBlocks.COMFORTABLE_SEATS);
                        entries.add(ModBlocks.CONFERENCE_TABLE_DEFAULT);
                        entries.add(ModBlocks.DEFENSE_TARGET);
                        entries.add(ModBlocks.DETACHABLE_ONE_WAY_MIRROR);
                        entries.add(ModBlocks.EMBEDDED_NEWSPAPER_RACK);
                        entries.add(ModBlocks.EMERGENCY_LIGHTING);
                        entries.add(ModBlocks.EXHIBITION_ROOM_CEILING_LIGHT);
                        entries.add(ModBlocks.EXHIBITION_ROOM_MAIN_CEILING_LIGHT);
                        entries.add(ModBlocks.LIGHT_DISCHARGE_SHIELD);
                        entries.add(ModBlocks.MISSILE_INTERCEPTION_SYSTEM);
                        entries.add(ModBlocks.PORTABLE_FIRE_PLATFORM);
                        entries.add(ModBlocks.PORTABLE_GENERATOR);
                        entries.add(ModBlocks.PORTABLE_REINFORCEMENT_DEVICE);
                        entries.add(ModBlocks.PORTABLE_SHIELD);
                        entries.add(ModBlocks.SURVEILLANCE_CAMERA);
                        entries.add(ModBlocks.THROW_DISCHARGE_DEVICE);
                    }).build());

    public static final ItemGroup OFFICE_OF_THE_FIRST_AID_EXPERT_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(ArknightsFurniture.MOD_ID,"office_of_the_first_aid_expert_group"),
            FabricItemGroup.builder().displayName(Text.translatable("itemGroup.office_of_the_first_aid_expert_group"))
                    .icon(() -> new ItemStack(ModBlocks.EMERGENCY_EXPERT_GROUP_OFFICE)).entries((displayContext, entries) -> {
                        entries.add(ModBlocks.CHIEF_PHYSICIAN_CHAIR);
                        entries.add(ModBlocks.EMERGENCY_EXPERT_GROUP_OFFICE);
                        entries.add(ModBlocks.EXTENDED_INDEPENDENT_WORKBENCH_LEFT);
                        entries.add(ModBlocks.EXTENDED_INDEPENDENT_WORKBENCH_RIGHT);
                        entries.add(ModBlocks.INFORMATION_INTEGRATION_EDITION);
                        entries.add(ModBlocks.INTEGRATED_LIGHT_SOURCE);
                        entries.add(ModBlocks.MEDICAL_EQUIPMENT_RACK);
                        entries.add(ModBlocks.MEDICAL_PROJECTOR);
                        entries.add(ModBlocks.MULTIFUNCTIONAL_IRRADIATION_SYSTEM);
                        entries.add(ModBlocks.RESPIRATORY_MAINTENANCE_DEVICE);
                        entries.add(ModBlocks.SCROLL_SCREEN);
                        entries.add(ModBlocks.SURGICAL_AREA_ISOLATION_CURTAIN);
                        entries.add(ModBlocks.VACUUM_CONSTANT_TEMPERATURE_STORAGE_BOX);
                        entries.add(ModBlocks.WORK_BENCH);
                    }).build());

    public static final ItemGroup IBERIA_RESORT = Registry.register(Registries.ITEM_GROUP,
            new Identifier(ArknightsFurniture.MOD_ID,"iberia_resort"),
            FabricItemGroup.builder().displayName(Text.translatable("itemGroup.iberia_resort"))
                    .icon(() -> new ItemStack(ModBlocks.FOLDING_SCREEN)).entries((displayContext, entries) -> {
                        entries.add(ModBlocks.EASY_MUSIC_DRUM);
                        entries.add(ModBlocks.FOLDING_SCREEN);
                        entries.add(ModBlocks.LEISURE_COFFEE_TABLE);
                        entries.add(ModBlocks.OCEAN_TIDE_CHANDELIER);
                        entries.add(ModBlocks.PORTABLE_FOLDING_TABLE);
                        entries.add(ModBlocks.RETRO_LANTERN);
                        entries.add(ModBlocks.SOFT_SOFA_DEFAULT2);
                        entries.add(ModBlocks.TOURIST_STORAGE_CABINET);
                        entries.add(ModBlocks.UPHOLSTERED_WOODEN_CHAIRS);
                        entries.add(ModBlocks.WOODEN_HANGING_LAMP);
                    }).build());

    public static final ItemGroup LENAS_RESTING_PLACE = Registry.register(Registries.ITEM_GROUP,
            new Identifier(ArknightsFurniture.MOD_ID,"lenas_resting_place"),
            FabricItemGroup.builder().displayName(Text.translatable("itemGroup.lenas_resting_place"))
                    .icon(() -> new ItemStack(ModBlocks.INDOOR_SMALL_FLOWER_BED)).entries((displayContext, entries) -> {
                        entries.add(ModBlocks.CONVENIENT_TOOL_HANGING_BOARD);
                        entries.add(ModBlocks.ESSENTIAL_OIL_STORAGE_DEVICE);
                        entries.add(ModBlocks.INDOOR_SMALL_FLOWER_BED);
                        entries.add(ModBlocks.MINOS_HIGH_WAIST_VASE);
                        entries.add(ModBlocks.PERFUME_COUNTER);
                        entries.add(ModBlocks.PET_NEST);
                        entries.add(ModBlocks.PIPELINE_STORAGE_RACK);
                        entries.add(ModBlocks.RAISE_THE_KING_BED);
                        entries.add(ModBlocks.SIMPLE_HIGH_CHAIR);
                        entries.add(ModBlocks.SIMPLE_WALL_MOUNTED_STORAGE_RACK);
                        entries.add(ModBlocks.SPLICING_SUSPENDED_LAMP_TUBES);
                        entries.add(ModBlocks.STACKED_DECORATIVE_CHANDELIER);
                    }).build());

    public static final ItemGroup STUDIO_FOR_PHOTOGRAPHY_ENTHUSIASTS = Registry.register(Registries.ITEM_GROUP,
            new Identifier(ArknightsFurniture.MOD_ID,"studio_for_photography_enthusiasts"),
            FabricItemGroup.builder().displayName(Text.translatable("itemGroup.studio_for_photography_enthusiasts"))
                    .icon(() -> new ItemStack(ModBlocks.FILM_AND_TELEVISION_MAKEUP_STAGE)).entries((displayContext, entries) -> {
                        entries.add(ModBlocks.FILM_AND_TELEVISION_MAKEUP_STAGE);
                        entries.add(ModBlocks.FLOODLIGHT);
                        entries.add(ModBlocks.FLOOR_FITTING_MIRROR);
                        entries.add(ModBlocks.LARGE_OIL_PAINTING);
                        entries.add(ModBlocks.MULTIFUNCTIONAL_BRACKET);
                        entries.add(ModBlocks.PHOTOGRAPHY_AUXILIARY_EQUIPMENT);
                        entries.add(ModBlocks.PHOTOGRAPHY_HIGH_STOOL);
                        entries.add(ModBlocks.PHOTOGRAPHY_WORKBENCH);
                        entries.add(ModBlocks.SIMPLIFIED_FITTING_ROOM);
                        entries.add(ModBlocks.SLIDING_RAIL_TYPE_CEILING_LIGHT_SOURCE);
                        entries.add(ModBlocks.SQUARE_LOW_STOOL);
                        entries.add(ModBlocks.TRANSPARENT_HANGING_CURTAIN);
                        entries.add(ModBlocks.WHEEL_WORK_CHAIR);
                    }).build());

    public static final ItemGroup DOSORES_PRIVATE_SPA_ROOM = Registry.register(Registries.ITEM_GROUP,
            new Identifier(ArknightsFurniture.MOD_ID,"dosores_private_spa_room"),
            FabricItemGroup.builder().displayName(Text.translatable("itemGroup.dosores_private_spa_room"))
                    .icon(() -> new ItemStack(ModBlocks.LUXURY_WOODEN_LOW_BED)).entries((displayContext, entries) -> {
                        entries.add(ModBlocks.LAND_BASED_ARTIFICIAL_LANDSCAPING);
                        entries.add(ModBlocks.LUXURY_WOODEN_LOW_BED);
                        entries.add(ModBlocks.MARBLE_ICE_POOL);
                        entries.add(ModBlocks.NOBLE_WILD_CHANDELIER);
                        entries.add(ModBlocks.SEASIDE_IMPRESSION_HIGH_BENCH);
                        entries.add(ModBlocks.SHORT_PLUSH_STOOLS);
                        entries.add(ModBlocks.TREASURE_DISPLAY_CABINET);
                        entries.add(ModBlocks.WARM_CEILING_LIGHT);
                    }).build());

    public static final ItemGroup VICTORIA_GUARDS_COLLEGE_DORMITORY = Registry.register(Registries.ITEM_GROUP,
            new Identifier(ArknightsFurniture.MOD_ID,"victoria_guards_college_dormitory"),
            FabricItemGroup.builder().displayName(Text.translatable("itemGroup.victoria_guards_college_dormitory"))
                    .icon(() -> new ItemStack(ModBlocks.BLUE_WOOLEN_ARMCHAIR)).entries((displayContext, entries) -> {
                        entries.add(ModBlocks.BLUE_WOOLEN_ARMCHAIR);
                        entries.add(ModBlocks.CHALKY_PILLAR_BOTTOM);
                        entries.add(ModBlocks.CHALKY_PILLAR_DEFAULT);
                        entries.add(ModBlocks.CHALKY_PILLAR_MIDDLE);
                        entries.add(ModBlocks.CHALKY_PILLAR_UPPER);
                        entries.add(ModBlocks.CHENS_LUGGAGE);
                        entries.add(ModBlocks.CIRCULAR_CHANDELIER);
                        entries.add(ModBlocks.DINNER_TABLE);
                        entries.add(ModBlocks.ECOLOGICAL_CULTIVATION_BOX);
                        entries.add(ModBlocks.IMITATION_SOURCE_STONE_ICE_CRYSTAL_STATUE);
                        entries.add(ModBlocks.SOFT_CEILING_LIGHT2);
                        entries.add(ModBlocks.STANDARD_DOUBLE_BED);
                        entries.add(ModBlocks.STANDARD_MULTIFUNCTIONAL_BRACKET);
                        entries.add(ModBlocks.WALL_MOUNTED_DISPLAY_RACK);
                    }).build());

    public static final ItemGroup KNIGHTS_OF_THE_RED_PINE_LOUNGE = Registry.register(Registries.ITEM_GROUP,
            new Identifier(ArknightsFurniture.MOD_ID,"knights_of_the_red_pine_lounge"),
            FabricItemGroup.builder().displayName(Text.translatable("itemGroup.knights_of_the_red_pine_lounge"))
                    .icon(() -> new ItemStack(ModBlocks.HANDSHAKE)).entries((displayContext, entries) -> {
                        entries.add(ModBlocks.CANDLESTICK_WALL_LAMP);
                        entries.add(ModBlocks.CAVALRY_SHAPED_FLOOR_LAMP);
                        entries.add(ModBlocks.HANDSHAKE);
                        entries.add(ModBlocks.INCLUDING_LOOSE_DECORATIVE_COLUMNS_BOTTOM);
                        entries.add(ModBlocks.INCLUDING_LOOSE_DECORATIVE_COLUMNS_UPPER);
                        entries.add(ModBlocks.NARROW_WASHBASIN);
                        entries.add(ModBlocks.NEW_GREEN_BOTTLE_INSERT);
                        entries.add(ModBlocks.SIMPLE_VERTICAL_TUBE_CHANDELIER);
                        entries.add(ModBlocks.STEEL_PIPE_SOFA_CHAIR);
                        entries.add(ModBlocks.SUNDRY_DISPLAY_CABINET);
                    }).build());

    public static final ItemGroup CASIMIR_LIVE_ROOM = Registry.register(Registries.ITEM_GROUP,
            new Identifier(ArknightsFurniture.MOD_ID,"casimir_live_room"),
            FabricItemGroup.builder().displayName(Text.translatable("itemGroup.casimir_live_room"))
                    .icon(() -> new ItemStack(ModBlocks.DIAMOND_MODERN_LIVE_CHANNEL)).entries((displayContext, entries) -> {
                        entries.add(ModBlocks.COLUMNAR_LIVE_STREAMING_DISPLAY_SCREEN);
                        entries.add(ModBlocks.DIAMOND_MODERN_LIVE_CHANNEL);
                        entries.add(ModBlocks.DUAL_COLOR_GRADIENT_DISPLAY_SCREEN);
                        entries.add(ModBlocks.DUAL_COLOR_MOBILE_BAFFLE_IN_THE_INTERVIEW_ROOM);
                        entries.add(ModBlocks.FLAG_SHAPED_DISPLAY_SCREEN);
                        entries.add(ModBlocks.RED_AND_WHITE_INTERVIEW_CHAIRS);
                        entries.add(ModBlocks.RING_DISPLAY_PENDANT_LAMP);
                        entries.add(ModBlocks.SIMPLE_TRANSPARENT_DISPLAY_SCREEN);
                        entries.add(ModBlocks.SLIDE_LIVE_CAMERA);
                        entries.add(ModBlocks.SPECIAL_CEILING_LIGHT_FOR_LIVE_BROADCAST_ROOM);
                        entries.add(ModBlocks.TO_CARVE_FLAMES);
                        entries.add(ModBlocks.TRAPEZOIDAL_LOW_LEGGED_INTERVIEW_TABLE);
                        entries.add(ModBlocks.WHITE_LEATHER_LIVE_STREAMING_CHAIR);
                        entries.add(ModBlocks.WHITE_LEATHER_LIVE_STREAMING_STOOL);
                    }).build());

    public static final ItemGroup AVANT_GARDE_ARCADE_HALL = Registry.register(Registries.ITEM_GROUP,
            new Identifier(ArknightsFurniture.MOD_ID,"avant_garde_arcade_hall"),
            FabricItemGroup.builder().displayName(Text.translatable("itemGroup.avant_garde_arcade_hall"))
                    .icon(() -> new ItemStack(ModBlocks.ARCADE_HALL_ADVERTISING_BOARD)).entries((displayContext, entries) -> {
                        entries.add(ModBlocks.ARCADE_HALL_ADVERTISING_BOARD);
                        entries.add(ModBlocks.AVANT_GARDE_HIGH_CHAIR);
                        entries.add(ModBlocks.AVANT_GARDE_LONG_LEGGED_STOOL);
                        entries.add(ModBlocks.AVANT_GARDE_VENDING_MACHINE);
                        entries.add(ModBlocks.CACTUS_LAMP_TUBE);
                        entries.add(ModBlocks.GUN_SHOOTING_MACHINE);
                        entries.add(ModBlocks.HANGING_DISPLAY_SCREEN);
                        entries.add(ModBlocks.MUSIC_DANCE_MACHINE);
                        entries.add(ModBlocks.PINBALL_MACHINE);
                        entries.add(ModBlocks.POWERFUL_DANCE_MACHINE_PLATFORM_ARMREST);
                        entries.add(ModBlocks.RANDOM_GRAFFITI_BOARD);
                        entries.add(ModBlocks.REPLENISHMENT_TROLLEY);
                        entries.add(ModBlocks.SIMPLE_FRONT_DESK);
                        entries.add(ModBlocks.TRANSPARENT_GLASS_MIRROR);
                    }).build());

    public static final ItemGroup CHERRAG_STYLE_HOTEL = Registry.register(Registries.ITEM_GROUP,
            new Identifier(ArknightsFurniture.MOD_ID,"cherrag_style_hotel"),
            FabricItemGroup.builder().displayName(Text.translatable("itemGroup.cherrag_style_hotel"))
                    .icon(() -> new ItemStack(ModBlocks.LAKE_LIGHT_WATER_COLOR_CURTAIN)).entries((displayContext, entries) -> {
                        entries.add(ModBlocks.DOUBLE_STACKED_CABINET);
                        entries.add(ModBlocks.INVITE_FRIENDS_TO_EXPLORE_LANTERN);
                        entries.add(ModBlocks.LAKE_LIGHT_WATER_COLOR_CURTAIN);
                        entries.add(ModBlocks.NEW_TEA_DUSTPAN_RACK);
                        entries.add(ModBlocks.POETIC_AXIS);
                        entries.add(ModBlocks.QINGYAN_TEA_COOKING_PLATFORM);
                        entries.add(ModBlocks.SHU_EMBROIDERY_YARN_PILLAR);
                        entries.add(ModBlocks.TEA_PICKING_BASKET);
                        entries.add(ModBlocks.TRANSPARENT_BAMBOO_CURTAIN);
                        entries.add(ModBlocks.WALL_LAMP);
                        entries.add(ModBlocks.YELLOW_PEAR_WOOD_CHESS_TABLE);
                        entries.add(ModBlocks.YELLOW_PEAR_WOOD_SQUARE_STOOL);
                    }).build());
    // public static final ItemGroup  = Registry.register(Registries.ITEM_GROUP,
    //        new Identifier(ArknightsFurniture.MOD_ID,""),
    //        FabricItemGroup.builder().displayName(Text.translatable("itemgroup."))
    //                .icon(() -> new ItemStack(ModBlocks.)).entries((displayContext, entries) -> {
    //                    entries.add(ModBlocks.);
    //                }).build());
    public static void registerItemGroup(){
        ArknightsFurniture.LOGGER.info("Registering Item Groups for" + ArknightsFurniture.MOD_ID);
    }
}
