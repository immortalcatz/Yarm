package com.unrealdinnerbone.yarm.core;

import com.unrealdinnerbone.yarm.core.CoreProxy.CoreIProxy;
import com.unrealdinnerbone.yarm.core.Util.CoreReference;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = CoreReference.MOD_ID, version = CoreReference.Version, name = "Yarm Core")
public class yarmcore
{
    @Mod.Instance(CoreReference.MOD_ID)
    public static yarmcore instance;

    @SidedProxy(clientSide = CoreReference.CLIENT_SIDE, serverSide = CoreReference.SERVER_SIDE, modId = CoreReference.MOD_ID)
    public static CoreIProxy proxy;

    @Mod.EventHandler
    public static void PreInit(FMLPreInitializationEvent PreEvent)
    {

    }
    @Mod.EventHandler
    public static void Init(FMLInitializationEvent Event)
    {

    }
    @Mod.EventHandler
    public static void PostInit(FMLPostInitializationEvent PostEvent)
    {

    }
}
