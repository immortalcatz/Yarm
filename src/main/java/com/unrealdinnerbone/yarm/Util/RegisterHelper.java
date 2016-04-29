package com.unrealdinnerbone.yarm.Util;

import com.unrealdinnerbone.yarm.init.ModBlocks;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class RegisterHelper
{

    public static void RegisterBlock(Block block, int meta, String name)
    {
        IntBlock(block, name);
        if(Side.CLIENT.isClient())
        {
            RenderBlock(block, meta, name);
        }

    }
    public static void RegisterItem(Item item, int meta, String name)
    {
        IntItem(item, name);
        if(Side.CLIENT.isClient())
        {
            RenderItem(item, meta, name);
        }
    }
    private static void IntItem(Item item, String name)
    {
        GameRegistry.registerItem(item, name);
    }
    private static void RenderItem(Item item, int meta, String name)
    {
        String InventoryName = "inventory";
        ModelLoader.setCustomModelResourceLocation(item, meta, new ModelResourceLocation(Reference.RE_PREFIX + name, InventoryName));
    }
    private static void IntBlock(Block block, String name)
    {
        GameRegistry.registerBlock(block, name);
    }
    @SideOnly(Side.CLIENT)
    private static void RenderBlock(Block block, int meta, String name)
    {
        ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), meta, new ModelResourceLocation(Reference.RE_PREFIX + name));
    }
}
