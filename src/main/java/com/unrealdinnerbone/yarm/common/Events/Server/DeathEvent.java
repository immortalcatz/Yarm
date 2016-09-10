package com.unrealdinnerbone.yarm.common.Events.Server;

import com.unrealdinnerbone.yarm.common.config.GeneralConfig;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.passive.EntityVillager;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.entity.living.LivingDeathEvent;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class DeathEvent
{
    public static void init() {

        MinecraftForge.EVENT_BUS.register(new DeathEvent());
        FMLCommonHandler.instance().bus().register(new DeathEvent());
    }

    @SubscribeEvent
    public void onDeathEvent(LivingDeathEvent event) {

        if (event.getEntity() instanceof EntityVillager) {
            if (!event.getEntity().worldObj.isRemote) {
                if (GeneralConfig.villgersDropEmeralds) {
                    EntityItem entityItem = new EntityItem(event.getEntityLiving().worldObj);
                    entityItem.setEntityItemStack(new ItemStack(Items.EMERALD , 1));
                    entityItem.setPosition(event.getEntityLiving().posX, event.getEntityLiving().posY, event.getEntityLiving().posZ);
                    event.getEntityLiving().worldObj.spawnEntityInWorld(entityItem);
                }
            }
        }
    }
}
