package com.unrealdinnerbone.yarm.blocks.ConnectedBlocks;

import com.unrealdinnerbone.yarm.CreativeTab.Tab;
import com.unrealdinnerbone.yarm.Util.Reference;
import com.unrealdinnerbone.yarm.blocks.BlockYarm;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyBool;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class BlockConnectedGlass extends BlockYarm
{

    // These are the properties used for determining whether or not a side is connected. They
    // do NOT take up block IDs, they are unlisted properties. If you plan to create multiple
    // blocks that can have connected faces and plan on giving them different classes, I would
    // recommend putting them in a centralized class.
    public static final PropertyBool CONNECTED_DOWN = PropertyBool.create("connected_down");
    public static final PropertyBool CONNECTED_UP = PropertyBool.create("connected_up");
    public static final PropertyBool CONNECTED_NORTH = PropertyBool.create("connected_north");
    public static final PropertyBool CONNECTED_SOUTH = PropertyBool.create("connected_south");
    public static final PropertyBool CONNECTED_WEST = PropertyBool.create("connected_west");
    public static final PropertyBool CONNECTED_EAST = PropertyBool.create("connected_east");

    public BlockConnectedGlass() {

        super(Material.ROCK);
        this.setUnlocalizedName(Reference.RE_PREFIX + "BlockConnectedGlass");
        this.setCreativeTab(Tab.Yarm_Tab);

        // By default none of the sides are connected.
        this.setDefaultState(this.blockState.getBaseState().withProperty(CONNECTED_DOWN, Boolean.FALSE).withProperty(CONNECTED_EAST, Boolean.FALSE).withProperty(CONNECTED_NORTH, Boolean.FALSE).withProperty(CONNECTED_SOUTH, Boolean.FALSE).withProperty(CONNECTED_UP, Boolean.FALSE).withProperty(CONNECTED_WEST, Boolean.FALSE));

    }

    @Override
    public boolean isOpaqueCube(IBlockState p_isOpaqueCube_1_) {
        return true;
    }


    @Override
    @SideOnly(Side.CLIENT)
    public BlockRenderLayer getBlockLayer() {
        return BlockRenderLayer.TRANSLUCENT;
    }

    @Override
    public boolean isFullCube(IBlockState p_isFullCube_1_) {
        return false;
    }


    @Override
    public IBlockState getActualState (IBlockState state, IBlockAccess world, BlockPos position) {

        // Creates the state to use for the block. This is where we check if every side is
        // connectable or not.
        return state.withProperty(CONNECTED_DOWN, this.isSideConnectable(world, position, EnumFacing.DOWN)).withProperty(CONNECTED_EAST, this.isSideConnectable(world, position, EnumFacing.EAST)).withProperty(CONNECTED_NORTH, this.isSideConnectable(world, position, EnumFacing.NORTH)).withProperty(CONNECTED_SOUTH, this.isSideConnectable(world, position, EnumFacing.SOUTH)).withProperty(CONNECTED_UP, this.isSideConnectable(world, position, EnumFacing.UP)).withProperty(CONNECTED_WEST, this.isSideConnectable(world, position, EnumFacing.WEST));
    }

    @Override
    protected BlockStateContainer createBlockState () {

        // This returns the connected properties as part of the BlockStateContainer. This is
        // used all over the place in vanilla to represent properties without having them take
        // up metadata values.
        return new BlockStateContainer(this, new IProperty[] { CONNECTED_DOWN, CONNECTED_UP, CONNECTED_NORTH, CONNECTED_SOUTH, CONNECTED_WEST, CONNECTED_EAST });
    }

    // Since the block has state information but we are not switching the meta value, we have
    // to override this method to return 0. If you want to actually take advantage of the meta
    // values you could override this to return the correct meta.
    @Override
    public int getMetaFromState (IBlockState state) {

        return 0;
    }

    /**
     * Checks if a specific side of a block can connect to this block. For this example, a side
     * is connectable if the block is the same block as this one.
     *
     * @param world The world to run the check in.
     * @param pos The position of the block to check for.
     * @param side The side of the block to check.
     * @return Whether or not the side is connectable.
     */
    private boolean isSideConnectable (IBlockAccess world, BlockPos pos, EnumFacing side) {

        final IBlockState state = world.getBlockState(pos.offset(side));
        return (state == null) ? false : state.getBlock() == this;
    }
}
