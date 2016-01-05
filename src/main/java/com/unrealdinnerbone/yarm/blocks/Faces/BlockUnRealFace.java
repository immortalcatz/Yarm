package com.unrealdinnerbone.yarm.blocks.Faces;

import com.unrealdinnerbone.yarm.CreativeTab.Tab;
import com.unrealdinnerbone.yarm.blocks.BlockYarm;
import com.unrealdinnerbone.yarm.reference.Reference;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.EnumFacing;

public class BlockUnRealFace extends BlockYarm
{
    private static String name = "BlockUnRealFace";

    public BlockUnRealFace()
       {
       super(Material.rock);
       this.setCreativeTab(Tab.Yarm_Tab);
       this.setUnlocalizedName(Reference.RE_PREFIX + name);
       }
}

