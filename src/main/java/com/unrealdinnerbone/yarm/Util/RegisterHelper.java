package com.unrealdinnerbone.yarm.Util;

import net.minecraft.block.Block;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.oredict.OreDictionary;

public class RegisterHelper {

    public static void RegisterBlock (Block block, int meta, String name) {

        block.setRegistryName(name);
        GameRegistry.register(block);
        GameRegistry.register(new ItemBlock(block), block.getRegistryName());
        if (Side.CLIENT.isClient()) {
            ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), meta, new ModelResourceLocation(Reference.RE_PREFIX + name));
        }
    }

    public static void RegisterBlock (Block block, String name) {

        block.setRegistryName(name);
        GameRegistry.register(block);
        GameRegistry.register(new ItemBlock(block), block.getRegistryName());
        if (Side.CLIENT.isClient()) {
            ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0, new ModelResourceLocation(Reference.RE_PREFIX + name));
        }
    }

    public static void RegisterBlock (Block block, int meta, String name, String oreDictionaryName) {

        block.setRegistryName(name);
        GameRegistry.register(block);
        GameRegistry.register(new ItemBlock(block), block.getRegistryName());
        if (Side.CLIENT.isClient()) {
            ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), meta, new ModelResourceLocation(Reference.RE_PREFIX + name));
        }
        OreDictionary.registerOre(oreDictionaryName, new ItemStack(block, 1, meta));
    }

    public static void RegisterBlock (Block block, String name, String oreDictionaryName) {

        block.setRegistryName(name);
        GameRegistry.register(block);
        GameRegistry.register(new ItemBlock(block), block.getRegistryName());
        if (Side.CLIENT.isClient()) {
            ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0, new ModelResourceLocation(Reference.RE_PREFIX + name));
        }
        OreDictionary.registerOre(oreDictionaryName, new ItemStack(block, 1, 0));
    }

    public static void RegisterItem (Item item, int meta, String name) {

        item.setRegistryName(name);
        GameRegistry.register(item);
        if (Side.CLIENT.isClient()) {
            ModelLoader.setCustomModelResourceLocation(item, meta, new ModelResourceLocation(Reference.RE_PREFIX + name, "inventory"));
        }
    }

    public static void RegisterItem (Item item, String name) {

        item.setRegistryName(name);
        GameRegistry.register(item);
        if (Side.CLIENT.isClient()) {
            ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(Reference.RE_PREFIX + name, "inventory"));
        }
    }

    public static void RegisterItem (Item item, int meta, String name, String oreDictionaryName) {

        item.setRegistryName(name);
        GameRegistry.register(item);
        if (Side.CLIENT.isClient()) {
            ModelLoader.setCustomModelResourceLocation(item, meta, new ModelResourceLocation(Reference.RE_PREFIX + name, "inventory"));
        }
        OreDictionary.registerOre(oreDictionaryName, new ItemStack(item, 1, meta));
    }

    public static void RegisterItem (Item item, String name, String oreDictionaryName) {

        item.setRegistryName(name);
        GameRegistry.register(item);
        if (Side.CLIENT.isClient()) {
            ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(Reference.RE_PREFIX + name, "inventory"));
        }
        OreDictionary.registerOre(oreDictionaryName, new ItemStack(item, 1, 0));
    }
}
