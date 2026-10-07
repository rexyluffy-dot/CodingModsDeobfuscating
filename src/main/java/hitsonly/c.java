package hitsonly;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientLifecycleEvents;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents;

@Environment(EnvType.CLIENT)
public class c implements ClientModInitializer {
   private static final int[] a;
   private static final String a = "By HitsOnly";
   private static final String b = "By HitsOnly";
   private static final String c = "By HitsOnly";
   private static final String d = "By HitsOnly";
   private static final String e = "By HitsOnly";
   private static final String f = "By HitsOnly";
   private static final String g = "By HitsOnly";
   private static final String h = "By HitsOnly";
   private static final String i = "By HitsOnly";
   private static final String j = "By HitsOnly";
   private static final String k = "By HitsOnly";
   private static final String l = "By HitsOnly";
   private static final String m = "By HitsOnly";
   private static final String n = "By HitsOnly";
   private static final String o = "By HitsOnly";
   private static final String p = "By HitsOnly";
   private static final String q = "By HitsOnly";
   private static final String r = "By HitsOnly";
   private static final String s = "By HitsOnly";
   private static final String t = "By HitsOnly";
   private static final String u = "By HitsOnly";
   private static final String v = "By HitsOnly";
   private static final String w = "By HitsOnly";
   private static final String x = "By HitsOnly";
   private static final String y = "By HitsOnly";
   private static final String z = "By HitsOnly";
   private static final String A = "By HitsOnly";
   private static final String B = "By HitsOnly";
   private static final String C = "By HitsOnly";
   private static final String D = "By HitsOnly";
   private static final String E = "By HitsOnly";
   private static final String F = "By HitsOnly";
   private static final String G = "By HitsOnly";
   private static final String H = "By HitsOnly";
   private static final String I = "By HitsOnly";
   private static final String J = "By HitsOnly";
   private static final String K = "By HitsOnly";
   private static final String L = "By HitsOnly";
   private static final String M = "By HitsOnly";
   private static final String N = "By HitsOnly";

   public void onInitializeClient() {
      hitsonly.a.a(a(1316758727, -1939414417));
      hitsonly.a.b(a(1316758726, -117035273));
      ClientLifecycleEvents.CLIENT_STOPPING.register((ClientLifecycleEvents.ClientStopping)(client) -> hitsonly.a.b(a(1316758724, 2119544957)));
      hitsonly.f.a(a(1316758721, -175722099));
      ClientTickEvents.START_CLIENT_TICK.register((ClientTickEvents.StartTick)(client) -> hitsonly.e.a.h(a(1316758725, -1096874283)));
   }

   private static int a(int var0, int var1) {
      return a[var0 ^ 1316758725] ^ var1 ^ var0;
   }

   static {
      int var2 = 1051349758;
      byte[] var0 = "vï¢U»'¼ÒÇ3hC_".getBytes("ISO-8859-1");
      int var1 = var0.length / 4;
      a = new int[var1];
      int var3 = 0;
      int var4 = 0;

      do {
         int var5 = (var0[var3] & 255) << 24 | (var0[var3 + 1] & 255) << 16 | (var0[var3 + 2] & 255) << 8 | var0[var3 + 3] & 255;
         var5 ^= var2;
         a[var4] = var5;
         var3 += 4;
         ++var4;
      } while(var4 < var1);

   }
}