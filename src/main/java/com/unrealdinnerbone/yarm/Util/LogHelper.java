package com.unrealdinnerbone.yarm.Util;

import net.minecraftforge.fml.common.FMLLog;
import org.apache.logging.log4j.Level;

public class LogHelper
{
    public static void log(Level logLevel, Object object)
    {
        FMLLog.log(Reference.MOD_ID, logLevel, "["+ Reference.MOD_ID.toUpperCase() + "] [" + logLevel + "] " + String.valueOf(object));
    }

    public static void info(Object object)
    {
        log(Level.INFO, object);
    }
}