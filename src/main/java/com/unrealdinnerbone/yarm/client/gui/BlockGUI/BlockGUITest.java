package com.unrealdinnerbone.yarm.client.gui.BlockGUI;

import com.unrealdinnerbone.yarm.Util.Reference;
import com.unrealdinnerbone.yarm.init.ModItems;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;

import java.io.IOException;

public class BlockGUITest extends GuiScreen
{
    private final int guiWidth = 234;
    private final int guiHeight = 234;

    private GuiButton Main;
    private GuiButton Test;

    public BlockGUITest()
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
//        fontRendererObj.drawString(String.valueOf(Minecraft.getDebugFPS()), x + 10, y + 10, 0x404040);
//        fontRendererObj.drawString(Minecraft.getMinecraft().getSession().getUsername(), x + 10, y + 20 , 0x99FF00);
        mc.getRenderItem().renderItemIntoGUI(new ItemStack(ModItems.Item_UnRealFace), x + 20 , y + 30);

    }

    @Override
    public void initGui() {
        int x = (width - guiWidth) / 2;
        int y = (height - guiHeight) / 2;

        int guiWidth2 = guiWidth / 2;
        int guiHeight2 = guiHeight / 2;

        this.buttonList.add(Main = new GuiButton(0, x - 44, x - 80, 20, 20, "Main"));
        this.buttonList.add(Test = new GuiButton(1, y - 44, y - 60, 20, 20, "Test"));
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
