package com.unrealdinnerbone.yarm.init;

import com.unrealdinnerbone.yarm.blocks.BlockUnRealFace;
import com.unrealdinnerbone.yarm.blocks.BlockYarm;
import cpw.mods.fml.common.registry.GameRegistry;

/**
 * Created by Travis on 7/5/2015.
 */
public class ModBlocks
{
    public static final BlockYarm UnReal_Block = new BlockUnRealFace();

    public static void init()
    {
        GameRegistry.registerBlock(UnReal_Block, "UnReal_Block");
    }
}
