package com.unrealdinnerbone.yarm.Events;

import com.unrealdinnerbone.yarm.Util.*;
import com.unrealdinnerbone.yarm.config.OtherConfig;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.passive.EntityVillager;
import net.minecraft.util.text.TextComponentString;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.ServerChatEvent;
import net.minecraftforge.event.entity.living.LivingDeathEvent;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class Events {

    public static void init() {

        MinecraftForge.EVENT_BUS.register(new Events());
        FMLCommonHandler.instance().bus().register(new Events());
    }

    @SubscribeEvent
    public void ChatEvent(ServerChatEvent event) {
        {
            String UUID = String.valueOf(event.getPlayer().getUniqueID());
            String msg = event.getMessage();
            if (UUID.equals(UUIDHelper.UnRealDinnerbone)) {
                event.setCanceled(true);
                OpChecker.sendChatMessageServerWide(new TextComponentString(CharHelper.BLUE + "<" + event.getUsername() + "™" + "> " + CharHelper.WHITE + msg));
            }else
            {
            }
        }
    }
    @SubscribeEvent
    public void onDeathEvent(LivingDeathEvent event) {

        if (event.getEntity() instanceof EntityVillager) {
            if (!event.getEntity().worldObj.isRemote) {
                if (OtherConfig.VillgersDropEmeralds == true) {
                    EntityItem ei = new EntityItem(event.getEntityLiving().worldObj);
                    ei.setEntityItemStack(ItemStacks.ItemEmerald(1));
                    ei.setPosition(event.getEntityLiving().posX, event.getEntityLiving().posY, event.getEntityLiving().posZ);
                    event.getEntityLiving().worldObj.spawnEntityInWorld(ei);
                }
            }
        }

    }
}
