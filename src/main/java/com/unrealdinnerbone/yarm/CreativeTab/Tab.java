package com.unrealdinnerbone.yarm.CreativeTab;

import com.unrealdinnerbone.yarm.Util.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

public class Tab
{
    public static final CreativeTabs Yarm_Tab = new CreativeTabs(Reference.MOD_ID)
    {
        @Override
        public Item getTabIconItem()
        {
            // return ModItems.ItemUnRealFace;
            return Items.apple;

        }

        @Override
    public String getTranslatedTabLabel()
        {
                return "Yarm";
        }
    };
}
