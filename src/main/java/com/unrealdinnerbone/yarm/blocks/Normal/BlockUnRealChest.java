package com.unrealdinnerbone.yarm.blocks.Normal;

import com.unrealdinnerbone.yarm.Util.Reference;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class BlockUnRealChest extends BlockContainer {

    private static String name = "BlockUnRealChest";

    public BlockUnRealChest()
    {
        super(Material.IRON);
        this.setUnlocalizedName(Reference.RE_PREFIX + name);
        setHardness(3.0F);
        this.isBlockContainer = true;


    }

    public static String getName()
    {
        return name;
    }

    @Override
    public TileEntity createNewTileEntity(World p_149915_1_, int p_149915_2_)
    {
        return null;
    }

    public boolean isOpaqueCube()
    {
        return false;
    }

    public int getRenderType()
    {
        return 22;
    }

}
