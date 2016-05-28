package com.unrealdinnerbone.yarm.Events;

import com.unrealdinnerbone.yarm.Util.StatsGetter.SupporterData;
import com.mojang.authlib.minecraft.MinecraftProfileTexture;
import com.unrealdinnerbone.yarm.Util.*;
import com.unrealdinnerbone.yarm.config.OtherConfig;
import net.darkhax.bookshelf.lib.VanillaColor;
import net.darkhax.bookshelf.lib.util.RenderUtils;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.AbstractClientPlayer;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.passive.EntityVillager;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.text.TextComponentString;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.ServerChatEvent;
import net.minecraftforge.event.entity.EntityJoinWorldEvent;
import net.minecraftforge.event.entity.living.LivingDeathEvent;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;


public class Events {

    private static final ExecutorService THREAD_POOL = new ThreadPoolExecutor(0, 2, 1L, TimeUnit.MINUTES, new LinkedBlockingQueue());

    private static final ResourceLocation CAPE_UNREALDINNERBONE = new ResourceLocation("yarm", "textures/entity/player/cape_UnRealDinnerbone.png");
    private static final ResourceLocation ELYTRA_UNREALDINNERBONE = new ResourceLocation("yarm", "textures/entity/player/elytra_UnRealDinnerbone.png");
	private static final ResourceLocation CAPE_MANMAED = new ResourceLocation("yarm", "textures/entity/player/cape_manmaed.png");
    private static final ResourceLocation ELYTRA_MANMAED = new ResourceLocation("yarm", "textures/entity/player/elytra_manmaed.png");


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
                OpChecker.sendChatMessageServerWide(new TextComponentString(VanillaColor.BLUE + "<" + event.getUsername() + "™" + "> " + msg));
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

    @SubscribeEvent
    public void entityJoinWorld (EntityJoinWorldEvent event) {

        if (event.getEntity() instanceof AbstractClientPlayer) {

            final AbstractClientPlayer player = (AbstractClientPlayer) event.getEntity();
            final SupporterData data = StatsGetter.getSupporterData(player);

            if (data != null)
                makePlayerFancy(player, data.getCapeTexture(), data.getElytraTexture());
        }
    }
    private static void makePlayerFancy (final AbstractClientPlayer player, final ResourceLocation cape, final ResourceLocation elytra) {

        System.out.println(cape.toString());
        System.out.println(elytra.toString());
        THREAD_POOL.submit(new Runnable() {

            @Override
            public void run () {

                try {

                    Thread.sleep(100);
                }
                catch (final InterruptedException e) {

                    return;
                }

                Minecraft.getMinecraft().addScheduledTask(new Runnable() {

                    @Override
                    public void run () {

                        RenderUtils.setPlayerTexture(MinecraftProfileTexture.Type.CAPE, player, cape);
                        RenderUtils.setPlayerTexture(MinecraftProfileTexture.Type.ELYTRA, player, elytra);
                    }
                });
            }
        });
    }
}
