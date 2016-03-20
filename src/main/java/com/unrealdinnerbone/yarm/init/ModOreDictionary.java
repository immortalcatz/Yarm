package com.unrealdinnerbone.yarm.init;

import com.unrealdinnerbone.yarm.Util.LogHelper;
import com.unrealdinnerbone.yarm.Util.OreDictionaryNames;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

public class ModOreDictionary {
    public static void OreDictionary()
    {
        //Items
        OreDictionary.registerOre(OreDictionaryNames.Item_UnRealFace, new ItemStack(ModItems.Item_UnRealFace));
        OreDictionary.registerOre(OreDictionaryNames.Item_ManmaedFace, new ItemStack(ModItems.Item_ManmedFace));
        OreDictionary.registerOre(OreDictionaryNames.Item_YunusFace, new ItemStack(ModItems.Item_YunusFace));
        OreDictionary.registerOre(OreDictionaryNames.Item_KyaneFace, new ItemStack(ModItems.Item_KyaneFace));
        OreDictionary.registerOre(OreDictionaryNames.Item_AntimonyIngot, new ItemStack(ModItems.Item_AntimonyIngot));
        //Blocks
        OreDictionary.registerOre(OreDictionaryNames.BLOCK_UNREAL_FACE, new ItemStack(ModBlocks.BLOCK_UNREAL_FACE));
        OreDictionary.registerOre(OreDictionaryNames.BLOCK_ANTIMONY_ORE, new ItemStack(ModBlocks.BLOCK_ANTIMONY_ORE));
        OreDictionary.registerOre(OreDictionaryNames.BLOCK_ANTIMONY, new ItemStack(ModBlocks.BLOCK_ANTIMONY));
        OreDictionary.registerOre(OreDictionaryNames.BLOCK_NETHER_STAR_1, new ItemStack(ModBlocks.BLOCK_NETHER_STAR_1));
        OreDictionary.registerOre(OreDictionaryNames.BLOCK_NETHER_STAR_2, new ItemStack(ModBlocks.BLOCK_NETHER_STAR_2));
        OreDictionary.registerOre(OreDictionaryNames.BLOCK_NETHER_STAR_3, new ItemStack(ModBlocks.BLOCK_NETHER_STAR_3));
        OreDictionary.registerOre(OreDictionaryNames.BLOCK_NETHER_STAR_4, new ItemStack(ModBlocks.BLOCK_NETHER_STAR_4));
        OreDictionary.registerOre(OreDictionaryNames.BLOCK_NETHER_STAR_5, new ItemStack(ModBlocks.BLOCK_NETHER_STAR_5));
        OreDictionary.registerOre(OreDictionaryNames.BLOCK_NETHER_STAR_6, new ItemStack(ModBlocks.BLOCK_NETHER_STAR_6));
        OreDictionary.registerOre(OreDictionaryNames.BLOCK_NETHER_STAR_7, new ItemStack(ModBlocks.BLOCK_NETHER_STAR_7));
        OreDictionary.registerOre(OreDictionaryNames.BLOCK_NETHER_STAR_8, new ItemStack(ModBlocks.BLOCK_NETHER_STAR_8));
        LogHelper.info("Loaded Ore Dic");

    }

}
