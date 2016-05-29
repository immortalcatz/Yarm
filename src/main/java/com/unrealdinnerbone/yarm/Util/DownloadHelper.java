package com.unrealdinnerbone.yarm.Util;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.IImageBuffer;
import net.minecraft.client.renderer.ThreadDownloadImageData;
import net.minecraft.client.renderer.texture.TextureManager;
import net.minecraft.util.ResourceLocation;

public class DownloadHelper
{
    public static ResourceLocation downloadResourceLocation (String url, ResourceLocation outputResourceLocation, ResourceLocation errorResourceLocation, IImageBuffer buffer) {

        downloadResource(url, outputResourceLocation, errorResourceLocation, buffer);
        return outputResourceLocation;
    }
    public static ThreadDownloadImageData downloadResource (String url, ResourceLocation outputResourceLocation, ResourceLocation errorResourceLocation, IImageBuffer buffer) {

        final TextureManager textureManager = Minecraft.getMinecraft().getTextureManager();

        ThreadDownloadImageData imageData = (ThreadDownloadImageData) textureManager.getTexture(outputResourceLocation);

        if (imageData == null) {

            imageData = new ThreadDownloadImageData(null, url, errorResourceLocation, buffer);
            textureManager.loadTexture(outputResourceLocation, imageData);
        }

        return imageData;
    }
}
