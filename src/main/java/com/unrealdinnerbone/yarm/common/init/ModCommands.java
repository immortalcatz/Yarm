package com.unrealdinnerbone.yarm.common.init;

import com.unrealdinnerbone.yarm.Commands.YarmCommandVersion;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class ModCommands
{
    @SubscribeEvent
    public static void init(FMLServerStartingEvent event){
        event.registerServerCommand(new YarmCommandVersion());
    }
}
