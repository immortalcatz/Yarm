package com.unrealdinnerbone.yarm.common.items.Tools;

import com.unrealdinnerbone.yarm.Util.Tab;
import com.unrealdinnerbone.yarm.Util.Reference;
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