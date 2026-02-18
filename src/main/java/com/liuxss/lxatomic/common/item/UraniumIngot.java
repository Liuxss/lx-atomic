package com.liuxss.lxatomic.common.item;

import com.liuxss.lxatomic.common.utility.Radiation;
import net.minecraft.world.entity.Entity; // <--- DEBE SER ESTE
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

public class UraniumIngot extends Item {
    public UraniumIngot(Properties properties) {
        super(properties
                .stacksTo(64)
        );
    }

    @Override
    public void inventoryTick(ItemStack stack, Level level, Entity entity, int slotId, boolean isSelected) {
        // Primero verificamos si es una entidad viva para llamar a nuestra utilidad
        if (entity instanceof LivingEntity livingEntity) {
            Radiation.applyRadiation(livingEntity, level, 1);
        }
    }
}