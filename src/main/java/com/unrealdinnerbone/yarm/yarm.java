package com.unrealdinnerbone.yarm;

import com.unrealdinnerbone.yarm.Achievements.Achievements;
import com.unrealdinnerbone.yarm.Achievements.AchievementsHandler;
import com.unrealdinnerbone.yarm.init.Recpies.BannerMaker;
import com.unrealdinnerbone.yarm.Util.ConfigManger;
import com.unrealdinnerbone.yarm.Util.LogHelper;
import com.unrealdinnerbone.yarm.init.*;
import com.unrealdinnerbone.yarm.init.Recpies.*;
import com.unrealdinnerbone.yarm.network.GUIHandler;
import com.unrealdinnerbone.yarm.proxy.*;
import com.unrealdinnerbone.yarm.Util.Reference;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.*;
import net.minecraftforge.fml.common.network.NetworkRegistry;
import net.minecraftforge.fml.common.registry.GameRegistry;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION, acceptedMinecraftVersions = Reference.MC_VERSION, guiFactory = Reference.GUI_FACTORY_CLASS, canBeDeactivated = true)
public class Yarm {

    @Mod.Instance(Reference.MOD_ID)
    public static Yarm instance;

    @SidedProxy(clientSide = Reference.CLIENT_SIDE, serverSide = Reference.SERVER_SIDE, modId = Reference.MOD_ID)
    public static IProxy proxy;

    @Mod.EventHandler
    public static void PreInit(FMLPreInitializationEvent PreEvent)
    {
       ModBlocks.init();
       ModItems.init();
       ModEntity.initEntity();
       ConfigManger.ConfigManger(PreEvent.getSuggestedConfigurationFile());
       FMLCommonHandler.instance().bus().register(new ConfigManger());
       MinecraftForge.EVENT_BUS.register(new AchievementsHandler());
    }
    @Mod.EventHandler
    public static void Init(FMLInitializationEvent Event)
    {
        ModOreGen WorldGen = new ModOreGen();
        ShpaedRecpices.init();
        SmeltingRecpices.init();
        ShaplessRecpices.init();
        ModOreDictionary.OreDictionary();
        GameRegistry.registerWorldGenerator(WorldGen, 1);
        ClientProxy.RegisterRenders(Event);
        Achievements.LoadAchievements();
        AchievementsHandler.RegisterPage();
        BannerMaker.initCraftingBanners();
        NetworkRegistry.INSTANCE.registerGuiHandler(Yarm.instance, new GUIHandler());
    }
    @Mod.EventHandler
    public static void PostInit(FMLPostInitializationEvent PostEvent)
    {
        LogHelper.info(PostEvent.getModState());
        LogHelper.info("Lets Hope It Does not Shot Fire and blow up ****" + "-Ichun 2015");
    }
}

