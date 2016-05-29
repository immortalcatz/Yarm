package com.unrealdinnerbone.yarm.core.CoreProxy;

import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class CoreClientProxy extends CommonProxy
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

        }
    }
    public static void PostInt(FMLPostInitializationEvent Event)
    {

    }

    public static void RegisterRenders(FMLInitializationEvent Event)
    {
        if(Event.getSide().isClient())
        {

        }
    }
}