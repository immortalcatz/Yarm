package com.unrealdinnerbone.yarm.item;

import com.unrealdinnerbone.yarm.reference.Reference;

public class ItemManmaedFace extends ItemYarm
{
    private final String name = "ManmaedFace";

        public ItemManmaedFace() {
            super();
            this.setUnlocalizedName(Reference.MOD_ID + "_" + name);
        }
}
