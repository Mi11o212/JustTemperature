/*******************************************************************************
 * Copyright 2023, the Glitchfiend Team.
 * All rights reserved.
 ******************************************************************************/

import net.minecraft.client.player.LocalPlayer;
import net.minecraft.world.entity.player.Player;
import toughasnails.init.ModConfig;

{
    public static void onAiStepSetSprinting(LocalPlayer player, boolean sprinting)
    {
        // Don't allow sprinting if the player has insufficient thirst
        if (sprinting && !canSprintWithThirst(player))
            sprinting = false;

        player.setSprinting(sprinting);
    }

    private static boolean canSprintWithThirst(LocalPlayer player)
    {
    }
}
