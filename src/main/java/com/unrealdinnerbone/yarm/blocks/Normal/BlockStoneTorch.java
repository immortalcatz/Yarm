package com.unrealdinnerbone.yarm.blocks.Normal;

import com.unrealdinnerbone.yarm.CreativeTab.Tab;
import com.unrealdinnerbone.yarm.reference.Reference;
import net.minecraft.block.BlockTorch;

public class BlockStoneTorch extends BlockTorch
{
    private static String name = "BlockStoneTorch";

    public BlockStoneTorch()
    {
        super();
        this.setUnlocalizedName(Reference.RE_PREFIX + name);
        this.setCreativeTab(Tab.Yarm_Tab);
        this.setLightLevel(50);

    }
    public boolean isOpaqueCube() {
        return false;
    }

    public boolean isFullCube() {
        return false;
    }
    public static String getName()
    {
        return name;
    }


}