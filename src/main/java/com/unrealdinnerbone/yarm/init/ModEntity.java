package com.unrealdinnerbone.yarm.init;

import com.unrealdinnerbone.yarm.Util.LogHelper;
import com.unrealdinnerbone.yarm.yarm;
import net.minecraft.block.material.Material;
import net.minecraft.entity.EntityList;
import net.minecraft.world.WorldType;

import com.unrealdinnerbone.yarm.entity.entityUnReal;

import cpw.mods.fml.common.registry.EntityRegistry;

public class ModEntity
{
    public static void initEntity()
    {
        createEntity(entityUnReal.class, "entityUnReal", 0x535353, 0xB8B8B8);
        createEntity(com.unrealdinnerbone.yarm.entity.entityManmaed.class, "entityManmaed", 0x535353, 0xB8B8B8);
        // How To Regsiter An Enity
        // createEntity(entityclassname, "entityname", firsteggcolor, secondaryeggcolor);
    }

    public static void createEntity(Class entityClass, String entityName, int eggPrimaryColor, int eggSecondaryColor)
    {
        int RandomId = EntityRegistry.findGlobalUniqueEntityId();

        EntityRegistry.registerGlobalEntityID(entityClass, entityName, RandomId);
        EntityRegistry.registerModEntity(entityClass, entityName, RandomId, yarm.instance, 64, 1, true);
        createEgg(RandomId, eggPrimaryColor, eggSecondaryColor);
    }

    private static void createEgg(int RandomId, int eggPrimaryColor, int eggSecondaryColor)
    {
        EntityList.entityEggs.put(Integer.valueOf(RandomId), new EntityList.EntityEggInfo(RandomId, eggPrimaryColor, eggSecondaryColor));
        LogHelper.info("Loaded Entity's");
    }
}
