package com.unrealdinnerbone.yarm.init.Recpies;

import com.unrealdinnerbone.yarm.Util.ConfigManger;
import com.unrealdinnerbone.yarm.Util.LogHelper;
import com.unrealdinnerbone.yarm.init.ModBlocks;
import com.unrealdinnerbone.yarm.init.ModItems;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraft.item.ItemStack;

public class SmeltingRecpices {
    public static void init()
    {
        //Antimony Ore To Antimony Igont
        GameRegistry.addSmelting(ModBlocks.BLOCK_ANTIMONY_ORE, new ItemStack(ModItems.Item_AntimonyIngot), 0.5f);
        LogHelper.info("Loaded Smelting Recipes");
        if(ConfigManger.IronBarsUnCrafting = true)
        {
            GameRegistry.addSmelting(Blocks.IRON_BARS, new ItemStack(ModItems.Item_IronNugget, 3), 0.5f);
        }

    }
}
