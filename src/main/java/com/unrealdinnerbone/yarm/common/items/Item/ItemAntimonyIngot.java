package com.unrealdinnerbone.yarm.common.items.Item;

import com.unrealdinnerbone.yarm.common.items.ItemHelpers.ItemYarm;
import com.unrealdinnerbone.yarm.Util.Reference;

public class ItemAntimonyIngot extends ItemYarm
{
    private static String name = "antimony_ingot";

    public ItemAntimonyIngot()
    {
        super();
        this.setUnlocalizedName(Reference.RE_PREFIX + name);
    }
    public static String getName()
    {
        return name;
    }
}
