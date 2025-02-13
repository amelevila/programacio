import java.io.*;

public class casoDePrueba {

   public static void casoPrueba() {
      System.out.println("hola");
   } 
   
   public static void main(String[] args) throws IOException {
        
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

         int t = Integer.parseInt(reader.readLine());
         for (int i = 0; i < t; i++) {
            casoPrueba();
         }
    }
    
}