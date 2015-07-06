package com.unrealdinnerbone.yarm.blocks;

import com.unrealdinnerbone.yarm.item.ItemYarm;
import net.minecraft.block.BlockChest;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class BlockUnRealChest extends BlockContainer {

    public BlockUnRealChest()
    {
        super(Material.iron);
        setBlockName("UnRealChest");
        setHardness(3.0F);
        setBlockBounds(0.0625F, 05F, 0.0625F, 0.9375F, 0.875F, 0.9375F);

    }

    @Override
    public TileEntity createNewTileEntity(World p_149915_1_, int p_149915_2_) {
        return null;
    }
}
