package com.unrealdinnerbone.yarm.init;

import com.unrealdinnerbone.yarm.Util.LogHelper;
import com.unrealdinnerbone.yarm.blocks.Faces.*;
import com.unrealdinnerbone.yarm.blocks.NetherStarBlocks.*;
import com.unrealdinnerbone.yarm.blocks.Normal.*;
import com.unrealdinnerbone.yarm.blocks.Ores.*;
import cpw.mods.fml.common.registry.GameRegistry;

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



    public static void init()
    {
        GameRegistry.registerBlock(BLOCK_UNREAL_FACE, "UnReal_Block");
        GameRegistry.registerBlock(BLOCK_UNREAL_CHEST, "UnReal_Chest");
        GameRegistry.registerBlock(BLOCK_ANTIMONY_ORE, "Antimony_Ore");
        GameRegistry.registerBlock(BLOCK_ANTIMONY, "Block_Antimony");
        GameRegistry.registerBlock(BLOCK_NETHER_STAR_1, "Block_NetherStar1");
        GameRegistry.registerBlock(BLOCK_NETHER_STAR_2, "Block_NetherStar2");
        GameRegistry.registerBlock(BLOCK_NETHER_STAR_3, "Block_NetherStar3");
        GameRegistry.registerBlock(BLOCK_NETHER_STAR_4, "Block_NetherStar4");
        GameRegistry.registerBlock(BLOCK_NETHER_STAR_5, "Block_NetherStar5");
        GameRegistry.registerBlock(BLOCK_NETHER_STAR_6, "Block_NetherStar6");
        GameRegistry.registerBlock(BLOCK_NETHER_STAR_7, "Block_NetherStar7");
        GameRegistry.registerBlock(BLOCK_NETHER_STAR_8, "Block_NetherStar8");
        LogHelper.info("Loaded Blocks");
    }

}
