package com.besson.arknights.block;

import com.besson.arknights.ArknightsFurniture;
import com.besson.arknights.block.EdgeSolid_OrangeSimpleHome.*;
import com.besson.arknights.block.FreightWarehouse.*;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlocks {
    public static final Block CARDBOARD_BOX = registerBlock("cardboard_box", new CardboardBox(FabricBlockSettings.copyOf(Blocks.STONE).notSolid().nonOpaque()));
    public static final Block CARGO_PAD = registerBlock("cargo_pad", new CargoPad(FabricBlockSettings.copyOf(Blocks.STONE).notSolid().nonOpaque()));
    public static final Block CARTON_STOOL = registerBlock("carton_stool", new CartonStool(FabricBlockSettings.copyOf(Blocks.STONE).notSolid().nonOpaque()));
    public static final Block FREIGHT_CARTS = registerBlock("freight_carts", new FreightCarts(FabricBlockSettings.copyOf(Blocks.STONE).notSolid().nonOpaque()));
    public static final Block LARGE_SHELVES1 = registerBlock("large_shelves1", new LargeShelves(FabricBlockSettings.copyOf(Blocks.STONE).notSolid().nonOpaque()));
    public static final Block LARGE_SHELVES2 = registerBlock("large_shelves2", new LargeShelves(FabricBlockSettings.copyOf(Blocks.STONE).notSolid().nonOpaque()));
    public static final Block LARGE_SHELVES3 = registerBlock("large_shelves3", new LargeShelves(FabricBlockSettings.copyOf(Blocks.STONE).notSolid().nonOpaque()));
    public static final Block LARGE_SHELVES4 = registerBlock("large_shelves4", new LargeShelves(FabricBlockSettings.copyOf(Blocks.STONE).notSolid().nonOpaque()));
    public static final Block MANY_CARDBOARD_BOXES = registerBlock("many_cardboard_boxes", new ManyCardboardBoxes(FabricBlockSettings.copyOf(Blocks.STONE).notSolid().nonOpaque()));
    public static final Block PORTABLE_CALCULATOR = registerBlock("portable_calculator", new PortableCalculator(FabricBlockSettings.copyOf(Blocks.STONE).notSolid().nonOpaque()));
    public static final Block PRACTICAL_AIR_CUSHION = registerBlock("practical_air_cushion", new PracticalAirCushion(FabricBlockSettings.copyOf(Blocks.STONE).notSolid().nonOpaque()));
    public static final Block QUICK_POSTIT_NOTES = registerBlock("quick_postit_notes", new QuickPostitNotes(FabricBlockSettings.copyOf(Blocks.STONE).notSolid().nonOpaque()));
    public static final Block SHIFT_ATTENDANCE_BOARD = registerBlock("shift_attendance_board", new ShiftAttendanceBoard(FabricBlockSettings.copyOf(Blocks.STONE).notSolid().nonOpaque()));
    public static final Block STREET_GRAFFITI = registerBlock("street_graffiti", new StreetGraffiti(FabricBlockSettings.copyOf(Blocks.STONE).notSolid().nonOpaque()));
    public static final Block BLACK_MINIMALIST_CLOCK = registerBlock("black_minimalist_clock",new BlackMinimalistClock(FabricBlockSettings.copyOf(Blocks.STONE).notSolid().nonOpaque()));
    public static final Block BLACK_MINIMALIST_DESK_LEFT = registerBlock("black_minimalist_desk_left",new BlackMinimalistDesk(FabricBlockSettings.copyOf(Blocks.STONE).notSolid().nonOpaque()));
    public static final Block BLACK_MINIMALIST_DESK_RIGHT = registerBlock("black_minimalist_desk_right",new BlackMinimalistDesk(FabricBlockSettings.copyOf(Blocks.STONE).notSolid().nonOpaque()));
    public static final Block BLACK_ROLLER_BACKREST = registerBlock("black_roller_backrest",new BlackRollerBackrest(FabricBlockSettings.copyOf(Blocks.STONE).notSolid().nonOpaque()));
    public static final Block BLACK_TABLE_CABINET = registerBlock("black_table_cabinet",new BlackTableCabinet(FabricBlockSettings.copyOf(Blocks.STONE).notSolid().nonOpaque()));
    public static final Block CLEAR_BLACK_TV = registerBlock("clear_black_tv",new ClearBlackTV(FabricBlockSettings.copyOf(Blocks.STONE).notSolid().nonOpaque()));
    public static final Block MINI_BULLETIN_BOARD = registerBlock("mini_bulletin_board",new MiniBulletinBoard(FabricBlockSettings.copyOf(Blocks.STONE).notSolid().nonOpaque()));
    public static final Block PORCELAIN_BED = registerBlock("porcelain_bed",new PorcelainBed(FabricBlockSettings.copyOf(Blocks.STONE).notSolid().nonOpaque()));
    public static final Block PORCELAIN_BEDSIDE_TABLE = registerBlock("porcelain_bedside_table",new PorcelainBedsideTable(FabricBlockSettings.copyOf(Blocks.STONE).notSolid().nonOpaque()));
    public static final Block PORCELAIN_WALL_LAMP = registerBlock("porcelain_wall_lamp",new PorcelainWallLamp(FabricBlockSettings.copyOf(Blocks.STONE).notSolid().nonOpaque()));
    public static final Block SOLID_CHECKERBOARD_BOOKCASE1 = registerBlock("solid_checkerboard_bookcase1",new SolidCheckerboardBookcase(FabricBlockSettings.copyOf(Blocks.STONE).notSolid().nonOpaque()));
    public static final Block SOLID_CHECKERBOARD_BOOKCASE2 = registerBlock("solid_checkerboard_bookcase2",new SolidCheckerboardBookcase(FabricBlockSettings.copyOf(Blocks.STONE).notSolid().nonOpaque()));
    public static final Block SOLID_CHECKERBOARD_BOOKCASE3 = registerBlock("solid_checkerboard_bookcase3",new SolidCheckerboardBookcase(FabricBlockSettings.copyOf(Blocks.STONE).notSolid().nonOpaque()));
    public static final Block SOLID_COLOR_SOFA_DEFAULT = registerBlock("solid_color_sofa_default",new SolidColorSofa(FabricBlockSettings.copyOf(Blocks.STONE).notSolid().nonOpaque()));
    public static final Block SOLID_RIGHT_ANGLE_COFFEE_TABLE = registerBlock("solid_right_angle_coffee_table",new SolidRightAngleCoffeeTable(FabricBlockSettings.copyOf(Blocks.STONE).notSolid().nonOpaque()));
    public static final Block CLEAR_ORANGE_TV = registerBlock("clear_orange_tv",new ClearBlackTV(FabricBlockSettings.copyOf(Blocks.STONE).notSolid().nonOpaque()));
    public static final Block MINI_BULLETIN_BOARD2 = registerBlock("mini_bulletin_board2",new MiniBulletinBoard(FabricBlockSettings.copyOf(Blocks.STONE).notSolid().nonOpaque()));
    public static final Block ORANGE_BED = registerBlock("orange_bed",new PorcelainBed(FabricBlockSettings.copyOf(Blocks.STONE).notSolid().nonOpaque()));
    public static final Block ORANGE_BEDSIDE_TABLE = registerBlock("orange_bedside_table",new PorcelainBed(FabricBlockSettings.copyOf(Blocks.STONE).notSolid().nonOpaque()));
    public static final Block ORANGE_CHECKERBOARD_BOOKCASE_1 = registerBlock("orange_checkerboard_bookcase1",new SolidCheckerboardBookcase(FabricBlockSettings.copyOf(Blocks.STONE).notSolid().nonOpaque()));
    public static final Block ORANGE_CHECKERBOARD_BOOKCASE_2 = registerBlock("orange_checkerboard_bookcase2",new SolidCheckerboardBookcase(FabricBlockSettings.copyOf(Blocks.STONE).notSolid().nonOpaque()));
    public static final Block ORANGE_CHECKERBOARD_BOOKCASE_3 = registerBlock("orange_checkerboard_bookcase3",new SolidCheckerboardBookcase(FabricBlockSettings.copyOf(Blocks.STONE).notSolid().nonOpaque()));
    public static final Block ORANGE_COLOR_SOFA_DEFAULT = registerBlock("orange_color_sofa_default",new SolidColorSofa(FabricBlockSettings.copyOf(Blocks.STONE).notSolid().nonOpaque()));
    public static final Block ORANGE_MINIMALIST_CLOCK = registerBlock("orange_minimalist_clock",new BlackMinimalistClock(FabricBlockSettings.copyOf(Blocks.STONE).notSolid().nonOpaque()));
    public static final Block ORANGE_MINIMALIST_DESK_LEFT = registerBlock("orange_minimalist_desk_left",new BlackMinimalistDesk(FabricBlockSettings.copyOf(Blocks.STONE).notSolid().nonOpaque()));
    public static final Block ORANGE_MINIMALIST_DESK_RIGHT = registerBlock("orange_minimalist_desk_right",new BlackMinimalistClock(FabricBlockSettings.copyOf(Blocks.STONE).notSolid().nonOpaque()));
    public static final Block ORANGE_RIGHT_ANGLE_COFFEE_TABLE = registerBlock("orange_right_angle_coffee_table",new SolidRightAngleCoffeeTable(FabricBlockSettings.copyOf(Blocks.STONE).notSolid().nonOpaque()));
    public static final Block ORANGE_ROLLER_BACKREST = registerBlock("orange_roller_backrest",new BlackRollerBackrest(FabricBlockSettings.copyOf(Blocks.STONE).notSolid().nonOpaque()));
    public static final Block ORANGE_TABLE_CABINET = registerBlock("orange_table_cabinet",new BlackTableCabinet(FabricBlockSettings.copyOf(Blocks.STONE).notSolid().nonOpaque()));
    public static final Block ORANGE_WALL_LAMP = registerBlock("orange_wall_lamp",new PorcelainWallLamp(FabricBlockSettings.copyOf(Blocks.STONE).notSolid().nonOpaque()));

    private static Block registerBlock(String name,Block block){
        registerBlockItem(name,block);
        return Registry.register(Registries.BLOCK,new Identifier(ArknightsFurniture.MOD_ID,name),block);
    }
    private static Item registerBlockItem(String name, Block block){
        return Registry.register(Registries.ITEM,new Identifier(ArknightsFurniture.MOD_ID,name),
                new BlockItem(block,new FabricItemSettings()));
    }
    public static void registerModBlocks(){
        ArknightsFurniture.LOGGER.info("Registering Mod Blocks for" + ArknightsFurniture.MOD_ID);
    }
}
