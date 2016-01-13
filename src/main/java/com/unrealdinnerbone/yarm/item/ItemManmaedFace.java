package com.unrealdinnerbone.yarm.item;

import com.unrealdinnerbone.yarm.item.ItemHelpers.ItemYarm;
import com.unrealdinnerbone.yarm.reference.Reference;

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
