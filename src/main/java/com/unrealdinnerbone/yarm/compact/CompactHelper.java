package com.unrealdinnerbone.yarm.compact;

import com.unrealdinnerbone.yarm.compact.TOP.TOPCompact;
import com.unrealdinnerbone.yarm.compact.WAILA.WailaCompatibility;
import net.minecraftforge.fml.common.Loader;

public class CompactHelper
{
    public static void registerWaila() {
        if (Loader.isModLoaded("Waila")) {
            WailaCompatibility.register();
        }
    }


    public static void registerTOP() {
        if (Loader.isModLoaded("theoneprobe")) {
            TOPCompact.register();
        }
    }

}