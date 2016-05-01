package com.unrealdinnerbone.yarm.init;

import com.unrealdinnerbone.yarm.Util.ItemStacks;
import com.unrealdinnerbone.yarm.Util.LogHelper;
import com.unrealdinnerbone.yarm.Util.OreDictionaryNames;
import net.minecraftforge.oredict.OreDictionary;

public class ModOreDictionary {
    public static void OreDictionary()
    {
        //Items
        OreDictionary.registerOre(OreDictionaryNames.Item_UnRealFace, ItemStacks.ItemUnRealFace(1));
        OreDictionary.registerOre(OreDictionaryNames.Item_ManmaedFace, ItemStacks.ItemManmaedFace(1));
        OreDictionary.registerOre(OreDictionaryNames.Item_YunusFace, ItemStacks.ItemYunusFace(1));
        OreDictionary.registerOre(OreDictionaryNames.Item_KyaneFace, ItemStacks.ItemKyaneFace(1));
        OreDictionary.registerOre(OreDictionaryNames.Item_AntimonyIngot, ItemStacks.ItemAntimonyIngot(1));
        OreDictionary.registerOre(OreDictionaryNames.BLOCK_UNREAL_FACE, ItemStacks.BlockUnRealFace(1));
        OreDictionary.registerOre(OreDictionaryNames.BLOCK_ANTIMONY_ORE, ItemStacks.BlockAntimonyOre(1));
        OreDictionary.registerOre(OreDictionaryNames.BLOCK_ANTIMONY, ItemStacks.BlockAntimony(1));
        OreDictionary.registerOre(OreDictionaryNames.BLOCK_NETHER_STAR_1, ItemStacks.BlockNetherStar1(1));
        OreDictionary.registerOre(OreDictionaryNames.BLOCK_NETHER_STAR_2, ItemStacks.BlockNetherStar2(1));
        OreDictionary.registerOre(OreDictionaryNames.BLOCK_NETHER_STAR_3, ItemStacks.BlockNetherStar3(1));
        OreDictionary.registerOre(OreDictionaryNames.BLOCK_NETHER_STAR_4, ItemStacks.BlockNetherStar4(1));
        OreDictionary.registerOre(OreDictionaryNames.BLOCK_NETHER_STAR_5, ItemStacks.BlockNetherStar5(1));
        OreDictionary.registerOre(OreDictionaryNames.BLOCK_NETHER_STAR_6, ItemStacks.BlockNetherStar6(1));
        OreDictionary.registerOre(OreDictionaryNames.BLOCK_NETHER_STAR_7, ItemStacks.BlockNetherStar7(1));
        OreDictionary.registerOre(OreDictionaryNames.BLOCK_NETHER_STAR_8, ItemStacks.BlockNetherStar8(1));
        OreDictionary.registerOre(OreDictionaryNames.Item_IronNugget, ItemStacks.ItemIronNugget(1));
        OreDictionary.registerOre(OreDictionaryNames.Food_IronApple, ItemStacks.ItemFoodIronApple(1));
        OreDictionary.registerOre(OreDictionaryNames.Food_IronCarrot, ItemStacks.ItemFoodIronCarrot(1));
        OreDictionary.registerOre(OreDictionaryNames.BLOCK_BISMUTH_ORE, ItemStacks.BlockBismuthOre(1));
        OreDictionary.registerOre(OreDictionaryNames.BLOCK_CHROMIUM_ORE,ItemStacks.BlockChromiumOre(1));
        OreDictionary.registerOre(OreDictionaryNames.BLOCK_COBALT_ORE, ItemStacks.BlockCobaltOre(1));
        OreDictionary.registerOre(OreDictionaryNames.BLOCK_COPPER_ORE, ItemStacks.BlockCopperOre(1));
        LogHelper.info("Loaded Ore Dic");

    }

}
