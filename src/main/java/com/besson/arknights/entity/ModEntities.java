package com.besson.arknights.entity;

import com.besson.arknights.ArknightsFurniture;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.entity.mob.MobEntity;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

import java.util.function.Supplier;

public class ModEntities {
    public static final EntityType<SeatEntity> SEAT = Registry.register(Registries.ENTITY_TYPE, new Identifier(ArknightsFurniture.MOD_ID, "seat"),
            FabricEntityTypeBuilder.create(SpawnGroup.MISC, SeatEntity::new).dimensions(EntityDimensions.fixed(0.001F, 0.001F)).build());
    public static void init(){

    }
}