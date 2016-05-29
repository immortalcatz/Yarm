package com.unrealdinnerbone.yarm.Events;

import com.unrealdinnerbone.yarm.Util.StatsGetter.SupporterData;
import com.unrealdinnerbone.yarm.Util.*;
import com.unrealdinnerbone.yarm.config.OtherConfig;
import com.unrealdinnerbone.yarm.core.Util.PlayerHelper;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.AbstractClientPlayer;
import net.minecraft.crash.CrashReport;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.passive.EntityVillager;
import net.minecraft.util.text.TextComponentString;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.ServerChatEvent;
import net.minecraftforge.event.entity.EntityJoinWorldEvent;
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
//            Minecraft.getMinecraft().displayCrashReport(new CrashReport("AAAAAAAAAAAAA", new Throwable("a")));
            String UUID = String.valueOf(event.getPlayer().getUniqueID());
            String msg = event.getMessage();
            if (UUID.equals(UUIDHelper.UnRealDinnerbone)) {
                event.setCanceled(true);
                MessageHelper.sendChatMessageServerWide(new TextComponentString(ColorUtils.BLUE + "<" + event.getUsername() + "™" + "> " + msg));
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
                    EntityItem entityItem = new EntityItem(event.getEntityLiving().worldObj);
                    entityItem.setEntityItemStack(ItemStacks.ItemEmerald(1));
                    entityItem.setPosition(event.getEntityLiving().posX, event.getEntityLiving().posY, event.getEntityLiving().posZ);
                    event.getEntityLiving().worldObj.spawnEntityInWorld(entityItem);
                }
            }
        }
    }

    @SubscribeEvent
    public void entityJoinWorld (EntityJoinWorldEvent event) {

        if (event.getEntity() instanceof AbstractClientPlayer) {

            final AbstractClientPlayer player = (AbstractClientPlayer) event.getEntity();
            final SupporterData data = StatsGetter.getSupporterData(player);

            if (data != null) {
                PlayerHelper.makePlayerFancy(player, data.getCapeTexture(), data.getElytraTexture());
            }
        }
    }
}
