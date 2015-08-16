package com.unrealdinnerbone.yarm.init;

import com.unrealdinnerbone.yarm.Util.LogHelper;
import com.unrealdinnerbone.yarm.item.*;
import com.unrealdinnerbone.yarm.item.Tools.*;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.*;
import net.minecraftforge.common.util.EnumHelper;

public class ModItems
    {
    public static final Item.ToolMaterial OpTools = EnumHelper.addToolMaterial("OpTools", 10, -1, 100.0F, 25.0F, 100);

    public static final ItemYarm UnRealFace = new ItemUnRealFace();
    public static final ItemYarm ManmedFace = new ItemManmaedFace();
    public static final ItemYarm KyaneFace = new ItemTheKayneGameFace();
    public static final ItemYarm YunusFace = new ItemYunus1903Face();
    public static final ItemYarm AntimonyIngot = new ItemAntimonyIngot();
    public static final ItemAxe ItemToolOpAxe = new ItemToolOpAxe(OpTools);
    public static final ItemHoe ItemToolOpHoe = new ItemToolOpHoe(OpTools);
    public static final ItemPickaxe ItemToolOpPick = new ItemToolOpPick(OpTools);
    public static final ItemSpade ItemToolOpSpade = new ItemToolOpSpade(OpTools);
    public static final ItemSword ItemToolOpSword = new ItemToolOpSword(OpTools);


    public static void init()
    {

        GameRegistry.registerItem(UnRealFace, "ItemUnRealFace");
        GameRegistry.registerItem(ManmedFace, "ItemManmedFace");
        GameRegistry.registerItem(KyaneFace, "ItemTheKayneGameFace");
        GameRegistry.registerItem(YunusFace, "ItemYunus1903Face");
        GameRegistry.registerItem(AntimonyIngot, "AntimonyIngot");
        GameRegistry.registerItem(ItemToolOpAxe, "ItemOpAxe");
        GameRegistry.registerItem(ItemToolOpHoe, "ItemOpHoe");
        GameRegistry.registerItem(ItemToolOpPick, "ItemOpPick");
        GameRegistry.registerItem(ItemToolOpSpade, "ItemOpSpade");
        GameRegistry.registerItem(ItemToolOpSword, "ItemOpSword");
    }

}
