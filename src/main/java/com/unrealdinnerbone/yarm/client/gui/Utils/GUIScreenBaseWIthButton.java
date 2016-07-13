package com.unrealdinnerbone.yarm.client.gui.Utils;

import net.minecraft.client.gui.GuiButton;

import java.io.IOException;

public abstract class GUIScreenBaseWIthButton extends GUIScreenBase
{
    @Override
    protected abstract void actionPerformed(GuiButton button) throws IOException;
}
