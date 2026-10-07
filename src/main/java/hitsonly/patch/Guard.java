package hitsonly.patch;

import net.minecraft.class_1269;
import net.minecraft.class_1297;

public final class Guard {
   private static long lastLogMs = 0L;

   private Guard() {
   }

   public static Object guardTickVoid(Object[] var0, Throwable var1) {
      logOnce(var1, "tick");
      return null;
   }

   public static Object guardHitbox(Object[] var0, Throwable var1) {
      logOnce(var1, "hitbox");

      try {
         return var0 != null && var0.length != 0 && var0[0] != null ? ((class_1297)var0[0]).method_5829() : null;
      } catch (Throwable var3) {
         return null;
      }
   }

   public static Object guardPacket(Object[] var0, Throwable var1) {
      logOnce(var1, "packet");
      return var0 != null && var0.length != 0 ? var0[0] : null;
   }

   public static Object guardSpear(Object[] var0, Throwable var1) {
      logOnce(var1, "spear-attack");
      return class_1269.field_5811;
   }

   private static synchronized void logOnce(Throwable var0, String var1) {
      try {
         long var2 = System.currentTimeMillis();
         if (var2 - lastLogMs < 1000L) {
            return;
         }

         lastLogMs = var2;
         System.err.println("[hitsonly-patch] Recovered an error inside the mod (kind=" + var1 + "); the game keeps running. Trace of the recovered bug:");
         if (var0 != null) {
            var0.printStackTrace();
         }
      } catch (Throwable var4) {
      }

   }
}