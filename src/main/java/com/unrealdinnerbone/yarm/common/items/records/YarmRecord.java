package com.unrealdinnerbone.yarm.common.items.records;

import com.unrealdinnerbone.yarm.Util.Reference;
import com.unrealdinnerbone.yarm.Util.Sounds;
import com.unrealdinnerbone.yarm.Util.Tab;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemRecord;
import net.minecraft.item.ItemStack;

import java.util.List;

public class YarmRecord extends ItemRecord {


    private static String name = "record_rickroll";

    public YarmRecord()
    {
        super("RickRoll", Sounds.RickRoll);
        this.setCreativeTab(Tab.Yarm_Tab);
        this.setUnlocalizedName(Reference.itemBlockId + name);
    }

    @Override
    public void addInformation(ItemStack itemStack, EntityPlayer player, List tooltip, boolean advanced)
    {

    }

    public static String getName()
    {
        return name;
    }
}
