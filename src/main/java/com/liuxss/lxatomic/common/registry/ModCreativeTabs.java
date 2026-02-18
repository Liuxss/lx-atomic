package com.liuxss.lxatomic.common.registry;

import com.liuxss.lxatomic.LXsAtomic;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModCreativeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, LXsAtomic.MODID);

    public static final Supplier<CreativeModeTab> TAB_LXSATOMIC = CREATIVE_TABS.register(LXsAtomic.MODID,
            () -> CreativeModeTab.builder()
                    .title(Component.translatable("itemGroup.lxatomic_tab"))
                    .icon(() -> new ItemStack(ModItems.URANIUM_INGOT.get()))
                    .displayItems(((params, output) -> {
                        output.accept(
                                ModItems.URANIUM_INGOT.get());
                    }))
                    .build()
    );
}
