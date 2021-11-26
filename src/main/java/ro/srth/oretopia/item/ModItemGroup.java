package ro.srth.oretopia.item;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class ModItemGroup {

    public static final ItemGroup oretopia = new ItemGroup("oretopia") {
        @Override
        public ItemStack createIcon()
        {
            return new ItemStack(ModItems.COPPER.get());
        }
    };
}
