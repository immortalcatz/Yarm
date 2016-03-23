package com.unrealdinnerbone.yarm.blocks;

import com.unrealdinnerbone.yarm.CreativeTab.Tab;
import com.unrealdinnerbone.yarm.client.gui.BlockGUI;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.client.model.obj.OBJModel;

public class BlockYarm extends Block
{
    public BlockYarm(Material material)
    {
        super(material);
    }

    public BlockYarm()
    {
        this(Material.rock);
        this.setCreativeTab(Tab.Yarm_Tab);
        this.setHardness(3.5F);
        this.setSoundType(SoundType.METAL);
    }

}
