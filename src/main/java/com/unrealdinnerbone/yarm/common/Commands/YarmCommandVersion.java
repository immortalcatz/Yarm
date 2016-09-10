package com.unrealdinnerbone.yarm.common.Commands;

import com.unrealdinnerbone.yarm.Util.Reference;
import com.unrealdinnerbone.yarm.common.config.ConfigManger;
import com.unrealdinnerbone.yarm.common.config.ConfigPanels;
import net.minecraft.command.CommandException;
import net.minecraft.command.ICommandSender;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.TextComponentString;

import javax.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;

public class YarmCommandVersion extends YarmCommandUnRealOPOnly
{
    @Override
    public String getCommandName() {
        return "yarm";
    }

    @Override
    public String getCommandUsage(ICommandSender commandSender) {
        return "/yarm [verison], [ReloadConfigs]";
    }

    @Override
    public void execute(MinecraftServer server, ICommandSender sender, String[] args) throws CommandException
    {
        if(args.length > 0){
            if(args[0].toLowerCase().equals("version")){
                sender.addChatMessage(new TextComponentString(ConfigPanels.NightPanelTeir1_GenRate + "You are running " + Reference.VERSION + " of, " + Reference.MOD_NAME));
            }
            if(args[0].toLowerCase().equals("ReloadConfigs"))
            {
//                ConfigManger.();
            }
        }else
        {
            sender.addChatMessage(new TextComponentString("/yarm [version], [ReloadConfigs"));
        }
    }
    @Override
    public List<String> getTabCompletionOptions(MinecraftServer minecraftServer, ICommandSender iCommandSender, String[] strings, @Nullable BlockPos blockPos) {
        ArrayList Commands = new ArrayList();

        Commands.add("version");
        Commands.add("ReloadConfigs");
        Commands.add("Help");

        return Commands;
    }
}
