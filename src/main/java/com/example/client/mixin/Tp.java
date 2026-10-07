package com.example.client.mixin;

import hitsonly.g;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_1297;
import net.minecraft.class_239;
import net.minecraft.class_746;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Environment(EnvType.CLIENT)
@Mixin({class_746.class})
public class Tp {
   @Inject(
      method = {"method_6007"},
      at = {@At("HEAD")}
   )
   private void mk$a(CallbackInfo ci) {
      g.a.c((class_746)this, 1233273475);
   }

   @Inject(
      method = {"method_6007"},
      at = {@At("RETURN")}
   )
   private void mk$b(CallbackInfo ci) {
      g.a.e((class_746)this, -1875503450);
   }

   @Inject(
      method = {"method_3136"},
      at = {@At("HEAD")}
   )
   private void mk$c(CallbackInfo ci) {
      g.a.b((class_746)this, 943831588);
   }

   @Inject(
      method = {"method_3136"},
      at = {@At("RETURN")}
   )
   private void mk$d(CallbackInfo ci) {
      g.a.a((class_746)this, 1538420121);
   }

   @Inject(
      method = {"method_76762"},
      at = {@At("HEAD")}
   )
   private void mk$e(float f, class_1297 e, CallbackInfoReturnable<class_239> cir) {
      g.a.d((class_746)this, -133771079);
   }

   @Inject(
      method = {"method_76762"},
      at = {@At("RETURN")}
   )
   private void mk$f(float f, class_1297 e, CallbackInfoReturnable<class_239> cir) {
      g.a.f((class_746)this, -967430480);
   }
}