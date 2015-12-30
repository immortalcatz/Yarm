package com.unrealdinnerbone.yarm.blocks;

import com.unrealdinnerbone.yarm.CreativeTab.Tab;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import reborncore.api.TextureRegistry;

public class BlockYarm extends Block
{
    public BlockYarm(Material material)
    {
        super(material);
    }

    public BlockYarm()
    {
        this(Material.rock);
        this.setCreativeTab(Tab.Yarm_Tab);
        this.setHardness(3.5F);
        this.setStepSound(soundTypeStone);
        TextureRegistry.registerBlock(this);

    }



}
