import java.io.*;
import java.util.TreeMap;

public class aeropatin {
   static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

   public static void casoPrueba(int n, int m) throws IOException {
      char[][] table = new char[n][m];
      for (int i = 0; i<n; i++) {
         table[i] = reader.readLine().toCharArray();
      }

      TreeMap<String,String> map = new TreeMap<>();
      String key = "0/0";
      int[] pos = {0,0};

      while (!(pos[0] == n-1 && pos[1] == m-1)) {
         if (!map.containsKey(key)) map.put(key, "");

         //System.out.println(map);

         if (!map.get(key).contains("e")) {
            map.put(key, map.get(key)+"e");
            if (pos[1] == m-1 || table[pos[0]][pos[1]+1] == 'X') continue;
            
            pos[1]++;
            key = String.format("%d/%d", pos[0], pos[1]);
         }

         else if (!map.get(key).contains("s")) {
            map.put(key, map.get(key)+"s");
            if (pos[0] == n-1  || table[pos[0]+1][pos[1]] == 'X') continue;

            pos[0]++;
            key = String.format("%d/%d", pos[0], pos[1]);
         }  
         
         else if (!map.get(key).contains("n")) {
            map.put(key, map.get(key)+"n");
            if (pos[0] == 0 || table[pos[0]-1][pos[1]] == 'X') continue;
            
            pos[0]--;
            key = String.format("%d/%d", pos[0], pos[1]);
         }

         else if (!map.get(key).contains("w")) {
            map.put(key, map.get(key)+"w");
            if (pos[1] == 0 || table[pos[0]][pos[1]-1] == 'X') continue;
            
            pos[1]--;
            key = String.format("%d/%d", pos[0], pos[1]);
         }
         
         else {
            System.out.println("NO");
            return;
         }

      }
      System.out.println("SI");
      
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