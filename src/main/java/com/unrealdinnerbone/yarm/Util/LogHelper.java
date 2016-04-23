package com.unrealdinnerbone.yarm.Util;

import com.unrealdinnerbone.yarm.config.ConfigManger;
import com.unrealdinnerbone.yarm.config.OtherConfig;
import net.minecraftforge.fml.common.FMLLog;
import org.apache.logging.log4j.Level;

public class LogHelper
{
    public static void log(Level logLevel, Object object)
    {
        FMLLog.log(Reference.MOD_ID, logLevel, "["+ Reference.MOD_ID.toUpperCase() + "] [" + logLevel + "] " + String.valueOf(object));
    }

    public static void info(Object object) {
        if (OtherConfig.DoLoging = true) {
            log(Level.INFO, object);
        }
    }
}