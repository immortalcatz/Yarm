package com.unrealdinnerbone.yarm.common.blocks.Normal;

import com.unrealdinnerbone.yarm.Util.LangHelper;
import com.unrealdinnerbone.yarm.common.blocks.BlockYarm;
import com.unrealdinnerbone.yarm.Util.Reference;

public class BlockAntimony extends BlockYarm
{

    private static String name = "BlockAntimony";


    public BlockAntimony()
    {
        super();
        this.setUnlocalizedName(Reference.RE_PREFIX + name);

    }

    @Override
    public String getLocalizedName() {
        return LangHelper.Block.translateMessage(name);
    }

    public static String getName()
    {
        return name;
    }

//    @Override
//    public boolean onBlockActivated(World worldIn, BlockPos pos, IBlockState state, EntityPlayer playerIn, EnumHand hand, ItemStack heldItem, EnumFacing side, float hitX, float hitY, float hitZ)
//    {
//        playerIn.openGui(yarm.instance, GUIHandler.TEST_GUI_MAIN_MASTER, worldIn, pos.getX(), pos.getY(), pos.getZ());
//        return true;
//    }
}
