package com.unrealdinnerbone.yarm.blocks.Faces;

import com.unrealdinnerbone.yarm.blocks.BlockYarm;
import com.unrealdinnerbone.yarm.reference.Reference;
import net.minecraft.block.material.Material;

import java.util.List;

public class BlockUnRealFace extends BlockYarm
{
    private static String name = "BlockUnRealFace";

    public BlockUnRealFace()
    {
        super(Material.rock);
        this.setUnlocalizedName(Reference.RE_PREFIX + name);
    }
    public static String getName()
    {
        return name;
    }
}
