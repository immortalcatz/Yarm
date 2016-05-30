package com.unrealdinnerbone.yarm.common.Commands;

import net.minecraft.command.CommandBase;
import net.minecraft.command.ICommandSender;

import java.util.ArrayList;
import java.util.List;

public abstract class YarmCommandBase extends CommandBase
{
    protected List<String> aliases = new ArrayList<String>();

    public List getCommandAliases()
    {
        return aliases;
    }

    @Override
    public abstract String getCommandName();

    @Override
    public abstract String getCommandUsage(ICommandSender commandSender);
}
