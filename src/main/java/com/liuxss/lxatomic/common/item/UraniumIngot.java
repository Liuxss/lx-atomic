package com.liuxss.lxatomic.common.item;

import com.liuxss.lxatomic.common.registry.ModEffects;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import org.jspecify.annotations.Nullable;

public class UraniumIngot extends Item {
    public UraniumIngot(Properties properties) {
        super(properties
                .stacksTo(64)
        );
    }

    @Override
    public void inventoryTick(ItemStack stack, ServerLevel level, Entity entity, @Nullable EquipmentSlot slot) {
        super.inventoryTick(stack, level, entity, slot);
        if (entity instanceof LivingEntity livingEntity) {
            // Solo en servidor
            if (!level.isClientSide() && level.getGameTime() % 20 == 0) {
                livingEntity.addEffect(new MobEffectInstance(
                        ModEffects.RADIATION,200, 2));
            }
        }
    }
}