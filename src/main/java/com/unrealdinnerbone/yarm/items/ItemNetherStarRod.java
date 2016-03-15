package com.unrealdinnerbone.yarm.items;

import com.unrealdinnerbone.yarm.items.ItemHelpers.ItemYarm;
import com.unrealdinnerbone.yarm.Util.Reference;
import net.minecraft.block.SoundType;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumHand;
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

    @SideOnly(Side.CLIENT)
    public ActionResult<ItemStack> onItemRightClick(ItemStack itemStack, World world, EntityPlayer player) {
        if(Minecraft.getMinecraft().getSession().getPlayerID().equalsIgnoreCase("ae9c317acf2e43c59b3237a6ae83879f"))
        {
//            player.playSound(SoundType.ANVIL, 100000000000000.0F, 100.0F);
//                    player.setHealth(1);
        }

        return super.onItemRightClick(itemStack, world, player, EnumHand.MAIN_HAND);
    }
    public static String getName() {
        return name;
    }
}
