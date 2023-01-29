package net.dragongod65.terralysium_vanilla_enhanced;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.render.fluid.v1.FluidRenderHandlerRegistry;
import net.fabricmc.fabric.api.client.render.fluid.v1.SimpleFluidRenderHandler;
import net.dragongod65.terralysium_vanilla_enhanced.block.ModBlocks;
import net.dragongod65.terralysium_vanilla_enhanced.fluid.ModFluids;
import net.dragongod65.terralysium_vanilla_enhanced.networking.ModMessages;
import net.dragongod65.terralysium_vanilla_enhanced.screen.GemInfusingScreen;
import net.dragongod65.terralysium_vanilla_enhanced.screen.ModScreenHandlers;
import net.minecraft.client.gui.screen.ingame.HandledScreens;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.util.Identifier;

public class Terralysium_VE_Client implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        //Palma
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.PALM_LEAVES, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.PALM_SAPLING, RenderLayer.getCutout());

        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.EGGPLANT_CROP, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.GLOWING_MUSHROOM, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.YELLOW_CRYSTAL, RenderLayer.getCutout());
        ModMessages.registerS2CPackets();

        FluidRenderHandlerRegistry.INSTANCE.register(ModFluids.STILL_POISONOUS_ACID, ModFluids.FLOWING_POISONOUS_ACID,
                new SimpleFluidRenderHandler(
                        new Identifier("minecraft:block/water_still"),
                        new Identifier("minecraft:block/water_flow"),
                        0x862d86
                ));

        BlockRenderLayerMap.INSTANCE.putFluids(RenderLayer.getTranslucent(),
                ModFluids.STILL_POISONOUS_ACID, ModFluids.FLOWING_POISONOUS_ACID);

        HandledScreens.register(ModScreenHandlers.GEM_INFUSING_SCREEN_HANDLER, GemInfusingScreen::new);
    }
}
