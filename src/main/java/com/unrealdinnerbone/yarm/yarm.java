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

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION)
public class yarm {

    @Mod.Instance(Reference.MOD_ID)
    public static yarm instance;

    @SidedProxy(clientSide = Reference.CLIENT_SIDE, serverSide = Reference.SERVER_SIDE, modId = Reference.MOD_ID)
    public static IProxy proxy;

    @Mod.EventHandler
    public static void PreInit(FMLPreInitializationEvent PreEvent)
    {
        OreGen WorldGen = new OreGen();

        //Items
        ModItems.init();

        //Blocks
        ModBlocks.init();

        //Recpies
        Shpaed.init();
        Smelting.init();
        Shapless.init();

        //Enitys
        ModEntity.initEntity();

        //Ore Dictionary
        ModOreDictionary.OreDictionary();

        //Ore Generator
        GameRegistry.registerWorldGenerator(WorldGen, 1);

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
        LogHelper.info("Post Init Compete");

       /* for (String oreName : OreDictionary.getOreNames())
        {
            LogHelper.info(oreName);
            OreDictionary.getOres("");
        }*/
    }

}

