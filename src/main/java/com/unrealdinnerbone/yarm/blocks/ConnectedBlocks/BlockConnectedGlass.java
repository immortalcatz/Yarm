package com.unrealdinnerbone.yarm.blocks.ConnectedBlocks;

import com.unrealdinnerbone.yarm.blocks.BlockYarm;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyBool;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;

public class BlockConnectedGlass extends BlockYarm
{

    private static String name = "BlockConnectedGlass";

    public static final PropertyBool CONNECTED_DOWN = PropertyBool.create("isconnected_down");
    public static final PropertyBool CONNECTED_UP = PropertyBool.create("isconnected_up");
    public static final PropertyBool CONNECTED_NORTH = PropertyBool.create("isconnected_north");
    public static final PropertyBool CONNECTED_SOUTH = PropertyBool.create("isonnected_south");
    public static final PropertyBool CONNECTED_WEST = PropertyBool.create("isconnected_west");
    public static final PropertyBool CONNECTED_EAST = PropertyBool.create("isconnected_east");


    public BlockConnectedGlass() {

        super(Material.ROCK);
        this.setUnlocalizedName(name);
        this.setDefaultState(this.blockState.getBaseState().withProperty(CONNECTED_DOWN, Boolean.FALSE).withProperty(CONNECTED_EAST, Boolean.FALSE).withProperty(CONNECTED_NORTH, Boolean.FALSE).withProperty(CONNECTED_SOUTH, Boolean.FALSE).withProperty(CONNECTED_UP, Boolean.FALSE).withProperty(CONNECTED_WEST, Boolean.FALSE));

    }
    @Override
    public IBlockState getActualState (IBlockState state, IBlockAccess world, BlockPos position) {
        return state.withProperty(CONNECTED_DOWN, this.isSideConnectable(world, position, EnumFacing.DOWN)).withProperty(CONNECTED_EAST, this.isSideConnectable(world, position, EnumFacing.EAST)).withProperty(CONNECTED_NORTH, this.isSideConnectable(world, position, EnumFacing.NORTH)).withProperty(CONNECTED_SOUTH, this.isSideConnectable(world, position, EnumFacing.SOUTH)).withProperty(CONNECTED_UP, this.isSideConnectable(world, position, EnumFacing.UP)).withProperty(CONNECTED_WEST, this.isSideConnectable(world, position, EnumFacing.WEST));
    }

    @Override
    protected BlockStateContainer createBlockState () {
        return new BlockStateContainer(this, new IProperty[] { CONNECTED_DOWN, CONNECTED_UP, CONNECTED_NORTH, CONNECTED_SOUTH, CONNECTED_WEST, CONNECTED_EAST });
    }
    @Override
    public int getMetaFromState (IBlockState state) {

        return 0;
    }
    private boolean isSideConnectable (IBlockAccess world, BlockPos pos, EnumFacing side) {

        final IBlockState state = world.getBlockState(pos.offset(side));
        return (state == null) ? false : state.getBlock() == this;
    }

    public static String getName()
    {
        return name;
    }
}
