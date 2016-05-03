package com.unrealdinnerbone.yarm.proxy;


import com.unrealdinnerbone.yarm.Achievements.Achievements;
import com.unrealdinnerbone.yarm.Achievements.AchievementsHandler;
import com.unrealdinnerbone.yarm.Util.LogHelper;
import com.unrealdinnerbone.yarm.World.ModWorldGen;
import com.unrealdinnerbone.yarm.init.*;
import com.unrealdinnerbone.yarm.init.Recpies.BannerMaker;
import com.unrealdinnerbone.yarm.init.Recpies.ShaplessRecpices;
import com.unrealdinnerbone.yarm.init.Recpies.ShpaedRecpices;
import com.unrealdinnerbone.yarm.init.Recpies.SmeltingRecpices;
import com.unrealdinnerbone.yarm.client.gui.GUIHandler;
import com.unrealdinnerbone.yarm.yarm;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.network.NetworkRegistry;
import net.minecraftforge.fml.common.registry.GameRegistry;

public abstract class CommonProxy implements IProxy
{
    public static void PreInt(FMLPreInitializationEvent PreEvent)
    {
        ModBlocks.init();
        ModItems.init();
        ModEntity.initEntity();
        MinecraftForge.EVENT_BUS.register(new AchievementsHandler());
    }
    public static void Int(FMLInitializationEvent Event)
    {
        ModWorldGen WorldGen = new ModWorldGen();
        ShpaedRecpices.init();
        SmeltingRecpices.init();
        ShaplessRecpices.init();
        GameRegistry.registerWorldGenerator(WorldGen, 1);
        Achievements.LoadAchievements();
        AchievementsHandler.RegisterPage();
        BannerMaker.initCraftingBanners();
        NetworkRegistry.INSTANCE.registerGuiHandler(yarm.instance, new GUIHandler());

    }
    public static void PostInt(FMLPostInitializationEvent PostEvent)
    {
        LogHelper.info(PostEvent.getModState());
        LogHelper.info("Lets Hope It Does not Shot Fire and blow up ****" + "-Ichun 2015");
    }
}
