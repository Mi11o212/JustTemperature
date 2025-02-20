package toughasnails.neoforge.datagen.provider;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.alchemy.PotionContents;
import net.minecraft.world.item.alchemy.Potions;
import net.minecraft.world.item.crafting.Ingredient;
import toughasnails.api.block.TANBlocks;
import toughasnails.api.item.TANItems;
import toughasnails.core.ToughAsNails;
import toughasnails.neoforge.datagen.recipes.WaterPurifierRecipeBuilder;

import java.util.concurrent.CompletableFuture;

public class TANRecipeProvider extends RecipeProvider
{
    public TANRecipeProvider(HolderLookup.Provider provider, RecipeOutput output)
    {
        super(provider, output);
    }

    @Override
    protected void buildRecipes()
    {
        // Canteen
        this.shaped(RecipeCategory.TOOLS, TANItems.EMPTY_LEATHER_CANTEEN).define('#', Items.LEATHER).pattern(" # ").pattern("# #").pattern(" # ").unlockedBy("has_leather", has(Items.LEATHER)).save(output);
        this.shaped(RecipeCategory.TOOLS, TANItems.EMPTY_COPPER_CANTEEN).define('#', Items.COPPER_INGOT).pattern(" # ").pattern("# #").pattern(" # ").unlockedBy("has_copper_ingot", has(Items.COPPER_INGOT)).save(output);
        this.shaped(RecipeCategory.TOOLS, TANItems.EMPTY_IRON_CANTEEN).define('#', Items.IRON_INGOT).pattern(" # ").pattern("# #").pattern(" # ").unlockedBy("has_iron_ingot", has(Items.IRON_INGOT)).save(output);
        this.shaped(RecipeCategory.TOOLS, TANItems.EMPTY_GOLD_CANTEEN).define('#', Items.GOLD_INGOT).pattern(" # ").pattern("# #").pattern(" # ").unlockedBy("has_gold_ingot", has(Items.GOLD_INGOT)).save(output);
        this.shaped(RecipeCategory.TOOLS, TANItems.EMPTY_DIAMOND_CANTEEN).define('#', Items.DIAMOND).pattern(" # ").pattern("# #").pattern(" # ").unlockedBy("has_diamond", has(Items.DIAMOND)).save(output);
        netheriteSmithing(output, TANItems.EMPTY_DIAMOND_CANTEEN, RecipeCategory.TOOLS, TANItems.EMPTY_NETHERITE_CANTEEN);
        netheriteSmithing(output, TANItems.DIAMOND_DIRTY_WATER_CANTEEN, RecipeCategory.TOOLS, TANItems.NETHERITE_DIRTY_WATER_CANTEEN);
        netheriteSmithing(output, TANItems.DIAMOND_WATER_CANTEEN, RecipeCategory.TOOLS, TANItems.NETHERITE_WATER_CANTEEN);
        netheriteSmithing(output, TANItems.DIAMOND_PURIFIED_WATER_CANTEEN, RecipeCategory.TOOLS, TANItems.NETHERITE_PURIFIED_WATER_CANTEEN);

        // Juice
        this.shapeless(RecipeCategory.FOOD, TANItems.APPLE_JUICE).requires(TANItems.PURIFIED_WATER_BOTTLE).requires(Items.SUGAR).requires(Items.APPLE).group("juice").unlockedBy("has_apple", has(Items.APPLE)).save(output);
        this.shapeless(RecipeCategory.FOOD, TANItems.CACTUS_JUICE).requires(TANItems.PURIFIED_WATER_BOTTLE).requires(Items.SUGAR).requires(Items.CACTUS).group("juice").unlockedBy("has_cactus", has(Items.CACTUS)).save(output);
        this.shapeless(RecipeCategory.FOOD, TANItems.CHORUS_FRUIT_JUICE).requires(TANItems.PURIFIED_WATER_BOTTLE).requires(Items.SUGAR).requires(Items.CHORUS_FRUIT).group("juice").unlockedBy("has_chorus_fruit", has(Items.CHORUS_FRUIT)).save(output);
        this.shapeless(RecipeCategory.FOOD, TANItems.GLOW_BERRY_JUICE).requires(TANItems.PURIFIED_WATER_BOTTLE).requires(Items.SUGAR).requires(Items.GLOW_BERRIES).group("juice").unlockedBy("has_glow_berries", has(Items.GLOW_BERRIES)).save(output);
        this.shapeless(RecipeCategory.FOOD, TANItems.MELON_JUICE).requires(TANItems.PURIFIED_WATER_BOTTLE).requires(Items.SUGAR).requires(Items.MELON_SLICE).group("juice").unlockedBy("has_melon_slice", has(Items.MELON_SLICE)).save(output);
        this.shapeless(RecipeCategory.FOOD, TANItems.PUMPKIN_JUICE).requires(TANItems.PURIFIED_WATER_BOTTLE).requires(Items.SUGAR).requires(Items.PUMPKIN).group("juice").unlockedBy("has_pumpkin", has(Items.PUMPKIN)).save(output);
        this.shapeless(RecipeCategory.FOOD, TANItems.SWEET_BERRY_JUICE).requires(TANItems.PURIFIED_WATER_BOTTLE).requires(Items.SUGAR).requires(Items.SWEET_BERRIES).group("juice").unlockedBy("has_sweet_berries", has(Items.SWEET_BERRIES)).save(output);

        // Foods
        this.shaped(RecipeCategory.FOOD, TANItems.ICE_CREAM).define('#', Items.SNOWBALL).define('S', Items.SUGAR).define('B', Items.BOWL).pattern(" # ").pattern("#S#").pattern(" B ").unlockedBy("has_snowball", has(Items.SNOWBALL)).save(output);
        this.shaped(RecipeCategory.FOOD, TANItems.CHARC_0S).define('#', Items.CHARCOAL).define('S', Items.SUGAR).define('B', Items.BOWL).pattern(" # ").pattern("#S#").pattern(" B ").unlockedBy("has_charcoal", has(Items.CHARCOAL)).save(output);

        // Blocks
        this.shaped(RecipeCategory.DECORATIONS, TANBlocks.THERMOREGULATOR).define('S', Items.SMOOTH_STONE).define('I', Items.IRON_INGOT).define('T', TANItems.THERMOMETER).pattern("SIS").pattern("ITI").pattern("SIS").unlockedBy("has_thermometer", has(TANItems.THERMOMETER)).save(output);
        this.shaped(RecipeCategory.REDSTONE, TANBlocks.TEMPERATURE_GAUGE).define('G', Items.GLASS).define('Q', Items.QUARTZ).define('T', TANItems.THERMOMETER).define('B', Items.BRICK_SLAB).pattern("GGG").pattern("QTQ").pattern("BBB").unlockedBy("has_thermometer", has(TANItems.THERMOMETER)).save(output);
        this.shaped(RecipeCategory.DECORATIONS, TANBlocks.RAIN_COLLECTOR).define('W', ItemTags.PLANKS).define('S', Items.STRING).pattern("WSW").pattern("W W").pattern("WWW").unlockedBy("has_string", has(Items.STRING)).save(output);
        this.shaped(RecipeCategory.DECORATIONS, TANBlocks.WATER_PURIFIER).define('W', ItemTags.PLANKS).define('C', Items.COPPER_INGOT).define('G', Items.GLASS).pattern("GCG").pattern("C C").pattern("WWW").unlockedBy("has_copper_ingot", has(Items.COPPER_INGOT)).save(output);

        // Armor
        this.shaped(RecipeCategory.COMBAT, TANItems.LEAF_BOOTS).define('X', ItemTags.LEAVES).pattern("X X").pattern("X X").unlockedBy("has_leaves", has(ItemTags.LEAVES)).save(output);
        this.shaped(RecipeCategory.COMBAT, TANItems.LEAF_CHESTPLATE).define('X', ItemTags.LEAVES).pattern("X X").pattern("XXX").pattern("XXX").unlockedBy("has_leaves", has(ItemTags.LEAVES)).save(output);
        this.shaped(RecipeCategory.COMBAT, TANItems.LEAF_HELMET).define('X', ItemTags.LEAVES).pattern("XXX").pattern("X X").unlockedBy("has_leaves", has(ItemTags.LEAVES)).save(output);
        this.shaped(RecipeCategory.COMBAT, TANItems.LEAF_LEGGINGS).define('X', ItemTags.LEAVES).pattern("XXX").pattern("X X").pattern("X X").unlockedBy("has_leaves", has(ItemTags.LEAVES)).save(output);

        this.shaped(RecipeCategory.COMBAT, TANItems.WOOL_BOOTS).define('X', ItemTags.WOOL).pattern("X X").pattern("X X").unlockedBy("has_wool", has(ItemTags.WOOL)).save(output);
        this.shaped(RecipeCategory.COMBAT, TANItems.WOOL_CHESTPLATE).define('X', ItemTags.WOOL).pattern("X X").pattern("XXX").pattern("XXX").unlockedBy("has_wool", has(ItemTags.WOOL)).save(output);
        this.shaped(RecipeCategory.COMBAT, TANItems.WOOL_HELMET).define('X', ItemTags.WOOL).pattern("XXX").pattern("X X").unlockedBy("has_wool", has(ItemTags.WOOL)).save(output);
        this.shaped(RecipeCategory.COMBAT, TANItems.WOOL_LEGGINGS).define('X', ItemTags.WOOL).pattern("XXX").pattern("X X").pattern("X X").unlockedBy("has_wool", has(ItemTags.WOOL)).save(output);

        this.shaped(RecipeCategory.TOOLS, TANItems.THERMOMETER).define('#', Items.COPPER_INGOT).define('X', Items.REDSTONE).pattern(" # ").pattern("#X#").pattern(" # ").unlockedBy("has_redstone", has(Items.REDSTONE)).save(output);

        //
        // Water purification recipes
        //

        // Water bottle
        waterPurifier(output, new ItemStack(TANItems.DIRTY_WATER_BOTTLE), PotionContents.createItemStack(Items.POTION, Potions.WATER), 400);
        waterPurifier(output, PotionContents.createItemStack(Items.POTION, Potions.WATER), new ItemStack(TANItems.PURIFIED_WATER_BOTTLE), 200);

        // Canteens
        waterPurifier(output, new ItemStack(TANItems.LEATHER_DIRTY_WATER_CANTEEN), new ItemStack(TANItems.LEATHER_WATER_CANTEEN), 400);
        waterPurifier(output, new ItemStack(TANItems.COPPER_DIRTY_WATER_CANTEEN), new ItemStack(TANItems.COPPER_WATER_CANTEEN), 400);
        waterPurifier(output, new ItemStack(TANItems.IRON_DIRTY_WATER_CANTEEN), new ItemStack(TANItems.IRON_WATER_CANTEEN), 400);
        waterPurifier(output, new ItemStack(TANItems.GOLD_DIRTY_WATER_CANTEEN), new ItemStack(TANItems.GOLD_WATER_CANTEEN), 400);
        waterPurifier(output, new ItemStack(TANItems.DIAMOND_DIRTY_WATER_CANTEEN), new ItemStack(TANItems.DIAMOND_WATER_CANTEEN), 400);
        waterPurifier(output, new ItemStack(TANItems.NETHERITE_DIRTY_WATER_CANTEEN), new ItemStack(TANItems.NETHERITE_WATER_CANTEEN), 400);

        waterPurifier(output, new ItemStack(TANItems.LEATHER_WATER_CANTEEN), new ItemStack(TANItems.LEATHER_PURIFIED_WATER_CANTEEN), 200);
        waterPurifier(output, new ItemStack(TANItems.COPPER_WATER_CANTEEN), new ItemStack(TANItems.COPPER_PURIFIED_WATER_CANTEEN), 200);
        waterPurifier(output, new ItemStack(TANItems.IRON_WATER_CANTEEN), new ItemStack(TANItems.IRON_PURIFIED_WATER_CANTEEN), 200);
        waterPurifier(output, new ItemStack(TANItems.GOLD_WATER_CANTEEN), new ItemStack(TANItems.GOLD_PURIFIED_WATER_CANTEEN), 200);
        waterPurifier(output, new ItemStack(TANItems.DIAMOND_WATER_CANTEEN), new ItemStack(TANItems.DIAMOND_PURIFIED_WATER_CANTEEN), 200);
        waterPurifier(output, new ItemStack(TANItems.NETHERITE_WATER_CANTEEN), new ItemStack(TANItems.NETHERITE_PURIFIED_WATER_CANTEEN), 200);
    }

    public static void waterPurifier(RecipeOutput output, ItemStack input, ItemStack result, int purifyTime)
    {
        WaterPurifierRecipeBuilder.waterPurifier(input, result, purifyTime).save(output, ResourceLocation.fromNamespaceAndPath(ToughAsNails.MOD_ID, getItemName(result.getItem())));
    }

    public void netheriteSmithing(RecipeOutput output, Item input, RecipeCategory category, Item result)
    {
        SmithingTransformRecipeBuilder.smithing(
                Ingredient.of(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE), Ingredient.of(input), Ingredient.of(Items.NETHERITE_INGOT), category, result
            )
            .unlocks("has_netherite_ingot", has(Items.NETHERITE_INGOT))
            .save(output, ResourceLocation.fromNamespaceAndPath(ToughAsNails.MOD_ID, getItemName(result)) + "_smithing");
    }


    public static class Runner extends RecipeProvider.Runner
    {
        public Runner(PackOutput p_365442_, CompletableFuture<HolderLookup.Provider> p_362168_) {
            super(p_365442_, p_362168_);
        }

        @Override
        protected RecipeProvider createRecipeProvider(HolderLookup.Provider provider, RecipeOutput output)
        {
            return new TANRecipeProvider(provider, output);
        }

        @Override
        public String getName() {
            return "TAN Recipes";
        }
    }
}
