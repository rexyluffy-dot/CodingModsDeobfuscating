package com.example.client.mixin;

import hitsonly.g;
import hitsonly.patch.Guard;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_2596;
import net.minecraft.class_636;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyArg;

@Environment(EnvType.CLIENT)
@Mixin({class_636.class})
public class Ix {
   @ModifyArg(
      method = {"method_41931"},
      at = @At(
   value = "INVOKE",
   target = "Lnet/minecraft/class_634;method_52787(Lnet/minecraft/class_2596;)V"
)
   )
   private class_2596<?> mk$a(class_2596<?> p) {
      try {
         return this.mk$a$guard$(p);
      } catch (Throwable var4) {
         Object[] var3 = new Object[]{p};
         return (class_2596)Guard.guardPacket(var3, var4);
      }
   }

   // $FF: synthetic method
   private class_2596 mk$a$guard$(class_2596 var1) {
      return g.a.a(var1, 2070422736);
   }
}