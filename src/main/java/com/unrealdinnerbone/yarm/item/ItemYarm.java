package com.unrealdinnerbone.yarm.item;

import com.unrealdinnerbone.yarm.CreativeTab.Tab;
import com.unrealdinnerbone.yarm.reference.Reference;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.world.WorldEvent;

public class ItemYarm extends Item
{
    public ItemYarm()
    {
        super();
        this.setCreativeTab(Tab.Yarm_Tab);
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
