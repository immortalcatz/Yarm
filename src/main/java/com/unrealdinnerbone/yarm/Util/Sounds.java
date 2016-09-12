package com.unrealdinnerbone.yarm.Util;

import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class Sounds {
    public static SoundEvent RickRoll;


    public static void init() {
        RickRoll = getSound("RickRoll");
    }

    private static SoundEvent getSound(String string) {
        ResourceLocation SoundRL = new ResourceLocation(Reference.MOD_ID, string);
        return GameRegistry.register(new SoundEvent(SoundRL).setRegistryName(SoundRL));
    }
}