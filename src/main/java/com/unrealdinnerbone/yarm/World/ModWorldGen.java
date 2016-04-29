package com.unrealdinnerbone.yarm.World;

import com.unrealdinnerbone.yarm.Util.LangHelper;
import com.unrealdinnerbone.yarm.Util.LogHelper;
import com.unrealdinnerbone.yarm.config.ConfigManger;
import com.unrealdinnerbone.yarm.config.WorldGenConfig;
import com.unrealdinnerbone.yarm.init.ModBlocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkGenerator;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraftforge.fml.common.IWorldGenerator;
import net.minecraftforge.fml.common.network.PacketLoggingHandler;

import java.util.Random;

public class ModWorldGen implements IWorldGenerator {

    @Override
    public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider)
    {
        int ChunkX16 = chunkX * 16;
        int ChunkZ16 = chunkZ * 16;

        switch (world.provider.getDimension()) {
            case -1:
                GenerateOreInNehter(world, random, ChunkX16, ChunkZ16);
                break;
            case 0:
                GenerateOreInOverworld(world, random, ChunkX16, ChunkZ16);
                break;
            case 1:
                GenerateOreInEnd(world, random, ChunkX16, ChunkZ16);
                break;
        }
    }

    public void GenerateOreInEnd(World world, Random random, int X, int Z) {
    }

    public void GenerateOreInOverworld(World world, Random random, int X, int Z) {
        int ChunkX = X + random.nextInt(16);
        int ChunkZ = Z + random.nextInt(16);
        if(WorldGenConfig.GenerateOres == true) {
            for (int i = 0; i < WorldGenConfig.AntimonyRarity; i++) {
                BlockPos AntimonyOrePos = new BlockPos(ChunkX, random.nextInt(WorldGenConfig.AntimonyMaxSpawnHeight), ChunkZ);
                if (WorldGenConfig.GenerateAntimony == true && AntimonyOrePos.getY() >= WorldGenConfig.AntimonyMinSpawnHeight) {
                    (new WorldGenMinable(ModBlocks.BLOCK_ANTIMONY_ORE.getDefaultState(), WorldGenConfig.AntimonyMaxSize)).generate(world, random, AntimonyOrePos);
                }
            }
            for (int i = 0; i < WorldGenConfig.BismuthRarity; i++)
            {
                BlockPos BismuthOrePos = new BlockPos(ChunkX, random.nextInt(WorldGenConfig.BismuthMaxSpawnHeight), ChunkZ);
                if (WorldGenConfig.GenerateBismuth == true && BismuthOrePos.getY() >= WorldGenConfig.BismuthMinSpawnHeight) {
                    (new WorldGenMinable(ModBlocks.BLOCK_BISMUTH_ORE.getDefaultState(), WorldGenConfig.BismuthMaxSize)).generate(world, random, BismuthOrePos);
                }
            }
            for (int i = 0; i < WorldGenConfig.ChromiumRarity; i++) {
                BlockPos ChromiumOrePos = new BlockPos(ChunkX, random.nextInt(WorldGenConfig.ChromiumMaxSpawnHeight), ChunkZ);
                if (WorldGenConfig.GenerateChromium == true && ChromiumOrePos.getY() >= WorldGenConfig.ChromiumMinSpawnHeight) {
                    (new WorldGenMinable(ModBlocks.BLOCK_CHROMIUM_ORE.getDefaultState(), WorldGenConfig.ChromiumMaxSize)).generate(world, random, ChromiumOrePos);
                }
            }
            for (int i = 0; i < WorldGenConfig.CobaltRarity; i++) {
                BlockPos CobaltOrePos = new BlockPos(ChunkX, random.nextInt(WorldGenConfig.CobaltMaxSpawnHeight), ChunkZ);
                if (WorldGenConfig.GenerateCobalt == true && CobaltOrePos.getY() >= WorldGenConfig.CobaltMinSpawnHeight) {
                    (new WorldGenMinable(ModBlocks.BLOCK_COBALT_ORE.getDefaultState(), WorldGenConfig.CobaltMaxSize)).generate(world, random, CobaltOrePos);
                }
            }
            for (int i = 0; i < WorldGenConfig.CopperRarity; i++) {
                BlockPos CopperOrePos = new BlockPos(ChunkX, random.nextInt(WorldGenConfig.CopperMaxSpawnHeight), ChunkZ);
                if (WorldGenConfig.GenerateCopper == true && CopperOrePos.getY() >= WorldGenConfig.CopperMinSpawnHeight) {
                    (new WorldGenMinable(ModBlocks.BLOCK_COBALT_ORE.getDefaultState(), WorldGenConfig.CopperMaxSize)).generate(world, random, CopperOrePos);
                }
            }
            for (int i = 0; i < WorldGenConfig.GalliumRarity; i++) {
                BlockPos GalliumOrePos = new BlockPos(ChunkX, random.nextInt(WorldGenConfig.GalliumMaxSpawnHeight), ChunkZ);
                if (WorldGenConfig.GenerateGallium == true && GalliumOrePos.getY() >= WorldGenConfig.GalliumMinSpawnHeight) {
                    (new WorldGenMinable(ModBlocks.BLOCK_GALLIUM_ORE.getDefaultState(), WorldGenConfig.GalliumMaxSize)).generate(world, random, GalliumOrePos);
                }
            }
            for (int i = 0; i < WorldGenConfig.IndiumRarity; i++) {
                BlockPos IndiumOrePos = new BlockPos(ChunkX, random.nextInt(WorldGenConfig.IndiumMaxSpawnHeight), ChunkZ);
                if (WorldGenConfig.GenerateIndium == true && IndiumOrePos.getY() >= WorldGenConfig.IndiumMinSpawnHeight) {
                    (new WorldGenMinable(ModBlocks.BLOCK_INDIUM_ORE.getDefaultState(), WorldGenConfig.IndiumMaxSize)).generate(world, random, IndiumOrePos);
                }
            }
            for (int i = 0; i < WorldGenConfig.LeadRarity; i++) {
                BlockPos LeadOrePos = new BlockPos(ChunkX, random.nextInt(WorldGenConfig.LeadMaxSpawnHeight), ChunkZ);
                if (WorldGenConfig.GenerateLead == true && LeadOrePos.getY() >= WorldGenConfig.LeadMinSpawnHeight) {
                    (new WorldGenMinable(ModBlocks.BLOCK_LEAD_ORE.getDefaultState(), WorldGenConfig.LeadMaxSize)).generate(world, random, LeadOrePos);
                }
            }
            for (int i = 0; i < WorldGenConfig.MagnesiumRarity; i++) {
                BlockPos MagnesiumOrePos = new BlockPos(ChunkX, random.nextInt(WorldGenConfig.MagnesiumMaxSpawnHeight), ChunkZ);
                if (WorldGenConfig.GenerateMagnesium == true && MagnesiumOrePos.getY() >= WorldGenConfig.MagnesiumMinSpawnHeight) {
                    (new WorldGenMinable(ModBlocks.BLOCK_MAGNESIUM_ORE.getDefaultState(), WorldGenConfig.MagnesiumMaxSize)).generate(world, random, MagnesiumOrePos);
                }
            }
            for (int i = 0; i < WorldGenConfig.NickelRarity; i++) {
                BlockPos NickelOrePos = new BlockPos(ChunkX, random.nextInt(WorldGenConfig.NickelMaxSpawnHeight), ChunkZ);
                if (WorldGenConfig.GenerateNickel == true && NickelOrePos.getY() >= WorldGenConfig.NickelMinSpawnHeight) {
                    (new WorldGenMinable(ModBlocks.BLOCK_NICKEL_ORE.getDefaultState(), WorldGenConfig.NickelMaxSize)).generate(world, random, NickelOrePos);
                }
            }
            for (int i = 0; i < WorldGenConfig.SilverRarity; i++) {
                BlockPos SilverOrePos = new BlockPos(ChunkX, random.nextInt(WorldGenConfig.SilverMaxSpawnHeight), ChunkZ);
                if (WorldGenConfig.GenerateSilver == true && SilverOrePos.getY() >= WorldGenConfig.SilverMinSpawnHeight) {
                    (new WorldGenMinable(ModBlocks.BLOCK_SILVER_ORE.getDefaultState(), WorldGenConfig.SilverMaxSize)).generate(world, random, SilverOrePos);
                }
            }
            for (int i = 0; i < WorldGenConfig.TinRarity; i++) {
                BlockPos TinOrePos = new BlockPos(ChunkX, random.nextInt(WorldGenConfig.TinMaxSpawnHeight), ChunkZ);
                if (WorldGenConfig.GenerateTin == true && TinOrePos.getY() >= WorldGenConfig.TinMinSpawnHeight) {
                    (new WorldGenMinable(ModBlocks.BLOCK_TIN_ORE.getDefaultState(), WorldGenConfig.TinMaxSize)).generate(world, random, TinOrePos);
                }
            }
            for (int i = 0; i < WorldGenConfig.TitaniumRarity; i++) {
                BlockPos TitaniumOrePos = new BlockPos(ChunkX, random.nextInt(WorldGenConfig.TitaniumMaxSpawnHeight), ChunkZ);
                if (WorldGenConfig.GenerateTitanium == true && TitaniumOrePos.getY() >= WorldGenConfig.TitaniumMinSpawnHeight) {
                    (new WorldGenMinable(ModBlocks.BLOCK_TITANIUM_ORE.getDefaultState(), WorldGenConfig.TitaniumMaxSize)).generate(world, random, TitaniumOrePos);
                }
            }
            for (int i = 0; i < WorldGenConfig.ZincRarity; i++) {
                BlockPos ZincOrePos = new BlockPos(ChunkX, random.nextInt(WorldGenConfig.ZincMaxSpawnHeight), ChunkZ);
                if (WorldGenConfig.GenerateZinc == true && ZincOrePos.getY() >= WorldGenConfig.ZincMinSpawnHeight) {
                    (new WorldGenMinable(ModBlocks.BLOCK_ZINC_ORE.getDefaultState(), WorldGenConfig.ZincMaxSize)).generate(world, random, ZincOrePos);
                }
            }
            for (int i = 0; i < WorldGenConfig.ZirconiumRarity; i++) {
                BlockPos ZirconiumOrePos = new BlockPos(ChunkX, random.nextInt(WorldGenConfig.ZirconiumMaxSpawnHeight), ChunkZ);
                if (WorldGenConfig.GenerateZirconium == true && ZirconiumOrePos.getY() >= WorldGenConfig.ZirconiumMinSpawnHeight) {
                    (new WorldGenMinable(ModBlocks.BLOCK_ZIRCONIUM_ORE.getDefaultState(), WorldGenConfig.ZirconiumMaxSize)).generate(world, random, ZirconiumOrePos);
                }
            }
        }

    }

    public void GenerateOreInNehter(World world, Random random, int X, int Z)
    {

    }

}
