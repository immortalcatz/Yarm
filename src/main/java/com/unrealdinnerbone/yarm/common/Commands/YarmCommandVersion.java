package com.unrealdinnerbone.yarm.common.Commands;

import com.unrealdinnerbone.yarm.Util.Reference;
import net.minecraft.command.CommandException;
import net.minecraft.command.ICommandSender;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.text.TextComponentString;

public class YarmCommandVersion extends YarmCommandUnRealOPOnly
{
    @Override
    public String getCommandName() {
        return "yarm";
    }

    @Override
    public String getCommandUsage(ICommandSender commandSender) {
        return "/yarm [verison]";
    }

    @Override
    public void execute(MinecraftServer server, ICommandSender sender, String[] args) throws CommandException
    {
        if(args.length > 0){
            if(args[0].toLowerCase().equals("version")){
                sender.addChatMessage(new TextComponentString("" + "You are running " + Reference.VERSION + " of, " + Reference.MOD_NAME));
            }
        }else
        {
            sender.addChatMessage(new TextComponentString("/yarm [version]"));
        }
    }
}
