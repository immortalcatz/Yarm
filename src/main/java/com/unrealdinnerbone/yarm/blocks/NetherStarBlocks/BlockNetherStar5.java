package com.unrealdinnerbone.yarm.blocks.NetherStarBlocks;

import com.unrealdinnerbone.yarm.Util.LangHelper;
import com.unrealdinnerbone.yarm.Util.Reference;
import net.minecraft.world.World;

public class BlockNetherStar5 extends BlockBaseNetherStar {

    private static String name = "BlockNetherStar5";

    public BlockNetherStar5()
    {
        this.setUnlocalizedName(Reference.RE_PREFIX + name);
    }

    @Override
    public boolean isBeaconBase (World worldObj, int x, int y, int z, int beaconX, int beaconY, int beaconZ) {
        return true;
    }

    @Override
    public String getLocalizedName() {
        return LangHelper.Block.translateMessage(name);
    }

    public static String getName()
    {
        return name;
    }
    
}
