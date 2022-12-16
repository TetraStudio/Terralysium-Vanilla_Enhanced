package net.dragongod65.terralysium_vanilla_enhanced.painting;

import net.dragongod65.terralysium_vanilla_enhanced.Terralysium_VE;
import net.minecraft.entity.decoration.painting.PaintingVariant;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModPaintings {
    public static final PaintingVariant SUNSET = registerPainting("sunset", new PaintingVariant(32, 16));
    public static final PaintingVariant PLANT = registerPainting("plant", new PaintingVariant(16, 16));
    public static final PaintingVariant WANDERER = registerPainting("wanderer", new PaintingVariant(16, 32));
    public static final PaintingVariant COLUMBUS = registerPainting("columbus", new PaintingVariant(48,32));

    private static PaintingVariant registerPainting(String name, PaintingVariant paintingVariant) {
        return Registry.register(Registry.PAINTING_VARIANT, new Identifier(Terralysium_VE.MOD_ID, name), paintingVariant);
    }

    public static void registerPaintings() {
        Terralysium_VE.LOGGER.debug("Registering Paintings for " + Terralysium_VE.MOD_ID);
    }
}
