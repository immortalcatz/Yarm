package com.unrealdinnerbone.yarm.init;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

/**
 * Created by Travis on 7/6/2015.
 */
public class Recpies
{

    public static void init()
    {
        //Shaped
        //Shaped Recipe
        GameRegistry.addRecipe(new ItemStack(ModBlocks.UnReal_Block, 1),
                "AAA",
                "AAA",
                "AAA",
                'A', ModItems.UnRealFace);


        //Shapless
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.UnRealFace, 9), new ItemStack(ModBlocks.UnReal_Block));

    }
}
