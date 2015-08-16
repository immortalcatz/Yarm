package com.unrealdinnerbone.yarm.item.Tools;

import com.unrealdinnerbone.yarm.CreativeTab.Tab;
import net.minecraft.item.ItemPickaxe;

public class ItemToolOpPick extends ItemPickaxe {
    public ItemToolOpPick(ToolMaterial material) {
        super(material);
        this.setCreativeTab(Tab.Yarm_Tab);
        this.setUnlocalizedName("OpPick");
        this.setTextureName("yarm" + ":" + "OpPick");
    }


}
