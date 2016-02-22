package com.unrealdinnerbone.yarm.items;

import com.unrealdinnerbone.yarm.items.ItemHelpers.ItemYarm;
import com.unrealdinnerbone.yarm.Util.Reference;
import net.minecraft.item.ItemStack;

public class ItemAntimonyIngot extends ItemYarm
{
    private static String name = "ItemAntimonyIngot";

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
