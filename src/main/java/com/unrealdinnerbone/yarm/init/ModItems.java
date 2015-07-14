package com.unrealdinnerbone.yarm.init;

import com.unrealdinnerbone.yarm.item.*;
import cpw.mods.fml.common.registry.GameRegistry;

public class ModItems
    {

    public static final ItemYarm UnRealFace = new ItemUnRealFace();
    public static final ItemYarm ManmedFace = new ItemManmaedFace();
    public static final ItemYarm KyaneFace = new ItemTheKayneGameFace();
    public static final ItemYarm YunusFace = new ItemYunus1903Face();
    public static final ItemYarm AntimonyIgont = new ItemAntimonyIngot();


    public static void init()
    {

        GameRegistry.registerItem(UnRealFace, "ItemUnRealFace");
        GameRegistry.registerItem(ManmedFace, "ItemManmedFace");
        GameRegistry.registerItem(KyaneFace, "ItemTheKayneGameFace");
        GameRegistry.registerItem(YunusFace, "ItemYunus1903Face");
        GameRegistry.registerItem(AntimonyIgont, "AntimonyIngot");

    }

}
