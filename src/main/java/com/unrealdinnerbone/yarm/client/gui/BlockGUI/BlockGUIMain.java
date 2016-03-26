package com.unrealdinnerbone.yarm.client.gui.BlockGUI;

import com.unrealdinnerbone.yarm.Util.LogHelper;
import com.unrealdinnerbone.yarm.Util.Reference;
import com.unrealdinnerbone.yarm.init.ModItems;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;

import java.io.IOException;

public class BlockGUIMain extends GuiScreen
{
    private final int guiWidth = 231;
    private final int guiHeight = 234;

    private final int ButtonWidth = 51;
    private final int ButtonHeight = 107;

    int x = (width - guiWidth) / 2;
    int y = (height - guiHeight) / 2;

    public BlockGUIMain()
    {

    }

    @Override
    public void drawScreen(int mouseX, int mouseY, float partialTicks)

    {
        try {

            int x = (width - guiWidth) / 2;
            int y = (height - guiHeight) / 2;

            int LOL = 1;

            super.drawScreen(mouseX, mouseY, partialTicks);
            mc.renderEngine.bindTexture(new ResourceLocation(Reference.MOD_ID, "textures/gui/test/test.png"));
            drawTexturedModalRect(x, y, 0, 0 , guiWidth, guiHeight);
            drawTexturedModalRect(x - 24 , y + 12, 1998 / 2 , 11, ButtonWidth / 2, ButtonHeight/ 2);
            drawTexturedModalRect(x - 24 , y + 42, 1998 / 2 , 11, ButtonWidth / 2, ButtonHeight/ 2);
            drawTexturedModalRect(x - 24 , y + 72, 1998 / 2 , 11, ButtonWidth / 2, ButtonHeight/ 2);
            drawTexturedModalRect(x - 24 , y + 102, 1998 / 2 , 11, ButtonWidth / 2, ButtonHeight/ 2);
            drawTexturedModalRect(x - 24 , y + 132, 1998 / 2 , 11, ButtonWidth / 2, ButtonHeight/ 2);
            drawTexturedModalRect(x - 24 , y + 162, 1998 / 2 , 11, ButtonWidth / 2, ButtonHeight/ 2);
            drawTexturedModalRect(x - 24 , y + 192, 1998 / 2 , 11, ButtonWidth / 2, ButtonHeight/ 2);
//        fontRendererObj.drawString(String.valueOf(Minecraft.getDebugFPS()), x + 10, y + 10, 0x404040);
//        fontRendererObj.drawString(Minecraft.getMinecraft().getSession().getUsername(), x + 10, y + 20 , 0x99FF00);
            fontRendererObj.drawString(String.valueOf(LOL), x + 10, y + 10, 0x404040);
            LOL++;
            mc.getRenderItem().renderItemIntoGUI(new ItemStack(ModItems.Item_UnRealFace), x + -20 , y + 18);
            mc.getRenderItem().renderItemIntoGUI(new ItemStack(ModItems.Item_ManmedFace), x + -20 , y + 48);
            mc.getRenderItem().renderItemIntoGUI(new ItemStack(ModItems.Item_KyaneFace), x + -20 , y + 78);
            mc.getRenderItem().renderItemIntoGUI(new ItemStack(ModItems.Item_YunusFace), x + -20 , y + 108);
        }
        catch (Exception e)
        {
            LogHelper.info(e.getCause());
        }


    }

    @Override
    public void initGui()
    {
        LogHelper.info("Width: " + width);
    }
    @Override
    public boolean doesGuiPauseGame()
    {
        return false;
    }
    @Override
    protected void mouseClicked(int mouseX, int mouseY, int mouseButton) throws IOException
    {
        super.mouseClicked(mouseX, mouseY, mouseButton);
        int x = (width - guiWidth) / 2;
        int y = (height - guiHeight) / 2;
        LogHelper.info(x);

        if(x - 24 <= mouseX && x - 0 + ButtonWidth >= mouseX)
        {
            if(mouseY >= 14 && mouseY <= 40 ) {
                LogHelper.info("In Button Range");
            }

        }
    }

}
