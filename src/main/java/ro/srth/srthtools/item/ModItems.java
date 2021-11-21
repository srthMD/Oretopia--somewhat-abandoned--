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

 /* start of srthium items */

    public static final RegistryObject<Item> SRTHIUM = ITEMS.register("srthium",
            () -> new Item(new Item.Properties().isImmuneToFire().maxStackSize(69 /* haha funny number hahahahah getting in the way of code i love it, stack size dosent even work lol */).group(ModItemGroup.SRTH_MODS)){
                @Override
                public void addInformation(ItemStack stack, @Nullable World worldIn,
                                           List<ITextComponent> tooltip, ITooltipFlag flagIn) {
                    if(Screen.hasShiftDown())
                        tooltip.add(new TranslationTextComponent(("tooltip.srthtools.srthium")));
                    else {
                    tooltip.add(new TranslationTextComponent(("tooltip.srthtools.default")));
                    }

                }
            });

    public static final RegistryObject<Item> SRTHIUMNUGGET = ITEMS.register("srthiumnugget",
            () -> new Item(new Item.Properties().group(ModItemGroup.SRTH_MODS)){
    @Override
    public void addInformation(ItemStack stack, @Nullable World worldIn,
                               List<ITextComponent> tooltip, ITooltipFlag flagIn) {
        if(Screen.hasShiftDown())
            tooltip.add(new TranslationTextComponent(("tooltip.srthtools.srthiumnugget")));
        else {
            tooltip.add(new TranslationTextComponent(("tooltip.srthtools.default")));
        }

    }
});

    public static final RegistryObject<Item> SRTHIUMSWORD = ITEMS.register("srthiumsword",
            () -> new SwordItem(ModItemTier.SRTHIUM, 2, 1f,
                    new Item.Properties().group(ModItemGroup.SRTH_MODS)){
                @Override
                public void addInformation(ItemStack stack, @Nullable World worldIn,
                                           List<ITextComponent> tooltip, ITooltipFlag flagIn) {
                    if(Screen.hasShiftDown())
                        tooltip.add(new TranslationTextComponent(("tooltip.srthtools.srthiumsword")));
                    else {
                        tooltip.add(new TranslationTextComponent(("tooltip.srthtools.default")));
                    }

                }
            });


    public static final RegistryObject<Item> SRTHIUMPICKAXE = ITEMS.register("srthiumpickaxe",
            () -> new PickaxeItem(ModItemTier.SRTHIUM, -1, -1f,
                    new Item.Properties().group(ModItemGroup.SRTH_MODS)){
                @Override
                public void addInformation(ItemStack stack, @Nullable World worldIn,
                                           List<ITextComponent> tooltip, ITooltipFlag flagIn) {
                    if(Screen.hasShiftDown())
                        tooltip.add(new TranslationTextComponent(("tooltip.srthtools.srthiumpickaxe")));
                    else {
                        tooltip.add(new TranslationTextComponent(("tooltip.srthtools.default")));
                    }

                }
            });


    public static final RegistryObject<Item> SRTHIUMAXE = ITEMS.register("srthiumaxe",
            () -> new AxeItem(ModItemTier.SRTHIUM, 5, -3f,
                    new Item.Properties().group(ModItemGroup.SRTH_MODS)){
                @Override
                public void addInformation(ItemStack stack, @Nullable World worldIn,
                                           List<ITextComponent> tooltip, ITooltipFlag flagIn) {
                    if(Screen.hasShiftDown())
                        tooltip.add(new TranslationTextComponent(("tooltip.srthtools.srthiumaxe")));
                    else {
                        tooltip.add(new TranslationTextComponent(("tooltip.srthtools.default")));
                    }

                }
            });




    public static final RegistryObject<Item> SRTHIUMSHOVEL = ITEMS.register("srthiumshovel",
            () -> new ShovelItem(ModItemTier.SRTHIUM, -2, -1f,
                    new Item.Properties().group(ModItemGroup.SRTH_MODS)){
    @Override
    public void addInformation(ItemStack stack, @Nullable World worldIn,
                               List<ITextComponent> tooltip, ITooltipFlag flagIn) {
        if(Screen.hasShiftDown())
            tooltip.add(new TranslationTextComponent(("tooltip.srthtools.srthiumshovel")));
        else {
            tooltip.add(new TranslationTextComponent(("tooltip.srthtools.default")));
        }

    }
});

    public static final RegistryObject<Item> SRTHIUMHOE = ITEMS.register("srthiumhoe",
            () -> new HoeItem(ModItemTier.SRTHIUM, -5, -1f,
                    new Item.Properties().group(ModItemGroup.SRTH_MODS)){
    @Override
    public void addInformation(ItemStack stack, @Nullable World worldIn,
                               List<ITextComponent> tooltip, ITooltipFlag flagIn) {
        if(Screen.hasShiftDown())
            tooltip.add(new TranslationTextComponent(("tooltip.srthtools.srthiumhoe")));
        else {
            tooltip.add(new TranslationTextComponent(("tooltip.srthtools.default")));
        }

    }
});

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




    public static  void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

}
