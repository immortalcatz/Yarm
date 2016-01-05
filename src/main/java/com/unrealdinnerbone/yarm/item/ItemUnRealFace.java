package com.unrealdinnerbone.yarm.item;

import com.unrealdinnerbone.yarm.item.ItemHelpers.ItemYarm;
import com.unrealdinnerbone.yarm.reference.Reference;

public class ItemUnRealFace extends ItemYarm
{
    private final String name = "UnRealFace";

    public ItemUnRealFace()
    {
        super();
        this.setUnlocalizedName(Reference.RE_PREFIX + name);
        this.setFull3D();


    }
}
