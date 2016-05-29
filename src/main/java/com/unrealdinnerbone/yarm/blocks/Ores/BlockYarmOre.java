package com.unrealdinnerbone.yarm.blocks.Ores;

import com.unrealdinnerbone.yarm.Util.Tab;
import com.unrealdinnerbone.yarm.blocks.BlockYarm;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.world.World;

public abstract class BlockYarmOre extends BlockYarm
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
        this.setSoundType(SoundType.STONE);
    }

    public abstract boolean isBeaconBase (World worldObj, int x, int y, int z, int beaconX, int beaconY, int beaconZ);

}
