package com.unrealdinnerbone.yarm.common.items.Foods;

import com.unrealdinnerbone.yarm.Util.Tab;
import com.unrealdinnerbone.yarm.Util.Reference;
import com.unrealdinnerbone.yarm.common.items.ItemHelpers.ItemYarmFood;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemFoodIronCarrot extends ItemYarmFood {

    private static String name = "iron_carrot";

    public ItemFoodIronCarrot(int healamount, float saturation, boolean wolffood)
    {
        super(healamount, saturation, wolffood);
        this.setUnlocalizedName(Reference.RE_PREFIX + name);
        this.setAlwaysEdible();
        this.setCreativeTab(Tab.Yarm_Tab);
    }

    @Override
    protected void onFoodEaten (ItemStack par1ItemStack, World world, EntityPlayer player) {

    }

    public static String getName()
    {
        return name;
    }
}
