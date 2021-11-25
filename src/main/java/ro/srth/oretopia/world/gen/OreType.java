package ro.srth.oretopia.world.gen;

import net.minecraft.block.Block;
import net.minecraftforge.common.util.Lazy;
import ro.srth.oretopia.block.ModBlocks;

public enum OreType {

    COPPER(Lazy.of(ModBlocks.COPPERORE), 7, 30, 55, 10),
    TUNGSTEN(Lazy.of(ModBlocks.TUNGSTENORE), 5, 20, 40, 8),
    RUBY(Lazy.of(ModBlocks.RUBYORE), 3, 10, 15, 6),
    ROMIUM(Lazy.of(ModBlocks.ROMIUMORE), 4, 25, 40, 6),
    CHROMIUM(Lazy.of(ModBlocks.CHROMIUMORE), 5, 5, 25, 6),
    COBALT(Lazy.of(ModBlocks.COBALTORE), 6, 25, 45, 6),
    ORETOPIUM(Lazy.of(ModBlocks.ORETOPIUMORE), 3, 3, 10, 6),
    URANIUM(Lazy.of(ModBlocks.URANIUMORE), 4, 10, 50, 6),
    RADIOUM(Lazy.of(ModBlocks.RADIOUMORE), 3, 3, 15, 6),
    NETHER_RADIOUMORE(Lazy.of(ModBlocks.NETHER_RADIOUMORE), 5, 10, 80, 6),
    BACONITE(Lazy.of(ModBlocks.BACONITEORE), 5, 10, 50, 7),

    ;

    private final Lazy<Block> block;
    private final int maxVeinSize;
    private final int minHeight;
    private final int maxHeight;
    private final int veinsPerChunk;

    OreType(Lazy<Block> block, int maxVeinSize, int minHeight, int maxHeight, int veinsPerChunk) {
        this.block = block;
        this.maxVeinSize = maxVeinSize;
        this.minHeight = minHeight;
        this.maxHeight = maxHeight;
        this.veinsPerChunk = veinsPerChunk;
    }

    public Lazy<Block> getBlock() {
        return block;
    }

    public int getMaxVeinSize() {
        return maxVeinSize;
    }

    public int getMinHeight() {
        return minHeight;
    }

    public int getMaxHeight() {
        return maxHeight;
    }

    public int getVeinsPerChunk() {
        return veinsPerChunk;
    }

    public static OreType get(Block block) {
        for (OreType ore : values()) {
            if(block == ore.block){
                return ore;
            }
        }
        return null;
    }
}
