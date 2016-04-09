package com.unrealdinnerbone.yarm.network;

import com.unrealdinnerbone.yarm.blocks.GuiContainer;
import com.unrealdinnerbone.yarm.blocks.TileEnity.ContainerModTileEnity;
import com.unrealdinnerbone.yarm.blocks.TileEnity.ModTileEntity;
import com.unrealdinnerbone.yarm.client.gui.BlockGUI.BlockGUIMain;
import com.unrealdinnerbone.yarm.client.gui.BlockGUI.BlockGUITest;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.network.IGuiHandler;

public class GUIHandler implements IGuiHandler
{
    public static final int TEST_GUI_MAIN_MASTER = 1;
    public static final int TEST_GUI_MAIN_INV = 2;


    @Override
    public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
        if(ID == TEST_GUI_MAIN_MASTER)
        {
            return new BlockGUIMain();
        }
        if(ID == TEST_GUI_MAIN_INV)
        {
            return new ContainerModTileEnity(player.inventory, (ModTileEntity) world.getTileEntity(new BlockPos(x, y, z)));
        }
        return null;
    }

    @Override
    public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z)
    {
        if(ID == TEST_GUI_MAIN_MASTER)
        {
            return new BlockGUIMain();
        }
        if(ID == TEST_GUI_MAIN_INV)
        {
            return new BlockGUITest(new ContainerModTileEnity(player.inventory, (ModTileEntity) world.getTileEntity(new BlockPos(x, y, z))));

        }
        return null;
    }
}
