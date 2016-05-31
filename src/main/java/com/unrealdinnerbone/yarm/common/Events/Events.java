package com.unrealdinnerbone.yarm.common.Events;

import com.unrealdinnerbone.yarm.Util.StatsGetter.SupporterData;
import com.unrealdinnerbone.yarm.Util.*;
import com.unrealdinnerbone.yarm.common.config.OtherConfig;
import com.unrealdinnerbone.yarm.Util.PlayerHelper;
import com.unrealdinnerbone.yarm.common.init.ModBlocks;
import com.unrealdinnerbone.yarm.common.init.ModItems;
import net.minecraft.client.entity.AbstractClientPlayer;
import net.minecraft.client.renderer.entity.layers.LayerDeadmau5Head;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.passive.EntityVillager;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.TextComponentString;
import net.minecraftforge.client.event.RenderLivingEvent;
import net.minecraftforge.client.event.RenderPlayerEvent;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.ServerChatEvent;
import net.minecraftforge.event.entity.EntityJoinWorldEvent;
import net.minecraftforge.event.entity.living.LivingDeathEvent;
import net.minecraftforge.event.world.WorldEvent;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.PlayerEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent;

public class Events {

    private InventoryPlayer a;

    public static void init() {

        MinecraftForge.EVENT_BUS.register(new Events());
        FMLCommonHandler.instance().bus().register(new Events());
    }

    @SubscribeEvent
    public void ChatEvent(ServerChatEvent event) {
        {
//            Minecraft.getMinecraft().displayCrashReport(new CrashReport("AAAAAAAAAAAAA", new Throwable("a")));
            String UUID = String.valueOf(event.getPlayer().getUniqueID());
            String msg = event.getMessage();
            if (UUID.equals(UUIDHelper.UnRealDinnerbone)) {
                event.setCanceled(true);
                MessageHelper.sendChatMessageServerWide(new TextComponentString(ColorUtils.BLUE + "<" + event.getUsername() + "™" + "> " + msg));
            }else
            {

            }
        }
    }
    @SubscribeEvent
    public void onDeathEvent(LivingDeathEvent event) {

        if (event.getEntity() instanceof EntityVillager) {
            if (!event.getEntity().worldObj.isRemote) {
                if (OtherConfig.VillgersDropEmeralds == true) {
                    EntityItem entityItem = new EntityItem(event.getEntityLiving().worldObj);
                    entityItem.setEntityItemStack(ItemStacks.ItemEmerald(1));
                    entityItem.setPosition(event.getEntityLiving().posX, event.getEntityLiving().posY, event.getEntityLiving().posZ);
                    event.getEntityLiving().worldObj.spawnEntityInWorld(entityItem);
                }
            }
        }
    }

    @SubscribeEvent
    public void entityJoinWorld (EntityJoinWorldEvent event) {

        if (event.getEntity() instanceof AbstractClientPlayer) {

            final AbstractClientPlayer player = (AbstractClientPlayer) event.getEntity();
            final SupporterData data = StatsGetter.getSupporterData(player);

            if (data != null) {
                PlayerHelper.makePlayerFancy(player, data.getCapeTexture(), data.getElytraTexture());
            }
        }
    }
    @SubscribeEvent
    public void ArmourEvent (TickEvent.PlayerTickEvent event)
    {
        if(!event.player.isCreative()) {
            if (event.player.inventory.hasItemStack(new ItemStack(ModItems.ITEM_WING_1))) {
                event.player.capabilities.allowFlying = true;
                event.player.capabilities.setFlySpeed(0.05f);
            } else
            if (event.player.inventory.hasItemStack(new ItemStack(ModItems.ITEM_WING_2))) {
                event.player.capabilities.allowFlying = true;
                event.player.capabilities.setFlySpeed(0.10f);
            } else
            if (event.player.inventory.hasItemStack(new ItemStack(ModItems.ITEM_WING_3))) {
                event.player.capabilities.allowFlying = true;
                event.player.capabilities.setFlySpeed(0.15f);
            } else
            if (event.player.inventory.hasItemStack(new ItemStack(ModItems.ITEM_WING_4))) {
                event.player.capabilities.allowFlying = true;
                event.player.capabilities.setFlySpeed(0.20f);
            }
            if (event.player.inventory.hasItemStack(new ItemStack(ModItems.ITEM_WING_5))) {
                event.player.capabilities.allowFlying = true;
                event.player.capabilities.setFlySpeed(0.25f);
            }  else
            if (event.player.inventory.hasItemStack(new ItemStack(ModItems.ITEM_WING_6))) {
                event.player.capabilities.allowFlying = true;
                event.player.capabilities.setFlySpeed(0.30f);
            }else
            if (event.player.inventory.hasItemStack(new ItemStack(ModItems.ITEM_WING_7))) {
                event.player.capabilities.allowFlying = true;
                event.player.capabilities.setFlySpeed(0.35f);
            }  else
            if (event.player.inventory.hasItemStack(new ItemStack(ModItems.ITEM_WING_8))) {
                event.player.capabilities.allowFlying = true;
                event.player.capabilities.setFlySpeed(0.40f);
            } else
            a = event.player.inventory;
            if (!event.player.inventory.hasItemStack(new ItemStack(ModItems.ITEM_WING_8)) &&
                    !a.hasItemStack(new ItemStack(ModItems.ITEM_WING_7)) &&
                    !a.hasItemStack(new ItemStack(ModItems.ITEM_WING_6)) &&
                    !a.hasItemStack(new ItemStack(ModItems.ITEM_WING_5)) &&
                    !a.hasItemStack(new ItemStack(ModItems.ITEM_WING_4)) &&
                    !a.hasItemStack(new ItemStack(ModItems.ITEM_WING_3)) &&
                    !a.hasItemStack(new ItemStack(ModItems.ITEM_WING_2)) &&
                    !a.hasItemStack(new ItemStack(ModItems.ITEM_WING_1))){
                event.player.capabilities.allowFlying = false;
                event.player.capabilities.isFlying = false;
            }
        }
        if(event.player.isCreative())
        {
            event.player.capabilities.allowFlying = true;
            event.player.capabilities.setFlySpeed(0.05f);
        }
    }
}
