package com.liuxss.lxatomic.common.block;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.core.particles.DustParticleOptions;
import net.minecraft.util.RandomSource;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.MapColor;

import com.liuxss.lxatomic.common.utility.GeneralClass;

public class UraniniteOre extends Block {
    public UraniniteOre(BlockBehaviour.Properties properties) {
        super(properties
                .mapColor(MapColor.EMERALD)
                .strength(1f, 10f)
                .sound(SoundType.STONE)
                .lightLevel(state -> 10)
                .requiresCorrectToolForDrops()
        );
    }

    public void animateTick(BlockState state, Level level, BlockPos pos, RandomSource random) {
        GeneralClass.spawnParticles(level, pos, 0x009900);
    }
}
