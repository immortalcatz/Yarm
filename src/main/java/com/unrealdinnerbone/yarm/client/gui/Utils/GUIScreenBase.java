package com.unrealdinnerbone.yarm.client.gui.Utils;

import net.minecraft.client.gui.GuiScreen;


public abstract class GUIScreenBase extends GuiScreen
{

    @Override
    public abstract void drawScreen(int x, int y, float ticks);

    @Override
    public abstract boolean doesGuiPauseGame();

    @Override
    public abstract void initGui();

}
