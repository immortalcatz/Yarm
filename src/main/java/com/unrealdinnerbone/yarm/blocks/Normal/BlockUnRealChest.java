package com.unrealdinnerbone.yarm.blocks.Normal;

import com.unrealdinnerbone.yarm.reference.Reference;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class BlockUnRealChest extends BlockContainer {

    public BlockUnRealChest()
    {
        super(Material.iron);
        setUnlocalizedName(Reference.MOD_ID + "_" + "UnRealChest");
        setHardness(3.0F);
        setBlockBounds(0.0625F, 0F, 0.0625F, 0.9375F, 0.875F, 0.9375F);
        this.isBlockContainer = true;


    }

    @Override
    public TileEntity createNewTileEntity(World p_149915_1_, int p_149915_2_)
    {
        return null;
    }
    @Override
    public boolean isOpaqueCube()
    {
        return false;
    }

    @Override
    public int getRenderType()
    {
        return 22;
    }

}
