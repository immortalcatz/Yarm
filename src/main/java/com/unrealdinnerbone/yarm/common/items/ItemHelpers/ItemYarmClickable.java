package com.unrealdinnerbone.yarm.common.items.ItemHelpers;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public abstract class ItemYarmClickable extends ItemYarm
{
    @Override
    @SideOnly(Side.CLIENT)
    public abstract ActionResult<ItemStack> onItemRightClick(ItemStack itemStack, World world, EntityPlayer entityPlayer, EnumHand enumHand);
}
