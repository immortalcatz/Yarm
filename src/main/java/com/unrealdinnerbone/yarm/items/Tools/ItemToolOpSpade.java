package com.unrealdinnerbone.yarm.items.Tools;

import com.unrealdinnerbone.yarm.Util.Tab;
import com.unrealdinnerbone.yarm.Util.Reference;
import net.minecraft.item.ItemSpade;

public class ItemToolOpSpade extends ItemSpade
{
    private static String name = "ItemToolOpSpade";

    public ItemToolOpSpade(ToolMaterial material) {
        super(material);
        this.setCreativeTab(Tab.Yarm_Tab);
        this.setUnlocalizedName(Reference.RE_PREFIX + name);
    }
    public static String getName() {
        return name;
    }
}
