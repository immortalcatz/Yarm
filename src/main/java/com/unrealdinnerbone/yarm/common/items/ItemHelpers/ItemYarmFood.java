package com.unrealdinnerbone.yarm.common.items.ItemHelpers;

import com.unrealdinnerbone.yarm.Util.Tab;
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

    protected abstract void onFoodEaten (ItemStack par1ItemStack, World world, EntityPlayer player);
}
