package com.unrealdinnerbone.yarm.blocks.NetherStarBlocks;

import com.unrealdinnerbone.yarm.reference.Reference;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.EnumFacing;

public class BlockNetherStar3 extends BlockBaseNetherStar {

    private static String name = "BlockNetherStar3";

    public BlockNetherStar3()
    {
        this.setUnlocalizedName(Reference.RE_PREFIX + name);
    }
    public static String getName()
    {
        return name;
    }


}
