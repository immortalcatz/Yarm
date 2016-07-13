package com.unrealdinnerbone.yarm.Util;

import net.minecraft.block.Block;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.OreDictionary;

public class RegisterHelper {


    public static void RegisterBlock (Block block, String name, String oreDictionaryName)
    {
        block.setRegistryName(name);
        GameRegistry.register(block);
        GameRegistry.register(new ItemBlock(block), block.getRegistryName());
        OreDictionary.registerOre(oreDictionaryName, new ItemStack(block, 1, 0));
        LogHelper.info("Registering block " + block.getRegistryName() + "to the Regersty");
    }

    public static void RegisterBlock (Block block, String name)
    {
        block.setRegistryName(name);
        GameRegistry.register(block);
        GameRegistry.register(new ItemBlock(block), block.getRegistryName());
        LogHelper.info("Registering block " + block.getRegistryName() + "to the Regersty");
    }


    public static void RegisterItem (Item item, String name) {

        item.setRegistryName(name);
        GameRegistry.register(item);
        LogHelper.info("Registering item " + item.getRegistryName() + "to the Regersty");
    }
    public static void RegisterItem (Item item, String name, String oreDictionaryName) {

        item.setRegistryName(name);
        GameRegistry.register(item);
        OreDictionary.registerOre(oreDictionaryName, new ItemStack(item, 1, 0));
        LogHelper.info("Registering item " + item.getRegistryName() + "to the Regersty");
    }

    public static void RenderItem(Item item, String name)
    {
        ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(Reference.RE_PREFIX + name, "inventory"));
        LogHelper.info("Registering item" + item.getRegistryName() + " to the render");
    }
    public static void RenderBlock(Block block, String name)
    {
        ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0, new ModelResourceLocation(Reference.RE_PREFIX + name));
        LogHelper.info("Registering block  " + block.getLocalizedName()  + " to the renderer");
    }
}
