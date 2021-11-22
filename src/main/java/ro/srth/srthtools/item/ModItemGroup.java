package ro.srth.srthtools.item;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class ModItemGroup {

    public static final ItemGroup SRTH_MODS = new ItemGroup("srthtools") {
        @Override
        public ItemStack createIcon()
        {
            return new ItemStack(ModItems.ROMIUM.get());
        }
    };
}
