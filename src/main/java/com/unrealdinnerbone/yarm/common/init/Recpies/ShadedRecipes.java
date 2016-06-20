package com.unrealdinnerbone.yarm.common.init.Recpies;

import com.unrealdinnerbone.yarm.Util.CraftingHelper;
import com.unrealdinnerbone.yarm.Util.ItemStacks;
import com.unrealdinnerbone.yarm.Util.LogHelper;
import com.unrealdinnerbone.yarm.Util.OreDictionaryNames;
import com.unrealdinnerbone.yarm.common.config.OtherConfig;
import com.unrealdinnerbone.yarm.common.init.ModBlocks;
import com.unrealdinnerbone.yarm.common.init.ModItems;
import com.unrealdinnerbone.yarm.common.init.Recpies.Shaped.SolarPanelsRecipes;
import net.minecraft.init.Blocks;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.ShapedOreRecipe;

import static com.unrealdinnerbone.yarm.common.init.ModBlocks.*;
import static com.unrealdinnerbone.yarm.common.init.ModItems.*;

public class ShadedRecipes {
    public static void init() {
        SolarPanelsRecipes.init();
        //UnRealFace's To UnRealBlock
        CraftingHelper.RegisterFullBlockRecipe(OreDictionaryNames.Item_UnRealFace, ModBlocks.BLOCK_UNREAL_FACE);
        CraftingHelper.RegisterFullBlockRecipe(OreDictionaryNames.Item_AntimonyIngot, ModBlocks.BLOCK_ANTIMONY);
        CraftingHelper.RegisterFullBlockRecipe(OreDictionaryNames.NetherStar, ModBlocks.BLOCK_NETHER_STAR_1);
        CraftingHelper.RegisterFullBlockRecipe(BLOCK_NETHER_STAR_1, BLOCK_NETHER_STAR_2);
        CraftingHelper.RegisterFullBlockRecipe(BLOCK_NETHER_STAR_2, BLOCK_NETHER_STAR_3);
        CraftingHelper.RegisterFullBlockRecipe(BLOCK_NETHER_STAR_3, BLOCK_NETHER_STAR_4);
        CraftingHelper.RegisterFullBlockRecipe(BLOCK_NETHER_STAR_4, BLOCK_NETHER_STAR_5);
        CraftingHelper.RegisterFullBlockRecipe(BLOCK_NETHER_STAR_5, BLOCK_NETHER_STAR_6);
        CraftingHelper.RegisterFullBlockRecipe(BLOCK_NETHER_STAR_6, BLOCK_NETHER_STAR_7);
        CraftingHelper.RegisterFullBlockRecipe(BLOCK_NETHER_STAR_7, BLOCK_NETHER_STAR_8);

        CraftingHelper.RegisterRingRecipe(BLOCK_NETHER_STAR_1, ITEM_RING_1);


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
        if(OtherConfig.CraftableNotchApples = true) {
            GameRegistry.addRecipe(ItemStacks.ItemGoldenApple(1, 1),
                    "AAA",
                    "ABA",
                    "AAA",
                    'A', Blocks.GOLD_BLOCK,
                    'B', Items.APPLE);
        }
        GameRegistry.addRecipe(new ItemStack(Blocks.PLANKS, 4),
                "   ",
                " A ",
                " A ",
                'A', Blocks.WOODEN_PRESSURE_PLATE);
        GameRegistry.addRecipe(new ItemStack(Blocks.STONE, 4),
                "   ",
                " A ",
                " A ",
                'A', Blocks.STONE_PRESSURE_PLATE);
        GameRegistry.addRecipe(new ItemStack(ModItems.ITEM_WING_1),
                "A A",
                "BCB",
                "DBD",
                'A', Items.FEATHER,
                'B', Items.STICK,
                'C', ModItems.ITEM_RING_2,
                'D', ModBlocks.BLOCK_NETHER_STAR_1
        );
        //Golden Apple
        LogHelper.info("Loaded Shaped Recipes");



    }
}
