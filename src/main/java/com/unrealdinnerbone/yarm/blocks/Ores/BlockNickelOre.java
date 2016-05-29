package com.unrealdinnerbone.yarm.blocks.Ores;

import com.unrealdinnerbone.yarm.Util.Reference;
import net.minecraft.world.World;

public class BlockNickelOre extends BlockYarmOre
{
    private static String name = "BlockNickelOre";

    public BlockNickelOre()
    {
        this.setUnlocalizedName(Reference.RE_PREFIX + name);
    }

    @Override public boolean isBeaconBase (World worldObj, int x, int y, int z, int beaconX, int beaconY, int beaconZ) {

        return true;
    }

    public static String getName()
    {
        return name;
    }
}
