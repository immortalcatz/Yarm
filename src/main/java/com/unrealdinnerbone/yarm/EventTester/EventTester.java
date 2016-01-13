package com.unrealdinnerbone.yarm.EventTester;

import net.minecraft.util.ChatComponentText;
import net.minecraftforge.client.event.RenderGameOverlayEvent;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.PlayerEvent;

public class EventTester
{
    public static void init() {

        MinecraftForge.EVENT_BUS.register(new EventTester());
        FMLCommonHandler.instance().bus().register(new EventTester());
    }

//    @SubscribeEvent
//    public void chatEvent(PlayerEvent.PlayerRespawnEvent event) {
//        event.player.addChatComponentMessage(new ChatComponentText(event.player.getName() + "HAS RESPAWNED"));
//        event.player.
//
//    }

}
