package com.unrealdinnerbone.yarm.blocks.NetherStarBlocks;

import com.unrealdinnerbone.yarm.reference.Reference;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.EnumFacing;
import reborncore.api.IBlockTextureProvider;

public class BlockNetherStar2 extends BlockBaseNetherStar implements IBlockTextureProvider {

    private static String name = "BlockNetherStar2";

    public BlockNetherStar2()
    {
        this.setUnlocalizedName(Reference.RE_PREFIX + name);
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
