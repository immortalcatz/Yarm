package com.unrealdinnerbone.yarm.init;

import com.unrealdinnerbone.yarm.blocks.BlockUnRealChest;
import com.unrealdinnerbone.yarm.item.ItemManmaedFace;
import com.unrealdinnerbone.yarm.item.ItemUnRealFace;
import com.unrealdinnerbone.yarm.item.ItemYarm;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;

public class ModItems
    {

    public static final ItemYarm UnRealFace = new ItemUnRealFace();
    public static final ItemYarm ManmedFace = new ItemManmaedFace();

    public static void init()
    {

        GameRegistry.registerItem(UnRealFace, "ItemUnRealFace");
        GameRegistry.registerItem(ManmedFace, "ItemManmedFace");

    }

}
