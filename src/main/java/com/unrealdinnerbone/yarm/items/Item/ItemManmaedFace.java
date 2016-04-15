package com.unrealdinnerbone.yarm.items.Item;

import com.unrealdinnerbone.yarm.items.ItemHelpers.ItemYarm;
import com.unrealdinnerbone.yarm.Util.Reference;

public class ItemManmaedFace extends ItemYarm
{
    private static String name = "ItemManmaedFace";

        public ItemManmaedFace() {
            super();
            this.setUnlocalizedName(Reference.RE_PREFIX + name);
        }
    public static String getName() {
        return name;
    }
}
