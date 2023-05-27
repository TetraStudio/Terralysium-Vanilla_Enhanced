package net.dragongod65.terralysium_vanilla_enhanced.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.dragongod65.terralysium_vanilla_enhanced.block.ModBlocks;
import net.dragongod65.terralysium_vanilla_enhanced.item.ModItems;
import net.minecraft.client.render.block.BlockModelRenderer;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataGenerator dataGenerator) {
        super(dataGenerator);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.JUMPY_BLOCK);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.TANZANITE_ORE);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.DARK_LAVENDER, Models.GENERATED);
    }
}
