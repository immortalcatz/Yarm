package com.unrealdinnerbone.yarm.entity;


import com.unrealdinnerbone.yarm.init.ModItems;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class entityManmaed extends enityYarmPlayer
{

    public entityManmaed(World world) {
        super(world);
        this.setSize(1.0F, 2.0F);
    }

    protected Item getDropItem() {
        ItemStack item = new ItemStack(ModItems.ItemManmedFace);
        this.entityDropItem(item, 0.0F);
        return Item.getItemById(0);
    }
}

