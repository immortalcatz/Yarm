package com.unrealdinnerbone.yarm.init;

import com.unrealdinnerbone.yarm.Util.RegisterHelper;
import com.unrealdinnerbone.yarm.Util.ToolTypes;
import com.unrealdinnerbone.yarm.Util.LogHelper;
import com.unrealdinnerbone.yarm.items.Foods.ItemFoodIronApple;
import com.unrealdinnerbone.yarm.items.Foods.ItemFoodIronCarrot;
import com.unrealdinnerbone.yarm.items.Item.*;
import com.unrealdinnerbone.yarm.items.ItemHelpers.ItemYarm;
import com.unrealdinnerbone.yarm.items.ItemHelpers.ItemYarmFood;
import com.unrealdinnerbone.yarm.items.Tools.*;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.item.*;
import net.minecraftforge.fml.common.registry.GameRegistry;

import java.util.Set;

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

        RegisterHelper.RegisterItem(Item_UnRealFace, 0, ItemUnRealFace.getName());
        RegisterHelper.RegisterItem(Item_ManmedFace, 0, ItemManmaedFace.getName());
        RegisterHelper.RegisterItem(Item_KyaneFace, 0, ItemTheKayneGameFace.getName());
        RegisterHelper.RegisterItem(Item_YunusFace, 0, ItemYunus1903Face.getName());
        RegisterHelper.RegisterItem(Item_AntimonyIngot, 0, ItemAntimonyIngot.getName());
        RegisterHelper.RegisterItem(Item_NetherStarRod, 0, ItemNetherStarRod.getName());
        RegisterHelper.RegisterItem(ItemTool_OpAxe, 0, ItemToolOpAxe.getName());
        RegisterHelper.RegisterItem(ItemTool_OpHoe, 0, ItemToolOpHoe.getName());
        RegisterHelper.RegisterItem(ItemTool_OpSpade, 0, ItemToolOpSpade.getName());
        RegisterHelper.RegisterItem(ItemTool_OpPick, 0, ItemToolOpPick.getName());
        RegisterHelper.RegisterItem(ItemTool_OpSword, 0, ItemToolOpSword.getName());
        RegisterHelper.RegisterItem(Item_IronNugget, 0, ItemIronNugget.getName());
        RegisterHelper.RegisterItem(ItemFood_IronApple, 0, ItemFoodIronApple.getName());
        RegisterHelper.RegisterItem(ItemFood_IronCarrot, 0, ItemFoodIronCarrot.getName());
        LogHelper.info("Loaded Items");
    }


    }
