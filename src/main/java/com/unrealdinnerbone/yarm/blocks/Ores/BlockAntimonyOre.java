package com.unrealdinnerbone.yarm.blocks.Ores;

import com.unrealdinnerbone.yarm.CreativeTab.Tab;
import com.unrealdinnerbone.yarm.blocks.BlockYarm;
import com.unrealdinnerbone.yarm.Util.Reference;
import net.minecraft.block.material.Material;

public class BlockAntimonyOre extends BlockYarm {

    private static String name = "BlockAntimonyOre";

    public BlockAntimonyOre()
    {
        super(Material.iron);
        this.setUnlocalizedName(Reference.RE_PREFIX + name);
        this.setCreativeTab(Tab.Yarm_Tab);
    }
    public static String getName()
    {
        return name;
    }

}
