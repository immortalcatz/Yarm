//package com.unrealdinnerbone.yarm.client.render;
//
//import net.minecraft.client.Minecraft;
//import net.minecraft.client.renderer.GlStateManager;
//import net.minecraft.client.renderer.entity.layers.LayerRenderer;
//import net.minecraft.entity.player.EntityPlayer;
//import net.minecraft.util.ResourceLocation;
//
//public class RenderOnPlayer implements LayerRenderer<EntityPlayer> {
//
//    public ModelTopHat modelTopHat = new ModelTopHat();
//    public static final ResourceLocation texTopHat = new ResourceLocation("betterthanbunnies", "textures/model/tophat.png");
//
//    @Override
//    public void doRenderLayer(EntityPlayer entityPlayer, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch, float scale) {
//        if(!entityPlayer.isInvisible()) {
//            Minecraft.getMinecraft().getTextureManager().bindTexture(texTopHat);
//            GlStateManager.enableBlend();
//            GlStateManager.blendFunc(770, 771);
//            GlStateManager.pushMatrix();
//            float resize = 0.6F;
//            GlStateManager.scale(resize, resize, resize);
//            float posX = 0.0F;
//            float posY = 2.0F;
//            float posZ = -0.0625F;
//            if(entityPlayer.isChild()) {
//                posY = 2.25F;
//                posZ = 0.0625F;
//            }
//
//            GlStateManager.translate(posX, posY, posZ);
//            GlStateManager.rotate(interpolateValues(entityPlayer.prevRotationYawHead, entityPlayer.rotationYawHead, partialTicks) - interpolateValues(entityPlayer.prevRenderYawOffset , entityPlayer.renderYawOffset, partialTicks), 0.0F, 1.0F, 0.0F);
//            GlStateManager.rotate(interpolateValues(entityPlayer.prevRotationPitch, entityPlayer.rotationPitch, partialTicks), 1.0F, 0.0F, 0.0F);
//            GlStateManager.translate(0.0F, -0.21875F, -0.15625F);
//            scale = 0.71428573F;
//            GlStateManager.scale(scale, scale, scale);
//            this.modelTopHat.render(0.0625F);
//            GlStateManager.popMatrix();
//            GlStateManager.disableBlend();
//        }
//    }
//
//    public static float interpolateValues(float prevVal, float nextVal, float partialTick) {
//        return prevVal + partialTick * (nextVal - prevVal);
//    }
//
//    public boolean shouldCombineTextures() {
//        return false;
//    }
//}
