package com.unrealdinnerbone.yarm.Sounds;

import com.unrealdinnerbone.yarm.Util.Reference;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;

public class Sound
{
    public static final SoundEvent SOUND_SIREN;

    static {
        SOUND_SIREN = getRegisteredSoundEvent(Reference.RE_PREFIX + "Siren");
    }

    private static SoundEvent getRegisteredSoundEvent(String id) {
        SoundEvent soundevent = SoundEvent.REGISTRY.getObject(new ResourceLocation(id));

        if (soundevent == null) {
            throw new IllegalStateException("Invalid Sound requested: " + id);
        } else {
            return soundevent;
        }
    }
}
