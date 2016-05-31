package com.unrealdinnerbone.yarm.client.Sounds;

import com.unrealdinnerbone.yarm.Util.Reference;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;

import java.util.HashMap;
import java.util.Map;

public enum Sounds {

    Siren("Siren");

    private String sound;

    private static Map<Sounds, SoundEvent> sounds = new HashMap<>();

    public static void initSounds() {
        for (Sounds sound : Sounds.values()) {
          SoundEvent event = registerSound(new ResourceLocation(Reference.MOD_ID, sound.getSoundName()));
            sounds.put(sound, event);
        }
    }

    private static SoundEvent registerSound(ResourceLocation sound) {
        SoundEvent event = new SoundEvent(sound).setRegistryName(sound);
        SoundEvent.REGISTRY.register(-1, sound, event);
        return event;
    }

    Sounds(String sound) {
        this.sound = sound;
    }

    public String getSoundName() {
        return sound;
    }

    public SoundEvent getSound() {
        return sounds.get(this);
    }
}