package com.unrealdinnerbone.yarm.item.Tools;

import com.unrealdinnerbone.yarm.CreativeTab.Tab;
import com.unrealdinnerbone.yarm.reference.Reference;
import net.minecraft.item.Item;
import net.minecraft.item.ItemAxe;
import net.minecraftforge.fml.common.registry.GameRegistry;
import reborncore.api.IItemTexture;
import reborncore.api.TextureRegistry;

public class ItemToolOpAxe extends ItemAxe implements IItemTexture {

    private static String name = "ToolOpAxe";

    public ItemToolOpAxe(ToolMaterial material) {

        super(material);
        this.setCreativeTab(Tab.Yarm_Tab);
        this.setUnlocalizedName(Reference.RE_PREFIX + name);
        TextureRegistry.registerItem(this);
    }

    public static String getName() {
        return name;
    }

    @Override
    public String getTextureName(int damage) {
        return Reference.TEXTURE_PATH_ITEM + "debug";
    }

    @Override
    public int getMaxMeta() {
        return 1;
    }

    @Override
    public String getModID() {
        return Reference.MOD_ID;
    }
}