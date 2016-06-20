package com.unrealdinnerbone.yarm.common.Events.Server;

import com.unrealdinnerbone.yarm.Util.ColorUtils;
import com.unrealdinnerbone.yarm.Util.MessageHelper;
import com.unrealdinnerbone.yarm.Util.UUIDHelper;
import net.minecraft.util.text.TextComponentString;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.ServerChatEvent;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class ChatEvent
{
    public static void init() {

        MinecraftForge.EVENT_BUS.register(new ChatEvent());
        FMLCommonHandler.instance().bus().register(new ChatEvent());
    }

    @SubscribeEvent
    public void ChatEvent(ServerChatEvent event) {
        {
            String UUID = String.valueOf(event.getPlayer().getUniqueID());
            String msg = event.getMessage();
            if (UUID.equals(UUIDHelper.UnRealDinnerbone)) {
                event.setCanceled(true);
                MessageHelper.sendChatMessageServerWide(new TextComponentString(ColorUtils.BLUE + "<" + event.getUsername() + "™" + "> " + msg));
            }else
            {

            }
        }
    }
}
