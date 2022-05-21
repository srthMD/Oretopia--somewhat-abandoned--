package ro.srth.oretopia.item.custom;
import net.minecraft.client.audio.Sound;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUseContext;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import javax.annotation.Nullable;




public class CosmeticEnchantedItem extends Item {
    public CosmeticEnchantedItem(Properties properties) {
        super(properties);
    }

    public boolean hasEffect(ItemStack stack) {
        return true;
    }
}