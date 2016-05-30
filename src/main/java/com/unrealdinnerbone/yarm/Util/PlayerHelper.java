package com.unrealdinnerbone.yarm.Util;

import com.mojang.authlib.minecraft.MinecraftProfileTexture.Type;

import com.mojang.authlib.minecraft.MinecraftProfileTexture;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.AbstractClientPlayer;
import net.minecraft.client.model.ModelPlayer;
import net.minecraft.entity.player.EnumPlayerModelParts;
import net.minecraft.util.ResourceLocation;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class PlayerHelper
{
    private static final ExecutorService THREAD_POOL = new ThreadPoolExecutor(0, 2, 1L, TimeUnit.MINUTES, new LinkedBlockingQueue());

    public static void makePlayerFancy (final AbstractClientPlayer player, final ResourceLocation cape, final ResourceLocation elytra) {

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

                        changePlayerTexture(MinecraftProfileTexture.Type.CAPE, player, cape);
                        changePlayerTexture(MinecraftProfileTexture.Type.ELYTRA, player, elytra);
                    }
                });
            }
        });
    }


    public static boolean changePlayerTexture (Type type, AbstractClientPlayer player, ResourceLocation texture) {
        if (player.hasPlayerInfo())
        {
            if(texture != null)
            {

                player.getPlayerInfo().playerTextures.put(type, texture);
            }
            return true;
        }
        return false;
    }

}
