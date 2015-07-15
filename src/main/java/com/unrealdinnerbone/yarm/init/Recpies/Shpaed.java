package com.unrealdinnerbone.yarm.init.Recpies;

import com.unrealdinnerbone.yarm.init.ModBlocks;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.ShapedOreRecipe;

/**
 * Created by Travis on 7/14/2015.
 */
public class Shpaed {
    public static void init() {

        //UnRealFace's To UnRealBlock
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.BLOCK_UNREAL_FACE),
                "AAA",
                "AAA",
                "AAA",
                'A', "materialUnRealFace"));

        //Antimony Ingot To Antimony Block
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.BLOCK_ANTIMONY),
                "AAA",
                "AAA",
                "AAA",
                'A', "ingotAntimony"));
    }
}
