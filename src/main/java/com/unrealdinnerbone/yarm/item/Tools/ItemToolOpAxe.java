package com.unrealdinnerbone.yarm.item.Tools;

import com.unrealdinnerbone.yarm.CreativeTab.Tab;
import net.minecraft.item.ItemAxe;

public class ItemToolOpAxe extends ItemAxe {

    public ItemToolOpAxe(ToolMaterial material) {
        super(material);
        this.setCreativeTab(Tab.Yarm_Tab);
        this.setUnlocalizedName("OpAxe");
        this.setTextureName("yarm" + ":" + "OpAxe");
    }
}
