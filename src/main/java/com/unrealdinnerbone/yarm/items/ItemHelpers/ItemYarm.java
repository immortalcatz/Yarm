package com.unrealdinnerbone.yarm.items.ItemHelpers;

import com.unrealdinnerbone.yarm.CreativeTab.Tab;
import net.minecraft.item.Item;

public class ItemYarm extends Item {
    public ItemYarm()
    {
        super();
        this.setCreativeTab(Tab.Yarm_Tab);
        this.setFull3D();
    }

   /* @Override
    public String getUnlocalizedName()
    {
        return String.format("item.%s%s", CompactReference.MOD_ID.toLowerCase() + ":", getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
    }

    @Override
    public String getUnlocalizedName(ItemStack itemStack)
    {
        return String.format("item.%s%s", CompactReference.MOD_ID.toLowerCase() + ":", getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IIconRegister iconRegister)
    {
        itemIcon = iconRegister.registerIcon(this.getUnlocalizedName().substring(this.getUnlocalizedName().indexOf(".") + 1));
    }

    protected String getUnwrappedUnlocalizedName(String unlocalizedName)
    {
        return unlocalizedName.substring(unlocalizedName.indexOf(".") + 1);
    }*/
}
