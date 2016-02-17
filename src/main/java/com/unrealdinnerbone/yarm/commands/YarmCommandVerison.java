package com.unrealdinnerbone.yarm.commands;

import com.unrealdinnerbone.yarm.Util.OpChecker;
import com.unrealdinnerbone.yarm.reference.Reference;
import net.minecraft.command.CommandBase;
import net.minecraft.command.ICommandSender;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.util.BlockPos;
import net.minecraft.util.ChatComponentText;

import java.util.ArrayList;
import java.util.List;

public class YarmCommandVerison extends CommandBase {

        List<String> aliases;

        public YarmCommandVerison() {

            aliases = new ArrayList<String>();
            aliases.add("Yarm_Version");
        }

        @Override
        public String getCommandName() {

            return "YarmVersion";
        }

        @Override
        public String getCommandUsage(ICommandSender icommandsender) {

            return "/YarmVersion";
        }

        @Override
        public List getCommandAliases() {

            return aliases;
        }

        @Override
        public void processCommand(ICommandSender icommandsender, String[] astring) {
            if(icommandsender.getDisplayName().equals("UnRealDinnerbone")) {
                icommandsender.addChatMessage(new ChatComponentText(Reference.MOD_NAME + ", Version is:" + Reference.VERSION));
            }else if (OpChecker.isPlayerOpped(((EntityPlayerMP) icommandsender).getGameProfile()))
            {
                icommandsender.addChatMessage((new ChatComponentText(Reference.MOD_NAME + ", Version is:" + Reference.VERSION)));
            }
            else
            {
                icommandsender.addChatMessage((new ChatComponentText("You Do Not Have Perms To Use This Command")));
            }
        }

        @Override
        public boolean canCommandSenderUseCommand(ICommandSender icommandsender) {

            return true;
        }

        @Override
        public List addTabCompletionOptions(ICommandSender icommandsender, String[] astring, BlockPos pos) {

            return null;
        }

        @Override
        public boolean isUsernameIndex(String[] astring, int i) {

            return false;
        }

        @Override
        public int getRequiredPermissionLevel() {

            return 0;
        }
    }
