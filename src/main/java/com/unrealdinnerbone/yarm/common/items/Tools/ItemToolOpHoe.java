package com.unrealdinnerbone.yarm.common.items.Tools;

import com.unrealdinnerbone.yarm.Util.Tab;
import com.unrealdinnerbone.yarm.Util.Reference;
import net.minecraft.item.ItemHoe;

public class ItemToolOpHoe extends ItemHoe {
    private static String name = "ItemToolOpHoe";

    public ItemToolOpHoe(ToolMaterial material) {
        super(material);
        this.setCreativeTab(Tab.Yarm_Tab);
        this.setUnlocalizedName(Reference.RE_PREFIX + name);
    }

    public static String getName() {
        return name;
    }

}
