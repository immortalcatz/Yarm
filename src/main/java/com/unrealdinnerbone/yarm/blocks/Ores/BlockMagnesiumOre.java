package com.unrealdinnerbone.yarm.blocks.Ores;

import com.unrealdinnerbone.yarm.Util.Reference;

public class BlockMagnesiumOre extends BlockYarmOre
{
    private static String name = "BlockMagnesiumOre";

    public BlockMagnesiumOre()
    {
        this.setUnlocalizedName(Reference.RE_PREFIX + name);
    }
    public static String getName()
    {
        return name;
    }
}
