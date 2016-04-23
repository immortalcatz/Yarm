package com.unrealdinnerbone.yarm.Util;

import net.minecraft.client.gui.GuiScreen;
import net.minecraftforge.common.config.ConfigElement;
import net.minecraftforge.fml.client.config.IConfigElement;
import net.minecraftforge.fml.client.config.GuiConfig;

import java.util.Arrays;

public class GUICategorys extends GuiConfig
{
    public GUICategorys(GuiScreen parentScreen) {
        super(parentScreen,
                Arrays.asList(new IConfigElement[] {
                        new ConfigElement(ConfigManger.configuration.getCategory("Ores")),
                        new ConfigElement(ConfigManger.configuration.getCategory("2")),
                        new ConfigElement(ConfigManger.configuration.getCategory("3")),
                        new ConfigElement(ConfigManger.configuration.getCategory("4")),
                        new ConfigElement(ConfigManger.configuration.getCategory("5"))
                }),
                Reference.MOD_ID, false, false, "Yarm Config");
    }
}
