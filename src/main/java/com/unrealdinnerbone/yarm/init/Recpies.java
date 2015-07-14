package com.unrealdinnerbone.yarm.init;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.ShapedOreRecipe;
import net.minecraftforge.oredict.ShapelessOreRecipe;

public class Recpies
{

    public static void init()
    {
        //Shaped
        //Shaped Recipe
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.BLOCK_UNREAL_FACE ),
                    "AAA",
                    "AAA",
                    "AAA",
                    'A', ModItems.UnRealFace));

        //Shapless
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ModItems.UnRealFace, 9),
                    new ItemStack(ModBlocks.BLOCK_UNREAL_FACE)));

    }
}
