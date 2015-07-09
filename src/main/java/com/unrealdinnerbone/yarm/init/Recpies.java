package com.unrealdinnerbone.yarm.init;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.BlockGrass;
import net.minecraft.init.Blocks;
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
        GameRegistry.addRecipe(new ItemStack(ModBlocks.BLOCK_UNREAL_FACE, 1),
               "AAA",
               "AAA",
               "AAA",
               'A', ModItems.UnRealFace);

        //Shapless
                GameRegistry.addShapelessRecipe(new ItemStack(ModItems.UnRealFace, 9), new ItemStack(ModBlocks.BLOCK_UNREAL_FACE));
                  }
}
