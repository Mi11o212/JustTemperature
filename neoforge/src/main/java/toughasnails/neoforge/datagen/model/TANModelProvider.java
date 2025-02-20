/*******************************************************************************
 * Copyright 2024, the Glitchfiend Team.
 * All rights reserved.
 ******************************************************************************/
package toughasnails.neoforge.datagen.model;

import glitchcore.data.ModelProviderBase;
import net.minecraft.client.data.models.BlockModelGenerators;
import net.minecraft.client.data.models.ItemModelGenerators;
import net.minecraft.client.data.models.ItemModelOutput;
import net.minecraft.client.data.models.blockstates.BlockStateGenerator;
import net.minecraft.client.data.models.model.ModelInstance;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import toughasnails.core.ToughAsNails;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class TANModelProvider extends ModelProviderBase
{
    public TANModelProvider(PackOutput output)
    {
        super(output, ToughAsNails.MOD_ID);
    }

    @Override
    protected BlockModelGenerators createBlockModelGenerators(Consumer<BlockStateGenerator> consumer, ItemModelOutput itemModelOutput, BiConsumer<ResourceLocation, ModelInstance> biConsumer) {
        return null;
    }

    @Override
    protected ItemModelGenerators createItemModelGenerators(ItemModelOutput itemModelOutput, BiConsumer<ResourceLocation, ModelInstance> modelOutput) {
        return new TANItemModelGenerators(itemModelOutput, modelOutput);
    }
}
