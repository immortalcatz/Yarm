package com.unrealdinnerbone.yarm.init;

import com.unrealdinnerbone.yarm.blocks.*;
import cpw.mods.fml.common.registry.GameRegistry;

/**
 * Created by Travis on 7/5/2015.
 */
public class ModBlocks
{
    public static final BlockUnRealFace BLOCK_UNREAL_FACE = new BlockUnRealFace();
    public static final BlockUnRealChest BLOCK_UNREAL_CHEST = new BlockUnRealChest();

    public static void init()
    {
        GameRegistry.registerBlock(BLOCK_UNREAL_FACE, "UnReal_Block");
        GameRegistry.registerBlock(BLOCK_UNREAL_CHEST, "UnReal_Chest");
    }

}
