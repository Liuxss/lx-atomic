package com.liuxss.lxatomic.common.item;

import com.liuxss.lxatomic.common.utility.Radiation;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

public class UraniumNugget extends Item {
    public UraniumNugget (Properties properties) {
        super(properties
                .stacksTo(64)
        );
    }

    @Override
    public void inventoryTick(ItemStack stack, Level level, Entity entity, int slotId, boolean isSelected) {
        if (entity instanceof LivingEntity livingEntity) {
            // Llamamos a nuestra utilidad (Severidad 1 para el lingote)
            Radiation.applyRadiation(livingEntity, level, 1);
        }
    }
}
