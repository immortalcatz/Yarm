package com.unrealdinnerbone.yarm.item;

import com.unrealdinnerbone.yarm.item.ItemHelpers.ItemTextureBase;
import com.unrealdinnerbone.yarm.reference.Reference;

public class ItemAntimonyIngot extends ItemTextureBase
{
    private static String name = "AntimonyIngot";

    public ItemAntimonyIngot()
    {
        super();
        this.setUnlocalizedName(Reference.RE_PREFIX + name);
    }
    public static String getName()
    {
        return name;
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
