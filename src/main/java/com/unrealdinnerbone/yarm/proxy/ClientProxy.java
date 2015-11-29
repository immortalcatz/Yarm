package com.unrealdinnerbone.yarm.proxy;

import com.unrealdinnerbone.yarm.init.ModBlocks;
import com.unrealdinnerbone.yarm.init.ModItems;

public class ClientProxy extends CommonProxy
{
    public static void registerRendering()
    {
        //RenderingRegistry.registerEntityRenderingHandler(entityUnReal.class, new RenderEntityUnReal(new UnRealModel(), 0));
    }
    public void render()
    {
        ModItems.registerItemRenderer();
        ModBlocks.renderBlocks();
    }

}