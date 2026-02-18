package com.liuxss.lxatomic;

import net.neoforged.bus.api.IEventBus;
import org.slf4j.Logger;
import com.liuxss.lxatomic.common.registry.*;

import com.mojang.logging.LogUtils;

import net.neoforged.fml.common.Mod;
@Mod(LXsAtomic.MODID)
public class LXsAtomic {
    public static final String MODID = "lxatomic";
    public static final Logger LOGGER = LogUtils.getLogger();

    public LXsAtomic(IEventBus modEventBus) {
        ModBlocks.BLOCKS.register(modEventBus);
        ModItems.ITEMS.register(modEventBus);
        ModCreativeTabs.CREATIVE_TABS.register(modEventBus);
    }
}
