package com.unrealdinnerbone.yarm.blocks.NetherStarBlocks;

import com.unrealdinnerbone.yarm.reference.Reference;
import net.minecraft.block.state.IBlockState;

public class BlockNetherStar5 extends BlockBaseNetherStar {

    private static String name = "BlockNetherStar5";

    public BlockNetherStar5()
    {
        this.setUnlocalizedName(Reference.RE_PREFIX + name);
    }
    public static String getName()
    {
        return name;
    }
    
}
