package com.liuxss.lxatomic.common.utility;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.level.Level;

public class Radiation {
    public static void applyRadiation(LivingEntity entity, Level level, int severity) {
        if (!level.isClientSide()) {
            // Aplicar efectos según la severidad
            entity.addEffect(new MobEffectInstance(MobEffects.HUNGER, 100, severity, false, false));

            if (severity >= 1) {
                entity.addEffect(new MobEffectInstance(MobEffects.POISON, 100, 0, false, false));
            }
            // Daño directo cada 2 segundos (40 ticks)
            if (level.getGameTime() % 40 == 0) {
                entity.hurt(level.damageSources().magic(), 1.0f * (severity + 1));
            }
        }
    }
}
