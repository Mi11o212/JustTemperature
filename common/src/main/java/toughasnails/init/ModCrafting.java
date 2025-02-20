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
    {
    }

    {
        {
            @Override
            public String toString()
            {
                return "water_purifying";
            }
        });
    }

    {
    }

    {
        func.accept(ResourceLocation.fromNamespaceAndPath(TANAPI.MOD_ID, name), serializer);
        return serializer;
    }

    {
        func.accept(ResourceLocation.fromNamespaceAndPath(TANAPI.MOD_ID, name), type);
        return type;
    }

    {
        func.accept(ResourceLocation.fromNamespaceAndPath(TANAPI.MOD_ID, name), category);
        return category;
    }
}
