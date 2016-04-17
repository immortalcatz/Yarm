package com.unrealdinnerbone.yarm.init;

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

        GameRegistry.registerItem(Item_UnRealFace, ItemUnRealFace.getName());
        GameRegistry.registerItem(Item_ManmedFace, ItemManmaedFace.getName());
        GameRegistry.registerItem(Item_KyaneFace, ItemTheKayneGameFace.getName());
        GameRegistry.registerItem(Item_YunusFace, ItemYunus1903Face.getName());
        GameRegistry.registerItem(Item_AntimonyIngot, ItemAntimonyIngot.getName());
        GameRegistry.registerItem(Item_NetherStarRod, ItemNetherStarRod.getName());
        GameRegistry.registerItem(ItemTool_OpAxe, ItemToolOpAxe.getName());
        GameRegistry.registerItem(ItemTool_OpHoe, ItemToolOpHoe.getName());
        GameRegistry.registerItem(ItemTool_OpSpade, ItemToolOpSpade.getName());
        GameRegistry.registerItem(ItemTool_OpPick, ItemToolOpPick.getName());
        GameRegistry.registerItem(ItemTool_OpSword, ItemToolOpSword.getName());
        GameRegistry.registerItem(Item_IronNugget, ItemIronNugget.getName());
        GameRegistry.registerItem(ItemFood_IronApple, ItemFoodIronApple.getName());
        GameRegistry.registerItem(ItemFood_IronCarrot, ItemFoodIronCarrot.getName());
        LogHelper.info("Loaded Items");
    }


    }
