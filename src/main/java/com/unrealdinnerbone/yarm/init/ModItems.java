package com.unrealdinnerbone.yarm.init;

import com.unrealdinnerbone.yarm.Util.LogHelper;
import com.unrealdinnerbone.yarm.Util.OreDictionaryNames;
import com.unrealdinnerbone.yarm.Util.RegisterHelper;
import com.unrealdinnerbone.yarm.Util.ToolTypes;
import com.unrealdinnerbone.yarm.items.Foods.ItemFoodIronApple;
import com.unrealdinnerbone.yarm.items.Foods.ItemFoodIronCarrot;
import com.unrealdinnerbone.yarm.items.Item.*;
import com.unrealdinnerbone.yarm.items.ItemHelpers.ItemYarm;
import com.unrealdinnerbone.yarm.items.Tools.*;
import net.minecraft.item.*;

import static com.unrealdinnerbone.yarm.Util.ItemStacks.*;


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
    public static final ItemHoe ItemTool_OpHoe = new ItemToolOpHoe(ToolTypes.OpTools);
    public static final ItemPickaxe ItemTool_OpPick = new ItemToolOpPick(ToolTypes.OpTools);
    public static final ItemSpade ItemTool_OpSpade = new ItemToolOpSpade(ToolTypes.OpTools);
    public static final ItemSword ItemTool_OpSword = new ItemToolOpSword(ToolTypes.OpTools);
    public static final ItemFood ItemFood_IronApple = new ItemFoodIronApple(10, 10.0f, false);
    public static final ItemFood ItemFood_IronCarrot = new ItemFoodIronCarrot(10, 20.0f, false);

    public static void init()
    {

        RegisterHelper.RegisterItemWithOreDictionary(Item_UnRealFace, 0, ItemUnRealFace.getName(), OreDictionaryNames.Item_UnRealFace, ItemUnRealFace(1));
        RegisterHelper.RegisterItemWithOreDictionary(Item_ManmedFace, 0, ItemManmaedFace.getName(), OreDictionaryNames.Item_ManmaedFace, ItemManmaedFace(1));
        RegisterHelper.RegisterItemWithOreDictionary(Item_KyaneFace, 0, ItemTheKayneGameFace.getName(), OreDictionaryNames.Item_KyaneFace, ItemKyaneFace(1));
        RegisterHelper.RegisterItemWithOreDictionary(Item_YunusFace, 0, ItemYunus1903Face.getName(), OreDictionaryNames.Item_YunusFace, ItemYunusFace(1));
        RegisterHelper.RegisterItemWithOreDictionary(Item_AntimonyIngot, 0, ItemAntimonyIngot.getName(), OreDictionaryNames.Item_AntimonyIngot, ItemAntimonyIngot(1));
        RegisterHelper.RegisterItemWithOreDictionary(Item_NetherStarRod, 0, ItemNetherStarRod.getName(), OreDictionaryNames.Item_NetherStarRod, ItemNetherStarRod(1));
        RegisterHelper.RegisterItemWithOreDictionary(ItemTool_OpAxe, 0, ItemToolOpAxe.getName(), OreDictionaryNames.Item_Tool_OpAxe, ItemToolNetherStarAxe(1));
        RegisterHelper.RegisterItemWithOreDictionary(ItemTool_OpHoe, 0, ItemToolOpHoe.getName(), OreDictionaryNames.Item_Tool_OpHoe, ItemToolNetherStarHoe(1));
        RegisterHelper.RegisterItemWithOreDictionary(ItemTool_OpSpade, 0, ItemToolOpSpade.getName(), OreDictionaryNames.Item_Tool_OpSpade, ItemToolNetherStarSpade(1));
        RegisterHelper.RegisterItemWithOreDictionary(ItemTool_OpPick, 0, ItemToolOpPick.getName(), OreDictionaryNames.Item_Tool_OpPic, ItemToolNetherStarPic(1));
        RegisterHelper.RegisterItemWithOreDictionary(ItemTool_OpSword, 0, ItemToolOpSword.getName(), OreDictionaryNames.Item_Tool_OpSword, ItemToolNetherStarSword(1));
        RegisterHelper.RegisterItemWithOreDictionary(Item_IronNugget, 0, ItemIronNugget.getName(), OreDictionaryNames.Item_IronNugget, ItemIronNugget(1));
        RegisterHelper.RegisterItemWithOreDictionary(ItemFood_IronApple, 0, ItemFoodIronApple.getName(), OreDictionaryNames.Food_IronApple, ItemFoodIronApple(1));
        RegisterHelper.RegisterItemWithOreDictionary(ItemFood_IronCarrot, 0, ItemFoodIronCarrot.getName(), OreDictionaryNames.Food_IronCarrot, ItemFoodIronCarrot(1));
        LogHelper.info("Loaded Items");
    }


    }
