package com.unrealdinnerbone.yarm.Commands;

import com.unrealdinnerbone.yarm.Util.OpChecker;
import net.minecraft.command.ICommandSender;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.server.MinecraftServer;

public abstract class YarmCommandOpOnly extends YarmCommandBase
{
    @Override
    public boolean checkPermission(MinecraftServer server, ICommandSender sender) {
        if(sender instanceof EntityPlayerMP){
            return OpChecker.isPlayerOpped(((EntityPlayerMP) sender).getGameProfile());
        } else {
            return true;
        }
    }
}
