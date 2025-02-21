/*******************************************************************************
 * Copyright 2022, the Glitchfiend Team.
 * All rights reserved.
 ******************************************************************************/
package toughasnails.client.handler;

import glitchcore.event.client.ItemTooltipEvent;
import glitchcore.event.client.RenderTooltipEvent;
import glitchcore.util.Environment;
import net.minecraft.ChatFormatting;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.Font;
import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.client.gui.screens.inventory.tooltip.ClientTooltipComponent;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.core.Holder;
import net.minecraft.core.RegistryAccess;
import net.minecraft.network.chat.Component;
import net.minecraft.util.Mth;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.equipment.trim.TrimMaterial;
import net.minecraft.world.item.equipment.trim.TrimMaterials;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import toughasnails.init.ModConfig;
import toughasnails.init.ModTags;
//import toughasnails.thirst.ThirstOverlayRenderer;

import java.util.Optional;

public class TooltipHandler
{
    public static void onTooltip(ItemTooltipEvent event)
    {
        // // Don't display heating or cooling tooltips if temperature is disabled
        // if (!ModConfig.temperature.enableTemperature)
        //     return;

        if (!Environment.isClient())
            throw new IllegalStateException("ItemTooltipEvent unexpectedly called on the server");

        // In some rare cases (on Forge at least) this may be called with a null connection
        if (Minecraft.getInstance().getConnection() == null)
            return;

        ItemStack stack = event.getStack();
        Block block = Block.byItem(stack.getItem());
        BlockState state = block.defaultBlockState();

        // Heating/Cooling Blocks and Armor
        if (state.is(ModTags.Blocks.HEATING_BLOCKS) || stack.is(ModTags.Items.HEATING_ARMOR))
        {
            event.getTooltip().add(Component.literal("\uD83D\uDD25 ").append(Component.translatable("desc.toughasnails.heating")).withStyle(ChatFormatting.GOLD));
        }
        if (state.is(ModTags.Blocks.COOLING_BLOCKS) || stack.is(ModTags.Items.COOLING_ARMOR))
        {
            event.getTooltip().add(Component.literal("\u2744 ").append(Component.translatable("desc.toughasnails.cooling")).withStyle(ChatFormatting.AQUA));
        }

        // Heating/Cooling Held Items
        if (stack.is(ModTags.Items.HEATING_HELD_ITEMS))
        {
            event.getTooltip().add(Component.literal("\uD83D\uDD25 ").append(Component.translatable("desc.toughasnails.heating_held")).withStyle(ChatFormatting.GOLD));
        }
        if (stack.is(ModTags.Items.COOLING_HELD_ITEMS))
        {
            event.getTooltip().add(Component.literal("\u2744 ").append(Component.translatable("desc.toughasnails.cooling_held")).withStyle(ChatFormatting.AQUA));
        }

        // Heating/Cooling Consumables
        if (stack.is(ModTags.Items.HEATING_CONSUMED_ITEMS))
        {
            event.getTooltip().add(Component.literal("\uD83D\uDD25 ").append(Component.translatable("desc.toughasnails.heating_consumed")).withStyle(ChatFormatting.GOLD));
        }
        if (stack.is(ModTags.Items.COOLING_CONSUMED_ITEMS))
        {
            event.getTooltip().add(Component.literal("\u2744 ").append(Component.translatable("desc.toughasnails.cooling_consumed")).withStyle(ChatFormatting.AQUA));
        }
    }
}
