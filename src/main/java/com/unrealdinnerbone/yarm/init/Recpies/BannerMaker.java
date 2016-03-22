package com.unrealdinnerbone.yarm.init.Recpies;

import com.unrealdinnerbone.yarm.Util.BannerUtils;
import com.unrealdinnerbone.yarm.init.ModItems;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class BannerMaker {

    public static void initCraftingBanners () {

        BannerUtils.addCraftingPattern("UnRealFace", new ItemStack(ModItems.Item_UnRealFace));
        BannerUtils.addCraftingPattern("Elytra", new ItemStack(Items.elytra));
        BannerUtils.addCraftingPattern("Pearcell", new ItemStack(Items.beetroot));
    }

}