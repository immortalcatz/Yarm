package com.unrealdinnerbone.yarm.blocks.Furn;

import com.unrealdinnerbone.yarm.CreativeTab.Tab;
import net.minecraft.block.BlockFurnace;

public class YarmFurance extends BlockFurnace
{
    public static String name = "YarmF";

    public YarmFurance(boolean isBurning) {
        super(isBurning);
        this.setUnlocalizedName(name);
        this.setCreativeTab(Tab.Yarm_Tab);
    }

    public static String getName()
    {
        return name;
    }
}
