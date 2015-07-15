package com.unrealdinnerbone.yarm.init;

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

    }

}
