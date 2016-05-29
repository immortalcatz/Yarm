package com.unrealdinnerbone.yarm.blocks.ConnectedBlocks.ConnectedGlass;

import com.unrealdinnerbone.yarm.blocks.ConnectedBlocks.YarmBlockConnectedBlock;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public abstract class YarmBlockConnectedGlass extends YarmBlockConnectedBlock
{

    @Override
    public boolean isBeaconBase (World worldObj, int x, int y, int z, int beaconX, int beaconY, int beaconZ)
    {
        return false;
    }

    @Override
    @SideOnly(Side.CLIENT)
    public abstract BlockRenderLayer getBlockLayer();
}
