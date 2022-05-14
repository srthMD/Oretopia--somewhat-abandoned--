package ro.srth.oretopia.world.gen;

import net.minecraft.block.Block;
import net.minecraftforge.common.util.Lazy;
import ro.srth.oretopia.block.ModBlocks;

public enum OreType {

    COPPER(Lazy.of(ModBlocks.COPPERORE), 8, 30, 55, 10),
    TUNGSTEN(Lazy.of(ModBlocks.TUNGSTENORE), 6, 20, 40, 7),
    RUBY(Lazy.of(ModBlocks.RUBYORE), 4, 10, 15, 5),
    ROMIUM(Lazy.of(ModBlocks.ROMIUMORE), 5, 25, 40, 6),
    CHROMIUM(Lazy.of(ModBlocks.CHROMIUMORE), 6, 5, 25, 5),
    COBALT(Lazy.of(ModBlocks.COBALTORE), 7, 25, 45, 7),
    ORETOPIUM(Lazy.of(ModBlocks.ORETOPIUMORE), 4, 3, 10, 5),
    URANIUM(Lazy.of(ModBlocks.URANIUMORE), 5, 10, 50, 6),
    RADIOUM(Lazy.of(ModBlocks.RADIOUMORE), 4, 3, 15, 5),
    NETHER_RADIOUMORE(Lazy.of(ModBlocks.NETHER_RADIOUMORE), 10, 10, 80, 12),
    BACONITE(Lazy.of(ModBlocks.BACONITEORE), 6, 10, 50, 7),
    TITANIUM(Lazy.of(ModBlocks.TITANIUMORE), 5, 10, 30, 6),
    CORRUPTIUM(Lazy.of(ModBlocks.END_CORRUPTIUMORE), 4, 30, 65, 9),
    ENDERSHARD(Lazy.of(ModBlocks.ENDERIUMORE), 4, 10, 30, 6),
    END_ENDERSHARD(Lazy.of(ModBlocks.END_ENDERIUMORE), 4, 20, 65, 11),
    MUSICDISC(Lazy.of(ModBlocks.MUSICDISCORE), 3, 20, 50, 7),
    ESSENCE(Lazy.of(ModBlocks.ESSENCEORE), 4, 10, 40, 6),

    SAPPHIRE(Lazy.of(ModBlocks.SAPPHIREORE), 3, 5, 30, 5),

    BLACKDIAMOND(Lazy.of(ModBlocks.NETHER_BLACKDIAMONDORE), 4, 10, 80, 12),

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
