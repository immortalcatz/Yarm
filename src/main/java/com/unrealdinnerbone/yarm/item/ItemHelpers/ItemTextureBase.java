package com.unrealdinnerbone.yarm.item.ItemHelpers;

import com.unrealdinnerbone.yarm.reference.Reference;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import reborncore.api.IItemTexture;

public abstract class ItemTextureBase extends ItemYarm implements IItemTexture {
    @Override
    public String getModID() {
        return Reference.MOD_ID;
    }

    @Override
    public ModelResourceLocation getModel(ItemStack stack, EntityPlayer player, int useRemaining) {
        return new ModelResourceLocation(Reference.MOD_ID + ":" + stack.getItem().getUnlocalizedName(stack).substring(5), "inventory");
    }
}