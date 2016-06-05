package com.unrealdinnerbone.yarm.common.Events;

import com.unrealdinnerbone.yarm.Util.StatsGetter.SupporterData;
import com.unrealdinnerbone.yarm.Util.*;
import com.unrealdinnerbone.yarm.common.config.OtherConfig;
import com.unrealdinnerbone.yarm.Util.PlayerHelper;
import com.unrealdinnerbone.yarm.common.init.ModItems;
import net.minecraft.client.entity.AbstractClientPlayer;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.passive.EntityVillager;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.entity.player.PlayerCapabilities;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.TextComponentString;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.ServerChatEvent;
import net.minecraftforge.event.entity.EntityJoinWorldEvent;
import net.minecraftforge.event.entity.living.LivingDeathEvent;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent;

public class Events {

    private InventoryPlayer pl;
    private PlayerCapabilities plcap;

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
        plcap = event.player.capabilities;
        pl = event.player.inventory;

        if(!event.player.isCreative() && !event.player.isSpectator())
        {
            if (pl.hasItemStack(new ItemStack(ModItems.ITEM_WING_8))) {
                FlyingUtils.SetFlying(plcap, 0.40f);
            } else
            if (pl.hasItemStack(new ItemStack(ModItems.ITEM_WING_7))) {
                FlyingUtils.SetFlying(plcap, 0.35f);
            } else
            if (pl.hasItemStack(new ItemStack(ModItems.ITEM_WING_6))) {
                FlyingUtils.SetFlying(plcap, 0.30f);
            } else
            if (pl.hasItemStack(new ItemStack(ModItems.ITEM_WING_5))) {
                FlyingUtils.SetFlying(plcap, 0.25f);
            } else
            if (pl.hasItemStack(new ItemStack(ModItems.ITEM_WING_4))) {
                FlyingUtils.SetFlying(plcap, 0.20f);
            }  else
            if (pl.hasItemStack(new ItemStack(ModItems.ITEM_WING_3))) {
                FlyingUtils.SetFlying(plcap, 0.15f);
            } else
            if (pl.hasItemStack(new ItemStack(ModItems.ITEM_WING_2))) {
                FlyingUtils.SetFlying(plcap, 0.10f);
            } else
            if (pl.hasItemStack(new ItemStack(ModItems.ITEM_WING_1))) {
                FlyingUtils.SetFlying(plcap, 0.05f);
            } else
            if (!event.player.inventory.hasItemStack(new ItemStack(ModItems.ITEM_WING_8)) &&
                    !pl.hasItemStack(new ItemStack(ModItems.ITEM_WING_7)) &&
                    !pl.hasItemStack(new ItemStack(ModItems.ITEM_WING_6)) &&
                    !pl.hasItemStack(new ItemStack(ModItems.ITEM_WING_5)) &&
                    !pl.hasItemStack(new ItemStack(ModItems.ITEM_WING_4)) &&
                    !pl.hasItemStack(new ItemStack(ModItems.ITEM_WING_3)) &&
                    !pl.hasItemStack(new ItemStack(ModItems.ITEM_WING_2)) &&
                    !pl.hasItemStack(new ItemStack(ModItems.ITEM_WING_1))){
                FlyingUtils.DenyFlight(plcap);
            }
        }
    }
}
