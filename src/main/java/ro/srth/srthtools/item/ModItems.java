package ro.srth.srthtools.item;

import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.*;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.World;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import ro.srth.srthtools.SrthTools;

import javax.annotation.Nullable;
import java.util.List;

public class ModItems {

    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, SrthTools.MOD_ID);



    /* non realistic items */

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

    public static final RegistryObject<Item> ROMIUMNUGGET = ITEMS.register("romiumnugget",
            () -> new Item(new Item.Properties().group(ModItemGroup.SRTH_MODS)){
                @Override
                public void addInformation(ItemStack stack, @Nullable World worldIn,
                                           List<ITextComponent> tooltip, ITooltipFlag flagIn) {
                    if(Screen.hasShiftDown())
                        tooltip.add(new TranslationTextComponent(("tooltip.srthtools.romiumnugget")));
                    else {
                        tooltip.add(new TranslationTextComponent(("tooltip.srthtools.default")));
                    }

                }
            });

    public static final RegistryObject<Item> ROMIUMSWORD = ITEMS.register("romiumsword",
            () -> new SwordItem(ModItemTier.ROMIUM, 3, .5f,
                    new Item.Properties().group(ModItemGroup.SRTH_MODS)){
                @Override
                public void addInformation(ItemStack stack, @Nullable World worldIn,
                                           List<ITextComponent> tooltip, ITooltipFlag flagIn) {
                    if(Screen.hasShiftDown())
                        tooltip.add(new TranslationTextComponent(("tooltip.srthtools.romiumsword")));
                    else {
                        tooltip.add(new TranslationTextComponent(("tooltip.srthtools.default")));
                    }

                }
            });

    public static final RegistryObject<Item> ROMIUMPICKAXE = ITEMS.register("romiumpickaxe",
            () -> new PickaxeItem(ModItemTier.ROMIUM, -1, -1f,
                    new Item.Properties().group(ModItemGroup.SRTH_MODS)){
                @Override
                public void addInformation(ItemStack stack, @Nullable World worldIn,
                                           List<ITextComponent> tooltip, ITooltipFlag flagIn) {
                    if(Screen.hasShiftDown())
                        tooltip.add(new TranslationTextComponent(("tooltip.srthtools.romiumpickaxe")));
                    else {
                        tooltip.add(new TranslationTextComponent(("tooltip.srthtools.default")));
                    }

                }
            });

    public static final RegistryObject<Item> ROMIUMAXE = ITEMS.register("romiumaxe",
            () -> new AxeItem(ModItemTier.ROMIUM, 5, -3f,
                    new Item.Properties().group(ModItemGroup.SRTH_MODS)){
                @Override
                public void addInformation(ItemStack stack, @Nullable World worldIn,
                                           List<ITextComponent> tooltip, ITooltipFlag flagIn) {
                    if(Screen.hasShiftDown())
                        tooltip.add(new TranslationTextComponent(("tooltip.srthtools.romiumaxe")));
                    else {
                        tooltip.add(new TranslationTextComponent(("tooltip.srthtools.default")));
                    }

                }
            });

    public static final RegistryObject<Item> ROMIUMSHOVEL = ITEMS.register("romiumshovel",
            () -> new ShovelItem(ModItemTier.ROMIUM, -1, -1f,
                    new Item.Properties().group(ModItemGroup.SRTH_MODS)){
                @Override
                public void addInformation(ItemStack stack, @Nullable World worldIn,
                                           List<ITextComponent> tooltip, ITooltipFlag flagIn) {
                    if(Screen.hasShiftDown())
                        tooltip.add(new TranslationTextComponent(("tooltip.srthtools.romiumshovel")));
                    else {
                        tooltip.add(new TranslationTextComponent(("tooltip.srthtools.default")));
                    }

                }
            });

    public static final RegistryObject<Item> ROMIUMHOE = ITEMS.register("romiumhoe",
            () -> new HoeItem(ModItemTier.ROMIUM, -1, -1f,
                    new Item.Properties().group(ModItemGroup.SRTH_MODS)){
                @Override
                public void addInformation(ItemStack stack, @Nullable World worldIn,
                                           List<ITextComponent> tooltip, ITooltipFlag flagIn) {
                    if(Screen.hasShiftDown())
                        tooltip.add(new TranslationTextComponent(("tooltip.srthtools.romiumhoe")));
                    else {
                        tooltip.add(new TranslationTextComponent(("tooltip.srthtools.default")));
                    }

                }
            });

    /* from periodic table */

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

    public static final RegistryObject<Item> URANIUM = ITEMS.register("uranium",
            () -> new Item(new Item.Properties().group(ModItemGroup.SRTH_MODS)){
                @Override
                public void addInformation(ItemStack stack, @Nullable World worldIn,
                                           List<ITextComponent> tooltip, ITooltipFlag flagIn) {
                    if(Screen.hasShiftDown())
                        tooltip.add(new TranslationTextComponent(("tooltip.srthtools.uranium")));
                    else {
                        tooltip.add(new TranslationTextComponent(("tooltip.srthtools.default")));
                    }

                }
            });

    public static final RegistryObject<Item> ENRICHEDURANIUM = ITEMS.register("enricheduranium",
            () -> new Item(new Item.Properties().group(ModItemGroup.SRTH_MODS)){
                @Override
                public void addInformation(ItemStack stack, @Nullable World worldIn,
                                           List<ITextComponent> tooltip, ITooltipFlag flagIn) {
                    if(Screen.hasShiftDown())
                        tooltip.add(new TranslationTextComponent(("tooltip.srthtools.enricheduranium")));
                    else {
                        tooltip.add(new TranslationTextComponent(("tooltip.srthtools.default")));
                    }

                }
            });

    public static final RegistryObject<Item> COPPER = ITEMS.register("copper",
            () -> new Item(new Item.Properties().group(ModItemGroup.SRTH_MODS)){
                @Override
                public void addInformation(ItemStack stack, @Nullable World worldIn,
                                           List<ITextComponent> tooltip, ITooltipFlag flagIn) {
                    if(Screen.hasShiftDown())
                        tooltip.add(new TranslationTextComponent(("tooltip.srthtools.copper")));
                    else {
                        tooltip.add(new TranslationTextComponent(("tooltip.srthtools.default")));
                    }

                }
            });

    public static final RegistryObject<Item> COPPERNUGGET = ITEMS.register("coppernugget",
            () -> new Item(new Item.Properties().group(ModItemGroup.SRTH_MODS)){
                @Override
                public void addInformation(ItemStack stack, @Nullable World worldIn,
                                           List<ITextComponent> tooltip, ITooltipFlag flagIn) {
                    if(Screen.hasShiftDown())
                        tooltip.add(new TranslationTextComponent(("tooltip.srthtools.coppernugget")));
                    else {
                        tooltip.add(new TranslationTextComponent(("tooltip.srthtools.default")));
                    }

                }
            });

    public static final RegistryObject<Item> TUNGSTEN = ITEMS.register("tungsten",
            () -> new Item(new Item.Properties().isImmuneToFire().group(ModItemGroup.SRTH_MODS)){
                @Override
                public void addInformation(ItemStack stack, @Nullable World worldIn,
                                           List<ITextComponent> tooltip, ITooltipFlag flagIn) {
                    if(Screen.hasShiftDown())
                        tooltip.add(new TranslationTextComponent(("tooltip.srthtools.tungsten")));
                    else {
                        tooltip.add(new TranslationTextComponent(("tooltip.srthtools.default")));
                    }

                }
            });

    public static final RegistryObject<Item> TUNGSTENNUGGET = ITEMS.register("tungstennugget",
            () -> new Item(new Item.Properties().isImmuneToFire().group(ModItemGroup.SRTH_MODS)){
                @Override
                public void addInformation(ItemStack stack, @Nullable World worldIn,
                                           List<ITextComponent> tooltip, ITooltipFlag flagIn) {
                    if(Screen.hasShiftDown())
                        tooltip.add(new TranslationTextComponent(("tooltip.srthtools.tungstennugget")));
                    else {
                        tooltip.add(new TranslationTextComponent(("tooltip.srthtools.default")));
                    }

                }
            });




    public static  void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

}
