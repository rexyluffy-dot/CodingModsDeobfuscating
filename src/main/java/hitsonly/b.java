package hitsonly;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class b implements ModInitializer {
   public static final String a;
   public static final Logger a;
   private static final String[] a;
   private static final Object[] a;
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
   private static final String O = "By HitsOnly";

   public void onInitialize() {
      a.info(a(-653024138, -1120914929));
   }

   static {
      short var0 = 22818;
      String var1 = "飻顪頁飰飠颏頵飣风頩颲飼颇项顇颌飳顣飞긬꺄껧긍긜기껮긙醞鄶酕醿醮醂酜醫";
      char[] var2 = "失太太".toCharArray();
      String[] var3 = new String[var2.length];
      byte var7 = -1;

      while(true) {
         int var4 = 0;
         int var5 = 0;
         int var6 = 0;
         if (var7 == 0) {
            a = var3;
            a = new Object[var3.length];
            a = a(-653024137, -53393452);
            a = LoggerFactory.getLogger(a(-653024140, -1016890855));
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

   private static String a(int var0, int var1) {
      int var3 = var0 ^ -653024138;
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
      int var7 = (var6.getClassName().hashCode() ^ var6.getMethodName().hashCode()) >> 16 ^ 31071;
      int var8 = 0;

      do {
         short var9;
         switch (var8 & 31) {
            case 0:
            default:
               var9 = 210;
               break;
            case 1:
               var9 = 110;
               break;
            case 2:
               var9 = 12;
               break;
            case 3:
               var9 = 253;
               break;
            case 4:
               var9 = 238;
               break;
            case 5:
               var9 = 206;
               break;
            case 6:
               var9 = 18;
               break;
            case 7:
               var9 = 227;
               break;
            case 8:
               var9 = 205;
               break;
            case 9:
               var9 = 58;
               break;
            case 10:
               var9 = 186;
               break;
            case 11:
               var9 = 254;
               break;
            case 12:
               var9 = 198;
               break;
            case 13:
               var9 = 111;
               break;
            case 14:
               var9 = 73;
               break;
            case 15:
               var9 = 159;
               break;
            case 16:
               var9 = 254;
               break;
            case 17:
               var9 = 102;
               break;
            case 18:
               var9 = 158;
               break;
            case 19:
               var9 = 201;
               break;
            case 20:
               var9 = 233;
               break;
            case 21:
               var9 = 248;
               break;
            case 22:
               var9 = 158;
               break;
            case 23:
               var9 = 13;
               break;
            case 24:
               var9 = 115;
               break;
            case 25:
               var9 = 214;
               break;
            case 26:
               var9 = 60;
               break;
            case 27:
               var9 = 143;
               break;
            case 28:
               var9 = 169;
               break;
            case 29:
               var9 = 59;
               break;
            case 30:
               var9 = 119;
               break;
            case 31:
               var9 = 250;
         }

         var4[var8] = (char)(var4[var8] ^ var9 ^ var1 >> 16 ^ var7);
         ++var8;
      } while(var8 < var4.length);

      return (new String(var4)).intern();
   }
}