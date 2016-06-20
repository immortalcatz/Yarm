package com.unrealdinnerbone.yarm.common.init.Recpies.Shaped;

import com.unrealdinnerbone.yarm.common.init.ModBlocks;
import com.unrealdinnerbone.yarm.common.init.ModItems;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.OreDictionary;

public class SolarPanelsRecipes
{
    public static void init()
    {
        GameRegistry.addRecipe(new ItemStack(ModBlocks.BLOCK_NIGHT_PANEL_TEIR_1),
                "AAA",
                "CBC",
                "CCC",
                'A', Blocks.GLASS,
                'B', Blocks.DAYLIGHT_DETECTOR,
                'C', Items.LEATHER);

    }
}
