package com.unrealdinnerbone.yarm.init;

import com.unrealdinnerbone.yarm.Util.LogHelper;
import com.unrealdinnerbone.yarm.Util.RegisterHelper;
import com.unrealdinnerbone.yarm.blocks.Faces.BlockUnRealFace;
import com.unrealdinnerbone.yarm.blocks.NetherStarBlocks.*;
import com.unrealdinnerbone.yarm.blocks.Normal.BlockAntimony;
import com.unrealdinnerbone.yarm.blocks.Ores.*;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModBlocks
{
    //Things
    public static final BlockUnRealFace BLOCK_UNREAL_FACE = new BlockUnRealFace();
    //Ores
    public static final BlockAntimonyOre BLOCK_ANTIMONY_ORE = new BlockAntimonyOre();
    public static final BlockBismuthOre BLOCK_BISMUTH_ORE = new BlockBismuthOre();
    public static final BlockChromiumOre BLOCK_CHROMIUM_ORE = new BlockChromiumOre();
    public static final BlockCobaltOre BLOCK_COBALT_ORE = new BlockCobaltOre();
    public static final BlockCopperOre BLOCK_COPPER_ORE = new BlockCopperOre();
    public static final BlockGalliumOre BLOCK_GALLIUM_ORE = new BlockGalliumOre();
    public static final BlockIndiumOre BLOCK_INDIUM_ORE = new BlockIndiumOre();
    public static final BlockLeadOre BLOCK_LEAD_ORE = new BlockLeadOre();
    public static final BlockMagnesiumOre BLOCK_MAGNESIUM_ORE = new BlockMagnesiumOre();
    public static final BlockNickelOre BLOCK_NICKEL_ORE = new BlockNickelOre();
    public static final BlockSilverOre BLOCK_SILVER_ORE = new BlockSilverOre();
    public static final BlockTinOre BLOCK_TIN_ORE = new BlockTinOre();
    public static final BlockTitaniumOre BLOCK_TITANIUM_ORE = new BlockTitaniumOre();
    public static final BlockZincOre BLOCK_ZINC_ORE = new BlockZincOre();
    public static final BlockZirconiumOre BLOCK_ZIRCONIUM_ORE = new BlockZirconiumOre();
    //OreBlocks
    public static final BlockAntimony BLOCK_ANTIMONY = new BlockAntimony();
    //NetherStarBlcoks
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
         RegisterHelper.RegisterBlock(BLOCK_ZINC_ORE, 0, BlockZincOre.getName());
         RegisterHelper.RegisterBlock(BLOCK_ZIRCONIUM_ORE, 0, BlockZirconiumOre.getName());
         RegisterHelper.RegisterBlock(BLOCK_TITANIUM_ORE, 0, BlockTitaniumOre.getName());
         RegisterHelper.RegisterBlock(BLOCK_TIN_ORE, 0, BlockTinOre.getName());
         RegisterHelper.RegisterBlock(BLOCK_SILVER_ORE, 0, BlockSilverOre.getName());
         RegisterHelper.RegisterBlock(BLOCK_NICKEL_ORE, 0, BlockNickelOre.getName());
         RegisterHelper.RegisterBlock(BLOCK_MAGNESIUM_ORE, 0, BlockMagnesiumOre.getName());
         RegisterHelper.RegisterBlock(BLOCK_LEAD_ORE, 0, BlockLeadOre.getName());
         RegisterHelper.RegisterBlock(BLOCK_INDIUM_ORE, 0, BlockIndiumOre.getName());
         RegisterHelper.RegisterBlock(BLOCK_GALLIUM_ORE, 0, BlockGalliumOre.getName());
         RegisterHelper.RegisterBlock(BLOCK_COPPER_ORE, 0, BlockCopperOre.getName());
         RegisterHelper.RegisterBlock(BLOCK_COBALT_ORE, 0, BlockCobaltOre.getName());
         RegisterHelper.RegisterBlock(BLOCK_CHROMIUM_ORE, 0, BlockChromiumOre.getName());
         RegisterHelper.RegisterBlock(BLOCK_BISMUTH_ORE, 0, BlockBismuthOre.getName());
         RegisterHelper.RegisterBlock(BLOCK_ANTIMONY_ORE, 0, BlockAntimonyOre.getName());
         RegisterHelper.RegisterBlock(BLOCK_UNREAL_FACE, 0, BlockUnRealFace.getName());
         RegisterHelper.RegisterBlock(BLOCK_ANTIMONY, 0, BlockAntimony.getName());
         RegisterHelper.RegisterBlock(BLOCK_NETHER_STAR_1, 0, BlockNetherStar1.getName());
         RegisterHelper.RegisterBlock(BLOCK_NETHER_STAR_2, 0, BlockNetherStar2.getName());
         RegisterHelper.RegisterBlock(BLOCK_NETHER_STAR_3, 0, BlockNetherStar3.getName());
         RegisterHelper.RegisterBlock(BLOCK_NETHER_STAR_4, 0, BlockNetherStar4.getName());
         RegisterHelper.RegisterBlock(BLOCK_NETHER_STAR_5, 0, BlockNetherStar5.getName());
         RegisterHelper.RegisterBlock(BLOCK_NETHER_STAR_6, 0, BlockNetherStar6.getName());
         RegisterHelper.RegisterBlock(BLOCK_NETHER_STAR_7, 0, BlockNetherStar7.getName());
         RegisterHelper.RegisterBlock(BLOCK_NETHER_STAR_8, 0, BlockNetherStar8.getName());
        LogHelper.info("Loaded Blocks");
    }
}
