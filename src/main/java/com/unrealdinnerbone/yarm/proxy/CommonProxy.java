package com.unrealdinnerbone.yarm.proxy;

import com.unrealdinnerbone.yarm.Util.Sounds;
import com.unrealdinnerbone.yarm.common.Achievements.Achievements;
import com.unrealdinnerbone.yarm.common.Achievements.AchievementsHandler;
import com.unrealdinnerbone.yarm.Util.LogHelper;
import com.unrealdinnerbone.yarm.common.World.ModWorldGen;
import com.unrealdinnerbone.yarm.common.init.*;
import com.unrealdinnerbone.yarm.common.init.Recpies.BannerMaker;
import com.unrealdinnerbone.yarm.common.init.Recpies.ShadedRecipes;
import com.unrealdinnerbone.yarm.common.init.Recpies.ShaplessRecpices;
import com.unrealdinnerbone.yarm.common.init.Recpies.SmeltingRecpices;
import com.unrealdinnerbone.yarm.compact.CompactHelper;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

public abstract class CommonProxy implements IProxy
{
    public static void PreInt(FMLPreInitializationEvent PreEvent)
    {
        ModBlocks.init();
        ModItems.init();
        ModEntity.initEntity();
    }
    public static void Int(FMLInitializationEvent Event)
    {
        MinecraftForge.EVENT_BUS.register(new AchievementsHandler());
        ModWorldGen WorldGen = new ModWorldGen();
        ShadedRecipes.init();
        SmeltingRecpices.init();
        ShaplessRecpices.init();
        GameRegistry.registerWorldGenerator(WorldGen, 1);
        Achievements.LoadAchievements();
        AchievementsHandler.RegisterPage();
        BannerMaker.initCraftingBanners();
        Sounds.init();
        CompactHelper.registerTOP();
        CompactHelper.registerWaila();

    }
    public static void PostInt(FMLPostInitializationEvent PostEvent)
    {
        LogHelper.info(PostEvent.getModState());
        LogHelper.info("Lets Hope It Does not Shot Fire and blow up ****" + "-Ichun 2015");
    }
}
