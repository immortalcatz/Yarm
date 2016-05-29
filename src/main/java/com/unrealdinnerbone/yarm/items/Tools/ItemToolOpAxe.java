package com.unrealdinnerbone.yarm.items.Tools;

import com.unrealdinnerbone.yarm.Util.Tab;
import com.unrealdinnerbone.yarm.Util.Reference;
import com.unrealdinnerbone.yarm.Util.ToolTypes;
import net.minecraft.item.ItemAxe;

public class ItemToolOpAxe extends ItemAxe {

    private static String name = "ItemToolOpAxe";

    public ItemToolOpAxe() {

        super(ToolMaterial.DIAMOND);
        this.setCreativeTab(Tab.Yarm_Tab);
        this.setUnlocalizedName(Reference.RE_PREFIX + name);
    }

    public static String getName() {
        return name;
    }
}