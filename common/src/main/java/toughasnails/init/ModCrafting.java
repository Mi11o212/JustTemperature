/*******************************************************************************
 * Copyright 2021, the Glitchfiend Team.
 * All rights reserved.
 ******************************************************************************/
package toughasnails.init;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.crafting.*;
import toughasnails.api.TANAPI;
import toughasnails.api.crafting.TANRecipeBookCategories;
import toughasnails.api.crafting.TANRecipeSerializers;
import toughasnails.api.crafting.TANRecipeTypes;
import toughasnails.crafting.WaterPurifierRecipe;

import java.util.function.BiConsumer;

public class ModCrafting
{
    public static void registerRecipeSerializers(BiConsumer<ResourceLocation, RecipeSerializer<?>> func) {
        // Placeholder to prevent build errors
    }

    public static void registerRecipeTypes(BiConsumer<ResourceLocation, RecipeType<?>> func) {
        // Placeholder to prevent build errors
    }

    public static void registerRecipeBookCategories(BiConsumer<ResourceLocation, RecipeBookCategory> func) {
        // Placeholder to prevent build errors
    }
}
