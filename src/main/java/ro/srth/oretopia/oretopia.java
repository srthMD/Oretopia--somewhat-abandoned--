package ro.srth.oretopia;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IItemProvider;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.InterModComms;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.lifecycle.InterModEnqueueEvent;
import net.minecraftforge.fml.event.lifecycle.InterModProcessEvent;
import net.minecraftforge.fml.event.server.FMLServerStartingEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import ro.srth.oretopia.block.ModBlocks;
import ro.srth.oretopia.item.ModItems;
import ro.srth.oretopia.util.ModSoundEvents;
/* im sorry can i have the kids back now */
import java.util.stream.Collectors;

@Mod(oretopia.MOD_ID)
public class oretopia
{
    //item group
        public static final ItemGroup ORETOPIAITEMGROUP = new ItemGroup("ORETOPIAITEMGROUP") {
            @Override
            public ItemStack createIcon() {
                return new ItemStack(ModItems.ENCHANTEDESSENCE.get());
            }
        };
    public static final String MOD_ID = "oretopia";
    private static final Logger LOGGER = LogManager.getLogger();

    public oretopia() {
        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ModItems.register(eventBus);
        ModBlocks.register(eventBus);
        ModSoundEvents.register((eventBus));

        MinecraftForge.EVENT_BUS.register(this);
    }

    @Mod.EventBusSubscriber(bus=Mod.EventBusSubscriber.Bus.MOD)
    public static class RegistryEvents {
        @SubscribeEvent
        public static void onBlocksRegistry(final RegistryEvent.Register<Block> blockRegistryEvent) {
            LOGGER.info("");
        }
    }
}