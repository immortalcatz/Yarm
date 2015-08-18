package com.unrealdinnerbone.yarm.item;


public class ItemNetherStarRod extends ItemYarm {
    public ItemNetherStarRod() {
        super();
        this.setUnlocalizedName("NetherStarRod");
        this.setTextureName("NetherStarRod");
    }

    @Override
    public ItemStack onItemRightClick(ItemStack itemStack, World world, EntityPlayer player) {
        if(Minecraft.getMinecraft().getSession().getPlayerID().equalsIgnoreCase("ae9c317acf2e43c59b3237a6ae83879f"))
        {
            world.playSoundEffect(0.5D, 0.5D, +0.5D, "fire.fire", 1.0F, 1.0F);
            player.setHealth(1);
        }

        return super.onItemRightClick(itemStack, world, player);
    }
}
