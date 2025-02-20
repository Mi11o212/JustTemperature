/*******************************************************************************
 * Copyright 2021, the Glitchfiend Team.
 * All rights reserved.
 ******************************************************************************/
package toughasnails.crafting;

import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.RegistryAccess;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.network.RegistryFriendlyByteBuf;
import net.minecraft.network.codec.StreamCodec;
import net.minecraft.world.Container;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.*;
import net.minecraft.world.level.Level;
import toughasnails.api.crafting.TANRecipeBookCategories;
import toughasnails.api.crafting.TANRecipeSerializers;
import toughasnails.api.crafting.TANRecipeTypes;

import javax.annotation.Nullable;

public class WaterPurifierRecipe implements Recipe<SingleRecipeInput>
{
    protected final ItemStack input;
    protected final ItemStack result;
    protected final int purifyTime;
    @Nullable
    private PlacementInfo placementInfo;

    public WaterPurifierRecipe(ItemStack input, ItemStack result, int purifyTime)
    {
        this.input = input;
        this.result = result;
        this.purifyTime = purifyTime;
    }

    @Override
    public boolean matches(SingleRecipeInput input, Level var2)
    {
        if (this.input == null)
            return false;

        ItemStack containerInput = input.getItem(0);
        return ItemStack.isSameItemSameComponents(this.input, containerInput) && this.input.getDamageValue() == containerInput.getDamageValue();
    }

    @Override
    public ItemStack assemble(SingleRecipeInput var1, HolderLookup.Provider var2)
    {
        return this.result.copy();
    }

    public ItemStack input()
    {
        return this.input;
    }

    protected ItemStack result()
    {
        return this.result;
    }

    @Override
    public PlacementInfo placementInfo()
    {
        if (this.placementInfo == null) {
            this.placementInfo = PlacementInfo.create(Ingredient.of(this.input.getItem()));
        }

        return this.placementInfo;
    }

    @Override
    public RecipeBookCategory recipeBookCategory()
    {
        return TANRecipeBookCategories.WATER_PURIFYING;
    }

    @Override
    public RecipeSerializer<? extends Recipe<SingleRecipeInput>> getSerializer()
    {
        return TANRecipeSerializers.WATER_PURIFYING;
    }

    @Override
    public RecipeType<? extends Recipe<SingleRecipeInput>> getType()
    {
        return TANRecipeTypes.WATER_PURIFYING;
    }

    public int getPurifyTime()
    {
        return this.purifyTime;
    }

    public static class Serializer implements RecipeSerializer<WaterPurifierRecipe>
    {
        private static final MapCodec<WaterPurifierRecipe> CODEC = RecordCodecBuilder.mapCodec((builder) -> {
            return builder.group(ItemStack.CODEC.fieldOf("input").forGetter((p_296920_) -> {
                return p_296920_.input;
            }), ItemStack.CODEC.fieldOf("result").forGetter((p_296923_) -> {
                return p_296923_.result;
            }), Codec.INT.fieldOf("purifytime").orElse(200).forGetter((p_296919_) -> {
                return p_296919_.purifyTime;
            })).apply(builder, WaterPurifierRecipe::new);
        });

        private final StreamCodec<RegistryFriendlyByteBuf, WaterPurifierRecipe> streamCodec = StreamCodec.of(this::toNetwork, this::fromNetwork);

        public WaterPurifierRecipe fromNetwork(RegistryFriendlyByteBuf buffer)
        {
            ItemStack input = ItemStack.STREAM_CODEC.decode(buffer);
            ItemStack result = ItemStack.STREAM_CODEC.decode(buffer);
            int purifyTime = buffer.readInt();
            return new WaterPurifierRecipe(input, result, purifyTime);
        }

        public void toNetwork(RegistryFriendlyByteBuf buffer, WaterPurifierRecipe recipe)
        {
            ItemStack.STREAM_CODEC.encode(buffer, recipe.input);
            ItemStack.STREAM_CODEC.encode(buffer, recipe.result);
            buffer.writeInt(recipe.purifyTime);
        }

        @Override
        public MapCodec<WaterPurifierRecipe> codec()
        {
            return CODEC;
        }

        @Override
        public StreamCodec<RegistryFriendlyByteBuf, WaterPurifierRecipe> streamCodec() {
            return this.streamCodec;
        }
    }
}
