package com.unrealdinnerbone.yarm.proxy;

import com.unrealdinnerbone.yarm.blocks.NetherStarBlocks.*;
import com.unrealdinnerbone.yarm.init.ModBlocks;
import com.unrealdinnerbone.yarm.reference.Reference;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.entity.RenderItem;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;

public class ClientProxy extends CommonProxy
{
    public static void registerRendering()
    {
        //RenderingRegistry.registerEntityRenderingHandler(entityUnReal.class, new RenderEntityUnReal(new UnRealModel(), 0));
    }
    public static void render()
    {
        RenderItem renderItem = Minecraft.getMinecraft().getRenderItem();

        //Blocks

        renderItem.getItemModelMesher().register(Item.getItemFromBlock(ModBlocks.BLOCK_NETHER_STAR_1), 0, new ModelResourceLocation(Reference.RE_PREFIX + BlockNetherStar1.getName()));
        renderItem.getItemModelMesher().register(Item.getItemFromBlock(ModBlocks.BLOCK_NETHER_STAR_2), 0, new ModelResourceLocation(Reference.RE_PREFIX + BlockNetherStar2.getName()));
        renderItem.getItemModelMesher().register(Item.getItemFromBlock(ModBlocks.BLOCK_NETHER_STAR_3), 0, new ModelResourceLocation(Reference.RE_PREFIX + BlockNetherStar3.getName()));
        renderItem.getItemModelMesher().register(Item.getItemFromBlock(ModBlocks.BLOCK_NETHER_STAR_4), 0, new ModelResourceLocation(Reference.RE_PREFIX + BlockNetherStar4.getName()));
        renderItem.getItemModelMesher().register(Item.getItemFromBlock(ModBlocks.BLOCK_NETHER_STAR_5), 0, new ModelResourceLocation(Reference.RE_PREFIX + BlockNetherStar5.getName()));
        renderItem.getItemModelMesher().register(Item.getItemFromBlock(ModBlocks.BLOCK_NETHER_STAR_6), 0, new ModelResourceLocation(Reference.RE_PREFIX + BlockNetherStar6.getName()));
        renderItem.getItemModelMesher().register(Item.getItemFromBlock(ModBlocks.BLOCK_NETHER_STAR_7), 0, new ModelResourceLocation(Reference.RE_PREFIX + BlockNetherStar7.getName()));
        renderItem.getItemModelMesher().register(Item.getItemFromBlock(ModBlocks.BLOCK_NETHER_STAR_8), 0, new ModelResourceLocation(Reference.RE_PREFIX + BlockNetherStar8.getName()));



    }

}