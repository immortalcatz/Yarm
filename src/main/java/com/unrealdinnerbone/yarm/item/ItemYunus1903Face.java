package com.unrealdinnerbone.yarm.item;

import com.unrealdinnerbone.yarm.item.ItemHelpers.ItemYarm;
import com.unrealdinnerbone.yarm.reference.Reference;

public class ItemYunus1903Face extends ItemYarm {

    private static String name = "ItemYunus1903Face";

    public ItemYunus1903Face()
    {
        super();
        this.setUnlocalizedName(Reference.RE_PREFIX + name);
    }
    public static String getName() {
        return name;
    }
}
