package com.unrealdinnerbone.yarm.blocks.Ores;

import com.unrealdinnerbone.yarm.Util.Reference;

public class BlockZincOre extends BlockYarmOre
{
    private static String name = "BlockZincOre";

    public BlockZincOre()
    {
        this.setUnlocalizedName(Reference.RE_PREFIX + name);
    }
    public static String getName()
    {
        return name;
    }
}
