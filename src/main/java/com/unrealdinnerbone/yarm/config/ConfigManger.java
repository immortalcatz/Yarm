package com.unrealdinnerbone.yarm.config;

import com.unrealdinnerbone.yarm.Util.CharHelper;
import com.unrealdinnerbone.yarm.Util.Reference;
import com.unrealdinnerbone.yarm.client.gui.ModGuiConfig;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.client.event.ConfigChangedEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

import java.io.File;

public class ConfigManger
{
    public static Configuration configuration;

    public static Configuration ConfigManger(File configFile) {
        if (configuration == null) {
            configuration = new Configuration(configFile);
            loadConfiguration();
        }
        return configuration;
    }

    private static void loadConfiguration()
    {
        configuration.setCategoryLanguageKey(ModGuiConfig.General, "config.general");
        OtherConfig.IronAppleGivesPositiveEffects = configuration.getBoolean("Iron Apple Positive Effects", ModGuiConfig.General, true, "Does the iron apple give that player positive effects when it is eaten");
        OtherConfig.IronAppleGivesNegativesEffects = configuration.getBoolean("Iron Apple Gives Negative Effects", ModGuiConfig.General, true, "Does the iron apple give that player negative effects when it is eaten");
        OtherConfig.CraftableNotchApples = configuration.getBoolean("Craftable Notch Apples", ModGuiConfig.General, true, "Can you craft notch apples?");
        OtherConfig.DoLoging = configuration.getBoolean("Do Logging", ModGuiConfig.General, true, CharHelper.RED + "WARRING WILL TURN OF ALL YARM LOGS");
        OtherConfig.VillgersDropEmeralds = configuration.getBoolean("Villger drop emeralds", ModGuiConfig.General, true, CharHelper.GREEN + "Do villgers drop emerlads when they die");

        //OreGen
        configuration.setCategoryLanguageKey(ModGuiConfig.WorldGen, "config.worldgen");
        WorldGenConfig.GenerateOres = configuration.getBoolean("Generate Ores", ModGuiConfig.WorldGen, true, "Does the world generate any Yarm ore at all?");
        WorldGenConfig.GenerateAntimony = configuration.getBoolean("Generate Antimony", ModGuiConfig.WorldGen, true, "Does the world Generate Antimony ore?");
        WorldGenConfig.GenerateBismuth = configuration.getBoolean("Generate Bismuth", ModGuiConfig.WorldGen, true, "Does the world Generate Bismuth ore?");
        WorldGenConfig.GenerateChromium = configuration.getBoolean("Generate Chromium", ModGuiConfig.WorldGen, true, "Does the world Generate Chromium ore?");
        WorldGenConfig.GenerateCobalt = configuration.getBoolean("Generate Cobalt", ModGuiConfig.WorldGen, true, "Does the world Generate Cobalt ore?");
        WorldGenConfig.GenerateCopper = configuration.getBoolean("Generate Copper", ModGuiConfig.WorldGen, true, "Does the world Generate Copper ore?");
        WorldGenConfig.GenerateGallium = configuration.getBoolean("Generate Gallium", ModGuiConfig.WorldGen, true, "Does the world Generate Gallium ore?");
        WorldGenConfig.GenerateIndium = configuration.getBoolean("Generate Indium", ModGuiConfig.WorldGen, true, "Does the world Generate Indium ore?");
        WorldGenConfig.GenerateLead = configuration.getBoolean("Generate Lead", ModGuiConfig.WorldGen, true, "Does the world Generate Lead ore?");
        WorldGenConfig.GenerateMagnesium = configuration.getBoolean("Generate Magnessium", ModGuiConfig.WorldGen, true, "Does the world Generate Magnessium ore?");
        WorldGenConfig.GenerateNickel = configuration.getBoolean("Generate Nickel", ModGuiConfig.WorldGen, true, "Does the world Generate Nickel ore?");
        WorldGenConfig.GenerateSilver = configuration.getBoolean("Generate Silver", ModGuiConfig.WorldGen, true, "Does the world Generate Silver ore?");
        WorldGenConfig.GenerateTin = configuration.getBoolean("Generate Tin", ModGuiConfig.WorldGen, true, "Does the world Generate Tin ore?");
        WorldGenConfig.GenerateTitanium = configuration.getBoolean("Generate Tinanium" , ModGuiConfig.WorldGen, true, "Does the world Generate Tinanium ore?");
        WorldGenConfig.GenerateZinc = configuration.getBoolean("Generate Zinc", ModGuiConfig.WorldGen, true, "Does the world Generate Zinc ore?");
        WorldGenConfig.GenerateZirconium = configuration.getBoolean("Generate Zirconium", ModGuiConfig.WorldGen, true, "Does the world Generate Zirconium ore?");




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