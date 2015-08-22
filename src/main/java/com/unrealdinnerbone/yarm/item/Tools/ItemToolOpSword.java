package com.unrealdinnerbone.yarm.item.Tools;

import com.unrealdinnerbone.yarm.CreativeTab.Tab;
import com.unrealdinnerbone.yarm.reference.Reference;
import net.minecraft.item.ItemSword;

public class ItemToolOpSword extends ItemSword {
    public ItemToolOpSword(ToolMaterial material) {
        super(material);
        this.setCreativeTab(Tab.Yarm_Tab);
        this.setUnlocalizedName("OpSword");
        this.setTextureName(Reference.MOD_ID + ":" + "OpSword");
    }
}
