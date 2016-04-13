package com.unrealdinnerbone.yarm.Util;

import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.client.event.ConfigChangedEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

import java.io.File;

public class ConfigManger
{
    public static Configuration configuration;
    public static int StoneTorchLightLevel = 50;
    public static boolean IronBarsUnCrafting = true;
    public static boolean Is_iChun = false;

    public static void ConfigManger(File configFile)
    {
        if (configuration == null)
        {
            configuration = new Configuration(configFile);
            loadConfiguration();
        }
    }

    private static void loadConfiguration()
    {
        StoneTorchLightLevel = configuration.getInt("StoneTorch light level", Configuration.CATEGORY_GENERAL, 50, 1, 100, "Config and how bright the stone torch is.");
        IronBarsUnCrafting = configuration.getBoolean("UnCraftable IronBars", Configuration.CATEGORY_GENERAL, true, "Turn on and of iron bar uncrafting");
        Is_iChun = configuration.getBoolean("", Configuration.CATEGORY_CLIENT, false, "");

        if (configuration.hasChanged())
        {
            configuration.save();
        }
    }

    @SubscribeEvent
    public void onConfigurationChangedEvent(ConfigChangedEvent.OnConfigChangedEvent event)
    {
        if (event.getModID().equalsIgnoreCase(Reference.MOD_ID))
        {

            loadConfiguration();;
        }
    }


}