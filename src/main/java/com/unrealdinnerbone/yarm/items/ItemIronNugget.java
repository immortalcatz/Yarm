package com.unrealdinnerbone.yarm.items;

import com.unrealdinnerbone.yarm.Util.Reference;
import com.unrealdinnerbone.yarm.items.ItemHelpers.ItemYarm;

public class ItemIronNugget extends ItemYarm
{
    private static String name = "ItemIronNugget";

    public ItemIronNugget() {
        super();
        this.setUnlocalizedName(Reference.RE_PREFIX + name);
    }
    public static String getName() {
        return name;
    }
}
