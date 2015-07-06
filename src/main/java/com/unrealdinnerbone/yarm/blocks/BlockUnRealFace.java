package com.unrealdinnerbone.yarm.blocks;

import net.minecraft.creativetab.CreativeTabs;
import com.unrealdinnerbone.yarm.CreativeTab.Tab;

public class BlockUnRealFace extends BlockYarm
{
    public BlockUnRealFace()
    {
        super();
        this.setBlockName("UnReal_Block");
        this.setBlockTextureName("yarm" + ":UnReal_Face");
        this.setStepSound(soundTypeStone);
        this.setCreativeTab(Tab.Yarm_Tab);
    }
}
