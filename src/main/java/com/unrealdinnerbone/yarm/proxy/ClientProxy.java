package com.unrealdinnerbone.yarm.proxy;

import com.unrealdinnerbone.yarm.Client.render.RenderBlocks;
import com.unrealdinnerbone.yarm.Client.render.RenderItems;
import net.minecraftforge.fml.common.event.*;

public class ClientProxy extends CommonProxy
{

    public static void PreInt(FMLPreInitializationEvent Event)
    {
        if(Event.getSide().isClient())
        {

        }
    }
    public static void Int(FMLInitializationEvent Event)
    {
        if(Event.getSide().isClient())
        {
            RegisterRenders(Event);
        }
    }
    public static void PostInt(FMLPostInitializationEvent Event)
    {

    }

    public static void RegisterRenders(FMLInitializationEvent Event)
    {
        if(Event.getSide().isClient())
        {
            RenderBlocks.RenderBlocks();
            RenderItems.RenderItems();
        }
    }
}