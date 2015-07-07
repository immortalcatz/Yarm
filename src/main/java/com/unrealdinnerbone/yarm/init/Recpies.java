package com.unrealdinnerbone.yarm.init;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.BlockGrass;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

/**
 * Created by Travis on 7/6/2015.
 */
public class Recpies
{

    public static void init()
    {
        //Shaped
        //Shaped Recipe
        GameRegistry.addRecipe(new ItemStack(ModBlocks.BLOCK_UNREAL_FACE, 1),
               "AAA",
               "AAA",
               "AAA",
               'A', ModItems.UnRealFace);
        GameRegistry.addRecipe(new ItemStack(ModBlocks.BLOCK_COMPRESSED_IRON, 1),
              "AAA",
              "AAA",
              "AAA",
              'A', Blocks.iron_block);
        GameRegistry.addRecipe(new ItemStack(ModBlocks.BLOCK_DOUBLE_COMPRESSED_IRON),
                "AAA",
                "AAA",
                "AAA",
                'A', ModBlocks.BLOCK_COMPRESSED_IRON);
        GameRegistry.addRecipe(new ItemStack(ModBlocks.BLOCK_TRIPLE_COMPRESSED_IRON),
                "AAA",
                "AAA",
                "AAA",
                'A', ModBlocks.BLOCK_DOUBLE_COMPRESSED_IRON);

        GameRegistry.addRecipe(new ItemStack(ModBlocks.BLOCK_QUADRUPLE_COMPRESSED_IRON),
                "AAA",
                "AAA",
                "AAA",
                'A', ModBlocks.BLOCK_TRIPLE_COMPRESSED_IRON);

        GameRegistry.addRecipe(new ItemStack(ModBlocks.BLOCK_QUINTUPLE_COMPRESSED_IRON),
                "AAA",
                "AAA",
                "AAA",
                'A', ModBlocks.BLOCK_QUADRUPLE_COMPRESSED_IRON);

        GameRegistry.addRecipe(new ItemStack(ModBlocks.BLOCK_SEXTUPLE_COMPRESSED_IRON),
                "AAA",
                "AAA",
                "AAA",
                'A', ModBlocks.BLOCK_QUINTUPLE_COMPRESSED_IRON);

        GameRegistry.addRecipe(new ItemStack(ModBlocks.BLOCK_SEPTUPLE_COMPRESSED_IRON),
                "AAA",
                "AAA",
                "AAA",
                'A', ModBlocks.BLOCK_SEXTUPLE_COMPRESSED_IRON);

        GameRegistry.addRecipe(new ItemStack(ModBlocks.BLOCK_OCTUPLE_COMPRESSED_IRON),
                "AAA",
                "AAA",
                "AAA",
                'A', ModBlocks.BLOCK_SEXTUPLE_COMPRESSED_IRON);




        //Shapless
                GameRegistry.addShapelessRecipe(new ItemStack(ModItems.UnRealFace, 9), new ItemStack(ModBlocks.BLOCK_UNREAL_FACE));
                GameRegistry.addShapelessRecipe(new ItemStack(Blocks.iron_block, 9), new ItemStack(ModBlocks.BLOCK_COMPRESSED_IRON));
                GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.BLOCK_COMPRESSED_IRON, 9), new ItemStack(ModBlocks.BLOCK_TRIPLE_COMPRESSED_IRON));
                GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.BLOCK_TRIPLE_COMPRESSED_IRON ,9), new ItemStack(ModBlocks.BLOCK_QUADRUPLE_COMPRESSED_IRON));
                GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.BLOCK_QUADRUPLE_COMPRESSED_IRON, 9), new ItemStack(ModBlocks.BLOCK_QUINTUPLE_COMPRESSED_IRON));
                GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.BLOCK_QUINTUPLE_COMPRESSED_IRON, 9), new ItemStack(ModBlocks.BLOCK_SEXTUPLE_COMPRESSED_IRON));
                GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.BLOCK_SEXTUPLE_COMPRESSED_IRON, 9), new ItemStack(ModBlocks.BLOCK_SEPTUPLE_COMPRESSED_IRON));
                GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.BLOCK_SEPTUPLE_COMPRESSED_IRON ,9), new ItemStack(ModBlocks.BLOCK_OCTUPLE_COMPRESSED_IRON));
        }
}
