package com.unrealdinnerbone.yarm.init.Recpies;

import com.unrealdinnerbone.yarm.init.ModBlocks;
import com.unrealdinnerbone.yarm.init.ModItems;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.ItemStack;

public class Smelting {
    public static void init()
    {
        //Antimony Ore To Antimony Igont
        GameRegistry.addSmelting(ModBlocks.BLOCK_ANTIMONY_ORE, new ItemStack(ModItems.AntimonyIngot), 0.5f);

    }
}
