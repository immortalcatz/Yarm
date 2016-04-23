package com.unrealdinnerbone.yarm.blocks.Ores;

import com.unrealdinnerbone.yarm.Util.Reference;

public class BlockLeadOre extends BlockYarmOre
{
    private static String name = "BlockLeadOre";

    public BlockLeadOre()
    {
        this.setUnlocalizedName(Reference.RE_PREFIX + name);
    }
    public static String getName()
    {
        return name;
    }
}
