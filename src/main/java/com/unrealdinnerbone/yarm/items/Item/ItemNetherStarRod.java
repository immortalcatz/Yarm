package com.unrealdinnerbone.yarm.items.Item;

import com.unrealdinnerbone.yarm.items.ItemHelpers.ItemYarm;
import com.unrealdinnerbone.yarm.Util.Reference;
import net.minecraft.server.MinecraftServer;
import net.minecraftforge.fml.common.FMLCommonHandler;


public class ItemNetherStarRod extends ItemYarm {

    public static MinecraftServer getServer() {

        return FMLCommonHandler.instance().getMinecraftServerInstance();
    }

    private static String name = "ItemNetherStarRod";

    public ItemNetherStarRod() {
        super();
        this.setUnlocalizedName(Reference.RE_PREFIX + name);
    }

    public static String getName() {
        return name;
    }

}
