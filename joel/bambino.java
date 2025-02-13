
import java.io.*;
public class bambino {
   
   public static void main(String[] args) throws IOException {
      BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
     

      int k = Integer.parseInt(reader.readLine()); 
      for (int n = 0; n < k; n++) {
         long num = Long.parseLong(reader.readLine()); 
         int level = Integer.parseInt(reader.readLine()); 
         long suma = 0;

         for (int i = 0; i < level; i++) {
            suma += num;
            num *= 2;
         }
      
      System.out.println(suma);
      }
   }

   public static void casoDePrueva() {
      
      
   }
}


