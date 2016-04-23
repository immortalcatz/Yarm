package com.unrealdinnerbone.yarm.blocks.Ores;

import com.unrealdinnerbone.yarm.CreativeTab.Tab;
import com.unrealdinnerbone.yarm.blocks.BlockYarm;
import com.unrealdinnerbone.yarm.Util.Reference;
import net.minecraft.block.material.Material;

public class BlockAntimonyOre extends BlockYarmOre {

    private static String name = "BlockAntimonyOre";

    public BlockAntimonyOre()
    {
        this.setUnlocalizedName(Reference.RE_PREFIX + name);
    }
    public static String getName()
    {
        return name;
    }

}
