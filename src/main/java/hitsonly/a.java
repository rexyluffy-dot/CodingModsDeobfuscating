package hitsonly;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.loader.api.FabricLoader;

@Environment(EnvType.CLIENT)
public final class a {
   private static final Gson a;
   private static final Path a;
   private static volatile boolean a;
   public static final int a = hitsonly.i.a(a.class, -1990855876);
   private static final String[] a;
   private static final Object[] a;
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

   static {
      int var0 = 1751355918 ^ a;
      String var1 = "쥋쥼쥺줛짇줵줐즩쥨즲즰줂즘짡줴쥤즺짦쥷";
      char[] var2 = "㼫".toCharArray();
      String[] var3 = new String[var2.length];
      byte var7 = -1;

      while(true) {
         int var4 = 0;
         int var5 = 0;
         int var6 = 0;
         if (var7 == 0) {
            a = var3;
            a = new Object[var3.length];
            a = FabricLoader.getInstance().getConfigDir().resolve(a(-181419426, -1522710595));
            a = (new GsonBuilder()).setPrettyPrinting().create();
            return;
         }

         do {
            var6 = var2[var4] ^ var0;
            var3[var4] = var1.substring(var5, var5 + var6);
            var5 += var6;
            ++var4;
         } while(var4 < var2.length);

         var7 = 0;
      }
   }

   public static void a(int var0) {
      try {
         if (Files.exists(a, new LinkOption[0])) {
            d var1 = (d)a.fromJson(Files.readString(a), d.class);
            if (var1 != null) {
               a(var1, var0 ^ -2103318989);
            }
         }
      } catch (Exception var2) {
      }

   }

   private static d a(int var0) {
      d var1 = new d(var0 ^ -1689381885);
      e var2 = hitsonly.e.a;
      var1.a.h = var2.c(var0 ^ 517631614);
      var1.a.d = var2.g;
      var1.a.a = var2.c;
      var1.a.b = var2.f;
      var1.a.g = var2.b;
      var1.a.f = var2.e;
      var1.a.a = var2.a;
      var1.a.c = var2.j;
      var1.a.k = var2.h;
      var1.a.d = var2.k;
      var1.a.b = var2.f;
      var1.a.f = var2.a;
      var1.a.l = var2.b;
      var1.a.i = var2.m;
      var1.a.g = var2.o;
      var1.a.j = var2.p;
      var1.a.e = var2.d;
      return var1;
   }

   public static void b(int var0) {
      if (!a) {
         try {
            Files.createDirectories(a.getParent());
            Files.writeString(a, a.toJson(a(var0 ^ 1816060456)));
         } catch (Exception var2) {
         }

      }
   }

   private a(int var1) {
   }

   private static void a(d d, int var1) {
      a = true;

      try {
         if (d.a != null) {
            e var2 = hitsonly.e.a;
            h var3 = d.a;
            var2.g = var3.d;
            var2.c = var3.a;
            var2.f = var3.b;
            var2.b = var3.g;
            var2.e = var3.f;
            var2.a = Math.max((double)1.0F, Math.min((double)10.0F, var3.c));
            var2.d = Math.max((double)0.0F, Math.min((double)10.0F, var3.e));
            var2.n = var3.a;
            var2.j = var3.c;
            var2.h = var3.k;
            var2.k = var3.d;
            var2.f = var3.b;
            var2.a = var3.f;
            var2.b = var3.l;
            var2.m = var3.i;
            var2.o = var3.g;
            var2.p = var3.j;
            var2.d = var3.e;
            var2.a(var3.h, var1 ^ -390163492);
         }
      } finally {
         a = false;
      }

   }

   private static String a(int var0, int var1) {
      int var3 = var0 ^ -181419426;
      char[] var4 = a[var3].toCharArray();
      StackTraceElement[] var2 = (StackTraceElement[])a[var3];
      StackTraceElement[] var5;
      if (var2 != null) {
         var5 = var2;
      } else {
         var5 = (new Throwable()).getStackTrace();
         a[var3] = var5;
      }

      StackTraceElement var6 = var5[1];
      int var7 = (var6.getClassName().hashCode() ^ var6.getMethodName().hashCode()) >> 16 ^ 18322;
      int var8 = 0;

      do {
         short var9;
         switch (var8 & 31) {
            case 0:
            default:
               var9 = 129;
               break;
            case 1:
               var9 = 167;
               break;
            case 2:
               var9 = 169;
               break;
            case 3:
               var9 = 213;
               break;
            case 4:
               var9 = 21;
               break;
            case 5:
               var9 = 234;
               break;
            case 6:
               var9 = 218;
               break;
            case 7:
               var9 = 114;
               break;
            case 8:
               var9 = 181;
               break;
            case 9:
               var9 = 99;
               break;
            case 10:
               var9 = 96;
               break;
            case 11:
               var9 = 218;
               break;
            case 12:
               var9 = 79;
               break;
            case 13:
               var9 = 56;
               break;
            case 14:
               var9 = 164;
               break;
            case 15:
               var9 = 176;
               break;
            case 16:
               var9 = 119;
               break;
            case 17:
               var9 = 55;
               break;
            case 18:
               var9 = 167;
               break;
            case 19:
               var9 = 158;
               break;
            case 20:
               var9 = 118;
               break;
            case 21:
               var9 = 10;
               break;
            case 22:
               var9 = 253;
               break;
            case 23:
               var9 = 246;
               break;
            case 24:
               var9 = 244;
               break;
            case 25:
               var9 = 134;
               break;
            case 26:
               var9 = 36;
               break;
            case 27:
               var9 = 15;
               break;
            case 28:
               var9 = 73;
               break;
            case 29:
               var9 = 163;
               break;
            case 30:
               var9 = 73;
               break;
            case 31:
               var9 = 122;
         }

         var4[var8] = (char)(var4[var8] ^ var9 ^ var1 >> 16 ^ var7);
         ++var8;
      } while(var8 < var4.length);

      return (new String(var4)).intern();
   }
}