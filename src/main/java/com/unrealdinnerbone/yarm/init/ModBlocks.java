package com.unrealdinnerbone.yarm.init;

import com.unrealdinnerbone.yarm.blocks.*;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.BlockCommandBlock;

/**
 * Created by Travis on 7/5/2015.
 */
public class ModBlocks
{
    public static final BlockUnRealFace BLOCK_UNREAL_FACE = new BlockUnRealFace();
    public static final BlockUnRealChest BLOCK_UNREAL_CHEST = new BlockUnRealChest();
    public static final BlockCompressedIron BLOCK_COMPRESSED_IRON = new BlockCompressedIron();
    public static final BlockDoubleCompressedIron BLOCK_DOUBLE_COMPRESSED_IRON = new BlockDoubleCompressedIron();
    public static final BlockTripleCompressedIron BLOCK_TRIPLE_COMPRESSED_IRON = new BlockTripleCompressedIron();
    public static final BlockQuadrupleCompressedIron BLOCK_QUADRUPLE_COMPRESSED_IRON = new BlockQuadrupleCompressedIron();
    public static final BlockQuintupleCompressedIron BLOCK_QUINTUPLE_COMPRESSED_IRON = new BlockQuintupleCompressedIron();
    public static final BlockSextupleCompressedIron BLOCK_SEXTUPLE_COMPRESSED_IRON = new BlockSextupleCompressedIron();
    public static final BlockSeptupleCompressedIron BLOCK_SEPTUPLE_COMPRESSED_IRON = new BlockSeptupleCompressedIron();
    public static final BlockOctupleCompressedIron BLOCK_OCTUPLE_COMPRESSED_IRON = new BlockOctupleCompressedIron();

    public static void init()
    {
        GameRegistry.registerBlock(BLOCK_UNREAL_FACE, "UnReal_Block");
        GameRegistry.registerBlock(BLOCK_UNREAL_CHEST, "UnReal_Chest");
        GameRegistry.registerBlock(BLOCK_COMPRESSED_IRON, "Compressed_Iron");
        GameRegistry.registerBlock(BLOCK_DOUBLE_COMPRESSED_IRON,"Double_Compressed_Iron");
        GameRegistry.registerBlock(BLOCK_TRIPLE_COMPRESSED_IRON ,"Triple_Compressed_Iron");
        GameRegistry.registerBlock(BLOCK_QUADRUPLE_COMPRESSED_IRON ,"Quadruple_Compressed_Iron");
        GameRegistry.registerBlock(BLOCK_QUINTUPLE_COMPRESSED_IRON ,"Quintuple_Compressed_Iron");
        GameRegistry.registerBlock(BLOCK_SEXTUPLE_COMPRESSED_IRON ,"Sextuple_Compressed_Iron");
        GameRegistry.registerBlock(BLOCK_SEPTUPLE_COMPRESSED_IRON, "Septuple_Compressed_Iron");
        GameRegistry.registerBlock(BLOCK_OCTUPLE_COMPRESSED_IRON ,"Octuple_Compressed_Iron");
    }

}
