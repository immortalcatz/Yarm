package com.unrealdinnerbone.yarm.proxy;

import com.unrealdinnerbone.yarm.client.render.RenderBlocks;
import com.unrealdinnerbone.yarm.client.render.RenderItems;
import net.minecraftforge.fml.common.event.*;

public class ClientProxy extends CommonProxy
{
    public static void RegisterRenders(FMLInitializationEvent Event)
    {

        if(Event.getSide().isClient())
        {
            RenderBlocks.RenderBlocks();
            RenderItems.RenderItems();
        }
    }
}