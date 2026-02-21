package com.liuxss.lxatomic.common.registry;

import com.liuxss.lxatomic.LXsAtomic;
import com.liuxss.lxatomic.common.item.*;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {

    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(LXsAtomic.MODID);

    public static final DeferredItem<Item> URANIUM_INGOT = ITEMS.registerItem("uranium_ingot", UraniumIngot::new);
    public static final DeferredItem<Item> URANIUM_SALT = ITEMS.registerItem("uranium_salt", UraniumSalt::new);
    public static final DeferredItem<Item> URANINITE_DUST = ITEMS.registerItem("uraninite_dust", UraniniteDust::new);
    public static final DeferredItem<Item> YELLOWCAKE = ITEMS.registerItem("yellowcake", Yellowcake::new);
    public static final DeferredItem<Item> URANIUM_NUGGET = ITEMS.registerItem("uranium_nugget", UraniumNugget::new);
    public static final DeferredItem<Item> BEAKER = ITEMS.registerItem("beaker", Beaker::new);
    public static final DeferredItem<Item> ERLENMEYER_FLASK = ITEMS.registerItem("erlenmeyer_flask", ErlenmeyerFlask::new);
    public static final DeferredItem<Item> ROUND_BOTTOM_FLASK = ITEMS.registerItem("round_bottom_flask", RoundBottomFlask::new);

    public static final DeferredItem<Item> URANINITE_ORE = ITEMS.registerItem("uraninite_ore",
            properties -> new BlockItem(ModBlocks.URANINITE_ORE.get(), properties));
}