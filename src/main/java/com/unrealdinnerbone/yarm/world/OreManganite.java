package com.unrealdinnerbone.yarm.world;

import com.unrealdinnerbone.yarm.init.ModBlocks;
import cpw.mods.fml.common.IWorldGenerator;
import net.minecraft.block.Block;
import net.minecraft.block.BlockSponge;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;

import java.util.Random;

public class OreManganite implements IWorldGenerator {
    @Override
    public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
        switch (world.provider.dimensionId)
        {
            case -1:
                generateNether(random, chunkX * 16, chunkZ * 16, world);
                break;
            case 0:
                generateOverWorld(random, chunkX * 16, chunkZ * 16, world);
                break;
            case 1:
                generateEnd(random, chunkX * 16, chunkZ * 16, world);
                break;
            default:

        }
    }

    private void addOre(Block block, Block blockSpawn, Random random, World world,
        int posX, int posZ, int minY,
        int maxY, int MinVeinSize ,int MaxVeinSize , int spawnChance) {

        for (int i = 0; i < spawnChance; i++)
        {
            int defultChunkSize = 16;
            int xpos = posX + random.nextInt(defultChunkSize);
            int yPos = minY + random.nextInt(maxY - minY);
            int zPOs = posZ + random.nextInt(defultChunkSize);

            new WorldGenMangantite(block, (MinVeinSize + random.nextInt(MaxVeinSize - MinVeinSize)), blockSpawn).generate(world, random, xpos, yPos, zPOs);
        }
    }

    private void generateEnd(Random random, int i, int i1, World world) {
    }

    private void generateOverWorld(Random random, int chunkX, int chunkz, World world)
    {
        addOre(ModBlocks.BLOCK_UNREAL_FACE, Blocks.stone, random, world, chunkX, chunkz, 20, 60, 10, 20, 20);
    }

    private void generateNether(Random random, int i, int i1, World world) {
    }
}
