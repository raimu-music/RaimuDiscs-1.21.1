package ch.raimu.raimudiscs.sound;

import ch.raimu.raimudiscs.RaimuDiscsMod;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.item.JukeboxSong;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModSounds {
    public static final DeferredRegister<SoundEvent> SOUND_EVENTS =
            DeferredRegister.create(BuiltInRegistries.SOUND_EVENT, RaimuDiscsMod.MOD_ID);



    public static final Supplier<SoundEvent> BLUE_DAWN = registerSoundEvent("blue_dawn");
    public static final ResourceKey<JukeboxSong> BLUE_DAWN_KEY = createSong("blue_dawn");

    public static final Supplier<SoundEvent> OVERGROWN = registerSoundEvent("overgrown");
    public static final ResourceKey<JukeboxSong> OVERGROWN_KEY = createSong("overgrown");

    public static final Supplier<SoundEvent> NATSUKASHII = registerSoundEvent("natsukashii");
    public static final ResourceKey<JukeboxSong> NATSUKASHII_KEY = createSong("natsukashii");

    public static final Supplier<SoundEvent> KAZE_NI_NATTE = registerSoundEvent("kaze_ni_natte");
    public static final ResourceKey<JukeboxSong> KAZE_NI_NATTE_KEY = createSong("kaze_ni_natte");

    public static final Supplier<SoundEvent> DANDELIONS_LULLABY = registerSoundEvent("dandelions_lullaby");
    public static final ResourceKey<JukeboxSong> DANDELIONS_LULLABY_KEY = createSong("dandelions_lullaby");

    public static final Supplier<SoundEvent> NAP_TIME_IN_SHIBUYA = registerSoundEvent("nap_time_in_shibuya");
    public static final ResourceKey<JukeboxSong> NAP_TIME_IN_SHIBUYA_KEY = createSong("nap_time_in_shibuya");

    public static final Supplier<SoundEvent> EARTH_CALLING = registerSoundEvent("earth_calling");
    public static final ResourceKey<JukeboxSong> EARTH_CALLING_KEY = createSong("earth_calling");

    private static ResourceKey<JukeboxSong> createSong(String name) {
        return ResourceKey.create(Registries.JUKEBOX_SONG, ResourceLocation.fromNamespaceAndPath(RaimuDiscsMod.MOD_ID, name));

    }




    private static Supplier<SoundEvent> registerSoundEvent(String name) {
        ResourceLocation id = ResourceLocation.fromNamespaceAndPath((RaimuDiscsMod.MOD_ID), name);
        return SOUND_EVENTS.register(name,() -> SoundEvent.createVariableRangeEvent(id));
    }

    public static void register(IEventBus eventBus) {
        SOUND_EVENTS.register(eventBus);
    }
}
