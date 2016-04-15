package com.unrealdinnerbone.yarm.Util;

import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.client.event.ConfigChangedEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

import java.io.File;

public class ConfigManger
{
    public static Configuration configuration;
    public static int StoneTorchLightLevel = 50;
    public static boolean IronAppleGivesPositiveEffects = true;
    public static boolean IronAppleGivesNegativesEffects = true;


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
        IronAppleGivesPositiveEffects = configuration.getBoolean("Iron Apple Positive Effects", Configuration.CATEGORY_GENERAL, true, "Does the iron apple give that player positive effects when it is eaten");
        IronAppleGivesNegativesEffects = configuration.getBoolean("Iron Apple Gives Negative Effects", Configuration.CATEGORY_GENERAL, true, "Does the iron apple give that player negative effects when it is eaten");

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