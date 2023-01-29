package net.dragongod65.terralysium_vanilla_enhanced.util;

import net.dragongod65.terralysium_vanilla_enhanced.block.ModBlocks;
import net.fabricmc.fabric.api.registry.FlammableBlockRegistry;
import net.fabricmc.fabric.api.registry.StrippableBlockRegistry;

public class BlockFeatures {
    public static void reigisterFlammableBlocks() {
        FlammableBlockRegistry instance = FlammableBlockRegistry.getDefaultInstance();

        instance.add(ModBlocks.PALM_LOG, 5, 5);
        instance.add(ModBlocks.PALM_WOOD, 5, 5);
        instance.add(ModBlocks.STRIPPED_PALM_LOG, 5, 5);
        instance.add(ModBlocks.STRIPPED_PALM_WOOD, 5, 5);
        instance.add(ModBlocks.PALM_LEAVES,30,60);
        instance.add(ModBlocks.PALM_WOOD_BUTTON, 5, 20);
        instance.add(ModBlocks.PALM_WOOD_DOOR, 5, 20);
        instance.add(ModBlocks.PALM_WOOD_FENCE, 5, 20);
        instance.add(ModBlocks.PALM_WOOD_FENCE_GATE, 5, 20);
        instance.add(ModBlocks.PALM_WOOD_PLANKS, 5, 20);
        instance.add(ModBlocks.PALM_WOOD_PRESSURE_PLATE, 5, 20);
        instance.add(ModBlocks.PALM_WOOD_SLAB, 5, 20);
        instance.add(ModBlocks.PALM_WOOD_STAIRS, 5, 20);
        instance.add(ModBlocks.PALM_WOOD_TRAPDOOR, 5, 20);
    }

    public static void registerStrippable() {
        StrippableBlockRegistry.register(ModBlocks.PALM_LOG, ModBlocks.STRIPPED_PALM_LOG);
        StrippableBlockRegistry.register(ModBlocks.PALM_WOOD, ModBlocks.STRIPPED_PALM_WOOD);
    }
}
