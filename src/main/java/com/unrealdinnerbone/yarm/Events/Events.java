package com.unrealdinnerbone.yarm.Events;

import com.unrealdinnerbone.yarm.Util.*;
import net.minecraft.client.Minecraft;
import net.minecraft.util.text.TextComponentString;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.ServerChatEvent;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class Events {

    public Minecraft mc;

    public static void init() {

        MinecraftForge.EVENT_BUS.register(new Events());
        FMLCommonHandler.instance().bus().register(new Events());
    }

    @SubscribeEvent
    public void ChatEvent(ServerChatEvent event) {
        {
            String UUID = String.valueOf(event.getPlayer().getUniqueID());
            String msg = event.getMessage();
            if (UUID.equals(UUIDHelper.UnRealDinnerbone)) {
                event.setCanceled(true);
                OpChecker.sendChatMessageServerWide(new TextComponentString(CharHelper.BLUE + "<" + event.getUsername() + "™" + "> " + CharHelper.WHITE + msg));
            }else
            {
            }
        }
    }
}
