import java.util.*;

public class EncantamientoBajoElMar {
   static Scanner in = new Scanner(System.in);

   public static void casoPrueba(int n, int d) {
      /*
      
      int[] guir = new int[n];
      for (int i = 0; i<n; i++) {
         guir[i] = in.nextInt();
      }
      Arrays.sort(guir);
      
      int count = 0;
      for (int i = 0; i<n/2; i++) {
         if (guir[i]+guir[n-1-i] == d) count++;
      }
      System.out.println(count);
      */

      Deque cua = new ArrayDeque<>();
      

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