package com.unrealdinnerbone.yarm.item;

import com.unrealdinnerbone.yarm.item.ItemHelpers.ItemYarm;
import com.unrealdinnerbone.yarm.reference.Reference;

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
