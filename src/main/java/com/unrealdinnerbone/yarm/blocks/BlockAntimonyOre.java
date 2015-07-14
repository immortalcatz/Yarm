package com.unrealdinnerbone.yarm.blocks;

import net.minecraft.block.material.Material;

public class BlockAntimonyOre extends BlockYarm
{
    public BlockAntimonyOre()
    {
        super(Material.iron);
        this.setBlockName("AntimonyOre");
        this.setBlockTextureName("yarm" + ":AntimonyOre");
    }
}
