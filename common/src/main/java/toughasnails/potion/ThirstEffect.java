// /*******************************************************************************
//  * Copyright 2021, the Glitchfiend Team.
//  * All rights reserved.
//  ******************************************************************************/
// package toughasnails.potion;

// import net.minecraft.server.level.ServerLevel;
// import net.minecraft.world.entity.LivingEntity;
// import net.minecraft.world.entity.player.Player;
// import net.minecraft.world.effect.MobEffect;
// import net.minecraft.world.effect.MobEffectCategory;
// import toughasnails.api.thirst.IThirst;
// import toughasnails.api.thirst.ThirstHelper;

// public class ThirstEffect extends MobEffect
// {
//     public ThirstEffect(MobEffectCategory type, int color)
//     {
//         super(type, color);
//     }

//     @Override
//     public boolean applyEffectTick(ServerLevel level, LivingEntity entity, int amplifier)
//     {
//         if (entity instanceof Player)
//         {
//             Player player = (Player)entity;
//             IThirst thirst = ThirstHelper.getThirst(player);
//             thirst.addExhaustion(0.025F * (float)(amplifier + 1));
//         }

//         return true;
//     }

//     @Override
//     public boolean shouldApplyEffectTickThisTick(int duration, int amplifier)
//     {
//         return true;
//     }
// }
