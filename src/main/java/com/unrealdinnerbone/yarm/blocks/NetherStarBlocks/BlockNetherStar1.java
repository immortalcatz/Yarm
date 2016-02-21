package com.unrealdinnerbone.yarm.blocks.NetherStarBlocks;

import com.unrealdinnerbone.yarm.Util.Reference;

public class BlockNetherStar1 extends BlockBaseNetherStar {

    private static String name = "BlockNetherStar1";

    public BlockNetherStar1()
    {
        super();
        this.setUnlocalizedName(Reference.RE_PREFIX + name);
       // TextureRegistry.registerBlock(this);
        
    }
    public static String getName()
    {
        return name;
    }

//    @Override
//    public String getTextureName(IBlockState blockState, EnumFacing facing) {
//        return Reference.TEXTURE_PATH_BLOCK + name;
//    }
//
//    @Override
//    public int amountOfVariants() {
//        return 1;
//    }

}
