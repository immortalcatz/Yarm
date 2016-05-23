package com.unrealdinnerbone.yarm.items.Item;

import com.unrealdinnerbone.yarm.items.ItemHelpers.ItemYarm;
import com.unrealdinnerbone.yarm.Util.Reference;
import net.darkhax.bookshelf.lib.util.Utilities;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.util.EnumParticleTypes;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;


public class ItemNetherStarRod extends ItemYarm {

    public static MinecraftServer getServer() {

        return FMLCommonHandler.instance().getMinecraftServerInstance();
    }

    private static String name = "ItemNetherStarRod";

    public ItemNetherStarRod() {
        super();
        this.setUnlocalizedName(Reference.RE_PREFIX + name);
    }

    @Override
    @SideOnly(Side.CLIENT)
    public ActionResult<ItemStack> onItemRightClick(ItemStack itemStack, World world, EntityPlayer entityPlayer, EnumHand enumHand) {

        double i = 0;
        double z = 0.01;
        while(i < 2)
        {
            Utilities.spawnParticleRing(world, EnumParticleTypes.FLAME, entityPlayer.chasingPosX, entityPlayer.posY + i, entityPlayer.posZ, 0.01, 0.01, 0.01, 0.01);
            i = i + z;

        }
        return new ActionResult(EnumActionResult.PASS, itemStack);
    }

    public static String getName() {
        return name;
    }
}
