/*******************************************************************************
 * Copyright 2024, the Glitchfiend Team.
 * All rights reserved.
 ******************************************************************************/
package toughasnails.neoforge.datagen.model;

import net.minecraft.client.color.item.Dye;
import net.minecraft.client.data.models.ItemModelGenerators;
import net.minecraft.client.data.models.ItemModelOutput;
import net.minecraft.client.data.models.model.*;
import net.minecraft.client.renderer.item.ItemModel;
import net.minecraft.client.renderer.item.RangeSelectItemModel;
import net.minecraft.client.renderer.item.SelectItemModel;
import net.minecraft.client.renderer.item.properties.select.TrimMaterialProperty;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.equipment.EquipmentAsset;
import net.minecraft.world.item.equipment.trim.TrimMaterial;
import net.minecraft.world.level.FoliageColor;
import net.neoforged.neoforge.client.model.generators.ModelFile;
import toughasnails.api.item.TANItems;
import toughasnails.client.item.TemperatureProperty;
import toughasnails.init.ModEquipmentAssets;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiConsumer;

public class TANItemModelGenerators extends ItemModelGenerators
{
    private final ItemModelOutput itemModelOutput;
    private final BiConsumer<ResourceLocation, ModelInstance> modelOutput;

    public TANItemModelGenerators(ItemModelOutput itemModelOutput, BiConsumer<ResourceLocation, ModelInstance> modelOutput)
    {
        super(itemModelOutput, modelOutput);
        this.itemModelOutput = itemModelOutput;
        this.modelOutput = modelOutput;
    }

    @Override
    public void run()
    {
        this.generateFlatItem(TANItems.ICE_CREAM, ModelTemplates.FLAT_ITEM);
        this.generateFlatItem(TANItems.CHARC_0S, ModelTemplates.FLAT_ITEM);
        this.generateFlatItem(TANItems.EMPTY_LEATHER_CANTEEN, ModelTemplates.FLAT_ITEM);
        this.generateFlatItem(TANItems.LEATHER_DIRTY_WATER_CANTEEN, ModelTemplates.FLAT_ITEM);
        this.generateFlatItem(TANItems.LEATHER_WATER_CANTEEN, ModelTemplates.FLAT_ITEM);
        this.generateFlatItem(TANItems.LEATHER_PURIFIED_WATER_CANTEEN, ModelTemplates.FLAT_ITEM);
        this.generateFlatItem(TANItems.EMPTY_COPPER_CANTEEN, ModelTemplates.FLAT_ITEM);
        this.generateFlatItem(TANItems.COPPER_DIRTY_WATER_CANTEEN, ModelTemplates.FLAT_ITEM);
        this.generateFlatItem(TANItems.COPPER_WATER_CANTEEN, ModelTemplates.FLAT_ITEM);
        this.generateFlatItem(TANItems.COPPER_PURIFIED_WATER_CANTEEN, ModelTemplates.FLAT_ITEM);
        this.generateFlatItem(TANItems.EMPTY_IRON_CANTEEN, ModelTemplates.FLAT_ITEM);
        this.generateFlatItem(TANItems.IRON_DIRTY_WATER_CANTEEN, ModelTemplates.FLAT_ITEM);
        this.generateFlatItem(TANItems.IRON_WATER_CANTEEN, ModelTemplates.FLAT_ITEM);
        this.generateFlatItem(TANItems.IRON_PURIFIED_WATER_CANTEEN, ModelTemplates.FLAT_ITEM);
        this.generateFlatItem(TANItems.EMPTY_GOLD_CANTEEN, ModelTemplates.FLAT_ITEM);
        this.generateFlatItem(TANItems.GOLD_DIRTY_WATER_CANTEEN, ModelTemplates.FLAT_ITEM);
        this.generateFlatItem(TANItems.GOLD_WATER_CANTEEN, ModelTemplates.FLAT_ITEM);
        this.generateFlatItem(TANItems.GOLD_PURIFIED_WATER_CANTEEN, ModelTemplates.FLAT_ITEM);
        this.generateFlatItem(TANItems.EMPTY_DIAMOND_CANTEEN, ModelTemplates.FLAT_ITEM);
        this.generateFlatItem(TANItems.DIAMOND_DIRTY_WATER_CANTEEN, ModelTemplates.FLAT_ITEM);
        this.generateFlatItem(TANItems.DIAMOND_WATER_CANTEEN, ModelTemplates.FLAT_ITEM);
        this.generateFlatItem(TANItems.DIAMOND_PURIFIED_WATER_CANTEEN, ModelTemplates.FLAT_ITEM);
        this.generateFlatItem(TANItems.EMPTY_NETHERITE_CANTEEN, ModelTemplates.FLAT_ITEM);
        this.generateFlatItem(TANItems.NETHERITE_DIRTY_WATER_CANTEEN, ModelTemplates.FLAT_ITEM);
        this.generateFlatItem(TANItems.NETHERITE_WATER_CANTEEN, ModelTemplates.FLAT_ITEM);
        this.generateFlatItem(TANItems.NETHERITE_PURIFIED_WATER_CANTEEN, ModelTemplates.FLAT_ITEM);
        this.generateFlatItem(TANItems.DIRTY_WATER_BOTTLE, ModelTemplates.FLAT_ITEM);
        this.generateFlatItem(TANItems.PURIFIED_WATER_BOTTLE, ModelTemplates.FLAT_ITEM);
        this.generateFlatItem(TANItems.APPLE_JUICE, ModelTemplates.FLAT_ITEM);
        this.generateFlatItem(TANItems.CACTUS_JUICE, ModelTemplates.FLAT_ITEM);
        this.generateFlatItem(TANItems.CHORUS_FRUIT_JUICE, ModelTemplates.FLAT_ITEM);
        this.generateFlatItem(TANItems.GLOW_BERRY_JUICE, ModelTemplates.FLAT_ITEM);
        this.generateFlatItem(TANItems.MELON_JUICE, ModelTemplates.FLAT_ITEM);
        this.generateFlatItem(TANItems.PUMPKIN_JUICE, ModelTemplates.FLAT_ITEM);
        this.generateFlatItem(TANItems.SWEET_BERRY_JUICE, ModelTemplates.FLAT_ITEM);
        this.generateFlatItem(TANItems.TAN_ICON, ModelTemplates.FLAT_ITEM);

        this.generateTrimmableItemWithDefaultColor(TANItems.LEAF_HELMET, ModEquipmentAssets.LEAF, "helmet", FoliageColor.FOLIAGE_DEFAULT);
        this.generateTrimmableItemWithDefaultColor(TANItems.LEAF_CHESTPLATE, ModEquipmentAssets.LEAF, "chestplate", FoliageColor.FOLIAGE_DEFAULT);
        this.generateTrimmableItemWithDefaultColor(TANItems.LEAF_LEGGINGS, ModEquipmentAssets.LEAF, "leggings", FoliageColor.FOLIAGE_DEFAULT);
        this.generateTrimmableItemWithDefaultColor(TANItems.LEAF_BOOTS, ModEquipmentAssets.LEAF, "boots", FoliageColor.FOLIAGE_DEFAULT);
        this.generateTrimmableItem(TANItems.WOOL_HELMET, ModEquipmentAssets.WOOL, "helmet", true);
        this.generateTrimmableItem(TANItems.WOOL_CHESTPLATE, ModEquipmentAssets.WOOL, "chestplate", true);
        this.generateTrimmableItem(TANItems.WOOL_LEGGINGS, ModEquipmentAssets.WOOL, "leggings", true);
        this.generateTrimmableItem(TANItems.WOOL_BOOTS, ModEquipmentAssets.WOOL, "boots", true);

        this.generateThermometerItem(TANItems.THERMOMETER);
    }

    public void generateTrimmableItemWithDefaultColor(Item item, ResourceKey<EquipmentAsset> key, String name, int defaultColor)
    {
        ResourceLocation modelLocation = ModelLocationUtils.getModelLocation(item);
        ResourceLocation textureLocation = TextureMapping.getItemTexture(item);
        ResourceLocation overlayTextureLocation = TextureMapping.getItemTexture(item, "_overlay");
        List<SelectItemModel.SwitchCase<ResourceKey<TrimMaterial>>> list = new ArrayList<>(TRIM_MATERIAL_MODELS.size());

        for (ItemModelGenerators.TrimMaterialData itemmodelgenerators$trimmaterialdata : TRIM_MATERIAL_MODELS) {
            ResourceLocation resourcelocation3 = modelLocation.withSuffix("_" + itemmodelgenerators$trimmaterialdata.name() + "_trim");
            ResourceLocation resourcelocation4 = ResourceLocation.withDefaultNamespace(
                    "trims/items/" + name + "_trim_" + itemmodelgenerators$trimmaterialdata.textureName(key)
            );
            ItemModel.Unbaked itemmodel$unbaked;
            this.generateLayeredItem(resourcelocation3, textureLocation, overlayTextureLocation, resourcelocation4);
            itemmodel$unbaked = ItemModelUtils.tintedModel(resourcelocation3, new Dye(defaultColor));

            list.add(ItemModelUtils.when(itemmodelgenerators$trimmaterialdata.materialKey(), itemmodel$unbaked));
        }

        ItemModel.Unbaked itemmodel$unbaked1;
        ModelTemplates.TWO_LAYERED_ITEM.create(modelLocation, TextureMapping.layered(textureLocation, overlayTextureLocation), this.modelOutput);
        itemmodel$unbaked1 = ItemModelUtils.tintedModel(modelLocation, new Dye(defaultColor));

        this.itemModelOutput.accept(item, ItemModelUtils.select(new TrimMaterialProperty(), itemmodel$unbaked1, list));
    }

    private static final int NUM_THERMOMETER_MODELS = 21;

    public void generateThermometerItem(Item item)
    {
        List<RangeSelectItemModel.Entry> entries = new ArrayList<>();

        for (int i = 0; i < NUM_THERMOMETER_MODELS; i++)
        {
            entries.add(ItemModelUtils.override(ItemModelUtils.plainModel(this.createFlatItemModel(item, String.format("_%02d", i), ModelTemplates.FLAT_ITEM)), (float)i / (float)(NUM_THERMOMETER_MODELS - 1)));
        }

        this.itemModelOutput
                .accept(
                        item,
                        ItemModelUtils.rangeSelect(new TemperatureProperty(), 1.0F, entries)
                );
    }
}
