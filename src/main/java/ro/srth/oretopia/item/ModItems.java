package ro.srth.oretopia.item;

import net.minecraft.block.BlockState;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.*;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.World;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import ro.srth.oretopia.block.custom.RadioumTNT;
import ro.srth.oretopia.item.custom.CosmeticEnchantedItem;
import ro.srth.oretopia.oretopia;

import javax.annotation.Nullable;
import java.util.List;

/*REMEMBER THAT CUSTOM ITEMS MUST BE IMPLEMENTED WITH () -> new *insert custom item class name here*, NOT () -> new Item */
public class ModItems {

    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, oretopia.MOD_ID);


    public static final RegistryObject<Item> ROMIUM = ITEMS.register("romium",
            () -> new Item(new Item.Properties().group(oretopia.ORETOPIAITEMGROUP)){
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
            () -> new Item(new Item.Properties().group(oretopia.ORETOPIAITEMGROUP)){
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
            () -> new SwordItem(ModItemTier.ROMIUM, 3, -2.4f,
                    new Item.Properties().group(oretopia.ORETOPIAITEMGROUP)){
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
            () -> new PickaxeItem(ModItemTier.ROMIUM, 0, -2.6f,
                    new Item.Properties().group(oretopia.ORETOPIAITEMGROUP)){
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
                    new Item.Properties().group(oretopia.ORETOPIAITEMGROUP)){
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
            () -> new ShovelItem(ModItemTier.ROMIUM, -1, -2.6f,
                    new Item.Properties().group(oretopia.ORETOPIAITEMGROUP)){
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
            () -> new HoeItem(ModItemTier.ROMIUM, -1, -2.6f,
                    new Item.Properties().group(oretopia.ORETOPIAITEMGROUP)){
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
            () -> new Item(new Item.Properties().group(oretopia.ORETOPIAITEMGROUP)){
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
            () -> new Item(new Item.Properties().group(oretopia.ORETOPIAITEMGROUP)){
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
            () -> new Item(new Item.Properties().group(oretopia.ORETOPIAITEMGROUP)){
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
            () -> new Item(new Item.Properties().group(oretopia.ORETOPIAITEMGROUP)){
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
            () -> new Item(new Item.Properties().group(oretopia.ORETOPIAITEMGROUP)){
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

    public static final RegistryObject<Item> COPPERSWORD = ITEMS.register("coppersword",
            () -> new SwordItem(ModItemTier.COPPER, 2, -2.4f,
                    new Item.Properties().group(oretopia.ORETOPIAITEMGROUP)){
                @Override
                public void addInformation(ItemStack stack, @Nullable World worldIn,
                                           List<ITextComponent> tooltip, ITooltipFlag flagIn) {
                    if(Screen.hasShiftDown())
                        tooltip.add(new TranslationTextComponent(("tooltip.oretopia.coppersword")));
                    else {
                        tooltip.add(new TranslationTextComponent(("tooltip.oretopia.default")));
                    }

                }
            });
    public static final RegistryObject<Item> COPPERPICKAXE = ITEMS.register("copperpickaxe",
            () -> new PickaxeItem(ModItemTier.COPPER, 1, -2.8f,
                    new Item.Properties().group(oretopia.ORETOPIAITEMGROUP)){
                @Override
                public void addInformation(ItemStack stack, @Nullable World worldIn,
                                           List<ITextComponent> tooltip, ITooltipFlag flagIn) {
                    if(Screen.hasShiftDown())
                        tooltip.add(new TranslationTextComponent(("tooltip.oretopia.copperpickaxe")));
                    else {
                        tooltip.add(new TranslationTextComponent(("tooltip.oretopia.default")));
                    }

                }
            });
    public static final RegistryObject<Item> COPPERAXE = ITEMS.register("copperaxe",
            () -> new AxeItem(ModItemTier.COPPER, 3, -3f,
                    new Item.Properties().group(oretopia.ORETOPIAITEMGROUP)){
                @Override
                public void addInformation(ItemStack stack, @Nullable World worldIn,
                                           List<ITextComponent> tooltip, ITooltipFlag flagIn) {
                    if(Screen.hasShiftDown())
                        tooltip.add(new TranslationTextComponent(("tooltip.oretopia.copperaxe")));
                    else {
                        tooltip.add(new TranslationTextComponent(("tooltip.oretopia.default")));
                    }

                }
            });
    public static final RegistryObject<Item> COPPERSHOVEL = ITEMS.register("coppershovel",
            () -> new ShovelItem(ModItemTier.COPPER, 1, -2.8f,
                    new Item.Properties().group(oretopia.ORETOPIAITEMGROUP)){
                @Override
                public void addInformation(ItemStack stack, @Nullable World worldIn,
                                           List<ITextComponent> tooltip, ITooltipFlag flagIn) {
                    if(Screen.hasShiftDown())
                        tooltip.add(new TranslationTextComponent(("tooltip.oretopia.coppershovel")));
                    else {
                        tooltip.add(new TranslationTextComponent(("tooltip.oretopia.default")));
                    }

                }
            });
    public static final RegistryObject<Item> COPPERHOE = ITEMS.register("copperhoe",
            () -> new HoeItem(ModItemTier.COPPER, 1, -2.8f,
                    new Item.Properties().group(oretopia.ORETOPIAITEMGROUP)){
                @Override
                public void addInformation(ItemStack stack, @Nullable World worldIn,
                                           List<ITextComponent> tooltip, ITooltipFlag flagIn) {
                    if(Screen.hasShiftDown())
                        tooltip.add(new TranslationTextComponent(("tooltip.oretopia.copperhoe")));
                    else {
                        tooltip.add(new TranslationTextComponent(("tooltip.oretopia.default")));
                    }

                }
            });

    public static final RegistryObject<Item> TUNGSTEN = ITEMS.register("tungsten",
            () -> new Item(new Item.Properties().isImmuneToFire().group(oretopia.ORETOPIAITEMGROUP)){
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
            () -> new Item(new Item.Properties().isImmuneToFire().group(oretopia.ORETOPIAITEMGROUP)){
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

    public static final RegistryObject<Item> RUBY = ITEMS.register("ruby",
            () -> new Item(new Item.Properties().isImmuneToFire().group(oretopia.ORETOPIAITEMGROUP)){
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

public static final RegistryObject<Item> BLACKDIAMOND = ITEMS.register("blackdiamond",
            () -> new Item(new Item.Properties().isImmuneToFire().group(oretopia.ORETOPIAITEMGROUP)){
                @Override
                public void addInformation(ItemStack stack, @Nullable World worldIn,
                                           List<ITextComponent> tooltip, ITooltipFlag flagIn) {
                    if(Screen.hasShiftDown())
                        tooltip.add(new TranslationTextComponent(("tooltip.oretopia.blackdiamond")));
                    else {
                        tooltip.add(new TranslationTextComponent(("tooltip.oretopia.default")));
                    }

                }
            });

public static final RegistryObject<Item> SAPPHIRE = ITEMS.register("sapphire",
            () -> new Item(new Item.Properties().isImmuneToFire().group(oretopia.ORETOPIAITEMGROUP)){
                @Override
                public void addInformation(ItemStack stack, @Nullable World worldIn,
                                           List<ITextComponent> tooltip, ITooltipFlag flagIn) {
                    if(Screen.hasShiftDown())
                        tooltip.add(new TranslationTextComponent(("tooltip.oretopia.sapphire")));
                    else {
                        tooltip.add(new TranslationTextComponent(("tooltip.oretopia.default")));
                    }

                }
            });

    public static final RegistryObject<Item> CHROMIUM = ITEMS.register("chromium",
            () -> new Item(new Item.Properties().isImmuneToFire().group(oretopia.ORETOPIAITEMGROUP)){
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

    public static final RegistryObject<Item> CHROMIUMSWORD = ITEMS.register("chromiumsword",
            () -> new SwordItem(ModItemTier.CHROMIUM, 2, -2.6f,
                    new Item.Properties().group(oretopia.ORETOPIAITEMGROUP)){
                @Override
                public void addInformation(ItemStack stack, @Nullable World worldIn,
                                           List<ITextComponent> tooltip, ITooltipFlag flagIn) {
                    if(Screen.hasShiftDown())
                        tooltip.add(new TranslationTextComponent(("tooltip.oretopia.chromiumsword")));
                    else {
                        tooltip.add(new TranslationTextComponent(("tooltip.oretopia.default")));
                    }

                }
            });

    public static final RegistryObject<Item> CHROMIUMPICKAXE = ITEMS.register("chromiumpickaxe",
            () -> new PickaxeItem(ModItemTier.CHROMIUM, 1, -2.8f,
                    new Item.Properties().group(oretopia.ORETOPIAITEMGROUP)){
                @Override
                public void addInformation(ItemStack stack, @Nullable World worldIn,
                                           List<ITextComponent> tooltip, ITooltipFlag flagIn) {
                    if(Screen.hasShiftDown())
                        tooltip.add(new TranslationTextComponent(("tooltip.oretopia.chromiumpickaxe")));
                    else {
                        tooltip.add(new TranslationTextComponent(("tooltip.oretopia.default")));
                    }

                }
            });

public static final RegistryObject<Item> CHROMIUMAXE = ITEMS.register("chromiumaxe",
            () -> new AxeItem(ModItemTier.CHROMIUM, 3, -3f,
                    new Item.Properties().group(oretopia.ORETOPIAITEMGROUP)){
                @Override
                public void addInformation(ItemStack stack, @Nullable World worldIn,
                                           List<ITextComponent> tooltip, ITooltipFlag flagIn) {
                    if(Screen.hasShiftDown())
                        tooltip.add(new TranslationTextComponent(("tooltip.oretopia.chromiumaxe")));
                    else {
                        tooltip.add(new TranslationTextComponent(("tooltip.oretopia.default")));
                    }

                }
            });

public static final RegistryObject<Item> CHROMIUMSHOVEL = ITEMS.register("chromiumshovel",
            () -> new ShovelItem(ModItemTier.CHROMIUM, 1, -2.8f,
                    new Item.Properties().group(oretopia.ORETOPIAITEMGROUP)){
                @Override
                public void addInformation(ItemStack stack, @Nullable World worldIn,
                                           List<ITextComponent> tooltip, ITooltipFlag flagIn) {
                    if(Screen.hasShiftDown())
                        tooltip.add(new TranslationTextComponent(("tooltip.oretopia.chromiumshovel")));
                    else {
                        tooltip.add(new TranslationTextComponent(("tooltip.oretopia.default")));
                    }

                }
            });

public static final RegistryObject<Item> CHROMIUMHOE = ITEMS.register("chromiumhoe",
            () -> new HoeItem(ModItemTier.CHROMIUM, 1, -2.8f,
                    new Item.Properties().group(oretopia.ORETOPIAITEMGROUP)){
                @Override
                public void addInformation(ItemStack stack, @Nullable World worldIn,
                                           List<ITextComponent> tooltip, ITooltipFlag flagIn) {
                    if(Screen.hasShiftDown())
                        tooltip.add(new TranslationTextComponent(("tooltip.oretopia.chromiumhoe")));
                    else {
                        tooltip.add(new TranslationTextComponent(("tooltip.oretopia.default")));
                    }

                }
            });

    public static final RegistryObject<Item> CHROMIUMNUGGET = ITEMS.register("chromiumnugget",
            () -> new Item(new Item.Properties().isImmuneToFire().group(oretopia.ORETOPIAITEMGROUP)){
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
            () -> new Item(new Item.Properties().group(oretopia.ORETOPIAITEMGROUP)){
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
            () -> new Item(new Item.Properties().group(oretopia.ORETOPIAITEMGROUP)){
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

    public static final RegistryObject<Item> COBALTSWORD = ITEMS.register("cobaltsword",
            () -> new SwordItem(ModItemTier.COBALT, 2, -2.6f,
                    new Item.Properties().group(oretopia.ORETOPIAITEMGROUP)){
                @Override
                public void addInformation(ItemStack stack, @Nullable World worldIn,
                                           List<ITextComponent> tooltip, ITooltipFlag flagIn) {
                    if(Screen.hasShiftDown())
                        tooltip.add(new TranslationTextComponent(("tooltip.oretopia.cobaltsword")));
                    else {
                        tooltip.add(new TranslationTextComponent(("tooltip.oretopia.default")));
                    }

                }
            });

    public static final RegistryObject<Item> COBALTPICKAXE = ITEMS.register("cobaltpickaxe",
            () -> new PickaxeItem(ModItemTier.COBALT, 1, -2.8f,
                    new Item.Properties().group(oretopia.ORETOPIAITEMGROUP)){
                @Override
                public void addInformation(ItemStack stack, @Nullable World worldIn,
                                           List<ITextComponent> tooltip, ITooltipFlag flagIn) {
                    if(Screen.hasShiftDown())
                        tooltip.add(new TranslationTextComponent(("tooltip.oretopia.cobaltpickaxe")));
                    else {
                        tooltip.add(new TranslationTextComponent(("tooltip.oretopia.default")));
                    }

                }
            });

    public static final RegistryObject<Item> COBALTAXE = ITEMS.register("cobaltaxe",
            () -> new AxeItem(ModItemTier.COBALT, 3, -3f,
                    new Item.Properties().group(oretopia.ORETOPIAITEMGROUP)){
                @Override
                public void addInformation(ItemStack stack, @Nullable World worldIn,
                                           List<ITextComponent> tooltip, ITooltipFlag flagIn) {
                    if(Screen.hasShiftDown())
                        tooltip.add(new TranslationTextComponent(("tooltip.oretopia.cobaltaxe")));
                    else {
                        tooltip.add(new TranslationTextComponent(("tooltip.oretopia.default")));
                    }

                }
            });

    public static final RegistryObject<Item> COBALTSHOVEL = ITEMS.register("cobaltshovel",
            () -> new ShovelItem(ModItemTier.COBALT, 1, -2.8f,
                    new Item.Properties().group(oretopia.ORETOPIAITEMGROUP)){
                @Override
                public void addInformation(ItemStack stack, @Nullable World worldIn,
                                           List<ITextComponent> tooltip, ITooltipFlag flagIn) {
                    if(Screen.hasShiftDown())
                        tooltip.add(new TranslationTextComponent(("tooltip.oretopia.cobaltshovel")));
                    else {
                        tooltip.add(new TranslationTextComponent(("tooltip.oretopia.default")));
                    }

                }
            });

    public static final RegistryObject<Item> COBALTHOE = ITEMS.register("cobalthoe",
            () -> new HoeItem(ModItemTier.COBALT, 1, -2.8f,
                    new Item.Properties().group(oretopia.ORETOPIAITEMGROUP)){
                @Override
                public void addInformation(ItemStack stack, @Nullable World worldIn,
                                           List<ITextComponent> tooltip, ITooltipFlag flagIn) {
                    if(Screen.hasShiftDown())
                        tooltip.add(new TranslationTextComponent(("tooltip.oretopia.cobalthoe")));
                    else {
                        tooltip.add(new TranslationTextComponent(("tooltip.oretopia.default")));
                    }

                }
            });

    public static final RegistryObject<Item> ORETOPIUM = ITEMS.register("oretopium",
            () -> new Item(new Item.Properties().isImmuneToFire().group(oretopia.ORETOPIAITEMGROUP)){
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
            () -> new Item(new Item.Properties().isImmuneToFire().group(oretopia.ORETOPIAITEMGROUP)){
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
            () -> new Item(new Item.Properties().isImmuneToFire().group(oretopia.ORETOPIAITEMGROUP)){
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
            () -> new Item(new Item.Properties().isImmuneToFire().group(oretopia.ORETOPIAITEMGROUP)){
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
                    .group(oretopia.ORETOPIAITEMGROUP)){
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
                    .group(oretopia.ORETOPIAITEMGROUP)){
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

    public static final RegistryObject<Item> CORRUPTIUMNUGGET = ITEMS.register("corruptiumnugget",
            () -> new Item(new Item.Properties().isImmuneToFire().group(oretopia.ORETOPIAITEMGROUP)){
                @Override
                public void addInformation(ItemStack stack, @Nullable World worldIn,
                                           List<ITextComponent> tooltip, ITooltipFlag flagIn) {
                    if(Screen.hasAltDown())
                        tooltip.add(new TranslationTextComponent(("tooltip.oretopia.corruptiumnugget")));
                    else {
                        tooltip.add(new TranslationTextComponent(("tooltip.oretopia.corrupt")));
                    }

                }
            });

    public static final RegistryObject<Item> CORRUPTIUM = ITEMS.register("corruptium",
            () -> new Item(new Item.Properties().isImmuneToFire().group(oretopia.ORETOPIAITEMGROUP)){
                @Override
                public void addInformation(ItemStack stack, @Nullable World worldIn,
                                           List<ITextComponent> tooltip, ITooltipFlag flagIn) {
                    if(Screen.hasAltDown())
                        tooltip.add(new TranslationTextComponent(("tooltip.oretopia.corruptium")));
                    else {
                        tooltip.add(new TranslationTextComponent(("tooltip.oretopia.corrupt")));
                    }

                }
            });

    public static final RegistryObject<Item> TITANIUM = ITEMS.register("titanium",
            () -> new Item(new Item.Properties().isImmuneToFire().group(oretopia.ORETOPIAITEMGROUP)){
                @Override
                public void addInformation(ItemStack stack, @Nullable World worldIn,
                                           List<ITextComponent> tooltip, ITooltipFlag flagIn) {
                    if(Screen.hasShiftDown())
                        tooltip.add(new TranslationTextComponent(("tooltip.oretopia.titanium")));
                    else {
                        tooltip.add(new TranslationTextComponent(("tooltip.oretopia.default")));
                    }

                }
            });

    public static final RegistryObject<Item> TITANIUMNUGGET = ITEMS.register("titaniumnugget",
            () -> new Item(new Item.Properties().isImmuneToFire().group(oretopia.ORETOPIAITEMGROUP)){
                @Override
                public void addInformation(ItemStack stack, @Nullable World worldIn,
                                           List<ITextComponent> tooltip, ITooltipFlag flagIn) {
                    if(Screen.hasShiftDown())
                        tooltip.add(new TranslationTextComponent(("tooltip.oretopia.titaniumnugget")));
                    else {
                        tooltip.add(new TranslationTextComponent(("tooltip.oretopia.default")));
                    }

                }
            });

    public static final RegistryObject<Item> ENDERSHARD = ITEMS.register("endershard",
            () -> new Item(new Item.Properties().group(oretopia.ORETOPIAITEMGROUP)){
                @Override
                public void addInformation(ItemStack stack, @Nullable World worldIn,
                                           List<ITextComponent> tooltip, ITooltipFlag flagIn) {
                    if(Screen.hasShiftDown())
                        tooltip.add(new TranslationTextComponent(("tooltip.oretopia.endershard")));
                    else {
                        tooltip.add(new TranslationTextComponent(("tooltip.oretopia.default")));
                    }

                }
            });

    public static final RegistryObject<Item> MUSICDISCSHARD = ITEMS.register("musicdiscshard",
            () -> new Item(new Item.Properties().group(oretopia.ORETOPIAITEMGROUP)){
                @Override
                public void addInformation(ItemStack stack, @Nullable World worldIn,
                                           List<ITextComponent> tooltip, ITooltipFlag flagIn) {
                    if(Screen.hasShiftDown())
                        tooltip.add(new TranslationTextComponent(("tooltip.oretopia.musicdiscshard")));
                    else {
                        tooltip.add(new TranslationTextComponent(("tooltip.oretopia.default")));
                    }

                }
            });

public static final RegistryObject<Item> EDIBLEBRICK = ITEMS.register("ediblebrick",
            () -> new Item(new Item.Properties()
                    .food(new Food.Builder().hunger(1).saturation(0f).setAlwaysEdible().effect(() -> new EffectInstance(Effects.INSTANT_DAMAGE, 1, 100), 1f).build())
                    .group(oretopia.ORETOPIAITEMGROUP)){
                @Override
                public void addInformation(ItemStack stack, @Nullable World worldIn,
                                           List<ITextComponent> tooltip, ITooltipFlag flagIn) {
                    if(Screen.hasShiftDown())
                        tooltip.add(new TranslationTextComponent(("tooltip.oretopia.ediblebrick")));
                    else {
                        tooltip.add(new TranslationTextComponent(("tooltip.oretopia.default")));
                    }

                }
            });

public static final RegistryObject<Item> ESSENCE = ITEMS.register("essence",
            () -> new Item(new Item.Properties().group(oretopia.ORETOPIAITEMGROUP)){
                @Override
                public void addInformation(ItemStack stack, @Nullable World worldIn,
                                           List<ITextComponent> tooltip, ITooltipFlag flagIn) {
                    if(Screen.hasShiftDown())
                        tooltip.add(new TranslationTextComponent(("tooltip.oretopia.essence")));
                    else {
                        tooltip.add(new TranslationTextComponent(("tooltip.oretopia.default")));
                    }

                }
            });

public static final RegistryObject<Item> ENCHANTEDESSENCE = ITEMS.register("enchantedessence",
            () -> new CosmeticEnchantedItem(new Item.Properties().group(oretopia.ORETOPIAITEMGROUP)){
                @Override
                public void addInformation(ItemStack stack, @Nullable World worldIn,
                                           List<ITextComponent> tooltip, ITooltipFlag flagIn) {
                    if(Screen.hasShiftDown())
                        tooltip.add(new TranslationTextComponent(("tooltip.oretopia.enchantedessence")));
                    else {
                        tooltip.add(new TranslationTextComponent(("tooltip.oretopia.default")));
                    }

                }
            });



    public static  void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

}
