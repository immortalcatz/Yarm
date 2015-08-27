package com.unrealdinnerbone.yarm.init;

import com.unrealdinnerbone.yarm.Util.LogHelper;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

public class ModOreDictionary {
    public static void OreDictionary()
    {
        //Items
        OreDictionary.registerOre("materialUnRealFace", new ItemStack(ModItems.UnRealFace));
        OreDictionary.registerOre("materialManmaedFace", new ItemStack(ModItems.ManmedFace));
        OreDictionary.registerOre("materialYunus1903Face", new ItemStack(ModItems.YunusFace));
        OreDictionary.registerOre("materialTheKayneGameFace", new ItemStack(ModItems.KyaneFace));
        OreDictionary.registerOre("ingotAntimony", new ItemStack(ModItems.AntimonyIngot));
        //Blocks
        OreDictionary.registerOre("materialBlockUnReal", new ItemStack(ModBlocks.BLOCK_UNREAL_FACE));
        OreDictionary.registerOre("oreAntimony", new ItemStack(ModBlocks.BLOCK_ANTIMONY_ORE));
        OreDictionary.registerOre("materialAntimony", new ItemStack(ModBlocks.BLOCK_ANTIMONY));
        OreDictionary.registerOre("materialNetherStar1", new ItemStack(ModBlocks.BLOCK_NETHER_STAR_1));
        OreDictionary.registerOre("materialNetherStar2", new ItemStack(ModBlocks.BLOCK_NETHER_STAR_2));
        OreDictionary.registerOre("materialNetherStar3", new ItemStack(ModBlocks.BLOCK_NETHER_STAR_3));
        OreDictionary.registerOre("materialNetherStar4", new ItemStack(ModBlocks.BLOCK_NETHER_STAR_4));
        OreDictionary.registerOre("materialNetherStar5", new ItemStack(ModBlocks.BLOCK_NETHER_STAR_5));
        OreDictionary.registerOre("materialNetherStar6", new ItemStack(ModBlocks.BLOCK_NETHER_STAR_6));
        OreDictionary.registerOre("materialNetherStar7", new ItemStack(ModBlocks.BLOCK_NETHER_STAR_7));
        OreDictionary.registerOre("materialNetherStar8", new ItemStack(ModBlocks.BLOCK_NETHER_STAR_8));
        LogHelper.info("Loaded Ore Dic");

    }

}
