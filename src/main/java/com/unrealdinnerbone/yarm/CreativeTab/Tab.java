package com.unrealdinnerbone.yarm.CreativeTab;

import com.unrealdinnerbone.yarm.Util.Reference;
import com.unrealdinnerbone.yarm.init.ModItems;
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
            return ModItems.ItemUnRealFace;

        }

        @Override
    public String getTranslatedTabLabel()
        {
            return "Yarm Tab";
//            return StatCollector.translateToLocal("creativetab.maintab.name");
        }
    };
}
