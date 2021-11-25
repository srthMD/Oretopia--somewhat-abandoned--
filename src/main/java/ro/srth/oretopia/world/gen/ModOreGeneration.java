package ro.srth.oretopia.world.gen;

import net.minecraft.block.Blocks;
import net.minecraft.util.RegistryKey;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.WorldGenRegistries;
import net.minecraft.world.Dimension;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.feature.template.BlockMatchRuleTest;
import net.minecraft.world.gen.placement.ConfiguredPlacement;
import net.minecraft.world.gen.placement.Placement;
import net.minecraft.world.gen.placement.TopSolidRangeConfig;
import net.minecraftforge.event.world.BiomeLoadingEvent;

import java.util.Arrays;
//import ro.srth.oretopia.world.biome.ModBiomes;

public class ModOreGeneration {
    public static void generateOres(final BiomeLoadingEvent event) {
        // SPECIFIC MODDED BIOME spawnOreInSpecificModBiome(ModBiomes.samplebiome.get(), OreType.sample, event, Dimension.OVERWORLD.toString());
        // SPECIFIC VANILLA BIOME spawnOreInSpecificBiome(Biomes.DARK_FOREST, OreType.sample, event, Dimension.OVERWORLD.toString());
        /* SPECIFIC DIMENSION */ spawnOreInAllBiomes(OreType.NETHER_RADIOUMORE, event, Dimension.THE_NETHER.toString());
        spawnOreInAllBiomes(OreType.TUNGSTEN, event, Dimension.OVERWORLD.toString());
        spawnOreInAllBiomes(OreType.RADIOUM, event, Dimension.OVERWORLD.toString());
        spawnOreInAllBiomes(OreType.RUBY, event, Dimension.OVERWORLD.toString());
        spawnOreInAllBiomes(OreType.CHROMIUM, event, Dimension.OVERWORLD.toString());
        spawnOreInAllBiomes(OreType.ORETOPIUM, event, Dimension.OVERWORLD.toString());
        spawnOreInAllBiomes(OreType.COPPER, event, Dimension.OVERWORLD.toString());
        spawnOreInAllBiomes(OreType.COBALT, event, Dimension.OVERWORLD.toString());
        spawnOreInAllBiomes(OreType.ROMIUM, event, Dimension.OVERWORLD.toString());
        spawnOreInAllBiomes(OreType.URANIUM, event, Dimension.OVERWORLD.toString());
    }


    private static OreFeatureConfig getOverworldFeatureConfig(OreType ore) {
        return new OreFeatureConfig(OreFeatureConfig.FillerBlockType.BASE_STONE_OVERWORLD,
                ore.getBlock().get().getDefaultState(), ore.getMaxVeinSize());
    }

    private static OreFeatureConfig getNetherFeatureConfig(OreType ore) {
        return new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NETHERRACK,
                ore.getBlock().get().getDefaultState(), ore.getMaxVeinSize());
    }

    private static OreFeatureConfig getEndFeatureConfig(OreType ore) {
        return new OreFeatureConfig(new BlockMatchRuleTest(Blocks.END_STONE),
                ore.getBlock().get().getDefaultState(), ore.getMaxVeinSize());
    }

    // Currently only supports vanilla Dimensions
    private static ConfiguredFeature<?, ?> makeOreFeature(OreType ore, String dimensionToSpawnIn) {
        OreFeatureConfig oreFeatureConfig = null;

        if(dimensionToSpawnIn.equals(Dimension.OVERWORLD.toString())) {
            oreFeatureConfig = getOverworldFeatureConfig(ore);
        } else if(dimensionToSpawnIn.equals(Dimension.THE_NETHER.toString())) {
            oreFeatureConfig = getNetherFeatureConfig(ore);
        } else if(dimensionToSpawnIn.equals(Dimension.THE_END.toString())) {
            oreFeatureConfig = getEndFeatureConfig(ore);
        }

        ConfiguredPlacement<TopSolidRangeConfig> configuredPlacement = Placement.RANGE.configure(
                new TopSolidRangeConfig(ore.getMinHeight(), ore.getMinHeight(), ore.getMaxHeight()));

        return registerOreFeature(ore, oreFeatureConfig, configuredPlacement);
    }

    private static void spawnOreInOverworldInGivenBiomes(OreType ore, final BiomeLoadingEvent event, Biome... biomesToSpawnIn) {
        OreFeatureConfig oreFeatureConfig = new OreFeatureConfig(OreFeatureConfig.FillerBlockType.BASE_STONE_OVERWORLD,
                ore.getBlock().get().getDefaultState(), ore.getMaxVeinSize());

        ConfiguredPlacement<TopSolidRangeConfig> configuredPlacement = Placement.RANGE.configure(
                new TopSolidRangeConfig(ore.getMinHeight(), ore.getMinHeight(), ore.getMaxHeight()));

        ConfiguredFeature<?, ?> oreFeature = registerOreFeature(ore, oreFeatureConfig, configuredPlacement);

        if (Arrays.stream(biomesToSpawnIn).anyMatch(b -> b.getRegistryName().equals(event.getName()))) {
            event.getGeneration().withFeature(GenerationStage.Decoration.UNDERGROUND_ORES, oreFeature);
        }
    }

    private static void spawnOreInOverworldInAllBiomes(OreType ore, final BiomeLoadingEvent event) {
        OreFeatureConfig oreFeatureConfig = new OreFeatureConfig(OreFeatureConfig.FillerBlockType.BASE_STONE_OVERWORLD,
                ore.getBlock().get().getDefaultState(), ore.getMaxVeinSize());

        ConfiguredPlacement<TopSolidRangeConfig> configuredPlacement = Placement.RANGE.configure(
                new TopSolidRangeConfig(ore.getMinHeight(), ore.getMinHeight(), ore.getMaxHeight()));

        ConfiguredFeature<?, ?> oreFeature = registerOreFeature(ore, oreFeatureConfig, configuredPlacement);

        event.getGeneration().withFeature(GenerationStage.Decoration.UNDERGROUND_ORES, oreFeature);
    }

    private static void spawnOreInSpecificModBiome(Biome biomeToSpawnIn, OreType currentOreType,
                                                   final BiomeLoadingEvent event, String dimension) {
        if(event.getName().toString().contains(biomeToSpawnIn.getRegistryName().toString())) {
            event.getGeneration().withFeature(GenerationStage.Decoration.UNDERGROUND_ORES, makeOreFeature(currentOreType, dimension));
        }
    }

    private static void spawnOreInSpecificBiome(RegistryKey<Biome> biomeToSpawnIn, OreType currentOreType,
                                                final BiomeLoadingEvent event, String dimension) {
        if(event.getName().toString().contains(biomeToSpawnIn.getLocation().toString())) {
            event.getGeneration().withFeature(GenerationStage.Decoration.UNDERGROUND_ORES, makeOreFeature(currentOreType, dimension));
        }
    }

    private static void spawnOreInAllBiomes(OreType currentOreType, final BiomeLoadingEvent event, String dimension) {
        event.getGeneration().withFeature(GenerationStage.Decoration.UNDERGROUND_ORES,
                makeOreFeature(currentOreType, dimension));
    }

    private static ConfiguredFeature<?, ?> registerOreFeature(OreType ore, OreFeatureConfig oreFeatureConfig,
                                                              ConfiguredPlacement configuredPlacement) {
        return Registry.register(WorldGenRegistries.CONFIGURED_FEATURE, ore.getBlock().get().getRegistryName(),
                Feature.ORE.withConfiguration(oreFeatureConfig).withPlacement(configuredPlacement)
                        .square().count(ore.getVeinsPerChunk()));
    }
}