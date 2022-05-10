package ro.srth.oretopia.util;

import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import ro.srth.oretopia.oretopia;


public class ModSoundEvents {
    public static final DeferredRegister<SoundEvent> SOUND_EVENTS =
            DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, oretopia.MOD_ID);

    public static final RegistryObject<SoundEvent> MODCAVE1 =
            registerSoundevent("modcave1");

    public static final RegistryObject<SoundEvent> MODCAVE2 =
            registerSoundevent("modcave2");

    public static final RegistryObject<SoundEvent> MODCAVE3 =
            registerSoundevent("modcave3");

    public static final RegistryObject<SoundEvent> MODCAVE4 =
            registerSoundevent("modcave4");

    public static final RegistryObject<SoundEvent> MODCAVE5 =
            registerSoundevent("modcave5");

    public static final RegistryObject<SoundEvent> MODCAVE6 =
            registerSoundevent("modcave6");

    public static final RegistryObject<SoundEvent> MODCAVE7 =
            registerSoundevent("modcave7");

    public static final RegistryObject<SoundEvent> MODCAVE8 =
            registerSoundevent("modcave8");


    private static RegistryObject<SoundEvent> registerSoundevent(String name) {
        return SOUND_EVENTS.register(name, () -> new SoundEvent(new ResourceLocation(oretopia.MOD_ID, name)));
    }

    public static void register (IEventBus eventBus) {
        SOUND_EVENTS.register(eventBus);
    }
}

