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
        spawnParticles(level, pos);
    }

    private static void spawnParticles(Level level, BlockPos pos) {
        double d0 = (double)0.5625F;
        RandomSource randomsource = level.random;
        for(Direction direction : Direction.values()) {
            BlockPos blockpos = pos.relative(direction);
            if (!level.getBlockState(blockpos).isSolidRender()) {
                Direction.Axis direction$axis = direction.getAxis();
                double d1 = direction$axis == Direction.Axis.X ? (double)0.5F + (double)0.5625F * (double)direction.getStepX() : (double)randomsource.nextFloat();
                double d2 = direction$axis == Direction.Axis.Y ? (double)0.5F + (double)0.5625F * (double)direction.getStepY() : (double)randomsource.nextFloat();
                double d3 = direction$axis == Direction.Axis.Z ? (double)0.5F + (double)0.5625F * (double)direction.getStepZ() : (double)randomsource.nextFloat();
                level.addParticle(new DustParticleOptions(0xE6D200, 1.0F), (double)pos.getX() + d1, (double)pos.getY() + d2, (double)pos.getZ() + d3, (double)0.0F, (double)0.0F, (double)0.0F);
            }
        }
    }
}
