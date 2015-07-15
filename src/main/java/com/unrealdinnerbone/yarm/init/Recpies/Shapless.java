package com.unrealdinnerbone.yarm.init.Recpies;

import com.unrealdinnerbone.yarm.init.ModBlocks;
import com.unrealdinnerbone.yarm.init.ModItems;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.ShapelessOreRecipe;

public class Shapless {
    public static void init()
    {
       //UnRealBlock To UnRealFace
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ModItems.UnRealFace, 9),
                new ItemStack(ModBlocks.BLOCK_UNREAL_FACE)));

        //Antimony Block To An Antimony Ingot
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ModItems.AntimonyIngot, 9),
                "materialAntimony"));
    }
}
