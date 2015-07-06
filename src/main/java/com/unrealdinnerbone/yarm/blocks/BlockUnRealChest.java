package com.unrealdinnerbone.yarm.blocks;

import com.unrealdinnerbone.yarm.CreativeTab.Tab;
import com.unrealdinnerbone.yarm.item.ItemYarm;
import net.minecraft.block.BlockChest;
import net.minecraft.creativetab.CreativeTabs;

public class BlockUnRealChest extends BlockYarm {
    public BlockUnRealChest()
    {
        super();
        this.setBlockName("UnReal_Chest");
        this.setBlockTextureName("yarm" + ":UnReal_Chest");
        this.setCreativeTab(Tab.Yarm_Tab);
        this.setStepSound(soundTypeStone);


    }

}
