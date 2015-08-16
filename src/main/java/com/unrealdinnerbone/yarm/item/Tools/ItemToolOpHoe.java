package com.unrealdinnerbone.yarm.item.Tools;

import com.unrealdinnerbone.yarm.CreativeTab.Tab;
import net.minecraft.item.ItemHoe;

public class ItemToolOpHoe extends ItemHoe{
    public ItemToolOpHoe(ToolMaterial material) {
        super(material);
        this.setCreativeTab(Tab.Yarm_Tab);
        this.setUnlocalizedName("OpHoe");
        this.setTextureName("yarm" + ":" + "OpHoe");
    }
}
