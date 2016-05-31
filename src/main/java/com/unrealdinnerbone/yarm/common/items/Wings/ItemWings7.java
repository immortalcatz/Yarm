package com.unrealdinnerbone.yarm.common.items.Wings;

import com.unrealdinnerbone.yarm.Util.Reference;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;

import java.util.List;

public class ItemWings7 extends YarmItemWing {

    private static String name = "ItemWings7";

    public ItemWings7()
    {
        super();
        this.setUnlocalizedName(Reference.RE_PREFIX + name);
    }

    @Override
    public void addInformation(ItemStack itemStack, EntityPlayer player, List tooltip, boolean advanced)
    {
      tooltip.add("Allows Creative Flight");
      tooltip.add("Fly Speed: 7X");
    }

    public static String getName()
    {
        return name;
    }
}
