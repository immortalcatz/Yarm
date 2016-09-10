package com.unrealdinnerbone.yarm.common.config;

import com.unrealdinnerbone.yarm.Util.Reference;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.client.event.ConfigChangedEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

import java.io.File;

public class ConfigManger
{

    public static int TelsaMax = 999999999;
    public static int TelsaMin = 1;

    public static String worldGen = "worldgen";
    public static String general = "general";
    public static String panels =  "panels";
    public static String client =  "client";
    
    public static Configuration generalConfig;
    public static Configuration oreConfig;
    public static Configuration clientConfig;

    public static Configuration generalConfig(File configFile) {
        if (generalConfig == null) {
            generalConfig = new Configuration(configFile);
            GeneralConfig.loadGeneralConfig();
        }
        return generalConfig;
    }

    public static Configuration oreConfig(File configFile) {
        if (oreConfig == null) {
            oreConfig = new Configuration(configFile);
            WorldGenConfig.loadWorldGenConfig();
        }
        return oreConfig;
    }

    public static Configuration clientConfig(File configFile)
    {
        if(clientConfig == null)
        {
            clientConfig = new Configuration(configFile);
            ClientConfig.loadClientConfig();
        }
        return clientConfig;
    }

    @SubscribeEvent
    public void onConfigurationChangedEvent(ConfigChangedEvent.OnConfigChangedEvent event)
    {
        if (event.getModID().equalsIgnoreCase(Reference.MOD_ID))
        {
            GeneralConfig.loadGeneralConfig();
            WorldGenConfig.loadWorldGenConfig();
            ClientConfig.loadClientConfig();
        }
    }


}