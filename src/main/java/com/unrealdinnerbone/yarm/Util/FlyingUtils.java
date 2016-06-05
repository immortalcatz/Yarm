package com.unrealdinnerbone.yarm.Util;

import net.minecraft.entity.player.PlayerCapabilities;

public class FlyingUtils
{

    public static void SetFlying(PlayerCapabilities plcap, float speed)
    {
        plcap.setFlySpeed(speed);
        plcap.allowFlying = true;
    }
    public static void DenyFlight(PlayerCapabilities plcap)
    {
        plcap.setFlySpeed(0.05f);
        plcap.allowFlying = false;
    }
}
