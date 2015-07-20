package com.unrealdinnerbone.yarm.blocks;

import com.unrealdinnerbone.yarm.CreativeTab.Tab;
import net.minecraft.block.material.Material;

public class BlockAntimonyOre extends BlockYarm
{
    public BlockAntimonyOre()
    {
        super(Material.iron);
        this.setBlockName("AntimonyOre");
        this.setBlockTextureName("yarm" + ":AntimonyOre");
        this.setCreativeTab(Tab.Yarm_Tab);
    }
}
