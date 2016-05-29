package com.unrealdinnerbone.yarm.blocks.NetherStarBlocks;


import com.unrealdinnerbone.yarm.Util.Reference;
import net.minecraft.world.World;

public class BlockNetherStar8 extends BlockBaseNetherStar {

    private static String name = "BlockNetherStar8";

    public BlockNetherStar8()
    {
        this.setUnlocalizedName(Reference.RE_PREFIX + name);
    }

    @Override
    public boolean isBeaconBase (World worldObj, int x, int y, int z, int beaconX, int beaconY, int beaconZ) {
        return true;
    }

    public static String getName()
    {
        return name;
    }

}
