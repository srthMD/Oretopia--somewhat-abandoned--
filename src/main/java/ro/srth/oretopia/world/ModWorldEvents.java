package ro.srth.oretopia.world;

import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import ro.srth.oretopia.oretopia;
import ro.srth.oretopia.world.gen.ModOreGeneration;

@Mod.EventBusSubscriber(modid = oretopia.MOD_ID)
public class ModWorldEvents {

    @SubscribeEvent
    public static void biomeLoadingEvent(final BiomeLoadingEvent event) {
        ModOreGeneration.generateOres(event);
    }

}
