import java.io.*;

public class ejercits {

   public static void main(String[] args) throws IOException {
      BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
      int k = Integer.parseInt(reader.readLine());
      for (int t = 0; t < k; t++) {

         String input1 = reader.readLine();
         String input2 = reader.readLine();

         String[] linia1 = input1.split(",");
         String[] linia2 = input2.split(",");

         int[] continents = new int[5];
         boolean[] participar = new boolean[5];
         participar[0] = false;
         participar[1] = false;
         participar[2] = false;
         participar[3] = false;
         participar[4] = false;

          for (String linia11 : linia1) {
              String[] separats = linia11.split(":");
              if (separats[0].equals("AMERICA")) {
                  continents[0] = Integer.parseInt(separats[1]);
                  participar[0] = true;
              } if (separats[0].equals(" EUROPA")) {
                  continents[1] = Integer.parseInt(separats[1]);
                  participar[1] = true;
              } if (separats[0].equals(" ASIA")) {
                  continents[2] = Integer.parseInt(separats[1]);
                  participar[2] = true;
              } if (separats[0].equals(" OCEANIA")) {
                  continents[3] = Integer.parseInt(separats[1]);
                  participar[3] = true;
              } if (separats[0].equals(" AFRICA")) {
                  continents[4] = Integer.parseInt(separats[1]);
                  participar[4] = true;
              }
          }


          for (String linia21 : linia2) {
              String[] separats = linia21.split(":");
              if (separats[0].equals("AMERICA")) {
                  continents[0] += Integer.parseInt(separats[1]);
              } if (separats[0].equals(" EUROPA")) {
                  continents[1] += Integer.parseInt(separats[1]);
              } if (separats[0].equals(" ASIA")) {
                  continents[2] += Integer.parseInt(separats[1]);
              } if (separats[0].equals(" OCEANIA")) {
                  continents[3] += Integer.parseInt(separats[1]);
              } if (separats[0].equals(" AFRICA")) {
                  continents[4] += Integer.parseInt(separats[1]);
              }
          }


         String[] noms = new String[5];
         noms[0] = "Trump";
         noms[1] = "Putin";
         noms[2] = "Kim Jong-un";
         noms[3] = "Morrison";
         noms[4] = "Musk";

         int winner = 0;
         int max = continents[0];
         for (int i = 1; i < continents.length; i++) {
            if (continents[i] > max) {
               max = continents[i];
               winner = i;
            }
               
         }

         for (int i = 0; i < 5; i++) {
            if (!participar[i]) {
               continents[i] = continents[winner] - 1;
            }
         }

         int loser = 0;
         int min = continents[winner];
         for (int i = 0; i < continents.length; i++) {
            if (continents[i] < min) {
               min = continents[i];
               loser = i;
            }
         }
         /*
          * 
          for (int i = 0; i < continents.length; i++) {
             System.out.println(continents[i]);
          }
          */

         System.out.println("WINNER: " + noms[winner] + " LOSER: " + noms[loser]);
         
      }
   }
}