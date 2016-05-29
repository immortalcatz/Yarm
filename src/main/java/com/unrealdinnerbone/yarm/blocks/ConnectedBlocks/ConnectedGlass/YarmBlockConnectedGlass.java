package com.unrealdinnerbone.yarm.blocks.ConnectedBlocks.ConnectedGlass;

import com.unrealdinnerbone.yarm.blocks.ConnectedBlocks.YarmBlockConnectedBlock;
import net.minecraft.util.BlockRenderLayer;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public abstract class YarmBlockConnectedGlass extends YarmBlockConnectedBlock
{

    @Override
    @SideOnly(Side.CLIENT)
    public abstract BlockRenderLayer getBlockLayer();
}
