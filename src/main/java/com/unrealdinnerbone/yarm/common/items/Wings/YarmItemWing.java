package com.unrealdinnerbone.yarm.common.items.Wings;

import com.unrealdinnerbone.yarm.common.items.ItemHelpers.ItemYarm;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemStack;

import java.util.List;

public abstract class YarmItemWing extends ItemYarm
{
    public YarmItemWing()
    {
        super();
        this.setMaxStackSize(1);
        this.isValidArmor(new ItemStack(this), EntityEquipmentSlot.CHEST);
    }


    public abstract void addInformation(ItemStack itemStack, EntityPlayer player, List tooltip, boolean advanced);

    public boolean isValidArmor(ItemStack stack, EntityEquipmentSlot armorType, Entity entity)
    {
        return net.minecraft.entity.EntityLiving.getSlotForItemStack(stack) == armorType;

    }
