package com.unrealdinnerbone.yarm.Util;

import com.mojang.authlib.minecraft.MinecraftProfileTexture;
import net.darkhax.bookshelf.lib.util.RenderUtils;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.AbstractClientPlayer;
import net.minecraft.util.ResourceLocation;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class PlayerHelper
{
    private static final ExecutorService THREAD_POOL = new ThreadPoolExecutor(0, 2, 1L, TimeUnit.MINUTES, new LinkedBlockingQueue());

    public static void makePlayerFancy (final AbstractClientPlayer player, final ResourceLocation cape, final ResourceLocation elytra) {

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
