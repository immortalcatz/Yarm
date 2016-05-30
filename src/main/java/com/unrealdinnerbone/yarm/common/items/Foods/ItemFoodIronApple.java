package com.unrealdinnerbone.yarm.common.items.Foods;

import com.unrealdinnerbone.yarm.Util.Tab;
import com.unrealdinnerbone.yarm.Util.LogHelper;
import com.unrealdinnerbone.yarm.Util.Reference;
import com.unrealdinnerbone.yarm.common.config.OtherConfig;
import com.unrealdinnerbone.yarm.common.items.ItemHelpers.ItemYarmFood;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.MobEffects;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

import java.util.List;

public class ItemFoodIronApple extends ItemYarmFood {

    private static String name = "ItemFoodIronApple";

    public ItemFoodIronApple(int healamount, float saturation, boolean wolffood)
    {
        super(healamount, saturation, wolffood);
        this.setUnlocalizedName(Reference.RE_PREFIX + name);
        this.setAlwaysEdible();
        this.setCreativeTab(Tab.Yarm_Tab);
    }

    @Override
        protected void onFoodEaten(ItemStack par1ItemStack, World world, EntityPlayer player)
    {

        int Tick = 20;
        if(OtherConfig.IronAppleGivesPositiveEffects == true) {
        player.addPotionEffect(new PotionEffect(MobEffects.REGENERATION, 100, Tick * 10));
        LogHelper.info("AAAAAAAA");
        //AvA
    }
        if(OtherConfig.IronAppleGivesNegativesEffects == true) {
            player.addPotionEffect(new PotionEffect(MobEffects.SLOWNESS, 100, Tick * 15));
           // player.addPotionEffect(new PotionEffect(MobEffects.LEVITATION, -200, Tick * 15));
        }
    }

    public void addInformation(ItemStack itemStack, EntityPlayer player, List tooltip, boolean advanced)
    {
        tooltip.add("#BlameManmaed");
    }

    public static String getName()
    {
        return name;
    }
}
