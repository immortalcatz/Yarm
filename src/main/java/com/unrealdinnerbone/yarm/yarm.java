package com.unrealdinnerbone.yarm;

import com.unrealdinnerbone.yarm.EventTester.EventTester;
import com.unrealdinnerbone.yarm.Util.LogHelper;
import com.unrealdinnerbone.yarm.commands.YarmCommandVerison;
import com.unrealdinnerbone.yarm.init.*;
import com.unrealdinnerbone.yarm.init.Recpies.Shapless;
import com.unrealdinnerbone.yarm.init.Recpies.Shpaed;
import com.unrealdinnerbone.yarm.init.Recpies.Smelting;
import com.unrealdinnerbone.yarm.proxy.ClientProxy;
import com.unrealdinnerbone.yarm.proxy.IProxy;
import com.unrealdinnerbone.yarm.reference.Reference;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import com.unrealdinnerbone.yarm.init.ModOreGen;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION, acceptedMinecraftVersions = Reference.MC_VERSION)
public class yarm {



    @Mod.Instance(Reference.MOD_ID)
    public static yarm instance;

    @SidedProxy(clientSide = Reference.CLIENT_SIDE, serverSide = Reference.SERVER_SIDE, modId = Reference.MOD_ID)
    public static IProxy proxy;

    @Mod.EventHandler
    public static void PreInit(FMLPreInitializationEvent PreEvent)
    {

    }
    @Mod.EventHandler
    public static void Init(FMLInitializationEvent Event)
    {

        ModOreGen WorldGen = new ModOreGen();
        ModBlocks.init();
        ModBlocks.RenderBlocks();
        Shpaed.init();
        ModItems.init();
        Smelting.init();
        Shapless.init();
        ModEntity.initEntity();
        ModOreDictionary.OreDictionary();
        EventTester.init();

        GameRegistry.registerWorldGenerator(WorldGen, 1);
        if(Event.getSide().isClient())
        {
            ClientProxy.render();
        }
    }
    @Mod.EventHandler
    public static void PostInit(FMLPostInitializationEvent PostEvent)
    {
        LogHelper.info("Lets Hope It Does not Shot Fire and blow up" + "-Ichun 2015");
    }

    @Mod.EventHandler
    @SideOnly(Side.SERVER)
    public void ServerLoad(FMLServerStartingEvent event) {

        event.registerServerCommand(new YarmCommandVerison());
        LogHelper.all("LOADED COMMANDS");
    }
}

