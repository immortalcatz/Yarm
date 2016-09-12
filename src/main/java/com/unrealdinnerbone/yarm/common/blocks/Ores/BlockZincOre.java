package com.unrealdinnerbone.yarm.common.blocks.Ores;

import com.unrealdinnerbone.yarm.Util.LangHelper;
import com.unrealdinnerbone.yarm.Util.Reference;
import net.minecraft.world.World;

public class BlockZincOre extends BlockYarmOre
{
    private static String name = "BlockZincOre";

    public BlockZincOre()
    {
        this.setUnlocalizedName(Reference.RE_PREFIX + name);
    }

    @Override
    public String getLocalizedName() {
        return LangHelper.Block.translateMessage(name);
    }

    @Override public boolean isBeaconBase (World worldObj, int x, int y, int z, int beaconX, int beaconY, int beaconZ) {

        return true;
    }

    public static String getName()
    {
        return name;
    }
}
