package com.unrealdinnerbone.yarm.init;

import com.unrealdinnerbone.yarm.Util.LogHelper;
import com.unrealdinnerbone.yarm.item.*;
import com.unrealdinnerbone.yarm.item.Tools.*;
import com.unrealdinnerbone.yarm.render.RenderHelper;
import net.minecraft.util.LazyLoadBase;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraft.item.*;
import net.minecraftforge.common.util.EnumHelper;

import static com.unrealdinnerbone.yarm.render.RenderHelper.ItemRenderRegister;

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

        GameRegistry.registerItem(ItemUnRealFace, "ItemUnRealFace");
        GameRegistry.registerItem(ItemManmedFace, "ItemManmedFace");
        GameRegistry.registerItem(ItemKyaneFace, "ItemTheKayneGameFace");
        GameRegistry.registerItem(ItemYunusFace, "ItemYunus1903Face");
        GameRegistry.registerItem(ItemAntimonyIngot, "AntimonyIngot");
        GameRegistry.registerItem(ItemNetherStarRod,"NetherStarRod");
        GameRegistry.registerItem(ItemToolOpAxe, "ItemOpAxe");
        GameRegistry.registerItem(ItemToolOpHoe, "ItemOpHoe");
        GameRegistry.registerItem(ItemToolOpPick, "ItemOpPick");
        GameRegistry.registerItem(ItemToolOpSpade, "ItemOpSpade");
        GameRegistry.registerItem(ItemToolOpSword, "ItemOpSword");
        LogHelper.info("Loaded Items");
    }
        public static void registerItemRenderer() {
            LogHelper.info("Registering Item Rendering");
            RenderHelper.ItemRenderRegister(ItemToolOpAxe);
            RenderHelper.ItemRenderRegister(ItemToolOpSword);
            RenderHelper.ItemRenderRegister(ItemToolOpSpade);
            RenderHelper.ItemRenderRegister(ItemToolOpPick);
            RenderHelper.ItemRenderRegister(ItemNetherStarRod);
            RenderHelper.ItemRenderRegister(ItemToolOpHoe);
            RenderHelper.ItemRenderRegister(ItemAntimonyIngot);
            RenderHelper.ItemRenderRegister(ItemKyaneFace);
            RenderHelper.ItemRenderRegister(ItemManmedFace);
            RenderHelper.ItemRenderRegister(ItemUnRealFace);
            RenderHelper.ItemRenderRegister(ItemYunusFace);
            LogHelper.info("Register Item Rending");

        }

}
