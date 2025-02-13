import java.io.*;

public class contrasenyes {

   public static void main(String[] args) throws IOException {
      BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
      int k = Integer.parseInt(reader.readLine());
      for (int t = 0; t < k; t++) {

         String pass = reader.readLine();

         int l = pass.length();
         if (l < 8 || l > 16) {
            System.out.println("INVALID");
            continue;
         }

         boolean trobat = false;

         //MAYUS
         for (int i = 0; i < l; i++) {
            if (Character.isUpperCase(pass.charAt(i))) {
               trobat = true;
               break;
            }
         }
         if (!trobat) {
            System.out.println("INVALID");
            continue;
         }

         //MINUS
         trobat = false;
         for (int i = 0; i < l; i++) {
            if (Character.isLowerCase(pass.charAt(i))) {
               trobat = true;
               break;
            }
         }
         if (!trobat) {
            System.out.println("INVALID");
            continue;
         }

         //NUMERO
         trobat = false;
         for (int i = 0; i < l; i++) {
            if (Character.isDigit(pass.charAt(i))) {
               trobat = true;
               break;
            }
         }
         if (!trobat) {
            System.out.println("INVALID");
            continue;
         }

         //CARACTER
         String chars = "@#$%&";
         trobat = false;
         for (int i = 0; i < l; i++) {
            for (int j = 0; j < chars.length(); j++) {
               if (pass.charAt(i) == chars.charAt(j)) {
                  trobat = true;
                  break;
               }
            }
         }
         if (!trobat) {
            System.out.println("INVALID");
            continue;
         }

         //CARACTERS IGUALS
         trobat = false;
         for (int i = 1; i < l; i++) {
            if (pass.charAt(i) == pass.charAt(i - 1)) {
               System.out.println("INVALID");
               trobat = true;
               break;
            }
         }
         if (trobat) {
            continue;
         }
         
         if (!Character.isLetter(pass.charAt(0))) {
            System.out.println("INVALID");
            continue;
         }

         if (l <= 12) {
            System.out.println("WEAK");
            continue;
         }

         int countNum = 0;
         int countChars = 0;
         for (int i = 0; i < l; i++) {
            if (Character.isDigit(pass.charAt(i))) {
               countNum++;
            }
            for (int j = 0; j < chars.length(); j++) {
               if (pass.charAt(i) == chars.charAt(j)) {
                  countChars++;
                  break;
               }
            }
         }

         if (countNum >= 3 && countChars >= 2) {
            System.out.println("STRONG");
         }

         else if (countNum >= 2) {
            System.out.println("MEDIUM");
         }
         else {
            if (countNum >= 3 && countChars >= 2) {
               System.out.println("WEAK");
            }
         }

      }
   }
}