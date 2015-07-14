package com.unrealdinnerbone.yarm.blocks;

import net.minecraft.block.material.Material;

public class BlockUnRealFace extends BlockYarm
{
    public BlockUnRealFace()
    {
        super(Material.rock);
        this.setBlockName("UnReal_Block");
        this.setBlockTextureName("yarm" + ":UnReal_Face");
        this.setStepSound(soundTypeStone);
    }
}
