package com.unrealdinnerbone.yarm.Commands;

import com.unrealdinnerbone.yarm.Util.CoolPeople;
import com.unrealdinnerbone.yarm.Util.OpChecker;
import net.minecraft.command.ICommandSender;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.server.MinecraftServer;

public abstract class YarmCommandUnRealOPOnly extends YarmCommandBase
{
    @Override
    public boolean checkPermission(MinecraftServer server, ICommandSender sender){
        if(sender instanceof EntityPlayerMP){
            if(((EntityPlayerMP) sender).getUniqueID().equals(CoolPeople.UnRealDinnerbone_UUID)){
                return true;
            }
            return OpChecker.isPlayerOpped(((EntityPlayerMP) sender).getGameProfile());
        } else {
            return true;
        }
    }
}
