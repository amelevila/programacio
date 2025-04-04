import java.util.*;

public class GirarONoGirar {
   static Scanner in = new Scanner(System.in);

   public static void casoPrueba() {
        
      String pistola = in.nextLine();

      int count0 = 0;
      int count1 = 0;
      for (int i = 0; i<pistola.length()-1; i++) {
         char act = pistola.charAt(i);
         char seg = pistola.charAt(i+1);

         if (act == '0') {
            count0++;
            if (seg == '1') count1++;
         }
      }
      if (pistola.charAt(pistola.length()-1) == '0') {
         count0++;
         if (pistola.charAt(0) == '1') count1++;
      }
      if (count0 == 0 || count1 == 0) {
         System.out.println("Da igual");
         return;
      }
      float prob0 = 100f - (100f / (float) ((float) pistola.length() / (float) count0));
      float prob1 = 100f / (float) ((float) count0 / (float) count1);
      float decimal = 0.0001f;

      //System.out.printf("0: %f // 1: %f\n", prob0, prob1);

      if (Math.abs(prob0 - prob1) < decimal) System.out.println("Da igual");
      else if (prob1>prob0) System.out.println("Girar");
      else if (prob0>prob1) System.out.println("No girar");
   }

   public static void main(String[] args) {
      int t = in.nextInt();
      in.nextLine();
      while (t-- > 0) casoPrueba();
   }
}