package com.example.client.mixin;

import java.lang.reflect.Field;
import java.util.Map;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Pseudo;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Environment(EnvType.CLIENT)
@Pseudo
@Mixin(
   targets = {"com/terraformersmc/modmenu/ModMenu"},
   remap = false
)
public class Mm {
   @Inject(
      method = {"onInitializeClient"},
      at = {@At("RETURN")},
      remap = false,
      require = 0
   )
   private void mk$a(CallbackInfo ci) {
      try {
         Class<?> mm = Class.forName("com.terraformersmc.modmenu.ModMenu");
         Field f = mm.getField("MODS");
         Object value = f.get((Object)null);
         if (value instanceof Map<?, ?> map) {
            map.remove("automace");
         }
      } catch (Throwable var6) {
      }

   }
}