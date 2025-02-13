import java.util.*;

public class comptantFinsAlVuit {

   static Scanner in;

   public static void casoDePrueba() {

      int x = in.nextInt();
      int d = in.nextInt();

      int num = 0;
      for (int i = 0; i < x; i++) {
         num = conversor(num, d);
         System.out.println(num);
      }

   }

   public static int conversor(int num, int d) {
      int ultim = num % 10;
      if (ultim == d) {
         num += ultim * 10;
         num -= ultim;
      }
      else
         num++;
      if (num < 10)
         return num;
      return ultim + conversor(num/10, d);
   }

  public static void main(String[] args) {

   in = new java.util.Scanner(System.in);

   int numCasos = in.nextInt();
   for (int i = 0; i < numCasos; i++)
      casoDePrueba();

  }

} 