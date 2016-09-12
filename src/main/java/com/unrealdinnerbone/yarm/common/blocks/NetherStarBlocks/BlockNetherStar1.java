package com.unrealdinnerbone.yarm.common.blocks.NetherStarBlocks;

import com.unrealdinnerbone.yarm.Util.LangHelper;
import com.unrealdinnerbone.yarm.Util.Reference;
import net.minecraft.world.World;

public class BlockNetherStar1 extends BlockBaseNetherStar {

    private static String name = "compressed_netherstar";

    public BlockNetherStar1()
    {
        super();
        this.setUnlocalizedName(Reference.itemBlockId + name);
        
    }

    @Override
    public String getLocalizedName() {
        return LangHelper.Block.translateMessage(name);
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
