package ro.srth.oretopia.item;

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
import ro.srth.oretopia.oretopia;

import javax.annotation.Nullable;
import java.util.List;

public class ModItems {

    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, oretopia.MOD_ID);


    public static final RegistryObject<Item> ROMIUM = ITEMS.register("romium",
            () -> new Item(new Item.Properties().group(ModItemGroup.oretopia)){
    @Override
    public void addInformation(ItemStack stack, @Nullable World worldIn,
                               List<ITextComponent> tooltip, ITooltipFlag flagIn) {
        if(Screen.hasShiftDown())
            tooltip.add(new TranslationTextComponent(("tooltip.oretopia.romium")));
        else {
            tooltip.add(new TranslationTextComponent(("tooltip.oretopia.default")));
        }

    }
});

    public static final RegistryObject<Item> ROMIUMNUGGET = ITEMS.register("romiumnugget",
            () -> new Item(new Item.Properties().group(ModItemGroup.oretopia)){
                @Override
                public void addInformation(ItemStack stack, @Nullable World worldIn,
                                           List<ITextComponent> tooltip, ITooltipFlag flagIn) {
                    if(Screen.hasShiftDown())
                        tooltip.add(new TranslationTextComponent(("tooltip.oretopia.romiumnugget")));
                    else {
                        tooltip.add(new TranslationTextComponent(("tooltip.oretopia.default")));
                    }

                }
            });

    public static final RegistryObject<Item> ROMIUMSWORD = ITEMS.register("romiumsword",
            () -> new SwordItem(ModItemTier.ROMIUM, 3, .5f,
                    new Item.Properties().group(ModItemGroup.oretopia)){
                @Override
                public void addInformation(ItemStack stack, @Nullable World worldIn,
                                           List<ITextComponent> tooltip, ITooltipFlag flagIn) {
                    if(Screen.hasShiftDown())
                        tooltip.add(new TranslationTextComponent(("tooltip.oretopia.romiumsword")));
                    else {
                        tooltip.add(new TranslationTextComponent(("tooltip.oretopia.default")));
                    }

                }
            });

    public static final RegistryObject<Item> ROMIUMPICKAXE = ITEMS.register("romiumpickaxe",
            () -> new PickaxeItem(ModItemTier.ROMIUM, -1, -1f,
                    new Item.Properties().group(ModItemGroup.oretopia)){
                @Override
                public void addInformation(ItemStack stack, @Nullable World worldIn,
                                           List<ITextComponent> tooltip, ITooltipFlag flagIn) {
                    if(Screen.hasShiftDown())
                        tooltip.add(new TranslationTextComponent(("tooltip.oretopia.romiumpickaxe")));
                    else {
                        tooltip.add(new TranslationTextComponent(("tooltip.oretopia.default")));
                    }

                }
            });

    public static final RegistryObject<Item> ROMIUMAXE = ITEMS.register("romiumaxe",
            () -> new AxeItem(ModItemTier.ROMIUM, 5, -3f,
                    new Item.Properties().group(ModItemGroup.oretopia)){
                @Override
                public void addInformation(ItemStack stack, @Nullable World worldIn,
                                           List<ITextComponent> tooltip, ITooltipFlag flagIn) {
                    if(Screen.hasShiftDown())
                        tooltip.add(new TranslationTextComponent(("tooltip.oretopia.romiumaxe")));
                    else {
                        tooltip.add(new TranslationTextComponent(("tooltip.oretopia.default")));
                    }

                }
            });

    public static final RegistryObject<Item> ROMIUMSHOVEL = ITEMS.register("romiumshovel",
            () -> new ShovelItem(ModItemTier.ROMIUM, -1, -1f,
                    new Item.Properties().group(ModItemGroup.oretopia)){
                @Override
                public void addInformation(ItemStack stack, @Nullable World worldIn,
                                           List<ITextComponent> tooltip, ITooltipFlag flagIn) {
                    if(Screen.hasShiftDown())
                        tooltip.add(new TranslationTextComponent(("tooltip.oretopia.romiumshovel")));
                    else {
                        tooltip.add(new TranslationTextComponent(("tooltip.oretopia.default")));
                    }

                }
            });

    public static final RegistryObject<Item> ROMIUMHOE = ITEMS.register("romiumhoe",
            () -> new HoeItem(ModItemTier.ROMIUM, -1, -1f,
                    new Item.Properties().group(ModItemGroup.oretopia)){
                @Override
                public void addInformation(ItemStack stack, @Nullable World worldIn,
                                           List<ITextComponent> tooltip, ITooltipFlag flagIn) {
                    if(Screen.hasShiftDown())
                        tooltip.add(new TranslationTextComponent(("tooltip.oretopia.romiumhoe")));
                    else {
                        tooltip.add(new TranslationTextComponent(("tooltip.oretopia.default")));
                    }

                }
            });

    public static final RegistryObject<Item> RAWURANIUM = ITEMS.register("rawuranium",
            () -> new Item(new Item.Properties().group(ModItemGroup.oretopia)){
                @Override
                public void addInformation(ItemStack stack, @Nullable World worldIn,
                                           List<ITextComponent> tooltip, ITooltipFlag flagIn) {
                    if(Screen.hasShiftDown())
                        tooltip.add(new TranslationTextComponent(("tooltip.oretopia.rawuranium")));
                    else {
                        tooltip.add(new TranslationTextComponent(("tooltip.oretopia.default")));
                    }

                }
            });

    public static final RegistryObject<Item> URANIUM = ITEMS.register("uranium",
            () -> new Item(new Item.Properties().group(ModItemGroup.oretopia)){
                @Override
                public void addInformation(ItemStack stack, @Nullable World worldIn,
                                           List<ITextComponent> tooltip, ITooltipFlag flagIn) {
                    if(Screen.hasShiftDown())
                        tooltip.add(new TranslationTextComponent(("tooltip.oretopia.uranium")));
                    else {
                        tooltip.add(new TranslationTextComponent(("tooltip.oretopia.default")));
                    }

                }
            });

    public static final RegistryObject<Item> ENRICHEDURANIUM = ITEMS.register("enricheduranium",
            () -> new Item(new Item.Properties().group(ModItemGroup.oretopia)){
                @Override
                public void addInformation(ItemStack stack, @Nullable World worldIn,
                                           List<ITextComponent> tooltip, ITooltipFlag flagIn) {
                    if(Screen.hasShiftDown())
                        tooltip.add(new TranslationTextComponent(("tooltip.oretopia.enricheduranium")));
                    else {
                        tooltip.add(new TranslationTextComponent(("tooltip.oretopia.default")));
                    }

                }
            });

    public static final RegistryObject<Item> COPPER = ITEMS.register("copper",
            () -> new Item(new Item.Properties().group(ModItemGroup.oretopia)){
                @Override
                public void addInformation(ItemStack stack, @Nullable World worldIn,
                                           List<ITextComponent> tooltip, ITooltipFlag flagIn) {
                    if(Screen.hasShiftDown())
                        tooltip.add(new TranslationTextComponent(("tooltip.oretopia.copper")));
                    else {
                        tooltip.add(new TranslationTextComponent(("tooltip.oretopia.default")));
                    }

                }
            });

    public static final RegistryObject<Item> COPPERNUGGET = ITEMS.register("coppernugget",
            () -> new Item(new Item.Properties().group(ModItemGroup.oretopia)){
                @Override
                public void addInformation(ItemStack stack, @Nullable World worldIn,
                                           List<ITextComponent> tooltip, ITooltipFlag flagIn) {
                    if(Screen.hasShiftDown())
                        tooltip.add(new TranslationTextComponent(("tooltip.oretopia.coppernugget")));
                    else {
                        tooltip.add(new TranslationTextComponent(("tooltip.oretopia.default")));
                    }

                }
            });

    public static final RegistryObject<Item> TUNGSTEN = ITEMS.register("tungsten",
            () -> new Item(new Item.Properties().isImmuneToFire().group(ModItemGroup.oretopia)){
                @Override
                public void addInformation(ItemStack stack, @Nullable World worldIn,
                                           List<ITextComponent> tooltip, ITooltipFlag flagIn) {
                    if(Screen.hasShiftDown())
                        tooltip.add(new TranslationTextComponent(("tooltip.oretopia.tungsten")));
                    else {
                        tooltip.add(new TranslationTextComponent(("tooltip.oretopia.default")));
                    }

                }
            });

    public static final RegistryObject<Item> TUNGSTENNUGGET = ITEMS.register("tungstennugget",
            () -> new Item(new Item.Properties().isImmuneToFire().group(ModItemGroup.oretopia)){
                @Override
                public void addInformation(ItemStack stack, @Nullable World worldIn,
                                           List<ITextComponent> tooltip, ITooltipFlag flagIn) {
                    if(Screen.hasShiftDown())
                        tooltip.add(new TranslationTextComponent(("tooltip.oretopia.tungstennugget")));
                    else {
                        tooltip.add(new TranslationTextComponent(("tooltip.oretopia.default")));
                    }

                }
            });

    /* other ores */

    public static final RegistryObject<Item> RUBY = ITEMS.register("ruby",
            () -> new Item(new Item.Properties().isImmuneToFire().group(ModItemGroup.oretopia)){
                @Override
                public void addInformation(ItemStack stack, @Nullable World worldIn,
                                           List<ITextComponent> tooltip, ITooltipFlag flagIn) {
                    if(Screen.hasShiftDown())
                        tooltip.add(new TranslationTextComponent(("tooltip.oretopia.ruby")));
                    else {
                        tooltip.add(new TranslationTextComponent(("tooltip.oretopia.default")));
                    }

                }
            });


    public static final RegistryObject<Item> CHROMIUM = ITEMS.register("chromium",
            () -> new Item(new Item.Properties().isImmuneToFire().group(ModItemGroup.oretopia)){
                @Override
                public void addInformation(ItemStack stack, @Nullable World worldIn,
                                           List<ITextComponent> tooltip, ITooltipFlag flagIn) {
                    if(Screen.hasShiftDown())
                        tooltip.add(new TranslationTextComponent(("tooltip.oretopia.chromium")));
                    else {
                        tooltip.add(new TranslationTextComponent(("tooltip.oretopia.default")));
                    }

                }
            });

    public static final RegistryObject<Item> CHROMIUMNUGGET = ITEMS.register("chromiumnugget",
            () -> new Item(new Item.Properties().isImmuneToFire().group(ModItemGroup.oretopia)){
                @Override
                public void addInformation(ItemStack stack, @Nullable World worldIn,
                                           List<ITextComponent> tooltip, ITooltipFlag flagIn) {
                    if(Screen.hasShiftDown())
                        tooltip.add(new TranslationTextComponent(("tooltip.oretopia.chromiumnugget")));
                    else {
                        tooltip.add(new TranslationTextComponent(("tooltip.oretopia.default")));
                    }

                }
            });


    public static final RegistryObject<Item> COBALT = ITEMS.register("cobalt",
            () -> new Item(new Item.Properties().isImmuneToFire().group(ModItemGroup.oretopia)){
                @Override
                public void addInformation(ItemStack stack, @Nullable World worldIn,
                                           List<ITextComponent> tooltip, ITooltipFlag flagIn) {
                    if(Screen.hasShiftDown())
                        tooltip.add(new TranslationTextComponent(("tooltip.oretopia.cobalt")));
                    else {
                        tooltip.add(new TranslationTextComponent(("tooltip.oretopia.default")));
                    }

                }
            });

    public static final RegistryObject<Item> COBALTNUGGET = ITEMS.register("cobaltnugget",
            () -> new Item(new Item.Properties().isImmuneToFire().group(ModItemGroup.oretopia)){
                @Override
                public void addInformation(ItemStack stack, @Nullable World worldIn,
                                           List<ITextComponent> tooltip, ITooltipFlag flagIn) {
                    if(Screen.hasShiftDown())
                        tooltip.add(new TranslationTextComponent(("tooltip.oretopia.cobaltnugget")));
                    else {
                        tooltip.add(new TranslationTextComponent(("tooltip.oretopia.default")));
                    }

                }
            });

    public static final RegistryObject<Item> ORETOPIUM = ITEMS.register("oretopium",
            () -> new Item(new Item.Properties().isImmuneToFire().group(ModItemGroup.oretopia)){
                @Override
                public void addInformation(ItemStack stack, @Nullable World worldIn,
                                           List<ITextComponent> tooltip, ITooltipFlag flagIn) {
                    if(Screen.hasShiftDown())
                        tooltip.add(new TranslationTextComponent(("tooltip.oretopia.oretopium")));
                    else {
                        tooltip.add(new TranslationTextComponent(("tooltip.oretopia.default")));
                    }

                }
            });

    public static final RegistryObject<Item> ORETOPIUMNUGGET = ITEMS.register("oretopiumnugget",
            () -> new Item(new Item.Properties().isImmuneToFire().group(ModItemGroup.oretopia)){
                @Override
                public void addInformation(ItemStack stack, @Nullable World worldIn,
                                           List<ITextComponent> tooltip, ITooltipFlag flagIn) {
                    if(Screen.hasShiftDown())
                        tooltip.add(new TranslationTextComponent(("tooltip.oretopia.oretopiumnugget")));
                    else {
                        tooltip.add(new TranslationTextComponent(("tooltip.oretopia.default")));
                    }

                }
            });

    public static final RegistryObject<Item> RADIOUM = ITEMS.register("radioum",
            () -> new Item(new Item.Properties().isImmuneToFire().group(ModItemGroup.oretopia)){
                @Override
                public void addInformation(ItemStack stack, @Nullable World worldIn,
                                           List<ITextComponent> tooltip, ITooltipFlag flagIn) {
                    if(Screen.hasShiftDown())
                        tooltip.add(new TranslationTextComponent(("tooltip.oretopia.radioum")));
                    else {
                        tooltip.add(new TranslationTextComponent(("tooltip.oretopia.default")));
                    }

                }
            });

    public static final RegistryObject<Item> RADIOUMNUGGET = ITEMS.register("radioumnugget",
            () -> new Item(new Item.Properties().isImmuneToFire().group(ModItemGroup.oretopia)){
                @Override
                public void addInformation(ItemStack stack, @Nullable World worldIn,
                                           List<ITextComponent> tooltip, ITooltipFlag flagIn) {
                    if(Screen.hasShiftDown())
                        tooltip.add(new TranslationTextComponent(("tooltip.oretopia.radioumnugget")));
                    else {
                        tooltip.add(new TranslationTextComponent(("tooltip.oretopia.default")));
                    }

                }
            });

    public static final RegistryObject<Item> RAWBACONITE = ITEMS.register("rawbaconite",
            () -> new Item(new Item.Properties()
                    .food(new Food.Builder().hunger(3).saturation(0.2f).build())
                    .isImmuneToFire().group(ModItemGroup.oretopia)){
                @Override
                public void addInformation(ItemStack stack, @Nullable World worldIn,
                                           List<ITextComponent> tooltip, ITooltipFlag flagIn) {
                    if(Screen.hasShiftDown())
                        tooltip.add(new TranslationTextComponent(("tooltip.oretopia.rawbaconite")));
                    else {
                        tooltip.add(new TranslationTextComponent(("tooltip.oretopia.default")));
                    }

                }
            });

    public static final RegistryObject<Item> COOKEDBACONITE = ITEMS.register("cookedbaconite",
            () -> new Item(new Item.Properties()
                    .food(new Food.Builder().hunger(8).saturation(0.5f).build())
                    .isImmuneToFire().group(ModItemGroup.oretopia)){
                @Override
                public void addInformation(ItemStack stack, @Nullable World worldIn,
                                           List<ITextComponent> tooltip, ITooltipFlag flagIn) {
                    if(Screen.hasShiftDown())
                        tooltip.add(new TranslationTextComponent(("tooltip.oretopia.cookedbaconite")));
                    else {
                        tooltip.add(new TranslationTextComponent(("tooltip.oretopia.default")));
                    }

                }
            });




    public static  void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

}
