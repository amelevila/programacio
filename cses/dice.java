import java.util.*;

public class dice {
   static int[] dices = new int[200];

   public static void first6() {
      dices[0] = 0;
      dices[1] = 1;
      dices[2] = 2;
      dices[3] = 4;
      dices[4] = 8;
      dices[5] = 16;
      dices[6] = 32;
   }

   public static int combine(int n) {
      if (dices[n]!=0 || n==0) {
         return dices[n];
      }
      if (n>6 && dices[n]==0) {
         dices[n] = ((dices[n-1]*dices[1]) + (dices[n-2]*dices[2])
         + (dices[n-3]*dices[3]) + (dices[n-4]*dices[4])
         + (dices[n-5]*dices[5]) + (dices[n-6]*dices[6]));
      }
      
      return combine(dices[n]);
   }
   
   @SuppressWarnings("ConvertToTryWithResources")
   public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      first6();
      System.out.println(combine(n));

      in.close();
   }
}