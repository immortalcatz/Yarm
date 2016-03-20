package com.unrealdinnerbone.yarm.init.Recpies;

import com.unrealdinnerbone.yarm.Util.Reference;
import com.unrealdinnerbone.yarm.init.ModItems;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntityBanner;
import net.minecraftforge.common.util.EnumHelper;

public class BannerMaker {

    public static void initCraftingBanners () {

        addCraftingPattern("UnRealFace", new ItemStack(ModItems.Item_UnRealFace));
    }

    public static TileEntityBanner.EnumBannerPattern addBasicPattern (String name, String id) {

        Class<?>[] paramTypes = { String.class, String.class };
        Object[] paramValues = { name, id };
        return EnumHelper.addEnum(TileEntityBanner.EnumBannerPattern.class, name.toUpperCase(), paramTypes, paramValues);
    }

    public static TileEntityBanner.EnumBannerPattern addCraftingPattern (String name, ItemStack craftingStack) {

        Class<?>[] paramTypes = { String.class, String.class, ItemStack.class };
        Object[] paramValues = { Reference.MOD_ID + "_" + name, Reference.MOD_ID + "." + name, craftingStack };
        return EnumHelper.addEnum(TileEntityBanner.EnumBannerPattern.class, name.toUpperCase(), paramTypes, paramValues);
    }

    public static TileEntityBanner.EnumBannerPattern addDyePattern (String name, String id, String craftingTop, String craftingMid, String craftingBot) {

        Class<?>[] paramTypes = { String.class, String.class, String.class, String.class, String.class };
        Object[] paramValues = { name, id, craftingTop, craftingMid, craftingBot };
        return EnumHelper.addEnum(TileEntityBanner.EnumBannerPattern.class, name.toUpperCase(), paramTypes, paramValues);
    }
}