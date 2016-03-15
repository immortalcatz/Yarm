package com.unrealdinnerbone.yarm.init;


import java.util.Random;

import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkGenerator;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraftforge.fml.common.IWorldGenerator;

public class ModOreGen implements IWorldGenerator
{
        // Which dimension to generate in by dimension ID (Nether -1, Overworld 0, End 1, etc)
        @Override
        public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider) {
            switch (world.provider.getDimension()) {
                case -1:
                    break;
                case 0:
                    generateSurface(world, random, chunkX * 16, chunkZ * 16);
                    break;
                case 1:
                    break;
            }
        }

        //The actual generation method.
        private void generateSurface(World world, Random rand, int chunkX, int chunkZ) {
            for (int k = 0; k < 16; k++) {
                int firstBlockXCoord = chunkX + rand.nextInt(16);
                int firstBlockZCoord = chunkZ + rand.nextInt(16);
                //Will be found between y = 0 and y = 20
                int quisqueY = rand.nextInt(20);
                BlockPos quisquePos = new BlockPos(firstBlockXCoord, quisqueY, firstBlockZCoord);
                //The 10 as the second parameter sets the maximum vein size
                (new WorldGenMinable(ModBlocks.BLOCK_ANTIMONY_ORE.getDefaultState(), 10)).generate(world, rand, quisquePos);
            }
        }
}