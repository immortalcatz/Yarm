package com.unrealdinnerbone.yarm;

import com.unrealdinnerbone.yarm.config.ConfigManger;
import com.unrealdinnerbone.yarm.init.*;
import com.unrealdinnerbone.yarm.proxy.*;
import com.unrealdinnerbone.yarm.Util.Reference;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.*;

@Mod
(
        modid = Reference.MOD_ID,
        name = Reference.MOD_NAME,
        version = Reference.VERSION,
        acceptedMinecraftVersions = Reference.MC_VERSION,
        guiFactory = Reference.GUI_FACTORY_CLASS,
        updateJSON = Reference.MOD_UPDATE_JSON_URL
)
public class yarm {

    @Mod.Instance(Reference.MOD_ID)
    public static yarm instance;

    @SidedProxy(clientSide = Reference.CLIENT_SIDE, serverSide = Reference.SERVER_SIDE, modId = Reference.MOD_ID)
    public static IProxy proxy;

    @Mod.EventHandler
    public static void PreInit(FMLPreInitializationEvent PreEvent)
    {
       ClientProxy.PreInt(PreEvent);
       CommonProxy.PreInt(PreEvent);
       ServerProxy.PreInt(PreEvent);
       ConfigManger.ConfigManger(PreEvent.getSuggestedConfigurationFile());
       FMLCommonHandler.instance().bus().register(new ConfigManger());
    }
    @Mod.EventHandler
    public static void Init(FMLInitializationEvent Event)
    {
        ClientProxy.Int(Event);
        CommonProxy.Int(Event);
        ServerProxy.Int(Event);
    }
    @Mod.EventHandler
    public static void PostInit(FMLPostInitializationEvent PostEvent)
    {
        ClientProxy.PostInt(PostEvent);
        CommonProxy.PostInt(PostEvent);
        ServerProxy.PostInt(PostEvent);
    }
    @Mod.EventHandler
    public void onServerStart(FMLServerStartingEvent event) {

        ModCommands.init(event);
    }
}

