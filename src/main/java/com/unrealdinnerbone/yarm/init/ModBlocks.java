package com.unrealdinnerbone.yarm.init;

import com.unrealdinnerbone.yarm.Util.LogHelper;
import com.unrealdinnerbone.yarm.blocks.Faces.BlockUnRealFace;
import com.unrealdinnerbone.yarm.blocks.NetherStarBlocks.*;
import com.unrealdinnerbone.yarm.blocks.Normal.BlockAntimony;
import com.unrealdinnerbone.yarm.blocks.Normal.BlockStoneTorch;
import com.unrealdinnerbone.yarm.blocks.Normal.BlockUnRealChest;
import com.unrealdinnerbone.yarm.blocks.Ores.BlockAntimonyOre;
import com.unrealdinnerbone.yarm.blocks.TileEnity.ModTileEntity;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModBlocks
{
    public static final BlockUnRealFace BLOCK_UNREAL_FACE = new BlockUnRealFace();
    public static final BlockUnRealChest BLOCK_UNREAL_CHEST = new BlockUnRealChest();
    public static final BlockAntimonyOre BLOCK_ANTIMONY_ORE = new BlockAntimonyOre();
    public static final BlockAntimony BLOCK_ANTIMONY = new BlockAntimony();
    public static final BlockNetherStar1 BLOCK_NETHER_STAR_1 = new BlockNetherStar1();
    public static final BlockNetherStar2 BLOCK_NETHER_STAR_2 = new BlockNetherStar2();
    public static final BlockNetherStar3 BLOCK_NETHER_STAR_3 = new BlockNetherStar3();
    public static final BlockNetherStar4 BLOCK_NETHER_STAR_4 = new BlockNetherStar4();
    public static final BlockNetherStar5 BLOCK_NETHER_STAR_5 = new BlockNetherStar5();
    public static final BlockNetherStar6 BLOCK_NETHER_STAR_6 = new BlockNetherStar6();
    public static final BlockNetherStar7 BLOCK_NETHER_STAR_7 = new BlockNetherStar7();
    public static final BlockNetherStar8 BLOCK_NETHER_STAR_8 = new BlockNetherStar8();
    public static final BlockStoneTorch BLOCK_STONE_TORCH = new BlockStoneTorch();
    public static final Class<? extends ModTileEntity> MOD_TILE_ENITY = new ModTileEntity().getClass();



    public static void init()
    {
        GameRegistry.registerBlock(BLOCK_UNREAL_FACE, BlockUnRealFace.getName());
//        GameRegistry.registerBlock(BLOCK_UNREAL_CHEST, BlockUnRealChest.getName());
        GameRegistry.registerBlock(BLOCK_ANTIMONY_ORE, BlockAntimonyOre.getName());
        GameRegistry.registerBlock(BLOCK_ANTIMONY, BlockAntimony.getName());
        GameRegistry.registerBlock(BLOCK_NETHER_STAR_1, BlockNetherStar1.getName());
        GameRegistry.registerBlock(BLOCK_NETHER_STAR_2, BlockNetherStar2.getName());
        GameRegistry.registerBlock(BLOCK_NETHER_STAR_3, BlockNetherStar3.getName());
        GameRegistry.registerBlock(BLOCK_NETHER_STAR_4, BlockNetherStar4.getName());
        GameRegistry.registerBlock(BLOCK_NETHER_STAR_5, BlockNetherStar5.getName());
        GameRegistry.registerBlock(BLOCK_NETHER_STAR_6, BlockNetherStar6.getName());
        GameRegistry.registerBlock(BLOCK_NETHER_STAR_7, BlockNetherStar7.getName());
        GameRegistry.registerBlock(BLOCK_NETHER_STAR_8, BlockNetherStar8.getName());
        GameRegistry.registerBlock(BLOCK_STONE_TORCH, BlockStoneTorch.getName());
        GameRegistry.registerTileEntity(MOD_TILE_ENITY, "Bacon");
        LogHelper.info("Loaded Blocks");
    }
}
