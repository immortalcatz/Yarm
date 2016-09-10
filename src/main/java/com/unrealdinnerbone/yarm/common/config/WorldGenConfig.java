package com.unrealdinnerbone.yarm.common.config;

import static com.unrealdinnerbone.yarm.common.config.ConfigManger.*;

public class WorldGenConfig
{
    public static boolean GenerateOres;

    public static String Antimony = "antimony";
    public static boolean GenerateAntimony;
    public static int AntimonyMaxSize;
    public static int AntimonyMaxSpawnHeight;
    public static int AntimonyMinSpawnHeight;
    public static int AntimonyRarity;

    public static String Bismuth = "bismuth";
    public static boolean GenerateBismuth;
    public static int BismuthMaxSize;
    public static int BismuthMaxSpawnHeight;
    public static int BismuthMinSpawnHeight;
    public static int BismuthRarity;

    public static String Chromium = "chromium";
    public static boolean GenerateChromium;
    public static int ChromiumMaxSize;
    public static int ChromiumMaxSpawnHeight;
    public static int ChromiumMinSpawnHeight;
    public static int ChromiumRarity;

    public static String Cobalt = "cobalt";
    public static boolean GenerateCobalt;
    public static int CobaltMaxSize;
    public static int CobaltMaxSpawnHeight;
    public static int CobaltMinSpawnHeight;
    public static int CobaltRarity;

    public static String Copper = "copper";
    public static boolean GenerateCopper;
    public static int CopperMaxSize;
    public static int CopperMaxSpawnHeight;
    public static int CopperMinSpawnHeight;
    public static int CopperRarity;

    public static String Gallium = "gallium";
    public static boolean GenerateGallium;
    public static int GalliumMaxSize;
    public static int GalliumMaxSpawnHeight;
    public static int GalliumMinSpawnHeight;
    public static int GalliumRarity;

    public static String Indium = "indium";
    public static boolean GenerateIndium;
    public static int IndiumMaxSize;
    public static int IndiumMaxSpawnHeight;
    public static int IndiumMinSpawnHeight;
    public static int IndiumRarity;

    public static String Lead = "lead";
    public static boolean GenerateLead;
    public static int LeadMaxSize;
    public static int LeadMaxSpawnHeight;
    public static int LeadMinSpawnHeight;
    public static int LeadRarity;

    public static String Magnesium = "magnesium";
    public static boolean GenerateMagnesium;
    public static int MagnesiumMaxSize;
    public static int MagnesiumMaxSpawnHeight;
    public static int MagnesiumMinSpawnHeight;
    public static int MagnesiumRarity;

    public static String Nickel = "nickel";
    public static boolean GenerateNickel;
    public static int NickelMaxSize;
    public static int NickelMaxSpawnHeight;
    public static int NickelMinSpawnHeight;
    public static int NickelRarity;

    public static String Silver = "silver";
    public static boolean GenerateSilver;
    public static int SilverMaxSize;
    public static int SilverMaxSpawnHeight;
    public static int SilverMinSpawnHeight;
    public static int SilverRarity;

    public static String Tin = "tin";
    public static boolean GenerateTin;
    public static int TinMaxSize;
    public static int TinMaxSpawnHeight;
    public static int TinMinSpawnHeight;
    public static int TinRarity;

    public static String Titanium = "titanium";
    public static boolean GenerateTitanium;
    public static int TitaniumMaxSize;
    public static int TitaniumMaxSpawnHeight;
    public static int TitaniumMinSpawnHeight;
    public static int TitaniumRarity;

    public static String Zinc = "zinc";
    public static boolean GenerateZinc;
    public static int ZincMaxSize;
    public static int ZincMaxSpawnHeight;
    public static int ZincMinSpawnHeight;
    public static int ZincRarity;

    public static String Zirconium = "zirconium";
    public static boolean GenerateZirconium;
    public static int ZirconiumMaxSize;
    public static int ZirconiumMaxSpawnHeight;
    public static int ZirconiumMinSpawnHeight;
    public static int ZirconiumRarity;


    public static void loadWorldGenConfig()
    {
        WorldGenConfig.GenerateOres = oreConfig.getBoolean("Generate Ores", ConfigManger.worldGen, true, "Does the world generate any Yarm ore at all?");

        oreConfig.setCategoryLanguageKey(Antimony, "config." + Antimony);
        oreConfig.setCategoryRequiresMcRestart(Antimony, true);
        WorldGenConfig.GenerateAntimony = oreConfig.getBoolean("Antimony Generate", Antimony, true, "Does the world Generate Antimony ore?");
        WorldGenConfig.AntimonyMaxSpawnHeight = oreConfig.getInt("Antimony Ore Max Spawn Hight", Antimony, 255, 1, 256, "");
        WorldGenConfig.AntimonyMinSpawnHeight = oreConfig.getInt("Antimony Ore Min Spawn Hight", Antimony, 1, 1, 256, "");
        WorldGenConfig.AntimonyMaxSize = oreConfig.getInt("Antimony Ore Cluster Size", Antimony, 10, 1, 256, "");
        WorldGenConfig.AntimonyRarity = oreConfig.getInt("Antimony Ore Rarity", Antimony, 16, 1, 256, "");

        oreConfig.setCategoryLanguageKey(Bismuth, "config." + Bismuth);
        oreConfig.setCategoryRequiresMcRestart(Bismuth, true);
        WorldGenConfig.GenerateBismuth = oreConfig.getBoolean("Bismuth Generate", Bismuth, true, "Does the world Generate Bismuth ore?");
        WorldGenConfig.BismuthMaxSpawnHeight = oreConfig.getInt("Bismuth Ore Max Spawn Hight", Bismuth, 255, 1, 256, "");
        WorldGenConfig.BismuthMinSpawnHeight = oreConfig.getInt("Bismuth Ore Min Spawn Hight", Bismuth, 1, 1, 256, "");
        WorldGenConfig.BismuthMaxSize = oreConfig.getInt("Bismuth Ore Cluster Size", Bismuth, 5, 1, 256, "");
        WorldGenConfig.BismuthRarity = oreConfig.getInt("Bismuth Ore Rarity", Bismuth, 16, 1, 256, "");

        oreConfig.setCategoryLanguageKey(Chromium, "config." + Chromium);
        oreConfig.setCategoryRequiresMcRestart(Chromium, true);
        WorldGenConfig.GenerateChromium = oreConfig.getBoolean("Chromium Generate", Chromium, true, "Does the world Generate Chromium ore?");
        WorldGenConfig.ChromiumMaxSpawnHeight = oreConfig.getInt("Chromium Ore Max Spawn Hight", Chromium, 255, 1, 256, "");
        WorldGenConfig.ChromiumMinSpawnHeight = oreConfig.getInt("Chromium Ore Min Spawn Hight", Chromium, 1, 1, 256, "");
        WorldGenConfig.ChromiumMaxSize = oreConfig.getInt("Chromium Ore Cluster Size", Chromium, 10, 1, 256, "");
        WorldGenConfig.ChromiumRarity = oreConfig.getInt("Chromium Ore Rarity", Chromium, 16, 1, 256, "");

        oreConfig.setCategoryLanguageKey(Cobalt, "config." + Cobalt);
        oreConfig.setCategoryRequiresMcRestart(Cobalt, true);
        WorldGenConfig.GenerateCobalt = oreConfig.getBoolean("Cobalt Generate", Cobalt, true, "Does the world Generate Cobalt ore?");
        WorldGenConfig.CobaltMaxSpawnHeight = oreConfig.getInt("Cobalt Ore Max Spawn Hight", Cobalt, 255, 1, 256, "");
        WorldGenConfig.CobaltMinSpawnHeight = oreConfig.getInt("Cobalt Ore Min Spawn Hight", Cobalt, 1, 1, 256, "");
        WorldGenConfig.CobaltMaxSize = oreConfig.getInt("Cobalt Ore Cluster Size", Cobalt, 10, 1, 256, "");
        WorldGenConfig.CobaltRarity = oreConfig.getInt("Cobalt Ore Rarity", Cobalt, 16, 1, 256, "");

        oreConfig.setCategoryLanguageKey(Copper, "config." + Copper);
        oreConfig.setCategoryRequiresMcRestart(Copper, true);
        WorldGenConfig.GenerateCopper = oreConfig.getBoolean("Copper Generate", Copper, true, "Does the world Generate Copper ore?");
        WorldGenConfig.CopperMaxSpawnHeight = oreConfig.getInt("Copper Ore Max Spawn Hight", Copper, 255, 1, 256, "");
        WorldGenConfig.CopperMinSpawnHeight = oreConfig.getInt("Copper Ore Min Spawn Hight", Copper, 1, 1, 256, "");
        WorldGenConfig.CopperMaxSize = oreConfig.getInt("Copper Ore Cluster Size", Copper, 10, 1, 256, "");
        WorldGenConfig.CopperRarity = oreConfig.getInt("Copper Ore Rarity", Copper, 16, 1, 256, "");

        oreConfig.setCategoryLanguageKey(Gallium, "config." + Gallium);
        oreConfig.setCategoryRequiresMcRestart(Gallium, true);
        WorldGenConfig.GenerateGallium = oreConfig.getBoolean("Gallium Generate", Gallium, true, "Does the world Generate Gallium ore?");
        WorldGenConfig.GalliumMaxSpawnHeight = oreConfig.getInt("Gallium Ore Max Spawn Hight", Gallium, 255, 1, 256, "");
        WorldGenConfig.GalliumMinSpawnHeight = oreConfig.getInt("Gallium Ore Min Spawn Hight", Gallium, 1, 1, 256, "");
        WorldGenConfig.GalliumMaxSize = oreConfig.getInt("Gallium Ore Cluster Size", Gallium, 10, 1, 256, "");
        WorldGenConfig.GalliumRarity = oreConfig.getInt("Gallium Ore Rarity", Gallium, 16, 1, 256, "");

        oreConfig.setCategoryLanguageKey(Indium, "config." + Indium);
        oreConfig.setCategoryRequiresMcRestart(Indium, true);
        WorldGenConfig.GenerateIndium = oreConfig.getBoolean("Indium Generate", Indium, true, "Does the world Generate Indium ore?");
        WorldGenConfig.IndiumMaxSpawnHeight = oreConfig.getInt("Indium Ore Max Spawn Hight", Indium, 255, 1, 256, "");
        WorldGenConfig.IndiumMinSpawnHeight = oreConfig.getInt("Indium Ore Min Spawn Hight", Indium, 1, 1, 256, "");
        WorldGenConfig.IndiumMaxSize = oreConfig.getInt("Indium Ore Cluster Size", Indium, 10, 1, 256, "");
        WorldGenConfig.IndiumRarity = oreConfig.getInt("Indium Ore Rarity", Indium, 16, 1, 256, "");

        oreConfig.setCategoryLanguageKey(Lead, "config." + Lead);
        oreConfig.setCategoryRequiresMcRestart(Lead, true);
        WorldGenConfig.GenerateLead = oreConfig.getBoolean("Lead Generate", Lead, true, "Does the world Generate Lead ore?");
        WorldGenConfig.LeadMaxSpawnHeight = oreConfig.getInt("Lead Ore Max Spawn Hight", Lead, 255, 1, 256, "");
        WorldGenConfig.LeadMinSpawnHeight = oreConfig.getInt("Lead Ore Min Spawn Hight", Lead, 1, 1, 256, "");
        WorldGenConfig.LeadMaxSize = oreConfig.getInt("Lead Ore Cluster Size", Lead, 10, 1, 256, "");
        WorldGenConfig.LeadRarity = oreConfig.getInt("Lead Ore Rarity", Lead, 16, 1, 256, "");

        oreConfig.setCategoryLanguageKey(Magnesium, "config." + Magnesium);
        oreConfig.setCategoryRequiresMcRestart(Magnesium, true);
        WorldGenConfig.GenerateMagnesium = oreConfig.getBoolean("Magnesium Generate", Magnesium, true, "Does the world Generate Magnessium ore?");
        WorldGenConfig.MagnesiumMaxSpawnHeight = oreConfig.getInt("Magnesium Ore Max Spawn Hight", Magnesium, 255, 1, 256, "");
        WorldGenConfig.MagnesiumMinSpawnHeight = oreConfig.getInt("Magnesium Ore Min Spawn Hight", Magnesium, 1, 1, 256, "");
        WorldGenConfig.MagnesiumMaxSize = oreConfig.getInt("Magnesium Ore Cluster Size", Magnesium, 10, 1, 256, "");
        WorldGenConfig.MagnesiumRarity = oreConfig.getInt("Magnesium Ore Rarity", Magnesium, 16, 1, 256, "");

        oreConfig.setCategoryLanguageKey(Nickel, "config." + Nickel);
        oreConfig.setCategoryRequiresMcRestart(Nickel, true);
        WorldGenConfig.GenerateNickel = oreConfig.getBoolean("Nickel Generate", Nickel, true, "Does the world Generate Nickel ore?");
        WorldGenConfig.NickelMaxSpawnHeight = oreConfig.getInt("Nickel Ore Max Spawn Hight", Nickel, 255, 1, 256, "");
        WorldGenConfig.NickelMinSpawnHeight = oreConfig.getInt("Nickel Ore Min Spawn Hight", Nickel, 1, 1, 256, "");
        WorldGenConfig.NickelMaxSize = oreConfig.getInt("Nickel Ore Cluster Size", Nickel, 10, 1, 256, "");
        WorldGenConfig.NickelRarity = oreConfig.getInt("Nickel Ore Rarity", Nickel, 16, 1, 256, "");

        oreConfig.setCategoryLanguageKey(Silver, "config." + Silver);
        oreConfig.setCategoryRequiresMcRestart(Silver, true);
        WorldGenConfig.GenerateSilver = oreConfig.getBoolean("Silver Generate", Silver, true, "Does the world Generate Silver ore?");
        WorldGenConfig.SilverMaxSpawnHeight = oreConfig.getInt("Silver Ore Max Spawn Hight", Silver, 255, 1, 256, "");
        WorldGenConfig.SilverMinSpawnHeight = oreConfig.getInt("Silver Ore Min Spawn Hight", Silver, 1, 1, 256, "");
        WorldGenConfig.SilverMaxSize = oreConfig.getInt("Silver Ore Cluster Size", Silver, 10, 1, 256, "");
        WorldGenConfig.SilverRarity = oreConfig.getInt("Silver Ore Rarity", Silver, 16, 1, 256, "");

        oreConfig.setCategoryLanguageKey(Tin, "config." + Tin);
        oreConfig.setCategoryRequiresMcRestart(Tin, true);
        WorldGenConfig.GenerateTin = oreConfig.getBoolean("Tin Generate", Tin, true, "Does the world Generate Tin ore?");
        WorldGenConfig.TinMaxSpawnHeight = oreConfig.getInt("Tin Ore Max Spawn Hight", Tin, 255, 1, 256, "");
        WorldGenConfig.TinMinSpawnHeight = oreConfig.getInt("Tin Ore Min Spawn Hight", Tin, 1, 1, 256, "");
        WorldGenConfig.TinMaxSize = oreConfig.getInt("Tin Ore Cluster Size", Tin, 10, 1, 256, "");
        WorldGenConfig.TinRarity = oreConfig.getInt("Tin Ore Rarity", Tin, 16, 1, 256, "");

        oreConfig.setCategoryLanguageKey(Titanium, "config." + Titanium);
        oreConfig.setCategoryRequiresMcRestart(Titanium, true);
        WorldGenConfig.GenerateTitanium = oreConfig.getBoolean("Titanium Generate" , Titanium, true, "Does the world Generate Titanium ore?");
        WorldGenConfig.TitaniumMaxSpawnHeight = oreConfig.getInt("Titanium Ore Max Spawn Hight", Titanium, 255, 1, 256, "");
        WorldGenConfig.TitaniumMinSpawnHeight = oreConfig.getInt("Titanium Ore Min Spawn Hight", Titanium, 1, 1, 256, "");
        WorldGenConfig.TitaniumMaxSize = oreConfig.getInt("Titanium Ore Cluster Size", Titanium, 10, 1, 256, "");
        WorldGenConfig.TitaniumRarity = oreConfig.getInt("Titanium Ore Rarity", Titanium, 16, 1, 256, "");

        oreConfig.setCategoryLanguageKey(Zinc, "config." + Zinc);
        oreConfig.setCategoryRequiresMcRestart(Zinc, true);
        WorldGenConfig.GenerateZinc = oreConfig.getBoolean("Zinc Generate", Zinc, true, "Does the world Generate Zinc ore?");
        WorldGenConfig.ZincMaxSpawnHeight = oreConfig.getInt("Zinc Ore Max Spawn Hight", Zinc, 255, 1, 256, "");
        WorldGenConfig.ZincMinSpawnHeight = oreConfig.getInt("Zinc Ore Min Spawn Hight", Zinc, 1, 1, 256, "");
        WorldGenConfig.ZincMaxSize = oreConfig.getInt("Zinc Ore Cluster Size", Zinc, 10, 1, 256, "");
        WorldGenConfig.ZincRarity = oreConfig.getInt("Zinc Ore Rarity", Zinc, 16, 1, 256, "");

        oreConfig.setCategoryLanguageKey(Zirconium, "config." + Zirconium);
        oreConfig.setCategoryRequiresMcRestart(Zirconium, true);
        WorldGenConfig.GenerateZirconium = oreConfig.getBoolean("Zirconium Generate", Zirconium, true, "Does the world Generate Zirconium ore?");
        WorldGenConfig.ZirconiumMaxSpawnHeight = oreConfig.getInt("Zirconium Ore Max Spawn Hight", Zirconium, 255, 1, 256, "");
        WorldGenConfig.ZirconiumMinSpawnHeight = oreConfig.getInt("Zirconium Ore Min Spawn Hight", Zirconium, 1, 1, 256, "");
        WorldGenConfig.ZirconiumMaxSize = oreConfig.getInt("Zirconium Ore Cluster Size", Zirconium, 10, 1, 256, "");
        WorldGenConfig.ZirconiumRarity = oreConfig.getInt("Zirconium Ore Rarity", Zirconium, 16, 1, 256, "");

        if (oreConfig.hasChanged())
        {
            oreConfig.save();
        }
    }

}
