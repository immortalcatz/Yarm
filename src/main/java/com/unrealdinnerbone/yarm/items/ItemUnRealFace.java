package com.unrealdinnerbone.yarm.items;

import com.unrealdinnerbone.yarm.items.ItemHelpers.ItemYarm;
import com.unrealdinnerbone.yarm.Util.Reference;

public class ItemUnRealFace extends ItemYarm
{
    private static String name = "ItemUnRealFace";

    public ItemUnRealFace()
    {
        super();
        this.setUnlocalizedName(Reference.RE_PREFIX + name);
        this.setFull3D();
    }
    public static String getName() {
        return name;
    }
}
