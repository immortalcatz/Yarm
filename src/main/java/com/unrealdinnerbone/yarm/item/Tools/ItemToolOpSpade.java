package com.unrealdinnerbone.yarm.item.Tools;

import com.unrealdinnerbone.yarm.CreativeTab.Tab;
import net.minecraft.item.ItemSpade;

public class ItemToolOpSpade extends ItemSpade{
    public ItemToolOpSpade(ToolMaterial material) {
        super(material);
        this.setCreativeTab(Tab.Yarm_Tab);
        this.setUnlocalizedName("OpSpade");
        this.setTextureName("yarm" + ":" + "OpSpade");
    }
}
