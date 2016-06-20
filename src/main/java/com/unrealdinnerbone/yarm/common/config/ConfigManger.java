package com.unrealdinnerbone.yarm.common.config;

import com.unrealdinnerbone.yarm.Util.Reference;
import com.unrealdinnerbone.yarm.client.gui.ModGuiConfig;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.client.event.ConfigChangedEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

import java.io.File;

public class ConfigManger
{

    private static int TelsaMax = 999999999;
    private static int TelsaMin = 1;

    public static String WorldGen = "worldgen";
    public static String General = "general";
    public static String Panels =  "panels";
    
    public static Configuration configuration;

    public static Configuration ConfigManger(File configFile) {
        if (configuration == null) {
            configuration = new Configuration(configFile);
            loadConfiguration();
        }
        return configuration;
    }

    public static void loadConfiguration()
    {
        configuration.setCategoryLanguageKey(Panels, "config.panels");
        ConfigPanels.NightPanelTeir1_Cap = configuration.getInt("NightPanelTeir1_Cap", Panels, 10000,TelsaMin, TelsaMax, "");
        ConfigPanels.NightPanelTeir1_GenRate = configuration.getInt("NightPanelTeir1_GenRate", Panels, 1,TelsaMin, TelsaMax, "");
        ConfigPanels.NightPanelTeir1_TranforRate = configuration.getInt("NightPanelTeir1_TranforRate", Panels, 10,TelsaMin, TelsaMax, "");



        configuration.setCategoryLanguageKey(General, "config.general");
        OtherConfig.IronAppleGivesPositiveEffects = configuration.getBoolean("Iron Apple Positive Effects", General, true, "Does the iron apple give that player positive effects when it is eaten");
        OtherConfig.IronAppleGivesNegativesEffects = configuration.getBoolean("Iron Apple Gives Negative Effects", General, true, "Does the iron apple give that player negative effects when it is eaten");
        OtherConfig.CraftableNotchApples = configuration.getBoolean("Craftable Notch Apples", General, true, "Can you craft notch apples?");
        OtherConfig.DoLoging = configuration.getBoolean("Do Logging", General, true, "WARRING WILL TURN OF ALL YARM LOGS");
        OtherConfig.VillgersDropEmeralds = configuration.getBoolean("Villager drop emeralds", General, true, "Do villgers drop emerlads when they die");

        //OreGen
        configuration.setCategoryLanguageKey(WorldGen, "config.worldgen");
        configuration.setCategoryRequiresMcRestart(WorldGen, true);
        WorldGenConfig.GenerateOres = configuration.getBoolean("Generate Ores", WorldGen, true, "Does the world generate any Yarm ore at all?");
        
        WorldGenConfig.GenerateAntimony = configuration.getBoolean("Antimony Generate", WorldGen, true, "Does the world Generate Antimony ore?");
        WorldGenConfig.AntimonyMaxSpawnHeight = configuration.getInt("Antimony Ore Max Spawn Hight", WorldGen, 255, 1, 256, "");
        WorldGenConfig.AntimonyMinSpawnHeight = configuration.getInt("Antimony Ore Min Spawn Hight", WorldGen, 1, 1, 256, "");
        WorldGenConfig.AntimonyMaxSize = configuration.getInt("Antimony Ore Cluster Size", WorldGen, 10, 1, 256, "");
        WorldGenConfig.AntimonyRarity = configuration.getInt("Antimony Ore Rarity", WorldGen, 16, 1, 256, "");
        
        WorldGenConfig.GenerateBismuth = configuration.getBoolean("Bismuth Generate", WorldGen, true, "Does the world Generate Bismuth ore?");
        WorldGenConfig.BismuthMaxSpawnHeight = configuration.getInt("Bismuth Ore Max Spawn Hight", WorldGen, 255, 1, 256, "");
        WorldGenConfig.BismuthMinSpawnHeight = configuration.getInt("Bismuth Ore Min Spawn Hight", WorldGen, 1, 1, 256, "");
        WorldGenConfig.BismuthMaxSize = configuration.getInt("Bismuth Ore Cluster Size", WorldGen, 5, 1, 256, "");
        WorldGenConfig.BismuthRarity = configuration.getInt("Bismuth Ore Rarity", WorldGen, 16, 1, 256, "");
        
        WorldGenConfig.GenerateChromium = configuration.getBoolean("Chromium Generate", WorldGen, true, "Does the world Generate Chromium ore?");
        WorldGenConfig.ChromiumMaxSpawnHeight = configuration.getInt("Chromium Ore Max Spawn Hight", WorldGen, 255, 1, 256, "");
        WorldGenConfig.ChromiumMinSpawnHeight = configuration.getInt("Chromium Ore Min Spawn Hight", WorldGen, 1, 1, 256, "");
        WorldGenConfig.ChromiumMaxSize = configuration.getInt("Chromium Ore Cluster Size", WorldGen, 10, 1, 256, "");
        WorldGenConfig.ChromiumRarity = configuration.getInt("Chromium Ore Rarity", WorldGen, 16, 1, 256, "");
        
        WorldGenConfig.GenerateCobalt = configuration.getBoolean("Cobalt Generate", WorldGen, true, "Does the world Generate Cobalt ore?");
        WorldGenConfig.CobaltMaxSpawnHeight = configuration.getInt("Cobalt Ore Max Spawn Hight", WorldGen, 255, 1, 256, "");
        WorldGenConfig.CobaltMinSpawnHeight = configuration.getInt("Cobalt Ore Min Spawn Hight", WorldGen, 1, 1, 256, "");
        WorldGenConfig.CobaltMaxSize = configuration.getInt("Cobalt Ore Cluster Size", WorldGen, 10, 1, 256, "");
        WorldGenConfig.CobaltRarity = configuration.getInt("Cobalt Ore Rarity", WorldGen, 16, 1, 256, "");
        
        WorldGenConfig.GenerateCopper = configuration.getBoolean("Copper Generate", WorldGen, true, "Does the world Generate Copper ore?");
        WorldGenConfig.CopperMaxSpawnHeight = configuration.getInt("Copper Ore Max Spawn Hight", WorldGen, 255, 1, 256, "");
        WorldGenConfig.CopperMinSpawnHeight = configuration.getInt("Copper Ore Min Spawn Hight", WorldGen, 1, 1, 256, "");
        WorldGenConfig.CopperMaxSize = configuration.getInt("Copper Ore Cluster Size", WorldGen, 10, 1, 256, "");
        WorldGenConfig.CopperRarity = configuration.getInt("Copper Ore Rarity", WorldGen, 16, 1, 256, "");
        
        WorldGenConfig.GenerateGallium = configuration.getBoolean("Gallium Generate", WorldGen, true, "Does the world Generate Gallium ore?");
        WorldGenConfig.GalliumMaxSpawnHeight = configuration.getInt("Gallium Ore Max Spawn Hight", WorldGen, 255, 1, 256, "");
        WorldGenConfig.GalliumMinSpawnHeight = configuration.getInt("Gallium Ore Min Spawn Hight", WorldGen, 1, 1, 256, "");
        WorldGenConfig.GalliumMaxSize = configuration.getInt("Gallium Ore Cluster Size", WorldGen, 10, 1, 256, "");
        WorldGenConfig.GalliumRarity = configuration.getInt("Gallium Ore Rarity", WorldGen, 16, 1, 256, "");
        
        WorldGenConfig.GenerateIndium = configuration.getBoolean("Indium Generate", WorldGen, true, "Does the world Generate Indium ore?");
        WorldGenConfig.IndiumMaxSpawnHeight = configuration.getInt("Indium Ore Max Spawn Hight", WorldGen, 255, 1, 256, "");
        WorldGenConfig.IndiumMinSpawnHeight = configuration.getInt("Indium Ore Min Spawn Hight", WorldGen, 1, 1, 256, "");
        WorldGenConfig.IndiumMaxSize = configuration.getInt("Indium Ore Cluster Size", WorldGen, 10, 1, 256, "");
        WorldGenConfig.IndiumRarity = configuration.getInt("Indium Ore Rarity", WorldGen, 16, 1, 256, "");
        
        WorldGenConfig.GenerateLead = configuration.getBoolean("Lead Generate", WorldGen, true, "Does the world Generate Lead ore?");
        WorldGenConfig.LeadMaxSpawnHeight = configuration.getInt("Lead Ore Max Spawn Hight", WorldGen, 255, 1, 256, "");
        WorldGenConfig.LeadMinSpawnHeight = configuration.getInt("Lead Ore Min Spawn Hight", WorldGen, 1, 1, 256, "");
        WorldGenConfig.LeadMaxSize = configuration.getInt("Lead Ore Cluster Size", WorldGen, 10, 1, 256, "");
        WorldGenConfig.LeadRarity = configuration.getInt("Lead Ore Rarity", WorldGen, 16, 1, 256, "");
        
        WorldGenConfig.GenerateMagnesium = configuration.getBoolean("Magnesium Generate", WorldGen, true, "Does the world Generate Magnessium ore?");
        WorldGenConfig.MagnesiumMaxSpawnHeight = configuration.getInt("Magnesium Ore Max Spawn Hight", WorldGen, 255, 1, 256, "");
        WorldGenConfig.MagnesiumMinSpawnHeight = configuration.getInt("Magnesium Ore Min Spawn Hight", WorldGen, 1, 1, 256, "");
        WorldGenConfig.MagnesiumMaxSize = configuration.getInt("Magnesium Ore Cluster Size", WorldGen, 10, 1, 256, "");
        WorldGenConfig.MagnesiumRarity = configuration.getInt("Magnesium Ore Rarity", WorldGen, 16, 1, 256, "");
        
        WorldGenConfig.GenerateNickel = configuration.getBoolean("Nickel Generate", WorldGen, true, "Does the world Generate Nickel ore?");
        WorldGenConfig.NickelMaxSpawnHeight = configuration.getInt("Nickel Ore Max Spawn Hight", WorldGen, 255, 1, 256, "");
        WorldGenConfig.NickelMinSpawnHeight = configuration.getInt("Nickel Ore Min Spawn Hight", WorldGen, 1, 1, 256, "");
        WorldGenConfig.NickelMaxSize = configuration.getInt("Nickel Ore Cluster Size", WorldGen, 10, 1, 256, "");
        WorldGenConfig.NickelRarity = configuration.getInt("Nickel Ore Rarity", WorldGen, 16, 1, 256, "");
        
        WorldGenConfig.GenerateSilver = configuration.getBoolean("Silver Generate", WorldGen, true, "Does the world Generate Silver ore?");
        WorldGenConfig.SilverMaxSpawnHeight = configuration.getInt("Silver Ore Max Spawn Hight", WorldGen, 255, 1, 256, "");
        WorldGenConfig.SilverMinSpawnHeight = configuration.getInt("Silver Ore Min Spawn Hight", WorldGen, 1, 1, 256, "");
        WorldGenConfig.SilverMaxSize = configuration.getInt("Silver Ore Cluster Size", WorldGen, 10, 1, 256, "");
        WorldGenConfig.SilverRarity = configuration.getInt("Silver Ore Rarity", WorldGen, 16, 1, 256, "");
        
        WorldGenConfig.GenerateTin = configuration.getBoolean("Tin Generate", WorldGen, true, "Does the world Generate Tin ore?");
        WorldGenConfig.TinMaxSpawnHeight = configuration.getInt("Tin Ore Max Spawn Hight", WorldGen, 255, 1, 256, "");
        WorldGenConfig.TinMinSpawnHeight = configuration.getInt("Tin Ore Min Spawn Hight", WorldGen, 1, 1, 256, "");
        WorldGenConfig.TinMaxSize = configuration.getInt("Tin Ore Cluster Size", WorldGen, 10, 1, 256, "");
        WorldGenConfig.TinRarity = configuration.getInt("Tin Ore Rarity", WorldGen, 16, 1, 256, "");
        
        WorldGenConfig.GenerateTitanium = configuration.getBoolean("Tinanium Generate" , WorldGen, true, "Does the world Generate Tinanium ore?");
        WorldGenConfig.TitaniumMaxSpawnHeight = configuration.getInt("Tinanium Ore Max Spawn Hight", WorldGen, 255, 1, 256, "");
        WorldGenConfig.TitaniumMinSpawnHeight = configuration.getInt("Titanium Ore Min Spawn Hight", WorldGen, 1, 1, 256, "");
        WorldGenConfig.TitaniumMaxSize = configuration.getInt("Titanium Ore Cluster Size", WorldGen, 10, 1, 256, "");
        WorldGenConfig.TitaniumRarity = configuration.getInt("Titanium Ore Rarity", WorldGen, 16, 1, 256, "");
        
        WorldGenConfig.GenerateZinc = configuration.getBoolean("Zinc Generate", WorldGen, true, "Does the world Generate Zinc ore?");
        WorldGenConfig.ZincMaxSpawnHeight = configuration.getInt("Zinc Ore Max Spawn Hight", WorldGen, 255, 1, 256, "");
        WorldGenConfig.ZincMinSpawnHeight = configuration.getInt("Zinc Ore Min Spawn Hight", WorldGen, 1, 1, 256, "");
        WorldGenConfig.ZincMaxSize = configuration.getInt("Zinc Ore Cluster Size", WorldGen, 10, 1, 256, "");
        WorldGenConfig.ZincRarity = configuration.getInt("Zinc Ore Rarity", WorldGen, 16, 1, 256, "");
            
        WorldGenConfig.GenerateZirconium = configuration.getBoolean("Zirconium Generate", WorldGen, true, "Does the world Generate Zirconium ore?");
        WorldGenConfig.ZirconiumMaxSpawnHeight = configuration.getInt("Zirconium Ore Max Spawn Hight", WorldGen, 255, 1, 256, "");
        WorldGenConfig.ZirconiumMinSpawnHeight = configuration.getInt("Zirconium Ore Min Spawn Hight", WorldGen, 1, 1, 256, "");
        WorldGenConfig.ZirconiumMaxSize = configuration.getInt("Zirconium Ore Cluster Size", WorldGen, 10, 1, 256, "");
        WorldGenConfig.ZirconiumRarity = configuration.getInt("Zirconium Ore Rarity", WorldGen, 16, 1, 256, "");

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
            loadConfiguration();
        }
    }


}