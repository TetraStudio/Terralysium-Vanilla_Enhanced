package net.dragongod65.terralysium_vanilla_enhanced.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.dragongod65.terralysium_vanilla_enhanced.block.ModBlocks;
import net.dragongod65.terralysium_vanilla_enhanced.item.ModItems;
import net.minecraft.data.server.RecipeProvider;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.item.Items;
import net.minecraft.util.Identifier;

import java.util.List;
import java.util.function.Consumer;

public class ModRecipeGenerator extends FabricRecipeProvider {
    public ModRecipeGenerator(FabricDataGenerator dataGenerator) {
        super(dataGenerator);
    }

    @Override
    protected void generateRecipes(Consumer<RecipeJsonProvider> exporter) {
        offerSmelting(exporter, List.of(ModBlocks.YELLOW_CRYSTAL_BLOCK), ModItems.YELLOW_CRYSTAL_SHARD,
                3f, 300, "tanzanite");

        offerReversibleCompactingRecipes(exporter, ModItems.YELLOW_CRYSTAL_SHARD, ModBlocks.YELLOW_CRYSTAL_BLOCK);

        ShapedRecipeJsonBuilder.create(ModItems.LAVENDER_SEEDS)
                .pattern("###")
                .pattern("#I#")
                .pattern("###")
                .input('I', Items.IRON_INGOT)
                .input('#', ModItems.YELLOW_CRYSTAL_SHARD)
                .criterion(RecipeProvider.hasItem(Items.IRON_INGOT),
                        RecipeProvider.conditionsFromItem(Items.IRON_INGOT))
                .criterion(RecipeProvider.hasItem(ModItems.YELLOW_CRYSTAL_SHARD),
                        RecipeProvider.conditionsFromItem(ModItems.YELLOW_CRYSTAL_SHARD))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(ModItems.LAVENDER_SEEDS)));
    }
}
