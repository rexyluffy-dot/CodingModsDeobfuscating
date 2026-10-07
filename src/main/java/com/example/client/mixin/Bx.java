package com.example.client.mixin;

import hitsonly.e;
import hitsonly.patch.Guard;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_12155;
import net.minecraft.class_1297;
import net.minecraft.class_238;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Environment(EnvType.CLIENT)
@Mixin({class_12155.class})
public class Bx {
   @Redirect(
      method = {"method_75432"},
      at = @At(
   value = "INVOKE",
   target = "Lnet/minecraft/class_1297;method_5829()Lnet/minecraft/class_238;",
   ordinal = 0
)
   )
   private class_238 mk$a(class_1297 e) {
      try {
         return this.mk$a$guard$(e);
      } catch (Throwable var4) {
         Object[] var3 = new Object[]{e};
         return (class_238)Guard.guardHitbox(var3, var4);
      }
   }

   // $FF: synthetic method
   private class_238 mk$a$guard$(class_1297 var1) {
      return e.a.a(var1, -1756796955);
   }
}