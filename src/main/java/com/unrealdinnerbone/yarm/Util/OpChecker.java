package com.unrealdinnerbone.yarm.Util;

import com.mojang.authlib.GameProfile;
import net.minecraft.server.MinecraftServer;
import net.minecraftforge.fml.common.FMLCommonHandler;

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
}
