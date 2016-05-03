package com.unrealdinnerbone.yarm.init;

import com.unrealdinnerbone.yarm.Util.ItemStacks;
import com.unrealdinnerbone.yarm.Util.LogHelper;
import com.unrealdinnerbone.yarm.Util.OreDictionaryNames;
import com.unrealdinnerbone.yarm.Util.RegisterHelper;
import com.unrealdinnerbone.yarm.blocks.Faces.BlockUnRealFace;
import com.unrealdinnerbone.yarm.blocks.NetherStarBlocks.*;
import com.unrealdinnerbone.yarm.blocks.Normal.BlockAntimony;
import com.unrealdinnerbone.yarm.blocks.Ores.*;

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
         RegisterHelper.RegisterBlockWithOreDictionary(BLOCK_ZINC_ORE, 0, BlockZincOre.getName(), OreDictionaryNames.BLOCK_ZINC_ORE, ItemStacks.BlockZincOre(1));
         RegisterHelper.RegisterBlockWithOreDictionary(BLOCK_ZIRCONIUM_ORE, 0, BlockZirconiumOre.getName(), OreDictionaryNames.BLOCK_ZIRCONIUM_ORE, ItemStacks.BlockZirconiumOre(1));
         RegisterHelper.RegisterBlockWithOreDictionary(BLOCK_TITANIUM_ORE, 0, BlockTitaniumOre.getName(), OreDictionaryNames.BLOCK_TITANIUM_ORE, ItemStacks.BlockTitaniumOre(1));
         RegisterHelper.RegisterBlockWithOreDictionary(BLOCK_TIN_ORE, 0, BlockTinOre.getName(), OreDictionaryNames.BLOCK_TIN_ORE, ItemStacks.BlockTinOre(1));
         RegisterHelper.RegisterBlockWithOreDictionary(BLOCK_SILVER_ORE, 0, BlockSilverOre.getName(), OreDictionaryNames.BLOCK_SILVER_ORE, ItemStacks.BlockSilverOre(1));
         RegisterHelper.RegisterBlockWithOreDictionary(BLOCK_NICKEL_ORE, 0, BlockNickelOre.getName(), OreDictionaryNames.BLOCK_NICKEL_ORE, ItemStacks.BlockNickelOre(1));
         RegisterHelper.RegisterBlockWithOreDictionary(BLOCK_MAGNESIUM_ORE, 0, BlockMagnesiumOre.getName(), OreDictionaryNames.BLOCK_MAGNESIUM_ORE, ItemStacks.BlockMagnesiumOre(1));
         RegisterHelper.RegisterBlockWithOreDictionary(BLOCK_LEAD_ORE, 0, BlockLeadOre.getName(), OreDictionaryNames.BLOCK_LEAD_ORE, ItemStacks.BlockLeadOre(1));
         RegisterHelper.RegisterBlockWithOreDictionary(BLOCK_INDIUM_ORE, 0, BlockIndiumOre.getName(), OreDictionaryNames.BLOCK_INDIUM_ORE, ItemStacks.BlockIndiumOre(1));
         RegisterHelper.RegisterBlockWithOreDictionary(BLOCK_GALLIUM_ORE, 0, BlockGalliumOre.getName(), OreDictionaryNames.BLOCK_GALLIUM_ORE, ItemStacks.BlockGalliumOre(1));
         RegisterHelper.RegisterBlockWithOreDictionary(BLOCK_COPPER_ORE, 0, BlockCopperOre.getName(), OreDictionaryNames.BLOCK_COPPER_ORE, ItemStacks.BlockCobaltOre(1));
         RegisterHelper.RegisterBlockWithOreDictionary(BLOCK_COBALT_ORE, 0, BlockCobaltOre.getName(), OreDictionaryNames.BLOCK_COBALT_ORE, ItemStacks.BlockCobaltOre(1));
         RegisterHelper.RegisterBlockWithOreDictionary(BLOCK_CHROMIUM_ORE, 0, BlockChromiumOre.getName(), OreDictionaryNames.BLOCK_CHROMIUM_ORE, ItemStacks.BlockChromiumOre(1));
         RegisterHelper.RegisterBlockWithOreDictionary(BLOCK_BISMUTH_ORE, 0, BlockBismuthOre.getName(), OreDictionaryNames.BLOCK_BISMUTH_ORE, ItemStacks.BlockBismuthOre(1));
         RegisterHelper.RegisterBlockWithOreDictionary(BLOCK_ANTIMONY_ORE, 0, BlockAntimonyOre.getName(), OreDictionaryNames.BLOCK_ANTIMONY_ORE, ItemStacks.BlockAntimonyOre(1));
         RegisterHelper.RegisterBlockWithOreDictionary(BLOCK_UNREAL_FACE, 0, BlockUnRealFace.getName(), OreDictionaryNames.BLOCK_UNREAL_FACE, ItemStacks.BlockUnRealFace(1));
         RegisterHelper.RegisterBlockWithOreDictionary(BLOCK_ANTIMONY, 0, BlockAntimony.getName(), OreDictionaryNames.BLOCK_ANTIMONY, ItemStacks.BlockAntimony(1));
         RegisterHelper.RegisterBlockWithOreDictionary(BLOCK_NETHER_STAR_1, 0, BlockNetherStar1.getName(), OreDictionaryNames.BLOCK_NETHER_STAR_1, ItemStacks.BlockNetherStar1(1));
         RegisterHelper.RegisterBlockWithOreDictionary(BLOCK_NETHER_STAR_2, 0, BlockNetherStar2.getName(), OreDictionaryNames.BLOCK_NETHER_STAR_2, ItemStacks.BlockNetherStar2(1));
         RegisterHelper.RegisterBlockWithOreDictionary(BLOCK_NETHER_STAR_3, 0, BlockNetherStar3.getName(), OreDictionaryNames.BLOCK_NETHER_STAR_3, ItemStacks.BlockNetherStar3(1));
         RegisterHelper.RegisterBlockWithOreDictionary(BLOCK_NETHER_STAR_4, 0, BlockNetherStar4.getName(), OreDictionaryNames.BLOCK_NETHER_STAR_4, ItemStacks.BlockNetherStar4(1));
         RegisterHelper.RegisterBlockWithOreDictionary(BLOCK_NETHER_STAR_5, 0, BlockNetherStar5.getName(), OreDictionaryNames.BLOCK_NETHER_STAR_5, ItemStacks.BlockNetherStar5(1));
         RegisterHelper.RegisterBlockWithOreDictionary(BLOCK_NETHER_STAR_6, 0, BlockNetherStar6.getName(), OreDictionaryNames.BLOCK_NETHER_STAR_6, ItemStacks.BlockNetherStar6(1));
         RegisterHelper.RegisterBlockWithOreDictionary(BLOCK_NETHER_STAR_7, 0, BlockNetherStar7.getName(), OreDictionaryNames.BLOCK_NETHER_STAR_7, ItemStacks.BlockNetherStar7(1));
         RegisterHelper.RegisterBlockWithOreDictionary(BLOCK_NETHER_STAR_8, 0, BlockNetherStar8.getName(), OreDictionaryNames.BLOCK_NETHER_STAR_8, ItemStacks.BlockNetherStar8(1));
        LogHelper.info("Loaded Blocks");
    }
}
