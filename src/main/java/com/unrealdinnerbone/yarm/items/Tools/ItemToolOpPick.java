package com.unrealdinnerbone.yarm.items.Tools;

import com.unrealdinnerbone.yarm.CreativeTab.Tab;
import com.unrealdinnerbone.yarm.Util.Reference;
import net.minecraft.item.ItemPickaxe;

public class ItemToolOpPick extends ItemPickaxe
{
    private static String name = "ItemToolOpPick";

    public ItemToolOpPick(ToolMaterial material) {
        super(material);
        this.setCreativeTab(Tab.Yarm_Tab);
        this.setUnlocalizedName(Reference.RE_PREFIX + name);
    }
    public static String getName() {
        return name;
    }
}
