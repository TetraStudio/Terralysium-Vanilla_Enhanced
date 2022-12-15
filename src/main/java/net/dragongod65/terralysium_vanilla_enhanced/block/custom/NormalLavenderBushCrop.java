package net.dragongod65.terralysium_vanilla_enhanced.block.custom;

import net.minecraft.block.CropBlock;
import net.minecraft.item.ItemConvertible;
import net.dragongod65.terralysium_vanilla_enhanced.item.ModItems;

public class NormalLavenderBushCrop extends CropBlock {
    public NormalLavenderBushCrop(Settings settings) {
        super(settings);
    }

    @Override
    protected ItemConvertible getSeedsItem() {
        return ModItems.LAVENDER_SEEDS;
    }
}
