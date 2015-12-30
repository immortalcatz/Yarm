package com.unrealdinnerbone.yarm.item.Tools;

import com.unrealdinnerbone.yarm.CreativeTab.Tab;
import com.unrealdinnerbone.yarm.reference.Reference;
import net.minecraft.item.ItemSword;
import reborncore.api.IItemTexture;
import reborncore.api.TextureRegistry;

public class ItemToolOpSword extends ItemSword implements IItemTexture
{
    private final String name = "ToolOpSword";

    public ItemToolOpSword(ToolMaterial material) {
        super(material);
        this.setCreativeTab(Tab.Yarm_Tab);
        this.setUnlocalizedName(Reference.RE_PREFIX + name);
        TextureRegistry.registerItem(this);
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
