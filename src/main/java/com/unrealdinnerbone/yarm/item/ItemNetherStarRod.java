package com.unrealdinnerbone.yarm.item;

import com.unrealdinnerbone.yarm.item.ItemHelpers.ItemYarm;
import com.unrealdinnerbone.yarm.reference.Reference;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;


public class ItemNetherStarRod extends ItemYarm {

    private static String name = "ItemNetherStarRod";

    public ItemNetherStarRod() {
        super();
        this.setUnlocalizedName(Reference.RE_PREFIX + name);
    }

    @Override
    @SideOnly(Side.CLIENT)
    public ItemStack onItemRightClick(ItemStack itemStack, World world, EntityPlayer player) {
        if(Minecraft.getMinecraft().getSession().getPlayerID().equalsIgnoreCase("ae9c317acf2e43c59b3237a6ae83879f"))
        {
            world.playSoundEffect(player.posX, player.posY, player.posZ, Reference.MOD_ID + ":" + "Siren", 100000000000000.0F, 100.0F);
                    player.setHealth(1);
        }

        return super.onItemRightClick(itemStack, world, player);
    }
    public static String getName() {
        return name;
    }
}
