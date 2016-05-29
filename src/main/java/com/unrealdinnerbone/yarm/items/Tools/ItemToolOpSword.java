package com.unrealdinnerbone.yarm.items.Tools;

import com.unrealdinnerbone.yarm.Util.Tab;
import com.unrealdinnerbone.yarm.Util.Reference;
import net.minecraft.item.ItemSword;

public class ItemToolOpSword extends ItemSword
{
    private static String name = "ItemToolOpSword";

    public ItemToolOpSword(ToolMaterial material) {
        super(material);
        this.setCreativeTab(Tab.Yarm_Tab);
        this.setUnlocalizedName(Reference.RE_PREFIX + name);
    }
    public static String getName() {
        return name;
    }
}
