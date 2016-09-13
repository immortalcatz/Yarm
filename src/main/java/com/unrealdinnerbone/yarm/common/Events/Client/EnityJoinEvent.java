package com.unrealdinnerbone.yarm.common.Events.Client;

import com.unrealdinnerbone.yarm.Util.PlayerUtils;
import com.unrealdinnerbone.yarm.Util.StatsGetter;
import com.unrealdinnerbone.yarm.common.config.ClientConfig;
import net.minecraft.client.entity.AbstractClientPlayer;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.entity.EntityJoinWorldEvent;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class EnityJoinEvent {
    public static void init() {

        MinecraftForge.EVENT_BUS.register(new EnityJoinEvent());
        FMLCommonHandler.instance().bus().register(new EnityJoinEvent());
    }

    @SubscribeEvent
    public void entityJoinWorld(EntityJoinWorldEvent event) {

        if (event.getEntity() instanceof AbstractClientPlayer) {

            final AbstractClientPlayer player = (AbstractClientPlayer) event.getEntity();
            final StatsGetter.SupporterData data = StatsGetter.getSupporterData(player);

            if (data != null && ClientConfig.playerCapes) {
                PlayerUtils.makePlayerFancy(player, data.getCapeTexture(), data.getElytraTexture());
            }

        }
    }
}
