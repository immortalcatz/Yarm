package com.unrealdinnerbone.yarm.init;

import com.unrealdinnerbone.yarm.Util.LogHelper;
import com.unrealdinnerbone.yarm.item.*;
import com.unrealdinnerbone.yarm.item.ItemHelpers.ItemYarm;
import com.unrealdinnerbone.yarm.item.Tools.*;
import net.minecraft.item.*;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.common.util.EnumHelper;

public class ModItems
    {
    public static final Item.ToolMaterial OpTools = EnumHelper.addToolMaterial("OpTools", 10, -1, 100.0F, 25.0F, 100);

    public static final ItemYarm ItemUnRealFace = new ItemUnRealFace();
    public static final ItemYarm ItemManmedFace = new ItemManmaedFace();
    public static final ItemYarm ItemKyaneFace = new ItemTheKayneGameFace();
    public static final ItemYarm ItemYunusFace = new ItemYunus1903Face();
    public static final ItemYarm ItemAntimonyIngot = new ItemAntimonyIngot();
    public static final ItemYarm ItemNetherStarRod = new ItemNetherStarRod();
    public static final ItemAxe ItemToolOpAxe = new ItemToolOpAxe(OpTools);
    public static final ItemHoe ItemToolOpHoe = new ItemToolOpHoe(OpTools);
    public static final ItemPickaxe ItemToolOpPick = new ItemToolOpPick(OpTools);
    public static final ItemSpade ItemToolOpSpade = new ItemToolOpSpade(OpTools);
    public static final ItemSword ItemToolOpSword = new ItemToolOpSword(OpTools);


    public static void init()
    {

        GameRegistry.registerItem(ItemUnRealFace, com.unrealdinnerbone.yarm.item.ItemUnRealFace.getName());
        GameRegistry.registerItem(ItemManmedFace, com.unrealdinnerbone.yarm.item.ItemManmaedFace.getName());
        GameRegistry.registerItem(ItemKyaneFace, com.unrealdinnerbone.yarm.item.ItemTheKayneGameFace.getName());
        GameRegistry.registerItem(ItemYunusFace, com.unrealdinnerbone.yarm.item.ItemYunus1903Face.getName());
        GameRegistry.registerItem(ItemAntimonyIngot, com.unrealdinnerbone.yarm.item.ItemAntimonyIngot.getName());
        GameRegistry.registerItem(ItemNetherStarRod, com.unrealdinnerbone.yarm.item.ItemNetherStarRod.getName());
        GameRegistry.registerItem(ItemToolOpAxe, com.unrealdinnerbone.yarm.item.Tools.ItemToolOpAxe.getName());
        GameRegistry.registerItem(ItemToolOpHoe, com.unrealdinnerbone.yarm.item.Tools.ItemToolOpHoe.getName());
        GameRegistry.registerItem(ItemToolOpSpade, com.unrealdinnerbone.yarm.item.Tools.ItemToolOpSpade.getName());
        GameRegistry.registerItem(ItemToolOpPick, com.unrealdinnerbone.yarm.item.Tools.ItemToolOpPick.getName());
        GameRegistry.registerItem(ItemToolOpSword, com.unrealdinnerbone.yarm.item.Tools.ItemToolOpSword.getName());
        LogHelper.info("Loaded Items");
    }

}
