package com.unrealdinnerbone.yarm.entity;

import com.unrealdinnerbone.yarm.init.ModItems;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class entityUnReal extends enityYarmPlayer {

    public entityUnReal(World world) {
        super(world);
    }

    protected Item getDropItem() {
        ItemStack item = new ItemStack(ModItems.ItemUnRealFace);
        this.entityDropItem(item, 0.0F);
        return Item.getItemById(0);
    }

}