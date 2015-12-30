package com.unrealdinnerbone.yarm.proxy;

import com.unrealdinnerbone.yarm.client.models.UnRealModel;
import com.unrealdinnerbone.yarm.entity.entityUnReal;
import com.unrealdinnerbone.yarm.init.ModBlocks;
import com.unrealdinnerbone.yarm.init.ModItems;
import com.unrealdinnerbone.yarm.render.RenderEntityUnReal;
import net.minecraftforge.fml.client.registry.RenderingRegistry;

public class ClientProxy extends CommonProxy
{
    public static void registerRendering()
    {
        //RenderingRegistry.registerEntityRenderingHandler(entityUnReal.class, new RenderEntityUnReal(new UnRealModel(), 0));
    }
    public void render()
    {
    }

}