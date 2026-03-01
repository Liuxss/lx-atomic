package com.liuxss.lxatomic.common.item;

import net.minecraft.world.item.Item;

public class FlaskUtils extends Item {
    public FlaskUtils (Properties properties) {
        super(properties
                .stacksTo(32)
        );
    }
}
