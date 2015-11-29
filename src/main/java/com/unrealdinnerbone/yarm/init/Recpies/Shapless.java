package com.unrealdinnerbone.yarm.init.Recpies;

import com.unrealdinnerbone.yarm.Util.LogHelper;
import com.unrealdinnerbone.yarm.init.ModBlocks;
import com.unrealdinnerbone.yarm.init.ModItems;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.ShapelessOreRecipe;

public class Shapless {
    public static void init()
    {
       //UnRealBlock To UnRealFace
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ModItems.ItemUnRealFace, 9),
                new ItemStack(ModBlocks.BLOCK_UNREAL_FACE)));

        //Antimony Block To An Antimony Ingot
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ModItems.ItemAntimonyIngot, 9),
                "materialAntimony"));

        //Nether Star Incess Level
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(Items.nether_star, 9),
                "materialNetherStar1"));
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ModBlocks.BLOCK_NETHER_STAR_1, 9),
                "materialNetherStar2"));
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ModBlocks.BLOCK_NETHER_STAR_2, 9),
                "materialNetherStar3"));
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ModBlocks.BLOCK_NETHER_STAR_3, 9),
                "materialNetherStar4"));
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ModBlocks.BLOCK_NETHER_STAR_4, 9),
                "materialNetherStar5"));
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ModBlocks.BLOCK_NETHER_STAR_5, 9),
                "materialNetherSta6"));
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ModBlocks.BLOCK_NETHER_STAR_6, 9),
                "materialNetherStar7"));
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ModBlocks.BLOCK_NETHER_STAR_7, 9),
                "materialNetherStar8"));
        LogHelper.info("Loaded Shapeless Recipe");

    }
}
