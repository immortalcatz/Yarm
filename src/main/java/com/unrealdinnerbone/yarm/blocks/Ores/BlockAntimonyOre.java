package com.unrealdinnerbone.yarm.blocks.Ores;

import com.unrealdinnerbone.yarm.CreativeTab.Tab;
import com.unrealdinnerbone.yarm.blocks.BlockYarm;
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
