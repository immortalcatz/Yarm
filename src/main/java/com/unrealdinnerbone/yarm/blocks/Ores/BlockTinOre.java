package com.unrealdinnerbone.yarm.blocks.Ores;

import com.unrealdinnerbone.yarm.Util.Reference;

public class BlockTinOre extends BlockYarmOre
{
    private static String name = "BlockTinOre";

    public BlockTinOre()
    {
        this.setUnlocalizedName(Reference.RE_PREFIX + name);
    }
    public static String getName()
    {
        return name;
    }
}
