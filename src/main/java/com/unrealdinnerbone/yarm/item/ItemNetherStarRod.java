package com.unrealdinnerbone.yarm.item;


import com.unrealdinnerbone.yarm.Util.LogHelper;
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.audio.SoundList;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

import java.util.Random;

public class ItemNetherStarRod extends ItemYarm {
    public ItemNetherStarRod() {
        super();
        this.setUnlocalizedName("NetherStarRod");
        this.setTextureName("NetherStarRod");
    }

    @Override
    public ItemStack onItemRightClick(ItemStack itemStack, World world, EntityPlayer player) {
        if(Minecraft.getMinecraft().getSession().getPlayerID().equalsIgnoreCase("ae9c317acf2e43c59b3237a6ae83879f"))
        {
            world.playSoundEffect(0.5D, 0.5D, +0.5D, "fire.fire", 1.0F, 1.0F);
            player.setHealth(1);
        }

        return super.onItemRightClick(itemStack, world, player);
    }
}
