import java.util.Scanner;

public class felicidades {
   static Scanner in = new Scanner(System.in); 

   public static void casoPrueba(int t) {

      int num = in.nextInt();
      int ultim = num;
      int result = 0;
      while (num != 0) {
         num = in.nextInt();
         if (num > (ultim+t) || num == 0) {
            result++;
            ultim = num;
         }
      }
      System.out.println(result);

   } 
    
   public static void main(String[] args) {
      while (in.hasNextInt()) {
         int t = in.nextInt();
         casoPrueba((t));
      }
   }
    
}