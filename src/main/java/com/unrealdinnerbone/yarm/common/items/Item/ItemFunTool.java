package com.unrealdinnerbone.yarm.common.items.Item;

import com.unrealdinnerbone.yarm.Util.Reference;
import com.unrealdinnerbone.yarm.common.items.ItemHelpers.ItemYarm;

public class ItemFunTool extends ItemYarm
{
    private static String name = "ItemFunTool";

    public ItemFunTool() {
        super();
        this.setUnlocalizedName(Reference.RE_PREFIX + name);
    }
    public static String getName() {
        return name;
    }
}
