package com.unrealdinnerbone.yarm.render;

import com.unrealdinnerbone.yarm.entity.entityUnReal;
import com.unrealdinnerbone.yarm.reference.Reference;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;

@SideOnly(Side.CLIENT)
public class RenderEntityUnReal extends RenderLiving
{
    private static final ResourceLocation entityTextures = new ResourceLocation(Reference.MOD_ID +  ":textures/entity/entityUnReal.png");
    private static final String __OBFID = "CL_00000984";

    public RenderEntityUnReal(ModelBase p_i1253_1_, float p_i1253_2_)
    {
        super(p_i1253_1_, p_i1253_2_);
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