package ro.srth.srthtools.block;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import ro.srth.srthtools.SrthTools;
import ro.srth.srthtools.item.ModItemGroup;
import ro.srth.srthtools.item.ModItems;

import java.util.function.Supplier;

public class ModBlocks {

    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, SrthTools.MOD_ID);

    public static final RegistryObject<Block> ROMIUMORE = registerBlock("romiumore",
            () -> new Block(AbstractBlock.Properties.create(Material.ROCK)
                    .harvestLevel(2).setRequiresTool().harvestTool(ToolType.PICKAXE).hardnessAndResistance(5f)));

    public static final RegistryObject<Block> URANIUMORE = registerBlock("uraniumore",
            () -> new Block(AbstractBlock.Properties.create(Material.ROCK)
                    .harvestLevel(2).setRequiresTool().harvestTool(ToolType.PICKAXE).hardnessAndResistance(4f)));

    public static final RegistryObject<Block> COPPERORE = registerBlock("copperore",
            () -> new Block(AbstractBlock.Properties.create(Material.ROCK)
                    .harvestLevel(1).setRequiresTool().harvestTool(ToolType.PICKAXE).hardnessAndResistance(2.2f)));

    public static final RegistryObject<Block> TUNGSTENORE = registerBlock("tungstenore",
            () -> new Block(AbstractBlock.Properties.create(Material.ROCK)
                    .harvestLevel(3).setRequiresTool().harvestTool(ToolType.PICKAXE).hardnessAndResistance(6.5f)));


    private static <T extends Block>RegistryObject<T> registerBlock(String name, Supplier<T> block) {
       RegistryObject<T> toReturn = BLOCKS.register(name, block);
       registerBlockItem(name, toReturn);


        return toReturn;
    }

    private static <T extends Block> void registerBlockItem(String name, RegistryObject<T> block) {
        ModItems.ITEMS.register(name, () -> new BlockItem(block.get(),
        new Item.Properties().group(ModItemGroup.SRTH_MODS)));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }


}
