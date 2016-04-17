package com.unrealdinnerbone.yarm.Client.gui.BlockGUI;

import com.unrealdinnerbone.yarm.Util.LogHelper;
import com.unrealdinnerbone.yarm.Util.Reference;
import com.unrealdinnerbone.yarm.blocks.TileEnity.ContainerModTileEnity;
import com.unrealdinnerbone.yarm.blocks.TileEnity.ModTileEntity;
import com.unrealdinnerbone.yarm.init.ModItems;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;

import java.io.IOException;

public class BlockGUITest extends GuiContainer
{
    private final int guiWidth = 231;
    private final int guiHeight = 234;

    private final int ButtonWidth = 51;
    private final int ButtonHeight = 107;

    static EntityPlayer player;
    static World world;

    public BlockGUITest(IInventory playerInv, ModTileEntity te) {
        super(new ContainerModTileEnity(playerInv, te));
        this.xSize = 176;
        this.ySize = 166;
    }

    public BlockGUITest(ContainerModTileEnity containerModTileEnity) {
        super(containerModTileEnity);
    }


    @Override
    public void drawScreen(int mouseX, int mouseY, float partialTicks)
    {
        int x = (width - guiWidth) / 2;
        int y = (height - guiHeight) / 2;

        try {
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
    protected void drawGuiContainerBackgroundLayer(float partialTicks, int mouseX, int mouseY) {

    }

    @Override
    public void initGui()
    {

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
        boolean XAll = x - 24 <= mouseX && x - 24 + (ButtonWidth / 2) >= mouseX;
        boolean YUnRealButton = mouseY >= y + 12 && mouseY <= y + 12 + (ButtonHeight / 2) - 28;
        boolean YManmaedFace = mouseY >= y + 42 && mouseY <= y + 12 + (ButtonHeight / 2) - 28;
        boolean YKaneFace = mouseY >= y + 72 && mouseY <= y + 12 + (ButtonHeight / 2) - 28;
        boolean YYunuesFace = mouseY >= y + 102 && mouseY <= y + 12 + (ButtonHeight / 2) - 28;


        if(XAll)
        {
            if(YUnRealButton)
            {
                sendChatMessage("A");
            }
            if(YManmaedFace) {
                sendChatMessage("B");
            }
            if(YKaneFace) {
                sendChatMessage("C");
            }
            if(YYunuesFace) {
                sendChatMessage("D");
            }

        }
    }
}
