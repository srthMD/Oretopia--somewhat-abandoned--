package ro.srth.srthtools.util;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.Tags;
import ro.srth.srthtools.SrthTools;

public class SrthToolsTags {

    public static class Blocks {


        private static Tags.IOptionalNamedTag<Block> createTag(String name) {
            return BlockTags.createOptional(new ResourceLocation(SrthTools.MOD_ID, name));
        }

        private static Tags.IOptionalNamedTag<Block> createForgeTag(String name) {
            return BlockTags.createOptional(new ResourceLocation("forge", name));

        }
    }
    public static class Items {


        public static final Tags.IOptionalNamedTag<Item> SRTHIUM = createForgeTag("ingots/srthium");
        public static final Tags.IOptionalNamedTag<Item> ROMIUM = createForgeTag("ingots/romium");
        public static final Tags.IOptionalNamedTag<Item> RAWURANIUM = createForgeTag("ingots/rawuranium");

        private static Tags.IOptionalNamedTag<Item> createTag(String name) {
            return ItemTags.createOptional(new ResourceLocation(SrthTools.MOD_ID, name));
        }

        private static Tags.IOptionalNamedTag<Item> createForgeTag(String name) {
            return ItemTags.createOptional(new ResourceLocation("forge", name));

        }
    }
}