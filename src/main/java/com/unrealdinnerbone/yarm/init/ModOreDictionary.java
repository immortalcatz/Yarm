package com.unrealdinnerbone.yarm.init;

import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

public class ModOreDictionary {
    public static void OreDictionary()
    {
        //Items
        OreDictionary.registerOre("materialUnRealFace", new ItemStack(ModItems.UnRealFace));
        OreDictionary.registerOre("materialManmaedFace", new ItemStack(ModItems.ManmedFace));
        OreDictionary.registerOre("materialYunus1903Face", new ItemStack(ModItems.YunusFace));
        OreDictionary.registerOre("materialTheKayneGameFace", new ItemStack(ModItems.YunusFace));
        //Blocks
        OreDictionary.registerOre("materialBlockUnReal", new ItemStack(ModBlocks.BLOCK_UNREAL_FACE));
    }

}
