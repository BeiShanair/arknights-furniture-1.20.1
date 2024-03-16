package com.besson.arknights.datagen;

import com.besson.arknights.block.ModBlocks;
import com.besson.arknights.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.CARDBOARD_BOX);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.CARGO_PAD);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.CARTON_STOOL);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.FREIGHT_CARTS);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.LARGE_SHELVES1);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.LARGE_SHELVES2);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.LARGE_SHELVES3);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.LARGE_SHELVES4);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.MANY_CARDBOARD_BOXES);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.PORTABLE_CALCULATOR);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.PRACTICAL_AIR_CUSHION);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.QUICK_POSTIT_NOTES);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.SHIFT_ATTENDANCE_BOARD);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.STREET_GRAFFITI);

        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.BLACK_MINIMALIST_CLOCK);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.BLACK_MINIMALIST_DESK_LEFT);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.BLACK_MINIMALIST_DESK_RIGHT);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.BLACK_ROLLER_BACKREST);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.BLACK_TABLE_CABINET);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.CLEAR_BLACK_TV);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.MINI_BULLETIN_BOARD);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.PORCELAIN_BED);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.PORCELAIN_BEDSIDE_TABLE);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.PORCELAIN_WALL_LAMP);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.SOLID_CHECKERBOARD_BOOKCASE1);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.SOLID_CHECKERBOARD_BOOKCASE2);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.SOLID_CHECKERBOARD_BOOKCASE3);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.SOLID_RIGHT_ANGLE_COFFEE_TABLE);

        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.CLEAR_ORANGE_TV);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.MINI_BULLETIN_BOARD2);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.ORANGE_BED);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.ORANGE_BEDSIDE_TABLE);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.ORANGE_CHECKERBOARD_BOOKCASE_1);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.ORANGE_CHECKERBOARD_BOOKCASE_2);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.ORANGE_CHECKERBOARD_BOOKCASE_3);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.ORANGE_MINIMALIST_CLOCK);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.ORANGE_MINIMALIST_DESK_LEFT);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.ORANGE_MINIMALIST_DESK_RIGHT);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.ORANGE_RIGHT_ANGLE_COFFEE_TABLE);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.ORANGE_ROLLER_BACKREST);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.ORANGE_TABLE_CABINET);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.ORANGE_WALL_LAMP);

        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.BASKET_SHAPED_LOW_COFFEE_TABLE);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.BROAD_LEAVED_POTTED_PLANTS);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.BROWN_LAZY_SOFA);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.CONIFEROUS_POTTED_PLANT);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.ECOLOGICAL_EXHIBITION_CABINET_BASE);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.ECOLOGICAL_EXHIBITION_CABINET_MAIN);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.EMBEDDED_SQUARE_CEILING_LIGHT);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.EMBEDDED_WIDE_CEILING_LIGHT);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.EXHIBITION_SPECIMEN_INFORMATION_BOARD);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.METAL_BED);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.SQUARE_BEDSIDE_CABINET);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.THICK_LEAVED_POTTED_PLANT);

        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.CABIN_CEILING_COMPONENTS);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.CABIN_COMBINATION_DOUBLE_BED);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.CABIN_FIRE_EXTINGUISHER_SET);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.CABIN_NOTE_BOARD);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.COMBINATION_ROLLER_BACKREST);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.COMBINATION_WORKBENCH_LEFT);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.COMBINATION_WORKBENCH_RIGHT);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.CONTROL_DISPLAY);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.EMBEDDED_DATA_CABINET1);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.EMBEDDED_DATA_CABINET2);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.EXPLOSION_PROOF_GARBAGE_BIN);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.LIFE_CYCLE_MODULE_CONTROL_CONSOLE);

        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.BAR_COUNTER_CEILING);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.BEVERAGE_DISPLAY_RACK_COFFEE1);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.BEVERAGE_DISPLAY_RACK_COFFEE2);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.BEVERAGE_DISPLAY_RACK_DC);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.BEVERAGE_DISPLAY_RACK_DRINK);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.BEVERAGE_DISPLAY_RACK_EMPTY);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.BEVERAGE_PRICE_LIST);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.BOLIVAR_COFFEE_BEANS);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.BROWN_LEAP_GRID_BOOKCASE1);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.BROWN_LEAP_GRID_BOOKCASE2);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.BROWN_LEAP_GRID_BOOKCASE3);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.COLUMBIA_STREET_VIEW);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.CURVED_BOTTOM_HIGH_FOOT_COFFEE_CHAIR);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.LONG_LEAVED_POTTED_PLANT);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.ONE_LEGGED_COFFEE_TABLE);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.PAIRED_COFFEE_CHAIRS);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.RED_BRICK_STORAGE_CABINET);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.SOFT_CEILING_LIGHT);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.SUSPENDED_CEILING_LIGHT);

        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.BLACK_ONE_LEGGED_TABLE);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.BLACK_RETRO_STOOL);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.BLACK_VINTAGE_CHAIR);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.BLACK_SIMPLE_LOW_SOFA);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.BRIGHT_HANGING_LAMP);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.DUPLEX_WOODEN_WALL_RAILING);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.SANDALWOOD_BED);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.SANDALWOOD_BEDSIDE_CABINET);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.SANDALWOOD_LOW_FOOT_CONFERENCE_TABLE);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.SANDALWOOD_MEETING_BOARD);

        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.DUPLEX_COPPER_WALL_RAILING);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.GRAY_SIMPLE_LOW_SOFA);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.TEAK_BED);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.TEAK_BEDSIDE_CABINET);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.TEAK_LOW_FOOT_CONFERENCE_TABLE);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.WHITE_ONE_LEGGED_TABLE);

        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.CUSHION_ROCKING_CHAIR);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.HAND_WOVEN_FIREWOOD_BASKET);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.LOG_BACKCHAIR);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.LOG_BEAM);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.LOG_DINING_TABLE);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.LOG_STORAGE_CABINET_DOWN);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.LOG_STORAGE_CABINET_UP1);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.LOG_STORAGE_CABINET_UP2);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.RETRO_CEILING_FAN);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.SPRUCE_VIOLIN);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.THE_BODY_OF_A_LIVING_CREATURE);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.VINTAGE_CHANDELIER);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.WOODEN_SOFA_ELEVATED_BED_DOWN);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.WOODEN_SOFA_ELEVATED_BED_UP);

        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.ACTIVITY_TABLE);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.BACKREST_SINGLE_CHAIR);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.BLACK_CASH_REGISTER);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.BOWL);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.DINING_CABINETS);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.DINING_PLATE);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.DINING_TRAY_RACK);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.EXIT_INDICATOR_LIGHT);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.FLOOR_STANDING_POSTER_STAND);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.HIGH_STOOL);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.PIZZA_BOX);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.PIZZA_POSTER);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.PIZZA_PRICE_LIST1);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.PIZZA_PRICE_LIST2);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.SOFT_LIGHT_CHANDELIERS);

        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.BEVERAGE_TABLE_HIGH_STOOL);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.BILLBOARD_JUKEBOX);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.BLACK_GOLD_FREEZER);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.HOTEL_UNIVERSAL_BAR_COUNTER);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.MODERN_HOTEL_CEILING);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.MODERN_HOTEL_FLOOR_LAMP);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.MODERN_HOTEL_PENDANT_LIGHT);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.MODERN_HOTEL_TEA_TABLE);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.MODERN_HOTEL_WALL_LAMP);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.MODERN_WALL_HANGING_DECORATION);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.TOWER_SHAPED_BAR_COUNTER_SUSPENDED_CEILING);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.TOWER_SHAPED_BAR_COUNTER_SUSPENDED_CEILING2);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.WILLIAM_PIANO_COMBINATION);

        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.CABIN_PIPELINE_VALVES);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.EMERGENCY_PUSH_BED);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.MULTIFUNCTIONAL_DISINFECTOR);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.MULTIFUNCTIONAL_ENGINEERING_SHOVEL);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.SAFETY_CABIN_AIRWAY);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.SAFETY_CABIN_CEILING_LIGHT);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.SAFETY_CABIN_CONTROL_AIRWAY);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.SAFETY_CABIN_DISINFECTION_LIGHT);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.SAFETY_CABIN_DISINFECTION_ROOM);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.SAFETY_CABIN_ENGINEERING_VEHICLE);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.SAFETY_CABIN_FLUORESCENT_LAMP);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.SAFETY_COMPARTMENT_MATERIAL_BOX);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.SUPPLY_RESOURCE_TANK);

        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.CACTUS_POTTED_PLANT);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.CHENS_HONORARY_CERTIFICATE);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.CHENS_OFFICE_CHAIR);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.CHENS_WEAPON_RACK);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.FILE1);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.FILE2);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.FLUORESCENT_LAMPS_FOR_THE_GUARD_BUREAU);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.GENERAL_BOOKCASE_OF_THE_GUARD_BUREAU);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.GENERAL_GARBAGE_BIN_OF_THE_GUARD_BUREAU);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.GUARD_BUREAU_FLUORESCENT_LAMP);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.GUARD_BUREAU_HEALTH_ABDOMEN_PLATE);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.OFFICE_CLUE_BOARD);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.SPECIAL_UPRIGHT_STAKES_MADE_BY_THE_GUARD_BUREAU);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.SPOTLIGHT_FOR_THE_GUARD_BUREAU);

        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.A_SURFERS_BOARD_RACK);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.BEACH_COTTAGE_FLOOR_LAMP);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.BLUE_AND_WHITE_CANVAS_CURTAINS_LEFT);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.BLUE_AND_WHITE_CANVAS_CURTAINS_RIGHT);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.LAZY_HIGH_LEGGED_COFFEE_TABLE);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.LAZY_LOUNGE_CHAIR);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.LAZY_TEA_TABLE);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.RHODE_ISLAND_SUMMER_CALENDAR);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.SIESTA_CITY_EMBLEM_SOUVENIR);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.SUMMER_BOAT_CABINET_DOWN);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.SUMMER_BOAT_CABINET_UP);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.SUMMER_COLLECTION_CABINET);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.WOODEN_TOP_BEAM);

        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.AMBER);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.BLAZE);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.DARK_CLOUDS);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.DRIFTWOOD);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.FROSTING);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.GRAPHITE_STEEL);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.REHEARSAL_ROOM_ACCESSORY_HANGING_BOARD);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.REHEARSAL_ROOM_BENCH);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.REHEARSAL_ROOM_RECEPTION_DESK);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.REHEARSAL_ROOM_ROUND_BENCH);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.REHEARSAL_ROOM_STRAP_HANGING_BOARD);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.REHEARSAL_ROOM_SPOTLIGHT);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.SHALLOW_SEA);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.SPOTLIGHT_CEILING);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.STAGE);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.SUSPENDED_SCROLLING_DISPLAY_SCREEN);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.TOUR_EQUIPMENT_COMBINATION);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.WHEAT_FRAGRANCE);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.WHITE_BIRCH);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.YARMA_KHAN_SHELF_DRUM);

        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.AI_STYLE_COLUMN_DOWN);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.AI_STYLE_COLUMN_UP);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.AI_STYLE_COLUMN_MIDDLE);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.BANQUET_HALL_MAIN_SEAT);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.BANQUET_HALL_SECOND_SEAT);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.BUST_OF_LANCHENG_GUARD);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.CANDLE_DISPLAY_STOVE);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.CEILING_MOUNTED_CANDLE_CHANDELIER);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.DOUBLE_CEILING_CANDLE_CHANDELIER);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.LANCELLAR_BRAZIER);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.LANCELLAR_LOW_STOOL);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.LANCELLAR_MIRROR);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.LOCKED_CABINET);

        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.ABNORMAL_BEDDING_BED);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.ABNORMAL_BEDDING_LIGHT);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.ABNORMAL_BEDDING_TREE);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.AUXILIARY_INSTRUMENT_PENDANT_LAMP);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.CASTING_HONEY_CRUCIBLE);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.ELEGANT_WOODEN_CHAIRS);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.FRAGMENTED_SEQUENCE_DESK);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.LOCK_THE_NIGHT_STONE_WINDOW);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.MORE_YIGUA);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.SEVERAL_YIGUA);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.SHAYI_BOOK_GROUP);

        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.ADJUSTABLE_ROUND_STOOL);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.FLUORESCENT_LAMP_CEILING);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.GOODS_TO_BE_CARRIED);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.HIGH_POWER_FLOOR_LAMP);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.MULTIFUNCTIONAL_WORKBENCH);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.MULTIFUNCTIONAL_WORKBENCH_BOARD);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.MULTIFUNCTIONAL_WORKBENCH_COMPUTER);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.OLD_FASHIONED_RECORD_PLAYER);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.PENGUIN_CLUE_COLLECTION_BOARD);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.RED_GLOVE_COMPARTMENT1);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.RED_GLOVE_COMPARTMENT2);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.RED_GLOVE_COMPARTMENT3);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.SAFETY_PARTITION_DOOR);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.TREASURED_BEVERAGE_BUCKET);

        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.CLEANER);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.DOUBLE_BEAM_CRANE);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.FLOODLIGHT_SUSPENDED_CEILING);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.INDUSTRIAL_CUTTING_TABLE);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.MATERIAL_BOX);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.MECHANICAL_ARM);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.WEAPON_STORAGE_CABINET);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.WHITE_ROUND_STOOL);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.WORKSHOP_BLACKBOARD);

        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.BAMBOO_SCREEN);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.CEILING_LAMP);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.ELECTRIC_FRYING_TABLE);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.FOCUS_LAMP);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.FOOD_WORKSHOP_DINING_TABLE);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.FOOD_WORKSHOP_ROUND_STOOL);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.HALF_MASKED_SCREEN);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.HEXAGONAL_PALACE_LAMP);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.INSCRIPTION_CEILING_DEFAULT);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.INSCRIPTION_CEILING_LONG);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.INSCRIPTION_CEILING_MENG);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.INSCRIPTION_CEILING_JIAO);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.INSCRIPTION_CEILING_ZI);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.INSCRIPTION_CEILING_FANG);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.INSCRIPTION_CEILING_MENU1);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.INSCRIPTION_CEILING_MENU2);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.ORNAMENTAL_PLANT);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.ORNAMENTAL_POTTED_PLANTS);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.SQUARE_BENCH);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.STEWED_POT_PLATFORM);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.STEWED_POT_PLATFORM_POT);

        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.DAILY_RECOMMENDATIONS);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.HEALTH_DECORATION_SIGN);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.HEALTH_DINING_TABLE);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.HEALTH_PRICE_LIST);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.HEALTH_SERVICE_DESK);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.HEALTH_SERVICE_DESK_CASHIER);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.HEALTH_SPOTLIGHT);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.ICED_JUICE_MAKER);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.RELAXED_GARDEN_CEILING);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.SELF_SERVICE_ORDERING_MACHINE);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.SELF_SERVICE_VENDING_MACHINE);

        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.BEER_STORAGE_CABINET);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.DOUBLE_ROW_SOFA_SEAT_DESK);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.FOOD_INSULATION_CABINET);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.HIGH_FOOT_PRICE_LIST);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.LARGE_PROMOTIONAL_BOARD);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.RESTAURANT_PROMOTIONAL_BOARD);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.SEVEN_CITY_STYLE_WARM_LIGHT_CHANDELIER);

        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.BULLETPROOF_GLASS_PARTITION);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.DETONATOR_MAKING_TOOL);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.HANGING_DART_PLATE);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.HANGING_STORAGE_RACK);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.HIGH_FOOT_DINING_TABLE);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.HIGH_YIELD_EXPLOSIVE_RAW_MATERIALS);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.LOUNGE_LIGHT_SOURCE_CEILING);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.LOUNGE_LIGHT_TUBE);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.LOUNGE_NOTICE_BOARD);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.LOUNGE_PENDANT_LIGHT);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.LOUNGE_SMALL_WALL_LAMP);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.RED_FRAMED_FLOOR_MIRROR);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.SAKAZ_PENDULUM);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.SAKAZ_BILLIARDS_TABLE);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.SPOILS_DISPLAY_RACK);

        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.CIRCULAR_SUSPENDED_CEILING);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.CLUB_BULLETIN_BOARD);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.FLOOR_MOUNTED_BOOKSHELF);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.HANGING_LAMP);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.LOW_FLOOR_LAMP);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.LOW_STORAGE_CABINET);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.PORTABLE_PICNIC_STOVE);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.SIMPLE_TOILET_CHAIR);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.WOODEN_LONG_TABLE);

        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.ACCOMPANIMENT_CHAIR);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.ANTIQUE_RECORD_PLAYER);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.BALL_OF_BALANCE);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.BLACK_LACQUER_WHITE_HEAD_CELLO);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.FOUR_CANDLE_CHANDELIER);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.FOUR_COLUMN_BED);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.INTEGRATED_DESK);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.INTEGRATED_DESK_BOTTOM);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.INTEGRATED_DESK_UPPER);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.LETANIA_BEVERAGE);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.MISCELLANEOUS_BOOK_PILE);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.SIX_CANDLE_CHANDELIER);

        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.FLOOR_SIGNS);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.MOVABLE_STORAGE_CABINET);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.OVERLOAD_PRINTER);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.PERSONNEL_OFFICE_LIGHT_SOURCE);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.SHARP_ORNAMENTAL_PLANTS);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.STANDARD_OFFICE_CHAIR);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.STANDARD_OFFICE_DESK);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.STANDARD_OFFICE_DESK_COMPUTER);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.STATION_INDICATOR_BOARD);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.STATION_LIGHT_SOURCE);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.TRANSPARENT_SCREEN_FOR_PARTITION);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.WAITING_SOFA_STOOL);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.WATER_DISPENSER);

        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.POTTED_TROPICAL_PLANTS);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.TOTEM_POT);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.TOTEM_SOUND);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.TRIBAL_DEBRIS_STONE_PIER);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.TRIBAL_DECORATIVE_CHANDELIER);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.TRIBAL_ELEVATED_BED);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.RHODES_ISLAND_LOGO, Models.GENERATED);

    }
}
