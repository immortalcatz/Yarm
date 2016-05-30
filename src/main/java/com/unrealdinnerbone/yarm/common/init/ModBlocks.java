package com.unrealdinnerbone.yarm.common.init;

import com.unrealdinnerbone.yarm.Util.OreDictionaryNames;
import com.unrealdinnerbone.yarm.Util.RegisterHelper;
import com.unrealdinnerbone.yarm.common.blocks.ConnectedBlocks.ConnectedGlass.BlockConnectedGlass;
import com.unrealdinnerbone.yarm.common.blocks.Faces.BlockUnRealFace;
import com.unrealdinnerbone.yarm.common.blocks.NetherStarBlocks.*;
import com.unrealdinnerbone.yarm.common.blocks.Normal.BlockAntimony;
import com.unrealdinnerbone.yarm.common.blocks.Ores.*;

public class ModBlocks
{
    //Thiangs
    public static final BlockUnRealFace BLOCK_UNREAL_FACE = new BlockUnRealFace();
    //OreBlocks
    public static final BlockAntimonyOre BLOCK_ANTIMONY_ORE = new BlockAntimonyOre();
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
    public static final BlockConnectedGlass BLOCK_CONNECTED_GLASS = new BlockConnectedGlass();

    public static final BlockBismuthOre BLOCK_BISMUTH_ORE = new BlockBismuthOre();
    public static final BlockChromiumOre BLOCK_CHROMIUM_ORE = new BlockChromiumOre();
    public static final BlockCobaltOre BLOCK_COBALT_ORE = new BlockCobaltOre();
    public static final BlockCopperOre BLOCK_COPPER_ORE = new BlockCopperOre();
    public static final BlockGalliumOre BLOCK_GALLIUM_ORE = new BlockGalliumOre();
    public static final BlockIndiumOre BLOCK_INDIUM_ORE = new BlockIndiumOre();
    public static final BlockLeadOre BLOCK_LEAD_ORE = new BlockLeadOre();
    public static final BlockNickelOre BLOCK_NICKEL_ORE = new BlockNickelOre();
    public static final BlockSilverOre BLOCK_SILVER_ORE = new BlockSilverOre();
    public static final BlockTinOre BLOCK_TIN_ORE = new BlockTinOre();
    public static final BlockTitaniumOre BLOCK_TITANIUM_ORE = new BlockTitaniumOre();
    public static final BlockZincOre BLOCK_ZINC_ORE = new BlockZincOre();
    public static final BlockZirconiumOre BLOCK_ZIRCONIUM_ORE = new BlockZirconiumOre();
    public static final BlockMagnesiumOre BLOCK_MAGNESIUM_ORE = new BlockMagnesiumOre();




    public static void init()
    {

         RegisterHelper.RegisterBlock(BLOCK_ZINC_ORE, BlockZincOre.getName(), OreDictionaryNames.BLOCK_ZINC_ORE);
         RegisterHelper.RegisterBlock(BLOCK_ZIRCONIUM_ORE, BlockZirconiumOre.getName(), OreDictionaryNames.BLOCK_ZIRCONIUM_ORE);
         RegisterHelper.RegisterBlock(BLOCK_TITANIUM_ORE, BlockTitaniumOre.getName(), OreDictionaryNames.BLOCK_TITANIUM_ORE);
         RegisterHelper.RegisterBlock(BLOCK_TIN_ORE, BlockTinOre.getName(), OreDictionaryNames.BLOCK_TIN_ORE);
         RegisterHelper.RegisterBlock(BLOCK_SILVER_ORE, BlockSilverOre.getName(), OreDictionaryNames.BLOCK_SILVER_ORE);
         RegisterHelper.RegisterBlock(BLOCK_NICKEL_ORE, BlockNickelOre.getName(), OreDictionaryNames.BLOCK_NICKEL_ORE);
         RegisterHelper.RegisterBlock(BLOCK_MAGNESIUM_ORE, BlockMagnesiumOre.getName(), OreDictionaryNames.BLOCK_MAGNESIUM_ORE);
         RegisterHelper.RegisterBlock(BLOCK_LEAD_ORE, BlockLeadOre.getName(), OreDictionaryNames.BLOCK_LEAD_ORE);
         RegisterHelper.RegisterBlock(BLOCK_INDIUM_ORE, BlockIndiumOre.getName(), OreDictionaryNames.BLOCK_INDIUM_ORE);
         RegisterHelper.RegisterBlock(BLOCK_GALLIUM_ORE, BlockGalliumOre.getName(), OreDictionaryNames.BLOCK_GALLIUM_ORE);
         RegisterHelper.RegisterBlock(BLOCK_COPPER_ORE, BlockCopperOre.getName(), OreDictionaryNames.BLOCK_COPPER_ORE);
         RegisterHelper.RegisterBlock(BLOCK_COBALT_ORE, BlockCobaltOre.getName(), OreDictionaryNames.BLOCK_COBALT_ORE);
         RegisterHelper.RegisterBlock(BLOCK_CHROMIUM_ORE, BlockChromiumOre.getName(), OreDictionaryNames.BLOCK_CHROMIUM_ORE);
         RegisterHelper.RegisterBlock(BLOCK_BISMUTH_ORE, BlockBismuthOre.getName(), OreDictionaryNames.BLOCK_BISMUTH_ORE);
         RegisterHelper.RegisterBlock(BLOCK_ANTIMONY_ORE, BlockAntimonyOre.getName(), OreDictionaryNames.BLOCK_ANTIMONY_ORE);
         RegisterHelper.RegisterBlock(BLOCK_UNREAL_FACE, BlockUnRealFace.getName(), OreDictionaryNames.BLOCK_UNREAL_FACE);
         RegisterHelper.RegisterBlock(BLOCK_ANTIMONY, BlockAntimony.getName(), OreDictionaryNames.BLOCK_ANTIMONY);
         RegisterHelper.RegisterBlock(BLOCK_NETHER_STAR_1, BlockNetherStar1.getName(), OreDictionaryNames.BLOCK_NETHER_STAR_1);
         RegisterHelper.RegisterBlock(BLOCK_NETHER_STAR_2, BlockNetherStar2.getName(), OreDictionaryNames.BLOCK_NETHER_STAR_2);
         RegisterHelper.RegisterBlock(BLOCK_NETHER_STAR_3, BlockNetherStar3.getName(), OreDictionaryNames.BLOCK_NETHER_STAR_3);
         RegisterHelper.RegisterBlock(BLOCK_NETHER_STAR_4, BlockNetherStar4.getName(), OreDictionaryNames.BLOCK_NETHER_STAR_4);
         RegisterHelper.RegisterBlock(BLOCK_NETHER_STAR_5, BlockNetherStar5.getName(), OreDictionaryNames.BLOCK_NETHER_STAR_5);
         RegisterHelper.RegisterBlock(BLOCK_NETHER_STAR_6, BlockNetherStar6.getName(), OreDictionaryNames.BLOCK_NETHER_STAR_6);
         RegisterHelper.RegisterBlock(BLOCK_NETHER_STAR_7, BlockNetherStar7.getName(), OreDictionaryNames.BLOCK_NETHER_STAR_7);
         RegisterHelper.RegisterBlock(BLOCK_NETHER_STAR_8, BlockNetherStar8.getName(), OreDictionaryNames.BLOCK_NETHER_STAR_8);
         RegisterHelper.RegisterBlock(BLOCK_CONNECTED_GLASS, BlockConnectedGlass.getName(), OreDictionaryNames.BLOCK_CONNECTED_GLASS);

    }
}

