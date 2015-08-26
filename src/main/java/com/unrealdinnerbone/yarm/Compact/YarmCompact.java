package com.unrealdinnerbone.yarm.Compact;

import com.unrealdinnerbone.yarm.Compact.Util.CompactReference;
import com.unrealdinnerbone.yarm.Compact.Util.LogHelper;
import com.unrealdinnerbone.yarm.proxy.IProxy;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = CompactReference.MOD_ID, name = CompactReference.MOD_NAME, version = CompactReference.VERSION)
public class YarmCompact {

    @Mod.Instance(CompactReference.MOD_ID)
    public static YarmCompact instance;

    @SidedProxy(clientSide = CompactReference.CLIENT_SIDE, serverSide = CompactReference.SERVER_SIDE, modId = CompactReference.MOD_ID)
    public static IProxy proxy;

    @Mod.EventHandler
    public static void PreInit(FMLPreInitializationEvent PreEvent)
    {

    }

    @Mod.EventHandler
    public static void Init(FMLInitializationEvent event)
    {

    }
    @Mod.EventHandler
    public static void PostInit(FMLPostInitializationEvent PostEvent)
    {
        LogHelper.info("Looking For EE3");
        try{
            Class ModEE3 = Class.forName("com.pahimar.ee3.EquivalentExchange3");
            LogHelper.info("Yea EE3 Found");

        } catch (ClassNotFoundException e)
        {
            LogHelper.info(":( No EE3");
    }
        LogHelper.info("Looking For Qlib");
        try{
            Class ModEE3 = Class.forName("uk.co.qmunity.lib.QmunityLib");
            LogHelper.info("Yea Time To Hack into Qlib");
        } catch (ClassNotFoundException e)
        {
            LogHelper.info("Fine No Qlib Fun");
        }

    }


}
