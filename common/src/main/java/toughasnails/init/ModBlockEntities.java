/*******************************************************************************
 * Copyright 2021, the Glitchfiend Team.
 * All rights reserved.
 ******************************************************************************/
package toughasnails.init;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;
import toughasnails.api.block.TANBlocks;
import toughasnails.api.blockentity.TANBlockEntityTypes;
import toughasnails.block.entity.TemperatureGaugeBlockEntity;
import toughasnails.core.ToughAsNails;

import java.util.Set;
import java.util.function.BiConsumer;

public class ModBlockEntities
{
    public static void registerBlockEntities(BiConsumer<ResourceLocation, BlockEntityType<?>> func)
    {
        TANBlockEntityTypes.TEMPERATURE_GAUGE = register(func, "temperature_gauge", TemperatureGaugeBlockEntity::new, Set.of(TANBlocks.TEMPERATURE_GAUGE));
    }

    private static <T extends BlockEntity> BlockEntityType<?> register(BiConsumer<ResourceLocation, BlockEntityType<?>> func, String name, BlockEntityType.BlockEntitySupplier<T> supplier, Set<Block> blocks)
    {
        var type = new BlockEntityType<>(supplier, blocks);
        func.accept(ResourceLocation.fromNamespaceAndPath(ToughAsNails.MOD_ID, name), type);
        return type;
    }
}
