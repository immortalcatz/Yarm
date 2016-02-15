package com.unrealdinnerbone.yarm.proxy;

import com.unrealdinnerbone.yarm.blocks.NetherStarBlocks.*;
import com.unrealdinnerbone.yarm.blocks.Normal.BlockStoneTorch;
import com.unrealdinnerbone.yarm.init.ModBlocks;
import com.unrealdinnerbone.yarm.init.ModItems;
import com.unrealdinnerbone.yarm.item.*;
import com.unrealdinnerbone.yarm.item.Tools.*;
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
        renderItem.getItemModelMesher().register(Item.getItemFromBlock(ModBlocks.BLOCK_STONE_TORCH),   0, new ModelResourceLocation(Reference.RE_PREFIX + BlockStoneTorch.getName()));

        //Items
        renderItem.getItemModelMesher().register(ModItems.ItemUnRealFace, 0, new ModelResourceLocation(Reference.RE_PREFIX + ItemUnRealFace.getName(), "inventory"));
        renderItem.getItemModelMesher().register(ModItems.ItemYunusFace, 0, new ModelResourceLocation(Reference.RE_PREFIX + ItemYunus1903Face.getName(), "inventory"));
        renderItem.getItemModelMesher().register(ModItems.ItemKyaneFace, 0, new ModelResourceLocation(Reference.RE_PREFIX + ItemTheKayneGameFace.getName(), "inventory"));
        renderItem.getItemModelMesher().register(ModItems.ItemNetherStarRod, 0, new ModelResourceLocation(Reference.RE_PREFIX + ItemNetherStarRod.getName(), "inventory"));
        renderItem.getItemModelMesher().register(ModItems.ItemManmedFace, 0, new ModelResourceLocation(Reference.RE_PREFIX + ItemManmaedFace.getName(), "inventory"));
        renderItem.getItemModelMesher().register(ModItems.ItemAntimonyIngot, 0, new ModelResourceLocation(Reference.RE_PREFIX + ItemAntimonyIngot.getName(), "inventory"));

        //Tools
        renderItem.getItemModelMesher().register(ModItems.ItemToolOpAxe, 0, new ModelResourceLocation(Reference.RE_PREFIX + ItemToolOpAxe.getName(), "inventory"));
        renderItem.getItemModelMesher().register(ModItems.ItemToolOpHoe, 0, new ModelResourceLocation(Reference.RE_PREFIX + ItemToolOpHoe.getName(), "inventory"));
        renderItem.getItemModelMesher().register(ModItems.ItemToolOpPick, 0, new ModelResourceLocation(Reference.RE_PREFIX + ItemToolOpPick.getName(), "inventory"));
        renderItem.getItemModelMesher().register(ModItems.ItemToolOpSpade, 0, new ModelResourceLocation(Reference.RE_PREFIX + ItemToolOpSpade.getName(), "inventory"));
        renderItem.getItemModelMesher().register(ModItems.ItemToolOpSword, 0, new ModelResourceLocation(Reference.RE_PREFIX + ItemToolOpSword.getName(), "inventory"));


       // renderItem.getItemModelMesher().register(ItemLoader.TestItem, 0, new ModelResourceLocation(StringMap.ModID + ":" + "TestItem", "inventory"));
    }
}