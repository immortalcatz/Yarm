package com.unrealdinnerbone.yarm.blocks;

import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class BlockUnRealFace extends BlockYarm
{
    public BlockUnRealFace()
    {
        super();
        this.setBlockName("UnReal_Block");
        this.setBlockTextureName("yarm" + ":UnReal_Face");
        this.setCreativeTab(CreativeTabs.tabDecorations);
    }
}
