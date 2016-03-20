package com.unrealdinnerbone.yarm.client.render;

import com.sun.org.apache.xml.internal.resolver.helpers.PublicId;
import com.unrealdinnerbone.yarm.Util.Reference;
import com.unrealdinnerbone.yarm.init.ModItems;
import com.unrealdinnerbone.yarm.items.*;
import com.unrealdinnerbone.yarm.items.Tools.*;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.RenderItem;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;

public class RenderItems {
    
    
    public static void RenderItems() 
    {
        String InventoryName = "inventory";
        
        RenderItem renderItem = Minecraft.getMinecraft().getRenderItem();
        renderItem.getItemModelMesher().register(ModItems.Item_UnRealFace, 0, new ModelResourceLocation(Reference.RE_PREFIX + ItemUnRealFace.getName(), InventoryName));
        renderItem.getItemModelMesher().register(ModItems.Item_YunusFace, 0, new ModelResourceLocation(Reference.RE_PREFIX + ItemYunus1903Face.getName(), InventoryName));
        renderItem.getItemModelMesher().register(ModItems.Item_KyaneFace, 0, new ModelResourceLocation(Reference.RE_PREFIX + ItemTheKayneGameFace.getName(), InventoryName));
        renderItem.getItemModelMesher().register(ModItems.Item_NetherStarRod, 0, new ModelResourceLocation(Reference.RE_PREFIX + ItemNetherStarRod.getName(), InventoryName));
        renderItem.getItemModelMesher().register(ModItems.Item_ManmedFace, 0, new ModelResourceLocation(Reference.RE_PREFIX + ItemManmaedFace.getName(), InventoryName));
        renderItem.getItemModelMesher().register(ModItems.Item_AntimonyIngot, 0, new ModelResourceLocation(Reference.RE_PREFIX + ItemAntimonyIngot.getName(), InventoryName));
        renderItem.getItemModelMesher().register(ModItems.ItemTool_OpAxe, 0, new ModelResourceLocation(Reference.RE_PREFIX + ItemToolOpAxe.getName(), InventoryName));
        renderItem.getItemModelMesher().register(ModItems.ItemTool_OpHoe, 0, new ModelResourceLocation(Reference.RE_PREFIX + ItemToolOpHoe.getName(), InventoryName));
        renderItem.getItemModelMesher().register(ModItems.ItemTool_OpPick, 0, new ModelResourceLocation(Reference.RE_PREFIX + ItemToolOpPick.getName(), InventoryName));
        renderItem.getItemModelMesher().register(ModItems.ItemTool_OpSpade, 0, new ModelResourceLocation(Reference.RE_PREFIX + ItemToolOpSpade.getName(), InventoryName));
        renderItem.getItemModelMesher().register(ModItems.ItemTool_OpSword, 0, new ModelResourceLocation(Reference.RE_PREFIX + ItemToolOpSword.getName(), InventoryName));
    }
}

