package com.liuxss.lxatomic.common.registry;

import com.liuxss.lxatomic.LXsAtomic;
import com.liuxss.lxatomic.common.item.UraniumIngot;
import com.liuxss.lxatomic.common.item.UraniumNugget;
import com.liuxss.lxatomic.common.item.UraniumSalt;
import net.minecraft.world.item.Item;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {

    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(LXsAtomic.MODID);

    public static final DeferredItem<Item> URANIUM_INGOT = ITEMS.registerItem("uranium_ingot", UraniumIngot::new);
    public static final DeferredItem<Item> URANIUM_SALT = ITEMS.registerItem("uranium_salt", UraniumSalt::new);
    public static final DeferredItem<Item> URANIUM_NUGGET = ITEMS.registerItem("uranium_nugget", UraniumNugget::new);
}
