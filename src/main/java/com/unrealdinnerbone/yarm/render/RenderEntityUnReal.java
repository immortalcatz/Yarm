package com.unrealdinnerbone.yarm.render;

import com.unrealdinnerbone.yarm.entity.entityUnReal;
import com.unrealdinnerbone.yarm.Util.Reference;

import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;

@SideOnly(Side.CLIENT)
public class RenderEntityUnReal extends RenderLiving
{
    private static final ResourceLocation entityTextures = new ResourceLocation(Reference.MOD_ID +  ":textures/entity/entityUnReal.png");
    private static final String __OBFID = "CL_00000984";

    public RenderEntityUnReal(RenderManager rendermanagerIn, ModelBase modelbaseIn, float shadowsizeIn)
    {
        super(rendermanagerIn, modelbaseIn, shadowsizeIn);
   }

    protected ResourceLocation getEntityTexture(entityUnReal p_110775_1_)
    {
        return entityTextures;
    }

    protected ResourceLocation getEntityTexture(Entity p_110775_1_)
    {
        return this.getEntityTexture((entityUnReal)p_110775_1_);
    }
}