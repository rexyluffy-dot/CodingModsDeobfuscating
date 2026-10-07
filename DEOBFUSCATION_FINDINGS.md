# AutoMace 1.21.11 — Bytecode Reconstruction Findings

The supplied original JAR is the executable source of truth. The damaged decompiled ZIP is used only as a source hint.

## Recovered command/config strings

Decoded directly from the encrypted string table in hitsonly/f.class:

- automace
- on
- off
- settings
- minfalldistance / Min Fall Distance
- attackdelay / Attack Delay
- density / Density
- swordmacechance / Sword Damage than Mace
- stunslamlead / Stun Slam Lead
- targetplayers / Target Players
- targetmobs / Target Mobs
- stunslam / Stun Slam
- autoswitch / Auto Switch Mace
- predictswitch / Predict Switch
- unequipelytra / Unequip Elytra
- stayonmace / Stay On Mace
- silentaim / Silent Aim
- movementfix / Movement Fix
- breach / Breach
- hitbox / Hitbox
- silentaimrange / Silent Aim Range
- hitboxexpand / Hitbox Expand
- AutoMace §aenabled / AutoMace §cdisabled

## Reconstruction blockers

The decompiled ZIP collapses distinct JVM fields into duplicate Java identifiers. This is especially visible in hitsonly.e and hitsonly.h.

The original JAR contains the missing hitsonly.f and hitsonly.g class bodies.

No dummy implementation is being substituted for those classes.

## Rule

All recovered behavior must trace back to the supplied bytecode or version-correct mappings.
