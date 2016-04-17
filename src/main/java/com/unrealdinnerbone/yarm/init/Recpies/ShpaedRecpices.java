package com.unrealdinnerbone.yarm.init.Recpies;

import com.unrealdinnerbone.yarm.Util.ConfigManger;
import com.unrealdinnerbone.yarm.Util.ItemStacks;
import com.unrealdinnerbone.yarm.Util.LogHelper;
import com.unrealdinnerbone.yarm.Util.OreDictionaryNames;
import com.unrealdinnerbone.yarm.init.ModBlocks;
import com.unrealdinnerbone.yarm.init.ModItems;
import net.minecraft.init.Blocks;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.ShapedOreRecipe;

public class ShpaedRecpices {
    public static void init() {

        //UnRealFace's To UnRealBlock
        GameRegistry.addRecipe(new ShapedOreRecipe(ItemStacks.BlockUnRealFace(1),
                "AAA",
                "AAA",
                "AAA",
                'A', OreDictionaryNames.Item_UnRealFace));

        //Antimony Ingot To Antimony Block
        GameRegistry.addRecipe(new ShapedOreRecipe(ItemStacks.BlockAntimony(1),
                "AAA",
                "AAA",
                "AAA",
                'A', OreDictionaryNames.Item_AntimonyIngot));

        //Nether Star incess
        GameRegistry.addRecipe(new ShapedOreRecipe(ItemStacks.BlockNetherStar1(1),
                "AAA",
                "AAA",
                "AAA",
                'A', OreDictionaryNames.NetherStar));
        GameRegistry.addRecipe(new ShapedOreRecipe(ItemStacks.BlockNetherStar2(1),
                "AAA",
                "AAA",
                "AAA",
                'A', OreDictionaryNames.BLOCK_NETHER_STAR_1));
        GameRegistry.addRecipe(new ShapedOreRecipe(ItemStacks.BlockNetherStar3(1),
                "AAA",
                "AAA",
                "AAA",
                'A', OreDictionaryNames.BLOCK_NETHER_STAR_2));
        GameRegistry.addRecipe(new ShapedOreRecipe(ItemStacks.BlockNetherStar4(1),
                "AAA",
                "AAA",
                "AAA",
                'A', OreDictionaryNames.BLOCK_NETHER_STAR_3));
        GameRegistry.addRecipe(new ShapedOreRecipe(ItemStacks.BlockNetherStar5(1),
                "AAA",
                "AAA",
                "AAA",
                'A', OreDictionaryNames.BLOCK_NETHER_STAR_4));
        GameRegistry.addRecipe(new ShapedOreRecipe(ItemStacks.BlockNetherStar6(1),
                "AAA",
                "AAA",
                "AAA",
                'A', OreDictionaryNames.BLOCK_NETHER_STAR_5));
        GameRegistry.addRecipe(new ShapedOreRecipe(ItemStacks.BlockNetherStar7(1),
                "AAA",
                "AAA",
                "AAA",
                'A', OreDictionaryNames.BLOCK_NETHER_STAR_6));
        GameRegistry.addRecipe(new ShapedOreRecipe(ItemStacks.BlockNetherStar8(1),
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
        GameRegistry.addRecipe(new ShapedOreRecipe(ItemStacks.ItemIronIngot(1),
                "AAA",
                "AAA",
                "AAA",
                'A', OreDictionaryNames.Item_IronNugget));
        GameRegistry.addRecipe(new ItemStack(ModItems.ItemFood_IronApple),
                "AAA",
                "ABA",
                "AAA",
                'A', Items.IRON_INGOT, 'B', Items.APPLE);
        GameRegistry.addRecipe(new ItemStack(ModItems.ItemFood_IronCarrot),
                "AAA",
                "ABA",
                "AAA",
                'A', ModItems.Item_IronNugget, 'B', Items.CARROT);
        if(ConfigManger.CraftableNotchApples = true) {
            GameRegistry.addRecipe(ItemStacks.ItemGoldenApple(1, 1),
                    "AAA",
                    "ABA",
                    "AAA",
                    'A', Blocks.GOLD_BLOCK, 'B', Items.APPLE);
        }
        //Golden Apple
        LogHelper.info("Loaded Shaped Recipes");



    }
}
