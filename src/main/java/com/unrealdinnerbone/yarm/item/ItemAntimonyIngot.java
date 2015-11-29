package com.unrealdinnerbone.yarm.item;

import com.unrealdinnerbone.yarm.reference.Reference;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ItemAntimonyIngot extends ItemYarm
{
    private static String name = "AntimonyIngot";

    public ItemAntimonyIngot()
    {
        super();
        this.setUnlocalizedName(name);
    }
    public static String getName()
    {
        return name;
    }

    @Override
    public Item setUnlocalizedName(String unlocalizedName) {
        return super.setUnlocalizedName(Reference.RE_PREFIX + unlocalizedName);
    }
}
