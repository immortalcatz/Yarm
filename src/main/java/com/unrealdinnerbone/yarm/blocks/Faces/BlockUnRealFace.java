package com.unrealdinnerbone.yarm.blocks.Faces;

import com.unrealdinnerbone.yarm.CreativeTab.Tab;
import com.unrealdinnerbone.yarm.blocks.BlockYarm;
import com.unrealdinnerbone.yarm.reference.Reference;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.EnumFacing;
import reborncore.api.IBlockTextureProvider;
import reborncore.api.TextureRegistry;

public class BlockUnRealFace extends BlockYarm implements IBlockTextureProvider
{
    private static String name = "BlockUnRealFace";

    public BlockUnRealFace()
       {
       super(Material.rock);
       this.setCreativeTab(Tab.Yarm_Tab);
       this.setUnlocalizedName(Reference.RE_PREFIX + name);
       TextureRegistry.registerBlock(this);
       }


    @Override
    public String getTextureName(IBlockState blockState, EnumFacing facing) {
        return Reference.TEXTURE_PATH_BLOCK + name;
    }

    @Override
    public int amountOfVariants() {
        return 1;
    }

    public static String getName()
    {
        return name;
    }
}

