import java.util.*;
public class collatz {
   static Scanner in;
   
   public static void main(String[] args) {
      in = new java.util.Scanner(System.in);

      int k = in.nextInt();
      for (int i = 0; i < k; i++) {
         casoDePrueva();
      }
   }

   public static void casoDePrueva() {
      int num = in.nextInt();

      if (num == 1) {
         System.out.println(num);
         return;
      }
      while (num != 1) {
         System.out.print(num);
         if (num % 2 == 0) {
            num /= 2;
         } else {
            num = num * 3 + 1;
         }
         if (num != 1)
            System.out.print("-");

      }
      System.out.println("-" + num);
   }
}
