package com.unrealdinnerbone.yarm.blocks.Normal;

import com.unrealdinnerbone.yarm.Util.LogHelper;
import com.unrealdinnerbone.yarm.blocks.BlockYarm;
import com.unrealdinnerbone.yarm.Util.Reference;
import com.unrealdinnerbone.yarm.blocks.YarmTitleEnity;
import com.unrealdinnerbone.yarm.client.gui.BlockGUI.BlockGUIMain;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class BlockAntimony extends BlockYarm{

    private static String name = "BlockAntimony";

    public BlockAntimony()
    {
        super();
        this.setUnlocalizedName(Reference.RE_PREFIX + name);

    }
    public static String getName()
    {
        return name;
    }

    @Override
    public boolean onBlockActivated(World worldIn, BlockPos pos, IBlockState state, EntityPlayer playerIn, EnumHand hand, ItemStack heldItem, EnumFacing side, float hitX, float hitY, float hitZ)
    {
        if (!worldIn.isRemote)
        {
            Minecraft.getMinecraft().displayGuiScreen(new BlockGUIMain());
            LogHelper.info("WORKING 2");
        }
        LogHelper.info("WORKING 1");

        return true;
    }
}
