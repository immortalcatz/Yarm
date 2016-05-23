package com.unrealdinnerbone.yarm.init.Recpies;

import com.unrealdinnerbone.yarm.Util.Reference;
import com.unrealdinnerbone.yarm.init.ModItems;
import net.darkhax.bookshelf.lib.util.BannerUtils;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class BannerMaker {

    public static void initCraftingBanners () {

        BannerUtils.addCraftingPattern(Reference.RE_PREFIX_ + "UnRealFace", "UnRealFace", new ItemStack(ModItems.Item_UnRealFace));
        BannerUtils.addCraftingPattern(Reference.RE_PREFIX_ + "Elytra", "Elytra", new ItemStack(Items.ELYTRA));
        BannerUtils.addCraftingPattern(Reference.RE_PREFIX_ + "Pearcell", "Pearcell", new ItemStack(Items.BEETROOT));
        BannerUtils.addCraftingPattern(Reference.RE_PREFIX_ + "Test", "Test", new ItemStack(Items.APPLE));
    }

}