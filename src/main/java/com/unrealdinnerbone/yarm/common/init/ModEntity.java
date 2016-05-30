package com.unrealdinnerbone.yarm.common.init;

import com.unrealdinnerbone.yarm.Util.LogHelper;
import com.unrealdinnerbone.yarm.entitys.entityManmaed;
import com.unrealdinnerbone.yarm.yarm;

import com.unrealdinnerbone.yarm.entitys.entityUnReal;

import net.minecraftforge.fml.common.registry.EntityRegistry;

public class ModEntity
{
    public static void initEntity()
    {
        createEntity(entityUnReal.class, "entityUnReal", 0x535353, 0xB8B8B8);
        createEntity(entityManmaed.class, "entityManmaed", 0x535353, 0xB8B8B8);
        // How To Regsiter An Enity
        // createEntity(entityclassname, "entityname", firsteggcolor, secondaryeggcolor);
    }

    public static void createEntity(Class entityClass, String entityName, int eggPrimaryColor, int eggSecondaryColor)
    {
        EntityRegistry.registerModEntity(entityClass, entityName, 154154, yarm.instance, 64, 1, true);
        EntityRegistry.registerEgg(entityClass, eggPrimaryColor, eggSecondaryColor);
        LogHelper.info("Loaded Entity's");
    }

}
