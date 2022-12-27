package net.dragongod65.terralysium_vanilla_enhanced.block;

import net.dragongod65.terralysium_vanilla_enhanced.block.custom.*;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.dragongod65.terralysium_vanilla_enhanced.Terralysium_VE;
import net.dragongod65.terralysium_vanilla_enhanced.item.ModItemGroup;
import net.minecraft.block.*;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;
import net.minecraft.util.registry.Registry;

import static net.minecraft.sound.BlockSoundGroup.LADDER;
import static net.minecraft.sound.BlockSoundGroup.SAND;

public class ModBlocks {

    //Test Blocks
    public static final Block TEST_BUTTON_1 = registerBlock("test_button_1",
            new ModWoodenButtonBlock(FabricBlockSettings.of(Material.REDSTONE_LAMP).sounds(LADDER).strength(1).requiresTool().noCollision()), ModItemGroup.VE_TEST);
    public static final Block TEST_BUTTON_2 = registerBlock("test_button_2",
            new ModStoneButtonBlock(FabricBlockSettings.of(Material.REDSTONE_LAMP).sounds(LADDER).strength(1).requiresTool().noCollision()), ModItemGroup.VE_TEST);
    public static final Block TEST_PRESSURE_PLATE = registerBlock("test_pressure_plate",
            new ModPressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING, FabricBlockSettings.of(Material.REDSTONE_LAMP)
                    .sounds(LADDER).strength(1).requiresTool()), ModItemGroup.VE_TEST);
    public static final Block TEST_DOOR = registerBlock("test_door",
            new ModDoorBlock(FabricBlockSettings.of(Material.WOOD)
                    .sounds(LADDER).strength(1).requiresTool().nonOpaque()), ModItemGroup.VE_TEST);
    public static final Block TEST_TRAPDOOR = registerBlock("test_trapdoor",
            new ModTrapdoorBlock(FabricBlockSettings.of(Material.WOOD)
                    .sounds(LADDER).strength(1).requiresTool().nonOpaque()), ModItemGroup.VE_TEST);
    public static final Block TEST_STAIRS = registerBlock("test_stairs",
            new ModStairsBlock(Blocks.OAK_STAIRS.getDefaultState(), FabricBlockSettings.of(Material.REDSTONE_LAMP)
                    .sounds(LADDER).strength(1).requiresTool()), ModItemGroup.VE_TEST);
    public static final Block TEST_FENCE = registerBlock("test_fence",
            new FenceBlock(FabricBlockSettings.of(Material.REDSTONE_LAMP).sounds(LADDER).strength(1).requiresTool()), ModItemGroup.VE_TEST);
    public static final Block TEST_FENCE_GATE = registerBlock("test_fence_gate",
            new FenceGateBlock(FabricBlockSettings.of(Material.REDSTONE_LAMP).sounds(LADDER).strength(1).requiresTool()), ModItemGroup.VE_TEST);
    public static final Block TEST_WALL = registerBlock("test_wall",
            new WallBlock(FabricBlockSettings.of(Material.REDSTONE_LAMP).sounds(LADDER).strength(1).requiresTool()), ModItemGroup.VE_TEST);
    public static final Block TEST_SLAB = registerBlock("test_slab",
            new SlabBlock(FabricBlockSettings.of(Material.REDSTONE_LAMP)
                    .sounds(LADDER).strength(1).requiresTool()), ModItemGroup.VE_TEST);
    public static final Block TEST_BLOCK = registerBlock("test_block",
            new Block(FabricBlockSettings.of(Material.REDSTONE_LAMP).sounds(LADDER).strength(5).requiresTool()), ModItemGroup.VE_TEST);





    public static final Block MAGMATIC_BONE_BLOCK = registerBlock("magmatic_boneblock",
            new Block(FabricBlockSettings.of(Material.ORGANIC_PRODUCT).strength(2f).requiresTool()), ModItemGroup.VE_TEST);

    public static final Block TANZANITE_ORE = registerBlock("tanzanite_ore",
            new OreBlock(FabricBlockSettings.of(Material.STONE).strength(4f).requiresTool(),
                    UniformIntProvider.create(3, 7)), ModItemGroup.VE_TEST);
    public static final Block DEEPSLATE_TANZANITE_ORE = registerBlock("deepslate_tanzanite_ore",
            new OreBlock(FabricBlockSettings.of(Material.STONE).strength(4f).requiresTool(),
                    UniformIntProvider.create(3, 7)), ModItemGroup.VE_TEST);

    public static final Block GLOWING_MUSHROOM = registerBlock("glowing_mushroom",
            new FlowerBlock(StatusEffects.GLOWING, 12, FabricBlockSettings.copy(Blocks.BROWN_MUSHROOM)
                  .nonOpaque()), ModItemGroup.VE_TEST);

    public static final Block JUMPY_BLOCK = registerBlock("jumpy_block",
            new JumpyBlock(FabricBlockSettings.of(Material.METAL).strength(4f).requiresTool()), ModItemGroup.VE_TEST);
    public static final Block GOLDEN_SAND = registerBlock("golden_sand",
            new SpeedyBlocks(FabricBlockSettings.of(Material.SOIL).sounds(SAND).strength(1).requiresTool()), ModItemGroup.VE_TEST);

    public static final Block YELLOW_CRYSTAL_BLOCK = registerBlock("yellow_crystal_block",
            new Block(FabricBlockSettings.copy(Blocks.AMETHYST_BLOCK).requiresTool().sounds(BlockSoundGroup.AMETHYST_BLOCK)), ModItemGroup.VE_TEST);
    public static final Block YELLOW_CRYSTAL = registerBlock("yellow_crystal",
            new Block( FabricBlockSettings.copy(Blocks.AMETHYST_CLUSTER).nonOpaque().requiresTool()), ModItemGroup.VE_TEST);


    public static final Block TANZANITE_LAMP = registerBlock("tanzanite_lamp",
            new TanzaniteLampBlock(FabricBlockSettings.of(Material.METAL).strength(4f).requiresTool()
                    .luminance(state -> state.get(TanzaniteLampBlock.LIT) ? 15 : 0)), ModItemGroup.VE_TEST);

    public static final Block EGGPLANT_CROP = registerBlockWithoutItem("eggplant_crop",
            new EggplantCropBlock(FabricBlockSettings.copy(Blocks.WHEAT)));

    public static final Block LAVENDER_CROP = registerBlockWithoutItem("lavender_crop",
            new EggplantCropBlock(FabricBlockSettings.copy(Blocks.WHEAT)));

    public static final Block GEM_INFUSING_STATION = registerBlock("gem_infusing_station",
            new GemInfusingStationBlock(FabricBlockSettings.of(Material.METAL)
                    .strength(4f).requiresTool().nonOpaque()), ModItemGroup.VE_TEST);


   // Goldbricks
   public static final Block GOLDBRICKS = registerBlock("goldbricks",
           new Block(FabricBlockSettings.of(Material.METAL).requiresTool().sounds(BlockSoundGroup.METAL)), ModItemGroup.VE_TEST);
   // Ironbricks
   public static final Block IRONBRICKS = registerBlock("ironbricks",
           new Block(FabricBlockSettings.of(Material.METAL).requiresTool().sounds(BlockSoundGroup.METAL)), ModItemGroup.VE_TEST);
   // Platinumbricks
   public static final Block PLATINUMBRICKS = registerBlock("platinumbricks",
           new Block(FabricBlockSettings.of(Material.METAL).requiresTool().sounds(BlockSoundGroup.METAL)), ModItemGroup.VE_TEST);


    private static Block registerBlockWithoutItem(String name, Block block) {
        return Registry.register(Registry.BLOCK, new Identifier(Terralysium_VE.MOD_ID, name), block);
    }

    private static Block registerBlock(String name, Block block, ItemGroup tab) {
        registerBlockItem(name, block, tab);
        return Registry.register(Registry.BLOCK, new Identifier(Terralysium_VE.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block, ItemGroup tab) {
        return Registry.register(Registry.ITEM, new Identifier(Terralysium_VE.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings().group(tab)));
    }

    public static void registerModBlocks() {
        Terralysium_VE.LOGGER.debug("Registering ModBlocks for " + Terralysium_VE.MOD_ID);
    }
}
