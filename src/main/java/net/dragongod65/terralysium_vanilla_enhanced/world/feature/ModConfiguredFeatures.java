package net.dragongod65.terralysium_vanilla_enhanced.world.feature;

import net.dragongod65.terralysium_vanilla_enhanced.Terralysium_VE;
import net.dragongod65.terralysium_vanilla_enhanced.block.ModBlocks;
import net.minecraft.block.Blocks;
import net.minecraft.structure.rule.BlockMatchRuleTest;
import net.minecraft.util.math.intprovider.ConstantIntProvider;
import net.minecraft.util.registry.RegistryEntry;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.feature.size.TwoLayersFeatureSize;
import net.minecraft.world.gen.foliage.BlobFoliagePlacer;
import net.minecraft.world.gen.stateprovider.BlockStateProvider;
import net.minecraft.world.gen.trunk.StraightTrunkPlacer;

import java.util.List;

public class ModConfiguredFeatures {
    public static final List<OreFeatureConfig.Target> OVERWORLD_TANZANITE_ORES = List.of(
            OreFeatureConfig.createTarget(OreConfiguredFeatures.STONE_ORE_REPLACEABLES, ModBlocks.TANZANITE_ORE.getDefaultState()),
            OreFeatureConfig.createTarget(OreConfiguredFeatures.DEEPSLATE_ORE_REPLACEABLES, ModBlocks.DEEPSLATE_TANZANITE_ORE.getDefaultState()));



    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> TANZANITE_ORE =
            ConfiguredFeatures.register("tanzanite_ore", Feature.ORE, new OreFeatureConfig(OVERWORLD_TANZANITE_ORES, 9));

    public static final RegistryEntry<ConfiguredFeature<TreeFeatureConfig, ?>> PALM_TREE =
            ConfiguredFeatures.register("palm_tree", Feature.TREE, new TreeFeatureConfig.Builder(
                    BlockStateProvider.of(ModBlocks.PALM_LOG),
                    new StraightTrunkPlacer(5, 6, 3),
                    BlockStateProvider.of(ModBlocks.PALM_LEAVES),
                    new BlobFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(0), 4),
                    new TwoLayersFeatureSize(1, 0, 2)).build());

    public static final RegistryEntry<PlacedFeature> PALM_CHECKED = PlacedFeatures.register("palm_checked",
            ModConfiguredFeatures.PALM_TREE, List.of(PlacedFeatures.wouldSurvive(ModBlocks.PALM_SAPLING)));

    public static final RegistryEntry<ConfiguredFeature<RandomFeatureConfig, ?>> PALM_SPAWN =
            ConfiguredFeatures.register("palm_spawn", Feature.RANDOM_SELECTOR,
                    new RandomFeatureConfig(List.of(new RandomFeatureEntry(PALM_CHECKED, 0.5f)),
                            PALM_CHECKED));





    public static void registerConfiguredFeatures() {
        Terralysium_VE.LOGGER.debug("Registering the ModConfiguredFeatures for " + Terralysium_VE.MOD_ID);
    }
}
