import java.io.*;
import java.util.HashMap;

public class aeropatin {
   static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

   public static void casoPrueba(int n, int m) throws IOException {
      char[][] table = new char[n][m];
      for (int i = 0; i<n; i++) {
         table[i] = reader.readLine().toCharArray();
      }
      
      HashMap<Character,Character> map = new HashMap<>();

   } 
   
   public static void main(String[] args) throws IOException {
      String input;
      while (!(input = reader.readLine()).equals("0 0")) {
         String[] camps = input.split(" ");
         int n = Integer.parseInt(camps[0]);
         int m = Integer.parseInt(camps[1]);
         casoPrueba(n, m);
      }
   }
    
}