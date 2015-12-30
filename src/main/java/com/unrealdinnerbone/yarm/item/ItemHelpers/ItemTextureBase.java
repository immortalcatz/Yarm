package com.unrealdinnerbone.yarm.item.ItemHelpers;

import com.unrealdinnerbone.yarm.reference.Reference;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import reborncore.api.IItemTexture;

public abstract class ItemTextureBase extends ItemYarm implements IItemTexture {

    public ItemTextureBase() {
        super();
    }

    @Override
    public String getModID() {
        return Reference.MOD_ID;
    }

}