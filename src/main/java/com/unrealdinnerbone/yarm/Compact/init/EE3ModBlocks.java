package com.unrealdinnerbone.yarm.Compact.init;

import com.unrealdinnerbone.yarm.Compact.Blocks.EE3.BlockCompactBase;
import com.unrealdinnerbone.yarm.Util.LogHelper;
import cpw.mods.fml.common.registry.GameRegistry;

public class EE3ModBlocks
{
    public static final BlockCompactBase BLOCK_COMPACT_BASE = new BlockCompactBase();



    public static void init()
    {
        GameRegistry.registerBlock(BLOCK_COMPACT_BASE, "UnReal_Block");
        LogHelper.info("Loaded Blocks");
    }

}
