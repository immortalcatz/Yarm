package com.unrealdinnerbone.yarm;

import com.google.common.base.Stopwatch;
import com.unrealdinnerbone.yarm.Util.LogHelper;
import com.unrealdinnerbone.yarm.client.Sounds.Sounds;
import com.unrealdinnerbone.yarm.Util.HolidayUtils;
import com.unrealdinnerbone.yarm.Util.StatsGetter;
import com.unrealdinnerbone.yarm.common.config.ConfigManger;
import com.unrealdinnerbone.yarm.common.init.*;
import com.unrealdinnerbone.yarm.proxy.*;
import com.unrealdinnerbone.yarm.Util.Reference;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.*;
import java.io.File;

import java.util.concurrent.TimeUnit;

@Mod
(
        modid = Reference.MOD_ID,
        name = Reference.MOD_NAME,
        version = Reference.VERSION,
        acceptedMinecraftVersions = Reference.MC_VERSION,
        guiFactory = Reference.GUI_FACTORY_CLASS,
        updateJSON = Reference.MOD_UPDATE_JSON_URL,
        dependencies = "required-after:Forge@[12.17.0.1922,)"
)
public class yarm {

    private static final Stopwatch MasterCounter =  Stopwatch.createStarted();


    @Mod.Instance(Reference.MOD_ID)
    public static yarm instance;

    @SidedProxy(clientSide = Reference.CLIENT_SIDE, serverSide = Reference.SERVER_SIDE, modId = Reference.MOD_ID)
    public static IProxy proxy;

    @Mod.EventHandler
    public static void PreInit(FMLPreInitializationEvent PreEvent)
    {
       final Stopwatch PreIntCounter =  Stopwatch.createStarted();
       LogHelper.info("Staring PreInt");
       Sounds.initSounds();
       HolidayUtils.checkDates();
       StatsGetter.ReadPepsData();
       CommonProxy.PreInt(PreEvent);
       ClientProxy.PreInt(PreEvent);
       ServerProxy.PreInt(PreEvent);

       final File folder = new File(PreEvent.getModConfigurationDirectory(), "yamm");

        if (!folder.exists())
            folder.mkdir();

       ConfigManger.generalConfig(new File(folder, "yarm_general.cfg"));
       ConfigManger.oreConfig(new File(folder, "yarm_worldgen.cfg"));
       ConfigManger.clientConfig(new File(folder, "yarm_client.cfg"));
       FMLCommonHandler.instance().bus().register(new ConfigManger());
       LogHelper.info("Finished PreInt after ( " + PreIntCounter.elapsed(TimeUnit.MILLISECONDS) + " ms)");
       PreIntCounter.stop();
    }
    @Mod.EventHandler
    public static void Init(FMLInitializationEvent Event)
    {
        LogHelper.info("Staring Int");
        final Stopwatch IntCounter =  Stopwatch.createStarted();
        ClientProxy.Int(Event);
        CommonProxy.Int(Event);
        ServerProxy.Int(Event);
        LogHelper.info("Finished Int after (" + IntCounter.elapsed(TimeUnit.MILLISECONDS) + " ms)");
        IntCounter.stop();
    }
    @Mod.EventHandler
    public static void PostInit(FMLPostInitializationEvent PostEvent)
    {
        final Stopwatch PostIntCounter =  Stopwatch.createStarted();
        ClientProxy.PostInt(PostEvent);
        CommonProxy.PostInt(PostEvent);
        ServerProxy.PostInt(PostEvent);
        LogHelper.info("Finished PreInt after (" + PostIntCounter.elapsed(TimeUnit.MILLISECONDS) + " ms)");
        PostIntCounter.stop();
        LogHelper.info("Finished PreInt after (" + MasterCounter.elapsed(TimeUnit.MILLISECONDS) + " ms)");
        MasterCounter.stop();
    }
    @Mod.EventHandler
    public void onServerStart(FMLServerStartingEvent event) {

        ModCommands.init(event);
    }
}

