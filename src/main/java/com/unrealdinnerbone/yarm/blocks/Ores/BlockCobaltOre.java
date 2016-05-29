package com.unrealdinnerbone.yarm.blocks.Ores;

import com.unrealdinnerbone.yarm.Util.LangHelper;
import com.unrealdinnerbone.yarm.Util.Reference;
import net.minecraft.world.World;

public class BlockCobaltOre extends BlockYarmOre
{
    private static String name = "BlockCobaltOre";

    public BlockCobaltOre()
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
