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
import net.minecraft.client.Minecraft;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.*;
import net.minecraftforge.fml.common.network.NetworkRegistry;
import net.minecraftforge.fml.common.registry.GameRegistry;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION, acceptedMinecraftVersions = Reference.MC_VERSION, guiFactory = Reference.GUI_FACTORY_CLASS, canBeDeactivated = true, updateJSON = Reference.MOD_UPDATE_JSON_URL)
public class yarm {

    @Mod.Instance(Reference.MOD_ID)
    public static yarm instance;

    @SidedProxy(clientSide = Reference.CLIENT_SIDE, serverSide = Reference.SERVER_SIDE, modId = Reference.MOD_ID)
    public static IProxy proxy;

    @Mod.EventHandler
    public static void PreInit(FMLPreInitializationEvent PreEvent)
    {
       ClientProxy.PreInt(PreEvent);
       CommonProxy.PreInt(PreEvent);
       ServerProxy.PreInt(PreEvent);
    }
    @Mod.EventHandler
    public static void Init(FMLInitializationEvent Event)
    {
        ClientProxy.Int(Event);
        CommonProxy.Int(Event);
        ServerProxy.Int(Event);
    }
    @Mod.EventHandler
    public static void PostInit(FMLPostInitializationEvent PostEvent)
    {
        ClientProxy.PostInt(PostEvent);
        CommonProxy.PostInt(PostEvent);
        ServerProxy.PostInt(PostEvent);
    }
}

