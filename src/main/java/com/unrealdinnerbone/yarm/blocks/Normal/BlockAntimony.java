package com.unrealdinnerbone.yarm.blocks.Normal;

import com.unrealdinnerbone.yarm.blocks.BlockYarm;
import com.unrealdinnerbone.yarm.reference.Reference;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.EnumFacing;
import reborncore.api.IBlockTextureProvider;

public class BlockAntimony extends BlockYarm implements IBlockTextureProvider {

    private static String name = "BlockAntimony";

    public BlockAntimony()
    {
        super();
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

}
