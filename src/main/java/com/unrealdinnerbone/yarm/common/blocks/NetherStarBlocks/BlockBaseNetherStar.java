package com.unrealdinnerbone.yarm.common.blocks.NetherStarBlocks;

import com.unrealdinnerbone.yarm.common.blocks.BlockYarm;
import net.minecraft.world.World;

public abstract class BlockBaseNetherStar extends BlockYarm {

    public BlockBaseNetherStar()
    {
        super();
        this.setHardness(3);
        this.setResistance(100);
    }
    public abstract boolean isBeaconBase (World worldObj, int x, int y, int z, int beaconX, int beaconY, int beaconZ);

}
