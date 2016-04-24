package com.unrealdinnerbone.yarm.Client.render;

import com.unrealdinnerbone.yarm.Util.Reference;
import com.unrealdinnerbone.yarm.blocks.Faces.BlockUnRealFace;
import com.unrealdinnerbone.yarm.blocks.NetherStarBlocks.*;
import com.unrealdinnerbone.yarm.blocks.Normal.BlockAntimony;
import com.unrealdinnerbone.yarm.blocks.Ores.BlockAntimonyOre;
import com.unrealdinnerbone.yarm.init.ModBlocks;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.RenderItem;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;

public class RenderBlocks
{
    public static void RenderBlocks()
    {
        RenderItem renderItem = Minecraft.getMinecraft().getRenderItem();
        renderItem.getItemModelMesher().register(Item.getItemFromBlock(ModBlocks.BLOCK_NETHER_STAR_1), 0, new ModelResourceLocation(Reference.RE_PREFIX + BlockNetherStar1.getName()));
        renderItem.getItemModelMesher().register(Item.getItemFromBlock(ModBlocks.BLOCK_NETHER_STAR_2), 0, new ModelResourceLocation(Reference.RE_PREFIX + BlockNetherStar2.getName()));
        renderItem.getItemModelMesher().register(Item.getItemFromBlock(ModBlocks.BLOCK_NETHER_STAR_3), 0, new ModelResourceLocation(Reference.RE_PREFIX + BlockNetherStar3.getName()));
        renderItem.getItemModelMesher().register(Item.getItemFromBlock(ModBlocks.BLOCK_NETHER_STAR_4), 0, new ModelResourceLocation(Reference.RE_PREFIX + BlockNetherStar4.getName()));
        renderItem.getItemModelMesher().register(Item.getItemFromBlock(ModBlocks.BLOCK_NETHER_STAR_5), 0, new ModelResourceLocation(Reference.RE_PREFIX + BlockNetherStar5.getName()));
        renderItem.getItemModelMesher().register(Item.getItemFromBlock(ModBlocks.BLOCK_NETHER_STAR_6), 0, new ModelResourceLocation(Reference.RE_PREFIX + BlockNetherStar6.getName()));
        renderItem.getItemModelMesher().register(Item.getItemFromBlock(ModBlocks.BLOCK_NETHER_STAR_7), 0, new ModelResourceLocation(Reference.RE_PREFIX + BlockNetherStar7.getName()));
        renderItem.getItemModelMesher().register(Item.getItemFromBlock(ModBlocks.BLOCK_NETHER_STAR_8), 0, new ModelResourceLocation(Reference.RE_PREFIX + BlockNetherStar8.getName()));
        renderItem.getItemModelMesher().register(Item.getItemFromBlock(ModBlocks.BLOCK_ANTIMONY), 0, new ModelResourceLocation(Reference.RE_PREFIX + BlockAntimony.getName()));
        renderItem.getItemModelMesher().register(Item.getItemFromBlock(ModBlocks.BLOCK_ANTIMONY_ORE), 0, new ModelResourceLocation(Reference.RE_PREFIX + BlockAntimonyOre.getName()));
        renderItem.getItemModelMesher().register(Item.getItemFromBlock(ModBlocks.BLOCK_BISMUTH_ORE), 0, new ModelResourceLocation(Reference.RE_PREFIX + ModBlocks.BLOCK_BISMUTH_ORE.getName()));
        renderItem.getItemModelMesher().register(Item.getItemFromBlock(ModBlocks.BLOCK_CHROMIUM_ORE), 0, new ModelResourceLocation(Reference.RE_PREFIX + ModBlocks.BLOCK_CHROMIUM_ORE.getName()));
        renderItem.getItemModelMesher().register(Item.getItemFromBlock(ModBlocks.BLOCK_COBALT_ORE), 0, new ModelResourceLocation(Reference.RE_PREFIX + ModBlocks.BLOCK_COBALT_ORE.getName()));
        renderItem.getItemModelMesher().register(Item.getItemFromBlock(ModBlocks.BLOCK_COPPER_ORE), 0, new ModelResourceLocation(Reference.RE_PREFIX + ModBlocks.BLOCK_COPPER_ORE.getName()));
        renderItem.getItemModelMesher().register(Item.getItemFromBlock(ModBlocks.BLOCK_GALLIUM_ORE), 0, new ModelResourceLocation(Reference.RE_PREFIX + ModBlocks.BLOCK_GALLIUM_ORE.getName()));
        renderItem.getItemModelMesher().register(Item.getItemFromBlock(ModBlocks.BLOCK_INDIUM_ORE), 0, new ModelResourceLocation(Reference.RE_PREFIX + ModBlocks.BLOCK_INDIUM_ORE.getName()));
        renderItem.getItemModelMesher().register(Item.getItemFromBlock(ModBlocks.BLOCK_LEAD_ORE), 0, new ModelResourceLocation(Reference.RE_PREFIX + ModBlocks.BLOCK_LEAD_ORE.getName()));
        renderItem.getItemModelMesher().register(Item.getItemFromBlock(ModBlocks.BLOCK_MAGNESIUM_ORE), 0, new ModelResourceLocation(Reference.RE_PREFIX + ModBlocks.BLOCK_MAGNESIUM_ORE.getName()));
        renderItem.getItemModelMesher().register(Item.getItemFromBlock(ModBlocks.BLOCK_NICKEL_ORE), 0, new ModelResourceLocation(Reference.RE_PREFIX + ModBlocks.BLOCK_NICKEL_ORE.getName()));
        renderItem.getItemModelMesher().register(Item.getItemFromBlock(ModBlocks.BLOCK_SILVER_ORE), 0, new ModelResourceLocation(Reference.RE_PREFIX + ModBlocks.BLOCK_SILVER_ORE.getName()));
        renderItem.getItemModelMesher().register(Item.getItemFromBlock(ModBlocks.BLOCK_TIN_ORE), 0, new ModelResourceLocation(Reference.RE_PREFIX + ModBlocks.BLOCK_TIN_ORE.getName()));
        renderItem.getItemModelMesher().register(Item.getItemFromBlock(ModBlocks.BLOCK_TITANIUM_ORE), 0, new ModelResourceLocation(Reference.RE_PREFIX + ModBlocks.BLOCK_TITANIUM_ORE.getName()));
        renderItem.getItemModelMesher().register(Item.getItemFromBlock(ModBlocks.BLOCK_ZINC_ORE), 0, new ModelResourceLocation(Reference.RE_PREFIX + ModBlocks.BLOCK_ZINC_ORE.getName()));
        renderItem.getItemModelMesher().register(Item.getItemFromBlock(ModBlocks.BLOCK_ZIRCONIUM_ORE), 0, new ModelResourceLocation(Reference.RE_PREFIX + ModBlocks.BLOCK_ZIRCONIUM_ORE.getName()));

    }
}
