package net.dragongod65.terralysium_vanilla_enhanced.item;

import net.dragongod65.terralysium_vanilla_enhanced.item.custom.BetterHoeItem;
import net.dragongod65.terralysium_vanilla_enhanced.item.custom.ScrollofReturning;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.dragongod65.terralysium_vanilla_enhanced.Terralysium_VE;
import net.dragongod65.terralysium_vanilla_enhanced.block.ModBlocks;
import net.minecraft.item.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {
    //New Platinum Metal | Todo: Add MetalItems, Other Tools, Blocks
    public static final Item PLATINUM = registerItem("platinum",
            new Item(new FabricItemSettings().group(ModItemGroup.VE_TEST)));
    public static final Item PLATINUM_INGOT = registerItem("platinum_ingot",
            new Item(new FabricItemSettings().group(ModItemGroup.VE_TEST)));
    public static final Item PLATINUM_NUGGET = registerItem("platinum_nugget",
            new Item(new FabricItemSettings().group(ModItemGroup.VE_TEST)));

    public static final Item PLATINUM_SWORD = registerItem("platinum_sword",
            new SwordItem(ModToolMaterials.PLATINUM, 10, 1.7f,
                    new FabricItemSettings().group(ModItemGroup.VE_TEST).maxCount(1)));
    public static final Item PLATINUM_PICKAXE = registerItem("platinum_pickaxe",
            new PickaxeItem(ModToolMaterials.PLATINUM, 4, 2f,
                    new FabricItemSettings().group(ModItemGroup.VE_TEST).maxCount(1)));
    public static final Item PLATINUM_AXE = registerItem("platinum_axe",
            new AxeItem(ModToolMaterials.PLATINUM, 12, 2f,
                    new FabricItemSettings().group(ModItemGroup.VE_TEST).maxCount(1)));
    public static final Item PLATINUM_SHOVEL = registerItem("platinum_shovel",
            new ShovelItem(ModToolMaterials.PLATINUM, 4, 2f,
                    new FabricItemSettings().group(ModItemGroup.VE_TEST).maxCount(1)));
    public static final Item PLATINUM_HOE = registerItem("platinum_hoe",
            new BetterHoeItem(ModToolMaterials.PLATINUM, 4, 2f,
                    new FabricItemSettings().group(ModItemGroup.VE_TEST).maxCount(1)));




    public static final Item SCROLL_OF_RETURNING = registerItem("scroll_of_returning",
            new ScrollofReturning(new FabricItemSettings().group(ModItemGroup.VE_TEST).maxCount(1)));

    public static final Item YELLOW_CRYSTAL_SHARD = registerItem("yellow_crystal_shard",
            new Item(new FabricItemSettings().group(ModItemGroup.VE_TEST)));

    public static final Item BLUE_CRYSTAL_SHARD = registerItem("blue_crystal_shard",
            new Item(new FabricItemSettings().group(ModItemGroup.VE_TEST)));

    public static final Item RED_CRYSTAL_SHARD = registerItem("red_crystal_shard",
            new Item(new FabricItemSettings().group(ModItemGroup.VE_TEST)));

    public static final Item ORANGE_CRYSTAL_SHARD = registerItem("orange_crystal_shard",
            new Item(new FabricItemSettings().group(ModItemGroup.VE_TEST)));

    public static final Item GREEN_CRYSTAL_SHARD = registerItem("green_crystal_shard",
            new Item(new FabricItemSettings().group(ModItemGroup.VE_TEST)));



    public static final Item MAGMATIC_BONE = registerItem("magmatic_bone",
            new Item(new FabricItemSettings().group(ModItemGroup.VE_TEST)));

    public static final Item LAVENDER_SEEDS = registerItem("lavender",
            new AliasedBlockItem(ModBlocks.LAVENDER_CROP,
                    new FabricItemSettings().group(ModItemGroup.VE_TEST)));
    public static final Item DARK_LAVENDER = registerItem("dark_lavender",
            new Item(new FabricItemSettings().group(ModItemGroup.VE_TEST).maxCount(64)));
    public static final Item NORMAL_LAVENDER = registerItem("normal_lavender",
            new Item(new FabricItemSettings().group(ModItemGroup.VE_TEST).maxCount(64)));
    public static final Item LIGHT_LAVENDER = registerItem("light_lavender",
            new Item(new FabricItemSettings().group(ModItemGroup.VE_TEST).maxCount(64)));


    public static final Item EGGPLANT_SEEDS = registerItem("eggplant_seeds",
            new AliasedBlockItem(ModBlocks.EGGPLANT_CROP,
                    new FabricItemSettings().group(ModItemGroup.VE_TEST)));
    public static final Item EGGPLANT = registerItem("eggplant",
            new Item(new FabricItemSettings().group(ModItemGroup.VE_TEST)
                    .food(MoreFoodComponents.EGGPLANT)));

    public static final Item BANANA = registerItem("banana",
            new Item(new FabricItemSettings().group(ModItemGroup.VE_TEST)
                    .food(MoreFoodComponents.BANANA)));

    public static final Item CORN = registerItem("corn",
            new Item(new FabricItemSettings().group(ModItemGroup.VE_TEST)
                    .food(MoreFoodComponents.CORN)));

    public static final Item PEACH = registerItem("peach",
            new Item(new FabricItemSettings().group(ModItemGroup.VE_TEST)
                    .food(MoreFoodComponents.PEACH)));

    public static final Item CHILI = registerItem("chili",
            new Item(new FabricItemSettings().group(ModItemGroup.VE_TEST)
                    .food(MoreFoodComponents.CHILI)));

    public static final Item MANGO = registerItem("mango",
            new Item(new FabricItemSettings().group(ModItemGroup.VE_TEST)
                    .food(MoreFoodComponents.MANGO)));

    public static final Item LETTUCE = registerItem("lettuce",
            new Item(new FabricItemSettings().group(ModItemGroup.VE_TEST)
                    .food(MoreFoodComponents.LETTUCE)));

    public static final Item PINEAPPLE = registerItem("pineapple",
            new Item(new FabricItemSettings().group(ModItemGroup.VE_TEST)
                    .food(MoreFoodComponents.PINEAPPLE)));

    public static final Item STRIDER_MILK = registerItem("strider_milk",
            new Item(new FabricItemSettings().group(ModItemGroup.VE_TEST).maxCount(1)
                    .food(MoreFoodComponents.STRIDER_MILK)));

    public static final Item KAUPENSWORD = registerItem("kaupensword",
            new SwordItem(ToolMaterials.DIAMOND, 10, 5f,
                    new FabricItemSettings().group(ModItemGroup.VE_TEST).maxCount(1)));

    public static final Item DROM = registerItem("drom",
            new SwordItem(ToolMaterials.DIAMOND, 10, 5f,
                    new FabricItemSettings().group(ModItemGroup.VE_TEST).maxCount(1)));

    public static final Item LOTUSFLOWER = registerItem("lotusflower",
            new Item(new FabricItemSettings().group(ModItemGroup.VE_TEST).maxCount(1)));
    public static final Item ORCHIDEAFLOWER = registerItem("orchideaflower",
            new Item(new FabricItemSettings().group(ModItemGroup.VE_TEST).maxCount(1)));
    public static final Item REDFOREFLOWER = registerItem("redfireflower",
            new Item(new FabricItemSettings().group(ModItemGroup.VE_TEST).maxCount(1)));


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(Terralysium_VE.MOD_ID, name), item);
    }

    public static void registerModItems() {
        Terralysium_VE.LOGGER.debug("Registering Mod Items for " + Terralysium_VE.MOD_ID);
    }
}
