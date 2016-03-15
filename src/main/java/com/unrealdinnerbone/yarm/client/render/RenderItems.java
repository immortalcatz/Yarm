package com.unrealdinnerbone.yarm.client.render;

import com.unrealdinnerbone.yarm.Util.Reference;
import com.unrealdinnerbone.yarm.init.ModItems;
import com.unrealdinnerbone.yarm.items.*;
import com.unrealdinnerbone.yarm.items.Tools.*;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.RenderItem;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;

public class RenderItems {
    public static void RenderItems() {
        RenderItem renderItem = Minecraft.getMinecraft().getRenderItem();
        renderItem.getItemModelMesher().register(ModItems.ItemUnRealFace, 0, new ModelResourceLocation(Reference.RE_PREFIX + ItemUnRealFace.getName(), "inventory"));
        renderItem.getItemModelMesher().register(ModItems.ItemYunusFace, 0, new ModelResourceLocation(Reference.RE_PREFIX + ItemYunus1903Face.getName(), "inventory"));
        renderItem.getItemModelMesher().register(ModItems.ItemKyaneFace, 0, new ModelResourceLocation(Reference.RE_PREFIX + ItemTheKayneGameFace.getName(), "inventory"));
        renderItem.getItemModelMesher().register(ModItems.ItemNetherStarRod, 0, new ModelResourceLocation(Reference.RE_PREFIX + ItemNetherStarRod.getName(), "inventory"));
        renderItem.getItemModelMesher().register(ModItems.ItemManmedFace, 0, new ModelResourceLocation(Reference.RE_PREFIX + ItemManmaedFace.getName(), "inventory"));
        renderItem.getItemModelMesher().register(ModItems.ItemAntimonyIngot, 0, new ModelResourceLocation(Reference.RE_PREFIX + ItemAntimonyIngot.getName(), "inventory"));
//        renderItem.getItemModelMesher().register(ModItems.ItemToolOpAxe, 0, new ModelResourceLocation(Reference.RE_PREFIX + ItemToolOpAxe.getName(), "inventory"));
//        renderItem.getItemModelMesher().register(ModItems.ItemToolOpHoe, 0, new ModelResourceLocation(Reference.RE_PREFIX + ItemToolOpHoe.getName(), "inventory"));
//        renderItem.getItemModelMesher().register(ModItems.ItemToolOpPick, 0, new ModelResourceLocation(Reference.RE_PREFIX + ItemToolOpPick.getName(), "inventory"));
//        renderItem.getItemModelMesher().register(ModItems.ItemToolOpSpade, 0, new ModelResourceLocation(Reference.RE_PREFIX + ItemToolOpSpade.getName(), "inventory"));
//        renderItem.getItemModelMesher().register(ModItems.ItemToolOpSword, 0, new ModelResourceLocation(Reference.RE_PREFIX + ItemToolOpSword.getName(), "inventory"));
    }
}

