package com.unrealdinnerbone.yarm.items.Foods;

import com.unrealdinnerbone.yarm.CreativeTab.Tab;
import com.unrealdinnerbone.yarm.config.ConfigManger;
import com.unrealdinnerbone.yarm.Util.LogHelper;
import com.unrealdinnerbone.yarm.Util.Reference;;
import com.unrealdinnerbone.yarm.config.OtherConfig;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.MobEffects;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

import java.util.List;

public class ItemFoodIronApple extends ItemFood {

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
