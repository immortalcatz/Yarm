package com.unrealdinnerbone.yarm.Util;

import com.mojang.authlib.GameProfile;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.FMLCommonHandler;

import java.util.List;

public class OpChecker
{
    public static MinecraftServer getServer() {

        return FMLCommonHandler.instance().getMinecraftServerInstance();
    }


    public static boolean isPlayerOpped(GameProfile player) {

        if (getServer().getPlayerList().getOppedPlayerNames().length > 0) {
            for (String name : getServer().getPlayerList().getOppedPlayerNames()) {
                if (name.toLowerCase().equals(player.getName().toLowerCase())) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    public static void sendChatMessageServerWide(TextComponentString message) {
        for (EntityPlayer player : getServer().getPlayerList().getPlayerList()) {
            player.addChatMessage(message);

        }
    }
}
