package com.unrealdinnerbone.yarm.client.gui;

import com.unrealdinnerbone.yarm.Util.CharHelper;
import com.unrealdinnerbone.yarm.config.ConfigManger;
import com.unrealdinnerbone.yarm.Util.Reference;
import net.minecraft.client.gui.GuiScreen;
import net.minecraftforge.common.config.ConfigElement;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.client.config.GuiConfig;
import net.minecraftforge.fml.client.config.IConfigElement;

import java.util.Arrays;

public class ModGuiConfig extends GuiConfig
{
    public static String WorldGen = CharHelper.BLUE + "worldgen";
    public static String General = "general";

    public ModGuiConfig(GuiScreen parentScreen) {
        super(parentScreen,
                Arrays.asList(new IConfigElement[] {
                        new ConfigElement(ConfigManger.configuration.getCategory(WorldGen)),
                        new ConfigElement(ConfigManger.configuration.getCategory(General))
                }),
                Reference.MOD_ID, false, false, "Yarm Config");
    }
}
