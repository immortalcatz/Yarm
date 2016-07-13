package com.unrealdinnerbone.yarm.common.entitys;

import com.unrealdinnerbone.yarm.common.init.ModItems;

import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class entityUnReal extends enityYarmPlayer {

    public entityUnReal(World world) {
        super(world);
    }

    protected Item getDropItem() {
        ItemStack item = new ItemStack(ModItems.Item_UnRealFace);
        this.entityDropItem(item, 0.0F);
        return Item.getItemById(0);
    }

    @Override
    protected void applyEntityAttributes()
    {
        super.applyEntityAttributes();
        this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.30000001192092896D);

        if (this.isTamed())
        {
            this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(20.0D);
        }
        else
        {
            this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(8.0D);
        }

        this.getAttributeMap().registerAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).setBaseValue(4.0D);
        this.getAttributeMap().registerAttribute(SharedMonsterAttributes.ARMOR).setBaseValue(10);
    }

}