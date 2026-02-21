package com.liuxss.lxatomic.common.registry;

import com.liuxss.lxatomic.LXsAtomic;
import com.liuxss.lxatomic.common.block.UraniniteOre;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Function;

public class ModBlocks {
    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(LXsAtomic.MODID);

    public static final DeferredBlock<Block> URANINITE_ORE;
    static {
        URANINITE_ORE = register("uraninite_ore", UraniniteOre::new);
    }

    private static <B extends Block> DeferredBlock<B> register(String name, Function<BlockBehaviour.Properties, ? extends B> supplier) {
        return BLOCKS.registerBlock(name, supplier);
    }
}
