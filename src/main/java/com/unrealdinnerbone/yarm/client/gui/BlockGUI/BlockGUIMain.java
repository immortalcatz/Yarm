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
    private final int guiWidth = 233;
    private final int guiHeight = 234;

    private final int ButtonWidth = 50;
    private final int ButtonHeight = 50;

    private GuiButton Main;
    private GuiButton Test;

    public BlockGUIMain()
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
        drawTexturedModalRect(x - 30 , y, 260, 4, ButtonWidth, ButtonHeight);
//        fontRendererObj.drawString(String.valueOf(Minecraft.getDebugFPS()), x + 10, y + 10, 0x404040);
//        fontRendererObj.drawString(Minecraft.getMinecraft().getSession().getUsername(), x + 10, y + 20 , 0x99FF00);
        mc.getRenderItem().renderItemIntoGUI(new ItemStack(ModItems.Item_ManmedFace), x + 20 , y + 30);

    }

    @Override
    public void initGui()
    {
        int x = (width - guiWidth) / 2;
        int y = (height - guiHeight) / 2;
        LogHelper.info("Width: " + width);
    }
    @Override
    public boolean doesGuiPauseGame()
    {
        return false;
    }

    @Override
    protected void actionPerformed(GuiButton button) throws IOException {
        if (button == Main) {
			Minecraft.getMinecraft().displayGuiScreen(new BlockGUIMain());
        }
        if (button == Test){
            Minecraft.getMinecraft().displayGuiScreen(new BlockGUITest());
        }
    }
}
