package com.unrealdinnerbone.yarm.common.init;

import com.unrealdinnerbone.yarm.Util.LogHelper;
import com.unrealdinnerbone.yarm.Util.OreDictionaryNames;
import com.unrealdinnerbone.yarm.Util.RegisterHelper;
import com.unrealdinnerbone.yarm.Util.ToolTypes;
import com.unrealdinnerbone.yarm.common.items.Foods.ItemFoodIronApple;
import com.unrealdinnerbone.yarm.common.items.Foods.ItemFoodIronCarrot;
import com.unrealdinnerbone.yarm.common.items.Item.*;
import com.unrealdinnerbone.yarm.common.items.ItemHelpers.ItemYarm;
import com.unrealdinnerbone.yarm.common.items.ItemHelpers.ItemYarmFood;
import com.unrealdinnerbone.yarm.common.items.Rings.*;
import com.unrealdinnerbone.yarm.common.items.Tools.*;
import com.unrealdinnerbone.yarm.common.items.Wings.*;
import net.minecraft.item.*;

public class ModItems
{
    public static final ItemYarm Item_UnRealFace = new ItemUnRealFace();
    public static final ItemYarm Item_ManmedFace = new ItemManmaedFace();
    public static final ItemYarm Item_KyaneFace = new ItemTheKayneGameFace();
    public static final ItemYarm Item_YunusFace = new ItemYunus1903Face();
    public static final ItemYarm Item_AntimonyIngot = new ItemAntimonyIngot();
    public static final ItemYarm Item_NetherStarRod = new ItemNetherStarRod();
    public static final ItemYarm Item_IronNugget = new ItemIronNugget();
    public static final ItemAxe ItemTool_OpAxe = new ItemToolOpAxe();
    public static final ItemHoe ItemTool_OpHoe = new ItemToolOpHoe(ToolTypes.OpToolsAxe);
    public static final ItemPickaxe ItemTool_OpPick = new ItemToolOpPick(ToolTypes.OpToolsPic);
    public static final ItemSpade ItemTool_OpSpade = new ItemToolOpSpade(ToolTypes.OpToolsSpade);
    public static final ItemSword ItemTool_OpSword = new ItemToolOpSword(ToolTypes.OpToolsSword);
    public static final ItemYarmFood ItemFood_IronApple = new ItemFoodIronApple(10, 10.0f, false);
    public static final ItemYarmFood ItemFood_IronCarrot = new ItemFoodIronCarrot(10, 20.0f, false);
    public static final YarmItemWing ITEM_WING_1 = new ItemWings1();
    public static final YarmItemWing ITEM_WING_2 = new ItemWings2();
    public static final YarmItemWing ITEM_WING_3 = new ItemWings3();
    public static final YarmItemWing ITEM_WING_4 = new ItemWings4();
    public static final YarmItemWing ITEM_WING_5 = new ItemWings4();
    public static final YarmItemWing ITEM_WING_6 = new ItemWings6();
    public static final YarmItemWing ITEM_WING_7 = new ItemWings7();
    public static final YarmItemWing ITEM_WING_8 = new ItemWings8();
    public static final ItemYarmRing ITEM_RING_1 = new ItemRing1();
    public static final ItemYarmRing ITEM_RING_2 = new ItemRing2();
    public static final ItemYarmRing ITEM_RING_3 = new ItemRing3();
    public static final ItemYarmRing ITEM_RING_4 = new ItemRing4();
    public static final ItemYarmRing ITEM_RING_5 = new ItemRing5();
    public static final ItemYarmRing ITEM_RING_6 = new ItemRing6();
    public static final ItemYarmRing ITEM_RING_7 = new ItemRing7();
    public static final ItemYarmRing ITEM_RING_8 = new ItemRing8();

    public static void init()
    {
        LogHelper.info("Starting item Registration");
        RegisterHelper.RegisterItem(Item_UnRealFace, ItemUnRealFace.getName(), OreDictionaryNames.Item_UnRealFace);
        RegisterHelper.RegisterItem(Item_ManmedFace, ItemManmaedFace.getName(), OreDictionaryNames.Item_ManmaedFace);
        RegisterHelper.RegisterItem(Item_KyaneFace, ItemTheKayneGameFace.getName(), OreDictionaryNames.Item_KyaneFace);
        RegisterHelper.RegisterItem(Item_YunusFace, ItemYunus1903Face.getName(), OreDictionaryNames.Item_YunusFace);
        RegisterHelper.RegisterItem(Item_AntimonyIngot, ItemAntimonyIngot.getName(), OreDictionaryNames.Item_AntimonyIngot);
        RegisterHelper.RegisterItem(Item_NetherStarRod, ItemNetherStarRod.getName(), OreDictionaryNames.Item_NetherStarRod);
        RegisterHelper.RegisterItem(ItemTool_OpAxe, ItemToolOpAxe.getName(), OreDictionaryNames.Item_Tool_OpAxe);
        RegisterHelper.RegisterItem(ItemTool_OpHoe, ItemToolOpHoe.getName(), OreDictionaryNames.Item_Tool_OpHoe);
        RegisterHelper.RegisterItem(ItemTool_OpSpade, ItemToolOpSpade.getName(), OreDictionaryNames.Item_Tool_OpSpade);
        RegisterHelper.RegisterItem(ItemTool_OpPick, ItemToolOpPick.getName(), OreDictionaryNames.Item_Tool_OpPic);
        RegisterHelper.RegisterItem(ItemTool_OpSword,ItemToolOpSword.getName(), OreDictionaryNames.Item_Tool_OpSword);
        RegisterHelper.RegisterItem(Item_IronNugget, ItemIronNugget.getName(), OreDictionaryNames.Item_IronNugget);
        RegisterHelper.RegisterItem(ItemFood_IronApple, ItemFoodIronApple.getName(), OreDictionaryNames.Food_IronApple);
        RegisterHelper.RegisterItem(ItemFood_IronCarrot, ItemFoodIronCarrot.getName(), OreDictionaryNames.Food_IronCarrot);
        RegisterHelper.RegisterItem(ITEM_WING_1, ItemWings1.getName());
        RegisterHelper.RegisterItem(ITEM_WING_2, ItemWings2.getName());
        RegisterHelper.RegisterItem(ITEM_WING_3, ItemWings3.getName());
        RegisterHelper.RegisterItem(ITEM_WING_4, ItemWings4.getName());
        RegisterHelper.RegisterItem(ITEM_WING_5, ItemWings5.getName());
        RegisterHelper.RegisterItem(ITEM_WING_6, ItemWings6.getName());
        RegisterHelper.RegisterItem(ITEM_WING_7, ItemWings7.getName());
        RegisterHelper.RegisterItem(ITEM_WING_8, ItemWings8.getName());
        RegisterHelper.RegisterItem(ITEM_RING_1, ItemRing1.getName());
        RegisterHelper.RegisterItem(ITEM_RING_2, ItemRing2.getName());
        RegisterHelper.RegisterItem(ITEM_RING_3, ItemRing3.getName());
        RegisterHelper.RegisterItem(ITEM_RING_4, ItemRing4.getName());
        RegisterHelper.RegisterItem(ITEM_RING_5, ItemRing5.getName());
        RegisterHelper.RegisterItem(ITEM_RING_6, ItemRing6.getName());
        RegisterHelper.RegisterItem(ITEM_RING_7, ItemRing7.getName());
        RegisterHelper.RegisterItem(ITEM_RING_8, ItemRing8.getName());
        LogHelper.info("Finished item Registration");
    }

    public static void initItemModels()
    {
        LogHelper.info("Starting Item Rendering");
        RegisterHelper.RenderItem(Item_UnRealFace, ItemUnRealFace.getName());
        RegisterHelper.RenderItem(Item_ManmedFace, ItemManmaedFace.getName());
        RegisterHelper.RenderItem(Item_KyaneFace, ItemTheKayneGameFace.getName());
        RegisterHelper.RenderItem(Item_YunusFace, ItemYunus1903Face.getName());
        RegisterHelper.RenderItem(Item_AntimonyIngot, ItemAntimonyIngot.getName());
        RegisterHelper.RenderItem(Item_NetherStarRod, ItemNetherStarRod.getName());
        RegisterHelper.RenderItem(ItemTool_OpAxe, ItemToolOpAxe.getName());
        RegisterHelper.RenderItem(ItemTool_OpHoe, ItemToolOpHoe.getName());
        RegisterHelper.RenderItem(ItemTool_OpSpade, ItemToolOpSpade.getName());
        RegisterHelper.RenderItem(ItemTool_OpPick, ItemToolOpPick.getName());
        RegisterHelper.RenderItem(ItemTool_OpSword,ItemToolOpSword.getName());
        RegisterHelper.RenderItem(Item_IronNugget, ItemIronNugget.getName());
        RegisterHelper.RenderItem(ItemFood_IronApple, ItemFoodIronApple.getName());
        RegisterHelper.RenderItem(ItemFood_IronCarrot, ItemFoodIronCarrot.getName());
        RegisterHelper.RenderItem(ITEM_WING_1, ItemWings1.getName());
        RegisterHelper.RenderItem(ITEM_WING_2, ItemWings2.getName());
        RegisterHelper.RenderItem(ITEM_WING_3, ItemWings3.getName());
        RegisterHelper.RenderItem(ITEM_WING_4, ItemWings4.getName());
        RegisterHelper.RenderItem(ITEM_WING_5, ItemWings5.getName());
        RegisterHelper.RenderItem(ITEM_WING_6, ItemWings6.getName());
        RegisterHelper.RenderItem(ITEM_WING_7, ItemWings7.getName());
        RegisterHelper.RenderItem(ITEM_WING_8, ItemWings8.getName());
        RegisterHelper.RenderItem(ITEM_RING_1, ItemRing1.getName());
        RegisterHelper.RenderItem(ITEM_RING_2, ItemRing2.getName());
        RegisterHelper.RenderItem(ITEM_RING_3, ItemRing3.getName());
        RegisterHelper.RenderItem(ITEM_RING_4, ItemRing4.getName());
        RegisterHelper.RenderItem(ITEM_RING_5, ItemRing5.getName());
        RegisterHelper.RenderItem(ITEM_RING_6, ItemRing6.getName());
        RegisterHelper.RenderItem(ITEM_RING_7, ItemRing7.getName());
        RegisterHelper.RenderItem(ITEM_RING_8, ItemRing8.getName());
        LogHelper.info("Finished Item Rendering");

    }


    }
