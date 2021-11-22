package ro.srth.srthtools.item;

import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.*;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.World;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import ro.srth.srthtools.SrthTools;

import javax.annotation.Nullable;
import java.util.List;

public class ModItems {

    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, SrthTools.MOD_ID);



    /* end of srthium items, start romium */

    public static final RegistryObject<Item> ROMIUM = ITEMS.register("romium",
            () -> new Item(new Item.Properties().group(ModItemGroup.SRTH_MODS)){
    @Override
    public void addInformation(ItemStack stack, @Nullable World worldIn,
                               List<ITextComponent> tooltip, ITooltipFlag flagIn) {
        if(Screen.hasShiftDown())
            tooltip.add(new TranslationTextComponent(("tooltip.srthtools.romium")));
        else {
            tooltip.add(new TranslationTextComponent(("tooltip.srthtools.default")));
        }

    }
});

    /* other stuff */

    public static final RegistryObject<Item> RAWURANIUM = ITEMS.register("rawuranium",
            () -> new Item(new Item.Properties().group(ModItemGroup.SRTH_MODS)){
                @Override
                public void addInformation(ItemStack stack, @Nullable World worldIn,
                                           List<ITextComponent> tooltip, ITooltipFlag flagIn) {
                    if(Screen.hasShiftDown())
                        tooltip.add(new TranslationTextComponent(("tooltip.srthtools.rawuranium")));
                    else {
                        tooltip.add(new TranslationTextComponent(("tooltip.srthtools.default")));
                    }

                }
            });




    public static  void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

}
