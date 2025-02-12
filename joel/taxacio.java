import java.io.*;

public class taxacio {

   public static void main(String[] args) throws IOException {

      BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//S 2 N N N 0 N N
      String linia1 = reader.readLine();
      String[] valorsString2 = linia1.split(" ");
      float[] valors = new float[7];
      for (int i = 0; i < 7; i++) {
         valors[i] = Float.parseFloat(valorsString2[i]);
      }
      
      while (true) {
         float result = 0;
         String linia2 = reader.readLine();
         if (linia2 == null || linia2.equals(""))
            break;
         String[] valorsString = linia2.split(" ");

         if (valorsString[0].equals("N")) {
            result += valors[0];
         } else {
            result += valors[1];
            if (valorsString[2].equals("S") && valorsString[3].equals("S")) {
               result += valors[3] * 3;
            } else if (valorsString[2].equals("S") || valorsString[3].equals("S")) {
               result += valors[3];
            }
         }
         if (valorsString[4].equals("S") && Integer.parseInt(valorsString[5]) >= 1) {
            if (Integer.parseInt(valorsString[5]) > 2) {
               result += valors[4];
            } else {
               result += valors[4] / 2;
            }
         }
         result += Integer.parseInt(valorsString[1]) * valors[2];
         if (valorsString[6].equals("S")) {
            result -= (result * valors[5] / 100.0);
         }
         if (valorsString[7].equals("S")) {
            result += (result * valors[6] / 100.0);
         }
         
         System.out.println(result);
      }
      
   }
}