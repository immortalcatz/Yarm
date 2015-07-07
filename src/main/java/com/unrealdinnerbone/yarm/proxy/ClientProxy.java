package com.unrealdinnerbone.yarm.proxy;

import com.unrealdinnerbone.yarm.client.models.UnRealModel;
import com.unrealdinnerbone.yarm.entity.entityUnReal;
import com.unrealdinnerbone.yarm.render.RenderEntityUnReal;
import cpw.mods.fml.client.registry.RenderingRegistry;

/**
 * Created by UnRealDinnerbone on 6/3/2015.
 */
public class ClientProxy extends CommonProxy
{
    public static void registerRendering()
    {
        RenderingRegistry.registerEntityRenderingHandler(entityUnReal.class, new RenderEntityUnReal(new UnRealModel(), 0));
    }
}