package ro.srth.oretopia.util;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.Tags;
import ro.srth.oretopia.oretopia;

public class oretopiaTags {

    public static class Blocks {


        private static Tags.IOptionalNamedTag<Block> createTag(String name) {
            return BlockTags.createOptional(new ResourceLocation(oretopia.MOD_ID, name));
        }

        private static Tags.IOptionalNamedTag<Block> createForgeTag(String name) {
            return BlockTags.createOptional(new ResourceLocation("forge", name));

        }
    }
    public static class Items {


        public static final Tags.IOptionalNamedTag<Item> ROMIUM = createForgeTag("ingots/romium");
        public static final Tags.IOptionalNamedTag<Item> ROMIUMNUGGET = createForgeTag("nuggets/romiumnugget");
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
        public static final Tags.IOptionalNamedTag<Item> CHROMIUMORE = createForgeTag("ores/chromium");
        public static final Tags.IOptionalNamedTag<Item> CHROMIUM = createForgeTag("ingots/chromium");
        public static final Tags.IOptionalNamedTag<Item> CHROMIUMNUGGET = createForgeTag("nuggets/chromium");
        public static final Tags.IOptionalNamedTag<Item> COBALTNUGGET = createForgeTag("nuggets/cobalt");
        public static final Tags.IOptionalNamedTag<Item> COBALT = createForgeTag("ingots/cobalt");
        public static final Tags.IOptionalNamedTag<Item> COBALTORE = createForgeTag("ores/cobalt");
        public static final Tags.IOptionalNamedTag<Item> RUBYORE = createForgeTag("ores/ruby");
        public static final Tags.IOptionalNamedTag<Item> RUBY = createForgeTag("gems/ruby");
        public static final Tags.IOptionalNamedTag<Item> ORETOPIUM = createForgeTag("ingots/oretopium");
        public static final Tags.IOptionalNamedTag<Item> ORETOPIUMNUGGET = createForgeTag("nuggets/oretopium");
        public static final Tags.IOptionalNamedTag<Item> ORETOPIUMORE = createForgeTag("ores/oretopium");
        public static final Tags.IOptionalNamedTag<Item> RADIOUMORE = createForgeTag("ores/radioum");
        public static final Tags.IOptionalNamedTag<Item> RADIOUM = createForgeTag("ingots/radioum");
        public static final Tags.IOptionalNamedTag<Item> RADIOUMNUGGET = createForgeTag("nuggets/radioum");
        public static final Tags.IOptionalNamedTag<Item> TITANIUMNUGGET = createForgeTag("nuggets/titanium");
        public static final Tags.IOptionalNamedTag<Item> TITANIUM = createForgeTag("ingots/titanium");
        public static final Tags.IOptionalNamedTag<Item> TITANIUMORE = createForgeTag("ores/titanium");
        public static final Tags.IOptionalNamedTag<Item> CORRUPTIUMNUGGET = createForgeTag("nuggets/corruptium");
        public static final Tags.IOptionalNamedTag<Item> CORRUPTIUM = createForgeTag("ingots/corruptium");
        public static final Tags.IOptionalNamedTag<Item> END_CORRUPTIUMORE = createForgeTag("ores/corruptium");
        public static final Tags.IOptionalNamedTag<Item> RAWBACONITE = createForgeTag("ingots/rawbaconite");
        public static final Tags.IOptionalNamedTag<Item> BACONITEORE = createForgeTag("ores/baconite");
        public static final Tags.IOptionalNamedTag<Item> END_ENDERIUMORE = createForgeTag("ores/end_enderiumore");
        public static final Tags.IOptionalNamedTag<Item> ENDERIUMORE = createForgeTag("ores/enderium");
        public static final Tags.IOptionalNamedTag<Item> ENDERSHARD = createForgeTag("shards/ender");
        public static final Tags.IOptionalNamedTag<Item> COOKEDBACONITE = createForgeTag("ingots/cookedbaconite");

        private static Tags.IOptionalNamedTag<Item> createTag(String name) {
            return ItemTags.createOptional(new ResourceLocation(oretopia.MOD_ID, name));
        }

        private static Tags.IOptionalNamedTag<Item> createForgeTag(String name) {
            return ItemTags.createOptional(new ResourceLocation("forge", name));

        }
    }
}