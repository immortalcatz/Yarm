package com.unrealdinnerbone.yarm.Achievements;

import com.unrealdinnerbone.yarm.init.ModBlocks;
import net.minecraft.stats.Achievement;

public class Achievements
{


    public static Achievement AchievementCraftNetherStar1;
    public static Achievement AchievementCraftNetherStar2;
    public static Achievement AchievementCraftNetherStar3;
    public static Achievement AchievementCraftNetherStar4;
    public static Achievement AchievementCraftNetherStar5;
    public static Achievement AchievementCraftNetherStar6;
    public static Achievement AchievementCraftNetherStar7;
    public static Achievement AchievementCraftNetherStar8;

    public static String AchievementNameCraftNetherStar1 = "CraftNetherStar1";
    public static String AchievementNameCraftNetherStar2 = "CraftNetherStar2";
    public static String AchievementNameCraftNetherStar3 = "CraftNetherStar3";
    public static String AchievementNameCraftNetherStar4 = "CraftNetherStar4";
    public static String AchievementNameCraftNetherStar5 = "CraftNetherStar5";
    public static String AchievementNameCraftNetherStar6 = "CraftNetherStar6";
    public static String AchievementNameCraftNetherStar7 = "CraftNetherStar7";
    public static String AchievementNameCraftNetherStar8 = "CraftNetherStar8";
    public static String Achievement = "achievement";

    public static void LoadAchievements() {

        AchievementCraftNetherStar1 = new Achievement(Achievement + AchievementNameCraftNetherStar1.toLowerCase(), AchievementNameCraftNetherStar1, 0, 0, ModBlocks.BLOCK_NETHER_STAR_1, null).registerStat();
        AchievementCraftNetherStar2 = new Achievement(Achievement + AchievementNameCraftNetherStar2.toLowerCase(), AchievementNameCraftNetherStar2, 0, 1, ModBlocks.BLOCK_NETHER_STAR_2, AchievementCraftNetherStar1).registerStat();
        AchievementCraftNetherStar3 = new Achievement(Achievement + AchievementNameCraftNetherStar3.toLowerCase(), AchievementNameCraftNetherStar3, 0, 2, ModBlocks.BLOCK_NETHER_STAR_3, AchievementCraftNetherStar2).registerStat();
        AchievementCraftNetherStar4 = new Achievement(Achievement + AchievementNameCraftNetherStar4.toLowerCase(), AchievementNameCraftNetherStar4, 0, 3, ModBlocks.BLOCK_NETHER_STAR_4, AchievementCraftNetherStar3).registerStat();
        AchievementCraftNetherStar5 = new Achievement(Achievement + AchievementNameCraftNetherStar5.toLowerCase(), AchievementNameCraftNetherStar5, 0, 4, ModBlocks.BLOCK_NETHER_STAR_5, AchievementCraftNetherStar4).registerStat();
        AchievementCraftNetherStar6 = new Achievement(Achievement + AchievementNameCraftNetherStar6.toLowerCase(), AchievementNameCraftNetherStar6, 0, 5, ModBlocks.BLOCK_NETHER_STAR_6, AchievementCraftNetherStar5).registerStat();
        AchievementCraftNetherStar7 = new Achievement(Achievement + AchievementNameCraftNetherStar7.toLowerCase(), AchievementNameCraftNetherStar7, 1, 0, ModBlocks.BLOCK_NETHER_STAR_7, AchievementCraftNetherStar6).registerStat();
        AchievementCraftNetherStar8 = new Achievement(Achievement + AchievementNameCraftNetherStar8.toLowerCase(), AchievementNameCraftNetherStar8, 1, 1, ModBlocks.BLOCK_NETHER_STAR_8, AchievementCraftNetherStar7).setSpecial().registerStat();
    }

}
