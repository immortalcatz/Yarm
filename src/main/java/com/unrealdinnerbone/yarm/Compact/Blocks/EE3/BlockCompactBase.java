package com.unrealdinnerbone.yarm.Compact.Blocks.EE3;

import com.unrealdinnerbone.yarm.CreativeTab.Tab;
import net.minecraft.block.material.Material;
import uk.co.qmunity.lib.block.BlockBase;

public class BlockCompactBase extends BlockBase {

    public BlockCompactBase(Material material)
    {
        super(material);
    }

    @Override
    protected String getModId() {
        return null;
    }

    public BlockCompactBase()
    {
        this(Material.rock);
        this.setCreativeTab(Tab.Yarm_Tab);
        this.setHardness(3.5F);
        this.setBlockTextureName("BlockCompactBase");
        this.setBlockName("BlockCompactBase");

    }
}
