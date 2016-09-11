package com.unrealdinnerbone.yarm.common.blocks.Faces;

import com.unrealdinnerbone.yarm.Util.Tab;
import com.unrealdinnerbone.yarm.Util.LangHelper;
import com.unrealdinnerbone.yarm.common.blocks.BlockYarm;
import com.unrealdinnerbone.yarm.Util.Reference;
import net.minecraft.block.material.Material;

public class BlockUnRealFace extends BlockYarm
{
    private static String name = "unrealface_block";

    public BlockUnRealFace()
       {
       super(Material.ROCK);
       this.setCreativeTab(Tab.Yarm_Tab);
       this.setUnlocalizedName(Reference.itemBlockId + name);
       }

    @Override
    public String getLocalizedName() {
        return LangHelper.Block.translateMessage(name);
    }

    public static String getName()
    {
        return name;
    }
}

