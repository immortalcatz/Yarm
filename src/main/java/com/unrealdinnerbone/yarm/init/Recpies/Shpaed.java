package com.unrealdinnerbone.yarm.init.Recpies;

import com.unrealdinnerbone.yarm.init.ModBlocks;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.ShapedRecipes;
import net.minecraftforge.oredict.ShapedOreRecipe;

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

        //Nether Star incess
        GameRegistry.addRecipe(new ItemStack(ModBlocks.BLOCK_NETHER_STAR_1),
                "AAA",
                "AAA",
                "AAA",
                'A', Items.nether_star);
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.BLOCK_NETHER_STAR_2),
                "AAA",
                "AAA",
                "AAA",
                'A', "materialNetherStar1"));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.BLOCK_NETHER_STAR_3),
                "AAA",
                "AAA",
                "AAA",
                'A', "materialNetherStar2"));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.BLOCK_NETHER_STAR_4),
                "AAA",
                "AAA",
                "AAA",
                'A', "materialNetherStar3"));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.BLOCK_NETHER_STAR_5),
                "AAA",
                "AAA",
                "AAA",
                'A', "materialNetherStar4"));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.BLOCK_NETHER_STAR_6),
                "AAA",
                "AAA",
                "AAA",
                'A', "materialNetherStar5"));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.BLOCK_NETHER_STAR_7),
                "AAA",
                "AAA",
                "AAA",
                'A', "materialNetherStar6"));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.BLOCK_NETHER_STAR_8),
                "AAA",
                "AAA",
                "AAA",
                'A', "materialNetherStar7"));



    }
}
