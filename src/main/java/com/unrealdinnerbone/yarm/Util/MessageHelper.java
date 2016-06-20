package com.unrealdinnerbone.yarm.Util;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiNewChat;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.text.TextComponentString;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

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

    @SideOnly(Side.CLIENT)
    public static void sendSpamlessMessage(int messageID, TextComponentString message) {

        final GuiNewChat chat = Minecraft.getMinecraft().ingameGUI.getChatGUI();
        chat.printChatMessageWithOptionalDeletion(message, messageID);
    }
}
