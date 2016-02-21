package com.unrealdinnerbone.yarm.blocks.Normal;

import com.unrealdinnerbone.yarm.blocks.BlockYarm;
import com.unrealdinnerbone.yarm.Util.Reference;

public class BlockAntimony extends BlockYarm {

    private static String name = "BlockAntimony";

    public BlockAntimony()
    {
        super();
        this.setUnlocalizedName(Reference.RE_PREFIX + name);

    }
    public static String getName()
    {
        return name;
    }


}
