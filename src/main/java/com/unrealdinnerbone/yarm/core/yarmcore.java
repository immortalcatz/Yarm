package com.unrealdinnerbone.yarm.core;

import com.unrealdinnerbone.yarm.core.Util.CoreReference;
import net.minecraftforge.fml.common.Mod;

@Mod(modid = CoreReference.MOD_ID, version = CoreReference.Version)
public class yarmcore
{
    @Mod.Instance(CoreReference.MOD_ID)
    public static yarm instance;

    @SidedProxy(clientSide = Reference.CLIENT_SIDE, serverSide = Reference.SERVER_SIDE, modId = Reference.MOD_ID)
    public static IProxy proxy;

    @Mod.EventHandler
    public static void PreInit(FMLPreInitializationEvent PreEvent)
    {
        Sounds.initSounds();
        HolidayUtils.checkDates();
        StatsGetter.ReadPepsData();
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
}
