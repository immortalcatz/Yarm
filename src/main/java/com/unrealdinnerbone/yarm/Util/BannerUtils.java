package com.unrealdinnerbone.yarm.Util;

import net.minecraft.item.ItemStack;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraft.tileentity.TileEntityBanner.EnumBannerPattern;

public class BannerUtils
{
    public static EnumBannerPattern addBasicPattern (String name, String id) {

        Class<?>[] paramTypes = { String.class, String.class };
        Object[] paramValues = { name, id };
        return EnumHelper.addEnum(EnumBannerPattern.class, name.toUpperCase(), paramTypes, paramValues);
    }

    public static EnumBannerPattern addCraftingPattern (String name, ItemStack craftingStack) {

        Class<?>[] paramTypes = { String.class, String.class, ItemStack.class };
        Object[] paramValues = { LangHelper.Banner.translateMessage(name), LangHelper.Banner.translateMessage(name), craftingStack };
        return EnumHelper.addEnum(EnumBannerPattern.class, name.toUpperCase(), paramTypes, paramValues);
    }

    public static EnumBannerPattern addDyePattern (String name, String id, String craftingTop, String craftingMid, String craftingBot) {

        Class<?>[] paramTypes = { String.class, String.class, String.class, String.class, String.class };
        Object[] paramValues = { name, id, craftingTop, craftingMid, craftingBot };
        return EnumHelper.addEnum(EnumBannerPattern.class, name.toUpperCase(), paramTypes, paramValues);
    }
}