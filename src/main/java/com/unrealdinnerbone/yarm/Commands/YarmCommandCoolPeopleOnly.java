package com.unrealdinnerbone.yarm.Commands;

import com.mojang.authlib.GameProfile;
import com.unrealdinnerbone.yarm.Util.CoolPeople;
import net.minecraft.command.ICommandSender;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.server.MinecraftServer;

public abstract class YarmCommandCoolPeopleOnly extends YarmCommandBase
{
    GameProfile gameProfile;
    @Override
    public boolean checkPermission(MinecraftServer server, ICommandSender sender) {
        if (sender instanceof EntityPlayerMP) {
            String  UUID  = String.valueOf(EntityPlayerMP.getUUID(gameProfile));
            if (CoolPeople.CoolPeople.contains(UUID)) {
                return true;
            }
        }
        return false;
    }
}
