package com.liuxss.lxatomic.common.utility;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.core.particles.DustParticleOptions;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.Level;

public class GeneralClass {
    public static void spawnParticles(Level level, BlockPos pos, int color) {
        double d0 = (double)0.5625F;
        RandomSource randomsource = level.random;
        for(Direction direction : Direction.values()) {
            BlockPos blockpos = pos.relative(direction);
            if (!level.getBlockState(blockpos).isSolidRender()) {
                Direction.Axis direction$axis = direction.getAxis();
                double d1 = direction$axis == Direction.Axis.X ? (double)0.5F + (double)0.5625F * (double)direction.getStepX() : (double)randomsource.nextFloat();
                double d2 = direction$axis == Direction.Axis.Y ? (double)0.5F + (double)0.5625F * (double)direction.getStepY() : (double)randomsource.nextFloat();
                double d3 = direction$axis == Direction.Axis.Z ? (double)0.5F + (double)0.5625F * (double)direction.getStepZ() : (double)randomsource.nextFloat();
                level.addParticle(new DustParticleOptions(color, 1.0F), (double)pos.getX() + d1, (double)pos.getY() + d2, (double)pos.getZ() + d3, (double)0.0F, (double)0.0F, (double)0.0F);
            }
        }
    }
}
