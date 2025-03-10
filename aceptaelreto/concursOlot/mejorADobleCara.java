import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class mejorADobleCara {

   static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

   public static void casoPrueba(int input) throws IOException{
   
      int result = 0;
      String line = in.readLine();
      for (String num : line.split(" ")) {
         int n = Integer.parseInt(num);
         result += n/2;

      }

      System.out.println(result);

   }

   public static void main(String[] args) throws IOException{

      int input;
      while (!((input = Integer.parseInt(in.readLine())) == 0))
         casoPrueba(input);

   }
}