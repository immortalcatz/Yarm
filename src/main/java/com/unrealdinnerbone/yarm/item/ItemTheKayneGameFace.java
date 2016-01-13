package com.unrealdinnerbone.yarm.item;

import com.unrealdinnerbone.yarm.item.ItemHelpers.ItemYarm;
import com.unrealdinnerbone.yarm.reference.Reference;

public class ItemTheKayneGameFace extends ItemYarm
{
    private static String name = "ItemTheKayneGameFace";

    public ItemTheKayneGameFace()
    {
        super();
        this.setUnlocalizedName(Reference.RE_PREFIX + name);

    }
    public static String getName() {
        return name;
    }
}
