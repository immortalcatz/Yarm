package com.unrealdinnerbone.yarm.blocks.Faces;

import com.unrealdinnerbone.yarm.CreativeTab.Tab;
import com.unrealdinnerbone.yarm.blocks.BlockYarm;
import com.unrealdinnerbone.yarm.reference.Reference;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;

import java.util.List;

public class BlockUnRealFace extends BlockYarm
{
    public BlockUnRealFace()
    {
        super(Material.rock);
        this.setBlockName("UnReal_Block");
        this.setBlockTextureName(Reference.MOD_ID + ":" + "UnReal_Face");
        this.setStepSound(soundTypeStone);
        this.setCreativeTab(Tab.Yarm_Tab);
    }
}
