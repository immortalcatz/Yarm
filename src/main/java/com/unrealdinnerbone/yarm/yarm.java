package com.unrealdinnerbone.yarm;

import com.unrealdinnerbone.yarm.init.ModBlocks;
import com.unrealdinnerbone.yarm.init.ModItems;
import com.unrealdinnerbone.yarm.proxy.IProxy;
import com.unrealdinnerbone.yarm.reference.Reference;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import net.minecraft.client.Minecraft;
import net.minecraft.crash.CrashReport;
import net.minecraftforge.event.world.WorldEvent;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION)
public class yarm {

    @SidedProxy(clientSide = Reference.CLIENT_SIDE, serverSide = Reference.SERVER_SIDE, modId = Reference.MOD_ID)
    public static IProxy proxy;

    @Mod.EventHandler
    public static void PreInit(FMLPreInitializationEvent PreEvent)
    {
        ModItems.init();

        ModBlocks.init();
    }
    @Mod.EventHandler
    public static void Init(FMLInitializationEvent event) {
    }
    @Mod.EventHandler
    public static void PostInit(FMLPostInitializationEvent PostEvent){

    }

}

