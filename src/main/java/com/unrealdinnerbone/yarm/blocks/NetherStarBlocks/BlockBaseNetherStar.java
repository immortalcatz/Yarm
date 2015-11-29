package com.unrealdinnerbone.yarm.blocks.NetherStarBlocks;

import com.unrealdinnerbone.yarm.blocks.BlockYarm;
import com.unrealdinnerbone.yarm.reference.Reference;
import net.minecraft.world.World;

public class BlockBaseNetherStar extends BlockYarm {

    private static String name = "BlockBaseNetherStar";

    public BlockBaseNetherStar()
    {
        super();
        this.setHardness(3);
        this.setResistance(100);
    }
    public boolean isBeaconBase (World worldObj, int x, int y, int z, int beaconX, int beaconY, int beaconZ)
    {
     return true;
    }
    public static String getName()
    {
        return name;
    }

}
