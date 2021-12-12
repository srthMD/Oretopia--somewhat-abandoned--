package ro.srth.oretopia.item;

import net.minecraft.item.IItemTier;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.LazyValue;

import java.util.function.Supplier;

public enum ModItemTier implements IItemTier {

    ROMIUM(3, 750, 7f, 5f, 10, () -> Ingredient.fromItems((ModItems.ROMIUM.get()))),
    COPPER(2, 60, 4f, 4f, 5, () -> Ingredient.fromItems((ModItems.COPPER.get()))),
    TUNGSTEN(3, 1500, 9f, 6f, 7, () -> Ingredient.fromItems((ModItems.TUNGSTEN.get()))),
    COBALT(2, 400, 5.5f, 4f, 6, () -> Ingredient.fromItems((ModItems.COBALT.get()))),
    CHROMIUM(3, 700, 7.5f, 5f, 8, () -> Ingredient.fromItems((ModItems.CHROMIUM.get()))),
    RUBY(4, 1400, 9f, 6f, 12, () -> Ingredient.fromItems((ModItems.RUBY.get()))),
    RADIOUM(4, 1300, 8f, 7f, 9, () -> Ingredient.fromItems((ModItems.RADIOUM.get()))),
    ORETOPIUM(4, 2000, 10f, 9f, 15, () -> Ingredient.fromItems((ModItems.ORETOPIUM.get()))),
    TITANIUM(3, 800, 8f, 6f, 6, () -> Ingredient.fromItems((ModItems.TITANIUM.get()))),
    CORRUPTIUM(3, 3000, 14f, 15f, 20, () -> Ingredient.fromItems((ModItems.CORRUPTIUM.get()))),
    ;

    private final int harvestLevel;
    private final int maxUses;
    private final float efficiency;
    private final float attackDamage;
    private final int enchantability;
    private final LazyValue<Ingredient> repairMaterial;

    ModItemTier(int harvestLevel, int maxUses, float efficiency, float attackDamage, int enchantability, Supplier<Ingredient> repairMaterial) {
        this.harvestLevel = harvestLevel;
        this.maxUses = maxUses;
        this.efficiency = efficiency;
        this.attackDamage = attackDamage;
        this.enchantability = enchantability;
        this.repairMaterial = new LazyValue<>(repairMaterial);
    }

    @Override
    public int getMaxUses() {
        return maxUses;
    }

    @Override
    public float getEfficiency() {
        return efficiency;
    }

    @Override
    public float getAttackDamage() {
        return attackDamage;
    }

    @Override
    public int getHarvestLevel() {
        return harvestLevel;
    }

    @Override
    public int getEnchantability() {
        return enchantability;
    }

    @Override
    public Ingredient getRepairMaterial() {
        return repairMaterial.getValue();
    }
}
