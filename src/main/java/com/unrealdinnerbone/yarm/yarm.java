package com.unrealdinnerbone.yarm;

import com.unrealdinnerbone.yarm.EventTester.EventTester;
import com.unrealdinnerbone.yarm.Util.LogHelper;
import com.unrealdinnerbone.yarm.init.*;
import com.unrealdinnerbone.yarm.init.Recpies.Shapless;
import com.unrealdinnerbone.yarm.init.Recpies.Shpaed;
import com.unrealdinnerbone.yarm.init.Recpies.Smelting;
import com.unrealdinnerbone.yarm.item.ItemAntimonyIngot;
import com.unrealdinnerbone.yarm.item.Tools.ItemToolOpAxe;
import com.unrealdinnerbone.yarm.proxy.ClientProxy;
import com.unrealdinnerbone.yarm.proxy.IProxy;
import com.unrealdinnerbone.yarm.reference.Reference;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.ItemRenderer;
import net.minecraft.client.renderer.entity.RenderItem;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import com.unrealdinnerbone.yarm.init.OreGen;
import net.minecraftforge.fml.relauncher.Side;
import sun.rmi.runtime.Log;


import java.util.logging.Logger;

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

        OreGen WorldGen = new OreGen();
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

}

