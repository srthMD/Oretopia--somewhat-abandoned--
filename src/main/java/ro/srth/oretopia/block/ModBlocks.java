package ro.srth.oretopia.block;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.IBlockReader;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.energy.EnergyStorage;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import ro.srth.oretopia.item.ModItems;
import ro.srth.oretopia.oretopia;

import javax.annotation.Nullable;
import java.util.List;
import java.util.function.Supplier;



public class ModBlocks {

    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, oretopia.MOD_ID);

    public static final RegistryObject<Block> ROMIUMORE = registerBlock("romiumore",
            () -> new Block(AbstractBlock.Properties.create(Material.ROCK)
                    .harvestLevel(2).setRequiresTool().harvestTool(ToolType.PICKAXE).hardnessAndResistance(5f)){
                @Override
                public void addInformation(ItemStack stack, @Nullable IBlockReader worldIn,
                                           List<ITextComponent> tooltip, ITooltipFlag flagIn) {
                    if(Screen.hasShiftDown())
                        tooltip.add(new TranslationTextComponent(("tooltip.oretopia.romiumore")));
                    else {
                        tooltip.add(new TranslationTextComponent(("tooltip.oretopia.default")));
                    }

                }
            });

public static final RegistryObject<Block> BLOCKOFROMIUM = registerBlock("blockofromium",
            () -> new Block(AbstractBlock.Properties.create(Material.IRON)
                    .harvestLevel(2).setRequiresTool().harvestTool(ToolType.PICKAXE).hardnessAndResistance(5.5f)
                    .sound(SoundType.METAL)){
                @Override
                public void addInformation(ItemStack stack, @Nullable IBlockReader worldIn,
                                           List<ITextComponent> tooltip, ITooltipFlag flagIn) {
                    if(Screen.hasShiftDown())
                        tooltip.add(new TranslationTextComponent(("tooltip.oretopia.blockofromium")));
                    else {
                        tooltip.add(new TranslationTextComponent(("tooltip.oretopia.default")));
                    }

                }
            });

    public static final RegistryObject<Block> URANIUMORE = registerBlock("uraniumore",
            () -> new Block(AbstractBlock.Properties.create(Material.ROCK)
                    .harvestLevel(2).setRequiresTool().harvestTool(ToolType.PICKAXE).hardnessAndResistance(4f)){
                @Override
                public void addInformation(ItemStack stack, @Nullable IBlockReader worldIn,
                                           List<ITextComponent> tooltip, ITooltipFlag flagIn) {
                    if(Screen.hasShiftDown())
                        tooltip.add(new TranslationTextComponent(("tooltip.oretopia.uraniumore")));
                    else {
                        tooltip.add(new TranslationTextComponent(("tooltip.oretopia.default")));
                    }

                }
            });

    public static final RegistryObject<Block> COPPERORE = registerBlock("copperore",
            () -> new Block(AbstractBlock.Properties.create(Material.ROCK)
                    .harvestLevel(1).setRequiresTool().harvestTool(ToolType.PICKAXE).hardnessAndResistance(2f)){
                @Override
                public void addInformation(ItemStack stack, @Nullable IBlockReader worldIn,
                                           List<ITextComponent> tooltip, ITooltipFlag flagIn) {
                    if(Screen.hasShiftDown())
                        tooltip.add(new TranslationTextComponent(("tooltip.oretopia.copperore")));
                    else {
                        tooltip.add(new TranslationTextComponent(("tooltip.oretopia.default")));
                    }

                }
            });

public static final RegistryObject<Block> BLOCKOFCOPPER = registerBlock("blockofcopper",
            () -> new Block(AbstractBlock.Properties.create(Material.IRON)
                    .harvestLevel(1).setRequiresTool().harvestTool(ToolType.PICKAXE).hardnessAndResistance(2.5f)
                    .sound(SoundType.METAL)){
                @Override
                public void addInformation(ItemStack stack, @Nullable IBlockReader worldIn,
                                           List<ITextComponent> tooltip, ITooltipFlag flagIn) {
                    if(Screen.hasShiftDown())
                        tooltip.add(new TranslationTextComponent(("tooltip.oretopia.blockofcopper")));
                    else {
                        tooltip.add(new TranslationTextComponent(("tooltip.oretopia.default")));
                    }

                }
            });

    public static final RegistryObject<Block> TUNGSTENORE = registerBlock("tungstenore",
            () -> new Block(AbstractBlock.Properties.create(Material.ROCK)
                    .harvestLevel(4).setRequiresTool().harvestTool(ToolType.PICKAXE).hardnessAndResistance(8.5f)){
                @Override
                public void addInformation(ItemStack stack, @Nullable IBlockReader worldIn,
                                           List<ITextComponent> tooltip, ITooltipFlag flagIn) {
                    if(Screen.hasShiftDown())
                        tooltip.add(new TranslationTextComponent(("tooltip.oretopia.tungstenore")));
                    else {
                        tooltip.add(new TranslationTextComponent(("tooltip.oretopia.default")));
                    }

                }
            });

public static final RegistryObject<Block> BLOCKOFTUNGSTEN = registerBlock("blockoftungsten",
            () -> new Block(AbstractBlock.Properties.create(Material.IRON)
                    .harvestLevel(4).setRequiresTool().harvestTool(ToolType.PICKAXE).hardnessAndResistance(9f)
                    .sound(SoundType.METAL)){
                @Override
                public void addInformation(ItemStack stack, @Nullable IBlockReader worldIn,
                                           List<ITextComponent> tooltip, ITooltipFlag flagIn) {
                    if(Screen.hasShiftDown())
                        tooltip.add(new TranslationTextComponent(("tooltip.oretopia.blockoftungsten")));
                    else {
                        tooltip.add(new TranslationTextComponent(("tooltip.oretopia.default")));
                    }

                }
            });

    public static final RegistryObject<Block> RUBYORE = registerBlock("rubyore",
            () -> new Block(AbstractBlock.Properties.create(Material.ROCK)
                    .harvestLevel(3).setRequiresTool().harvestTool(ToolType.PICKAXE).hardnessAndResistance(8.5f)){
                @Override
                public void addInformation(ItemStack stack, @Nullable IBlockReader worldIn,
                                           List<ITextComponent> tooltip, ITooltipFlag flagIn) {
                    if(Screen.hasShiftDown())
                        tooltip.add(new TranslationTextComponent(("tooltip.oretopia.rubyore")));
                    else {
                        tooltip.add(new TranslationTextComponent(("tooltip.oretopia.default")));
                    }

                }
            });

 public static final RegistryObject<Block> RUBYBLOCK = registerBlock("rubyblock",
            () -> new Block(AbstractBlock.Properties.create(Material.IRON)
                    .harvestLevel(3).setRequiresTool().harvestTool(ToolType.PICKAXE).hardnessAndResistance(9f)
                    .sound(SoundType.METAL)){
                @Override
                public void addInformation(ItemStack stack, @Nullable IBlockReader worldIn,
                                           List<ITextComponent> tooltip, ITooltipFlag flagIn) {
                    if(Screen.hasShiftDown())
                        tooltip.add(new TranslationTextComponent(("tooltip.oretopia.rubyblock")));
                    else {
                        tooltip.add(new TranslationTextComponent(("tooltip.oretopia.default")));
                    }

                }
            });

    public static final RegistryObject<Block> ORETOPIUMORE = registerBlock("oretopiumore",
            () -> new Block(AbstractBlock.Properties.create(Material.ROCK)
                    .harvestLevel(4).setRequiresTool().harvestTool(ToolType.PICKAXE).hardnessAndResistance(9f)){
                @Override
                public void addInformation(ItemStack stack, @Nullable IBlockReader worldIn,
                                           List<ITextComponent> tooltip, ITooltipFlag flagIn) {
                    if(Screen.hasShiftDown())
                        tooltip.add(new TranslationTextComponent(("tooltip.oretopia.oretopiumore")));
                    else {
                        tooltip.add(new TranslationTextComponent(("tooltip.oretopia.default")));
                    }

                }
            });

public static final RegistryObject<Block> BLOCKOFORETOPIUM = registerBlock("blockoforetopium",
            () -> new Block(AbstractBlock.Properties.create(Material.IRON)
                    .harvestLevel(4).setRequiresTool().harvestTool(ToolType.PICKAXE).hardnessAndResistance(9.5f)
                    .sound(SoundType.METAL)){
                @Override
                public void addInformation(ItemStack stack, @Nullable IBlockReader worldIn,
                                           List<ITextComponent> tooltip, ITooltipFlag flagIn) {
                    if(Screen.hasShiftDown())
                        tooltip.add(new TranslationTextComponent(("tooltip.oretopia.blockoforetopium")));
                    else {
                        tooltip.add(new TranslationTextComponent(("tooltip.oretopia.default")));
                    }

                }
            });


    public static final RegistryObject<Block> CHROMIUMORE = registerBlock("chromiumore",
            () -> new Block(AbstractBlock.Properties.create(Material.ROCK)
                    .harvestLevel(3).setRequiresTool().harvestTool(ToolType.PICKAXE).hardnessAndResistance(7f)){
                @Override
                public void addInformation(ItemStack stack, @Nullable IBlockReader worldIn,
                                           List<ITextComponent> tooltip, ITooltipFlag flagIn) {
                    if(Screen.hasShiftDown())
                        tooltip.add(new TranslationTextComponent(("tooltip.oretopia.chromiumore")));
                    else {
                        tooltip.add(new TranslationTextComponent(("tooltip.oretopia.default")));
                    }

                }
            });

public static final RegistryObject<Block> BLOCKOFCHROMIUM = registerBlock("blockofchromium",
            () -> new Block(AbstractBlock.Properties.create(Material.IRON)
                    .harvestLevel(3).setRequiresTool().harvestTool(ToolType.PICKAXE).hardnessAndResistance(7.5f)
                    .sound(SoundType.METAL)){
                @Override
                public void addInformation(ItemStack stack, @Nullable IBlockReader worldIn,
                                           List<ITextComponent> tooltip, ITooltipFlag flagIn) {
                    if(Screen.hasShiftDown())
                        tooltip.add(new TranslationTextComponent(("tooltip.oretopia.blockofchromium")));
                    else {
                        tooltip.add(new TranslationTextComponent(("tooltip.oretopia.default")));
                    }

                }
            });

    public static final RegistryObject<Block> COBALTORE = registerBlock("cobaltore",
            () -> new Block(AbstractBlock.Properties.create(Material.ROCK)
                    .harvestLevel(2).setRequiresTool().harvestTool(ToolType.PICKAXE).hardnessAndResistance(5f)){
                @Override
                public void addInformation(ItemStack stack, @Nullable IBlockReader worldIn,
                                           List<ITextComponent> tooltip, ITooltipFlag flagIn) {
                    if(Screen.hasShiftDown())
                        tooltip.add(new TranslationTextComponent(("tooltip.oretopia.cobaltore")));
                    else {
                        tooltip.add(new TranslationTextComponent(("tooltip.oretopia.default")));
                    }

                }
            });

 public static final RegistryObject<Block> BLOCKOFCOBALT = registerBlock("blockofcobalt",
            () -> new Block(AbstractBlock.Properties.create(Material.IRON)
                    .harvestLevel(2).setRequiresTool().harvestTool(ToolType.PICKAXE).hardnessAndResistance(5.5f)
                    .sound(SoundType.METAL)){
                @Override
                public void addInformation(ItemStack stack, @Nullable IBlockReader worldIn,
                                           List<ITextComponent> tooltip, ITooltipFlag flagIn) {
                    if(Screen.hasShiftDown())
                        tooltip.add(new TranslationTextComponent(("tooltip.oretopia.blockofcobalt")));
                    else {
                        tooltip.add(new TranslationTextComponent(("tooltip.oretopia.default")));
                    }

                }
            });

    public static final RegistryObject<Block> RADIOUMORE = registerBlock("radioumore",
            () -> new Block(AbstractBlock.Properties.create(Material.ROCK)
                    .harvestLevel(3).setRequiresTool().harvestTool(ToolType.PICKAXE).hardnessAndResistance(7.5f)){
                @Override
                public void addInformation(ItemStack stack, @Nullable IBlockReader worldIn,
                                           List<ITextComponent> tooltip, ITooltipFlag flagIn) {
                    if(Screen.hasShiftDown())
                        tooltip.add(new TranslationTextComponent(("tooltip.oretopia.radioumore")));
                    else {
                        tooltip.add(new TranslationTextComponent(("tooltip.oretopia.default")));
                    }

                }
            });

    public static final RegistryObject<Block> NETHER_RADIOUMORE = registerBlock("nether_radioumore",
            () -> new Block(AbstractBlock.Properties.create(Material.ROCK)
                    .harvestLevel(3).setRequiresTool().harvestTool(ToolType.PICKAXE).hardnessAndResistance(7f)){
                @Override
                public void addInformation(ItemStack stack, @Nullable IBlockReader worldIn,
                                           List<ITextComponent> tooltip, ITooltipFlag flagIn) {
                    if(Screen.hasShiftDown())
                        tooltip.add(new TranslationTextComponent(("tooltip.oretopia.nether_radioumore")));
                    else {
                        tooltip.add(new TranslationTextComponent(("tooltip.oretopia.default")));
                    }

                }
            });

    public static final RegistryObject<Block> BLOCKOFRADIOUM = registerBlock("blockofradioum",
            () -> new Block(AbstractBlock.Properties.create(Material.IRON)
                    .harvestLevel(3).setRequiresTool().harvestTool(ToolType.PICKAXE).hardnessAndResistance(8f)
                    .sound(SoundType.METAL)){
                @Override
                public void addInformation(ItemStack stack, @Nullable IBlockReader worldIn,
                                           List<ITextComponent> tooltip, ITooltipFlag flagIn) {
                    if(Screen.hasShiftDown())
                        tooltip.add(new TranslationTextComponent(("tooltip.oretopia.blockofradioum")));
                    else {
                        tooltip.add(new TranslationTextComponent(("tooltip.oretopia.default")));
                    }

                }
            });


    public static final RegistryObject<Block> BACONITEORE = registerBlock("baconiteore",
            () -> new Block(AbstractBlock.Properties.create(Material.ROCK)
                    .harvestLevel(2).setRequiresTool().harvestTool(ToolType.PICKAXE).hardnessAndResistance(4.5f)){
                @Override
                public void addInformation(ItemStack stack, @Nullable IBlockReader worldIn,
                                           List<ITextComponent> tooltip, ITooltipFlag flagIn) {
                    if(Screen.hasShiftDown())
                        tooltip.add(new TranslationTextComponent(("tooltip.oretopia.baconiteore")));
                    else {
                        tooltip.add(new TranslationTextComponent(("tooltip.oretopia.default")));
                    }

                }
            });

    public static final RegistryObject<Block> TITANIUMORE = registerBlock("titaniumore",
            () -> new Block(AbstractBlock.Properties.create(Material.ROCK)
                    .harvestLevel(3).setRequiresTool().harvestTool(ToolType.PICKAXE).hardnessAndResistance(7f)){
                @Override
                public void addInformation(ItemStack stack, @Nullable IBlockReader worldIn,
                                           List<ITextComponent> tooltip, ITooltipFlag flagIn) {
                    if(Screen.hasShiftDown())
                        tooltip.add(new TranslationTextComponent(("tooltip.oretopia.titaniumore")));
                    else {
                        tooltip.add(new TranslationTextComponent(("tooltip.oretopia.default")));
                    }

                }
            });

    public static final RegistryObject<Block> BLOCKOFTITANIUM = registerBlock("blockoftitanium",
            () -> new Block(AbstractBlock.Properties.create(Material.IRON)
                    .harvestLevel(3).setRequiresTool().harvestTool(ToolType.PICKAXE).hardnessAndResistance(7.5f)
                    .sound(SoundType.METAL)){
                @Override
                public void addInformation(ItemStack stack, @Nullable IBlockReader worldIn,
                                           List<ITextComponent> tooltip, ITooltipFlag flagIn) {
                    if(Screen.hasShiftDown())
                        tooltip.add(new TranslationTextComponent(("tooltip.oretopia.blockoftitanium")));
                    else {
                        tooltip.add(new TranslationTextComponent(("tooltip.oretopia.default")));
                    }

                }
            });

    public static final RegistryObject<Block> END_CORRUPTIUMORE = registerBlock("end_corruptiumore",
            () -> new Block(AbstractBlock.Properties.create(Material.ROCK)
                    .harvestLevel(4).setRequiresTool().harvestTool(ToolType.PICKAXE).hardnessAndResistance(30f)){
                @Override
                public void addInformation(ItemStack stack, @Nullable IBlockReader worldIn,
                                           List<ITextComponent> tooltip, ITooltipFlag flagIn) {
                    if(Screen.hasAltDown())
                        tooltip.add(new TranslationTextComponent(("tooltip.oretopia.end_corruptiumore")));
                    else {
                        tooltip.add(new TranslationTextComponent(("tooltip.oretopia.corrupt")));
                    }

                }
            });

public static final RegistryObject<Block> BLOCKOFCORRUPTIUM = registerBlock("blockofcorruptium",
            () -> new Block(AbstractBlock.Properties.create(Material.IRON)
                    .harvestLevel(4).setRequiresTool().harvestTool(ToolType.PICKAXE).hardnessAndResistance(32f)
                    .sound(SoundType.METAL)){
                @Override
                public void addInformation(ItemStack stack, @Nullable IBlockReader worldIn,
                                           List<ITextComponent> tooltip, ITooltipFlag flagIn) {
                    if(Screen.hasAltDown())
                        tooltip.add(new TranslationTextComponent(("tooltip.oretopia.blockofcorruptium")));
                    else {
                        tooltip.add(new TranslationTextComponent(("tooltip.oretopia.corrupt")));
                    }

                }
            });

    public static final RegistryObject<Block> END_ENDERIUMORE = registerBlock("end_enderiumore",
            () -> new Block(AbstractBlock.Properties.create(Material.ROCK)
                    .harvestLevel(3).setRequiresTool().harvestTool(ToolType.PICKAXE).hardnessAndResistance(6.5f)){
                @Override
                public void addInformation(ItemStack stack, @Nullable IBlockReader worldIn,
                                           List<ITextComponent> tooltip, ITooltipFlag flagIn) {
                    if(Screen.hasShiftDown())
                        tooltip.add(new TranslationTextComponent(("tooltip.oretopia.end_enderiumore")));
                    else {
                        tooltip.add(new TranslationTextComponent(("tooltip.oretopia.default")));
                    }

                }
            });

    public static final RegistryObject<Block> ENDERIUMORE = registerBlock("enderiumore",
            () -> new Block(AbstractBlock.Properties.create(Material.ROCK)
                    .harvestLevel(3).setRequiresTool().harvestTool(ToolType.PICKAXE).hardnessAndResistance(6.5f)){
                @Override
                public void addInformation(ItemStack stack, @Nullable IBlockReader worldIn,
                                           List<ITextComponent> tooltip, ITooltipFlag flagIn) {
                    if(Screen.hasShiftDown())
                        tooltip.add(new TranslationTextComponent(("tooltip.oretopia.enderiumore")));
                    else {
                        tooltip.add(new TranslationTextComponent(("tooltip.oretopia.default")));
                    }

                }
            });

    public static final RegistryObject<Block> MUSICDISCORE = registerBlock("musicdiscore",
            () -> new Block(AbstractBlock.Properties.create(Material.ROCK)
                    .harvestLevel(2).setRequiresTool().harvestTool(ToolType.PICKAXE).hardnessAndResistance(5f)){
                @Override
                public void addInformation(ItemStack stack, @Nullable IBlockReader worldIn,
                                           List<ITextComponent> tooltip, ITooltipFlag flagIn) {
                    if(Screen.hasShiftDown())
                        tooltip.add(new TranslationTextComponent(("tooltip.oretopia.musicdiscore")));
                    else {
                        tooltip.add(new TranslationTextComponent(("tooltip.oretopia.default")));
                    }

                }
            });

public static final RegistryObject<Block> ESSENCEORE = registerBlock("essenceore",
            () -> new Block(AbstractBlock.Properties.create(Material.ROCK)
                    .harvestLevel(2).setRequiresTool().harvestTool(ToolType.PICKAXE).hardnessAndResistance(5.5f)){
                @Override
                public void addInformation(ItemStack stack, @Nullable IBlockReader worldIn,
                                           List<ITextComponent> tooltip, ITooltipFlag flagIn) {
                    if(Screen.hasShiftDown())
                        tooltip.add(new TranslationTextComponent(("tooltip.oretopia.essenceore")));
                    else {
                        tooltip.add(new TranslationTextComponent(("tooltip.oretopia.default")));
                    }

                }
            });

/*

FOR LATER IMPLEMTATION

 public static final RegistryObject<Block> RADIOUMTNT = registerBlock("radioumtnt",
             () -> new RadioumTNT(AbstractBlock.Properties.create(Material.TNT)
                     .hardnessAndResistance(0.1f)
                     .sound(SoundType.PLANT)){
                 @Override
                 public void addInformation(ItemStack stack, @Nullable IBlockReader worldIn,
                                            List<ITextComponent> tooltip, ITooltipFlag flagIn) {
                     if(Screen.hasShiftDown())
                         tooltip.add(new TranslationTextComponent(("tooltip.oretopia.radioumtnt")));
                     else {
                         tooltip.add(new TranslationTextComponent(("tooltip.oretopia.default")));
                     }

                 }
             });
*/


    private static <T extends Block>RegistryObject<T> registerBlock(String name, Supplier<T> block) {
       RegistryObject<T> toReturn = BLOCKS.register(name, block);
       registerBlockItem(name, toReturn);


        return toReturn;
    }

    private static <T extends Block> void registerBlockItem(String name, RegistryObject<T> block) {
        ModItems.ITEMS.register(name, () -> new BlockItem(block.get(),
        new Item.Properties().group(oretopia.ORETOPIAITEMGROUP)));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }

}
