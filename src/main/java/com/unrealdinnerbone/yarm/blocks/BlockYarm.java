package com.unrealdinnerbone.yarm.blocks;

import com.unrealdinnerbone.yarm.CreativeTab.Tab;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.world.World;

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
        this.setHardness(3.5F);
        this.setSoundType(SoundType.METAL);
    }

    public abstract boolean isBeaconBase (World worldObj, int x, int y, int z, int beaconX, int beaconY, int beaconZ);

}
