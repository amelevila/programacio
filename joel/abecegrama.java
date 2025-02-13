import java.io.*;
public class abecegrama {

   public static void main(String[] args) throws IOException {
     BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
     int k = Integer.parseInt(reader.readLine());
   int ch = 'a';
   for (int i = 0; i < k; i++) {

      String text = reader.readLine();

      if (text.charAt(0) == 'ñ')
         continue;

      if ((int) text.charAt(0) != ch) {
         System.out.println("NO");
         return;
      }
      ch = ch + 1;

   }
   if (k == 0) {
         System.out.println("NO");
         return;
      }
      System.out.println("SI");


   }

}
