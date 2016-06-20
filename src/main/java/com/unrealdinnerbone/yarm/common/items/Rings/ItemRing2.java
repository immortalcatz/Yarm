package com.unrealdinnerbone.yarm.common.items.Rings;

import com.unrealdinnerbone.yarm.Util.Reference;
import com.unrealdinnerbone.yarm.common.items.ItemHelpers.ItemYarm;

public class ItemRing2 extends ItemYarmRing
{
    private static String name = "ItemRing2";

    public ItemRing2()
    {
        super();
        this.setUnlocalizedName(Reference.RE_PREFIX + name);
    }
    public static String getName()
    {
        return name;
    }
}
