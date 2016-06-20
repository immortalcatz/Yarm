package com.unrealdinnerbone.yarm.Util;

import net.minecraft.block.Block;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.ShapedOreRecipe;

public class CraftingHelper
{
    public static void RegisterFullBlockRecipe(Object oreDictionaryNametoUse, Block blockToGet)
    {
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(blockToGet, 1, 0),
                "AAA",
                "AAA",
                "AAA",
                'A', oreDictionaryNametoUse));
    }
    public static void RegisterFullBlockRecipe(Item item, Block blockToGet)
    {
        GameRegistry.addRecipe(new ItemStack(blockToGet, 1, 0),
                "AAA",
                "AAA",
                "AAA",
                'A', new ItemStack(item, 1, 0));
    }
    public static void RegisterRingRecipe(Block ringblock, Item Ringtoget)
    {
        GameRegistry.addRecipe(new ItemStack(Ringtoget),
                " A ",
                "ABA",
                " A ",
                'A', Items.STICK,
                'B', ringblock);
    }
    public static void RegisterFullBlockRecipe(Block blockToUse, Block blockToGet)
    {
        GameRegistry.addRecipe(new ItemStack(blockToGet, 1, 0),
                "AAA",
                "AAA",
                "AAA",
                'A', new ItemStack(blockToUse, 1, 0));
    }

}
