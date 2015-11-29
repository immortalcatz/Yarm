package com.unrealdinnerbone.yarm.CreativeTab;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

import com.unrealdinnerbone.yarm.init.ModItems;
import com.unrealdinnerbone.yarm.reference.Reference;

public class Tab
{
    public static final CreativeTabs Yarm_Tab = new CreativeTabs(Reference.MOD_ID)
    {
        @Override
        public Item getTabIconItem()
        {
            return ModItems.UnRealFace;

        }

        @Override
    public String getTranslatedTabLabel()
        {
                return "Yarm";
        }
    };
}
