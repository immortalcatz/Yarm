package com.unrealdinnerbone.yarm.Achievements;

import com.unrealdinnerbone.yarm.Util.LogHelper;
import com.unrealdinnerbone.yarm.init.ModBlocks;
import net.minecraft.item.Item;
import net.minecraftforge.common.AchievementPage;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.PlayerEvent.ItemCraftedEvent;

public class AchievementsHandler
{
    public static AchievementPage YarmPage;

    @SubscribeEvent
    public void CraftingEvents(ItemCraftedEvent event)
    {
        if(event.crafting.getItem() == Item.getItemFromBlock(ModBlocks.BLOCK_NETHER_STAR_1))
        {
            event.player.addStat(Achievements.AchievementCraftNetherStar1, 1);
        }
        if(event.crafting.getItem() == Item.getItemFromBlock(ModBlocks.BLOCK_NETHER_STAR_2))
        {
            event.player.addStat(Achievements.AchievementCraftNetherStar2, 1);
        }
        if(event.crafting.getItem() == Item.getItemFromBlock(ModBlocks.BLOCK_NETHER_STAR_3))
        {
            event.player.addStat(Achievements.AchievementCraftNetherStar3, 1);
        }
        if(event.crafting.getItem() == Item.getItemFromBlock(ModBlocks.BLOCK_NETHER_STAR_4))
        {
            event.player.addStat(Achievements.AchievementCraftNetherStar4, 1);
        }
        if(event.crafting.getItem() == Item.getItemFromBlock(ModBlocks.BLOCK_NETHER_STAR_5))
        {
            event.player.addStat(Achievements.AchievementCraftNetherStar5, 1);
        }
        if(event.crafting.getItem() == Item.getItemFromBlock(ModBlocks.BLOCK_NETHER_STAR_6))
        {
            event.player.addStat(Achievements.AchievementCraftNetherStar6, 1);
        }
        if(event.crafting.getItem() == Item.getItemFromBlock(ModBlocks.BLOCK_NETHER_STAR_7))
        {
            event.player.addStat(Achievements.AchievementCraftNetherStar7, 1);
        }
        if(event.crafting.getItem() == Item.getItemFromBlock(ModBlocks.BLOCK_NETHER_STAR_8))
        {
            event.player.addStat(Achievements.AchievementCraftNetherStar8, 1);
        }
    }
    public static void RegisterPage()
    {
        YarmPage = new AchievementPage("yarm Achievements",
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
