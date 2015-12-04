package com.unrealdinnerbone.yarm.blocks.NetherStarBlocks;

import com.unrealdinnerbone.yarm.reference.Reference;

public class BlockNetherStar1 extends BlockBaseNetherStar {

    private static String name = "BlockNetherStar1";

    public BlockNetherStar1()
    {
        super();
        this.setUnlocalizedName(Reference.RE_PREFIX + name);
        
    }
    public static String getName()
    {
        return name;
    }
}
