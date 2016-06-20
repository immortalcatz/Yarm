package com.unrealdinnerbone.yarm.client.gui;

import com.unrealdinnerbone.yarm.common.config.ConfigManger;
import com.unrealdinnerbone.yarm.Util.Reference;
import net.minecraft.client.gui.GuiScreen;
import net.minecraftforge.common.config.ConfigElement;
import net.minecraftforge.fml.client.config.GuiConfig;
import net.minecraftforge.fml.client.config.IConfigElement;

import java.util.Arrays;

public class ModGuiConfig extends GuiConfig
{

    public ModGuiConfig(GuiScreen parentScreen) {
        super(parentScreen,
                Arrays.asList(new IConfigElement[] {
                        new ConfigElement(ConfigManger.configuration.getCategory(ConfigManger.WorldGen)),
                        new ConfigElement(ConfigManger.configuration.getCategory(ConfigManger.General)),
                        new ConfigElement(ConfigManger.configuration.getCategory(ConfigManger.Panels))
                }),
                Reference.MOD_ID, false, false, "Yarm Config");
    }
}
