package com.liuxss.lxatomic.common.registry;

import com.liuxss.lxatomic.LXsAtomic;
import com.liuxss.lxatomic.common.effect.Radiation;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.effect.MobEffect;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModEffects {
    public static final DeferredRegister<MobEffect> EFFECTS = DeferredRegister.create(Registries.MOB_EFFECT, LXsAtomic.MODID);

    public static final DeferredHolder<MobEffect, Radiation> RADIATION = EFFECTS.register("radiation", Radiation::new);
}