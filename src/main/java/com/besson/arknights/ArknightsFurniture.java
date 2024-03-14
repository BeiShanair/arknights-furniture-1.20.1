package com.besson.arknights;

import com.besson.arknights.block.ModBlocks;
import com.besson.arknights.entity.ModEntities;
import com.besson.arknights.item.ModItemGroups;
import com.besson.arknights.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ArknightsFurniture implements ModInitializer {
	public static final String MOD_ID = "arknights_furniture";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
		ModItemGroups.registerItemGroup();
		ModBlocks.registerModBlocks();
		ModEntities.init();
		LOGGER.info("Hello Fabric world!");
	}
}