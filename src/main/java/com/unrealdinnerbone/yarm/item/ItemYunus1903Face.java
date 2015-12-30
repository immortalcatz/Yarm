package com.unrealdinnerbone.yarm.item;

import com.unrealdinnerbone.yarm.item.ItemHelpers.ItemTextureBase;
import com.unrealdinnerbone.yarm.item.ItemHelpers.ItemYarm;
import com.unrealdinnerbone.yarm.reference.Reference;

public class ItemYunus1903Face extends ItemTextureBase {
    private final String name = "Yunus1903Face";

    public ItemYunus1903Face()
    {
        super();
        this.setUnlocalizedName(Reference.RE_PREFIX + name);
    }

    @Override
    public String getTextureName(int damage) {
        return Reference.TEXTURE_PATH_ITEM + name;
    }

    @Override
    public int getMaxMeta() {
        return 1;
    }
}
