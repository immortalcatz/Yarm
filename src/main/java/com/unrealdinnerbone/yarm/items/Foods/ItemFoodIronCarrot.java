package com.unrealdinnerbone.yarm.items.Foods;

import com.unrealdinnerbone.yarm.Util.Reference;
import net.minecraft.item.ItemFood;

/**
 * Created by UnRealDinnerbone on 4/14/2016.
 */
public class ItemFoodIronCarrot extends ItemFood {

    private static String name = "ItemFoodIronCarrot";

    public ItemFoodIronCarrot(int healamount, float saturation, boolean wolffood)
    {
        super(healamount, saturation, wolffood);
        this.setUnlocalizedName(Reference.RE_PREFIX + name);
        this.setAlwaysEdible();
    }
    public static String getName()
    {
        return name;
    }
}
