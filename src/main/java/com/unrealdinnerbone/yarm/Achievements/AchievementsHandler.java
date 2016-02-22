package com.unrealdinnerbone.yarm.Achievements;

import com.unrealdinnerbone.yarm.Util.LogHelper;
import com.unrealdinnerbone.yarm.init.ModBlocks;
import net.minecraftforge.common.AchievementPage;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.PlayerEvent.ItemCraftedEvent;

public class AchievementsHandler
{
    public static AchievementPage YarmPage;

    @SubscribeEvent
    public void CraftingEvents(ItemCraftedEvent event)
    {
        if(event.crafting.getItem().equals(ModBlocks.BLOCK_NETHER_STAR_1))
        {
            event.player.addStat(Achievements.AchievementCraftNetherStar1, 1);
        }
        event.player.addStat(Achievements.AchievementCraftNetherStar1, 1);
    }
    public static void RegisterPage()
    {
        YarmPage = new AchievementPage("Yarm Achievements",
                Achievements.AchievementCraftNetherStar1,
                Achievements.AchievementCraftNetherStar2,
                Achievements.AchievementCraftNetherStar3,
                Achievements.AchievementCraftNetherStar4,
                Achievements.AchievementCraftNetherStar5,
                Achievements.AchievementCraftNetherStar6,
                Achievements.AchievementCraftNetherStar7,
                Achievements.AchievementCraftNetherStar8);
        AchievementPage.registerAchievementPage(YarmPage);
    }
}
