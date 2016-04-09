package com.unrealdinnerbone.yarm.client.render;

import com.unrealdinnerbone.yarm.Util.Reference;
import com.unrealdinnerbone.yarm.blocks.Faces.BlockUnRealFace;
import com.unrealdinnerbone.yarm.blocks.NetherStarBlocks.*;
import com.unrealdinnerbone.yarm.blocks.Normal.BlockAntimony;
import com.unrealdinnerbone.yarm.blocks.Normal.BlockStoneTorch;
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
        renderItem.getItemModelMesher().register(Item.getItemFromBlock(ModBlocks.BLOCK_STONE_TORCH),   0, new ModelResourceLocation(Reference.RE_PREFIX + BlockStoneTorch.getName()));
        renderItem.getItemModelMesher().register(Item.getItemFromBlock(ModBlocks.BLOCK_UNREAL_FACE), 0, new ModelResourceLocation(Reference.RE_PREFIX + BlockUnRealFace.getName()));
    }
}
