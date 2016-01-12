package com.unrealdinnerbone.yarm.item.ItemHelpers;

import com.unrealdinnerbone.yarm.reference.Reference;
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