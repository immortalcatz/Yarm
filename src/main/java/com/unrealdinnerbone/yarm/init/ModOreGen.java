//package com.unrealdinnerbone.yarm.init;
//
//
//import java.util.Random;
//
//import com.unrealdinnerbone.yarm.config.WorldGenConfig;
//import net.minecraft.init.Blocks;
//import net.minecraft.util.math.BlockPos;
//import net.minecraft.world.World;
//import net.minecraft.world.chunk.IChunkGenerator;
//import net.minecraft.world.chunk.IChunkProvider;
//import net.minecraft.world.gen.feature.WorldGenMinable;
//import net.minecraftforge.fml.common.IWorldGenerator;
//
//public class ModOreGen implements IWorldGenerator
//{
//        // Which dimension to generate in by dimension ID (Nether -1, Overworld 0, End 1, etc)
//        @Override
//        public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider) {
//            switch (world.provider.getDimension()) {
//                case -1:
//                    break;
//                case 0:
//                    generateSurface(world, random, chunkX * 16, chunkZ * 16);
//                    break;
//                case 1:
//                    break;
//            }
//        }
//
//        //The actual generation method.
//        private void generateSurface(World world, Random rand, int chunkX, int chunkZ) {
//            for (int k = 0; k < 16; k++) {
//                int firstBlockXCoord = chunkX + rand.nextInt(16);
//                int firstBlockZCoord = chunkZ + rand.nextInt(16);
//                //Will be found between y = 0 and y = 20
//                int GenerateAntimonySize = rand.nextInt(20);
//                BlockPos RandGenerateAntimonySize = new BlockPos(firstBlockXCoord, GenerateAntimonySize, firstBlockZCoord);
//                //The 10 as the second parameter sets the maximum vein size
//                if(WorldGenConfig.GenerateOres == true) {
//                    if (WorldGenConfig.GenerateAntimony == true) {
//                        (new WorldGenMinable(ModBlocks.BLOCK_ANTIMONY_ORE.getDefaultState(), 10)).generate(world, rand, RandGenerateAntimonySize);
//                    }
//                    if (WorldGenConfig.GenerateBismuth == true) {
//                        (new WorldGenMinable(ModBlocks.BLOCK_BISMUTH_ORE.getDefaultState(), 10)).generate(world, rand, quisquePos);
//                    }
//                    if (WorldGenConfig.GenerateChromium == true) {
//                        (new WorldGenMinable(ModBlocks.BLOCK_CHROMIUM_ORE.getDefaultState(), 10)).generate(world, rand, quisquePos);
//                    }
//                    if (WorldGenConfig.GenerateCobalt == true) {
//                        (new WorldGenMinable(ModBlocks.BLOCK_COBALT_ORE.getDefaultState(), 10)).generate(world, rand, quisquePos);
//                    }
//                    if (WorldGenConfig.GenerateCopper == true) {
//                        (new WorldGenMinable(ModBlocks.BLOCK_COPPER_ORE.getDefaultState(), 10)).generate(world, rand, quisquePos);
//                    }
//                    if (WorldGenConfig.GenerateGallium == true) {
//                        (new WorldGenMinable(ModBlocks.BLOCK_GALLIUM_ORE.getDefaultState(), 10)).generate(world, rand, quisquePos);
//                    }
//                    if (WorldGenConfig.GenerateIndium == true) {
//                        (new WorldGenMinable(ModBlocks.BLOCK_INDIUM_ORE.getDefaultState(), 10)).generate(world, rand, quisquePos);
//                    }
//                    if (WorldGenConfig.GenerateLead == true) {
//                        (new WorldGenMinable(ModBlocks.BLOCK_LEAD_ORE.getDefaultState(), 10)).generate(world, rand, quisquePos);
//                    }
//                    if (WorldGenConfig.GenerateMagnesium == true) {
//                        (new WorldGenMinable(ModBlocks.BLOCK_MAGNESIUM_ORE.getDefaultState(), 10)).generate(world, rand, quisquePos);
//                    }
//                    if (WorldGenConfig.GenerateNickel == true) {
//                        (new WorldGenMinable(ModBlocks.BLOCK_NICKEL_ORE.getDefaultState(), 10)).generate(world, rand, quisquePos);
//                    }
//                    if (WorldGenConfig.GenerateSilver == true) {
//                        (new WorldGenMinable(ModBlocks.BLOCK_SILVER_ORE.getDefaultState(), 10)).generate(world, rand, quisquePos);
//                    }
//                    if (WorldGenConfig.GenerateTin == true) {
//                        (new WorldGenMinable(ModBlocks.BLOCK_TIN_ORE.getDefaultState(), 10)).generate(world, rand, quisquePos);
//                    }
//                    if (WorldGenConfig.GenerateTitanium == true) {
//                        (new WorldGenMinable(ModBlocks.BLOCK_TITANIUM_ORE.getDefaultState(), 10)).generate(world, rand, quisquePos);
//                    }
//                    if (WorldGenConfig.GenerateZinc == true) {
//                        (new WorldGenMinable(ModBlocks.BLOCK_ZINC_ORE.getDefaultState(), 10)).generate(world, rand, quisquePos);
//                    }
//                    if (WorldGenConfig.GenerateZirconium == true) {
//                        (new WorldGenMinable(ModBlocks.BLOCK_ZIRCONIUM_ORE.getDefaultState(), 10)).generate(world, rand, quisquePos);
//                    }
//
//                }
//
//
//
//            }
//        }
//}