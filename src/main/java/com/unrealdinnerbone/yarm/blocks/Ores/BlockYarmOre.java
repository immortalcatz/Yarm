package com.unrealdinnerbone.yarm.blocks.Ores;

import com.unrealdinnerbone.yarm.CreativeTab.Tab;
import com.unrealdinnerbone.yarm.blocks.BlockYarm;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class BlockYarmOre extends BlockYarm
{
    public BlockYarmOre(Material material)
    {
        super(material);
    }
    public BlockYarmOre()
    {
        this(Material.ROCK);
        this.setCreativeTab(Tab.Yarm_Tab);
        this.setHardness(4.0F);
        this.setSoundType(SoundType.GROUND);
    }

}
