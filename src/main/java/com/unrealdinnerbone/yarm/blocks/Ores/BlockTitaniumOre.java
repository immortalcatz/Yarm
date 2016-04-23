package com.unrealdinnerbone.yarm.blocks.Ores;

import com.unrealdinnerbone.yarm.Util.Reference;

public class BlockTitaniumOre extends BlockYarmOre
{
    private static String name = "BlockTitaniumOre";

    public BlockTitaniumOre()
    {
        this.setUnlocalizedName(Reference.RE_PREFIX + name);
    }
    public static String getName()
    {
        return name;
    }
}
