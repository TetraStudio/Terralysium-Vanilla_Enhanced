package net.dragongod65.terralysium_vanilla_enhanced;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.event.lifecycle.v1.ServerTickEvents;
import net.dragongod65.terralysium_vanilla_enhanced.block.ModBlocks;
import net.dragongod65.terralysium_vanilla_enhanced.block.entity.ModBlockEntities;
import net.dragongod65.terralysium_vanilla_enhanced.fluid.ModFluids;
import net.dragongod65.terralysium_vanilla_enhanced.item.ModItems;
import net.dragongod65.terralysium_vanilla_enhanced.networking.ModMessages;
import net.dragongod65.terralysium_vanilla_enhanced.painting.ModPaintings;
import net.dragongod65.terralysium_vanilla_enhanced.recipe.ModRecipes;
import net.dragongod65.terralysium_vanilla_enhanced.screen.ModScreenHandlers;
import net.dragongod65.terralysium_vanilla_enhanced.util.ModLootTableModifiers;
import net.dragongod65.terralysium_vanilla_enhanced.villager.ModVillagers;
import net.dragongod65.terralysium_vanilla_enhanced.world.feature.ModConfiguredFeatures;
import net.dragongod65.terralysium_vanilla_enhanced.world.gen.ModOreGeneration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

// Very important comment
public class Terralysium_VE implements ModInitializer {
	public static final String MOD_ID = "terralysium_vanilla_enhanced";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModConfiguredFeatures.registerConfiguredFeatures();

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();

		ModVillagers.registerVillagers();
		ModVillagers.registerTrades();

		ModPaintings.registerPaintings();
		ModOreGeneration.generateOres();

		ModLootTableModifiers.modifyLootTables();
		ModMessages.registerC2SPackets();

		ModFluids.register();
		ModBlockEntities.registerBlockEntities();

		ModScreenHandlers.registerAllScreenHandlers();
		ModRecipes.registerRecipes();

	}
}
