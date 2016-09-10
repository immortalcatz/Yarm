package com.unrealdinnerbone.yarm.Util;

import com.unrealdinnerbone.yarm.common.init.ModItems;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class Tab
{
    public static final CreativeTabs Yarm_Tab = new CreativeTabs(Reference.MOD_ID)
    {
        @Override
        public Item getTabIconItem()
        {
            return ModItems.Item_UnRealFace;
        }

        @Override
        public String getTranslatedTabLabel()
        {
            return LangHelper.TAB.translateMessage("YarmTab");
        }
        @Override
        public boolean hasSearchBar()
        {
            return true;
        }
    };

}
