package com.unrealdinnerbone.yarm.proxy;

import com.unrealdinnerbone.yarm.common.Events.Client.EnityJoinEvent;
import com.unrealdinnerbone.yarm.common.init.ModBlocks;
import com.unrealdinnerbone.yarm.common.init.ModItems;
import com.unrealdinnerbone.yarm.yarm;
import net.minecraftforge.fml.common.event.*;
import net.minecraftforge.fml.common.network.NetworkRegistry;

public class ClientProxy extends CommonProxy
{

    public static void PreInt(FMLPreInitializationEvent Event)
    {
        if(Event.getSide().isClient())
        {
            ModItems.initItemModels();
            ModBlocks.initBlockModels();
        }
    }
    public static void Int(FMLInitializationEvent Event)
    {
        if(Event.getSide().isClient())
        {
            EnityJoinEvent.init();
//            ConfigManger.ConfigManger(PreEvent.getSuggestedConfigurationFile());
//            FMLCommonHandler.instance().bus().register(new ConfigManger());
        }
    }
    public static void PostInt(FMLPostInitializationEvent Event)
    {

    }
}