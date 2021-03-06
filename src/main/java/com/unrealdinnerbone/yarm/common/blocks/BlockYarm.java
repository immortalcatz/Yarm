package com.unrealdinnerbone.yarm.common.blocks;

import com.unrealdinnerbone.yarm.Util.Tab;
import net.minecraft.block.Block;
import net.minecraft.block.BlockTNT;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public abstract class BlockYarm extends Block
{
    public BlockYarm(Material material)
    {
        super(material);
    }

    public BlockYarm()
    {
        this(Material.ROCK);
        this.setCreativeTab(Tab.Yarm_Tab);
        this.setHardness(1.0F);
        this.setSoundType(SoundType.METAL);
    }


    @Override
    public abstract String getLocalizedName();

}
