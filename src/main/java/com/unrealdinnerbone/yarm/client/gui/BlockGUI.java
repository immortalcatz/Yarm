package com.unrealdinnerbone.yarm.client.gui;

import com.unrealdinnerbone.yarm.Util.Reference;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.util.ResourceLocation;

public class BlockGUI extends GuiScreen
{
    private final int guiWidth = 555;
    private final int guiHeight = 275;

    public BlockGUI()
    {

    }

    @Override
    public void drawScreen(int mouseX, int mouseY, float partialTicks)
    {
        super.drawScreen(mouseX, mouseY, partialTicks);

        int x = (width - guiWidth) / 2;
        int y = (height - guiHeight) / 2;

        mc.renderEngine.bindTexture(new ResourceLocation(Reference.MOD_ID, "textures/gui/test/test.png"));
        drawTexturedModalRect(x, y, 0, 0 , guiWidth, guiHeight);
        fontRendererObj.drawString(String.valueOf(Minecraft.getDebugFPS()), x + 10, y + 10, 0x404040);
    }
}
