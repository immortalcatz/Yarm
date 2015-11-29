package com.unrealdinnerbone.yarm;

import com.unrealdinnerbone.yarm.Util.LogHelper;
import com.unrealdinnerbone.yarm.init.*;
import com.unrealdinnerbone.yarm.init.Recpies.Shapless;
import com.unrealdinnerbone.yarm.init.Recpies.Shpaed;
import com.unrealdinnerbone.yarm.init.Recpies.Smelting;
import com.unrealdinnerbone.yarm.proxy.ClientProxy;
import com.unrealdinnerbone.yarm.proxy.IProxy;
import com.unrealdinnerbone.yarm.reference.Reference;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import com.unrealdinnerbone.yarm.init.OreGen;
import sun.rmi.runtime.Log;


import java.util.logging.Logger;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION)
public class yarm {



    @Mod.Instance(Reference.MOD_ID)
    public static yarm instance;

    @SidedProxy(clientSide = Reference.CLIENT_SIDE, serverSide = Reference.SERVER_SIDE, modId = Reference.MOD_ID)
    public static IProxy proxy;

    @Mod.EventHandler
    public static void PreInit(FMLPreInitializationEvent PreEvent)
    {
        LogHelper.info("Starting Post Init");
        OreGen WorldGen = new OreGen();

        //Items
        LogHelper.info("Starting To Load Items");
        ModItems.init();

        //Blocks
        LogHelper.info("Stating To Load Blocks");
        ModBlocks.init();

        //Recpies
        LogHelper.info("Stating To Load Shaped Recipes");
        Shpaed.init();
        LogHelper.info("Stating To Load Smelting Recipes");
        Smelting.init();
        LogHelper.info("Stating To Load Shapeless Recipe");
        Shapless.init();

        //Enitys
        LogHelper.info("Loading Entity's");
        ModEntity.initEntity();

        //Ore Dictionary
        LogHelper.info("Loading Ore Dic");
        ModOreDictionary.OreDictionary();

        //Ore Generator
        GameRegistry.registerWorldGenerator(WorldGen, 1);

        //Stuff


            if(PreEvent.getSide().isClient())
            {
            ClientProxy.registerRendering();
        }

    }
    @Mod.EventHandler
    public static void Init(FMLInitializationEvent event)
    {

    }
    @Mod.EventHandler
    public static void PostInit(FMLPostInitializationEvent PostEvent)
    {
        LogHelper.info("Stating Post Init");
        LogHelper.info("Post Init Compete");
        LogHelper.info("Lets Hope It Does not Shot Fire and blow up" + "-Ichun 2015");

       /* for (String oreName : OreDictionary.getOreNames())
        {
            LogHelper.info(oreName);
            OreDictionary.getOres("");
        }*/
    }

}

