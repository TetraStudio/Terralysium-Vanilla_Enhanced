package net.dragongod65.terralysium_vanilla_enhanced.fluid;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.dragongod65.terralysium_vanilla_enhanced.Terralysium_VE;
import net.dragongod65.terralysium_vanilla_enhanced.item.ModItemGroup;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.FluidBlock;
import net.minecraft.fluid.FlowableFluid;
import net.minecraft.item.BucketItem;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModFluids {
    public static FlowableFluid STILL_POISONOUS_ACID;
    public static FlowableFluid FLOWING_POISONOUS_ACID;
    public static Block POISONOUS_ACID_BLOCK;
    public static Item POISONOUS_ACID_BUCKET;

    public static void register() {
        STILL_POISONOUS_ACID = Registry.register(Registry.FLUID,
                new Identifier(Terralysium_VE.MOD_ID, "poisonous_acid"), new PoisonousAcid.Still());
        FLOWING_POISONOUS_ACID = Registry.register(Registry.FLUID,
                new Identifier(Terralysium_VE.MOD_ID, "flowing_poisonous_acid"), new PoisonousAcid.Flowing());

        POISONOUS_ACID_BLOCK = Registry.register(Registry.BLOCK, new Identifier(Terralysium_VE.MOD_ID, "poisonous_acid_block"),
                new FluidBlock(ModFluids.STILL_POISONOUS_ACID, FabricBlockSettings.copyOf(Blocks.WATER)){ });
        POISONOUS_ACID_BUCKET = Registry.register(Registry.ITEM, new Identifier(Terralysium_VE.MOD_ID, "poisonous_acid_bucket"),
                new BucketItem(ModFluids.STILL_POISONOUS_ACID, new FabricItemSettings().group(ModItemGroup.VE_TEST).recipeRemainder(Items.BUCKET).maxCount(1)));

    }
}
