package com.unrealdinnerbone.yarm.init;

import com.unrealdinnerbone.yarm.Util.LogHelper;
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
        GameRegistry.registerBlock(BLOCK_ZINC_ORE, BlockZincOre.getName());
        GameRegistry.registerBlock(BLOCK_ZIRCONIUM_ORE, BLOCK_ZIRCONIUM_ORE.getName());
        GameRegistry.registerBlock(BLOCK_TITANIUM_ORE, BLOCK_TITANIUM_ORE.getName());
        GameRegistry.registerBlock(BLOCK_TIN_ORE, BLOCK_TIN_ORE.getName());
        GameRegistry.registerBlock(BLOCK_SILVER_ORE, BLOCK_SILVER_ORE.getName());
        GameRegistry.registerBlock(BLOCK_NICKEL_ORE, BLOCK_NICKEL_ORE.getName());
        GameRegistry.registerBlock(BLOCK_MAGNESIUM_ORE, BLOCK_MAGNESIUM_ORE.getName());
        GameRegistry.registerBlock(BLOCK_LEAD_ORE, BLOCK_LEAD_ORE.getName());
        GameRegistry.registerBlock(BLOCK_INDIUM_ORE, BLOCK_INDIUM_ORE.getName());
        GameRegistry.registerBlock(BLOCK_GALLIUM_ORE, BLOCK_GALLIUM_ORE.getName());
        GameRegistry.registerBlock(BLOCK_COPPER_ORE, BLOCK_COPPER_ORE.getName());
        GameRegistry.registerBlock(BLOCK_COBALT_ORE, BLOCK_COBALT_ORE.getName());
        GameRegistry.registerBlock(BLOCK_CHROMIUM_ORE, BLOCK_CHROMIUM_ORE.getName());
        GameRegistry.registerBlock(BLOCK_BISMUTH_ORE, BLOCK_BISMUTH_ORE.getName());
        GameRegistry.registerBlock(BLOCK_ANTIMONY_ORE, BLOCK_ANTIMONY_ORE.getName());
        GameRegistry.registerBlock(BLOCK_UNREAL_FACE, BLOCK_UNREAL_FACE.getName());
        GameRegistry.registerBlock(BLOCK_ANTIMONY, BLOCK_ANTIMONY.getName());
        GameRegistry.registerBlock(BLOCK_NETHER_STAR_1, BLOCK_NETHER_STAR_1.getName());
        GameRegistry.registerBlock(BLOCK_NETHER_STAR_2, BLOCK_NETHER_STAR_2.getName());
        GameRegistry.registerBlock(BLOCK_NETHER_STAR_3, BLOCK_NETHER_STAR_3.getName());
        GameRegistry.registerBlock(BLOCK_NETHER_STAR_4, BLOCK_NETHER_STAR_4.getName());
        GameRegistry.registerBlock(BLOCK_NETHER_STAR_5, BLOCK_NETHER_STAR_5.getName());
        GameRegistry.registerBlock(BLOCK_NETHER_STAR_6, BLOCK_NETHER_STAR_6.getName());
        GameRegistry.registerBlock(BLOCK_NETHER_STAR_7, BLOCK_NETHER_STAR_7.getName());
        GameRegistry.registerBlock(BLOCK_NETHER_STAR_8, BLOCK_NETHER_STAR_8.getName());
        LogHelper.info("Loaded Blocks");
    }
}
