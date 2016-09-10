package com.unrealdinnerbone.yarm.client.gui;

import com.unrealdinnerbone.yarm.common.config.ConfigManger;
import com.unrealdinnerbone.yarm.Util.Reference;
import net.minecraft.client.gui.GuiScreen;
import net.minecraftforge.common.config.ConfigElement;
import net.minecraftforge.fml.client.config.DummyConfigElement;
import net.minecraftforge.fml.client.config.GuiConfig;
import net.minecraftforge.fml.client.config.IConfigElement;

import java.util.ArrayList;
import java.util.List;

import static com.unrealdinnerbone.yarm.common.config.WorldGenConfig.*;

public class ModGuiConfig extends GuiConfig
{

    public ModGuiConfig(GuiScreen parentScreen) {

        super(parentScreen, getConfigElements(parentScreen), Reference.MOD_ID, false, false, Reference.MOD_NAME);
    }

    public static final String[] CATEGORIES_CLIENT = {ConfigManger.client};
    public static final String[] CATEGORIES_GENERAL = {ConfigManger.panels, ConfigManger.general};
    public static final String[] CATEGORIES_WORLDGEN = {Antimony, Bismuth, Chromium, Cobalt, Copper, Gallium, Indium, Lead, Magnesium, Nickel, Silver, Tin, Titanium, Zinc, Zirconium};

    private static List<IConfigElement> getConfigElements(GuiScreen parent) {

        List<IConfigElement> list = new ArrayList<IConfigElement>();

        list.add(new DummyConfigElement.DummyCategoryElement("client", "config.client", getClientConfigElements()));
        list.add(new DummyConfigElement.DummyCategoryElement("general", "config.general", getGeneralModuleConfigElements()));
        list.add(new DummyConfigElement.DummyCategoryElement("worldgen", "config.worldgen", getWorldGenModuleConfigElements()));

        return list;
    }

    private static List<IConfigElement> getClientConfigElements() {

        List<IConfigElement> list = new ArrayList<IConfigElement>();

        for (int i = 0; i < CATEGORIES_CLIENT.length; i++) {
            list.add(new ConfigElement(ConfigManger.clientConfig.getCategory(CATEGORIES_CLIENT[i])));
        }
        return list;
    }

    private static List<IConfigElement> getGeneralModuleConfigElements() {

        List<IConfigElement> list = new ArrayList<IConfigElement>();

        for (int i = 0; i < CATEGORIES_GENERAL.length; i++) {
            list.add(new ConfigElement(ConfigManger.generalConfig.getCategory(CATEGORIES_GENERAL[i])));
        }
        return list;
    }

    private static List<IConfigElement> getWorldGenModuleConfigElements() {

        List<IConfigElement> list = new ArrayList<IConfigElement>();

        for (int i = 0; i < CATEGORIES_WORLDGEN.length; i++) {
            list.add(new ConfigElement(ConfigManger.oreConfig.getCategory(CATEGORIES_WORLDGEN[i])));
        }
        return list;
    }
}
