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


        public static final Tags.IOptionalNamedTag<Item> ROMIUM = createForgeTag("ingots/romium");
        public static final Tags.IOptionalNamedTag<Item> ROMIUMNUGGET = createForgeTag("nuggets /romiumnugget");
        public static final Tags.IOptionalNamedTag<Item> ROMIUMORE = createForgeTag("ores/romiumore");
        public static final Tags.IOptionalNamedTag<Item> RAWURANIUM = createForgeTag("ingots/uranium");
        public static final Tags.IOptionalNamedTag<Item> ENRICHEDURANIUM = createForgeTag("ingots/enricheduranium");
        public static final Tags.IOptionalNamedTag<Item> URANIUM = createForgeTag("ingots/uranium");
        public static final Tags.IOptionalNamedTag<Item> URANIUMORE = createForgeTag("ores/uranium");
        public static final Tags.IOptionalNamedTag<Item> COPPER = createForgeTag("ingots/copper");
        public static final Tags.IOptionalNamedTag<Item> COPPERNUGGET = createForgeTag("nuggets/coppernugget");
        public static final Tags.IOptionalNamedTag<Item> COPPERORE = createForgeTag("ores/copper");
        public static final Tags.IOptionalNamedTag<Item> TUNGSTEN = createForgeTag("ingots/tungsten");
        public static final Tags.IOptionalNamedTag<Item> TUNGSTENNUGGET = createForgeTag("nuggets/tungsten");
        public static final Tags.IOptionalNamedTag<Item> TUNGSTENORE = createForgeTag("ores/tungsten");

        private static Tags.IOptionalNamedTag<Item> createTag(String name) {
            return ItemTags.createOptional(new ResourceLocation(SrthTools.MOD_ID, name));
        }

        private static Tags.IOptionalNamedTag<Item> createForgeTag(String name) {
            return ItemTags.createOptional(new ResourceLocation("forge", name));

        }
    }
}