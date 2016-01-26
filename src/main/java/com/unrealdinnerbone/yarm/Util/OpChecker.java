package com.unrealdinnerbone.yarm.Util;

import com.mojang.authlib.GameProfile;
import net.minecraft.server.MinecraftServer;

public class OpChecker {

    public static boolean isPlayerOpped(GameProfile player){
        if(MinecraftServer.getServer().getConfigurationManager().getOppedPlayerNames().length > 0) {
            for (String name : MinecraftServer.getServer().getConfigurationManager().getOppedPlayerNames()) {
                if (name.toLowerCase().equals(player.getName().toLowerCase())) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }
}
