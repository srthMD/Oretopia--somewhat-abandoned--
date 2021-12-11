package ro.srth.oretopia.item.custom;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;



public class CosmeticEnchantedItem extends Item {
    public CosmeticEnchantedItem(Properties properties) {
        super(properties);

    }
    public boolean hasEffect(ItemStack stack) {
        return true;
    }
}