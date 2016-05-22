package com.unrealdinnerbone.yarm.init.Recpies;

import com.unrealdinnerbone.yarm.init.ModBlocks;
import com.unrealdinnerbone.yarm.init.ModItems;
import net.minecraft.init.Blocks;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraft.item.ItemStack;

public class SmeltingRecpices
{
    public static void init()
    {
        GameRegistry.addSmelting(ModBlocks.BLOCK_ANTIMONY_ORE, new ItemStack(ModItems.Item_AntimonyIngot), 0.5f);
        GameRegistry.addSmelting(Blocks.IRON_BARS, new ItemStack(ModItems.Item_IronNugget, 3), 0.5f);
    }
}
