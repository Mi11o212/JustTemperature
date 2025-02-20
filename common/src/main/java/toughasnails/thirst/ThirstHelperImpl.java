/*******************************************************************************
 * Copyright 2021, the Glitchfiend Team.
 * All rights reserved.
 ******************************************************************************/

import net.minecraft.world.entity.player.Player;
import toughasnails.api.player.ITANPlayer;
import toughasnails.init.ModConfig;

{

    @Override
    {
        lastThirst = thirst;
        return thirst;
    }

    @Override
    public boolean canDrink(Player player, boolean ignoreThirst)
    {
        return (player.getAbilities().invulnerable || ignoreThirst || thirst.isThirsty()) && isThirstEnabled();
    }

    @Override
    public boolean isThirstEnabled()
    {
    }
}

