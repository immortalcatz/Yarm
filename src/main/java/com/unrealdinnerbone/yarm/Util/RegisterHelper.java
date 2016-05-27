package com.unrealdinnerbone.yarm.Util;

import net.minecraft.block.Block;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.oredict.OreDictionary;

public class RegisterHelper
{

    public static void RegisterBlockWithoutOreDictionary(Block block, int meta, String name)
    {
        IntBlock(block, name);
        if(Side.CLIENT.isClient())
        {
            RenderBlock(block, meta, name);
        }

    }
    public static void RegisterBlockWithOreDictionary(Block block, int meta, String name, String OreDictionaryName, ItemStack itemStack)
    {
        IntBlock(block, name);
        RegisterOreDictionary(OreDictionaryName, itemStack);
        if(Side.CLIENT.isClient())
        {
            RenderBlock(block, meta, name);
        }

    }
    public static void RegisterItemWithOreDictionary(Item item, int meta, String name, String OreDictionaryName, ItemStack itemStack)
    {
        IntItem(item, name);
        RegisterOreDictionary(OreDictionaryName, itemStack);
        if(Side.CLIENT.isClient())
        {
            RenderItem(item, meta, name);
        }
    }
    public static void RegisterItemWithoutOreDictionary(Item item, int meta, String name)
    {
        IntItem(item, name);
        if(Side.CLIENT.isClient())
        {
            RenderItem(item, meta, name);
        }
    }
    private static void RegisterOreDictionary(String OreDictionaryName, ItemStack itemStack)
    {
     //   OreDictionary.registerOre(OreDictionaryName, itemStack);
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
