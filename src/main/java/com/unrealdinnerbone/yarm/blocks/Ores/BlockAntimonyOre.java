package com.unrealdinnerbone.yarm.blocks.Ores;

import com.unrealdinnerbone.yarm.blocks.BlockYarm;
import com.unrealdinnerbone.yarm.reference.Reference;
import net.minecraft.block.material.Material;

public class BlockAntimonyOre extends BlockYarm
{
    public BlockAntimonyOre()
    {
        super(Material.iron);
        this.setBlockName("AntimonyOre");
        this.setBlockTextureName(Reference.MOD_ID + ":" + "AntimonyOre");
    }
}
