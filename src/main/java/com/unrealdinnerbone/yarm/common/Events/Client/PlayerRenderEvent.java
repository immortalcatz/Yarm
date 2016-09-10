package com.unrealdinnerbone.yarm.common.Events.Client;

import com.unrealdinnerbone.yarm.Util.StatsGetter;
import com.unrealdinnerbone.yarm.common.config.ClientConfig;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraftforge.client.event.RenderPlayerEvent;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class PlayerRenderEvent
{
    int SpingCount = 0;

    public static void init()
    {
        MinecraftForge.EVENT_BUS.register(new PlayerRenderEvent());
    }
    @SubscribeEvent
    public void RenderPlayerEvent(RenderPlayerEvent.Pre event)
    {
         final StatsGetter.SupporterData data = StatsGetter.getSupporterData(event.getEntityPlayer());

        GlStateManager.pushMatrix();
        String UUID = String.valueOf(event.getEntityPlayer().getUniqueID());
        if (data.isDinnerbone()) {
            if(ClientConfig.playerRoating) {
                if (SpingCount > 360) {
                    SpingCount = 0;
                }
                float bf = 2f;
                GlStateManager.rotate(SpingCount++, 0, 0, 1);
                GlStateManager.translate(0f, -bf, 0f);
            }
            if(!ClientConfig.playerRoating)
            {
                GlStateManager.rotate(180, 0, 0, 1);
                GlStateManager.translate(0f, -2f, 0f);
            }
        }
    }

    @SubscribeEvent
    public void RenderPlayerEventLate(RenderPlayerEvent.Post event)
    {
        final StatsGetter.SupporterData data = StatsGetter.getSupporterData(event.getEntityPlayer());

        String UUID = String.valueOf(event.getEntityPlayer().getUniqueID());
        if (data.isDinnerbone()) {
            GlStateManager.popMatrix();
        }
    }
}
