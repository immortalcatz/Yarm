package com.unrealdinnerbone.yarm.client.gui.NightPanelGUI;

import com.unrealdinnerbone.yarm.Util.LogHelper;
import com.unrealdinnerbone.yarm.Util.Reference;
import com.unrealdinnerbone.yarm.client.gui.Utils.GUIScreenBase;
import com.unrealdinnerbone.yarm.client.gui.Utils.GUIScreenBaseWIthButton;
import net.minecraft.block.BlockTNT;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.util.ResourceLocation;
import sun.rmi.runtime.Log;

import java.io.IOException;

public class GUINightPanel extends GUIScreenBaseWIthButton
{
    private static int PrintPowerToChatID = 1;

    GuiButton PrintPowerToChatButton;

    public static int Stored;
    private static int GUIWidth = 200;
    private static int GUIHeight = 100;


    @Override
    public void drawScreen(int x, int y, float ticks)
    {
        int GUIX = (width - GUIHeight) / 2;
        int GUIY = (height - GUIHeight) / 2;

        String PowerStored = String.valueOf(Stored);
       // mc.renderEngine.bindTexture(new ResourceLocation(Reference.MOD_ID,"textures/gui/test/test.png"));
       // drawTexturedModalRect(GUIX, GUIY, 0, 0, GUIWidth, GUIHeight);
//        fontRendererObj.drawString(PowerStored,GUIX ,GUIY,1,false);

    }


    @Override
    public void initGui() {

        int GUIX = (width - GUIHeight) / 2;
        int GUIY = (height - GUIWidth) / 2;

        PrintPowerToChatButton = new GuiButton(PrintPowerToChatID, GUIX - 10, GUIY + 10, 20, 20, "Press Me");

        buttonList.clear();
        buttonList.add(PrintPowerToChatButton);
    }

    @Override
    public boolean doesGuiPauseGame()
    {
        return false;
    }




    @Override
    protected void actionPerformed(GuiButton button) throws IOException {
        switch (button.id)
        {


        }
    }
}
