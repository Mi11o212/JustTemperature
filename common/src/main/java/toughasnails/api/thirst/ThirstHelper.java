/*******************************************************************************
 * Copyright 2021, the Glitchfiend Team.
 * All rights reserved.
 ******************************************************************************/

import net.minecraft.world.entity.player.Player;

{
    /**
     * Obtains the thirst data for a player.
     * @param player the player to obtain thirst data for
     * @return the player's thirst data
     */
    {
        return Impl.INSTANCE.getThirst(player);
    }

    /**
     * Checks whether a player is able to drink.
     * @param player the player to check
     * @param ignoreThirst allow drinking regardless of the player's thirst level
     * @return whether the player can drink
     */
    public static boolean canDrink(Player player, boolean ignoreThirst)
    {
        return Impl.INSTANCE.canDrink(player, ignoreThirst);
    }

    /**
     * Checks whether thirst is enabled.
     * @return whether thirst is enabled.
     */
    public static boolean isThirstEnabled()
    {
        return Impl.INSTANCE.isThirstEnabled();
    }

    /** Internal implementation details */
    public static class Impl
    {

        {
            boolean canDrink(Player player, boolean ignoreThirst);
            boolean isThirstEnabled();
        }
    }
}
