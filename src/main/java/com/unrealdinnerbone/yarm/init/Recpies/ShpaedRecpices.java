package com.unrealdinnerbone.yarm.init.Recpies;

import com.unrealdinnerbone.yarm.Util.LogHelper;
import com.unrealdinnerbone.yarm.Util.OreDictionaryNames;
import com.unrealdinnerbone.yarm.init.ModBlocks;
import com.unrealdinnerbone.yarm.init.ModItems;
import net.minecraft.init.Blocks;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.ShapedRecipes;
import net.minecraftforge.oredict.ShapedOreRecipe;

public class ShpaedRecpices {
    public static void init() {

        //UnRealFace's To UnRealBlock
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.BLOCK_UNREAL_FACE),
                "AAA",
                "AAA",
                "AAA",
                'A', OreDictionaryNames.Item_UnRealFace));

        //Antimony Ingot To Antimony Block
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.BLOCK_ANTIMONY),
                "AAA",
                "AAA",
                "AAA",
                'A', OreDictionaryNames.Item_AntimonyIngot));

        //Nether Star incess
        GameRegistry.addRecipe(new ItemStack(ModBlocks.BLOCK_NETHER_STAR_1),
                "AAA",
                "AAA",
                "AAA",
                'A', Items.NETHER_STAR);
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.BLOCK_NETHER_STAR_2),
                "AAA",
                "AAA",
                "AAA",
                'A', OreDictionaryNames.BLOCK_NETHER_STAR_1));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.BLOCK_NETHER_STAR_3),
                "AAA",
                "AAA",
                "AAA",
                'A', OreDictionaryNames.BLOCK_NETHER_STAR_2));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.BLOCK_NETHER_STAR_4),
                "AAA",
                "AAA",
                "AAA",
                'A', OreDictionaryNames.BLOCK_NETHER_STAR_3));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.BLOCK_NETHER_STAR_5),
                "AAA",
                "AAA",
                "AAA",
                'A', OreDictionaryNames.BLOCK_NETHER_STAR_4));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.BLOCK_NETHER_STAR_6),
                "AAA",
                "AAA",
                "AAA",
                'A', OreDictionaryNames.BLOCK_NETHER_STAR_5));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.BLOCK_NETHER_STAR_7),
                "AAA",
                "AAA",
                "AAA",
                'A', OreDictionaryNames.BLOCK_NETHER_STAR_6));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.BLOCK_NETHER_STAR_8),
                "AAA",
                "AAA",
                "AAA",
                'A', OreDictionaryNames.BLOCK_NETHER_STAR_7));

        //Nether Star Axe
        GameRegistry.addRecipe(new ItemStack(ModItems.ItemTool_OpAxe),
                " AA",
                " BA",
                " B ",
                'A', ModBlocks.BLOCK_NETHER_STAR_3,
                'B', ModItems.Item_NetherStarRod);
        //Nether Star Hoe
        GameRegistry.addRecipe(new ItemStack(ModItems.ItemTool_OpHoe),
                "AA ",
                " B ",
                " B ",
                'A', ModBlocks.BLOCK_NETHER_STAR_3,
                'B', ModItems.Item_NetherStarRod);
        //Nether Star Pick
        GameRegistry.addRecipe(new ItemStack(ModItems.ItemTool_OpPick),
                "AAA",
                " B ",
                " B ",
                'A', ModBlocks.BLOCK_NETHER_STAR_3,
                'B', ModItems.Item_NetherStarRod);
        //Nether Star Shovel
        GameRegistry.addRecipe(new ItemStack(ModItems.ItemTool_OpSpade),
                " A ",
                " B ",
                " B ",
                'A', ModBlocks.BLOCK_NETHER_STAR_3,
                'B', ModItems.Item_NetherStarRod);
        //Nether Star Sword
        GameRegistry.addRecipe(new ItemStack(ModItems.ItemTool_OpSword),
                " A ",
                " A ",
                " B ",
                'A', ModBlocks.BLOCK_NETHER_STAR_3,
                'B', ModItems.Item_NetherStarRod);
        GameRegistry.addRecipe(new ItemStack(Items.IRON_INGOT),
                "AAA",
                "AAA",
                "AAA",
                'A', ModItems.Item_IronNugget);
        //Golden Apple
        LogHelper.info("Loaded Shaped Recipes");



    }
}
