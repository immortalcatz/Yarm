package com.unrealdinnerbone.yarm.blocks.Ores;

import com.unrealdinnerbone.yarm.Util.Reference;

public class BlockAntimonyOre extends BlockYarmOre {

    private static String name = "BlockAntimonyOre";

    public BlockAntimonyOre()
    {
        this.setUnlocalizedName(Reference.RE_PREFIX + name);
    }
    public static String getName()
    {
        return name;
    }

}
