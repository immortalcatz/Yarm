package com.unrealdinnerbone.yarm.entity;

import com.unrealdinnerbone.yarm.init.ModItems;
import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.passive.EntityAnimal;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class enityYarm extends EntityAnimal {

    public enityYarm(World world)
    {
        super(world);
        this.setSize(1.0F, 2.0F);
    }

    @Override
    protected boolean isAIEnabled()
    {
        return true;
    }

    @Override
    protected void applyEntityAttributes()
    {
        super.applyEntityAttributes();
        this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(20.0D);
        this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(0.5D);
        this.getEntityAttribute(SharedMonsterAttributes.followRange).setBaseValue(0.5D);
    }

    protected Item getDropItem()
    {
        ItemStack item = new ItemStack(ModItems.UnRealFace);
        this.entityDropItem(item, 0.0F);
        return Item.getItemById(0);
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

