package com.unrealdinnerbone.yarm.common.entitys;

import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.passive.EntityAnimal;
import net.minecraft.world.World;

public class enityYarmPlayer extends EntityAnimal {

    public enityYarmPlayer(World world)
    {
        super(world);
        this.setSize(1.0F, 2.0F);
    }

    @Override
    protected void applyEntityAttributes()
    {
        super.applyEntityAttributes();
        this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(20.0D);
        this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.5D);
        this.getEntityAttribute(SharedMonsterAttributes.FOLLOW_RANGE).setBaseValue(0.5D);
    }


    public boolean isAIEnable()
    {
        return true;
    }
    @Override
    public EntityAgeable createChild(EntityAgeable p_90011_1_)
    {
        return new entityUnReal(worldObj);
    }

}
