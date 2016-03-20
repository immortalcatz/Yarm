package com.unrealdinnerbone.yarm.entitys;


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
        ItemStack item = new ItemStack(ModItems.Item_ManmedFace);
        this.entityDropItem(item, 0.0F);
        return Item.getItemById(0);
    }
}

