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
import net.fabricmc.fabric.api.registry.FlammableBlockRegistry;
import net.fabricmc.fabric.api.registry.StrippableBlockRegistry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

// Very important comment
public class Terralysium_VE implements ModInitializer {
	public static final String MOD_ID = "terralysium_vanilla_enhanced";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModConfiguredFeatures.registerConfiguredFeatures();
		reigisterFlammableBlocks();
		registerStrippable();

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

	//To own RegisterClass
	public static void reigisterFlammableBlocks() {
		FlammableBlockRegistry instance = FlammableBlockRegistry.getDefaultInstance();

		instance.add(ModBlocks.PALM_LOG,5,5);
		instance.add(ModBlocks.PALM_WOOD,5,5);
		instance.add(ModBlocks.STRIPPED_PALM_LOG,5,5);
		instance.add(ModBlocks.STRIPPED_PALM_WOOD,5,5);
		instance.add(ModBlocks.PALM_WOOD_BUTTON,5,20);
		instance.add(ModBlocks.PALM_WOOD_DOOR,5,20);
		instance.add(ModBlocks.PALM_WOOD_FENCE,5,20);
		instance.add(ModBlocks.PALM_WOOD_FENCE_GATE,5,20);
		instance.add(ModBlocks.PALM_WOOD_PLANKS,5,20);
		instance.add(ModBlocks.PALM_WOOD_PRESSURE_PLATE,5,20);
		instance.add(ModBlocks.PALM_WOOD_SLAB,5,20);
		instance.add(ModBlocks.PALM_WOOD_STAIRS,5,20);
		instance.add(ModBlocks.PALM_WOOD_TRAPDOOR,5,20);
	}

	public static void registerStrippable() {
		StrippableBlockRegistry.register(ModBlocks.PALM_LOG, ModBlocks.STRIPPED_PALM_LOG);
		StrippableBlockRegistry.register(ModBlocks.PALM_WOOD, ModBlocks.STRIPPED_PALM_WOOD);


	}
}
