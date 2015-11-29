package com.unrealdinnerbone.yarm.blocks.Ores;

import com.google.common.collect.ImmutableMap;
import com.unrealdinnerbone.yarm.blocks.BlockYarm;
import com.unrealdinnerbone.yarm.reference.Reference;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.state.IBlockState;

import java.util.Collection;

public class BlockAntimonyOre extends BlockYarm implements IBlockState {
    public BlockAntimonyOre()
    {
        super(Material.iron);
        this.setUnlocalizedName(Reference.MOD_ID + "_" + "AntimonyOre");
    }

    @Override
    public Collection<IProperty> getPropertyNames() {
        return null;
    }

    @Override
    public <T extends Comparable<T>> T getValue(IProperty<T> property) {
        return null;
    }

    @Override
    public <T extends Comparable<T>, V extends T> IBlockState withProperty(IProperty<T> property, V value) {
        return null;
    }

    @Override
    public <T extends Comparable<T>> IBlockState cycleProperty(IProperty<T> property) {
        return null;
    }

    @Override
    public ImmutableMap<IProperty, Comparable> getProperties() {
        return null;
    }

    @Override
    public Block getBlock() {
        return null;
    }
}
