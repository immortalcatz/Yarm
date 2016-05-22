package com.unrealdinnerbone.yarm.CreativeTab;

import com.unrealdinnerbone.yarm.Util.LangHelper;
import com.unrealdinnerbone.yarm.Util.Reference;
import com.unrealdinnerbone.yarm.init.ModItems;
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
        public boolean hasSearchBar() {
            return true;
        }
    };

}
