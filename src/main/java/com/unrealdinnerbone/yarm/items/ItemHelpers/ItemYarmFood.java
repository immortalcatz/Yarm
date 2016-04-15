package com.unrealdinnerbone.yarm.items.ItemHelpers;

import com.unrealdinnerbone.yarm.CreativeTab.Tab;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public abstract class ItemYarmFood extends ItemFood
{
    public ItemYarmFood(int amount, float saturation, boolean wolffood) {
        super(amount, saturation, wolffood);
        this.setCreativeTab(Tab.Yarm_Tab);
        this.setMaxStackSize(64);
    }

    public abstract ItemStack onEaten(ItemStack itemStack, World world, EntityPlayer player);
}
