package com.unrealdinnerbone.yarm.client.gui.NightPanelGUI;

import com.unrealdinnerbone.yarm.Util.LangHelper;
import com.unrealdinnerbone.yarm.Util.Reference;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.util.ResourceLocation;

public class GUINightPanel extends GuiScreen
{
    public static int Stored = 0;
    private static int GUIWidth = 148;
    private static int GUIHeight = 80;

    @Override
    public void drawScreen(int x, int y, float ticks)
    {
        int GUIX = (width - GUIWidth) / 2;
        int GUIY = (height - GUIWidth) / 2;

        drawTexturedModalRect(GUIX, GUIY, 0, 0, GUIWidth, GUIHeight);
        String Storred = String.valueOf(Stored);
        fontRendererObj.drawSplitString(Storred ,GUIX ,GUIY,1,1);
        mc.renderEngine.bindTexture(new ResourceLocation(Reference.RE_PREFIX_GUI + "/test/test.png"));

        super.drawScreen(x, y, ticks);
    }
}
