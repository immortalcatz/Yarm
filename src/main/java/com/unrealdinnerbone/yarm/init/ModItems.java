package com.unrealdinnerbone.yarm.init;

import com.unrealdinnerbone.yarm.Util.OreDictionaryNames;
import com.unrealdinnerbone.yarm.Util.RegisterHelper;
import com.unrealdinnerbone.yarm.Util.ToolTypes;
import com.unrealdinnerbone.yarm.items.Foods.ItemFoodIronApple;
import com.unrealdinnerbone.yarm.items.Foods.ItemFoodIronCarrot;
import com.unrealdinnerbone.yarm.items.Item.*;
import com.unrealdinnerbone.yarm.items.ItemHelpers.ItemYarm;
import com.unrealdinnerbone.yarm.items.ItemHelpers.ItemYarmFood;
import com.unrealdinnerbone.yarm.items.Tools.*;
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

    public static void init()
    {

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
    }


    }
