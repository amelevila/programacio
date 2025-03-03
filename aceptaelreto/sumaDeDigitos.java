import java.util.Scanner;

public class sumaDeDigitos {

   public static void casoPrueba(String input) {

      int result = 0;
      StringBuilder resultS = new StringBuilder();
      boolean primer = true;

      for (char c : input.toCharArray()) {
         if (!primer) {
            resultS.append(" + ");
         }
         primer = false;
         
         result += c - '0';
         resultS.append(c);
      }

      resultS.append(" = ").append(result);

      System.out.println(resultS);

   }

   public static void main(String[] args) {
      Scanner in = new Scanner(System.in);

      String input;
      while (!((input = in.nextLine()).equals("-1")))
         casoPrueba(input);

      in.close();
   }
}