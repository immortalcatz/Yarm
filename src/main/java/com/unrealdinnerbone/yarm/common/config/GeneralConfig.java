package com.unrealdinnerbone.yarm.common.config;

import static com.unrealdinnerbone.yarm.common.config.ConfigManger.*;

public class GeneralConfig
{

    public static boolean ironAppleGivesPositiveEffects;
    public static boolean ironAppleGivesNegativesEffects;
    public static boolean craftableNotchApples;
    public static boolean loging;
    public static boolean villgersDropEmeralds;

    public static void loadGeneralConfig()
    {
        generalConfig.setCategoryLanguageKey(panels, "config.panels");
        ConfigPanels.NightPanelTeir1_Cap = generalConfig.getInt("NightPanelTeir1_Cap", panels, 10000,TelsaMin, TelsaMax, "");
        ConfigPanels.NightPanelTeir1_GenRate = generalConfig.getInt("NightPanelTeir1_GenRate", panels, 1,TelsaMin, TelsaMax, "");
        ConfigPanels.NightPanelTeir1_TranforRate = generalConfig.getInt("NightPanelTeir1_TranforRate", panels, 10,TelsaMin, TelsaMax, "");

        generalConfig.setCategoryLanguageKey(general, "config.general");
        GeneralConfig.ironAppleGivesPositiveEffects = generalConfig.getBoolean("Iron Apple Positive Effects", general, true, "Does the iron apple give that player positive effects when it is eaten");
        GeneralConfig.ironAppleGivesNegativesEffects = generalConfig.getBoolean("Iron Apple Gives Negative Effects", general, true, "Does the iron apple give that player negative effects when it is eaten");
        GeneralConfig.craftableNotchApples = generalConfig.getBoolean("Craftable Notch Apples", general, true, "Can you craft notch apples?");
        GeneralConfig.loging = generalConfig.getBoolean("Do Logging", general, true, "WARRING WILL TURN OF ALL YARM LOGS");
        GeneralConfig.villgersDropEmeralds = generalConfig.getBoolean("Villager drop emeralds", general, true, "Do villgers drop emerlads when they die");

        if (generalConfig.hasChanged())
        {
            generalConfig.save();
        }
    }

}
