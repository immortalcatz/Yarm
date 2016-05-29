package com.unrealdinnerbone.yarm.Util;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.text.TextComponentString;
import net.minecraftforge.fml.common.FMLCommonHandler;

public class MessageHelper
{

    public static MinecraftServer getServer() {

        return FMLCommonHandler.instance().getMinecraftServerInstance();
    }

    public static void sendChatMessageServerWide(TextComponentString message) {
        for (EntityPlayer player : getServer().getPlayerList().getPlayerList()) {
            player.addChatMessage(message);

        }
    }
}
