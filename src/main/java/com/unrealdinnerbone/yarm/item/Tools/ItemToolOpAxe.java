package com.unrealdinnerbone.yarm.item.Tools;

import com.unrealdinnerbone.yarm.CreativeTab.Tab;
import com.unrealdinnerbone.yarm.reference.Reference;
import net.minecraft.item.Item;
import net.minecraft.item.ItemAxe;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ItemToolOpAxe extends ItemAxe {

    private static String name = "ToolOpAxe";

    public ItemToolOpAxe(ToolMaterial material) {

        super(material);
        this.setCreativeTab(Tab.Yarm_Tab);
        setUnlocalizedName(Reference.MOD_ID + "_" + name);
    }

    public static String getName() {
        return name;
    }

}