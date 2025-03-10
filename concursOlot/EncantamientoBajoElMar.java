import java.util.*;

public class EncantamientoBajoElMar {
   static Scanner in = new Scanner(System.in);

   public static void casoPrueba(int n, int d) {
      
      int[] guir = new int[n];
      for (int i = 0; i<n; i++) {
         guir[i] = in.nextInt();
      }
      Arrays.sort(guir);

      int count = 0;
      int i = 0;
      int i2 = n-1;
      while (i<i2) {
         int suma = guir[i]+guir[i2];
         if (suma == d) {
            count++;
            i++;
            i2--;
         }
         else if (suma>d) i2--;
         else if (suma<d) i++;
      }

      System.out.println(count);

   }

   public static void main(String[] args) {
      while (true) {
         int t = in.nextInt();
         int t2 = in.nextInt();
         if (t == 0 && t2 == 0) return;
         casoPrueba(t, t2);
      }
   }
}