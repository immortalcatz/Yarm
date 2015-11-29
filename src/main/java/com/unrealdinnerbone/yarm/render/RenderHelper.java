package com.unrealdinnerbone.yarm.render;

import com.unrealdinnerbone.yarm.reference.Reference;
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;

public class RenderHelper
{
    public static void ItemRenderRegister(Item item) {
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(Reference.RE_PREFIX + item.getUnlocalizedName().substring(5), "inventory"));
    }
    public static void BlockRenderRegister(Block block)
    {
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher()
                .register(Item.getItemFromBlock(block), 0, new ModelResourceLocation(Reference.RE_PREFIX + block.getUnlocalizedName().substring(5), "inventory"));

    }
}
