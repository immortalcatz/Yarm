package com.unrealdinnerbone.yarm.Util;


import com.unrealdinnerbone.yarm.init.ModBlocks;
import com.unrealdinnerbone.yarm.init.ModItems;
import net.minecraft.block.Block;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

public class ItemStacks
{
    public static ItemStack ItemIronNugget(int Count)
    {
        return new ItemStack(ModItems.Item_IronNugget, Count);
    }
    public static ItemStack ItemFoodIronApple(int Count)
    {
        return new ItemStack(ModItems.ItemFood_IronApple, Count);
    }
    public static ItemStack ItemFoodIronCarrot(int Count)
    {
        return new ItemStack(ModItems.ItemFood_IronCarrot, Count);
    }
    public static ItemStack ItemUnRealFace(int Count)
    {
        return new ItemStack(ModItems.Item_UnRealFace, Count);
    }
    public static ItemStack ItemManmaedFace(int Count)
    {
        return new ItemStack(ModItems.Item_ManmedFace, Count);
    }
    public static ItemStack ItemYunusFace(int Count)
    {
        return new ItemStack(ModItems.Item_YunusFace, Count);
    }
    public static ItemStack ItemKyaneFace(int Count)
    {
        return new ItemStack(ModItems.Item_KyaneFace, Count);
    }
    public static ItemStack ItemAntimonyIngot(int Count)
    {
        return new ItemStack(ModItems.Item_AntimonyIngot, Count);
    }
    public static ItemStack BlockUnRealFace(int Count)
    {
        return new ItemStack(ModBlocks.BLOCK_UNREAL_FACE, Count);
    }
    public static ItemStack BlockAntimonyOre(int Count)
    {
        return new ItemStack(ModBlocks.BLOCK_ANTIMONY_ORE, Count);
    }
    public static ItemStack BlockAntimony(int Count)
    {
        return new ItemStack(ModBlocks.BLOCK_ANTIMONY, Count);
    }
    public static ItemStack BlockNetherStar1(int Count)
    {
        return new ItemStack(ModBlocks.BLOCK_NETHER_STAR_1, Count);
    }
    public static ItemStack BlockNetherStar2(int Count)
    {
        return new ItemStack(ModBlocks.BLOCK_NETHER_STAR_2, Count);
    }
    public static ItemStack BlockNetherStar3(int Count)
    {
        return new ItemStack(ModBlocks.BLOCK_NETHER_STAR_3, Count);
    }
    public static ItemStack BlockNetherStar4(int Count)
    {
        return new ItemStack(ModBlocks.BLOCK_NETHER_STAR_4, Count);
    }
    public static ItemStack BlockNetherStar5(int Count)
    {
        return new ItemStack(ModBlocks.BLOCK_NETHER_STAR_5, Count);
    }
    public static ItemStack BlockNetherStar6(int Count)
    {
        return new ItemStack(ModBlocks.BLOCK_NETHER_STAR_6, Count);
    }
    public static ItemStack BlockNetherStar7(int Count)
    {
        return new ItemStack(ModBlocks.BLOCK_NETHER_STAR_7, Count);
    }
    public static ItemStack BlockNetherStar8(int Count)
    {
        return new ItemStack(ModBlocks.BLOCK_NETHER_STAR_8, Count);
    }
    public static ItemStack ItemGoldenApple(int Count, int Meta)
    {
        return new ItemStack(Items.GOLDEN_APPLE, Count, Meta);
    }
    public static ItemStack ItemIronIngot(int Count)
    {
        return new ItemStack(Items.IRON_INGOT, Count);
    }

}
