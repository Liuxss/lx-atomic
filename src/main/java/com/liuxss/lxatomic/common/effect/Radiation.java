package com.liuxss.lxatomic.common.effect;

import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;

public class Radiation extends MobEffect {

    public Radiation() {
        super(MobEffectCategory.HARMFUL, 0x92E037);
    }
    /*
    @Override
    public boolean shouldApplyEffectTickThisTick(int duration, int amplifier) {
        return true; // Siempre tickea
    }

    @Override
    public boolean applyEffectTick(ServerLevel level, LivingEntity entity, int amplifier) {
        int interval = switch (amplifier) {
            case 0 -> 60; // Nivel 1
            case 1 -> 40; // Nivel 2
            default -> 20; // Nivel 3+
        };

        if (entity.tickCount % interval == 0) {

            // 🥩 HAMBRE
            if (entity instanceof Player player) {
                player.getFoodData().setFoodLevel(
                        Math.max(0, player.getFoodData().getFoodLevel() - (1 + amplifier))
                );
            }

            // 💪 NIVEL 2+
            if (amplifier >= 1) {
                entity.addEffect(new MobEffectInstance(
                        MobEffects.WEAKNESS,
                        200,
                        amplifier - 1, // nivel 2 = weak 0, nivel 3 = weak 1
                        false,
                        false,
                        false
                ));
            }

            // 👁 NIVEL 3+
            if (amplifier >= 2) {
                entity.addEffect(new MobEffectInstance(
                        MobEffects.BLINDNESS,
                        200,
                        0,
                        false,
                        false,
                        false
                ));

                // ❤️ Daño
                entity.hurt(level.damageSources().magic(), 2.0F);
            }
        }

        return true;
    }
    */
}