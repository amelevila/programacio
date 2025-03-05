import java.io.*;

public class aeropatin {
   static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

   public static void casoPrueba(int n, int m) throws IOException {
      char[][] table = new char[n][m];
      for (int i = 0; i<n; i++) {
         table[i] = reader.readLine().toCharArray();
      }

      boolean[][] pos = new boolean[n][m];
      pos[0][0] = true;
      
      /* 
            if (pos[x][y]) {
               if (y != m-1 && table[i][y+1] != 'X') pos[i][y+1] = true;
               if (y != 0 && table[i][y-1] != 'X') pos[i][y-1] = true;

               if (i != n-1  && table[i+1][y] != 'X') pos[i+1][y] = true;
               if (i != 0 && table[i-1][y] != 'X') pos[i-1][y] = true;
            } 
      */

      String result = (pos[n-1][m-1]) ? "SI":"NO";
      System.out.println(result);
      
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