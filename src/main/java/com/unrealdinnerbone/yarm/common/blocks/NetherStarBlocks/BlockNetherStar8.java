package com.unrealdinnerbone.yarm.common.blocks.NetherStarBlocks;


import com.unrealdinnerbone.yarm.Util.LangHelper;
import com.unrealdinnerbone.yarm.Util.Reference;
import net.minecraft.world.World;

public class BlockNetherStar8 extends BlockBaseNetherStar {

    private static String name = "octuple_compressed_nether";

    public BlockNetherStar8()
    {
        this.setUnlocalizedName(Reference.itemBlockId + name);
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
