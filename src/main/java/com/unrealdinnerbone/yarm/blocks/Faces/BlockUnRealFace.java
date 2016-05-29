package com.unrealdinnerbone.yarm.blocks.Faces;

import com.unrealdinnerbone.yarm.CreativeTab.Tab;
import com.unrealdinnerbone.yarm.blocks.BlockYarm;
import com.unrealdinnerbone.yarm.Util.Reference;
import net.minecraft.block.material.Material;
import net.minecraft.world.World;

public class BlockUnRealFace extends BlockYarm
{
    private static String name = "BlockUnRealFace";

    public BlockUnRealFace()
       {
       super(Material.ROCK);
       this.setCreativeTab(Tab.Yarm_Tab);
       this.setUnlocalizedName(Reference.RE_PREFIX + name);
       }

    @Override public boolean isBeaconBase (World worldObj, int x, int y, int z, int beaconX, int beaconY, int beaconZ) {

        return false;
    }

    public static String getName()
    {
        return name;
    }
}

