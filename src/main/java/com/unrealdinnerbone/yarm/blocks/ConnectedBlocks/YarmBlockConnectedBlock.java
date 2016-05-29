package com.unrealdinnerbone.yarm.blocks.ConnectedBlocks;

import com.unrealdinnerbone.yarm.blocks.BlockYarm;
import net.minecraft.block.properties.PropertyBool;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;


public abstract class YarmBlockConnectedBlock extends BlockYarm
{
    public static final PropertyBool CONNECTED_DOWN = PropertyBool.create("connected_down");
    public static final PropertyBool CONNECTED_UP = PropertyBool.create("connected_up");
    public static final PropertyBool CONNECTED_NORTH = PropertyBool.create("connected_north");
    public static final PropertyBool CONNECTED_SOUTH = PropertyBool.create("connected_south");
    public static final PropertyBool CONNECTED_EAST = PropertyBool.create("connected_east");
    public static final PropertyBool CONNECTED_WEST = PropertyBool.create("connected_west");

    @Override
    public abstract IBlockState getActualState (IBlockState state, IBlockAccess world, BlockPos position);

    @Override
    protected abstract BlockStateContainer createBlockState ();

    @Override
    public abstract int getMetaFromState (IBlockState state);

    public abstract boolean isSideConnectable (IBlockAccess world, BlockPos pos, EnumFacing side);

}
