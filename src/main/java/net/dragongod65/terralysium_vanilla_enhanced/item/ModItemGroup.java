package net.dragongod65.terralysium_vanilla_enhanced.item;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.dragongod65.terralysium_vanilla_enhanced.Terralysium_VE;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class ModItemGroup {
    public static final ItemGroup VE_TEST = FabricItemGroupBuilder.build(
            new Identifier(Terralysium_VE.MOD_ID, "magmatic_bone"), () -> new ItemStack(ModItems.MAGMATIC_BONE));

    public static final ItemGroup DECORATION = FabricItemGroupBuilder.build(
            new Identifier(Terralysium_VE.MOD_ID, "decoration"), () -> new ItemStack(ModItems.MAGMATIC_BONE));
}
