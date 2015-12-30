package com.unrealdinnerbone.yarm.blocks.Ores;

import com.google.common.collect.ImmutableMap;
import com.unrealdinnerbone.yarm.CreativeTab.Tab;
import com.unrealdinnerbone.yarm.blocks.BlockYarm;
import com.unrealdinnerbone.yarm.reference.Reference;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.EnumFacing;
import reborncore.api.IBlockTextureProvider;
import reborncore.api.TextureRegistry;

import java.util.Collection;

public class BlockAntimonyOre extends BlockYarm implements IBlockTextureProvider {

    private static String name = "BlockAntimonyOre";

    public BlockAntimonyOre()
    {
        super(Material.iron);
        this.setUnlocalizedName(Reference.RE_PREFIX + name);
        this.setCreativeTab(Tab.Yarm_Tab);
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
