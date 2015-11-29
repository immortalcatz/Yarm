package com.unrealdinnerbone.yarm.item.Tools;

import com.unrealdinnerbone.yarm.CreativeTab.Tab;
import com.unrealdinnerbone.yarm.reference.Reference;
import net.minecraft.item.ItemSpade;

public class ItemToolOpSpade extends ItemSpade{
    public ItemToolOpSpade(ToolMaterial material) {
        super(material);
        this.setCreativeTab(Tab.Yarm_Tab);
        this.setUnlocalizedName("OpSpade");
        this.setTextureName(Reference.MOD_ID + ":" + "OpSpade");
    }
}
