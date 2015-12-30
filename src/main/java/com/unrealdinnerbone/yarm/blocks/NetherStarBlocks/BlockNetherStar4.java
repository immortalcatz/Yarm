package com.unrealdinnerbone.yarm.blocks.NetherStarBlocks;

import com.unrealdinnerbone.yarm.reference.Reference;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.EnumFacing;
import reborncore.api.IBlockTextureProvider;
import reborncore.api.TextureRegistry;

public class BlockNetherStar4 extends BlockBaseNetherStar implements IBlockTextureProvider {

    private static String name = "BlockNetherStar4";

    public BlockNetherStar4()
    {
        this.setUnlocalizedName(Reference.RE_PREFIX + name);
        TextureRegistry.registerBlock(this);
    }
    public static String getName()
    {
        return name;
    }

    @Override
    public String getTextureName(IBlockState blockState, EnumFacing facing) {
        return Reference.TEXTURE_PATH_BLOCK + name;
    }

    @Override
    public int amountOfVariants() {
        return 1;
    }

    @Override
    public IBlockState getStateFromMetaValue(int meta) {
        return null;
    }
}
